class Segitiga {
    private int alas;
    private int tinggi;
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }
}