package com.ryanbrooks.expandablerecyclerviewsample.VerticalLinearRecyclerViewSample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bignerdranch.expandablerecyclerview.Mapping.Mapping;
import com.ryanbrooks.expandablerecyclerviewsample.R;

public class ChildMapping implements Mapping<CustomChildViewHolder> {
    @Override public RecyclerView.ViewHolder createViewHolder(ViewGroup viewGroup) {
        final LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.recycler_item_layout_child, viewGroup, false);
        return new CustomChildViewHolder(view);
    }

    @Override public void bind(CustomChildViewHolder viewHolder, int position, Object object) {
        CustomChildObject customChildObject = (CustomChildObject) object;
        viewHolder.dataText.setText(customChildObject.getChildText());
    }
}
