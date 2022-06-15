public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {1, 2, 3, 4}));
    }
    public static int sum(int[] arr){
        int x=0;
        int y=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                y+=arr[i];
            }
            else{
                x+=arr[i];
            }
        }
        return x-y;
    }
}
