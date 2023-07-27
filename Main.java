package Detyrashtepie;

public class Main {
	public static void main(String[] args) {
        // Objekti 1: Automjeti
        Automjeti automjeti1 = new Automjeti();
        automjeti1.shfaqDetajet();

        Automjeti automjeti2 = new Automjeti("Volkswagen", "Golf", 2020, "E bardhë");
        automjeti2.shfaqDetajet();

        // Objekti 2: Libri
        Libri libri1 = new Libri();
        libri1.shfaqDetajet();

        Libri libri2 = new Libri("Java Programming", "John Doe", 2019, 400);
        libri2.shfaqDetajet();

        // Objekti 3: Smartphone
        Smartphone smartphone1 = new Smartphone();
        smartphone1.shfaqDetajet();

        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy S21", 5000, 6.2);
        smartphone2.shfaqDetajet();

        // Objekti 4: TransportiPublik
        TransportiPublik transporti1 = new TransportiPublik();
        transporti1.shfaqDetajet();

        TransportiPublik transporti2 = new TransportiPublik("Autobus", "Linja 10", 50, true);
        transporti2.shfaqDetajet();

        // Objekti 5: Restoranti
        Restoranti restoranti1 = new Restoranti();
        restoranti1.shfaqDetajet();

        Restoranti restoranti2 = new Restoranti("Shija e Verës", "Mediterranean", 30, true);
        restoranti2.shfaqDetajet();
    }
}
