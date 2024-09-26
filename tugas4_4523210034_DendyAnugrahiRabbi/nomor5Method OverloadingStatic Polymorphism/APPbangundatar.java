public class APPbangundatar { 
    public static void main(String[] args) throws Exception { 
        bangundatar bangundatar = new bangundatar(); 
        persegi p = new persegi(3); 
        segitiga s = new segitiga(4, 4); 
        lingkaran el = new lingkaran(7); 
         
        // memanggil method luas dan keliling 
        bangundatar.luas(); 
        bangundatar.keliling(); 
        System.out.print("\n"); 
        System.out.println("Luas persegi: " + p.luas()); 
        System.out.println("keliling persegi: " + p.keliling()); 
        System.out.print("\n"); 
        System.out.println("Luas segitiga: " + s.luas()); 
        System.out.print("\n"); 
        System.out.println("Luas lingkaran: " + el.luas()); 
        System.out.println("keliling lingkaran: " + el.keliling()); 
    } 
}