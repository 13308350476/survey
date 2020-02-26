package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_SevenActivity extends AppCompatActivity {
    public String rgp7_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp7_1;
    public RadioButton rgp7_2;
    public RadioButton rgp7_3;
    public RadioButton rgp7_4;
    public RadioButton rgp7_5;
    public RadioButton rgp7_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_seven);

        rgp7_1 = (RadioButton) findViewById(R.id.rgp7_1);
        rgp7_2 = (RadioButton) findViewById(R.id.rgp7_2);
        rgp7_3 = (RadioButton) findViewById(R.id.rgp7_3);
        rgp7_4 = (RadioButton) findViewById(R.id.rgp7_4);
        rgp7_5 = (RadioButton) findViewById(R.id.rgp7_5);
        rgp7_6 = (RadioButton) findViewById(R.id.rgp7_6);
    }
    public void question_seven(View view){
        if(rgp7_1.isChecked()){
            rgp7_string=rgp7_1.getText().toString();
        }
        if(rgp7_2.isChecked()){
            rgp7_string=rgp7_2.getText().toString();
        }
        if(rgp7_3.isChecked()){
            rgp7_string=rgp7_3.getText().toString();
        }
        if(rgp7_4.isChecked()){
            rgp7_string=rgp7_4.getText().toString();
        }
        if(rgp7_5.isChecked()){
            rgp7_string=rgp7_5.getText().toString();
        }
        if(rgp7_6.isChecked()){
            rgp7_string=rgp7_6.getText().toString();
        }
        answer = rgp7_string;
        Intent intent = new Intent(this, Question_EightActivity.class);
        startActivity(intent);
    }
}
