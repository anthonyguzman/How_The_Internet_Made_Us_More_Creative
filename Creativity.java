// Creativity

import java.util.Scanner;

public class Creativity {
    public static void main(String[] args) {
                 Scanner reader3 = new Scanner(System.in);
        int input = 0;
        System.out.println("The internet has made me a more creative person.");
        System.out.println("Choose a program that has made you more creative:");
        System.out.println("1. Websites/Videos | 2. Coding Programs | 3. Photo Editing Programs | 4. Other");
        input = reader3.nextInt();
            switch (input){
            
            case 1:  System.out.println("Websites like Youtube and Twitch are apart of my life now, they're awesome websites..");
                     break;
            case 2:  System.out.println("Coding is really awesome, java is pretty good and so is Python.");
                     break;
            case 3:  System.out.println("Yeah photo editing is amazing, I love photoshop!");
                     break;
            case 4:  System.out.println("Oh. Okay..");
                     break;
     
        }
    }
}





