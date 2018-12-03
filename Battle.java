package CS3650_Project;

import java.util.Scanner;
import java.io.IOException;

public class Battle {

    int choice;
    Scanner kb = new Scanner(System.in);

    public static void clearScreen() {
        System.out.println(new String(new char[100]).replace("\0", "\r\n"));
    }
    
    public int calculateDamage(GameObject obj1, GameObject obj2) {
        int totalDamage;
        int newCurrentHealth;
        if (obj1.getAttackDamageStat() <= obj2.getDefenseStat()){
            totalDamage = 0;
            System.out.println(obj1.getName() + "'s strength is too weak!");
        }
        else{
            totalDamage = obj1.getAttackDamageStat() - obj2.getDefenseStat();
        }
        newCurrentHealth = obj2.getCurrentHealthPoints() - totalDamage;
        System.out.println(obj1.getName() + " struck " + obj2.getName() + " for " + totalDamage + " Damage!");
        return newCurrentHealth;
    }

    public void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void waitForInput() {
        try {
            System.in.read();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void makeChoice(Player player, Monster monster) {
        System.out.println("What will you do?");
        System.out.println("(1) Attack\n");
        System.out.println("(2) Do Nothing\n");
        System.out.println("(3) Run Away\n");
        System.out.print("Enter an option (1-3):");
        choice = kb.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.println("Invalid choice. Please enter a valid option.");
            makeChoice(player, monster);
            choice = kb.nextInt();
        }
        switch (choice) {
            case 1:
                monster.setCurrentHealthPoints(calculateDamage(player, monster));
                break;
            case 2:
                System.out.println("You did nothing.");
                waitForInput();
                break;
            case 3:
                System.out.println("Frightened for your life, you decided turn around and run as fast as you can!");
                waitForInput();
                System.out.println("...");
                waitForInput();
                System.out.println("You escaped!");
                break;
            default:
                break;
        }
    }

    public void monsterChoice(Monster monster, Player player) {
        player.setCurrentHealthPoints(calculateDamage(monster, player));
    }

    public void startBattle(Player player, Monster monster) {
        System.out.println("You sense a threatening presence drawing closer to you from up ahead.");
        waitForInput();
        System.out.println("Unsure of what the shadowy figure is yet, you prepare your weapon in hand, knowing your life is in imminent danger.");
        waitForInput();
        System.out.println("Look out! An " + monster.getName() + " is coming your way!");
        waitForInput();
        while (1 != 0) {
            player.displayInfo();
            monster.displayInfo();
            makeChoice(player, monster);
            monsterChoice(monster, player);
            waitForInput();
            if (player.isAlive(player) == false) {
                System.out.println("Game Over. You died.");
                waitForInput();
                return;
            } else if (monster.isAlive(monster) == false) {
                System.out.println("With one final swing of your weapon, you struck the killing blow to end the" + monster.getName() + "'s life.");
                waitForInput();
                System.out.println("You feel a surge of energy passing through your entire body.");
                waitForInput();
                player.gainxp(monster.getLevel(), monster.getMaxHealthPoints());
                waitForInput();
                return;
            }
            clearScreen();
        }
    }
}
