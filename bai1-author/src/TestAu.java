public class TestAu {

        public static void main(String[] args) {
            //Test constructor and toString
           Author author1 = new Author("Ngoc Anh", "tranthingocanh2204@gmail.com", 'm');
            System.out.println(author1);

            //Test Setters and getters
            author1.setEmail("ngocanh2204@gmail.com");
            System.out.println(author1);
            System.out.println("Name is: "+ author1.getName());
            System.out.println("Gender is:" + author1.getGender());
            System.out.println("Email is: "+ author1.getEmail());
        }
    }