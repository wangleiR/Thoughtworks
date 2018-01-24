/**
 * Created by wanglei on 2018/1/18.
 */

/**
 * 第三问
 写一个Guess类，还是只有一个函数，但是只有一个参数。
 把前两问做的类集成起来，写一个集 成的单元测试，写一个集成测试。
 */
public class Guess {
    public String guessNumber(String userInputNumber){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateNumber();
        CompareNumber compareNumber = new CompareNumber();
        return compareNumber.calculateAB(answer,userInputNumber);
    }
}
