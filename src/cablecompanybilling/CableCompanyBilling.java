package cablecompanybilling;

import java.util.Scanner;

/**
 * Software to calculate the billing of a cable company
 * with 2 type of clients: residential & Business
 * 
 * @author ameenalmassih
 * @since 1/2/2018
 */
public class CableCompanyBilling {

    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        //declare variables
        char type;
        int connections = 0;
        int channels = 0;
        double totalAmount = 0;
        double rBillFee = 4.50;
        double rBasicFee = 20.50;
        double rChannels = 7.50;
        double bBillFee = 15.00;
        double bBasicFee = 75;
        double bChannels = 50;
        
        //user input
        System.out.println("Please enter what type of costumers: R or B");
        type = console.next().charAt(0);
        
        //input calculation
        while (type != 'B' && type != 'b' && type != 'R' && type != 'r') {
            System.out.println("Customer type doesn't exist.");
            System.out.println("Please enter 'B' for Business & 'R' for residential");
            type = console.next().charAt(0);
        }

        if (type == 'R' || type == 'r') {
            System.out.println("how many channels?");
            channels = console.nextInt();
            
            //calculation
            totalAmount = rBillFee + rBasicFee + rChannels * channels;
            
        }
        
        else 
            if (type == 'B' || type == 'b') {
                System.out.println("How many connections:");
                connections = console.nextInt();
                System.out.println("How many channels:");
                channels = console.nextInt();
                
                //calculation
                if (connections > 10) { 
                    connections = (int) (bBasicFee + (connections - 10)); 
                    }
                totalAmount = bBillFee + bBasicFee + (bChannels * channels);
        }    
        
        // print the result
        if (type == 'R' || type == 'r')
            System.out.println("The customer type is Residential");
        else{
            System.out.println("The customer type is Business");
            System.out.println("The number of connections is:" + connections);
        }
        System.out.println("The number of premium channels is:" + channels);
        System.out.println("The Total Amount is: $" + totalAmount);
        
    }
    
}
