public class dosen extends karyawan{
    public dosen (String nama){
        super(nama);
    }
    @Override
    public void kerja(){
        System.out.println(this.nama + "mengajar");
    }

    
}
