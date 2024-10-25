/*
Terminal Game - Create Hero Prototype
In this first kata in the series, you need to define a Hero prototype to be used in a terminal game. The hero should have the following attributes:
attribute	value
name	user argument or 'Hero'
position	'00'
health	100
damage	5
experience	0
*/

public class Hero { 
    public String name;
    public String position;
    public int health;
    public int damage;
    public int experience;

    // Default constructor
    public Hero() {
        this.name = "Hero";  // Default name
        this.position = "00"; // Default position
        this.health = 100;    // Initial health
        this.damage = 5;      // Initial damage
        this.experience = 0;  // Initial experience
    }

    // Constructor with name parameter
    public Hero(String name) {
        this.name = name != null ? name : "Hero"; // Default to 'Hero' if name is null
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }
}
