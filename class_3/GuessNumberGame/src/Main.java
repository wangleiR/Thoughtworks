/**
 * Created by wanglei on 2018/1/19.
 */

import java.util.Scanner;

/**
 * 完成整个游戏。整个游戏是以命令行方式进行的。每回游戏有六次机会。每输入一次数字就会减 少一次机会并打印xAxB。
 当游戏开始时，打印“Welcome!”空一行打印 “Please input your number(6): “ 每次输入完并敲击回车，
 就会在下面打印出xAxB，然后空一行打印出新的”Please input your number(x): “ 当输入的数字包含重复数字并回车时，
 在下面打印”Cannot input duplicate numbers!” 当6次都没有猜中的时候，打印”Game Over”并退出 当猜中的时候，
 不要打印4A0B,而是打印”Congratulations!”并退出
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Please input your number(6):");

        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateNumber();
        CompareNumber compareNumber = new CompareNumber();
        int count = 6;

        while (sc.hasNext()){
            String userInputNumber = sc.nextLine();
            if (judgeNumber(userInputNumber)){
                System.out.println("Cannot input duplicate numbers!");
            }else{
                String cmp = compareNumber.CalculateAB(answer,userInputNumber);
                if(cmp.equals("4A0B")){
                    System.out.println("Congratulations!");
                    break;
                }else{
                    System.out.println(cmp);
                }
            }
            count--;
            if(count == 0){
                System.out.println("Game Over");
                break;
            }
            System.out.println();
            System.out.println("Please input your number("+count+"):");
        }
    }

    /**
     * 判断输入数字的合法性
     * @param inputNumber
     * @return
     */
    public static boolean judgeNumber(String inputNumber){
        if(inputNumber.length() != 4){
            return false;
        }
        for (int i = 0; i < inputNumber.length()-1; i++) {
            for (int j = i+1; j < inputNumber.length(); j++) {
                if(inputNumber.charAt(i) == inputNumber.charAt(j))
                    return true;
            }
        }
        return false;
    }
}
