package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_survey);
    }

    public void finish(View view){
        setContentView(R.layout.finish_survey);
        Intent intent = new Intent(this, Show_ResultActivity.class);
        startActivity(intent);
    }
}
