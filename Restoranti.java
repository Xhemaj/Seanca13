package Detyrashtepie;

public class Restoranti {

	 private String emri;
	    private String kuzhina;
	    private int numriTavolinave;
	    private boolean kaAmbjentPergjithshem;

	    public Restoranti() {
	        this("Emri i Panjohur", "Kuzhina e Panjohur", 0, false);
	    }

	    public Restoranti(String emri, String kuzhina, int numriTavolinave, boolean kaAmbjentPergjithshem) {
	        this.emri = emri;
	        this.kuzhina = kuzhina;
	        this.numriTavolinave = numriTavolinave;
	        this.kaAmbjentPergjithshem = kaAmbjentPergjithshem;
	    }

	
	    public String getEmri() {
	        return emri;
	    }

	    public String getKuzhina() {
	        return kuzhina;
	    }

	    // Metoda shkruese
	    public void setEmri(String emri) {
	        this.emri = emri;
	    }

	    public void setKuzhina(String kuzhina) {
	        this.kuzhina = kuzhina;
	    }

	    // Veprimi 1: Ndrysho kuzhinën e restorantit
	    public void ndryshoKuzhinën(String kuzhina) {
	        this.kuzhina = kuzhina;
	    }

	    // Veprimi 2: Shto numrin e tavolinave të restorantit
	    public void shtoNumrinTavolinave(int numriTavolinave) {
	        this.numriTavolinave = numriTavolinave;
	    }

	    // Metoda për të shfaqur detajet e restorantit
	    public void shfaqDetajet() {
	        System.out.println("Emri: " + emri);
	        System.out.println("Kuzhina: " + kuzhina);
	        System.out.println("Numri i tavolinave: " + numriTavolinave);
	        System.out.println("Ka ambjent pergjithshem: " + kaAmbjentPergjithshem);
	    }
	}