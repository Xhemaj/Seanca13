package Detyrashtepie;

public class TransportiPublik {

	private String lloji;
    private String linja;
    private int numriPasagjereve;
    private boolean eshteEcoFriendly;

    public TransportiPublik() {
        this("Lloji i Panjohur", "Linja e Panjohur", 0, false);
    }

    public TransportiPublik(String lloji, String linja, int numriPasagjereve, boolean eshteEcoFriendly) {
        this.lloji = lloji;
        this.linja = linja;
        this.numriPasagjereve = numriPasagjereve;
        this.eshteEcoFriendly = eshteEcoFriendly;
    }

   
    public String getLloji() {
        return lloji;
    }

    public String getLinja() {
        return linja;
    }

    
    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    public void setLinja(String linja) {
        this.linja = linja;
    }

    // Veprimi 1: Ndrysho linjën e transportit publik
    public void ndryshoLinen(String linja) {
        this.linja = linja;
    }

    // Veprimi 2: Shto numrin e pasagjerëve të transportit publik
    public void shtoNumrinPasagjereve(int numriPasagjereve) {
        this.numriPasagjereve = numriPasagjereve;
    }

    // Metoda për të shfaqur detajet e mjetit të transportit publik
    public void shfaqDetajet() {
        System.out.println("Lloji: " + lloji);
        System.out.println("Linja: " + linja);
        System.out.println("Numri i pasagjerëve: " + numriPasagjereve);
        System.out.println("Është e miqësorë ndaj mjedisit: " + eshteEcoFriendly);
    }
}