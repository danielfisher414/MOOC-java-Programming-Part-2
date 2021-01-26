
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));

    }

    public static String arrayAsString(int[][] array) {
        StringBuilder completeArray = new StringBuilder();

        for (int row = 0; row < array.length; row++) {//row
            if (row != 0) {
                completeArray.append("\n");
            }
//            System.out.println(array.length);
//            System.out.println("row index: "+row +" row length: "+array.length);
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] > 0) {
                    completeArray.append(array[row][column]);
                } else {
                    completeArray.append("0");
                }
//                int value = array[row][column];
//                System.out.println("" + row + ", " + column + ", " + value);
            }
        }

        return completeArray.toString();
    }

}
