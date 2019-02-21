package com.devmasterteam.tasks.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.devmasterteam.tasks.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inicializa elementos
        this.mViewHolder.editName = (EditText) this.findViewById(R.id.edit_name);
        this.mViewHolder.editEmail = (EditText) this.findViewById(R.id.edit_email);
        this.mViewHolder.editPassword = (EditText) this.findViewById(R.id.edit_password);
        this.mViewHolder.buttonSave = (Button) this.findViewById(R.id.button_save);

        // Inicializa eventos
        this.mViewHolder.buttonSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.button_save) {
            // TODO
        }
    }

    /**
     * ViewHolder
     */
    private static class ViewHolder {
        private ImageView imageBack;
        private EditText editName;
        private EditText editEmail;
        private EditText editPassword;
        private Button buttonSave;
    }
}
