package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;


public class Question_OneActivity extends AppCompatActivity {
    public static String answer="NONE";
    public String rgp1_string ="NONE";
    public RadioButton rgp1_1;
    public RadioButton rgp1_2;
    public RadioButton rgp1_3;
    public RadioButton rgp1_4;
    public RadioButton rgp1_5;
    public RadioButton rgp1_6;
    public RadioButton rgp1_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_one);

        rgp1_1 = (RadioButton) findViewById(R.id.rgp1_1);
        rgp1_2 = (RadioButton) findViewById(R.id.rgp1_2);
        rgp1_3 = (RadioButton) findViewById(R.id.rgp1_3);
        rgp1_4 = (RadioButton) findViewById(R.id.rgp1_4);
        rgp1_5 = (RadioButton) findViewById(R.id.rgp1_5);
        rgp1_6 = (RadioButton) findViewById(R.id.rgp1_6);
        rgp1_7 = (RadioButton) findViewById(R.id.rgp1_7);
    }

    public void question_one(View view) {
        if (rgp1_1.isChecked()) {
            rgp1_string = rgp1_1.getText().toString();
        }
        if (rgp1_2.isChecked()) {
            rgp1_string = rgp1_2.getText().toString();
        }
        if (rgp1_3.isChecked()) {
            rgp1_string = rgp1_3.getText().toString();
        }
        if (rgp1_4.isChecked()) {
            rgp1_string = rgp1_4.getText().toString();
        }
        if (rgp1_5.isChecked()) {
            rgp1_string = rgp1_5.getText().toString();
        }
        if (rgp1_6.isChecked()) {
            rgp1_string = rgp1_6.getText().toString();
        }
        if (rgp1_7.isChecked()) {
            rgp1_string=rgp1_7.getText().toString();
        }
        answer = rgp1_string;

        Intent intent = new Intent(this, Question_TwoActivity.class);
        startActivity(intent);
    }
}

























