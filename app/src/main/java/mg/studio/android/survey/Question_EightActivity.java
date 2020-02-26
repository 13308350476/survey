package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_EightActivity extends AppCompatActivity {
    public String rgp8_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp8_1;
    public RadioButton rgp8_2;
    public RadioButton rgp8_3;
    public RadioButton rgp8_4;
    public RadioButton rgp8_5;
    public RadioButton rgp8_6;
    public RadioButton rgp8_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eight);

        rgp8_1 = (RadioButton) findViewById(R.id.rgp8_1);
        rgp8_2 = (RadioButton) findViewById(R.id.rgp8_2);
        rgp8_3 = (RadioButton) findViewById(R.id.rgp8_3);
        rgp8_4 = (RadioButton) findViewById(R.id.rgp8_4);
        rgp8_5 = (RadioButton) findViewById(R.id.rgp8_5);
        rgp8_6 = (RadioButton) findViewById(R.id.rgp8_6);
        rgp8_7 = (RadioButton) findViewById(R.id.rgp8_7);
    }
    public void question_eight(View view){
        if(rgp8_1.isChecked()){
            rgp8_string=rgp8_1.getText().toString();
        }
        if(rgp8_2.isChecked()){
            rgp8_string=rgp8_2.getText().toString();
        }
        if(rgp8_3.isChecked()){
            rgp8_string=rgp8_3.getText().toString();
        }
        if(rgp8_4.isChecked()){
            rgp8_string=rgp8_4.getText().toString();
        }
        if(rgp8_5.isChecked()){
            rgp8_string=rgp8_5.getText().toString();
        }
        if(rgp8_6.isChecked()){
            rgp8_string=rgp8_6.getText().toString();
        }
        if(rgp8_7.isChecked()){
            rgp8_string=rgp8_7.getText().toString();
        }
        answer = rgp8_string;
        Intent intent = new Intent(this, Question_NineActivity.class);
        startActivity(intent);
    }
}
