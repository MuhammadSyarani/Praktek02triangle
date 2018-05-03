package praktek02triangle;
public class Triangle {
    double sisi1;
    double sisi2;
    double sisi3;

    public Triangle() {
        sisi1=11;
        sisi2=14;
        sisi3=14;
    }

    public Triangle(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    
    
    void cetakInfo(){
        System.out.println("=======================");
        System.out.println("Sisi 1 : "+sisi1);
        System.out.println("Sisi 2 : "+sisi2);
        System.out.println("Sisi 3 : "+sisi3);
        System.out.println("=======================");
    }
    
    double hitungkeliling(){
        double keliling;
        keliling=sisi1+sisi2+sisi3;
        return keliling;
}
    
void cetakkeliling(){
    System.out.println("Keliling adalah: "+hitungkeliling());
}
