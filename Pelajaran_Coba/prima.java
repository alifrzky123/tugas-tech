public class prima{
    public static void main (String args []){
        
        int[] data = {3,10,7,11,15,16,23,53};
        
        
        for (int i = 0;i<data.length;i++){
          boolean prima = true;
          int num = data[i];
                  
            for (int j=num/2;j>=2;j--){
              if (num%j == 0){
                prima = false;
                break;
              }
            }
          
          if(prima){
            System.out.println(num + " <- Prima");  
          }
        }
      }
    }
  