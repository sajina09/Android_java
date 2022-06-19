package com.example.calculator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<SimpleRecyclerViewAdapter.ViewHolder>{

    ArrayList<String> recyclerViewData ;

    SimpleRecyclerViewAdapter(ArrayList<String> players){
        recyclerViewData = players;
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
        holder.title.setText(recyclerViewData.get(position));
    }


    @Override
    public int getItemCount() {
        return recyclerViewData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textViewTitle);


        }
    }
}