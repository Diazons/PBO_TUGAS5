class Lingkaran {
    private int r;
    public void setJariJari(int jariJari) {
        this.r = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * r * r; 
    }
}