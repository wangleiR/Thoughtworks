/**
 * Created by wanglei on 2018/1/18.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 第一问 xAxB
 写一个CompareNumber类，只有一个函数，该函数接受两个参数，一个是答案，一个是用户输 入的四位数。
 返回值是xAxB的字符串 这里我们假定答案和用户输入都是合法的四位数。不用考虑数字合法性问题。
 请对这个类写测试（思考要写几个测试）
 */
public class CompareNumber {

    public String calculateAB(String answer,String userInputNmuber){
        int countA = 0;
        int countB = 0;
        //比较对的数字的个数
        Map myMap = new HashMap();
        for (int i = 0; i < 4; i++) {
            myMap.put(answer.charAt(i),answer.charAt(i));
        }
        for (int i = 0; i < 4; i++) {
            if(myMap.containsKey(userInputNmuber.charAt(i))){
                countB++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if(answer.charAt(i) == userInputNmuber.charAt(i))
                countA++;
        }
        return countA+"A"+(countB-countA)+"B";
    }
}

