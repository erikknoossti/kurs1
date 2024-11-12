package se.erik.model;

public abstract class Entity {
    private String role;
    private int health;
    private int damage;

    public Entity(String role, int health, int damage) {
        setRole(role);
        setHealth(health);
        setDamage(damage);
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void punch(Entity target) {
        if (isConsious()) {
            target.takeDamage(getDamage());
            System.out.println(getRole() + " threw a punch and dealt " + getDamage() + " damage");
        }
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    public void addDamage(int damage) {
        setDamage(getDamage() + damage);
    }

    public boolean isConsious() {
        return health > 0;
    }

}
