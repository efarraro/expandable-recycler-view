package com.bignerdranch.expandablerecyclerview.Mapping;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public interface Mapping<VH>  {
    /**
     * Creates and returns a @code(ViewHolder) for the class associated with this @code(Mapping)
     * @param viewGroup The parent @code(ViewGroup)
     * @return A new @code(ViewHolder)
     */
    RecyclerView.ViewHolder createViewHolder(ViewGroup viewGroup);

    /**
     * Binds the @code(ViewHolder) to an object
     * @param viewHolder The @code(ViewHolder) associated with the object
     * @param position The position of the item in the list
     * @param object The item in the list
     */
    void bind(VH viewHolder, int position, Object object);
}
