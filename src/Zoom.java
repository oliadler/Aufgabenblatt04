public class Zoom {

    // Instanzvariablen
    private int[][] array;

    boolean isOutofArea ;


    //Setter für Array
    public void setArray(int[][] array) {

        // Ueberpruefung, ob das Array auch innerhalb des Bereiches liegt.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > 7)
                {
                    isOutofArea = true;
                }
            }
        }

        if (!isOutofArea){
            this.array = array;
        }
        else
        {
            System.out.println("Das Array enthaelt Grauwerte außerhalb des Bereichs [0,7]. ");
            System.exit(0);
        }

    }

    // Zoom Funktion mit dem Faktor f als Parameter
    public int[][] zoom (int f)
    {
        int rowcounter = 0;
        int columnCounter = 0;
        int rowcounter1 = 1;
        int columnCounter1 = 0;

        // ergebnisarray mit der Länge vom array * f.
        int [][] ergebnisarray = new int[array.length*f][array[0].length*f];

        // Überprüfung ob f groeßer als 1 ist.
        if (f<=1)
        {
            System.out.println("Der Faktor f muss größer als 1 sein.");
            System.exit(0);

        }
        else
        {

            // Bild vergroeßern.
            for (int i = 0; i < array.length ; i++) {
                for (int z = 0; z < f; z++) {

                    for (int j = 0; j < array[0].length; j++) {


                        for (int k = 0; k < f; k++) {


                            ergebnisarray[rowcounter][columnCounter] = array[i][j];
                            columnCounter++;
                        }

                    }
                    columnCounter = 0;
                    rowcounter++;

                }





                }

            }
        return ergebnisarray;

        }






    // ergebnisarray ausgeben.
    public void ergebnisAusgeben(int[][] array)
    {
        for (int[] oneDimArray:array) {
        for (int element: oneDimArray) {
            System.out.print(element);
        }
            System.out.println();
        }

    }

}
