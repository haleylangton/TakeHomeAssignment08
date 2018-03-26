package com.example.android.studyguide;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class QuestionViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView destinationCountry;
    public TextView countryDate;
    public ImageView countryImage;

    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        destinationCountry = (TextView) itemView.findViewById(R.id.destination_country);
        countryDate = (TextView) itemView.findViewById(R.id.country_date);
        countryImage = (ImageView) itemView.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast.makeText(context, destinationCountry.getText(), Toast.LENGTH_SHORT).show();
            }

        });

    }
}
