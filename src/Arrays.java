public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        //[0, 0, 0, 0, 0]

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            System.out.println(intArray[i]);
        }
        String[] strArray = {"One", "Two", "Three"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        strArray[1] = "Five";
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        //[null, null, null, null, null]
        int[][] newIntArray = new int[5][5];

        for (int i = 0; i < newIntArray.length; i++) {
            for (int j = 0; j < newIntArray[i].length; j++) {
                System.out.print(newIntArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
