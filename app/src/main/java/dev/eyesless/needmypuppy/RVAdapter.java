package dev.eyesless.needmypuppy;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eyesless on 19.06.2017.
 */

public class RVAdapter extends RecyclerView.Adapter  <RVAdapter.BreedViewHolder> {


    public class BreedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cardView;
        ImageView breedImage;
        TextView breedTitle;
        TextView breedDescription;

        public BreedViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardview_main);
            breedImage = (ImageView) itemView.findViewById(R.id.cv_imageView);
            breedTitle = (TextView) itemView.findViewById(R.id.cv_title);
            breedDescription = (TextView) itemView.findViewById(R.id.cv_description);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            if (myItemClickListner != null) myItemClickListner.onClick(view, getAdapterPosition());

        }
    }

    ArrayList<Breed_mod> breeds;
    private ItemClickListner myItemClickListner;

    RVAdapter (ArrayList<Breed_mod> breeds){

        this.breeds = breeds;
    }


    @Override
    public BreedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_main, parent, false);

        BreedViewHolder breedViewHolder = new BreedViewHolder(v);

        return breedViewHolder;

    }

    @Override
    public void onBindViewHolder(BreedViewHolder holder, int position) {

        holder.breedImage.setImageResource(breeds.get(position).getB_image_res_id());
        holder.breedTitle.setText(breeds.get(position).getB_title());
        holder.breedDescription.setText(breeds.get(position).getB_description());

    }

    @Override
    public int getItemCount() {
        return breeds.size();
    }


    public void setClickListner (ItemClickListner itemClickListner){

        this.myItemClickListner = itemClickListner;

    }

}
