public class mobilsport {
    protected String nama;

    public mobilsport(String nama) {
        this.nama = nama;
    }

    public void gigi (int g){
        System.out.println(this.nama + "mobil masuk gigi ke-" + g);
    }
    public void gigi(int g, int t){
        System.out.println(this.nama + " mobil masuk gigi ke-" + g + "dengan turbo" + t); 
    }
}
