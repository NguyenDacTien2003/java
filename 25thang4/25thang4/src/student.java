public class student {
    int rollno;
    String name;
    Room myClass;
    public student(int rollno, String name , Room myClass){
        this.rollno=rollno;
        this.name=name;
        myClass=new Room();
    }
}
