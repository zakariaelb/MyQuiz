package digiplus.ma.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
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
        // Log.v("MainActivity","User Name : ", + name);
        DisplayAreaONE(name);
    }

    private void DisplayAreaONE(String Name_) {
        TextView AreaONE = (TextView) findViewById(R.id.TextArea1);
        AreaONE.setText(Name_);
    }
}
