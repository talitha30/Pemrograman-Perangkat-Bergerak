package com.talitha.list;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardWanitaDunia extends RecyclerView.Adapter <CardWanitaDunia.ListViewHolder>{
    private ArrayList<Wanita> listWanita;
    private Context context;

    public CardWanitaDunia(Context context, ArrayList<Wanita> listwanita){
        this.listWanita = listwanita;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_wanita, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position){
            final Wanita wanita = listWanita.get(position);
            Glide.with(holder.itemView.getContext())
                    .load(wanita.getPhoto())
                    .apply((new RequestOptions().fitCenter()))
                    .into((holder.imgPhoto));

            holder.tvName.setText(wanita.getName());
            holder.tvDesc.setText(wanita.getDescription());

            holder.cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailListWanita.class);
                    intent.putExtra("wanita_id", wanita.getId());
                    context.startActivity(intent);

                }
            });
        }
    @Override
    public int getItemCount() {
        return listWanita.size();}
    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_wanita_list);
            tvName = itemView.findViewById(R.id.nama_wanita_list);
            tvDesc = itemView.findViewById(R.id.desc_wanita_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}