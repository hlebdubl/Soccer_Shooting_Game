import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        FieldOverview start = new FieldOverview();

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



    }
}
