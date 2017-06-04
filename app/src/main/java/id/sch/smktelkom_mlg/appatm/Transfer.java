package id.sch.smktelkom_mlg.appatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Transfer extends AppCompatActivity {
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnok,btndel;
    EditText edittf,editsaldo;
    String tarik = "";
    int temp;
    int tab =100000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penarikan);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btndel = (Button)findViewById(R.id.btndel);
        btnok = (Button)findViewById(R.id.btnok);
        edittf = (EditText)findViewById(R.id.edittransfer);
        editsaldo = (EditText)findViewById(R.id.editsaldo);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "0";
                edittf.setText(tarik);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "1";
                edittf.setText(tarik);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "2";
                edittf.setText(tarik);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "3";
                edittf.setText(tarik);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "4";
                edittf.setText(tarik);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "5";
                edittf.setText(tarik);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "6";
                edittf.setText(tarik);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "7";
                edittf.setText(tarik);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "8";
                edittf.setText(tarik);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "9";
                edittf.setText(tarik);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik = "";
                edittf.setText(tarik);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (edittf.equals("")) {
                    edittf.setError("Masukkan Jumlah Transfer Dengan Benar!");
                    valid =(false);
                } else {
                    int e = Integer.parseInt(tarik);
                    if(e > tab){
                        edittf.setError("Saldo Anda tidak mencukupi");
                        valid =(false);
                    } else {
                        isi(e);
                    }
                }
            }
        });
    }
    private void isi(int uang) {
        int tab =100000;
        int h1 = Integer.parseInt(String.valueOf(edittf.getText()));
        int x = tab-h1;
        editsaldo.setText(String.valueOf(x));
    }
}
