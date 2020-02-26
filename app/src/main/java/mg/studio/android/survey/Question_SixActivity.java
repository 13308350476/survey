package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Question_SixActivity extends AppCompatActivity {
    public String rgp6_string="NONE";
    public static String answer="NONE";
    public EditText rgp6_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);

        rgp6_1 = (EditText) findViewById(R.id.grp6_1);
    }
    public void question_six(View view){
        rgp6_string = rgp6_1.getText().toString();
        answer = rgp6_string;
        Intent intent = new Intent(this, Question_SevenActivity.class);
        startActivity(intent);
    }
}
