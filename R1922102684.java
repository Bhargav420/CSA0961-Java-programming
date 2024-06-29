class R1922102684
{
    public static void main(String arg[]) {
        int[][] mat1 = {{1, 2}, {5, 3}};
        int[][] mat2 = {{2, 3}, {4, 1}};
        int[][] res = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(res[i][j]);
            }
        }
    }
}
