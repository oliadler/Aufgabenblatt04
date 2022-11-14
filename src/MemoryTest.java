public class MemoryTest {

    public static void main(String[] args) {

        Memory memory4 = new Memory();
        int[][] field = memory4.generateField(4);
        System.out.println("Test mit n = 4: ");
        memory4.printField(field);

        Memory memory6 = new Memory();
        int[][] field1 = memory6.generateField(6);
        System.out.println("Test mit n = 6: ");
        memory4.printField(field1);

    }



}
