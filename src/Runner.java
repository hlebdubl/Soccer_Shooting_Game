import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        FieldOverview start = new FieldOverview();

        System.out.println("Welcome to 1v1_Soccer Game! \nHere is the field you'll be playing on!");

        for(int x=0; x<7; x++){
            for(int y=0; y<7; y++)
                if((x == 0 && y == 3) || (x == 6 && y == 3))
                    System.out.print(" \uD83E\uDD45 "); //print player location
                else if(x == 0 || y == 0 || y == 6 || x == 6)
                    System.out.print(" ⬛ ");
                else if(x ==5 && y ==3)
                {
                    System.out.print(" ⚽ ");
                }
                else
                    System.out.print(" \uD83D\uDFE9 ");
            System.out.println("");
        }

        System.out.print("Any input + enter to continue: ");
        String yn = s.nextLine();

        System.out.println("                   INTRODUCTION                          ");
        System.out.println("---------------------------------------------------------");
        System.out.println("|You have to shoot the ball into the opposing side goal!|");
        System.out.println("|   You have two choices: take a shot or move forward   |");
        System.out.println("|     With every step, the shot chance increases        |");
        System.out.println("|However, with every step there is a chance for an event|");
        System.out.println("|_______________________________________________________|");



    }
}
