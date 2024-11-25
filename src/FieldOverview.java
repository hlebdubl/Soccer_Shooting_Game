import java.util.Objects;

import static java.lang.Math.abs;

/**
 * The FieldOverview class represents most actions related to the field, it has the initial field String input into it
 */
public class FieldOverview {

    private String[][] field =
            {{" ⬛ ", " ⬛ ", " ⬛ ", " \uD83E\uDD45 ", " ⬛ ", " ⬛ ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " ⚽ ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " ⬛ ", " ⬛ ", " \uD83E\uDD45 ", " ⬛ ", " ⬛ ", "⬛"}};

    /**
     * FieldOverview constructor, creates a new instance of a FieldOverview class
     * No parameters
     */
    public FieldOverview() {
    }

    /**
     * printField is a method of the FieldOverview class that prints out a 2D array
     * as a field in a desired way
     * @param fields a 2D array that would get printed out
     * @return a String of the field in a desired format
     */
    public String printField(String[][] fields)
    {
        String printedField = "";
        for(int i = 0; i < fields.length; i++)
        {
            printedField += "\n";
            for(int j = 0; j < fields.length; j++)
            {
                printedField += fields[i][j];
            }
        }
        return printedField;
    }
    /**
     * updateField method for the FieldOverview class. This will update the image of the field depending on the
     * actions of the user and print out a new image where the player will be in a different location
     * @param fields is a String that represents the new field that should be printed after the user action
     * @return a String of the field as an image to the user screen
     */
    public String updateField(String[][] fields)
    {
        String printedField = "";
        for(int i = 0; i < field.length; i++)
        {
            printedField += "\n";
            for(int j = 0; j < field.length; j++)
            {
                printedField += field[i][j];
            }
        }
        return printedField;
    }

    /**
     * Initialization of the int variables of rows, columns, and distance for future use in the methods
     */
    int rows = 0;
    int columns = 0;
    int distance;
    /**
     * distanceToGoal method of the FieldOverview class, it takes in the position of the player
     * and calculates how far the player would be from the goal
     * @return an int value of how far in blocks the player is multiplied by 10
     */

    public int distanceToGoal(String[][] fields)
    {
        for (int i = 0; i < fields.length; i++)
        {
            for (int j = 0; j < fields[i].length; j++)
            {
                if (Objects.equals(fields[i][j], " ⚽ "))
                {
                    rows = i;
                    columns = j;
                }
            }
        }
        distance = abs(rows) + abs(columns -3);
        return distance * 10;
    }

    /**
     * calculateRow is a method of the FieldOverview class that would see on which
     * row the player is currently located
     * @param fields the 2D array of the game field where the player is located
     * @return the numbered row where the player is
     */
    public int calculateRow(String[][] fields)
    {
        for (int i = 0; i < fields.length; i++)
        {
            for (int j = 0; j < fields[i].length; j++)
            {
                if (Objects.equals(fields[i][j], " ⚽ "))
                {
                    rows = i;
                    columns = j;
                }
            }
        }
        return rows;
    }
    /**
     * calculateColumns is a method of the FieldOverview class that would see on which
     * column the player is currently located
     * @param fields the 2D array of the game field where the player is located
     * @return the numbered column where the player is
     */
    public int calculateColumns(String[][] fields)
    {
        for (int i = 0; i < fields.length; i++)
        {
            for (int j = 0; j < fields[i].length; j++)
            {
                if (Objects.equals(fields[i][j], " ⚽ "))
                {
                    rows = i;
                    columns = j;
                }
            }
        }
        return columns;
    }
    /**
     * move is a method of the FieldOverview class, it would determine in which direction the player is moving
     * to update the field
     * @param direction an input from the user which associates a direction with a number
     * @return an updated version of the field string with the movement accounted for
     */
    public String[][] move(int direction)
    {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (Objects.equals(field[i][j], " ⚽ ")) {
                    rows = i;
                    columns = j;
                    if(direction == 1)
                    {
                        field[rows][columns+1] = " ⚽ ";
                        field[rows][columns] = " 🟩 ";
                        return field;
                    }
                    else if(direction == 2)
                    {
                        field[rows][columns-1]  = " ⚽ ";
                        field[rows][columns] = " 🟩 ";
                    }
                    else if(direction == 3)
                    {
                        field[rows-1][columns]  = " ⚽ ";
                        field[rows][columns] = " 🟩 ";
                    }
                    else if(direction == 4)
                    {
                        field[rows+1][columns]  = " ⚽ ";
                        field[rows][columns] = " 🟩 ";
                        return field;
                    }
                    else if(direction == 5)
                    {
                        return field;
                    }
                }
            }
        }
        return field;
    }
}