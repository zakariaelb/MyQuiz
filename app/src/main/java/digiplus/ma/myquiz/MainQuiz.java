package digiplus.ma.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainQuiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
    }

    //Check Answers
    private void CheckAnswer() {
        int A = 0;
        int B = 0;
        int C = 0;
        //
        int D = 0;
        int E = 0;
        int F = 0;
        //
        int G = 0;
        int H = 0;
        int I = 0;
        //
        int J = 0;
        int K = 0;
        int L = 0;

        int Answer1 = 0;
        CheckBox AnswerONEQ1 = (CheckBox) findViewById(R.id.checkBox1);
        boolean B1Q1A1 = AnswerONEQ1.isChecked();
        int z = B1Q1A1 ? 1 : 0;
        if (z == 1) {
            A = 1;
        }
        if (z == 0) {
            A = 0;
        }
        CheckBox AnswerTWOQ1 = (CheckBox) findViewById(R.id.checkBox2);
        boolean B1Q1A2 = AnswerTWOQ1.isChecked();
        int y = B1Q1A2 ? 1 : 0;
        if (y == 1) {
            B = 10;
        }
        if (y == 0) {
            B = 0;
        }

        CheckBox AnswerThreeQ1 = (CheckBox) findViewById(R.id.checkBox3);
        boolean B1Q1A3 = AnswerThreeQ1.isChecked();
        int x = B1Q1A3 ? 1 : 0;
        if (x == 1) {
            C = 1;
        }
        if (x == 0) {
            C = 0;
        }

        int Score = (A + B + C);
        if (Score == 10) {
            Answer1 = 1;
        }
        //Anser2

        int Answer2 = 0;
        CheckBox AnswerONEQ2 = (CheckBox) findViewById(R.id.checkBox4);
        boolean B1Q2A1 = AnswerONEQ2.isChecked();
        int w = B1Q2A1 ? 1 : 0;
        if (w == 1) {
            D = 1;
        }
        if (w == 0) {
            D = 0;
        }
        CheckBox AnswerTWOQ2 = (CheckBox) findViewById(R.id.checkBox5);
        boolean B1Q2A2 = AnswerTWOQ2.isChecked();
        int v = B1Q2A2 ? 1 : 0;
        if (v == 1) {
            E = 10;
        }
        if (v == 0) {
            E = 0;
        }

        CheckBox AnswerThreeQ2 = (CheckBox) findViewById(R.id.checkBox6);
        boolean B1Q2A3 = AnswerThreeQ2.isChecked();
        int u = B1Q2A3 ? 1 : 0;
        if (u == 1) {
            F = 1;
        }
        if (u == 0) {
            F = 0;
        }

        int Score2 = (D + E + F);
        if (Score2 == 10) {
            Answer2 = 1;
        }
        //Answer3
        int Answer3 = 0;
        CheckBox AnswerONEQ3 = (CheckBox) findViewById(R.id.checkBox7);
        boolean B1Q3A1 = AnswerONEQ3.isChecked();
        int t = B1Q3A1 ? 1 : 0;
        if (t == 1) {
            G = 1;
        }
        if (t == 0) {
            G = 0;
        }
        CheckBox AnswerTWOQ3 = (CheckBox) findViewById(R.id.checkBox8);
        boolean B1Q3A2 = AnswerTWOQ3.isChecked();
        int s = B1Q3A2 ? 1 : 0;
        if (s == 1) {
            H = 10;
        }
        if (s == 0) {
            H = 0;
        }

        CheckBox AnswerThreeQ3 = (CheckBox) findViewById(R.id.checkBox9);
        boolean B1Q3A3 = AnswerThreeQ3.isChecked();
        int r = B1Q3A3 ? 1 : 0;
        if (r == 1) {
            I = 1;
        }
        if (r == 0) {
            I = 0;
        }

        int Score3 = (G + H + I);
        if (Score3 == 10) {
            Answer3 = 1;
        }
        //Answer4
        int Answer4 = 0;
        CheckBox AnswerONEQ4 = (CheckBox) findViewById(R.id.checkBox10);
        boolean B1Q4A1 = AnswerONEQ4.isChecked();
        int p = B1Q4A1 ? 1 : 0;
        if (p == 1) {
            J = 10;
        }
        if (p == 0) {
            J = 0;
        }
        CheckBox AnswerTWOQ4 = (CheckBox) findViewById(R.id.checkBox11);
        boolean B1Q4A2 = AnswerTWOQ4.isChecked();
        int q = B1Q4A2 ? 1 : 0;
        if (q == 1) {
            K = 1;
        }
        if (q == 0) {
            K = 0;
        }

        CheckBox AnswerThreeQ4 = (CheckBox) findViewById(R.id.checkBox12);
        boolean B1Q4A3 = AnswerThreeQ4.isChecked();
        int o = B1Q4A3 ? 1 : 0;
        if (o == 1) {
            L = 1;
        }
        if (o == 0) {
            L = 0;
        }

        int Score4 = (J + K + L);
        if (Score4 == 10) {
            Answer4 = 1;
        }
        int TotalPoint = (Answer1 + Answer2 + Answer3 + Answer4);
        if (TotalPoint == 4) {
            Toast.makeText(this, "Bravo !", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Try Again !", Toast.LENGTH_SHORT).show();
        }
        //Log.v("Main", ""+ TotalPoint);
    }

    public void DisplayResult(View view) {
        CheckAnswer();
    }

    private int ResulatRecap(int TotalPoint) {
        int Message = TotalPoint;
        return Message;
    }

    private void displayResult(int message) {
        TextView displayResultF = (TextView) findViewById(R.id.DisplayResultArea);
        displayResultF.setText(message);
    }

    }

