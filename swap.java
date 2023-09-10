import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

import java.util.Scanner;

class swap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a1=0,a2=0,b3=0,b4=0;
        int c=0;    //counter for arrey position increment
        int f=0; //flag to terminate loop 
        int ch = 0; //counter for choice increment

        String[] name;
        String[] sec;
        String[] spsec;
        int sf = 0;

        while(sf == 0){
            System.out.println("Enter Your Name:");
            name[c] = s.nextLine();
            System.out.println("Enter Your Section:");
            sec[c] = s.nextLine();
            System.out.println("Enter the section you wish to Swap:");
            spsec[c] = s.nextLine();

            System.out.print("Enter 1 to Contibue or 0 to Exit from loop");
            ch = s.nextInt();
        }
    }
}