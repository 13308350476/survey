package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Question_ElevenActivity extends AppCompatActivity {
    public String rgp11_string="NONE";
    public static String answer="NONE";
    public RadioButton rgp11_1;
    public RadioButton rgp11_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_eleven);

        rgp11_1 = (RadioButton) findViewById(R.id.rgp11_1);
        rgp11_2 = (RadioButton) findViewById(R.id.rgp11_2);
    }
    public void question_eleven(View view) {
        if(rgp11_1.isChecked()){
            rgp11_string=rgp11_1.getText().toString();
        }
        if(rgp11_2.isChecked()){
            rgp11_string=rgp11_2.getText().toString();
        }
        answer = rgp11_string;
        Intent intent = new Intent(this, Question_TwelveActivity.class);
        startActivity(intent);
    }
}
