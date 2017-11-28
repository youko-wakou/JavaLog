package techacademy.wakou.youko.javalog;

import android.util.Log;

/**
 * Created by appu2 on 2017/11/28.
 */
class Human extends Animal implements Thinkable {
    static String to_jp = "ヒューマン";

        public Human(String name,String hobby,int age){
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }


        public static void introduce() {
            Log.d("javatest", "これはヒューマンクラスです");
        }

        public void say() {
            Log.d("javatest", "私は" + this.name + "です。年齢は" + this.age + "歳です");
        }

        @Override
        public void think() {
            String hobby;
            Log.d("javatest","私は"+this.hobby+"について考える");
        }

    }