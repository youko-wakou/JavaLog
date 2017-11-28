package techacademy.wakou.youko.javalog;

import android.util.Log;

/**
 * Created by appu2 on 2017/11/28.
 */
class Animal extends Human {
    static String to_jp = "ヒューマン";

        public class Human{
            String name;
            int age;
            Human() {
            this.name;
            this.age;
        }

        public static void introduce() {
            Log.d("javatest", "これはヒューマンクラスです");
        }

        public void say() {
            Log.d("javatest", "私は" + this.name + "です。年齢は" + this.age + "歳です");
        }

    }
}