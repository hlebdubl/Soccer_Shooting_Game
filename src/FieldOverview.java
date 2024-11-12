import java.util.Objects;

public class FieldOverview {

   // private String[] field = {"⬛ "," ⬛ "," ⬛ "," \uD83E\uDD45 "," ⬛ "," ⬛ ","⬛", " \n⬛ "," 🟩 ", " 🟩 "," 🟩 "," 🟩 "," 🟩 ","⬛"," \n⬛ "," 🟩 ", " 🟩 "," 🟩 "," 🟩 "," 🟩 ","⬛"," \n⬛ "," 🟩 ", " 🟩 "," 🟩 "," 🟩 "," 🟩 ","⬛"," \n⬛ "," 🟩 ", " 🟩 "," 🟩 "," 🟩 "," 🟩 ","⬛"," \n⬛ "," 🟩 ", " 🟩 "," ⚽ "," 🟩 "," 🟩 ","⬛"," \n⬛ "," ⬛ "," ⬛ "," \uD83E\uDD45 "," ⬛ "," ⬛ ","⬛"};
    private String[][] field =
            {{" ⬛ ", " ⬛ ", " ⬛ ", " \uD83E\uDD45 ", " ⬛ ", " ⬛ ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " 🟩 ", " 🟩 ", " ⚽ ", " 🟩 ", " 🟩 ", "⬛"},
                    {" ⬛ ", " ⬛ ", " ⬛ ", " \uD83E\uDD45 ", " ⬛ ", " ⬛ ", "⬛"}};


    public FieldOverview(){
    }

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


    int rows = 0;
    int columns = 0;
    int distance;

    public int distanceToGoal() {
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
        distance = (int)(Math.sqrt(Math.pow((rows - 3),2) - (Math.pow(columns,2))));
        return distance * 10;
    }
}
