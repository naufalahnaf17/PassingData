package app.android.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.nio.file.Files;

public class ActivityObject extends AppCompatActivity {

    public static final String EXTRA_PERSON="naufal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);
        TextView txtObject = (TextView) findViewById(R.id.txtObject);
        Person mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Nama " + mPerson.getName() + "Email " + mPerson.getEmail() + "City " + mPerson.getCity() + "Age" + mPerson.getAge();
        txtObject.setText(text);
    }
}
