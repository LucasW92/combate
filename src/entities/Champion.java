package entities;

public class Champion {

    private final String name;
    private int life, attack, armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion champion) {
        if (champion.getAttack() - armor <= 0) {
            life -= 1;
        } else {
            life -= (champion.getAttack() - armor);
        }
        if (life < 0) {
            life = 0;
        }
    }

    public String status() {
        if (life != 0) {
            return String.format("%s: %d de vida", name, life);
        } else {
            return String.format("%s: %d de vida (morreu)", name, life);
        }

    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

}
