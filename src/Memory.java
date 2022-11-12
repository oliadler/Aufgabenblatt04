public class Memory {

    private int x;
    private int y;

    private int [][] field;

    public  int[][] generateField(int n)
    {

        if (n % 2 == 0)
        {
             field = new int[n][n];
        }
        else {

            System.out.println("n muss gerade sein.");
            System.exit(0);
        }

        x = (int) (Math.random() * n-1.0);
        y = (int) (Math.random()* n-1.0);



        return field;

    }


    public  void visualiseren(int [][] field)
    {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print("|");

            }
            System.out.println();
        }
    }


}
