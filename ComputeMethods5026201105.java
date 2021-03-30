import java.util.Random;
public class ComputeMethods5026201105 {
    public double fToC(double F) {
        double C =5.0/9 * (F-32);
        System.out.println("jika F = " + F + " nilai C = " + C);
        return C;
    }

    public double hypotenuse (int a, int b) {
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("jika a dan b adalah " + a + " dan " + b + " maka hypotenuse = " + hypotenuse);
        return hypotenuse;
    }

    public int roll() {
        Random angka = new Random();
        int x,y,sum;
        x = angka.nextInt(6)+1;
        y = x;
        sum = x + y;
        System.out.println("hasil dari sum = " + sum);
        return sum;
    }
}
