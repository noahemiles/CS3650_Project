package CS3650_Project;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Menu {

    public static void clearScreen() {
        System.out.println(new String(new char[100]).replace("\0", "\r\n"));
    }

    public void startMenu() {
        int choice;
        String name;
        Monster monster = null;
        Player player = null;
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to our demo.");
        while (1 != 0) {
            System.out.println("(1) Create Player\n");
            System.out.println("(2) Create Monster\n");
            System.out.println("(3) Battle\n");
            System.out.println("(4) Display Player Info\n");
            System.out.println("(5) Exit\n");
            System.out.print("Enter an option (1-5):");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.print("Please enter a name: ");
                    name = kb.next();
                    player = new Player(name);
                    Player.displayInfo(player);
                    System.out.println("\n");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Choose a default Monster");
                    System.out.println("(1) Angry Pigeon");
                    System.out.println("(2) Ravaging Ghoul");
                    System.out.println("(3) Unkillable Behemoth");
                    System.out.println("(4) Create Your Own Monster");
                    System.out.println("Enter an option (1-4): ");
                    choice = kb.nextInt();
                    while (choice < 1 || choice > 4) {
                        clearScreen();
                        System.out.println("Invalid choice.");
                        System.out.println("Choose a default Monster");
                        System.out.println("(1) Angry Pigeon");
                        System.out.println("(2) Ravaging Ghoul");
                        System.out.println("(3) Unkillable Behemoth");
                        System.out.println("(4) Create Your Own Monster");
                        System.out.println("Enter an option (1-4): ");
                        choice = kb.nextInt();
                    }
                    switch (choice) {
                        case 1:
                            monster = new Monster(Type.NEUTRAL, "Angry Pigeon", 1, 10, 10, 1, 0, ID.MONSTER);
                            Monster.displayInfo(monster);
                            break;
                        case 2:
                            monster = new Monster(Type.UNDEAD, "Ravaging Ghoul", 2, 10, 10, 1, 0, ID.MONSTER);
                            Monster.displayInfo(monster);
                            break;
                        case 3:
                            monster = new Monster(Type.FIRE, "Unkillable Behemoth", 99, 999, 999, 100, 100, ID.MONSTER);
                            Monster.displayInfo(monster);
                            break;
                        case 4:
                            System.out.println("Enter Name for Monster: ");
                            String tempName = kb.next();

                            System.out.println("Enter Level for Monster: ");
                            int templvl = kb.nextInt();

                            System.out.println("Enter Max HP for Monster: ");
                            int temphp = kb.nextInt();

                            System.out.println("Enter Current HP for Monster: ");
                            int currhp = kb.nextInt();
                            System.out.println("Enter Attack Damage for Monster: ");
                            int tempAD = kb.nextInt();

                            System.out.println("Enter Defensive Stats for Monster: ");
                            int tempD = kb.nextInt();

                            monster = new Monster(Type.FIRE, tempName, templvl, temphp, currhp, tempAD, tempD, ID.MONSTER);
                            Monster.displayInfo(monster);
                            //implement type if want
                            /*NEUTRAL,
                            UNDEAD,
                            FIRE,
                            WATER,
                            ICE,
                            EARTH;
                             */
                            break;
                        default:
                            break;
                    }
                    break;

                case 3:
                    clearScreen();
                    //Cannot reference player and monster through switch case.
                    //We need a place to access our GameObjects for battle system to work
                    Battle battle = new Battle();
                    battle.startBattle(player, monster);
                    clearScreen();
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
