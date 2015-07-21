package com.ryanbrooks.expandablerecyclerviewsample.VerticalLinearRecyclerViewSample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bignerdranch.expandablerecyclerview.Mapping.Mapping;
import com.ryanbrooks.expandablerecyclerviewsample.R;

public class ParentMapping implements Mapping<CustomParentViewHolder> {
    @Override public RecyclerView.ViewHolder createViewHolder(ViewGroup viewGroup) {
        final LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.recycler_item_layout_parent, viewGroup, false);
        return new CustomParentViewHolder(view);
    }

    @Override public void bind(CustomParentViewHolder viewHolder, int position, Object object) {
        CustomParentObject customParentObject = (CustomParentObject) object;
        viewHolder.numberText.setText(Integer.toString(customParentObject.getParentNumber()));
        viewHolder.dataText.setText(customParentObject.getParentText());
    }
}
