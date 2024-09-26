class segitiga extends bangundatar{ 
    private int alas; 
    private int tinggi; 
 
    public segitiga(int alas, int tinggi) { 
        this.alas = alas; 
        this.tinggi = tinggi; 
    } 
     
    @Override 
    public float luas(){ 
        return this.alas * this.tinggi; 
    } 
 } 