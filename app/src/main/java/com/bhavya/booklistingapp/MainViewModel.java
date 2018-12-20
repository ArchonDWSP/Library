package com.bhavya.booklistingapp;

import android.databinding.ObservableField;
import android.widget.Toolbar;

public class MainViewModel {

    public ObservableField<Toolbar> toolbar = new ObservableField<>();
    public ObservableField<String> searchBox = new ObservableField<>();

    Navigator main;

    public MainViewModel(Navigator main){
        this.main = main;
    }

}
