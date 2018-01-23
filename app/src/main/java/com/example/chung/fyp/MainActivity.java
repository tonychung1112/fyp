package com.example.chung.fyp;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override-
                public void onClick(View view){     // create the login form

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);

                View mView = getLayoutInflater().inflate(R.layout.login, null);
                final EditText username = (EditText) mView.findViewById(R.id.username);
                final EditText password = (EditText) mView.findViewById(R.id.password);
                Button mLogin = (Button) mView.findViewById(R.id.btnLogin);

                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                            Toast.makeText(MainActivity.this,
                                    R.string.success_login_msg
                                    , Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(MainActivity.this,
                                    R.string.login_fail_msg,
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        Button resg = (Button) findViewById(R.id.btn_resg);
        resg.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){     // create the login form

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);

                View mView = getLayoutInflater().inflate(R.layout.login, null);
                final EditText username = (EditText) mView.findViewById(R.id.username);
                final EditText password = (EditText) mView.findViewById(R.id.password);
                Button mLogin = (Button) mView.findViewById(R.id.btnLogin);

                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                            Toast.makeText(MainActivity.this,
                                    R.string.success_login_msg
                                    , Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(MainActivity.this,
                                    R.string.login_fail_msg,
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

    }


}