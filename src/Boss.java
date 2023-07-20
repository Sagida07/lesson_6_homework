public class Boss extends GameEntity {
     Weapon bossWeapon;

    Weapon weapon = new Weapon();


    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo() {
        return  "Damage: " + getDamage() + " Defence: " + getDefence() + " Health: " + getHealth()
                + " Type of weapon: " + weapon.getWeaponType() + " Name of weapon: " + weapon.getWeaponName();
    }
}