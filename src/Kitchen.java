import java.time.LocalDate;

public class Kitchen {
    public static void main(String[] args) {
        Pantry pantry = new Pantry(200);
        System.out.println(pantry);

        pantry.addItem(new Item("mere", LocalDate.now().plusDays(21), 10, 3, "preferatele mele mere"));
        pantry.addItem(new Item("miere", null, 1, 0, "dulce si aromata"));
        pantry.addItem(new Item("cartofi", LocalDate.now().plusMonths(2), 25, 4, "pireu, fierti si prajiti sunt deliciosi"));
        pantry.addItem(new Item("cola vanila", LocalDate.now().plusYears(1), 1, null, "arata fain dar nu stiu cum e"));

        System.out.println(pantry);

        PantryStorage pantryStorage = new PantryStorage();
        pantryStorage.write(pantry);
    }
}