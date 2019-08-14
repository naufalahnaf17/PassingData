package app.android.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText eInput = (EditText)findViewById(R.id.txtInput);
        Button btnOK = (Button) findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hasil = eInput.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this,ActivityDua.class);
                intent.putExtra("hasil" , hasil);
                startActivity(intent);
            }
        });
    }
}
