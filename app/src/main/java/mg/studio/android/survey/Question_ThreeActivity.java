package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_ThreeActivity extends AppCompatActivity {
    public String rgp3_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp3_1;
    public RadioButton rgp3_2;
    public RadioButton rgp3_3;
    public RadioButton rgp3_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_three);

        rgp3_1 = (RadioButton) findViewById(R.id.rgp3_1);
        rgp3_2 = (RadioButton) findViewById(R.id.rgp3_2);
        rgp3_3 = (RadioButton) findViewById(R.id.rgp3_3);
        rgp3_4 = (RadioButton) findViewById(R.id.rgp3_4);
    }
    public void question_three(View view){
        if(rgp3_1.isChecked()){
            rgp3_string=rgp3_1.getText().toString();
        }
        if(rgp3_2.isChecked()){
            rgp3_string=rgp3_2.getText().toString();
        }
        if(rgp3_3.isChecked()){
            rgp3_string=rgp3_3.getText().toString();
        }
        if(rgp3_4.isChecked()){
            rgp3_string=rgp3_4.getText().toString();
        }
        answer = rgp3_string;
        Intent intent = new Intent(this, Question_FourActivity.class);
        startActivity(intent);
    }
}
