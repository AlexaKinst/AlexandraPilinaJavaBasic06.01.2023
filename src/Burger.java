public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;
    private String secondmeat;


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Regular Burger: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise + ".");

    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Diet Burger: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ".");
    }

    public Burger(String bun, String meat, String secondmeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.secondmeat = secondmeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;


        System.out.println("Double Burger: " + this.bun + ", " + this.meat + ", " + this.secondmeat + ", " + this.cheese + ", " + this.greens + ", " + this.mayonnaise + ".");
    }

    public class BurgerMain {
        public static void main(String[] args) {

            Burger RegularBurger = new Burger("bun", "meat", "cheese", "greens", "mayonnaise");
            Burger DietBurger = new Burger("bun", "meat", "cheese", "greens");
            Burger DoubleBurger = new Burger("bun", "meat", "meat", "cheese", "greens", "mayonnaise");
        }
    }
}
