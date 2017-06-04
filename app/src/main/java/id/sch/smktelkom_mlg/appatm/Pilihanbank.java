package id.sch.smktelkom_mlg.appatm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pilihanbank extends AppCompatActivity {
    int tab =100000;

    Button btnceksaldo, btntarik, btnsetor,btntransfer, btnexit;
    TextView saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanbank);
        btnceksaldo = (Button)findViewById(R.id.btnceksaldo);
        btnsetor = (Button)findViewById(R.id.btnsetor);
        btntarik = (Button)findViewById(R.id.btntarik);
        btntransfer = (Button)findViewById(R.id.btntransfer);
        saldo = (TextView)findViewById(R.id.txtsaldo);

        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Pilihanbank.this, Penarikan.class);
                startActivity(i);
            }
        });
        btnsetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Pilihanbank.this, Penyetoran.class);
                startActivity(i);
            }
        });
        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Pilihanbank.this, Transfer.class);
                startActivity(i);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}