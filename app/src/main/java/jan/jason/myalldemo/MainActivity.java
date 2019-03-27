package jan.jason.myalldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jan.jason.myalldemo.utils.KeepToActivityUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button customBtn;
    private Button ndkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_am_customview:
                KeepToActivityUtils.keepToViewMainActivity(this);
                break;

            case R.id.btn_am_ndk:
                KeepToActivityUtils.keepToNDKMainActivity(this);
                break;
        }
    }

    private void initView(){
        customBtn=findViewById(R.id.btn_am_customview);
        ndkBtn=findViewById(R.id.btn_am_ndk);

        customBtn.setOnClickListener(this);
        ndkBtn.setOnClickListener(this);
    }
}
