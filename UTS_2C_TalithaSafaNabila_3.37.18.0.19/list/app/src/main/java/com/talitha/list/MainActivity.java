package com.talitha.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvWanita;
    private ArrayList<Wanita> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item_about){
            startActivity(new Intent(this, aboutme.class));
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Wanita Berpengaruh Di Dunia");
        }

        rvWanita = findViewById(R.id.rv_wanita);
        rvWanita.setHasFixedSize(true);

        list.addAll(WanitaData.getListData());
        showRecycleList();
    }
    private void showRecycleList(){
        rvWanita.setLayoutManager(new LinearLayoutManager(this));
        CardWanitaDunia cardWanitaDunia = new CardWanitaDunia(this, list);
        rvWanita.setAdapter(cardWanitaDunia);
    }
}
