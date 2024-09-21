public class ArrayDryRunDemo {

    public static void main(String[] arg){
        // Declare and initialize a 2D array
        String[][] s = new String[2][3];

        // Assign values to the array elements
        s[0][0] = "A00";
        s[0][1] = "A01";
        s[0][2] = "A02";
        s[1][0] = "A10";
        s[1][1] = "A11";
        s[1][2] = "A12";

        // Loop through the array and print its elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}