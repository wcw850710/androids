package com.example.android3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {
  Project[] projects;

  public ProjectsAdapter(Project[] projects) {
    this.projects = projects;
  }

  static class ProjectViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView description;
    ImageView picture;

    public ProjectViewHolder(@NonNull View itemView) {
      super(itemView);
      title = itemView.findViewById(R.id.image_view_title);
      description = itemView.findViewById(R.id.image_view_description);
      picture = itemView.findViewById(R.id.image_view_picture);
    }

    public void bind(Project project) {
      title.setText(project.title);
      description.setText(project.description);
      picture.setImageResource(project.imageResource);
    }
  }

  @NonNull
  @Override
  public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new ProjectViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false));
  }

  @Override
  public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
    Project project = projects[position];
    holder.bind(project);
  }

  @Override
  public int getItemCount() {
    return projects.length;
  }
}
