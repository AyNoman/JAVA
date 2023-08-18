package Classes;

import java.util.Scanner;
import java.util.Date;

public class Reservation extends Departure {

    private static int noseat;
    private static int[] seats = new int[30];

    public Reservation(int y) {
        Reservation.noseat = y;
    }

    public Reservation() {
        System.out.println("\n");
        //start by setting all seats equal to 0
        for (int i = 0; i < 30; i++) {
            seats[i] = 0;
        }
        setDepartureInfo();
        System.out.println("\n");
        // Setup our scanner and default the choice to window.
        final Scanner y = new Scanner(System.in);
        int choice = 1;
        // Ask user for a window or a non-window seat and store their choice.
        for (int i = 1; i <= noseat; i++) {
            System.out.println("For passenger" + i + " :");
            System.out.println("Press 1 for Window Seat or 2 for Non-Window Seat:");
            choice = y.nextInt();
            int seatNumber = 0;
        }
        final Date timenow = new Date();
        System.out.println();
        System.out.println("Issue Date: " + timenow.toString());
        getDepartureInfo();
         System.out.println();
        System.out.println("<<This ticket is non-refundable and non-transferable>>");
        System.out.println();
    }
    //for polymorphism->

    @Override
    public void poly() {
        System.out.println("Good Luck\nHave a Nice & Safe Journey");
    }
}
