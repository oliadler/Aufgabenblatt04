public class ZoomTest {

    public static void main(String[] args) {


        // Objekte von Typ Zoom erstellt.
        Zoom zoom = new Zoom();
        Zoom zoom1 = new Zoom();
        Zoom zoom2 = new Zoom();
        Zoom zoom3 = new Zoom();

        /*
        Testbild 1 mit Faktor f = 2
         */
        int [][] testbild1 = {{1,7,0}, {1,0,3},{0,2,1}};
        zoom.setArray(testbild1);
        int[][] ergebnisarray1von4 = zoom.zoom(2);
        System.out.println("Ergebnisarray für Testbild 1 mit Faktor 2: ");
        zoom.ergebnisAusgeben(ergebnisarray1von4);


        /*
        Testbild 1 mit Faktor f = 3
         */
        zoom1.setArray(testbild1);
        int[][]ergebnisarray2von4 = zoom1.zoom(3);
        System.out.println("Ergebnisarray für Testbild 1 mit Faktor 3: ");
        zoom.ergebnisAusgeben(ergebnisarray2von4);


        /*
        Testbild 2 mit Faktor f = 2
         */
        int [][] testbild2 = {{1,0,2}, {4,2,4},{2,0,1}};
        zoom2.setArray(testbild2);
        int[][]ergebnisarray3von4 = zoom2.zoom(2);
        System.out.println("Ergebnisarray für Testbild 2 mit Faktor 2: ");
        zoom.ergebnisAusgeben(ergebnisarray3von4);

        /*
        Testbild 2 mit Faktor f = 3
         */
        zoom3.setArray(testbild2);
        int[][]ergebnisarray4von4 = zoom3.zoom(3);
        System.out.println("Ergebnisarray für Testbild 2 mit Faktor 3: ");
        zoom.ergebnisAusgeben(ergebnisarray4von4);


    }
}
