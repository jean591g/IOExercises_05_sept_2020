public class Bog {

    private int isbnnummer;
    private String titel;
    private int udgivelsesaar;

    // constructor
    public Bog(int isbnnummer, String titel, int udgivelsesaar) {
      this.isbnnummer=isbnnummer;
      this.titel=titel;
      this.udgivelsesaar=udgivelsesaar;
    }

    public void setIsbnnummer(int isbnnummer){
        this.isbnnummer=isbnnummer;
    }
    public void setTitel(String titel){
        this.titel = titel;
    }
    public void setUdgivelsesaar(int udgivelsesaar){
        this.udgivelsesaar=udgivelsesaar;
    }

    public int getIsbnnummer(){
        return isbnnummer;
    }
    public String getTitel(){
        return titel;
    }
    public int getUdgivelsesaar(){
        return udgivelsesaar;
    }
    // overrides method in Object (java.lang)
    public String toString(){
        return isbnnummer + ", " + titel + ", " + udgivelsesaar;
    }

}
