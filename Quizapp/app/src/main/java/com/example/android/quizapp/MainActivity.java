package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.attr.button;
import static android.R.attr.duration;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {
    int n = 1;
    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //timer = new Timer();
        //    timer.schedule(new TimerTask() {
          //      @Override
            //    public void run() {
              //      TextView txt = (TextView) findViewById(R.id.getr);
                //    txt.setText("Get Ready For Quiz");
    //}}, 9000); // 600ms delay before the timer executes the „run“ method from TimerTask

        ques();
        }

    public void ques() {
        TextView tx = (TextView) findViewById(R.id.getr);
        tx.setText("");
        TextView txt = (TextView) findViewById(R.id.ques);
        if (n == 1) {
            txt.setText("why");
            ans1();
            ans2();
            ans3();
            ans4();
        }
        if (n == 2) {
            txt.setText("what");
            ans1();
            ans2();
            ans3();
            ans4();
        }
        if (n == 3) {
            txt.setText("when");
            ans1();
            ans2();
            ans3();
            ans4();
        }
        if (n == 4) {
            txt.setText("where");
            ans1();
            ans2();
            ans3();
            ans4();
        }
        if (n == 5) {
            txt.setText("how");
            ans1();
            ans2();
            ans3();
            ans4();
        }
        if (n == 6) {
            RelativeLayout lyt = (RelativeLayout) findViewById(R.id.Rel_Layout);
            lyt.removeAllViews();
            end();



        }
    }

    public void ans1() {
        Button btn = (Button) findViewById(R.id.ans1);

        if (n == 1) {
            btn.setText("2001");
        }
        if (n == 2) {
            btn.setText("2002");
        }
        if (n == 3) {
            btn.setText("2003");
        }
        if (n == 4) {
            btn.setText("2004");
        }
        if (n == 5) {
            btn.setText("2005");
        }
    }

    public void ans2() {
        Button btn = (Button) findViewById(R.id.ans2);

        if (n == 1) {
            btn.setText("2002");
        }
        if (n == 2) {
            btn.setText("2003");
        }
        if (n == 3) {
            btn.setText("2004");
        }
        if (n == 4) {
            btn.setText("2005");
        }
        if (n == 5) {
            btn.setText("2001");
        }
    }

    public void ans3() {

        Button btn = (Button) findViewById(R.id.ans3);

        if (n == 1) {
            btn.setText("2003");
        }
        if (n == 2) {
            btn.setText("2004");
        }
        if (n == 3) {
            btn.setText("2005");
        }
        if (n == 4) {
            btn.setText("2001");
        }
        if (n == 5) {
            btn.setText("2002");
        }
    }

    public void ans4() {
        Button btn = (Button) findViewById(R.id.ans4);

        if (n == 1) {
            btn.setText("2004");
        }
        if (n == 2) {
            btn.setText("2005");
        }
        if (n == 3) {
            btn.setText("2001");
        }
        if (n == 4) {
            btn.setText("2002");
        }
        if (n == 5) {
            btn.setText("2003");
        }
    }

    public void ans11(View view) {

        CharSequence text = "WrongAnswer!!";
        if (n == 5 || n == 3) {
            text = "CorrectAnswer!!";
        }
        Toast.makeText(MainActivity.this,
               text, Toast.LENGTH_LONG).show();
        n += 1;
        ques();
    }

    public void ans22(View view) {

        CharSequence text = "WrongAnswer!!";
        if (n == 1) {
            text = "CorrectAnswer!!";
        }
        Toast.makeText(MainActivity.this,
                text, Toast.LENGTH_LONG).show();
        n += 1;
        ques();
    }

    public void ans33(View view) {
        CharSequence text = "WrongAnswer!!";

        if (n == 2) {
            text = "CorrectAnswer!!";
        }
        Toast.makeText(MainActivity.this,text, Toast.LENGTH_LONG).show();
        n += 1;
        ques();
    }

    public void ans44(View view) {
        String text = "WrongAnswer!!";

        if (n == 4) {
            text = "CorrectAnswer!!";
        }
        Toast.makeText(MainActivity.this,
                text, Toast.LENGTH_LONG).show();
        n += 1;
        ques();
    }
    private void end(){
        set();
        TextView tx = (TextView) findViewById(R.id.get);
        tx.setText("Quiz Over");
    }
    public void set() {
        ImageView layout = (ImageView) findViewById(R.id.background);
        layout.setBackgroundResource(R.drawable.img);
    }
}