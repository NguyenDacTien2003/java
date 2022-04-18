public class test {
    public static void main(String[] args) {
        product A1 = new product("Rice",50, 10, 01);
        System.out.println("Name: "+A1.name);
        System.out.println("Price: "+A1.price);
        System.out.println("Qty: "+A1.qty);
        System.out.println("Id: "+A1.id);

        product b1 = new product("Milk",60, 20, 02);
        System.out.println("Name: "+b1.name);
        System.out.println("Price: "+b1.price);
        System.out.println("Qty: "+b1.qty);
        System.out.println("Id: "+b1.id);
    }
}
