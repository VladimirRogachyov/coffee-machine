public class Main {
    public static void main(String[] args) {

        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60; // in grams
        int cappucinoCoffeeRequired = 15; // in grams

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;

        } if (!coffeeIsEnough) {
                System.out.println("Недостаточно кофе");
                hasErrors = true;
        } else if (!milkIsEnough) {
                System.out.println("Недостаточно молока");
                hasErrors = true;
        }
        if (!isBlocked) {
            System.out.println("Готовим кофе");
        }
    }
}