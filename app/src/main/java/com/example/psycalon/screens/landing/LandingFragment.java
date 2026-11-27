package com.example.psycalon.screens.landing;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.psycalon.R;
import com.example.psycalon.core.BaseFragment;
import com.example.psycalon.screens.login.LoginViewModel;

public class LandingFragment extends BaseFragment<LandingViewModel>
{


    public static LandingFragment newInstance() {
        return new LandingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_landing, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = getViewModel(LandingViewModel.class);
    }

    @NonNull
    @Override
    protected String getTitle() {
        return "";
    }

}