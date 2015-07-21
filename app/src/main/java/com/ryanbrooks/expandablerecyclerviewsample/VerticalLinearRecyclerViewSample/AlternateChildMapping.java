package com.ryanbrooks.expandablerecyclerviewsample.VerticalLinearRecyclerViewSample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bignerdranch.expandablerecyclerview.Mapping.Mapping;
import com.ryanbrooks.expandablerecyclerviewsample.R;

public class AlternateChildMapping implements Mapping<AlternateChildViewHolder> {
    @Override public RecyclerView.ViewHolder createViewHolder(ViewGroup viewGroup) {
        final LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.recycler_item_layout_child_alternate, viewGroup, false);
        return new AlternateChildViewHolder(view);
    }

    @Override public void bind(AlternateChildViewHolder viewHolder, int position, Object object) {
        CustomAlternateChildObject data = (CustomAlternateChildObject) object;
        viewHolder.button.setText(data.getChildText());
    }
}
