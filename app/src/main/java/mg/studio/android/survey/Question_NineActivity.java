package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_NineActivity extends AppCompatActivity {
    public String rgp9_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp9_1;
    public RadioButton rgp9_2;
    public RadioButton rgp9_3;
    public RadioButton rgp9_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_nine);

        rgp9_1 = (RadioButton) findViewById(R.id.rgp9_1);
        rgp9_2 = (RadioButton) findViewById(R.id.rgp9_2);
        rgp9_3 = (RadioButton) findViewById(R.id.rgp9_3);
        rgp9_4 = (RadioButton) findViewById(R.id.rgp9_4);
    }
    public void question_nine(View view) {
        if(rgp9_1.isChecked()){
            rgp9_string=rgp9_1.getText().toString();
        }
        if(rgp9_2.isChecked()){
            rgp9_string=rgp9_2.getText().toString();
        }
        if(rgp9_3.isChecked()){
            rgp9_string=rgp9_3.getText().toString();
        }
        if(rgp9_4.isChecked()){
            rgp9_string=rgp9_4.getText().toString();
        }
        answer = rgp9_string;
        Intent intent = new Intent(this, Question_TenActivity.class);
        startActivity(intent);
    }
}
