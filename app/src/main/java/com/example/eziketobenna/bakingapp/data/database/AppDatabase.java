package com.example.eziketobenna.bakingapp.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.example.eziketobenna.bakingapp.data.model.Recipe;


/**
 * {@link AppDatabase} database for the application including a table for {@link Recipe}
 * with the DAO {@link RecipeDao}.
 */

// List of the entry classes and associated TypeConverters
@Database(entities = Recipe.class, version = 2, exportSchema = false)
@TypeConverters({IngredientListConverter.class, StepListConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public static final String DB_NAME = "recipe_db";

    public abstract RecipeDao recipeDao();
}
