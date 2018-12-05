package com.androidlab.ray.lab5;

import android.support.annotation.NonNull;

public class Workout {
    private String name;
    private String Description;

    public Workout(String name, String description) {
        this.name = name;
        Description = description;
    }

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 HandStand push-ups\n20 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x Pull-ups")
    };

    @NonNull
    public String toString()
    {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
