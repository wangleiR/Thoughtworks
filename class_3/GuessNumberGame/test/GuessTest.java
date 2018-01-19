import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by wanglei on 2018/1/19.
 */
public class GuessTest {
    @Test
    public void testWhenInputRand() {
        Guess guess = new Guess();
        String ans = guess.guessNumber("1342");
        assertThat(ans,is("1A2B"));
    }
}
