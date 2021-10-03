import baseline.Solution31;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution31Test {
    Solution31 test = new Solution31();

    @Test
    void testTargetHeartRate() {
        int realTarget = 165;

        //compare a solved target heart rate to the one the program produces
        assertEquals(realTarget, test.getTargetHeartRate(65, 22, 75));
    }

    @Test
    void testGenerateTable() {
        String realTable = "Resting pulse: 65\t\tAge: 22\n" +
                "\n" +
                "Intensity\t| Rate\n" +
                "------------|----------\n" +
                "55%\t\t\t| 138 bpm\n" +
                "60%\t\t\t| 145 bpm\n" +
                "65%\t\t\t| 151 bpm\n" +
                "70%\t\t\t| 158 bpm\n" +
                "75%\t\t\t| 165 bpm\n" +
                "80%\t\t\t| 171 bpm\n" +
                "85%\t\t\t| 178 bpm\n" +
                "90%\t\t\t| 185 bpm\n" +
                "95%\t\t\t| 191 bpm\n";

        //generating the table to test
        test.generateTable(65, 22);
        //compare a pre-made table to the one the program produces
        assertEquals(realTable, test.table);
    }
}
