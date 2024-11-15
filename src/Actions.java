/**
 * The Actions class, represents the actions a player can take
 */

public class Actions {

    FieldOverview action = new FieldOverview();
    int distance = action.distanceToGoal();

    /**
     * actions is a method of the Actions class, it has a randomized number, extent based on which the event
     * is determined for the player based on the action they have chosen
     * it also has a shoot option which would be determined on their distance to goal and the value of extent
     * @param action associates an action with a numerical value that the user inputs to determine
     * what type of events to give to the user
     * @return what the event that the user got as a String named result
     */
    public String actions(int action)
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
                result += "A defender has come in front, go ground gained!";
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
            extent *= 10;
            if(extent > distance || distance <= 15)
            {
                result += "Currently " + distance + "ft away from goal!\n";
                result += "You've scored, great job!";
            }
            else
            {
                result += "Currently " + distance + "ft away from goal!\n";
                result += "You've missed!";
            }
        }
        return result;
    }

    /**
    * moveRight is a method of Actions class that depends on the CalculateColumns method from FieldOverview
    * determines if the player would be able to move to the right depending on their position
    */
    public boolean moveRight()
    {
        return action.calculateColumns() != 5;
    }
    /**
     * moveLeft is a method of Actions class that depends on the CalculateColumns method from FieldOverview
     * determines if the player would be able to move to the left depending on their position
     */
    public boolean moveLeft()
    {
       return action.calculateColumns() != 1;
    }
    /**
     * moveUp is a method of Actions class that depends on the CalculateRow method from FieldOverview
     * determines if the player would be able to move to the up depending on their position
     */
    public boolean moveUp()
    {
        return action.calculateRow() != 1;
    }
    /**
     * moveDown is a method of Actions class that depends on the CalculateRows method from FieldOverview
     * determines if the player would be able to move to the down depending on their position
     */
    public boolean moveDown()
    {
        return action.calculateRow() !=5;
    }

    /**
     * canGoWhere is a method of the actions class, it takes in account the move[Diection] methods from above to
     * get a String of which direction a player can go in, adding values depending on if the result is true or false
     * @return a String with all the available direction and numbers associated with them on seperate rows
     */
    public String canGoWhere()
    {
        String option = "";
        if(moveRight())
        {
            option += "Can go right(1)!\n";
        }
        if(moveLeft())
        {
            option += "Can go left(2)!\n";
        }
        if(moveUp())
        {
            option += "Can go up(3)!\n";
        }
        if(moveDown())
        {
            option += "Can go down(4)!\n";
        }
        return option;
    }
}