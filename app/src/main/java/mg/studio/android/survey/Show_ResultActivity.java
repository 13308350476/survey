package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class Show_ResultActivity extends AppCompatActivity {
    public TextView answer_1;
    public TextView answer_2;
    public TextView answer_3;
    public TextView answer_4;
    public TextView answer_5;
    public TextView answer_6;
    public TextView answer_7;
    public TextView answer_8;
    public TextView answer_9;
    public TextView answer_10;
    public TextView answer_11;
    public TextView answer_12;
    public String TEST;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_result);

        answer_1= (TextView) findViewById(R.id.answer_1);
        answer_2= (TextView) findViewById(R.id.answer_2);
        answer_3= (TextView) findViewById(R.id.answer_3);
        answer_4= (TextView) findViewById(R.id.answer_4);
        answer_5= (TextView) findViewById(R.id.answer_5);
        answer_6= (TextView) findViewById(R.id.answer_6);
        answer_7= (TextView) findViewById(R.id.answer_7);
        answer_8= (TextView) findViewById(R.id.answer_8);
        answer_9= (TextView) findViewById(R.id.answer_9);
        answer_10= (TextView) findViewById(R.id.answer_10);
        answer_11= (TextView) findViewById(R.id.answer_11);
        answer_12= (TextView) findViewById(R.id.answer_12);

       answer_1.setText(Question_OneActivity.answer);
       answer_2.setText(Question_TwoActivity.answer);
        answer_3.setText(Question_ThreeActivity.answer);
        answer_4.setText(Question_FourActivity.answer);
        answer_5.setText(Question_FiveActivity.answer);
        answer_6.setText(Question_SixActivity.answer);
        answer_7.setText(Question_SevenActivity.answer);
        answer_8.setText(Question_EightActivity.answer);
        answer_9.setText(Question_NineActivity.answer);
        answer_10.setText(Question_TenActivity.answer);
        answer_11.setText(Question_ElevenActivity.answer);
        answer_12.setText(Question_TwelveActivity.answer);
    }
}
