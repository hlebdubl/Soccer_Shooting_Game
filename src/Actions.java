/**
 * The Actions class, represents the actions a player can take
 */

public class Actions {

    FieldOverview action = new FieldOverview();

    /**
     * actions is a method of the Actions class, it has a randomized number, extent based on which the event
     * is determined for the player based on the action they have chosen
     * it also has a shoot option which would be determined on their distance to goal and the value of extent
     * @param action associates an action with a numerical value that the user inputs to determine
     * what type of events to give to the user
     * @return what the event that the user got as a String named result
     */
    public String actions(int action, int dis)
    {
        String result = "";
        int extent = ((int)(Math.random() * 3) +1);

        if(action == 2)
        {
            if( extent == 1) {
                result += "You've been stopped, no ground gained!";
                return result;
            }
            if( extent == 2)
            {
                result += "You've dribbled past and gained 1 square!";
                return result;
            }
            if( extent == 3)
            {
                result += "You've slipped and caused the opposing team to score!\nGame Over!";
                return result;
            }
        }
        else if(action == 1)
        {
            if( extent == 1)
            {
                result += "A defender has come in front, no ground gained!";
                return result;
            }
            else if( extent == 2)
            {
                result += "You've ran enough for 1 square!";
                return result;
            }
            else
            {
                result += "You've slipped and caused the opposing team to score!\nGame Over!";
                return result;
            }
        }
        else if(action == 3)
        {
            extent *= 15;
            if(extent > dis || dis < 40)
            {
                result += "Currently " + dis + "ft away from goal!\n";
                result += "\uD83C\uDF89You've scored, great job!\uD83C\uDF89";
            }
            else
            {
                result += "Currently " + dis + "ft away from goal!\n";
                result += "You've missed!";
            }
        }
        return result;
    }

    /**
     * moveRight is a method of Actions class that would give you true or false
     * depending on the location of the player on the field
     * @param columns sees on which column of the field the ball emoji is
     * @return true if it's anything other than a 5
     */
    public boolean moveRight(int columns)
    {
        return columns != 5;
    }
    /**
     * moveLeft is a method of Actions class that would give you true or false
     * depending on the location of the player on the field
     * @param columns sees on which column of the field the ball emoji is
     * @return true if it's anything other than a 1
     */
    public boolean moveLeft(int columns)
    {
        return columns != 1;
    }
    /**
     * moveUp is a method of Actions class that would give you true or false
     * depending on the location of the player on the field
     * @param row sees on which row of the field the ball emoji is
     * @return true if it's anything other than a 1
     */
    public boolean moveUp(int row)
    {
        return row != 1;
    }
    /**
     * moveDown is a method of Actions class that would give you true or false
     * depending on the location of the player on the field
     * @param row sees on which row of the field the ball emoji is
     * @return true if it's anything other than a 5
     */
    public boolean moveDown(int row)
    {
        return row !=5;
    }

    /**
     * canGoWhere is a method of the Actions class that would give out a string based on
     * where the move[direction] methods say the player could move
     * @param fields the updated field on which the player is to determine where
     *               they can go
     * @return a String with all the direction where the player can go and the numbers associated
     * with them
     */
    public String canGoWhere(String[][] fields)
    {
        String option = "";
        if(moveRight(action.calculateColumns(fields)))
        {
            option += "Can go right(1)!\n";
        }
        if(moveLeft(action.calculateColumns(fields)))
        {
            option += "Can go left(2)!\n";
        }
        if(moveUp(action.calculateRow(fields)))
        {
            option += "Can go up(3)!\n";
        }
        if(moveDown(action.calculateRow(fields)))
        {
            option += "Can go down(4)!\n";
        }
        return option;
    }
}