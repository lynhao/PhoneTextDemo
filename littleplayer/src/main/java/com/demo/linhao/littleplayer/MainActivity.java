package com.demo.linhao.littleplayer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private LuckyPan luckyPan;
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luckyPan = (LuckyPan)findViewById(R.id.id_luckypan);
        imageView = (ImageView)findViewById(R.id.view);
        textView = (TextView)findViewById(R.id.words);
    }

    public void doCilck(View v) {
        if(!luckyPan.isRuning()){
            luckyPan.luckyStart(1);
            imageView.setImageResource(R.drawable.stop);
        }else{
            if (!luckyPan.isShoundEnd()) {
                luckyPan.luckyEnd();
                imageView.setImageResource(R.drawable.start);
            }
        }
    }

}
