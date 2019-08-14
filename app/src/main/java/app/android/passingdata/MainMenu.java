package app.android.passingdata;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    public static int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button btnNormal = (Button) findViewById(R.id.intentNormal);
        Button btnWithData = (Button) findViewById(R.id.intentWithData);
        Button btnWithImplicit = (Button) findViewById(R.id.intentWithImplicit);
        Button btnWithObject = (Button) findViewById(R.id.intentWithObject);
        Button btnWithResult = (Button) findViewById(R.id.intentWithResult);


        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnWithData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnWithObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person mPerson = new Person();
                mPerson.setName("Naufal Ahnaf");
                mPerson.setAge(21);
                mPerson.setCity("Bandung");
                mPerson.setEmail("naufalahnaf37@gmail.com");
                Intent intent = new Intent(MainMenu.this,ActivityObject.class);
                intent.putExtra(ActivityObject.EXTRA_PERSON , mPerson);
                startActivity(intent);
            }
        });

        btnWithImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone="082116102109";
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel :"+phone));
                startActivity(intent);
            }
        });

        btnWithResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,ActivityResultData.class);
                startActivityForResult(intent , REQUEST_CODE);
            }
        });

    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }
}
