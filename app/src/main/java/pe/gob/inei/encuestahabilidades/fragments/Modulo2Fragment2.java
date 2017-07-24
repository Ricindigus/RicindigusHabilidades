package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment2 extends Fragment {

    private LinearLayout lytP6;
    private LinearLayout lytP7;
    private LinearLayout lytP8;
    private LinearLayout lytP9;

    private TextView txtPregunta6;
    private TextView txtPregunta7;
    private TextView txtPregunta8;
    private TextView txtPregunta9;

    private RadioGroup rgP6;

    private CheckBox ck1P8;
    private CheckBox ck2P8;
    private CheckBox ck1P9;
    private CheckBox ck2P9;
    private CheckBox ck3P9;
    private CheckBox ck4P9;
    private CheckBox ck5P9;

    private EditText edtP7;
    private EditText edt1P8;
    private EditText edt2P8;
    private EditText edt1P9;
    private EditText edt2P9;
    private EditText edt3P9;
    private EditText edt4P9;
    private EditText edt5P9;
    private EditText edtEspecifiqueP9;

    private TextView totalP8;
    private TextView totalP9;



    public Modulo2Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment2, container, false);

        lytP6 = (LinearLayout) rootView.findViewById(R.id.mod2_p6_lyt);
        lytP7 = (LinearLayout) rootView.findViewById(R.id.mod2_p7_lyt);
        lytP8 = (LinearLayout) rootView.findViewById(R.id.mod2_p8_lyt);
        lytP9 = (LinearLayout) rootView.findViewById(R.id.mod2_p9_lyt);

        txtPregunta6 = (TextView) rootView.findViewById(R.id.mod2_p6_txtPregunta);
        txtPregunta7 = (TextView) rootView.findViewById(R.id.mod2_p7_txtPregunta);
        txtPregunta8 = (TextView) rootView.findViewById(R.id.mod2_p8_txtPregunta);
        txtPregunta9 = (TextView) rootView.findViewById(R.id.mod2_p9_txtPregunta);

        rgP6 = (RadioGroup) rootView.findViewById(R.id.mod2_p6_rg);
        edtP7 = (EditText) rootView.findViewById(R.id.mod2_p7_edt);

        ck1P8 = (CheckBox) rootView.findViewById(R.id.mod2_p8_ck1);
        ck2P8 = (CheckBox) rootView.findViewById(R.id.mod2_p8_ck2);
        edt1P8 = (EditText) rootView.findViewById(R.id.mod2_p8_edt1);
        edt2P8 = (EditText) rootView.findViewById(R.id.mod2_p8_edt2);

        ck1P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck1);
        ck2P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck2);
        ck3P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck3);
        ck4P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck4);
        ck5P9 = (CheckBox) rootView.findViewById(R.id.mod2_p9_ck5);

        edt1P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt1);
        edt2P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt2);
        edt3P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt3);
        edt4P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt4);
        edt5P9 = (EditText) rootView.findViewById(R.id.mod2_p9_edt5);

        totalP8 = (TextView) rootView.findViewById(R.id.mod2_p8_txtTotal);
        totalP9 = (TextView) rootView.findViewById(R.id.mod2_p9_txtTotal);

        edtEspecifiqueP9 = (EditText)rootView.findViewById(R.id.mod2_p9_edtEspecifique);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout[] linearLayouts = {lytP6,lytP7,lytP8,lytP9};
        TextView[] textViews = {txtPregunta6,txtPregunta7,txtPregunta8,txtPregunta9};


        for (int i = 0; i < linearLayouts.length; i++) {
            final LinearLayout linearLayout = linearLayouts[i];
            final TextView textView = textViews[i];
            linearLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if(b) {
                        ocultarTeclado(linearLayout);
                        textView.setBackgroundColor(Color.CYAN);
                    }else
                        textView.setBackgroundColor(Color.TRANSPARENT);
                }
            });
        }

        rgP6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) rgP6.setBackgroundColor(Color.CYAN);
                else rgP6.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        edtP7.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) edtP7.setBackgroundResource(R.drawable.caja_texto_enabled);
                else edtP7.setBackgroundResource(R.drawable.cajas_de_texto);
            }
        });


        rgP6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                lytP7.requestFocus();
            }
        });

        edtP7.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtP7);
                    lytP8.requestFocus();
                    return true;
                }
                return false;
            }
        });

        EditText[] editTexts1 = {edt1P8,edt2P8};
        final CheckBox[] checkBoxes = {ck1P8,ck2P8};
        for (int i = 0; i <editTexts1.length ; i++) {
            final EditText editText = editTexts1[i];
            CheckBox checkBox = checkBoxes[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(view.isEnabled()){
                        if(conFocus) {
                            editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        }
                        else editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }else{
                        ocultarTeclado(editText);
                    }
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!charSequence.toString().equals("")){
                        totalP8.setText((Integer.parseInt(totalP8.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(totalP8.getText().toString())== 0)){
                        totalP8.setText((Integer.parseInt(totalP8.getText().toString()) + despues) +"");
                    }else{
                        totalP8.setText(despues+"");
                    }
                }
            });
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        editText.requestFocus();
                    }else{
                        editText.setEnabled(false);
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    }
                }
            });
        }
        edt2P8.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt2P8);
                    lytP9.requestFocus();
                    return true;
                }
                return false;
            }
        });
        EditText[] editTexts2 = {edt1P9,edt2P9,edt3P9,edt5P9};
        final CheckBox[] checkBoxes1 = {ck1P9,ck2P9,ck3P9,ck5P9};
        for (int i = 0; i <editTexts2.length ; i++) {
            final EditText editText = editTexts2[i];
            CheckBox checkBox = checkBoxes1[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(view.isEnabled()){
                        if(conFocus) {
                            editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        }
                        else editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }else{
                        ocultarTeclado(editText);
                    }
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!charSequence.toString().equals("")){
                        totalP9.setText((Integer.parseInt(totalP9.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(totalP9.getText().toString())== 0)){
                        totalP9.setText((Integer.parseInt(totalP9.getText().toString()) + despues) +"");
                    }else{
                        totalP9.setText(despues+"");
                    }
                }
            });
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        editText.setEnabled(true);
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        editText.requestFocus();
                    }else{
                        editText.setEnabled(false);
                        editText.setText("");
                        editText.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    }
                }
            });
        }

        edt4P9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(view.isEnabled()){
                    if(conFocus) {
                        edt4P9.setBackgroundResource(R.drawable.caja_texto_enabled);
                    }
                    else {
                        edt4P9.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }else{
                    ocultarTeclado(edt4P9);
                }
            }
        });
        edt4P9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!charSequence.toString().equals("")){
                    totalP9.setText((Integer.parseInt(totalP9.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int despues = 0;
                if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                if(!(Integer.parseInt(totalP9.getText().toString())== 0)){
                    totalP9.setText((Integer.parseInt(totalP9.getText().toString()) + despues) +"");
                }else{
                    totalP9.setText(despues+"");
                }
            }
        });
        edtEspecifiqueP9.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(view.isEnabled()){
                    if(conFocus) {
                        edtEspecifiqueP9.setBackgroundResource(R.drawable.caja_redonda_enabled);
                    }
                    else {
                        edtEspecifiqueP9.setBackgroundResource(R.drawable.caja_texto_redonda);
                    }
                }else{
                    ocultarTeclado(edt4P9);
                }
            }
        });
        ck4P9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    edt4P9.setEnabled(true);
                    edt4P9.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtEspecifiqueP9.setEnabled(true);
                    edtEspecifiqueP9.requestFocus();
                }else{
                    edt4P9.setEnabled(false);
                    edt4P9.setText("");
                    edt4P9.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueP9.setEnabled(false);
                    edtEspecifiqueP9.setText("");
                    edtEspecifiqueP9.setBackgroundResource(R.drawable.caja_redonda_disabled);

                }
            }
        });
        edtEspecifiqueP9.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtP7.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edt4P9.setTransformationMethod(new NumericKeyBoardTransformationMethod());
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (!imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }
    }
}
