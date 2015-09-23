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


public class GridAdapter2 extends RecyclerView.Adapter<GridAdapter2.ViewHolder> {

    List<EndangeredItem2> mItems;

    public GridAdapter2() {
        super();

        mItems = new ArrayList<EndangeredItem2>();
        EndangeredItem2 species = new EndangeredItem2();

        species.setName("Brinjal");
        species.setThumbnail(R.drawable.v1);
        mItems.add(species);

        species = new EndangeredItem2();
        species.setName("Carrort");
        species.setThumbnail(R.drawable.v2);
        mItems.add(species);

        species = new EndangeredItem2();
        species.setName("Ginger");
        species.setThumbnail(R.drawable.v3);
        mItems.add(species);

        species = new EndangeredItem2();
        species.setName("Green Chilli ");
        species.setThumbnail(R.drawable.v4);
        mItems.add(species);


        species = new EndangeredItem2();
        species.setName("Lemon");
        species.setThumbnail(R.drawable.v5);
        mItems.add(species);




    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item2, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem2 nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());



    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.tv_species);

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