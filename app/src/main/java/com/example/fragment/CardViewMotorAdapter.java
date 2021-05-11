package com.example.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMotorAdapter extends RecyclerView.Adapter<CardViewMotorAdapter.CardViewViewHolder> {
    private ArrayList<MotorModel> listMotor;
    Context context;

    public CardViewMotorAdapter(ArrayList<MotorModel> list, Context context) {
        this.listMotor = list;
        this.context = context;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viwType) {
       // LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_motor,viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        MotorModel motorModel = listMotor.get(position);

        Glide.with(holder.itemView.getContext())
                .load(motorModel.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(motorModel.getName());
        holder.tvDetail.setText(motorModel.getDetail());
        holder.imgPhoto.setImageResource(motorModel.getPhoto());


        holder.btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previewIntent = new Intent(context, PreviewActivity.class);
                previewIntent.putExtra(PreviewActivity.EXTRA_NAME, listMotor.get(holder.getAdapterPosition()).getName());
                previewIntent.putExtra(PreviewActivity.EXTRA_DETAIL,listMotor.get(holder.getAdapterPosition()).getDetail());
                previewIntent.putExtra(PreviewActivity.EXTRA_IMAGES, listMotor.get(holder.getAdapterPosition()).getPhoto());
                context.startActivity(previewIntent);
            }
        });
    }

    @Override
    public int getItemCount() { return listMotor.size();}

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button  btnPreview;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnPreview = itemView.findViewById(R.id.btn_set_preview);
        }
    }
}
