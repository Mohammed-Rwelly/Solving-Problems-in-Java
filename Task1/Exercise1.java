import java.util.Scanner;
public class Main
{
    public static double[] doubleArray(double [] arr, int twicesize){
        double arrdoub[] =new double[twicesize];
        for (int i =0;i < twicesize/2;i++ ){
            arrdoub[i]=arr[i];
        }
        return arrdoub;
        
    }
  public static void main(String[] args) {
      double arr[] =new double[4];
    double value;
    int num,i,st,end,j;
        i=num=st=j=0;
        Scanner scan = new Scanner( System.in );
        try {
            while(true){
                if ( num == arr.length){
                    arr=doubleArray(arr,num*2);
                }
                value=scan.nextDouble();
                arr[i++]=value;
                num++;
                }
            }
        catch (Exception e){
        }
        end=num-1;
        if (num %2==1){
            num++;
        }
        double arrfinal[] =new double[num/2];
        while( st <= end){
           arrfinal[j++]=arr[st]*arr[end];
           st++;
           end--;
        }
        for (int k=0; k <arrfinal.length ;k++){
            System.out.println(arrfinal[k]);
       
        }
  }
}