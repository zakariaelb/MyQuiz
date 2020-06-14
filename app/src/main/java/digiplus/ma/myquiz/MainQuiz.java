package digiplus.ma.myquiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainQuiz extends AppCompatActivity {

    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.checkBox1)
    CheckBox checkBox1;
    @BindView(R.id.checkBox2)
    CheckBox checkBox2;
    @BindView(R.id.checkBox3)
    CheckBox checkBox3;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.radioGroup2)
    RadioGroup radioGroup2;
    @BindView(R.id.True_RB)
    RadioButton TrueRB;
    @BindView(R.id.False_RB)
    RadioButton FalseRB;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.editTextAnswer3)
    EditText editTextAnswer3;
    @BindView(R.id.textViewAnswer4)
    TextView textViewAnswer4;
    @BindView(R.id.editTextAnswer4)
    EditText editTextAnswer4;
    @BindView(R.id.buttonSubmit)
    Button buttonSubmit;
    @BindView(R.id.Exit)

    Button Exit;
    private int Check = 0;
    private Boolean Correct = false;
    private static final String TAG = "MainQuiz";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quiz);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.True_RB, R.id.False_RB})
    public void checkRr(View view) {
        switch (view.getId()) {
            case R.id.True_RB:
                Correct = true;
                break;
            case R.id.False_RB:
                Correct = false;
                break;
        }
    }

    @OnClick({R.id.checkBox1, R.id.checkBox2, R.id.checkBox3})
    public void checkBoxControler(View view) {
        Check = 0;
        if(checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked()){
            Check++;
        }
    }

    @OnClick(R.id.buttonSubmit)
    public void submit(View view) {
        score(total());
    }

    private void score(int Earned) {
        StringBuilder stringBuilder = new StringBuilder("Score : ");
        stringBuilder.append(Earned);
        stringBuilder.append("/4");
        //Display result ;
        Toast.makeText(getApplicationContext(),
                stringBuilder.toString(), Toast.LENGTH_LONG).show();
    }

    private int total() {
        int Points = 0;
        Points += Check;
        if (Correct)
            Points++;
        if (editTextAnswer3.getText().toString().equals(
                getResources().getString(R.string.question3_answer)))
            Points++;
        if (editTextAnswer4.getText().toString().equalsIgnoreCase(
                getResources().getString(R.string.question4_answer)))
            Points++;
        return Points;
    }

    @OnClick(R.id.Exit)
    public void exit(View view) {
        this.finish();
    }
}