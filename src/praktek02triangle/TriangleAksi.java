package praktek02triangle;
public class TriangleAksi {
    public static void main(String[] args) {
        Triangle A1 = new Triangle();
        A1.sisi1 = 5;
        A1.sisi2 = 7;
        A1.sisi3 = 9;
        
        A1.cetakInfo();
        System.out.println("Keliling triangle = "+A1.hitungkeliling());
        A1.cetakkeliling();
    }
}
