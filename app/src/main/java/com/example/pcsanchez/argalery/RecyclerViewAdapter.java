package com.example.pcsanchez.argalery;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Painting> mData;

    public RecyclerViewAdapter(Context mContext, List<Painting> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_painting,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        final int pos = i;
        myViewHolder.img_painting_thumbnail.setImageResource(mData.get(i).getPaint());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(mContext,Painting_Activity.class);
                myIntent.putExtra("Paint",mData.get(pos).getPaint());
                myIntent.putExtra("Proveedor",mData.get(pos).getProveedor());
                myIntent.putExtra("Precio",mData.get(pos).getPrecio());
                myIntent.putExtra("Descripcion",mData.get(pos).getDescripcion());
                myIntent.putExtra("Material",mData.get(pos).getMaterial());
                myIntent.putExtra("Largo",mData.get(pos).getLargo());
                myIntent.putExtra("Ancho",mData.get(pos).getAncho());
                mContext.startActivity(myIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img_painting_thumbnail;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img_painting_thumbnail = itemView.findViewById(R.id.painting_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
