package com.example.tts_progmob;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CrudKRS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_update_data_atkul);

        setTitle("ADMIN-KELOLA KRS");

        Button simpanButton = (Button) findViewById(R.id.btnSimpanKrs);
        simpanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CrudKRS.this);
                builder.setMessage("Apakah ingin menyimpan data?").setNegativeButton("BATAL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(CrudKRS.this,"Tidak jadi menyimpan", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                Intent intent = new Intent(CrudKRS.this, HomeScreenAdmin.class);
                                startActivity(intent);
                                Toast.makeText(CrudKRS.this, "Berhasil Menyimpan", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}

