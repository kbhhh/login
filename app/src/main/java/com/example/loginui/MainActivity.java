package com.example.loginui;

import com.example.loginui.R;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(view -> {
            String name = nameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (name.isEmpty() || password.isEmpty()) {
                Toast.makeText(MainActivity.this, "이름과 비밀번호를 모두 입력해주세요.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, name + "님 환영합니다", Toast.LENGTH_SHORT).show();
                // 실제 로그인 로직은 여기에 추가
            }
        });
    }
}