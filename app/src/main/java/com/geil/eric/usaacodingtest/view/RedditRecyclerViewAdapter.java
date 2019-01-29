package com.geil.eric.usaacodingtest.view;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geil.eric.usaacodingtest.R;
import com.geil.eric.usaacodingtest.model.Child;
import com.geil.eric.usaacodingtest.model.InnerData;

import java.util.List;

public class RedditRecyclerViewAdapter
        extends RecyclerView.Adapter<RedditRecyclerViewAdapter.CustomViewHolder> {

    private List<Child> redditData;

    public RedditRecyclerViewAdapter(List<Child> redditData) {
        this.redditData = redditData;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.base_recycle_view, parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder viewHolder, int position) {
        InnerData innerData = redditData.get(position).getData();
        viewHolder.author.setText(innerData.getAuthor());
        viewHolder.title.setText(innerData.getTitle());
        viewHolder.numberOfComments.setText(Integer.toString(innerData.getNum_comments()));

    }

    @Override
    public int getItemCount() {
        return redditData.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView  title;
        public TextView  numberOfComments;
        public TextView  author;



        public CustomViewHolder(View view) {
            super(view);
            view.setTag(this);
            title = (TextView) view.findViewById(R.id.title);
            numberOfComments = (TextView) view.findViewById(R.id.commentNumber);
            author = (TextView) view.findViewById(R.id.author);
            view.setOnClickListener(onItemClickListener);
        }



    }

    public View.OnClickListener
            onItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) v.getTag();
            int position = viewHolder.getAdapterPosition();

            if (redditData != null) {
                InnerData innerData = redditData.get(position).getData();
                AlertDialog dialog = new AlertDialog.Builder(v.getContext()).create();
                TextView msg = new TextView(v.getContext());
                msg.setText(innerData.getSelftext());
                dialog.setView(msg);

                dialog.setButton(AlertDialog.BUTTON_NEUTRAL,"OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
            }
        }
    };
}
