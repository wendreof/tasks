package com.devmasterteam.tasks.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextDescription;
    private TextView mTextPriorityId;
    private TextView mTextPriority;
    private TextView mTextDueDate;
    private ImageView mImageTask;

    public TaskViewHolder(View itemView) {
        super(itemView);
    }

}
