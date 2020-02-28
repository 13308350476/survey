package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Question_FiveActivity extends AppCompatActivity {
    public String rgp5_string="NONE";
    public static String answer;
    public CheckBox rgp5_1;
    public CheckBox rgp5_2;
    public CheckBox rgp5_3;
    public CheckBox rgp5_4;
    public CheckBox rgp5_5;
    public CheckBox rgp5_6;
    public CheckBox rgp5_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_five);

        rgp5_1 = (CheckBox) findViewById(R.id.grp5_1);
        rgp5_2 = (CheckBox) findViewById(R.id.grp5_2);
        rgp5_3 = (CheckBox) findViewById(R.id.grp5_3);
        rgp5_4 = (CheckBox) findViewById(R.id.grp5_4);
        rgp5_5 = (CheckBox) findViewById(R.id.grp5_5);
        rgp5_6 = (CheckBox) findViewById(R.id.grp5_6);
        rgp5_7 = (CheckBox) findViewById(R.id.grp5_7);
    }
    public void question_five(View view){
        if(rgp5_1.isChecked()){
            rgp5_string=rgp5_1.getText().toString();
        }
        if(rgp5_2.isChecked()){
            if (rgp5_string=="NONE") {
                rgp5_string =rgp5_2.getText().toString();
            }
            else{
                rgp5_string = rgp5_string + " and " + rgp5_2.getText().toString();
            }
        }
        if(rgp5_3.isChecked()){
            if (rgp5_string=="NONE") {
                rgp5_string =rgp5_3.getText().toString();
            }
            else{
                rgp5_string = rgp5_string + " and " + rgp5_3.getText().toString();
            }
        }
        if(rgp5_4.isChecked()){
            if (rgp5_string=="NONE") {
                rgp5_string =rgp5_4.getText().toString();
            }
            else{
                rgp5_string = rgp5_string + " and " + rgp5_4.getText().toString();
            }
        }
        if(rgp5_5.isChecked()){
            if (rgp5_string=="NONE") {
                rgp5_string =rgp5_5.getText().toString();
            }
            else{
                rgp5_string = rgp5_string + " and " + rgp5_5.getText().toString();
            }
        }
        if(rgp5_6.isChecked()){
            if (rgp5_string=="NONE") {
                rgp5_string =rgp5_6.getText().toString();
            }
            else{
                rgp5_string = rgp5_string + " and " + rgp5_6.getText().toString();
            }
        }
        if(rgp5_7.isChecked()){
            if (rgp5_string=="NONE") {
                rgp5_string =rgp5_7.getText().toString();
            }
            else{
                rgp5_string = rgp5_string + " and " + rgp5_7.getText().toString();
            }
        }
        answer = rgp5_string;
        if(rgp5_string!="NONE") {
            Intent intent = new Intent(this, Question_SixActivity.class);
            startActivity(intent);
        }
    }
}
