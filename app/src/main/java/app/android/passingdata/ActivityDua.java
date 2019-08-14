package app.android.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        Intent intent = getIntent();
        String hasilSempurna = intent.getStringExtra("hasil");

        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtHasil.setText(hasilSempurna);
    }
}
