package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_TwelveActivity extends AppCompatActivity {
    public String rgp12_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp12_1;
    public RadioButton rgp12_2;
    public RadioButton rgp12_3;
    public RadioButton rgp12_4;
    public RadioButton rgp12_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_twelve);

        rgp12_1 = (RadioButton) findViewById(R.id.rgp12_1);
        rgp12_2 = (RadioButton) findViewById(R.id.rgp12_2);
        rgp12_3 = (RadioButton) findViewById(R.id.rgp12_3);
        rgp12_4 = (RadioButton) findViewById(R.id.rgp12_4);
        rgp12_5 = (RadioButton) findViewById(R.id.rgp12_5);
    }
    public void question_twelve(View view) {
        if(rgp12_1.isChecked()){
            rgp12_string=rgp12_1.getText().toString();
        }
        if(rgp12_2.isChecked()){
            rgp12_string=rgp12_2.getText().toString();
        }
        if(rgp12_3.isChecked()){
            rgp12_string=rgp12_3.getText().toString();
        }
        if(rgp12_4.isChecked()){
            rgp12_string=rgp12_4.getText().toString();
        }
        if(rgp12_5.isChecked()) {
            rgp12_string = rgp12_5.getText().toString();
        }
        answer = rgp12_string;
        Intent intent = new Intent(this, FinishActivity.class);
        startActivity(intent);
    }
}
