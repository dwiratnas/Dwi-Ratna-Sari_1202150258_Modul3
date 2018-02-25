package e.android.dwiratnasari_1202150258_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    menuAdapter adapter;
    List<MemilihAir> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        setTitle("List Air"); //set title untuk screennya

        //untuk meng INIT kan recyclerview dan adapternya//
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(ListMenu.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(ListMenu.this, 1));
        }
        initdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(ListMenu.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(ListMenu.this, 1));
        }
    }

    private void initdata() {
        listmenu.add(new MemilihAir(R.drawable.ades, "Ades", "ini adalah air mineral merek Ades. \n"));
        listmenu.add(new MemilihAir(R.drawable.amidis, "Amidis", "ini adalah air mineral merek Amidis. \n"));
        listmenu.add(new MemilihAir(R.drawable.aqua, "Aqua", "ini adalah air mineral merek Aqua. \n"));
        listmenu.add(new MemilihAir(R.drawable.cleo, "Cleo", "ini adalah air mineral merek Cleo. \n"));
        listmenu.add(new MemilihAir(R.drawable.club, "Club", "ini adalah air mineral merek Club. \n"));
        listmenu.add(new MemilihAir(R.drawable.equil, "Equil", "ini adalah air mineral merek Equil. \n"));
        listmenu.add(new MemilihAir(R.drawable.evian, "Evian", "ini adalah air mineral merek Evian. \n"));
        listmenu.add(new MemilihAir(R.drawable.leminerale, "Le Minerale", "ini adalah air mineral merek Le Minerale. \n"));
        listmenu.add(new MemilihAir(R.drawable.nestle, "Nestle", "ini adalah air mineral merek Nestle. \n"));
        listmenu.add(new MemilihAir(R.drawable.pristine, "Pristine", "ini adalah air mineral merek Pristine. \n"));
        listmenu.add(new MemilihAir(R.drawable.vit, "Vit", "ini adalah air mineral merek VIT. \n"));
        adapter = new menuAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}
