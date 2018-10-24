package com.suikajy.androidaptdemo;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.suikajy.apt_annotation.BindView;
import com.suikajy.apt_library.BindViewTools;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_test_apt)
    TextView mTv;
    @BindView(R.id.btn_test_apt)
    Button mBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mBtn.setOnClickListener(v -> Toast.makeText(this, mTv.getText(), Toast.LENGTH_LONG).show());

    }
}
