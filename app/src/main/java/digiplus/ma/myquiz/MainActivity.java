package digiplus.ma.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button, Start, Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Submit(View view) {
        // Get use name
        EditText nameField = (EditText) findViewById(R.id.Name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        //CheckBox One
        CheckBox AnswerONE = (CheckBox) findViewById(R.id.CheckOne);
        boolean OneIsChecked = AnswerONE.isChecked();

        //CheckBox Tow
        CheckBox AnswerTOW = (CheckBox) findViewById(R.id.CheckTow);
        boolean TowIsChecked = AnswerTOW.isChecked();

        //*************
        String AreaONEMsg = DisplayAreaONE(name, OneIsChecked, TowIsChecked);
        DisplayAreaONE(AreaONEMsg);
        button = findViewById(R.id.Submit);
                button.setVisibility(View.GONE);
        Start = findViewById(R.id.Start);
                Start.setVisibility(View.VISIBLE);
        Cancel = findViewById(R.id.Cancel);
                Cancel.setVisibility(View.VISIBLE);
    }

    private void DisplayAreaONE(String AreaONEMsg) {
        TextView AreaONE = (TextView) findViewById(R.id.TextArea1);
        AreaONE.setText(AreaONEMsg);
    }
    private String DisplayAreaONE(String name, boolean OneIsChecked, Boolean TowIsChecked) {
        String AreaMessage = getString(R.string.Welcome ,name);
        //AreaMessage += "\n 1" + (OneIsChecked);
        //AreaMessage += "\n 2" + (TowIsChecked);
        return AreaMessage;
    }
}
