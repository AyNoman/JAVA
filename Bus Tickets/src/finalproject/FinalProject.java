
package finalproject;

import Account.Test;
import Classes.Bus;
import Classes.Food;
import Classes.Reservation;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FinalProject {

    public static void main(String[] args) {
       try {
            Test t2= new Test();
            Bus b = new Bus();
            b.enter();
            b.Facility();
            int seat = b.seat;
           Reservation reservation = new Reservation(seat);
            Reservation r = new Reservation();
            b.viewBalance();
            Food f = new Food();
            System.out.println("FOOD TOTAL COST--->" + Food.sum);
            b.payment(Food.sum);

            //definnig all the string type variables to write in the txt file
            final Date timenow = new Date();
            String name= b.firstName +" "+ b.lastName;
            String noseat= String.valueOf(b.seat);
            String foodcost= String.valueOf(Food.sum);
            String ticketcost= String.valueOf(b.ticketBalance);
            String total= String.valueOf(Food.sum + b.ticketBalance);
            String issuedate= timenow.toString();
            String deptime= r.DepTime;
            String depdate=r.DepDate;
            String aircon= "ERROR";
            if(b.ACNonAc == 1){
                aircon= "AC-Bus";
            }
            else{
                aircon= "NonAC-Bus";
            }
            String id= b.PassengerId;
            String destination= b.des;
            
           try ( // File Handling
                   FileWriter writer = new FileWriter("Demo_output_file.txt")) {
               writer.write("\nIssue date: "+issuedate+"\nName: "+name+"      ID: "+id+"\nDestination: "+destination+"\nDeparture date: "+depdate+"   Departure time: "+deptime+"\nNumber of seats: "+noseat+"        Ac or NonAc: "+aircon+"\nTicket price= "+ticketcost+"TK         Food price= "+foodcost+"TK\n                 Total= "+total+"TK");
           }

        }
        catch (IOException e) {
            System.out.println("\n\n!!!Execption: "+e);
    }
    }
}
