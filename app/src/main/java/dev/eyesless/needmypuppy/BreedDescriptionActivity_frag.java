package dev.eyesless.needmypuppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BreedDescriptionActivity_frag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed_description_frag);

        Fragment_description newdescription =  (Fragment_description) getFragmentManager().
                findFragmentById(R.id.description_frag);

        newdescription.setBreedId(1);

    }
}