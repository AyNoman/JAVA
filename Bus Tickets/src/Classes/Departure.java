
package Classes;

import java.util.Scanner;

public class Departure {
    public String DepTime;
    public String DepDate;
    Scanner in = new Scanner(System.in);
     public void setDepartureInfo(){
    System.out.print("Enter the date of departure: ");
    DepDate= in.nextLine();
    System.out.print("Enter the time of departure: ");
    DepTime= in.nextLine();
  }
     public void getDepartureInfo(){
         System.out.println("Departure Date:" +DepDate +"Departure Time:"+DepTime);
     }
     //for polymorphism->
  public void poly(){
    System.out.println("GOOD BYE");
  }

}
