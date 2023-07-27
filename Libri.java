package Detyrashtepie;

public class Libri {

	   private String titulli;
	    private String autori;
	    private int vitiPublikimit;
	    private int numriFaqeve;

	    public Libri() {
	        this("Titulli i Panjohur", "Autori i Panjohur", 0, 0);
	    }

	    public Libri(String titulli, String autori, int vitiPublikimit, int numriFaqeve) {
	        this.titulli = titulli;
	        this.autori = autori;
	        this.vitiPublikimit = vitiPublikimit;
	        this.numriFaqeve = numriFaqeve;
	    }

	   
	    public String getTitulli() {
	        return titulli;
	    }

	    public String getAutori() {
	        return autori;
	    }
	    public void setTitulli(String titulli) {
	        this.titulli = titulli;
	    }

	    public void setAutori(String autori) {
	        this.autori = autori;
	    }

	    // Veprimi 1: Ndrysho titullin e librit
	    public void ndryshoTitullin(String titulli) {
	        this.titulli = titulli;
	    }

	    // Veprimi 2: Shto autorin e librit
	    public void shtoAutorin(String autori) {
	        this.autori = autori;
	    }

	    // Metoda për të shfaqur detajet e librit
	    public void shfaqDetajet() {
	        System.out.println("Titulli: " + titulli);
	        System.out.println("Autori: " + autori);
	        System.out.println("Viti i publikimit: " + vitiPublikimit);
	        System.out.println("Numri i faqeve: " + numriFaqeve);
	    }
	}
