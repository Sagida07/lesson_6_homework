public class Main {
    public static void main(String[] args) {

        Boss ourBoss = new Boss();
        ourBoss.weapon.setWeaponType(WeaponType.FIREARM);
        ourBoss.weapon.setWeaponName("Uzi");
        ourBoss.setDamage(50);
        ourBoss.setDefence(70);
        ourBoss.setHealth(100);



        System.out.println(ourBoss.printInfo());

        Skeleton skeleton1 = new Skeleton();

        skeleton1.weapon.setWeaponType(WeaponType.THROWING_WEAPON);
        skeleton1.weapon.setWeaponName("Long bow");
        skeleton1.setDamage(5);
        skeleton1.setDefence(20);
        skeleton1.setHealth(50);
        skeleton1.setNumberOfArrows(5);


        Skeleton skeleton2 = new Skeleton();

        skeleton2.weapon.setWeaponType(WeaponType.THROWING_WEAPON);
        skeleton2.weapon.setWeaponName("Compound bow");
        skeleton2.setDamage(10);
        skeleton2.setDefence(30);
        skeleton2.setHealth(60);
        skeleton2.setNumberOfArrows(8);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}