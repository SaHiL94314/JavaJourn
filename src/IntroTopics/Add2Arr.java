package IntroTopics;

public class Add2Arr {
    public static void main(String[] args) {
        int [] arr1= {9,9};
        int [] arr2={9,9,9};
        int m=arr1.length,n=arr2.length;
        int sz= m>n?m:n;
        int [] res= new int[sz+1];

        int i=m-1,j=n-1;
        int k=res.length-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int dig1=i>=0?arr1[i]:0;
            int dig2=j>=0?arr2[j]:0;

            int sum=dig1+dig2+carry;
            res[k]=(sum%10);
            carry=sum/10;

            i--;
            j--;
            k--;
        }
        for(int val:res) System.out.print(val+" ");
    }
}
