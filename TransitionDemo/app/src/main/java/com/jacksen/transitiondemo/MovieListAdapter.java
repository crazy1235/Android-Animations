package com.jacksen.transitiondemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jacksen on 2016/4/29.
 */
public class MovieListAdapter extends BaseRvAdapter<MovieBean> {

    private int heights[] = new int[]{500, 390, 420, 250, 350, 470};

//    private int imgIds[] = new int[]{R.drawable.chaijin, R.drawable.gongsunsheng, R.drawable.likui,
//            R.drawable.linchong, R.drawable.lujunyi, R.drawable.luzhishen, R.drawable.songjiang, R.drawable.wuyong, R.drawable.yangzhi};

    public MovieListAdapter(Context context, List<MovieBean> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_list, null);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) holder;

//        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) itemViewHolder.itemLayout.getLayoutParams();
        //params.height = heights[position % heights.length];
//        itemViewHolder.itemLayout.setLayoutParams(params);

        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) itemViewHolder.coverIv.getLayoutParams();
        params1.height = heights[position % heights.length];
        itemViewHolder.coverIv.setLayoutParams(params1);

//        itemViewHolder.coverIv.setImageResource(R.drawable.img1);
        itemViewHolder.titleTv.setText(list.get(position).getTitle());
    }


    private class ItemViewHolder extends RecyclerView.ViewHolder {

        public RelativeLayout itemLayout;
        public ImageView coverIv;
        public TextView titleTv;

        public ItemViewHolder(View itemView) {
            super(itemView);
            itemLayout = (RelativeLayout) itemView.findViewById(R.id.item_layout);
            coverIv = (ImageView) itemView.findViewById(R.id.item_cover_iv);
            titleTv = (TextView) itemView.findViewById(R.id.item_title_tv);
        }
    }

}
