package kr.hs.emirim.kokopink1.viewflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev);
        Button butNext=(Button)findViewById(R.id.but_next);
        butPrev.setOnClickListener(this);
        butNext.setOnClickListener(this);
        viewFlip=(ViewFlipper)findViewById(R.id.view_flip);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.but_prev:
                viewFlip.showPrevious(); //이전화면
                break;
            case R.id.but_next:
                viewFlip.showNext(); //다음화면
                break;
        }

    }
}
