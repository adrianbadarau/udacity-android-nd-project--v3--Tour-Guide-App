package com.abadarau.tourguider.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.abadarau.tourguider.R;
import com.abadarau.tourguider.domain.entities.BratislavaAttraction;

import java.util.List;

public class BratislavaAttractionAdapter extends ArrayAdapter<BratislavaAttraction> {
    public BratislavaAttractionAdapter(@NonNull Context context, int resource, @NonNull List<BratislavaAttraction> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        BratislavaAttraction current = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bratislava_attraction_list_item, parent, false);
        }

        ImageView pictureContainer = convertView.findViewById(R.id.attraction_picture_iv);
        pictureContainer.setImageDrawable(getContext().getDrawable(current.getPictureId()));
        TextView descriptionContainer = convertView.findViewById(R.id.attraction_description_tv);
        descriptionContainer.setText(current.getDescriptionId());

        return convertView;
    }

}
