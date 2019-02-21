package com.devmasterteam.tasks.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devmasterteam.tasks.R;
import com.devmasterteam.tasks.adapter.TaskListAdapter;
import com.devmasterteam.tasks.entities.TaskEntity;

import java.util.ArrayList;
import java.util.List;

public class TaskListFragment extends Fragment implements View.OnClickListener {

    private Context mContext;
    private List<TaskEntity> mTaskEntityList;
    private TaskListAdapter mTaskListAdapter;
    private ViewHolder mViewHolder = new ViewHolder();

    public static TaskListFragment newInstance() {
        TaskListFragment fragment = new TaskListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Infla o layout
        View rootView = inflater.inflate(R.layout.fragment_task_list, container, false);

        // Incializa as variáveis
        this.mContext = rootView.getContext();

        // Inicializa elementos
        this.mViewHolder.floatAddTask = (FloatingActionButton) rootView.findViewById(R.id.float_add_task);

        // Inicializa eventos
        this.mViewHolder.floatAddTask.setOnClickListener(this);

        // 1 - Obter a recyclerview
        this.mViewHolder.recylerTaskList = (RecyclerView) rootView.findViewById(R.id.recycler_task_list);

        // 2 - Definir adapter passando listagem de itens
        this.mTaskEntityList = new ArrayList<>();
        this.mTaskListAdapter = new TaskListAdapter(this.mTaskEntityList);
        this.mViewHolder.recylerTaskList.setAdapter(mTaskListAdapter);

        // 3 - Definir um layout
        this.mViewHolder.recylerTaskList.setLayoutManager(new LinearLayoutManager(this.mContext));

        return rootView;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.float_add_task) {
            startActivity(new Intent(this.mContext, TaskFormActivity.class));
        }
    }

    /**
     * ViewHolder
     */
    private static class ViewHolder {
        private FloatingActionButton floatAddTask;
        private RecyclerView recylerTaskList;
    }
}
