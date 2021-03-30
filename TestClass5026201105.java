import java.util.*;
public class TestClass5026201105 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double celciusDegree;
        int a,b,hypotenuse;
        System.out.print("input your Farenheit degree : ");
        celciusDegree = inputUser.nextDouble();
        System.out.print("input leg a : ");
        a =  inputUser.nextInt();
        System.out.print("input leg b : ");
        b = inputUser.nextInt();
        ComputeMethods5026201105 run = new ComputeMethods5026201105();
        run.fToC(celciusDegree);
        run.hypotenuse(a, b);
        run.roll();


    }

}
