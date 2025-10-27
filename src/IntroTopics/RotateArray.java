package IntroTopics;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int rem=(-22%3);
        System.out.println(rem);
        int n=arr.length;
        int k=-16;
        int [] newarr=new int[n];
        display(arr);
        display(newarr);
        rotateArr(newarr,k,n,arr);
        display(newarr);
    }
    public  static  void rotateArr(int []newarr,int k,int n,int []arr){
        for(int i=0;i<n;i++){
            newarr[(((i+k)%n)+n)%n]=arr[i];
        }
    }
    public static void display(int []arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
