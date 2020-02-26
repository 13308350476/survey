package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Question_TwoActivity extends AppCompatActivity {
    public String rgp2_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp2_1;
    public RadioButton rgp2_2;
    public RadioButton rgp2_3;
    public RadioButton rgp2_4;
    public RadioButton rgp2_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_two);
        rgp2_1 = (RadioButton) findViewById(R.id.rgp2_1);
        rgp2_2 = (RadioButton) findViewById(R.id.rgp2_2);
        rgp2_3 = (RadioButton) findViewById(R.id.rgp2_3);
        rgp2_4 = (RadioButton) findViewById(R.id.rgp2_4);
        rgp2_5 = (RadioButton) findViewById(R.id.rgp2_5);

    }
    public void question_two(View view){
        if(rgp2_1.isChecked()){
            rgp2_string=rgp2_1.getText().toString();
        }
        if(rgp2_2.isChecked()){
            rgp2_string=rgp2_2.getText().toString();
        }
        if(rgp2_3.isChecked()){
            rgp2_string=rgp2_3.getText().toString();
        }
        if(rgp2_4.isChecked()){
            rgp2_string=rgp2_4.getText().toString();
        }
        if(rgp2_5.isChecked()){
            rgp2_string=rgp2_5.getText().toString();
        }
        answer = rgp2_string;
        Intent intent = new Intent(this, Question_ThreeActivity.class);
        startActivity(intent);
    }
}
