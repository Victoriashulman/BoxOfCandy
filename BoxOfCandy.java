public class BoxOfCandy{
    private Candy[][] box;
    public BoxOfCandy(Candy[][] b)
    {
        box = b;
    }
    BoxOfCandy b = new BoxOfCandy(box);
    System.out.println(b);

public String toString()
{
    String s = "";
    for(int row = 0; row < box.length; row ++)
    {
        for (int col = 0; col < box[0].length; col++)
        {
            s += box[row][col] + " ";
        }
        s += "\n";
    }
    return s;
}}
