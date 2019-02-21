package com.devmasterteam.tasks.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devmasterteam.tasks.R;
import com.devmasterteam.tasks.entities.TaskEntity;
import com.devmasterteam.tasks.viewholder.TaskViewHolder;

import java.util.List;

public class TaskListAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    private List<TaskEntity> mListTaskEntities;

    /**
     * Construtor
     */
    public TaskListAdapter(List<TaskEntity> taskList) {
    }

    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        // Infla o layout da linha e faz uso na listagem
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_task_list, parent, false);

        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
