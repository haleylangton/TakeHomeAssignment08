package com.example.android.studyguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class QuestionsAdapter extends RecyclerView.Adapter<QuestionViewHolder> {

    private List<Destination> destinations;
    private Context context;

    public QuestionsAdapter(List<Destination> questions, Context context) {

        this.destinations = questions;
        this.context = context;
    }

    @Override
    public  QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_country, parent, false);
        return new QuestionViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {
        Destination question = destinations.get(position);
        holder.destinationCountry.setText(question.getLocation());
        holder.countryDate.setText(question.getQuestion());
        holder.countryImage.setImageResource(question.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return destinations.size();
    }

}
