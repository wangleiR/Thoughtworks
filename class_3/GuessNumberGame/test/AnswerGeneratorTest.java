import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by wanglei on 2018/1/19.
 */
public class AnswerGeneratorTest {

    @Test
    public void testGenerateNumber() {
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String ans = answerGenerator.generateNumber();
        assertThat(ans.length(),is(4));
    }
}
