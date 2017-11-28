package techacademy.wakou.youko.javalog;

import android.util.Log;

/**
 * Created by appu2 on 2017/11/27.
 */
class Animal extends Human implements Thinkable {

    static String to_jp = "趣味";
    public Hobby(String hobby){
        this.hobby = hobby;
    }

    public static void introduce() {
        Log.d("javatest","これは趣味クラスです。");
    }
    public void think() {
        Log.d("javatest","私は"+ this.hobby + "について考える");
    }
    @Override
    abstract class Animal {
        String name;
        int age;
        abstract  public void say();
    }
}
