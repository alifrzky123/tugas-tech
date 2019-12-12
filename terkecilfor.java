public class terkecilfor{
    public static void cetak(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        int[] data = {10,34,5,23,6,7,55,20,260,3,333};

        /* for(int i : data){
           boolean kecil = true;
           for (int j : data){
               if (j<i){
                   kecil = false;
                   break;
               }
           }
           if(kecil){
               cetak(i);
               break;
           }
        } */
        /* int big = data[0];
        int kecil = data[0];
         for(int i=0;i<data.length;i++){
                 if(big < data[i]){
                        big = data[i];
                }
                 if(kecil > data[i]){
                        kecil = data[i];
                }
        }
        System. out.println(big+ " :nilai terbesar" );
        System. out.println(kecil+" :nilai terkecil" ); */
    
    /*     int datakecil = data[0];
        int indexkecil = 0;

        for (int i = 0; i < data.length; i++){
            if (data[indexkecil]>i){
                indexkecil = i;
            }
        }
        cetak(data[indexkecil]); */

    }
}