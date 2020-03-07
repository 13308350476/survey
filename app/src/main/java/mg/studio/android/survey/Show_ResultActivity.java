package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


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
    public Button save;
    public String JSON_data;
    public static String show_json="";

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
        save=(Button)findViewById(R.id.save);

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


        JSON_data = "{'Question_1':'"+Question_OneActivity.answer+"','Question_2':'"+Question_TwoActivity.answer+"','Question_3':'"+Question_ThreeActivity.answer
                +"','Question_4':'"+Question_FourActivity.answer+"','Question_5':'"+Question_FiveActivity.answer+"','Question_6':'"+Question_SixActivity.answer
                    +"','Question_7':'"+Question_SevenActivity.answer+"','Question_8':'"+Question_EightActivity.answer+"','Question_9':'"+Question_NineActivity.answer
                +"','Question_10':'"+Question_TenActivity.answer+"','Question11':'"+Question_ElevenActivity.answer+"','Question_12':'"+Question_TwelveActivity.answer+"'}";
        //JSON_data="{'name':'zhan gsan','age':'asdasd'}";
        //Log.v("Log",JSON_data);
        try {
            JSONObject object = new JSONObject(show_json);
            Log.v("Log",object.getString("Question_1"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //click save
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_file(JSON_data);
                Toast.makeText(Show_ResultActivity.this,"saving",Toast.LENGTH_SHORT).show();
                //Log.v("Log",getFileFromeSD(PATH));
            }
        });

    }
    private  void save_file(String msg) {
        //I/O
        //get SDcard
        File sdFile = getExternalFilesDir(null);
        File saveData = new File(sdFile, "datasave.json");
        File saveData_internal = new File(Show_ResultActivity.this.getFilesDir(),"datasave.json");
        try {
            FileOutputStream fout=new FileOutputStream(saveData,true);
            FileOutputStream fout_internal=new FileOutputStream(saveData_internal,true);
            fout.write(msg.getBytes());
            //Log.v("Log",msg );
            fout.flush();
            fout.close();
            fout_internal.write(msg.getBytes());
            fout_internal.flush();
            fout_internal.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /*public String getJson(){
        StringBuilder stringBuilder=new StringBuilder();
        try{
            InputStream is=Show_ResultActivity.this.getClass().getClassLoader().
                    getResourceAsStream("assets/"+"results.json");
            InputStreamReader streamReader=new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            //将JSON变为字符串
            while((line=reader.readLine())!=null){
                stringBuilder.append(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }*/

    public void show_json(View v){
        Intent intent = new Intent(this, ShowJSON.class);
        startActivity(intent);
    }
}
