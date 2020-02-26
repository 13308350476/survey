package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        radioButton = (RadioButton) findViewById(R.id.rb_welcome);
        //Log.v("Log", "this is " );
        /*rgp1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                int radioButtonId = arg0.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton)MainActivity.this.findViewById(radioButtonId);
                rgp1_string = rb.getText().toString();
            }
        });*/
    }
    public void welcome(View view) {
        if (radioButton.isChecked()) {
            Intent intent = new Intent(this, Question_OneActivity.class);
            startActivity(intent);
        }
    }

}









