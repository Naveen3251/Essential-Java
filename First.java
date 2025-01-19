/*
below line is manadatory in begining of program
even if we not imports it self imported at backend
*/
/* 
TIP:
File name and class name is same make easier

cmd:
javac <filename>.java  #compilation command
java  <classname> #execution command

*/

import java.lang.*;
class First {
    /*
    args[] -> takes the cmd arguments when we given during run time

    eg:
      javac First.java  #compile

      #running
      java First hello hi

      args[0]->hello
      args[1]->hi

    */
    public static void main(String args[]) {
        System.out.println("Hello Naveen!");
    }
}
