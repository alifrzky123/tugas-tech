public class urutkecil{
    public static void main(String[] args){
        int [] data = {3,10,5,50,51,2,4,-2,6};

        for (int index = 0; index < data.length; index++){
            int lowestindex = index; //lowest index sementara
            //start paling kecil
            for (int i = lowestindex; i < data.length; i++){
                if(data[lowestindex] > data[i]){
                    lowestindex = i;
                }
            }

            int temp = data[index];
            data[index] = data[lowestindex];
            data[lowestindex] = temp;
        }
        for (int x : data){
            System.out.println(x);
        }
    }
}