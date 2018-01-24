/**
 * Created by wanglei on 2018/1/18.
 */

import java.util.Random;

/**
 * 写一个AnswerGenerator类，只有一个函数，返回一个四位，每位都不重复随机数。
 * 请对这个类写测试。（思考测试哪些）
 */
public class AnswerGenerator {

    public String generateNumber(){
        Random r = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        while(arr[1] == arr[0]){
            arr[1] = r.nextInt(10);
        }
        while(arr[2] == arr[0] || arr[2] == arr[1]){
            arr[2] = r.nextInt(10);
        }
        while(arr[3] == arr[0] || arr[3] == arr[1]|| arr[3] == arr[2]){
            arr[3] = r.nextInt(10);
        }
        return String.valueOf(arr[0])+arr[1]+arr[2]+arr[3];
    }

}
