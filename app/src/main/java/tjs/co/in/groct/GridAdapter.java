package tjs.co.in.groct;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();

        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem species = new EndangeredItem();

        species.setThumbnail(R.drawable.m1);
        mItems.add(species);

        species = new EndangeredItem();

        species.setThumbnail(R.drawable.m2);
        mItems.add(species);

        species = new EndangeredItem();

        species.setThumbnail(R.drawable.m3);
        mItems.add(species);

        species = new EndangeredItem();

        species.setThumbnail(R.drawable.m4);
        mItems.add(species);


        species = new EndangeredItem();

        species.setThumbnail(R.drawable.im2);
        mItems.add(species);




    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());



    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (getPosition()==0){
                        Intent intent = new Intent(v.getContext(),  MainActivity.class);
                        v.getContext().startActivity(intent);
                    }


                }
            });

        }
    }
}