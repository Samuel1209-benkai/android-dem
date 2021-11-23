package samuelbenkai1209.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class calculatrice extends AppCompatActivity {
    String oldNumber = "";
    String op ="+";
    boolean isNewOP= true;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if (isNewOP)
            ed1.setText("");
        isNewOP = false;

        String number = getText().toString();
        switch (view.getId()) {
            case R.id.button0:
                number += "0";
                break;
            case R.id.button1:
                number += "1";
                break;
            case R.id.button2:
                number += "2";
                break;
            case R.id.button3:
                number += "3"
                break;
            case R.id.button4:
                number += "4";
                break;
            case R.id.button5:
                number += "5";
                break;
            case R.id.button6:
                number += "6";
                break;
            case R.id.button7:
                number += "7";
                break;
            case R.id.button8:
                number += "8";
                break;
            case R.id.button9:
                number += "9";
                break;
            case R.id.buttonvirg:
                number += ",";
                break;
            case R.id.buttonplusoumoin:
                number = "-" + number;
                break;
        }
        ed1.setText(number);
    }

        public void operatorEvent (View view){
            isNewOP = true;
            oldNumber = ed1.getText().toString();
            switch (view.getId()) {
                case R.id.buttonmtp: op = "*"; break;
                case R.id.buttonadd: op = "+"; break;
                case R.id.buttondiv: op = "/"; break;
                case R.id.buttonsous: op = "-"; break;
            }
        }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        ed1.setText (result+"") ;
    }

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOP = true;
    }

    public void percentEvent(View view) {
        double no = Double.parseDouble( ed1.getText().toString() ) / 100;
        ed1.setText(no +"");
        isNewOP = true ;
    }
}