package techacademy.wakou.youko.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("若生陽子",22);
        Hobby hobby = new Hobby("しりとり");
        human.think();
    }

}