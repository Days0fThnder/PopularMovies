package com.example.j_rus.popularmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by j_rus on 8/3/2016.
 */
public class MoviePosterAdapter extends ArrayAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<MoviePoster> moviePosters;

    // Constructor
    public MoviePosterAdapter(Context context, List<MoviePoster> moviePosters) {
        super(context, 0, moviePosters);

        this.context = context;
        this.moviePosters = moviePosters;

        inflater = LayoutInflater.from(context);

    }

    public int getCount() {
        return moviePosters.size();
    }

    @Override
    public String getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.poster_item, parent, false);
        }

        // Get the image URL for the current position.
        String url = getItem(position);

        Picasso
                .with(context)
                .load(moviePosters.get(position).posterPath)
                .fit() // will explain later
                .centerCrop()
                .into((ImageView) convertView);

        return convertView;
    }

}
