public class Main {
    public static void main(String[] args){
    Candy[][] box = new Candy[4][3];
    box[0][1] = new Candy("lime");
    box[1][1] = new Candy("orange");
    box[2][2] = new Candy("cherry");
    box[3][1] = new Candy("lemon");
    box[3][2] = new Candy("grape");
    System.out.println(box);

   BoxOfCandy b = new BoxOfCandy(box);
    System.out.println(b);
//test cases A
    System.out.println(b.moveCandyToFirstRow(0));
    System.out.println(b.moveCandyToFirstRow(1));
    System.out.println(b.moveCandyToFirstRow(2));

    box = new Candy[3][5];
    box[0][0] = new Candy("lime");
    box[0][1] = new Candy("lime");
    box[0][3] = new Candy("Lemon");
    box[1][0] = new Candy("orange");
    box[1][3] = new Candy("lime");
    box[1][4] = new Candy("lime");
    box[2][0] = new Candy("Cherry");
    box[2][2] = new Candy("Lemon");
    box[0][4] = new Candy ("Orange");
    BoxOfCandy c = new BoxOfCandy(box);
    System.out.println(c);
    System.out.println(c.removeNextByFlavor("cherry"));


    }
}
