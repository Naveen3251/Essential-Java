import java.lang.*;
import java.util.*;
class Keyboard{
    public static void main(String args[]){
        /*
for keyboard input functions
1.Scanner
                          nextInt()
                          nextFloat()
                          nextDouble()
                          next()  -- reads one word
                          nextLine() -- reads multiple words

                          Before reading the data we can ensure dtype
                          hasNextInt()
                          hasNextFloat()

*/
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println(name);
    }
}
