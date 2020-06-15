package cuba.util.android.sec2.ru.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import cuba.util.android.sec2.ru.myapplication.fragments.FirstFragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        FirstFragment firstFragment = FirstFragment.newInstance();
        transaction.add(R.id.frgmCont, firstFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void firstMethod() {
        Toast.makeText(this, "The first button was pressed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void secondMethod() {
        Toast.makeText(this, "The second button was pressed", Toast.LENGTH_SHORT).show();
    }
}
