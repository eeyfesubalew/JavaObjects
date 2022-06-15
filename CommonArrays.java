import java.util.Arrays;

public class CommonArrays {
    public static void main(String[] args) {
        System.out.println(common(new int[] {1, 8, 3, 2}, new int[]  {4, 2, 6, 1}));
    }
    public static int[] common(int [] arr1,int[] arr2){
        int[] commons = new int[10];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    commons[i]=arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(commons));
        return commons;
    }
}
