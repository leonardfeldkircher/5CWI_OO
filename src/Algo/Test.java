package Algo;


public class Test {
     
    void testGenerateDataArray() {
        int [] randonNumbers = DataGenerator.generateDataArray(size:5);
        Assertions.assertEquals(randonNumbers.length, 5)
    }    
    
}
