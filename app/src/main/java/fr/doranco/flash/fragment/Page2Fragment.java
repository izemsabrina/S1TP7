package fr.doranco.flash.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.doranco.flash.R;
import fr.doranco.flash.databinding.FragmentPage1Binding;
import fr.doranco.flash.databinding.FragmentPage2Binding;

public class Page2Fragment extends Fragment {

    private FragmentPage2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentPage2Binding.inflate(inflater,container,false);
       binding.buttonPage2GoToHomr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Navigation.findNavController(view).navigate(R.id.action_page2Fragment_to_homeFragment);

           }
       });
       binding.buttonPage2GoToPage3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Navigation.findNavController(view).navigate(R.id.action_page2Fragment_to_page3Fragment);
           }
       });
        return binding.getRoot();
    }
}