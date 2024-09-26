public class staff extends karyawan{
    public staff (String nama){
        super(nama);
    }
    @Override
    public void kerja(){
        System.out.println(this.nama + "bantu dosen");
    }
}
