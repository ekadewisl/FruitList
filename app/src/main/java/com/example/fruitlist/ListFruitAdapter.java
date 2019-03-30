package com.example.fruitlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFruitAdapter extends RecyclerView.Adapter<ListFruitAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Fruit> listFruit;

    public ListFruitAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_fruit, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        categoryViewHolder.tvName.setText(getListFruit().get(i).getName());
        categoryViewHolder.tvComposition.setText(getListFruit().get(i).getComposition());
        Glide.with(context)
                .load(getListFruit().get(i).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return getListFruit().size();
    }

    public ArrayList<Fruit> getListFruit() {
        return listFruit;
    }

    public void setListFruit(ArrayList<Fruit> listFruit) {
        this.listFruit = listFruit;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvComposition;
        ImageView imgPhoto;
        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvComposition = itemView.findViewById(R.id.tv_item_composition);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }

}
