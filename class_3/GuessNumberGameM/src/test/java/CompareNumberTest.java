/**
 * Created by wanglei on 2018/1/18.
 */
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CompareNumberTest {

    @Test
    public void testWhenInputIsDiff() {
        CompareNumber compareNumber = new CompareNumber();
        String ans = compareNumber.calculateAB("1234","4321");
        assertThat(ans,is("0A4B"));
    }
    @Test
    public void testWhenInputIsSame() {
        CompareNumber compareNumber = new CompareNumber();
        String ans = compareNumber.calculateAB("1234","1243");
        assertThat(ans,is("2A2B"));
    }
    @Test
    public void testWhenInputIsNormal() {
        CompareNumber compareNumber = new CompareNumber();
        String ans = compareNumber.calculateAB("1234","5678");
        assertThat(ans,is("0A0B"));
    }
}
