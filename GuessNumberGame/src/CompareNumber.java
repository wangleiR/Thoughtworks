/**
 * Created by wanglei on 2018/1/18.
 */

/**
 * 第一问 xAxB
 写一个CompareNumber类，只有一个函数，该函数接受两个参数，一个是答案，一个是用户输 入的四位数。
 返回值是xAxB的字符串 这里我们假定答案和用户输入都是合法的四位数。不用考虑数字合法性问题。
 请对这个类写测试（思考要写几个测试）
 */
public class CompareNumber {

    public String CalculateAB(String answer,String userInputNmuber){
        int countA = 0;
        for (int i = 0; i < 4; i++) {
            if(answer.charAt(i) == userInputNmuber.charAt(i))
                countA++;
        }
        return countA+"A"+(4-countA)+"B";
    }
}

