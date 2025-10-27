package IntroTopics;

import java.util.ArrayList;

public class InterSection {
    public static void main(String[] args) {
        int []arr1={10,19,20,30,40,40,40};
        int []arr2={5,7,9,20,25,30,35,40,40,42};
        ArrayList<Integer> res=new ArrayList<>();
        int m=arr1.length,n=arr2.length;
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]) i++;
            else if(arr1[i]>arr2[j]) j++;
            else{
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(res);
    }
}
