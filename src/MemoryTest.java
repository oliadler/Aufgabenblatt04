public class MemoryTest {

    public static void main(String[] args) {

        int n = 4;
        Memory memory = new Memory();

        int[][] field = memory.generateField(n);
        memory.visualiseren(field);



    }



}
