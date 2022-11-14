public class Memory {

    private int x;
    private int y;

    private int minValue = 5;
    private int [][] field;

    public  int[][] generateField(int n)
    {

        if (n % 2 != 0)
        {
            System.out.println("n muss gerade sein.");
            System.exit(0);

        }

        field = new int[n][n];



        for (int i = 0; i < (n*n/2); i++) {

            for (int j = 0; j < 2; j++) {

                while (field[x][y] != 0)
                {
                    x = (int) (Math.random() * n);
                    y = (int) (Math.random()* n);
                }

                field[x][y] = minValue;

            }
            minValue++;

        }

        return field;

    }


    public  void printField(int [][] field)
    {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(" "+field[i][j]);
            }
            System.out.println();
        }
    }


}
