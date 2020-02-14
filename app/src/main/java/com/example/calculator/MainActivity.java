package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,
            mul_button,div_button,sub_button,sum_button,dot_button,equal_button,clearButton,backSpaceButton;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView=findViewById(R.id.textViewId);
        textView.setText("0");


        button_0=findViewById(R.id.btnId0);
        button_1=findViewById(R.id.btnId1);
        button_2=findViewById(R.id.btnId2);
        button_3=findViewById(R.id.btnId3);
        button_4=findViewById(R.id.btnId4);
        button_5=findViewById(R.id.btnId5);
        button_6=findViewById(R.id.btnId6);
        button_7=findViewById(R.id.btnId7);
        button_8=findViewById(R.id.btnId8);
        button_9=findViewById(R.id.btnId9);
        button_0=findViewById(R.id.btnId0);


        mul_button=findViewById(R.id.mul_btnId);
        div_button=findViewById(R.id.div_btnId);
        sub_button=findViewById(R.id.sub_btnId);
        sum_button=findViewById(R.id.sum_btnId);
        dot_button=findViewById(R.id.dot_btnId);
        equal_button=findViewById(R.id.equalbtnId);
        clearButton=findViewById(R.id.clearButtonId);
        backSpaceButton=findViewById(R.id.backSpaceButtonId);

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);

        mul_button.setOnClickListener(this);
        div_button.setOnClickListener(this);
        sub_button.setOnClickListener(this);
        sum_button.setOnClickListener(this);
        dot_button.setOnClickListener(this);
        equal_button.setOnClickListener(this);
        clearButton.setOnClickListener(this);
        backSpaceButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


        switch(v.getId()){

                case R.id.btnId0 :
                    if (textView.getText()=="0"){
                        textView.setText("0");
                    }
                    else {
                        textView.setText(textView.getText() + "0");
                    }



                break;

                 case R.id.btnId1 :
                     if (textView.getText()=="0"){
                         textView.setText("1");
                     }
                     else {
                         textView.setText(textView.getText() + "1");
                     }
                break;

                case R.id.btnId2 :

                    if (textView.getText()=="0"){
                        textView.setText("2");
                    }
                    else {
                        textView.setText(textView.getText()+"2");
                    }

                break;

                case R.id.btnId3 :
                    if (textView.getText()=="0"){
                        textView.setText("3");
                    }
                    else {
                        textView.setText(textView.getText()+"3");
                    }
                break;

                case R.id.btnId4 :
                    if (textView.getText()=="0"){
                        textView.setText("4");
                    }
                    else {
                        textView.setText(textView.getText()+"4");
                    }
                break;

                case R.id.btnId5 :
                    if (textView.getText()=="0"){
                        textView.setText("5");
                    }
                    else {
                        textView.setText(textView.getText()+"5");
                    }
                break;

                case R.id.btnId6 :
                    if (textView.getText()=="0"){
                        textView.setText("6");
                    }
                    else {
                        textView.setText(textView.getText()+"6");
                    }
                break;

                case R.id.btnId7 :
                    if (textView.getText()=="0"){
                        textView.setText("7");
                    }
                    else {
                        textView.setText(textView.getText()+"7");
                    }
                break;

                case R.id.btnId8 :
                    if (textView.getText()=="0"){
                        textView.setText("8");
                    }
                    else {
                        textView.setText(textView.getText()+"8");
                    }
                break;

                case R.id.btnId9 :
                    if (textView.getText()=="0"){
                        textView.setText("9");
                    }
                    else {
                        textView.setText(textView.getText()+"9");
                    }
                break;

                case R.id.mul_btnId :
                textView.setText(textView.getText()+"*");
                break;

                case R.id.div_btnId :
                textView.setText(textView.getText()+"/");
                break;

                case R.id.sum_btnId :
                textView.setText(textView.getText()+"+");
                break;

                case R.id.sub_btnId :
                textView.setText(textView.getText()+"-");
                break;

                case R.id.dot_btnId :
                textView.setText(textView.getText()+".");
                break;



                case R.id.clearButtonId :
                textView.setText("0");
                break;
                    //BackSpace Button effect set Start
                case R.id.backSpaceButtonId :
                    String backedNumber = null;
                    if (textView.getText().length() > 0) {
                        StringBuilder stringBuilder = new StringBuilder(textView.getText());
                        stringBuilder.deleteCharAt(textView.getText().length()-1);
                        backedNumber = stringBuilder.toString();


                    }
                    else {
                        Toast.makeText(this, "TextView  field is empty", Toast.LENGTH_SHORT).show();
                    }

                        textView.setText(backedNumber); //set the updated text
                    //BackSpace Button effect setting end

        break;


            default : // Optional
                break;



        }

    }
}
