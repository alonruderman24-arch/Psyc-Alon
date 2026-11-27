package com.example.psycalon.screens.splash;

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

public class SplashFragment extends BaseFragment<SplashViewModel> {


    public static SplashFragment newInstance() {
        return new SplashFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = getViewModel(SplashViewModel.class);
    }

    @NonNull
    @Override
    protected String getTitle() {
        return "";
    }

    @Override
    protected boolean shouldShowBackButton() {
        return false;
    }
}