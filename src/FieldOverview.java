import java.util.Objects;

import static java.lang.Math.abs;

/**
 * The FieldOverview class represents most actions related to the field, it has the initial field String input into it
 */
public class FieldOverview {

    String[][] field =
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
     * method of the FieldOverview class, prints out the field given to it as String
     * @param fields the array you wish to get printed out as a String
     * @return the 2D array (fields) transformed into a String
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
     * distanceToGoal is a method of the FieldOverview class, it calculates how far the
     * player is from the goal
     * @param fields the array of the field
     * @return the distance you are from the goal via the Manhattan method * 10
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
     * calculateRow calculates the player's row on the field
     * @param fields the 2D array of the field
     * @return the numbered row the player is on
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
     * calculateColumns is a method of the FieldOverview class that calculates the
     * player's column location
     * @param fields the 2D array of the field
     * @return the numbered column
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