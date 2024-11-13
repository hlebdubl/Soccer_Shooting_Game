import java.util.Objects;

public class Actions {

    FieldOverview action = new FieldOverview();
    int distance = action.distanceToGoal();

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
            if(extent > distance)
            {
                result += "You've scored, great job!";
            }
            else
            {
                result += "You've missed!";
            }
        }
        return result;
    }


    public boolean moveRight()
    {
        return action.calculateColumns() != 5;
    }
    public boolean moveLeft()
    {
       return action.calculateColumns() != 1;
    }
    public boolean moveUp()
    {
        return action.calculateRow() != 1;
    }
    public boolean moveDown()
    {
        return action.calculateRow() !=5;
    }

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