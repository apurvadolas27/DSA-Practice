// Given an array which consist of only 0, 1, 2. Sort the array withoutbusing any sorting algo

public class Print012 {
    public static void main(String[] args) {
        int a[]  = {2, 0, 1, 2, 1, 0, 0, 1, 2};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int num : a){
            if(num==0) count0++;
            else if(num==1)  count1++;
            else count2++;
        }

        int i = 0;
        while (count0-->0) {a[i++] = 0;}
        while (count1-->0) {a[i++] = 1;}
        while (count2-->0) {a[i++] = 2;}

        for(int j = 0; j <= a.length-1; j++ ){
            System.out.print(a[j] + " ");
        }
    }
}
