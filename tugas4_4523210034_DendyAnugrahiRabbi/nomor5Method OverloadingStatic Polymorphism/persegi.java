class persegi extends bangundatar{ 
    private int sisi; 
     
    public persegi(int sisi) { 
        this.sisi = sisi; 
    } 
     
    @Override 
    public float luas() { 
        return this.sisi * this.sisi; 
    } 
     
    @Override 
    public float keliling(){ 
        return this.sisi * 4; 
    } 
} 