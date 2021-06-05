package com.example.a6_4;

import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Android中EditText显示明文与密文的两种方式*/
public class FirstActivity extends AppCompatActivity {

    private EditText edt_password;
    private ImageView img_pwdshow;
    private boolean showPwd = false;//默认不显示密码

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist);

        initViews();
        initEvents();
    }

    private void initViews() {
        edt_password = (EditText) findViewById(R.id.edt_password);
        img_pwdshow = (ImageView) findViewById(R.id.img_pwdshow);
    }

    private void initEvents() {
        img_pwdshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOrHiddenPwdWithInputType();
            }
        });
    }

//    /**方式一：*/
//    private void showOrHiddenPwd(){
//        if(! showPwd){
//            showPwd = true;
//            img_pwdshow.setImageResource(R.drawable.pwd_show);
//            //显示密码
//            edt_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//        }else{
//            showPwd = false;
//            img_pwdshow.setImageResource(R.drawable.pwd_hidden);
//            //隐藏密码
//            edt_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
//        }
//    }

    /**方式二：*/
    private void showOrHiddenPwdWithInputType(){
        if(! showPwd){
            showPwd = true;
            img_pwdshow.setImageResource(R.drawable.pwd_show);
            //显示密码
            edt_password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        }else{
            showPwd = false;
            img_pwdshow.setImageResource(R.drawable.pwd_hidden);
            //隐藏密码
            edt_password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
}