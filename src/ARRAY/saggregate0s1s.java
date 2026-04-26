package ARRAY;

public class saggregate0s1s {
    public static void saggregate(int arr[]){
        int numones=0;
        int numzeros=0;
        for(int ele: arr){
            if(ele==0){
                numzeros++;
            }
            else numones++;
        }
        for(int i=0;i<=numzeros;i++){
            arr[i]=0;

        }
        for(int i=numzeros+1;i<arr.length;i++){
            arr[i]=1;
        }


    }

}
