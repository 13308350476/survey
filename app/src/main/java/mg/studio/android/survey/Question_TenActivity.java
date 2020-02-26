package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_TenActivity extends AppCompatActivity {
    public String rgp10_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp10_1;
    public RadioButton rgp10_2;
    public RadioButton rgp10_3;
    public RadioButton rgp10_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_ten);

        rgp10_1 = (RadioButton) findViewById(R.id.rgp10_1);
        rgp10_2 = (RadioButton) findViewById(R.id.rgp10_2);
        rgp10_3 = (RadioButton) findViewById(R.id.rgp10_3);
        rgp10_4 = (RadioButton) findViewById(R.id.rgp10_4);
    }

    public void question_ten(View view) {
        if(rgp10_1.isChecked()){
            rgp10_string=rgp10_1.getText().toString();
        }
        if(rgp10_2.isChecked()){
            rgp10_string=rgp10_2.getText().toString();
        }
        if(rgp10_3.isChecked()){
            rgp10_string=rgp10_3.getText().toString();
        }
        if(rgp10_4.isChecked()){
            rgp10_string=rgp10_4.getText().toString();
        }
        answer = rgp10_string;
        Intent intent = new Intent(this, Question_ElevenActivity.class);
        startActivity(intent);
    }
}
