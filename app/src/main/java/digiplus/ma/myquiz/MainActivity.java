package digiplus.ma.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, Start, Cancel;
    EditText EditName;
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
    }

    public void Submit(View view) {
        // Get use name
        EditText nameField = (EditText) findViewById(R.id.Name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        int Radioid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(Radioid);
        //*************
        String AreaONEMsg = DisplayAreaONEE(name);
        DisplayAreaONE(AreaONEMsg);
        button = findViewById(R.id.Submit);
        button.setVisibility(View.GONE);
        Start = findViewById(R.id.Start);
        Start.setVisibility(View.VISIBLE);
        Cancel = findViewById(R.id.Cancel);
        Cancel.setVisibility(View.GONE);
    }

    private String DisplayAreaONEE(String name) {
        String AreaMessage = getString(R.string.Welcome, radioButton.getText() + name );
        return AreaMessage;
    }

    private void DisplayAreaONE(String AreaONEMsg) {
        TextView AreaONE = (TextView) findViewById(R.id.TextArea1);
        AreaONE.setText(AreaONEMsg);
    }

    public void Startbtn(View view) {
        EditName = findViewById(R.id.Name);
        EditName.setVisibility(View.GONE);
        String QuestionOne = getString(R.string.QuesionTitle) + "\n" + getString(R.string.point);
        DisplayAreaONE(QuestionOne);
        Start = findViewById(R.id.Start);
        Start.setVisibility(View.GONE);
        Cancel = findViewById(R.id.Cancel);
        Cancel.setVisibility(View.VISIBLE);
        radioButton = findViewById(R.id.RB1);
        radioButton.setVisibility(View.GONE);
        radioButton = findViewById(R.id.RB2);
        radioButton.setVisibility(View.GONE);

        }

    public void str(View view) {
        StartQuiz();
    }
    private void StartQuiz() {
        Intent intent = new Intent(this, MainQuiz.class);
        startActivity(intent);
    }
}


