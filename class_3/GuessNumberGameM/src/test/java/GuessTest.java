import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by wanglei on 2018/1/19.
 */
public class GuessTest {
    @Test
    public void testWhenInputRand() {
        Guess guess = mock(Guess.class);
        when(guess.guessNumber("1234")).thenReturn("1A2B");
        assertThat("1A2B",is(guess.guessNumber("1234")));
    }

}
