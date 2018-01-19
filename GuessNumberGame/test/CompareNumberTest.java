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
        String ans = compareNumber.CalculateAB("1111","2338");
        assertThat(ans,is("0A4B"));
    }
    @Test
    public void testWhenInputIsSame() {
        CompareNumber compareNumber = new CompareNumber();
        String ans = compareNumber.CalculateAB("1111","1111");
        assertThat(ans,is("4A0B"));
    }
    @Test
    public void testWhenInputIsNormal() {
        CompareNumber compareNumber = new CompareNumber();
        String ans = compareNumber.CalculateAB("0031","2338");
        assertThat(ans,is("1A3B"));
    }
}
