public class Char {
    public static void main(String[] args) {
    System.out.println(charsArr(new char[] {'a', 'b', 'c'}, 0, 4));
    }
    public static char[] charsArr(char[] arr, int index, int len){
        char[] el={};
        if(index !=0 || len>arr.length) {
            return null;
        }

        for(int i=0;i<arr.length;i++){
            el[i]=arr[i];
        }
        return el;

    }
}
