package wildcodeschool.fr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView firstname = findViewById(R.id.firstname);
                TextView lastname = findViewById(R.id.lastname);


                Toast.makeText(MainActivity.this, "Congratulations " + firstname.getText() + " " + lastname.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
