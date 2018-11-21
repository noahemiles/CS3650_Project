package CS3650_Project;

import java.util.Scanner;
import java.util.*; 
import java.lang.*; 

public class Menu {
    
    public static void clearScreen(){
        System.out.println(new String(new char[100]).replace("\0", "\r\n"));
    }
    
    public void startMenu() {
        int choice;
        String name;
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to our demo.");
        while (1 != 0){
            System.out.println("(1) Create Player\n");
            System.out.println("(2) Create Monster\n");
            System.out.println("(3) Battle\n");
            System.out.println("(4) Display Player Info\n");
            System.out.println("(5) Exit\n");
            System.out.print("Enter an option (1-5):");
            choice = kb.nextInt();
            switch (choice){
                case 1: 
                    clearScreen();
                    System.out.print("Please enter a name: ");
                    name = kb.next();
                    Player player = new Player(name);
                    Player.displayInfo(player);
                    System.out.println("\n");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Choose a default Monster");
                    System.out.println("(1) Angry Pigeon");
                    System.out.println("(2) Ravaging Ghoul");
                    System.out.println("(3) Unkillable Behemoth");
                    System.out.println("Enter an option (1-3): ");
                    choice = kb.nextInt();
                    while (choice < 1 || choice > 3){
                        clearScreen();
                        System.out.println("Invalid choice.");
                        System.out.println("Choose a default Monster");
                        System.out.println("(1) Angry Pigeon");
                        System.out.println("(2) Ravaging Ghoul");
                        System.out.println("(3) Unkillable Behemoth");
                        System.out.println("Enter an option (1-3): ");
                        choice = kb.nextInt();
                    }
                    switch(choice){
                        case 1:
                            Monster AngryPigeon = new Monster(Type.NEUTRAL, "Angry Pigeon", 1, 10, 10, 1, 0, ID.MONSTER);
                            Monster.displayInfo(AngryPigeon);
                            break;
                        case 2:
                            Monster RavagingGhoul = new Monster(Type.UNDEAD, "Ravaging Ghoul", 2, 10, 10, 1, 0, ID.MONSTER);
                            Monster.displayInfo(RavagingGhoul);
                            break;
                        case 3:
                            Monster UnkillableBehemoth = new Monster(Type.FIRE, "Unkillable Behemoth", 99, 999, 999, 100, 100, ID.MONSTER);
                            Monster.displayInfo(UnkillableBehemoth);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.println("Battle System not yet Implemented");
                    break;
                case 4:
                    clearScreen();
                    //Creates an error. Most likely need to externally implement driver outside of main class
                    //Player.displayInfo(player);
                    break;
                case 5:
                    clearScreen();
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    clearScreen();
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
