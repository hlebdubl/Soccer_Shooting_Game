import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        String[][] fields =
                {{" ⬛ ", " ⬛ ", " ⬛ ", " \uD83E\uDD45 ", " ⬛ ", " ⬛ ", "⬛"},
                        {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                        {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                        {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                        {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                        {" ⬛ ", " 🟩 ", " 🟩 ", " ⚽ ", " 🟩 ", " 🟩 ", "⬛"},
                        {" ⬛ ", " ⬛ ", " ⬛ ", " \uD83E\uDD45 ", " ⬛ ", " ⬛ ", "⬛"}};


        Scanner s = new Scanner(System.in);
        boolean goalScored = false;
        FieldOverview start = new FieldOverview();
        Actions action = new Actions();

        System.out.println("Welcome to Soccer Shooting Game! \nHere is the field you'll be playing on!");

        System.out.println(start.printField(fields));

        System.out.print("Any input + enter to continue: ");
        String yn = s.nextLine();


        System.out.println("                   INTRODUCTION                          ");
        System.out.println("---------------------------------------------------------");
        System.out.println("|You have to shoot the ball into the opposing side goal!|");
        System.out.println("|       You have 3 choices: shoot/dribble/move          |");
        System.out.println("|  The closer to the goal, the higher the shot chance   |");
        System.out.println("|   There is always a chance the ball will get stolen   |");
        System.out.println("|_______________________________________________________|");

        System.out.println("Select your first action! \n1.Run\n2.Dribble\n3.Shoot");
        String choice = s.nextLine();
        int dist = start.distanceToGoal(fields);
        int actionChoice = Integer.parseInt(choice);

        while(!goalScored)
        {
            if(actionChoice == 1)
            {
                System.out.println(action.canGoWhere(fields));
                System.out.println("Your choice: ");
                String direction = s.nextLine();
                int directions = Integer.parseInt(direction);
                String x = (action.actions(1, dist));
                if(x.equals("You've slipped and caused the opposing team to score!\nGame Over!"))
                {
                    goalScored = true;
                    System.out.println("The enemy team took the ball away and you've lost!\nGame over!");
                }
                else
                {
                    fields = ((start.move(directions)));
                    System.out.println(start.printField(fields));
                    int colum  = start.calculateColumns(fields);
                    int row = start.calculateRow(fields);
                    dist = start.distanceToGoal(fields);
                    action.canGoWhere(fields);
                    System.out.println("1.Run\n2.Dribble\n3.Shoot");
                    choice = s.nextLine();
                    actionChoice = Integer.parseInt(choice);
                }
            }
            else if(actionChoice == 2)
            {
                System.out.println(action.canGoWhere(fields));
                System.out.println("Your choice: ");
                String direction = s.nextLine();
                int directions = Integer.parseInt(direction);
                String x = (action.actions(2, dist));
                if(x.equals("You've slipped and caused the opposing team to score!\nGame Over!"))
                {
                    goalScored = true;
                    System.out.println("The enemy team took the ball away and you've lost!\nGame over!");
                }
                else
                {
                    fields = ((start.move(directions)));
                    System.out.println(start.printField(fields));
                    int colum  = start.calculateColumns(fields);
                    int row = start.calculateRow(fields);
                    dist = start.distanceToGoal(fields);


                    action.canGoWhere(fields);
                    System.out.println("1.Run\n2.Dribble\n3.Shoot");
                    choice = s.nextLine();
                    actionChoice = Integer.parseInt(choice);
                }
            }
            else
            {
                System.out.println("You've chosen to shoot!");

                String x = (action.actions(3, dist));
                if (x.contains("\uD83C\uDF89You've scored, great job!\uD83C\uDF89"))
                {
                    System.out.println(x);
                    goalScored = true;
                }
                else
                {
                    System.out.print(x);
                    System.out.println((start.updateField((start.move(5)))));
                    System.out.println("1.Run\n2.Dribble\n3.Shoot");
                    choice = s.nextLine();
                    actionChoice = Integer.parseInt(choice);
                }
            }
        }
    }
}
