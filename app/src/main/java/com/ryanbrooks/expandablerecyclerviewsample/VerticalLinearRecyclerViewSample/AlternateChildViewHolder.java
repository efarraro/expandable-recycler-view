package com.ryanbrooks.expandablerecyclerviewsample.VerticalLinearRecyclerViewSample;

import android.view.View;
import android.widget.Button;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.ryanbrooks.expandablerecyclerviewsample.R;

public class AlternateChildViewHolder extends ChildViewHolder {
    public Button button;

    /**
     * Public constructor for the an alternate custom child ViewHolder
     *
     * @param itemView the child ViewHolder's view
     */
    public AlternateChildViewHolder(View itemView) {
        super(itemView);

        button = (Button) itemView.findViewById(R.id.my_button);
    }
}
