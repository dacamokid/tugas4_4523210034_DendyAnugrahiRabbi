class lingkaran extends bangundatar { 
    private int r; 
 
    public lingkaran(int r) { 
        this.r = r; 
    } 
     
    @Override 
    public float luas(){ 
        return (float) (Math.PI * r * r); 
    } 
     
    @Override 
    public float keliling(){ 
        return (float) (2 * Math.PI * r); 
    } 
     
} 
