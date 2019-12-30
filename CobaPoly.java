public class CobaPoly{
    public static void main(String[] args){
        Mtk obj1 = new Mtk();
        obj1.kali(10.2, 20);
        obj1.kali(5, 2);
    }
}

class Mtk{
    public void kali(double num1, double num2){
        double result = num1 * num2;
        System.out.println(result);
    }
    public void kali(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }
}