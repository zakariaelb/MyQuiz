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

    public void DisplayResult(View view) {
        // Toast.makeText(this, "Is clicked", Toast.LENGTH_SHORT).show();
        CheckBox AnswerONEQ1 = (CheckBox) findViewById(R.id.checkBox1);
        boolean B1Q1A1 = AnswerONEQ1.isChecked();
        Log.v("MainQuiz", "" + B1Q1A1);
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

