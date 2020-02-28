package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question_FourActivity extends AppCompatActivity {
    public String rgp4_string="NONE";
    public static String answer;
    public CheckBox rgp4_1;
    public CheckBox rgp4_2;
    public CheckBox rgp4_3;
    public CheckBox rgp4_4;
    public CheckBox rgp4_5;
    public CheckBox rgp4_6;
    public CheckBox rgp4_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_four);

        rgp4_1 = (CheckBox) findViewById(R.id.grp4_1);
        rgp4_2 = (CheckBox) findViewById(R.id.grp4_2);
        rgp4_3 = (CheckBox) findViewById(R.id.grp4_3);
        rgp4_4 = (CheckBox) findViewById(R.id.grp4_4);
        rgp4_5 = (CheckBox) findViewById(R.id.grp4_5);
        rgp4_6 = (CheckBox) findViewById(R.id.grp4_6);
        rgp4_7 = (CheckBox) findViewById(R.id.grp4_7);
    }

    public void question_four(View view){
        if(rgp4_1.isChecked()){
            rgp4_string=rgp4_1.getText().toString();
        }
        if(rgp4_2.isChecked()) {
            if (rgp4_string=="NONE") {
                rgp4_string =rgp4_2.getText().toString();
            }
            else{
                rgp4_string = rgp4_string + " and " + rgp4_2.getText().toString();
            }
        }
        if(rgp4_3.isChecked()){
            if (rgp4_string=="NONE") {
                rgp4_string =rgp4_3.getText().toString();
            }
            else{
                rgp4_string = rgp4_string + " and " + rgp4_3.getText().toString();
            }
        }
        if(rgp4_3.isChecked()){
            if (rgp4_string=="NONE") {
                rgp4_string =rgp4_4.getText().toString();
            }
            else{
                rgp4_string = rgp4_string + " and " + rgp4_4.getText().toString();
            }
        }
        if(rgp4_5.isChecked()){
            if (rgp4_string=="NONE") {
                rgp4_string =rgp4_5.getText().toString();
            }
            else{
                rgp4_string = rgp4_string + " and " + rgp4_5.getText().toString();
            }
        }
        if(rgp4_6.isChecked()){
            if (rgp4_string=="NONE") {
                rgp4_string =rgp4_6.getText().toString();
            }
            else{
                rgp4_string = rgp4_string + " and " + rgp4_6.getText().toString();
            }
        }
        if(rgp4_7.isChecked()){
            if (rgp4_string=="NONE") {
                rgp4_string =rgp4_7.getText().toString();
            }
            else{
                rgp4_string = rgp4_string + " and " + rgp4_7.getText().toString();
            }
        }
        answer = rgp4_string;
        if(rgp4_string!="NONE") {
            Intent intent = new Intent(this, Question_FiveActivity.class);
            startActivity(intent);
        }
    }
}
