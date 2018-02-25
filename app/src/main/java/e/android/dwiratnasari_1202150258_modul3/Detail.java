package e.android.dwiratnasari_1202150258_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {
    ImageView gambar, btr;
    TextView nama, detail, liter;
    int total = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setTitle("Detail Air");

        gambar = findViewById(R.id.gambar);
        nama = findViewById(R.id.detailNama);
        detail = findViewById(R.id.deskrip);
        liter = findViewById(R.id.lt);
        btr = findViewById(R.id.isi);

        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
        nama.setText(getIntent().getStringExtra("nama"));
        detail.setText(getIntent().getStringExtra("detail"));
        btr.setImageLevel(0);
    }

    public void minus(View view) {
        if (btr.getDrawable().getLevel() - 1 >= 0){
            total = total-2;
            liter.setText(total + "L");
            btr.setImageLevel(btr.getDrawable().getLevel() - 1);
        }else {
            btr.setImageLevel(0);
            Toast.makeText(this, "Hampir Habis", Toast.LENGTH_LONG).show();
        }
    }

    public void tambah(View view) {
        if(btr.getDrawable().getLevel() + 1 <=4){
            total = total+2;
            liter.setText(total + "L");
            btr.setImageLevel(btr.getDrawable().getLevel() + 1);
        }else {
            btr.setImageLevel(4);
            Toast.makeText(this, "Penuh", Toast.LENGTH_LONG).show();
        }
    }
}
