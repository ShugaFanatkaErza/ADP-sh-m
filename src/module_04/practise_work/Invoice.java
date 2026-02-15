public class Invoice implements Document {

    @Override
    public void open() {
        System.out.println("Открытие счета (Invoice)...");
    }
}
