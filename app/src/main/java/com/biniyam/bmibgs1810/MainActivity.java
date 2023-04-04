package com.biniyam.bmibgs1810;

import static com.biniyam.bmibgs1810.R.id.btnBmi;
import static com.biniyam.bmibgs1810.R.id.textMessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    EditText      height;
    EditText     weight;
    Button btnCalc;
    TextView resultText;

    //TextView  setCalculation();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMessage = findViewById(R.id.textMessage); //Ask for height message
      //  txtMessage.setText("Hello");       //change this to Know your BMI now. @string?

         height = findViewById(R.id.inputHeight);
         weight = findViewById(R.id.inputWeight);
         resultText = findViewById(R.id.showResult);


        Button btnCalc = findViewById(btnBmi);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCalculation();
            }

        });
    }



 private void setCalculation (){
        int h = Integer.parseInt(height.getText().toString()) ;  // int datatype cuts of decimal point
        int w = Integer.parseInt(weight.getText().toString());
        float heightValue = (float) h/100;
        int weightValue = (w) ;

      float bmi =weightValue / (heightValue*heightValue);
     resultText.setText(String.valueOf(bmi));

 }

}
// TODO Complete this: getInputs from user and save them in a variable calculate to BMI
//  and then setResultBMI in a TextView them to a result BMI
// Git keeps complaining nagging with warnings i just want to commit this version and improve upon it


