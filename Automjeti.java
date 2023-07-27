package Detyrashtepie;

public class Automjeti {
	private String marka;
	private String modeli;
	private int vitProdhuar;
	private String ngjyra;

	public Automjeti() {
		this("Marka e Panjohur", "Modeli i Panjohur", 0, "Ngjyra e Panjohur");
	}

    public Automjeti(String marka, String modeli, int vitProdhuar, String ngjyra) {
        this.marka = marka;
        this.modeli = modeli;
        this.vitProdhuar = vitProdhuar;
        this.ngjyra = ngjyra;
    }

    
    public String getMarka() {
        return marka;
    }

    public String getModeli() {
        return modeli;
    }

  
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }
    // Veprimi 1: Ndrysho ngjyren e automjetit
    public void ndryshoNgjyren(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    // Veprimi 2: Shto vitin e prodhimit të automjetit
    public void shtoVitProdhuar(int vit) {
        this.vitProdhuar = vit;
    }
    // Metoda për të shfaqur detajet e automjetit
    public void shfaqDetajet() {
        System.out.println("Marka: " + marka);
        System.out.println("Modeli: " + modeli);
        System.out.println("Viti i prodhimit: " + vitProdhuar);
        System.out.println("Ngjyra: " + ngjyra);
    }
}
