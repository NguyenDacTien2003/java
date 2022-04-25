
    import java.util.Arrays;
    public class TestLine {
        public static void main(String[] args) {
            Line line1 = new Line(1,2,3,4);
            System.out.println(line1);
           Line line2 = new Line(new Point(5,6), new Point(7,8));
            System.out.println(line2);

            line1.setBegin(new Point(11,12));
            line1.setEnd(new Point(13, 14));
            System.out.println(line1);
            System.out.println("begin is: "+line1.getBegin());
            System.out.println("end is: "+line1.getEnd());

            line1.setBeginX(21);
            line1.setBeginY(22);
            line1.setEndX(23);
            line1.setEndY(24);
            System.out.println(line1);

            System.out.println("begin's x is: "+line1.getBeginX());
            System.out.println("begin's y is: "+line1.getBeginY());
            System.out.println("end's x is: "+line1.getEndX());
            System.out.println("end's y is: "+line1.getEndY());

            line1.setBeginXY(31,32);
            line1.setEndXY(33,34);
            System.out.println(line1);
            System.out.println("begin's x and y are: "+Arrays.toString(line1.getBeginXY()));
            System.out.println("begin's x and y are: "+Arrays.toString(line1.getEndXY()));

            System.out.printf("length is: %.2f%n", line1.getLength());


        }


    }
