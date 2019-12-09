public class coba{
    public static void main(String[]args){
        int a = 10;
        int b = 5;
        a += 3;

        System.out.println(a); // 13
        a = b;
        System.out.println(b); // 5 
        a += b;
        System.out.println(a);// 10
        b -= a;
        System.out.println(b); //-5
        b *= b;
        System.out.println(b); //25
        b/=a;
        System.out.println(b); //2
        a %= b;
        System.out.println(a); //0
    }
}