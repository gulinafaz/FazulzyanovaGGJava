public class task3 {
    public static void main(String[] args){

        int[] array = new int[10];
        array[0] = 1;
        array[2] = 5;
        array[4] = 3;
        array[5] = 33;
        array[8] = 21;

        for(int i = 0; i < array.length; i++){
            if(array[i] != 0 && array[i] % 3 == 0){
                System.out.printf( "%d ", array[i]);
            }
        }
    }
}