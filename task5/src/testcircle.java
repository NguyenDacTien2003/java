public class testcircle {
    public static void main(String[]args){
        circle c1 = new circle(2.0, "blue");
        System.out.println("The radius is :" + c1.getRadius());
        System.out.println("The color is :" + c1.getColor());

        circle c2 = new circle(2.0);
        System.out.println("The radius is :" + c2.getRadius());
        System.out.println("The color is :" + c2.getColor());

        circle c3 = new circle();
        System.out.println("The radius is :" + c3.getRadius());
        System.out.println("The color is :" + c3.getColor());

    }

}
