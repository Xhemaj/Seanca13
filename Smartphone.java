package Detyrashtepie;

public class Smartphone {

	  private String marka;
	    private String modeli;
	    private int kapacitetiBaterise;
	    private double madhesiaEkranit;

	    public Smartphone() {
	        this("Marka e Panjohur", "Modeli i Panjohur", 0, 0.0);
	    }

	    public Smartphone(String marka, String modeli, int kapacitetiBaterise, double madhesiaEkranit) {
	        this.marka = marka;
	        this.modeli = modeli;
	        this.kapacitetiBaterise = kapacitetiBaterise;
	        this.madhesiaEkranit = madhesiaEkranit;
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

	    // Veprimi 1: Ndrysho modelin e smartphone
	    public void ndryshoModelin(String modeli) {
	        this.modeli = modeli;
	    }

	    // Veprimi 2: Shto kapacitetin e baterisë së smartphone
	    public void shtoKapacitetinBaterise(int kapaciteti) {
	        this.kapacitetiBaterise = kapaciteti;
	    }

	    // Metoda për të shfaqur detajet e smartphone
	    public void shfaqDetajet() {
	        System.out.println("Marka: " + marka);
	        System.out.println("Modeli: " + modeli);
	        System.out.println("Kapaciteti i baterisë: " + kapacitetiBaterise + " mAh");
	        System.out.println("Madhësia e ekranit: " + madhesiaEkranit + " inch");
	    }
	}
