package in.codesource.android.getting_started.editabletextfield;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button submit;
    EditText nameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submitButton);
        nameField = (EditText) findViewById(R.id.nameEditText);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String disp = "Hi " + nameField.getText().toString() + "!";
                Toast.makeText(getApplicationContext(), disp, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
