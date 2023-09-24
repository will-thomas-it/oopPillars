class Main {
    public static void main(String[] args) {

        Cheeseburger cheeseburger = new Cheeseburger();
        BBQBaconCheeseburger bbqb = new BBQBaconCheeseburger();

        System.out.println("\nCheeseburger: ");
        cheeseburger.ingredients();

        System.out.println("\nBBQ Bacon Cheeseburger: ");
        bbqb.ingredients();
        bbqb.addtnlIngredients();
    }
}

