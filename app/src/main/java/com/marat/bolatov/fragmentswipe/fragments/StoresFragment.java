package com.marat.bolatov.fragmentswipe.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.marat.bolatov.fragmentswipe.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class StoresFragment extends ListFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initArrayAdapter(inflater);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void initArrayAdapter(LayoutInflater inflater) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.stores));
        setListAdapter(arrayAdapter);
    }
}
