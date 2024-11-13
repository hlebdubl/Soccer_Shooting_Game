import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean goalScored = false;
        FieldOverview start = new FieldOverview();
        Actions action = new Actions();

        System.out.println("Welcome to 1v1_Soccer Game! \nHere is the field you'll be playing on!");

        System.out.println(start.printField());

        System.out.print("Any input + enter to continue: ");
        String yn = s.nextLine();


        System.out.println("                   INTRODUCTION                          ");
        System.out.println("---------------------------------------------------------");
        System.out.println("|You have to shoot the ball into the opposing side goal!|");
        System.out.println("|       You have 3 choices: shoot/dribble/move          |");
        System.out.println("|     With every step, the shot chance increases        |");
        System.out.println("|     However, there could also be random events        |");
        System.out.println("|_______________________________________________________|");


        System.out.println("Select your first action! \n1.Run\n2.Dribble\n3.Shoot");
        String choice = s.nextLine();

        int actionChoice = Integer.parseInt(choice);

        while(!goalScored)
        {
            if(actionChoice == 1)
            {
                System.out.println(action.canGoWhere());
                System.out.println("Your choice: ");
                String direction = s.nextLine();
                int directions = Integer.parseInt(direction);
                System.out.println(action.actions(1));






                //update the program in that direction


            }
            //else if(actionChoice == 2);
            {
                //System.out.println("hi");
            }
            //else
            {

            }

            System.out.println("Select your first action! \n1.Run\n2.Dribble\n3.Shoot");
            choice = s.nextLine();

            actionChoice = Integer.parseInt(choice);










        }



    }
}
