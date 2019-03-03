package com.erprakash.conceptofphysics;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class Calculator extends Fragment {


    private TextView disp;
    EditText tv ;
    Button solve;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        tv = (EditText)view.findViewById(R.id.screen);
        solve = (Button)view.findViewById(R.id.equal);
        disp = (TextView)view.findViewById(R.id.result);
        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqual();
            }
        });
        return view;
    }
    private void onEqual() {
        String text = tv.getText().toString();
        try {
                Expression expression = new ExpressionBuilder(text).build();
                Double result = expression.evaluate();
                disp.setText(String.format(Locale.US, "%.5f", result));
            } catch (Exception ae) {

                disp.setText(getString(R.string.error));
            }
        
    }


}
