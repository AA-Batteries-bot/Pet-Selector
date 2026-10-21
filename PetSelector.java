//Aaron Johnson
//10/07/26
//This code generates an animal for someone using thier name, favorite color, and favorite season.
import java.util.Scanner;
public class PetSelector{
// This is the setup. Sets the Scanner for your name, fav color, and fav season.
public static void main(String[] args) {
Scanner seasonS = new Scanner(System.in);
System.out.println("Favorite Season?");
String seasonInp = seasonS.nextLine().toLowerCase();
System.out.println("Your favorite season is: " + seasonInp);
//Idiot proofing the season line
if (!(seasonInp.equals("fall")) && !(seasonInp.equals("summer")) && !(seasonInp.equals("winter"))  && !(seasonInp.equals("spring")))
  {
    System.out.println("Thats not a season lmao!");
        return; //exit program yet again
  }
//This is the scanner for favorite color
System.out.println("Favorite Color (R, G, or B): ");
String colorInp = seasonS.nextLine().toLowerCase();
System.out.println("Your favorite color is: " + colorInp);
// Idiot-proofing the color line
if (!(colorInp.equals("b")) && !(colorInp.equals("r")) && !(colorInp.equals( "g")))
 {
        System.out.println("Not a color. Remember R for red, B for blue, and G for green");
        return; //Exit program
 }
//Scanner line for name
System.out.println("Whats your name? ");
String nameInp = seasonS.nextLine().toLowerCase();
System.out.println("Your name is: " + nameInp);
//Idiot-proofing the name line
if ("abcdefghijklmnopqrstuvwxyz".indexOf(nameInp.substring(0,1)) ==-1) {
        System.out.println("Not a letter! Please entire a valid name");
        return; //exit program
}  








//Main body of code
if ((seasonInp.equals("fall")) && (colorInp.equals("b")))
{
System.out.println("I think... You get an alligator");
return;
}
else if ((seasonInp.equals("spring"))&&(colorInp.equals("b")))
{
  System.out.println("I think you get... an Ostritch");
  return;
}

else if ((seasonInp.equals("winter")) && (colorInp.equals("g")) && ("aeiou".indexOf(nameInp.substring(0,1))==-1)){
  System.out.println("You get... a girrafe!!");
  return;
}
else if((!seasonInp.equals("fall")) && (colorInp.equals("g"))){
  System.out.println("You get a dog! (Pitties are the best)");
  return;
}
if ((colorInp.equals("r")) && ("aeiou".indexOf(nameInp.substring(0,1))==-1)){
  System.out.println("You deserve... a panda");
  return;
}
else if ((colorInp.equals("r")) && ("aeiou".indexOf(nameInp.substring(0,1)) >=0)){
  System.out.println("A porquipine for you!");
  return;
}
 else if (("aeiou".indexOf(nameInp.substring(0,1))==-1) && ((seasonInp.equals("spring"))||(seasonInp.equals("winter"))) && (colorInp.equals("b"))){
  System.out.println("You need an axolotl!!");
  return;
}
else if(seasonInp.equals("summer")){
  System.out.println("You are the chosen one. You get the pony!!!");
  return;
}
else{
  System.out.println("You sadly, cannot recieve a living pet... HOWEVER, I grant you a rock.");
  return;
}

}

}




