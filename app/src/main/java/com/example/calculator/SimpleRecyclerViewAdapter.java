package com.example.calculator;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<SimpleRecyclerViewAdapter.ViewHolder>{

    ArrayList<SampleModel> meroData ;
    Context recyclerContext ;

    SimpleRecyclerViewAdapter(
            Context context,
            ArrayList<SampleModel> players){
        meroData = players;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//         attachToRoot false except for watch

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_simple_recycler,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.title.setText(recyclerViewData.get(position));

        holder.number.setText(Integer.toString( position+1));

        holder.name.setText(meroData.get(position).userName);
        holder.subtitle.setText(meroData.get(position).address);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDetails= new Intent(recyclerContext,DetailActivity.class);
                toDetails.putExtra(
                        "name",
                        meroData.get(position).userName
                );
                recyclerContext.startActivity(toDetails);
            }
        });
    }


    @Override
    public int getItemCount() {
        return meroData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView number , name, subtitle ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.recycleViewNumber);
            name = itemView.findViewById(R.id.recyclerViewName);
            subtitle = itemView.findViewById(R.id.recyclerViewSubtitle);
        }
    }
}