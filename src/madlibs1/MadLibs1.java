package madlibs1;

import java.util.Scanner;

public class MadLibs1 {

    public static void main(String[] args) {
        Scanner consoleReader;
        consoleReader = new Scanner( System.in );
        
        System.out.println("Enter an adjective: ");
        String descriptor = consoleReader.nextLine();
        
        System.out.println("Enter an adjective: ");
        String descriptor2 = consoleReader.nextLine();
        
        System.out.println("Enter a type of bird: ");        
        String typeBird = consoleReader.nextLine();
        
        System.out.println("Enter a type of room: ");        
        String typeRoom = consoleReader.nextLine();        
        
        System.out.println("Enter a verb (past tense): ");
        String verb = consoleReader.nextLine();
        
        System.out.println("Enter a verb: ");
        String verb2 = consoleReader.nextLine();
        
        System.out.println("Enter a relative's name: ");
        String relativeName = consoleReader.nextLine();
        
        System.out.println("Enter a noun: ");
        String singularNoun = consoleReader.nextLine();
        
        System.out.println("Enter a liquid: ");
        String typeLiquid = consoleReader.nextLine();
        
        System.out.println("Enter a gerund ");
        String gerund = consoleReader.nextLine();
        
        System.out.println("Enter a body part (plural): ");
        String bodyPart = consoleReader.nextLine();
        
        System.out.println("Enter a plural noun: ");
        String pluralNoun = consoleReader.nextLine();
        
        System.out.println("Enter a gerund: ");
        String gerund2 = consoleReader.nextLine();
        
        System.out.println("Enter a noun: ");
        String singularNoun2 = consoleReader.nextLine();                           
        
               
        System.out.println( " It was a " + descriptor + " cold, November day." );
        System.out.println( " I woke up to the " + descriptor2 + " smell of " + typeBird + " roasting in the " + typeRoom + " downstairs." );
        System.out.println( " I " + verb + " down the stairs to see if I could " + verb2 + " the dinner." );
        System.out.println( " My mom asked whether " + relativeName + " required a fresh " + singularNoun + " .");
        System.out.println( " So I carried a tray of glasses full of " + typeLiquid + " into the " + gerund + " room." );
        System.out.println( " When I got there, I couldn't believe my " + bodyPart + "! " );
        System.out.println( " There were " + pluralNoun + " " + gerund2 + " on the " + singularNoun2 + "!" );
                
        consoleReader.close();
    }
    
}
