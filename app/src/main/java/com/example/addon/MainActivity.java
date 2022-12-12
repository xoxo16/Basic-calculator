package com.example.addon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button2;
    private EditText editText1;
    private EditText editText2;

    private EditText editText;

    private TextView textview;
    private TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Thank you for using our app", Toast.LENGTH_SHORT).show();
//
     button2=findViewById(R.id.button2);
     textview3=findViewById(R.id.textView5);
     editText=findViewById(R.id.editText);
     editText1=findViewById(R.id.editTextNumber);
     editText2=findViewById(R.id.editTextNumber2);



     button2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             String s1= editText1.getText().toString();
             String s2= editText2.getText().toString();
             String s3= editText.getText().toString();

             char ch= s3.charAt(0);
             double number1=Double. parseDouble(s1);
             double number2=Double. parseDouble(s2);

             if(ch=='+'){
                 double addify=number1+number2;
                 textview3.setText("The addition of two numbersis " + addify);
             }
             else if(ch=='-'){
                 double subdify=number1-number2;
                 textview3.setText("The subtarction of two numbersis " + subdify);

             }
              else if(ch=='*'){
                 double mulify=number1*number2;
                 textview3.setText("The multipliaction of two numbersis " + mulify);

             }

             else {
                 double didify=number1/number2;
                 textview3.setText("The addition of two numbersis " + didify);
             }


         }
     });








    }
}