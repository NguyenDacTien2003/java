public class Room {
    int classid ;
    String className;
    public Room (){
        classid = 22;
        className = "T2109A";

    }
    public Room(int id , String name     ){
        classid = id;
        className = name;
    }
    public String toString()   {
        return "clasaid"+  ":" +   classid + ":"+ "className" + ":" + "classname    ";

    }
}
