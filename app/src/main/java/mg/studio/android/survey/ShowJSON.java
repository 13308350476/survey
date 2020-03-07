package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ShowJSON extends AppCompatActivity {

    int flag=0;     //Used to determine how many questions to answer
    int flag1=0;
    int[] questionnum=new int[100];  //Used to determine that there are several options in this question to limit the user's answers
    String [][]answer=new String[100][100]; //Holds options read from a file
    String []type=new String[100];  //Type of storage question
    String []question=new String[100];  //store questions

    TextView showquestion;
    RadioButton bt_1;
    RadioButton bt_2;
    RadioButton bt_3;
    RadioButton bt_4;
    RadioButton bt_5;
    RadioButton bt_6;
    RadioButton bt_7;
    RadioButton bt_8;
    RadioButton bt_9;
    RadioButton bt_10;
    Button bt_choose;
    TextView tv_show_answer;

    String save_data="";  //User's answer
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_json);
        bt_1=(RadioButton)findViewById(R.id.choose_1);
        bt_2=(RadioButton)findViewById(R.id.choose_2);
        bt_3=(RadioButton)findViewById(R.id.choose_3);
        bt_4=(RadioButton)findViewById(R.id.choose_4);
        bt_5=(RadioButton)findViewById(R.id.choose_5);
        bt_6=(RadioButton)findViewById(R.id.choose_6);
        bt_7=(RadioButton)findViewById(R.id.choose_7);
        bt_8=(RadioButton)findViewById(R.id.choose_8);
        bt_9=(RadioButton)findViewById(R.id.choose_9);
        bt_10=(RadioButton)findViewById(R.id.choose_10);
        bt_choose=(Button)findViewById(R.id.bt_choose) ;
        showquestion=(TextView)findViewById(R.id.tv_show_json);
        tv_show_answer = (TextView)findViewById(R.id.tv_show_answer);

        //You can put the JSON class to str and it will automatically store it for you in the sample.json file
        String str="{\"survey\":{\"id\":\"12344134\",\"len\":\"2\",\"questions\":[{\"type\":\"single\",\"question\":\"How well do the professors teach at this university?\",\"options\":[{\"1\":\"Extremely well\"},{\"2\":\"Very well\"}]},{\"type\":\"single\",\"question\":\"How effective is the teaching outside yur major at the univesrity?\",\"options\":[{\"1\":\"Extremetly effective\"},{\"2\":\"Very effective\"},{\"3\":\"Somewhat effective\"},{\"4\":\"Not so effective\"},{\"5\":\"Not at all effective\"}]}]}}";
        save_file(str);
        String show_json;
        String PATH=getExternalFilesDir(null)+"/sample.json";
        show_json=getFileFromeSD(PATH);

        //Read JSON file
        try {
            JSONObject rootObject = new JSONObject(show_json);
            JSONObject surveyObject = rootObject.getJSONObject("survey");
            String id = surveyObject.getString("id");
            String len = surveyObject.getString("len");
            JSONArray questionsArray = surveyObject.getJSONArray("questions");
            for(int i=0;i<questionsArray.length();i++){
                JSONObject questionsObject = questionsArray.getJSONObject(i);
                type[i]=questionsObject.getString("type");
                question[i]=questionsObject.getString("question");
                JSONArray optionsArray=questionsObject.getJSONArray("options");
                for(int j=0;j<optionsArray.length();j++){
                    String number = String.valueOf(j+1);
                    JSONObject optionsObject = optionsArray.getJSONObject(j);
                    answer[i][j] = optionsObject.toString();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //Organize the classes that have been read and display them on the interface
        String result="";
        //result=type[0];
        for(int i=0;question[i]!=null;i++){
            result+="("+type[i]+")"+question[i]+"\n";
            for(int j=0;answer[i][j]!=null;j++){
                questionnum[i]=j+1;
                result+=answer[i][j]+"\n";
            }
        }
    }

        //click choose
    public void choose(View view){
        if(question[flag]!=null) {
            if(flag1==0){
                for(int i=0;answer[flag][i]!=null;i++){
                    String temp;
                    temp="bt_"+(i+1);
                    switch (temp){
                        case "bt_1":
                            bt_1.setText(answer[0][i]);
                            bt_1.setVisibility(View.VISIBLE);
                            break;
                        case "bt_2":
                            bt_2.setText(answer[0][i]);
                            bt_2.setVisibility(View.VISIBLE);
                            break;
                        case "bt_3":
                            bt_3.setText(answer[0][i]);
                            bt_3.setVisibility(View.VISIBLE);
                            break;
                        case "bt_4":
                            bt_4.setText(answer[0][i]);
                            bt_4.setVisibility(View.VISIBLE);
                            break;
                        case "bt_5":
                            bt_5.setText(answer[0][i]);
                            bt_5.setVisibility(View.VISIBLE);
                            break;
                        case "bt_6":
                            bt_6.setText(answer[0][i]);
                            bt_6.setVisibility(View.VISIBLE);
                            break;
                        case "bt_7":
                            bt_7.setText(answer[0][i]);
                            bt_7.setVisibility(View.VISIBLE);
                            break;
                        case "bt_8":
                            bt_8.setText(answer[0][i]);
                            bt_8.setVisibility(View.VISIBLE);
                            break;
                        case "bt_9":
                            bt_9.setText(answer[0][i]);
                            bt_9.setVisibility(View.VISIBLE);
                            break;
                        case "bt_10":
                            bt_10.setText(answer[0][i]);
                            bt_10.setVisibility(View.VISIBLE);
                            break;
                    }
                }
                showquestion.setText(question[0]);
                bt_choose.setText("CHOOSE");
                flag1=1;
            }
            else {
                if(bt_1.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_1.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_2.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_2.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_3.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_3.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_4.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_4.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_5.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_5.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_6.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_6.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_7.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_7.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_8.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_8.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_9.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_9.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                if(bt_10.isChecked()){
                    flag+=1;
                    save_data += "question" + flag + ":" + bt_10.getText().toString() + "\n";
                    tv_show_answer.setText(save_data);
                }
                showquestion.setText(question[flag]);
                for(int i=0;answer[flag][i]!=null;i++){
                    String temp;
                    temp="bt_"+(i+1);
                    switch (temp){
                        case "bt_1":
                            bt_1.setText(answer[flag][i]);
                            bt_1.setVisibility(View.VISIBLE);
                            break;
                        case "bt_2":
                            bt_2.setText(answer[flag][i]);
                            bt_2.setVisibility(View.VISIBLE);
                            break;
                        case "bt_3":
                            bt_3.setText(answer[flag][i]);
                            bt_3.setVisibility(View.VISIBLE);
                            break;
                        case "bt_4":
                            bt_4.setText(answer[flag][i]);
                            bt_4.setVisibility(View.VISIBLE);
                            break;
                        case "bt_5":
                            bt_5.setText(answer[flag][i]);
                            bt_5.setVisibility(View.VISIBLE);
                            break;
                        case "bt_6":
                            bt_6.setText(answer[flag][i]);
                            bt_6.setVisibility(View.VISIBLE);
                            break;
                        case "bt_7":
                            bt_7.setText(answer[flag][i]);
                            bt_7.setVisibility(View.VISIBLE);
                            break;
                        case "bt_8":
                            bt_8.setText(answer[flag][i]);
                            bt_8.setVisibility(View.VISIBLE);
                            break;
                        case "bt_9":
                            bt_9.setText(answer[flag][i]);
                            bt_9.setVisibility(View.VISIBLE);
                            break;
                        case "bt_10":
                            bt_10.setText(answer[flag][i]);
                            bt_10.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            }
            if(question[flag]== null){
                bt_choose.setText("save answer");
            }
        }else{
            //After answering the question, it will automatically become to save
            Toast.makeText(ShowJSON.this,"saving",Toast.LENGTH_SHORT).show();
            save_answer(save_data);
        }
    }

    //Store user answers
    private  void save_answer(String msg) {
        //I/O
        //get SDcard
        File sdFile = getExternalFilesDir(null);
        File saveData = new File(sdFile, "results.json");
        File saveData1 = new File(sdFile, "results.txt");
        File saveData_internal = new File(ShowJSON.this.getFilesDir(), "results.json");

        try {
            FileOutputStream fout1 = new FileOutputStream(saveData1,true);
            FileOutputStream fout = new FileOutputStream(saveData,true);
            FileOutputStream fout_internal = new FileOutputStream(saveData_internal,true);
            fout.write(msg.getBytes());
            //Log.v("Log",msg );
            fout.flush();
            fout.close();
            fout_internal.write(msg.getBytes());
            fout_internal.flush();
            fout_internal.close();
            fout1.write(msg.getBytes());
            fout1.flush();
            fout1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Store the JSON data to be read
    private  void save_file(String msg) {
        //I/O
        //get SDcard
        File sdFile = getExternalFilesDir(null);
        File saveData = new File(sdFile, "sample.json");
        File saveData_internal = new File(ShowJSON.this.getFilesDir(),"sample.json");

        try {
            FileOutputStream fout=new FileOutputStream(saveData);
            FileOutputStream fout_internal=new FileOutputStream(saveData_internal);
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

    //Read JSON file
    public String getFileFromeSD(String path){
        String result="";
        try{
            FileInputStream f = new FileInputStream(path);
            BufferedReader bis = new BufferedReader(new InputStreamReader(f));
            String line="";
            while((line = bis.readLine())!=null){
                result += line;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
