package tjs.co.in.groct;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class GridAdapter1 extends RecyclerView.Adapter<GridAdapter1.ViewHolder> {

    List<EndangeredItem1> mItems;
    Context context;

    public GridAdapter1() {
        super();
        mItems = new ArrayList<EndangeredItem1>();
        EndangeredItem1 species = new EndangeredItem1();
        species.setName("Brinjal");
        species.setThumbnail(R.drawable.v1);
        mItems.add(species);

        species = new EndangeredItem1();
        species.setName("Carrort");
        species.setThumbnail(R.drawable.v2);
        mItems.add(species);

        species = new EndangeredItem1();
        species.setName("Ginger");
        species.setThumbnail(R.drawable.v3);
        mItems.add(species);

        species = new EndangeredItem1();
        species.setName("Green Chilli ");
        species.setThumbnail(R.drawable.v4);
        mItems.add(species);


        species = new EndangeredItem1();
        species.setName("Lemon");
        species.setThumbnail(R.drawable.v5);
        mItems.add(species);

        species = new EndangeredItem1();
        species.setName("Onion");
        species.setThumbnail(R.drawable.v6);
        mItems.add(species);


        species = new EndangeredItem1();
        species.setName("Potatoes");
        species.setThumbnail(R.drawable.v7);
        mItems.add(species);


        species = new EndangeredItem1();
        species.setName("Beans");
        species.setThumbnail(R.drawable.v8);
        mItems.add(species);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item1, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem1 nature = mItems.get(i);
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
        Button button,button1;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.tv_species);
             button = (Button)itemView.findViewById(R.id.plus_id);
             button1 = (Button)itemView.findViewById(R.id.minus_id);



            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"Item Added",Toast.LENGTH_SHORT).show();

                }
            });


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (getPosition()==0)

                   {




                    }



                }
            });



        }
    }
}