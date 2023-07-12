
public class Main {

    public static boolean pairOrNot(int array[], int elementToSatisfy){
        for (int iterator1 = 0 ; iterator1 < array.length ; iterator1++){
            for (int iterator2 = iterator1 + 1 ; iterator2 < array.length ; iterator2++){
                if (array[iterator1] + array[iterator2] == elementToSatisfy){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(pairOrNot(new int[] {1,2,2} , 4));
    }
}