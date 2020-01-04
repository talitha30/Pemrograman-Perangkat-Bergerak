package com.talitha.list;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListWanita extends AppCompatActivity {
    private int WanitaDunia_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Wanita> listwanita = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_wanita);

        WanitaDunia_id = getIntent().getIntExtra("wanita_id", 0);
        tvName = findViewById(R.id.nama_wanita);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listwanita.addAll(WanitaData.getListData());

        setLayout();
    }

    void setLayout(){
        tvName.setText(listwanita.get(WanitaDunia_id).getName());
        tvDesc.setText(listwanita.get(WanitaDunia_id).getDescription());
        Glide.with(this)
                .load(listwanita.get(WanitaDunia_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}