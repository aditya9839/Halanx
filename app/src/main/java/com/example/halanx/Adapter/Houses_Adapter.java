package com.example.halanx.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.halanx.HouseDetails;
import com.example.halanx.R;

import java.util.List;

public class Houses_Adapter extends RecyclerView.Adapter<Houses_Adapter.HouseViewHolder> {

    private Context mCtx;
    private List<Houses> friendsList;


    Houses_Adapter(Context mCtx, List<Houses> friendsList) {
        this.mCtx = mCtx;
        this.friendsList = friendsList;
    }

    @NonNull
    @Override
    public HouseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.card2, null);
        return new HouseViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull HouseViewHolder holder, int position) {
        Houses friends = friendsList.get(position);
        holder.price.setText("Rs "+friends.getPrice()+"");
        holder.mbed.setText(friends.getMbed()+" BHK");
        holder.mstreet_address.setText(friends.getStreet_address());
        holder.mfurnished.setText(friends.getFurnish_type());
        holder.maccmodation.setText("Accomodation: "+friends.getAccommodations());
        holder.marea.setText("Area: "+friends.getArea());

        //            holder.imageView.setBackground(mCtx.getResources().getDrawable(friends.getImage(), null));
    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }

    class HouseViewHolder extends RecyclerView.ViewHolder {

        private Context context;

        ImageView imageView;
        TextView price,marea,mbed,mstreet_address,mfurnished,maccmodation;

        HouseViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            imageView = itemView.findViewById(R.id.imageView);
            price = itemView.findViewById(R.id.textViewTitle);
            mbed = itemView.findViewById(R.id.bed);
            mstreet_address = itemView.findViewById(R.id.address);
            mfurnished = itemView.findViewById(R.id.furnished);
            marea= itemView.findViewById(R.id.area);
            maccmodation= itemView.findViewById(R.id.accommodations);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, HouseDetails.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });
        }
    }
}
