package com.cookandroid.chapter4_basic_widget;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    TextView text1, text2;
//    CheckBox chkAgree;
//    RadioGroup rGroup1;
//    RadioButton rdoCat, rdoRas, rdoFox;
//    Button btnOK;
//    ImageView imgAni;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_animalchoose);
//        setTitle("귀여운 동물");
//
//        text1 = (TextView) findViewById(R.id.Text1);
//        chkAgree = (CheckBox) findViewById(R.id.ChkAgree);
//        text2 = (TextView) findViewById(R.id.Text2);
//        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
//        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
//        rdoRas = (RadioButton) findViewById(R.id.RdoRas);
//        rdoFox = (RadioButton) findViewById(R.id.RdoFox);
//        btnOK = (Button) findViewById(R.id.BtnOK);
//        imgAni = (ImageView) findViewById(R.id.ImgAni);
//
//        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(chkAgree.isChecked() == true){
//                    text2.setVisibility(View.VISIBLE);
//                    rGroup1.setVisibility(View.VISIBLE);
//                    btnOK.setVisibility(View.VISIBLE);
//                    imgAni.setVisibility(View.VISIBLE);
//                } else {
//                    text2.setVisibility(View.INVISIBLE);
//                    rGroup1.setVisibility(View.INVISIBLE);
//                    btnOK.setVisibility(View.INVISIBLE);
//                    imgAni.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
//
//        btnOK.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch(rGroup1.getCheckedRadioButtonId()){
//                    case R.id.RdoCat:
//                        imgAni.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.RdoRas:
//                        imgAni.setImageResource(R.drawable.ras);
//                        break;
//                    case R.id.RdoFox:
//                        imgAni.setImageResource(R.drawable.fox);
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }


    TextView text1, text2;
    Switch swhStart;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    ImageView imgAnd;
    Button btnFin;
    Button btnReset;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_4);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        swhStart = (Switch) findViewById(R.id.SwhStart);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ = (RadioButton) findViewById(R.id.RdoQ);
        rdoR = (RadioButton) findViewById(R.id.RdoR);
        rdoS = (RadioButton) findViewById(R.id.RdoS);
        imgAnd = (ImageView) findViewById(R.id.ImgAnd);
        btnFin = (Button) findViewById(R.id.BtnFin);
        btnReset = (Button) findViewById(R.id.BtnReset);

        swhStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (swhStart.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgAnd.setVisibility(View.VISIBLE);
                    btnFin.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgAnd.setVisibility(View.INVISIBLE);
                    btnFin.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                }
            }
        });

        rdoQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.and_q);
            }
        });

        rdoR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.and_r);
            }
        });

        rdoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnd.setImageResource(R.drawable.and_s);
            }
        });

        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                imgAnd.setVisibility(View.INVISIBLE);
                btnFin.setVisibility(View.INVISIBLE);
                btnReset.setVisibility(View.INVISIBLE);

                rGroup1.clearCheck();
                imgAnd.setImageResource(0); // 그림이 없는걸로 바뀜.
                swhStart.setChecked(false);
            }
        });

    }
}