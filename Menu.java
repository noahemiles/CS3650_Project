package CS3650_Project;

import java.util.Scanner;

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
        clearScreen();
        System.out.println("Welcome to our demo.");
        while (1 != 0) {
            System.out.println("(1) Create Player\n");
            System.out.println("(2) Create Monster\n");
            System.out.println("(3) Battle\n");
            System.out.println("(4) Display Player Info\n");
            System.out.println("(5) Recover\n");
            System.out.println("(6) Exit\n");
            System.out.print("Enter an option (1-6): ");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.print("Please enter a name: ");
                    name = kb.next();
                    player = new Player(name);
                    player.displayInfo();
                    System.out.println("\n");
                    break;
                case 2:
                    clearScreen();
                    System.out.println("Choose a default Monster");
                    System.out.println("(1) Angry Pigeon\n");
                    System.out.println("(2) Ravaging Ghoul\n");
                    System.out.println("(3) Unkillable Behemoth\n");
                    System.out.println("(4) Create Your Own Monster\n");
                    System.out.print("Enter an option (1-4): ");
                    choice = kb.nextInt();
                    clearScreen();
                    while (choice < 1 || choice > 4) {
                        clearScreen();
                        System.out.println("Invalid choice.");
                        System.out.println("Choose a default Monster\n");
                        System.out.println("(1) Angry Pigeon\n");
                        System.out.println("(2) Ravaging Ghoul\n");
                        System.out.println("(3) Unkillable Behemoth\n");
                        System.out.println("(4) Create Your Own Monster\n");
                        System.out.print("Enter an option (1-4): ");
                        choice = kb.nextInt();
                        clearScreen();
                    }
                    switch (choice) {
                        case 1:
                            monster = new Monster(Type.NEUTRAL, "Angry Pigeon", 1, 30, 30, 7, 0, ID.MONSTER);
                            monster.displayInfo();
                            break;
                        case 2:
                            monster = new Monster(Type.UNDEAD, "Ravaging Ghoul", 2, 100, 100, 20, 0, ID.MONSTER);
                            monster.displayInfo();
                            break;
                        case 3:
                            monster = new Monster(Type.FIRE, "Unkillable Behemoth", 99, 999, 999, 100, 100, ID.MONSTER);
                            monster.displayInfo();
                            break;
                        case 4:
                            System.out.print("Enter Name for Monster: ");
                            String tempName = kb.next();
                            kb.next();
                            System.out.print("Enter Level for Monster: ");
                            int templvl = kb.nextInt();

                            System.out.print("Enter Max HP for Monster: ");
                            int temphp = kb.nextInt();

                            System.out.print("Enter Current HP for Monster: ");
                            int currhp = kb.nextInt();
                            System.out.print("Enter Attack Damage for Monster: ");
                            int tempAD = kb.nextInt();

                            System.out.print("Enter Defensive Stats for Monster: ");
                            int tempD = kb.nextInt();
                            clearScreen();
                            monster = new Monster(Type.FIRE, tempName, templvl, temphp, currhp, tempAD, tempD, ID.MONSTER);
                            monster.displayInfo();
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
                    Battle battle = new Battle();
                    battle.startBattle(player, monster);
                    clearScreen();
                    break;
                case 4:
                    clearScreen();
                    player.displayInfo();
                    break;
                case 5:
                    player.setCurrentHealthPoints(player.getMaxHealthPoints());
                    break;
                case 6:
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
