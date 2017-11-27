package techacademy.wakou.youko.javalog;

/**
 * Created by appu2 on 2017/11/27.
 */
import android.util.Log;
class Dog {
    static String to_jp = "犬";

    String name;
    int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public static void introduce() {
        Log.d("javatest","これは犬クラスです");
    }
    public void say() {
        Log.d("javatest",this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }
}