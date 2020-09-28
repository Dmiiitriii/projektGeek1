package HW22;

public class Main {
    static int Length = 4;
    public static void main(String[] args) {

        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},


        };
        try{
        sumArray(array);}
        catch(MyArrayDataException |MyArraySizeException e){
            System.out.println("\"Incorrect array \"");
        }

        System.out.println(array.length);
        System.out.println(array[1].length);


    }

    static int sumArray(String[][] array) {
        int q = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length !=Length || array[i].length != Length) {
                throw new MyArraySizeException("Incorrect array size");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int z = Integer.parseInt(array[i][j]);
                    q += z;
                }
                catch(NumberFormatException e){throw new MyArrayDataException("Incorrect data in the array i: " + i +", j:"+ j);}

                            }
            }
        System.out.println("Сумма значений массива =  " + q);
        return q;
    }
}

