package com.genericplanet.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static int i=0;
    static int j=0;
    static String[] question={"What is the extension of java class file?"
            ,"Every app has a activity named as? ",
            "Version controller name is?"};
    static String correctans;
    static String correct[]={".java","main activity","git"};
    static String options[][]= {{".java",".exe",".txt","non of the above"},
            {"real activity","main activity","app activity","none of the above"},
            {"vcs","git","github","git lab"}};

    public TextView questions;
   public Button option1;
    public Button option2;
    public Button option4;
    public Button option3;
    public TextView msg;
    public TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questions=findViewById(R.id.main_question);
        option1=findViewById(R.id.option1);
        option1.setOnClickListener(this);
        option2=findViewById(R.id.option2);
        option2.setOnClickListener(this);
        option3=findViewById(R.id.option3);
        option3.setOnClickListener(this);
        option4=findViewById(R.id.option4);
        option4.setOnClickListener(this);
        msg=findViewById(R.id.Final_Message);
        score=findViewById(R.id.final_score);
        msg.setVisibility(View.INVISIBLE);
        score.setVisibility(View.INVISIBLE);
        setquiz();
    }

    private void setquiz()
    {
        questions.setText(question[i]);
            option1.setText(options[i][0]);
            option2.setText(options[i][1]);
            option3.setText(options[i][2]);
            option4.setText(options[i][3]);
            correctans=correct[i];

    }
    public void endgame()
    {
            questions.setVisibility(View.INVISIBLE);
            option1.setVisibility(View.INVISIBLE);
            option2.setVisibility(View.INVISIBLE);
            option3.setVisibility(View.INVISIBLE);
            option4.setVisibility(View.INVISIBLE);
            msg.setText("Game Ended Your Final Score is: ");
            score.setText("Score: "+j);
            msg.setVisibility(View.VISIBLE);
            score.setVisibility(View.VISIBLE);

    }
    @Override
    public void onClick(View view) {
           switch (view.getId())
           {
               case R.id.option1:
                   if(option1.getText()==correctans)
                   {
                       Toast.makeText(this, "Correct Ans", Toast.LENGTH_SHORT).show();
                        i++;
                        j++;
                        if(i<3)
                        setquiz();
                        else
                            endgame();
                   }
                   else
                   {
                       Toast.makeText(this, "Wrong Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();
                   }
                   break;
               case R.id.option2:
                   if(option2.getText()==correctans)
                   {
                       Toast.makeText(this, "Correct Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       j++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();
                   }
                   else
                   {
                       Toast.makeText(this, "Wrong Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();
                   }
                   break;
               case R.id.option3:
                   if(option3.getText()==correctans)
                   {
                       Toast.makeText(this, "Correct Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       j++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();
                   }
                   else
                   {
                       Toast.makeText(this, "Wrong Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();

                   }
                   break;
               case R.id.option4:
                   if(option4.getText()==correctans)
                   {
                       Toast.makeText(this, "Correct Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       j++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();
                   }
                   else
                   {
                       Toast.makeText(this, "Wrong Ans", Toast.LENGTH_SHORT).show();
                       i++;
                       if(i<3)
                       setquiz();
                       else
                           endgame();

                   }
                   break;

           }
  }
}
