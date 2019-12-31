import java.util.Scanner;
public class scanner{
    public static void main(String[] args){
        boolean runApp = true;
        while(runApp == true){
            Scanner input = new Scanner(system.in);
            System.out.println("Pilih 1 utk lanjut di aplikasi ");
            System.out.println("Pilih 2 utk lanjut di aplikasi ");
            System.out.println("Pilih 3 utk berhenti ");
            int x = input.nextInt();
            switch(x){
                case 1:
                    System.out.println("u choose 1");
                    break;
                case 2:
                    System.out.println("u choose 2");
                    break;
                default:
                    runApp = false;
                    break
            }
        }
    }
}