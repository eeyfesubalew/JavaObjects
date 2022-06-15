public class MiddleArray{
    public static void main(String[] args) {
     System.out.println(middleArr(new int[] {3, 2, 1, 4, 1}));
    }
    public static int middleArr(int[] arr){
        
        if(arr.length==0 || arr.length%2 ==0){
            return 0;
        }
        int midIndex = arr.length/2;
        int midElement = arr[midIndex];

        for(int i=0;i<arr.length;i++){
            if(i != midIndex && midElement >= arr[i]){
                return 0;
            }
        }
        return 1;
    }
}