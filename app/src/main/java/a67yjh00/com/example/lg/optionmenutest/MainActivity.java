package a67yjh00.com.example.lg.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear=(LinearLayout) findViewById(R.id.linear);//뷰 파일에 있는 linear라는 애를 linearlayout으로 형변환
        but=(Button)findViewById(R.id.but_ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater=getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.item_blue:
                linear.setBackgroundColor(Color.rgb(20,80,180));
                return true;//break;를 안써도 메소드를 아예 빠져버림
            case R.id.item_yellow:
                linear.setBackgroundColor(Color.rgb(234,204,26));
                return true;
            case R.id.item_pink:
                linear.setBackgroundColor(Color.rgb(255,180,180));
                return true;
            case R.id.item_but_rotate:
                but.setRotation(but.getRotation()+45);//45씩 돌림
                return true;
            case R.id.item_but_size:
                but.setScaleX(but.getScaleX()*1.5f);//1.5배 크게 만듬
                return true;
        }
        return false;
    }
}
