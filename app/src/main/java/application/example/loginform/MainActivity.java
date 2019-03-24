package application.example.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity{

    Button LOGIN;
    EditText Email, password, phone, username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.pass);
        phone = (EditText) findViewById(R.id.phone);
        Email = (EditText) findViewById(R.id.mail);
        LOGIN = (Button) findViewById(R.id.button);
        LOGIN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String getText = Email.getText().toString();

                String pattern =

                        "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"

                                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"

                                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."

                                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"

                                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"

                                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";


                if (getText.matches(String.valueOf(pattern)) && getText.length() > 0) {

                    Email.setText("VALID");

                } else {

                    Email.setText("INVALID");

                }

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

        });

    }
}





