package com.qin.imagezxlingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Report extends AppCompatActivity implements View.OnClickListener {
    Button update;
    TextView txt_rep;
    String password;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Intent i = getIntent();
        password = i.getStringExtra("password");
        txt_rep=findViewById(R.id.txt_rep);
        txt_rep.setText(Show_json.save_data+"\n"+TimeActivity.time1);

        update=(Button)findViewById(R.id.btn_update);
        update.setOnClickListener(this);
    }


    public void quit(View view){
        Intent intent = new Intent(Report.this,UnLock.class);
        intent.putExtra("password",password);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_update:
                Toast.makeText(this, "updating", Toast.LENGTH_SHORT).show();
        }
    }
}
