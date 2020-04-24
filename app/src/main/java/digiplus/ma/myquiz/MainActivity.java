package digiplus.ma.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        //CheckBox one
        CheckBox AnswerONE = (CheckBox) findViewById(R.id.CheckOne);
        boolean Checked = AnswerONE.isChecked();
        String AreaONEMsg = DisplayAreaONE(name, Checked);
        DisplayAreaONE(AreaONEMsg);
    }

    private void DisplayAreaONE(String AreaONEMsg) {
        TextView AreaONE = (TextView) findViewById(R.id.TextArea1);
        AreaONE.setText(AreaONEMsg);
    }
    private String DisplayAreaONE(String name, boolean Checked) {
        String AreaMessage = (name);
        AreaMessage += "\n" + (Checked);
        return AreaMessage;
    }
}
