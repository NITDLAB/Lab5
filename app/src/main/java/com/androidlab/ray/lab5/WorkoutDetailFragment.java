package com.androidlab.ray.lab5;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private long workoutID;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(savedInstanceState!=null)
        {
            workoutID = savedInstanceState.getLong("workoutId");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view!=null)
        {
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int)workoutID];
            title.setText(workout.getName());
            TextView description = (TextView)view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("workoutId",workoutID);
    }

    public void setWorkout(long id)
    {
        this.workoutID = id;
    }
}
