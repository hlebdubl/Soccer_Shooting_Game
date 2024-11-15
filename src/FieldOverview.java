import java.util.Objects;

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
    public FieldOverview()
    {

    }

    /**
     * printField method for the FieldOverview clas. This will print out the field into the panel through
     * turning it into a string.
     * @return a String of the field and how it will look like, just the initial field
     */
    public String printField()
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

   /* public String[][] updatedField()
    {




        return field;
    }*/
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
    public int distanceToGoal()
    {
        for (int i = 0; i < field.length; i++)
        {
            for (int j = 0; j < field[i].length; j++)
            {
                if (Objects.equals(field[i][j], " ⚽ "))
                {
                    rows = i;
                    columns = j;
                }
            }
        }
        distance = (int)(Math.sqrt(Math.pow((rows),2) - (Math.pow(columns,2))));
        return distance * 10;
    }



    public int calculateRow(String[][][] fields)
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
     * calculateRow method for FieldOverview class, has a nested loop to determine what row the player is on
     * @return an int of the row the player is on
     */

    public int calculateRow()
    {
        for (int i = 0; i < field.length; i++)
        {
            for (int j = 0; j < field[i].length; j++)
            {
                if (Objects.equals(field[i][j], " ⚽ "))
                {
                    rows = i;
                    columns = j;
                }
            }
        }
        return rows;
    }
    /**
     * calculateColumns method for FieldOverview class, has a nested loop to determine what column the player is on
     * @return an int of the column the player is on
     */
    public int calculateColumns()
    {
        for (int i = 0; i < field.length; i++)
        {
            for (int j = 0; j < field[i].length; j++)
            {
                if (Objects.equals(field[i][j], " ⚽ "))
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
                        field[i][j+1]  = " ⚽ ";
                        field[i][j] = " 🟩 ";
                    }
                    else if(direction == 2)
                    {
                        field[i][j-1]  = " ⚽ ";
                        field[i][j] = " 🟩 ";
                    }
                    else if(direction == 3)
                    {
                        field[i-1][j]  = " ⚽ ";
                        field[i][j] = " 🟩 ";
                    }
                    else if(direction == 4)
                    {
                        field[i+1][j]  = " ⚽ ";
                        field[i][j] = " 🟩 ";
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
