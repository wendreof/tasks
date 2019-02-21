package com.devmasterteam.tasks.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.devmasterteam.tasks.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inicializa elementos
        this.mViewHolder.editEmail = (EditText) this.findViewById(R.id.edit_email);
        this.mViewHolder.editPassword = (EditText) this.findViewById(R.id.edit_password);
        this.mViewHolder.buttonLogin = (Button) this.findViewById(R.id.button_login);
        this.mViewHolder.textRegister = (TextView) this.findViewById(R.id.text_register);

        // Inicializa eventos
        this.mViewHolder.buttonLogin.setOnClickListener(this);
        this.mViewHolder.textRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_login) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (id == R.id.text_register) {
            startActivity(new Intent(this, RegisterActivity.class));
        }
    }

    /**
     * ViewHolder
     */
    private static class ViewHolder {
        private EditText editEmail;
        private EditText editPassword;
        private Button buttonLogin;
        private TextView textRegister;
    }
}
