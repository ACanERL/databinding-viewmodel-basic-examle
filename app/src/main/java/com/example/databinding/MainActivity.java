package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private  ActivityMainBinding binding;
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setMainActivityNesne(this);
        viewModel=new ViewModelProvider(this).get(MainViewModel.class);
        binding.setTextSonuc(viewModel.getSonuc());
    }
    public void Toplama(String sayi1,String sayi2){
        viewModel.Toplama(sayi1,sayi2);
        binding.setTextSonuc(viewModel.getSonuc());
    }
    public void Carpma(String sayi1,String sayi2){
        viewModel.Carpma(sayi1,sayi2);
        binding.setTextSonuc(viewModel.getSonuc());

    }
}