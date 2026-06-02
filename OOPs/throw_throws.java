package OOPs;

public class throw_throws {
    public static void main(String[] args) {
        int age = 17;
        if(age>18)
        {
            System.out.println("eligible to vote");
        }else{
            //throws

             // Used in method declaration.

             // void readFile() throws IOException

             // Meaning:

            // "This method might generate an IOException. Whoever calls me must handle it."
            // throw --> used to create and throw and exception
            throw new IllegalAccessError("Not eligible to vote");
        }
    }
}
