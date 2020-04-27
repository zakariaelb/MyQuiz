package digiplus.ma.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainQuiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
    }
    //Check Answers
    private void CheckAnswer(){
        int A = 0;
        int B = 0;
        int C = 0;
        int Answer1 = 0;
        CheckBox AnswerONEQ1 = (CheckBox) findViewById(R.id.checkBox1);
        boolean B1Q1A1 = AnswerONEQ1.isChecked();
        int z = B1Q1A1 ? 1 : 0;
        if (z == 1 ) {
            A = 10;
        }
        if (z == 0){
            A = 0;}
        CheckBox AnswerTWOQ1 = (CheckBox) findViewById(R.id.checkBox2);
        boolean B1Q1A2 = AnswerTWOQ1.isChecked();
        int y = B1Q1A2 ? 1 : 0;
        if (y == 1 ) {
            B = 1;
        }
        if (y == 0){
            B = 0;}

        CheckBox AnswerThreeQ1 = (CheckBox) findViewById(R.id.checkBox3);
        boolean B1Q1A3 = AnswerThreeQ1.isChecked();
        int x = B1Q1A3 ? 1 : 0;
        if (x == 1 ) {
            C = 1;
        }
        if (x == 0){
            C = 0;}

        int Score = (A + B + C);
        if (Score == 10){
            Answer1 = 1;
        }
        Log.v("Main", ""+ Score + ":" + Answer1);

    }
    public void DisplayResult(View view) {
        // Toast.makeText(this, "Is clicked", Toast.LENGTH_SHORT).show();
        CheckAnswer();
        return;
        // boolean msg = ResultDisplayArea(B1Q1A1);
        // ResultDisplayArea(msg);
    }


            // private void ResultDisplayArea(boolean msg) {
           // TextView RArea = (TextView) findViewById(R.id.DisplayResultArea);
          //  RArea.setText(msg);
     //   }
/**
    //CheckBox Answer one q1
    CheckBox AnswerONEQ1 = (CheckBox) findViewById(R.id.checkBox1);
    boolean B1Q1A1 = AnswerONEQ1.isChecked();

    // ++++++++++++++++++++++++++++++++++

    private boolean ResultDisplayArea(boolean B1Q1A1) {
        boolean AreaMessage = B1Q1A1;
        return AreaMessage;
    }
    // ++++++++++++++++++++++++++++++++++

    // ++++++++++++++++++++++++++++++++++

    private void ResultDisplayArea(String AreaONEMsg) {
        TextView RArea = findViewById(R.id.DisplayResultArea);
        RArea.setText(AreaONEMsg);
    }
*/
}

