package practice.arifhasnat.recyclerwithmodeldata.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import practice.arifhasnat.recyclerwithmodeldata.Model.ItemData;
import practice.arifhasnat.recyclerwithmodeldata.R;

/**
 * Created by Arif hasnat on 3/24/2016.
 */
public class AdapterForRecyler extends RecyclerView.Adapter<AdapterForRecyler.ViewData> {

    private ItemData[] itemDatas;

    public AdapterForRecyler(ItemData[] itemDatas) {
        this.itemDatas = itemDatas;
    }

    @Override
    public ViewData onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout, null);
        ViewData viewData = new ViewData(itemLayoutView);
        return viewData;
    }

    @Override
    public void onBindViewHolder(ViewData holder, int position) {

        holder.imageView.setImageResource(itemDatas[position].getImageUrl());
        holder.textView.setText(itemDatas[position].getTitle());
    }

    @Override
    public int getItemCount() {
        return itemDatas.length;
    }

    public class ViewData extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public ViewData(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textview);
        }
    }
}
