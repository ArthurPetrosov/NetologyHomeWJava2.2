public class Main {
    public static void main(String[] args) {

        int replenishmentAmount = 1200;
        int amountOfReplenishmentForTheBonus = 100;
        int totalBonus = replenishmentAmount / amountOfReplenishmentForTheBonus;

        if (replenishmentAmount >= 1000) {
            System.out.println(totalBonus);
        } else {
            System.out.println("Бонусов нет");
        }
    }
}