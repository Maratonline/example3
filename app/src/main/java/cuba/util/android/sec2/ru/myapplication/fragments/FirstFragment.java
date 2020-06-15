package cuba.util.android.sec2.ru.myapplication.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import cuba.util.android.sec2.ru.myapplication.R;


public class FirstFragment extends Fragment implements View.OnClickListener {
    private Button firstButton, secondButton;
    private OnFragmentInteractionListener mListener;

    public FirstFragment() {
        // Required empty public constructor
    }



    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        firstButton = view.findViewById(R.id.mFirstBtn);
        firstButton.setOnClickListener(this);
        secondButton = view.findViewById(R.id.mSecondBtn);
        secondButton.setOnClickListener(this);
        return view;
    }


    public void onFirstButtonPressed() {
        if (mListener != null) {
            mListener.firstMethod();
        }
    }

    public void onSecondButtonPressed() {
        if (mListener != null) {
            mListener.secondMethod();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }



    @Override
    public void onClick(View view) {
        System.out.println("sdfsf");
        switch (view.getId()){
            case R.id.mFirstBtn:
                onFirstButtonPressed();
                break;
            case R.id.mSecondBtn:
                onSecondButtonPressed();
                break;

        }
    }




    public interface OnFragmentInteractionListener {
        void firstMethod();
        void secondMethod();
    }
}
