package com.binh.englishapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null) {
            finish();
            return;
        }

        RelativeLayout btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });

        TextView textViewSwitchToLogin = findViewById(R.id.tvSwitchToLogin);
        textViewSwitchToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToLogin();
            }
        });
    }

    private void registerUser() {
        EditText etFirstName = findViewById(R.id.etFirstName);
        EditText etLastName = findViewById(R.id.etLastName);
        EditText etRegisterEmail = findViewById(R.id.etRegisterEmail);
        EditText etRegisterPassword = findViewById(R.id.etRegisterPassword);

        String firstName = etFirstName.getText().toString();
        String lastName = etLastName.getText().toString();
        String email = etRegisterEmail.getText().toString();
        String password = etRegisterPassword.getText().toString();

        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            YeuCau();
            Toast.makeText(this, "Hãy nhập đầy đủ thông tin bạn nhé!", Toast.LENGTH_LONG).show();
            return;
        }
        if (password.length()<6) {
            checkPass();
            Toast.makeText(this, "Mật khẩu phải hơn 6 kí tự!", Toast.LENGTH_LONG).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                            if (task.isSuccessful()) {
                                User user = new User(firstName, lastName, email);
                                FirebaseDatabase.getInstance().getReference("users")
                                        .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                        .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        showMainActivity();
                                    }
                                });
                            } else {
                                TonTai();
                                Toast.makeText(RegisterActivity.this, "Đăng ký thất bại.",
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                        else{
                            checkEmail();
                            Toast.makeText(RegisterActivity.this, "Email không hợp lệ",
                                    Toast.LENGTH_LONG).show();
                        }

                    }
                });

    }

    private void showMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void switchToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
    private void YeuCau(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Đăng ký thất bại");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Yêu cầu nhập đầy đủ thông tin");
        AlertDialog.setNegativeButton("Thử lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Intent intent = new Intent(LoginActivity.this, LoginActivity.class);
                //startActivity(intent);
            }
        });
        AlertDialog.show();
    }
    private void TonTai(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Đăng ký thất bại");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Tài khoản đã tồn tại");
        AlertDialog.setNegativeButton("Đăng nhập", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        AlertDialog.show();
    }
    private void checkPass(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Đăng ký thất bại");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Mật khẩu phải ít nhất 6 kí tự");
        AlertDialog.setNegativeButton("Thử lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog.show();
    }
    private void checkEmail(){
        AlertDialog.Builder AlertDialog = new AlertDialog.Builder(this);
        AlertDialog.setTitle("Đăng ký thất bại");
        AlertDialog.setIcon(R.drawable.ic_baseline_error_24);
        AlertDialog.setMessage("Email không hợp lệ");
        AlertDialog.setNegativeButton("Thử lại", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog.show();
    }
}































