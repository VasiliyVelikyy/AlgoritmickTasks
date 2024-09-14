package training.algorithm_lecture.lecture1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostMetSymbolTest {

    @Test
    void process() {
        MostMetSymbol squareLineComplexity = new MostMetSymbolSquareLineComplexity();
        char squareLineExpected = squareLineComplexity.process("a,b,a,b,a");
        Assertions.assertEquals('a', squareLineExpected);

        MostMetSymbol logLineComplexity =new  MostMetSymbolLogLineComplexity();
        char logLineExpected = logLineComplexity.process("a,b,a,b,a");
        Assertions.assertEquals('a', logLineExpected);

        MostMetSymbol lineComplexity = new MostMetSymbolLineComplexity();
        char lineExpected = lineComplexity.process("a,b,a,b,a");
        Assertions.assertEquals('a', lineExpected);
    }
}