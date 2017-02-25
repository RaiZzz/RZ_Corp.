package test;

import com.exp.source.Character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MadMax on 2/25/2017.
 */
public class Exp_10_Battle {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Character hero = new Character("hero");
        Character monster = new Character("monster");

        System.out.println("-------------- Begin the battle --------------");

        System.out.println("Hero: "+ hero.name);
        System.out.println("Health: "+ hero.health);
        System.out.println("Maximum Damage: "+ hero.damageMaximum);

        System.out.println("-------------------- VS ----------------------");

        System.out.println("Monster: "+ monster.name);
        System.out.println("Health: "+ monster.health);
        System.out.println("Maximum Damage: "+ monster.damageMaximum);

        System.out.println("-----------------------------------------------");

        while (hero.health>0 || monster.health>0)
        {
            int heroAttack = hero.attack();
            int monsterAttack = monster.attack();

            monster.defend(heroAttack);

            if (monster.health>0)
            {
                hero.defend(monsterAttack);
            }
            else
            {
                System.out.println("!!! Hero " + hero.name + " WIN !!!");
                break;
            }
            if (hero.health<=0)
            {
                System.out.println("!!! Monster " + monster.name + " WIN !!!");
                break;
            }
            System.out.println("Hero got " +monsterAttack+ " damage. He has " +hero.health+ " health.");
            System.out.println("Monster got " +heroAttack+ " damage. He has " +monster.health+ " health.");
            System.out.println("-----------------------------------------------");
            System.out.println("Would you like to continue battle ? (Y/N)");
            String answer = reader.readLine();
            if (answer.toUpperCase().equals("Y")){}
            else break;
        }
    }
}
