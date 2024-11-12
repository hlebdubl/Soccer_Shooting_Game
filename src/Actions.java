public class Actions {

    FieldOverview action = new FieldOverview();
    int distance = action.distanceToGoal();

    public String actions(String action)
    {
        String result = "";
        int extent = ((int)(Math.random() * 3) +1);

        if(action.equals("dribble"))
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
                result += "You've dribbled past and gained 2 squares!";
                return result;
            }
        }
        else if(action.equals("run"))
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
                result += "You've sprinted forward 2 squares!";
                return result;
            }
        }
        else if(action.equals("shoot"))
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
}