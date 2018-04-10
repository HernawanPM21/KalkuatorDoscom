package doscom.tugas.kalkuatordoscom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText tampil;
String isilayar,tombol;
Double angka1;
    Double angka2;
    Double hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampil = findViewById(R.id.ed_tampil);

    }

    public void btn_1(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"1");
    }

    public void btn_2(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"2");
    }

    public void btn_3(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"3");
    }

    public void btn_4(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"4");
    }

    public void btn_5(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"5");
    }

    public void btn_6(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"6");
    }

    public void btn_00(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"00");
    }

    public void btn_7(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"7");
    }

    public void btn_8(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"8");
    }

    public void btn_9(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"9");
    }

    public void btn_0(View view) {
        isilayar= tampil.getText().toString();
        tampil.setText(isilayar+"0");
    }

    public void btn_sama(View view) {
    if(tombol.equals("tambah")){
        angka2=Double.valueOf(tampil.getText().toString());
        hasil=angka1+angka2;
        tampil.setText(hasil.toString());
    }else if(tombol.equals("kurang")){
        angka2=Double.valueOf(tampil.getText().toString());
        hasil=angka1-angka2;
        tampil.setText(hasil.toString());

    }else if(tombol.equals("bagi")){
        angka2=Double.valueOf(tampil.getText().toString());
        hasil=angka1/angka2;
        tampil.setText(hasil.toString());

    }else if(tombol.equals("kali")){
        angka2=Double.valueOf(tampil.getText().toString());
        hasil=angka1*angka2;
        tampil.setText(hasil.toString());

    }
    }

    public void btn_tambah(View view) {
        angka1=Double.valueOf(tampil.getText().toString());
        tampil.setText("");
        tombol="tambah";
    }

    public void btn_kurang(View view) {
        angka1=Double.valueOf(tampil.getText().toString());
        tampil.setText("");
        tombol="kurang";
    }

    public void btn_bagi(View view) {
        angka1=Double.valueOf(tampil.getText().toString());
        tampil.setText("");
        tombol="bagi";
    }

    public void btn_kali(View view) {
        angka1=Double.valueOf(tampil.getText().toString());
        tampil.setText("");
        tombol="kali";
    }

    public void btn_persen(View view) {
        angka2=Double.valueOf(tampil.getText().toString())/100;
        isilayar= String.valueOf(angka2);
        tampil.setText(isilayar);


    }

    public void btn_pangkat(View view) {
        angka2=Double.valueOf(tampil.getText().toString())*Double.valueOf(tampil.getText().toString());
        isilayar= String.valueOf(angka2);
        tampil.setText(isilayar);
    }

    public void btn_Clear(View view) {
        angka2=0.0;
        angka1=0.0;
        tampil.setText("");
        isilayar="";
    }

    public void btn_Delete(View view) {
        isilayar=tampil.getText().toString().substring(0,tampil.getText().toString().length()-1);
        tampil.setText(isilayar);
    }

    public void btn_Titik(View view) {
        isilayar=tampil.getText().toString();
        tampil.setText(isilayar+".");
    }

    public void btn_Sin(View view) {
        angka2=Double.valueOf(tampil.getText().toString());
        double tranfor = Math.sin(angka2);

        isilayar= String.valueOf(tranfor);
        tampil.setText(isilayar);
    }

    public void btn_Tan(View view) {
        angka2=Double.valueOf(tampil.getText().toString());
        double tranfor = Math.tan(angka2);

        isilayar= String.valueOf(tranfor);
        tampil.setText(isilayar);
    }

    public void btn_Cos(View view) {
        angka2=Double.valueOf(tampil.getText().toString());
        double tranfor = Math.cos(angka2);

        isilayar= String.valueOf(tranfor);
        tampil.setText(isilayar);
    }
}
