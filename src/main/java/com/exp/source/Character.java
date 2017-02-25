package com.exp.source;
import com.github.javafaker.Faker;

/**
 * Created by MadMax on 2/25/2017.
 */
public class Character {

    public String name;
    public int health;
    public int damageMaximum;
    public int attackBonus;

    private Faker faker = new Faker();

    /**
     * This constructor helps generate random instance of hero/monster.
     * @param role - accept keyword "hero"/"monster" and generate random
     *               hero/monster name. Any other parameters work as a
     *               name of new character.
     */
    public Character(String role)
    {
        if (role.equals("hero")) {
            name = faker.superhero().name();
        }
        else if (role.equals("monster"))
        {
            name = faker.pokemon().name();
        }
        else
        {
            name = role;
        }
        health = faker.number().numberBetween(10,100);
        damageMaximum = faker.number().numberBetween(1,10);
    }

    public Character()
    {
         new Character(faker.name().fullName());
    }

    public Character(String name, int health, int damageMaximum)
    {
        this.name = name;
        this.health = health;
        this.damageMaximum = damageMaximum;
    }

    public int attack()
    {
        attackBonus = faker.number().numberBetween(0,4);
        int damage = faker.number().numberBetween(0,this.damageMaximum+1) + attackBonus;

        return damage;
    }

    public void defend(int damage)
    {
        this.health = this.health - damage;
    }
}
