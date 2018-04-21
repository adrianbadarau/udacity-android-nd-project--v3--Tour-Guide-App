package com.abadarau.tourguider;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.abadarau.tourguider.BratislavaChurchesFragment.OnListFragmentInteractionListener;
import com.abadarau.tourguider.domain.entities.BratislavaAttraction;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link com.abadarau.tourguider.domain.entities.BratislavaAttraction} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyBratislavaChurchesRecyclerViewAdapter extends RecyclerView.Adapter<MyBratislavaChurchesRecyclerViewAdapter.ViewHolder> {

    private final List<BratislavaAttraction> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyBratislavaChurchesRecyclerViewAdapter(List<BratislavaAttraction> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_bratislava_churches, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mItemDescription_TV.setText(mValues.get(position).getName());
        holder.mItemImage_IV.setImageDrawable(holder.mView.getContext().getDrawable(mValues.get(position).getPictureId()));

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mItemDescription_TV;
        public final ImageView mItemImage_IV;
        public BratislavaAttraction mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mItemDescription_TV = (TextView) view.findViewById(R.id.item_name_tv);
            mItemImage_IV = (ImageView) view.findViewById(R.id.item_picture_IV);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
