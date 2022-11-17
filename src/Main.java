public class Main {

    public static void main(String[] args) {
        BonusMilesServise servise = new BonusMilesServise();
        int price = 800;
        int bonusMiles = servise.calculate(price);
        System.out.println("Бонусные мили = " + bonusMiles);

    }
}