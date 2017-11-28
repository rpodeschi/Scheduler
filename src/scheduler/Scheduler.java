package scheduler;

import java.util.*;

public class Scheduler {

    public static void main(String[] args) {
        System.out.println("Welcome to the Appointment sceduler");
        System.out.println("You can schedule an appointment at 1, 2, 3, 4, 5, or 6 PM.");
        
        Scanner reader = new Scanner(System.in);
        
        String appointments[] = new String[7];
        int appointmentsMade = 0;
        
        
        while(appointmentsMade < 6){
            
            System.out.println("What is your name? ");
            String name = reader.next();
            
            boolean made = false;
            while(!made){
                try {
                    System.out.println("When would you like the appointment?");
                    int time = reader.nextInt();

                    if(time < 1 || time > 6) {
                        throw new InvalidTimeException("time value not in range");
                    }

                    if(appointments[time] != null) {
                        throw new TimeInUseException("appointment already made at that time");
                    }

                    appointments[time] = name;
                    made = true;
                    appointmentsMade++;
                    
                } 
                catch (InvalidTimeException e){
                    System.out.println("Sorry, that is not a legal time");
                } 
                catch (TimeInUseException e){
                    System.out.println("Sorry, that time is already in use");
                } 
                catch (Exception e){
                    System.out.println("Bad time format, should just be an integer");
                    // Use up the rest of the line
                    reader.nextLine();
                }
            }
        }
        System.out.println("All appointments made");
        for(int i=1; i<=6; i++){
            System.out.println("At " + i +"PM is " + appointments[i]);
        }
        
    }
}

