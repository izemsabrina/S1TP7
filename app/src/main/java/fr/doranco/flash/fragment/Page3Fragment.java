package fr.doranco.flash.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.doranco.flash.R;
import fr.doranco.flash.databinding.FragmentPage3Binding;


public class Page3Fragment extends Fragment {

   private FragmentPage3Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentPage3Binding.inflate(inflater,container,false);
        binding.buttonPage3GoToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_page3Fragment_to_page2Fragment);
            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}