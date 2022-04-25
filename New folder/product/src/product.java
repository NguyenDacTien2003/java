public class product {  

    String name;
    float price;
    int qty;
    int id;

    public product(String Name,float Price,int Qty,int Id) {
        name = Name;
        price = Price;
        qty = Qty;
        id = Id;
    }

    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public int getId(){
        return id;
    }
}


