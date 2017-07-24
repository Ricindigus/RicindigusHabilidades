package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
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
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment1 extends Fragment {
    private LinearLayout lytP1;
    private LinearLayout lytP2;
    private LinearLayout lytP3;
    private LinearLayout lytP4;
    private LinearLayout lytP5;

    private TextView txtPregunta1;
    private TextView txtPregunta2;
    private TextView txtPregunta3;
    private TextView txtPregunta4;
    private TextView txtPregunta5;

    private CheckBox ckMismoInformante2;
    private EditText edtNombYApellidos2;
    private EditText edtEspecifiqueCargo2;
    private LinearLayout lytFondoSpinner2;
    private Spinner spCargo2;

    private EditText edtP1;
    private EditText edtP2;
    private EditText edtP3;
    private EditText edtP4;

    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private EditText edt4;
    private EditText edt5;

    private CheckBox ck1;
    private CheckBox ck2;
    private CheckBox ck3;
    private CheckBox ck4;
    private CheckBox ck5;

    private TextView txtTotal;


    public Modulo2Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment1, container, false);

        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod2_p1_lyt);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod2_p2_lyt);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod2_p3_lyt);
        lytP4 = (LinearLayout) rootView.findViewById(R.id.mod2_p4_lyt);
        lytP5 = (LinearLayout) rootView.findViewById(R.id.mod2_p5_lyt);

        txtPregunta1 = (TextView) rootView.findViewById(R.id.mod2_p1_txtPregunta);
        txtPregunta2 = (TextView) rootView.findViewById(R.id.mod2_p2_txtPregunta);
        txtPregunta3 = (TextView) rootView.findViewById(R.id.mod2_p3_txtPregunta);
        txtPregunta4 = (TextView) rootView.findViewById(R.id.mod2_p4_txtPregunta);
        txtPregunta5 = (TextView) rootView.findViewById(R.id.mod2_p5_txtPregunta);

        ckMismoInformante2 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos2 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo2 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo2 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner2 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        edtP1 = (EditText) rootView.findViewById(R.id.mod2_p1_edt);
        edtP2 = (EditText) rootView.findViewById(R.id.mod2_p2_edt);
        edtP3 = (EditText) rootView.findViewById(R.id.mod2_p3_edt);
        edtP4 = (EditText) rootView.findViewById(R.id.mod2_p4_edt);



        edt1 = (EditText) rootView.findViewById(R.id.mod2_p5_edt1);
        edt2 = (EditText) rootView.findViewById(R.id.mod2_p5_edt2);
        edt3 = (EditText) rootView.findViewById(R.id.mod2_p5_edt3);
        edt4 = (EditText) rootView.findViewById(R.id.mod2_p5_edt4);
        edt5 = (EditText) rootView.findViewById(R.id.mod2_p5_edt5);

        ck1 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck1);
        ck2 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck2);
        ck3 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck3);
        ck4 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck4);
        ck5 = (CheckBox) rootView.findViewById(R.id.mod2_p5_ck5);

        txtTotal = (TextView) rootView.findViewById(R.id.mod2_p5_txtTotal);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ckMismoInformante2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    lytFondoSpinner2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo2.setEnabled(false);
                    edtNombYApellidos2.setText("JULIO LAVADO");
                    spCargo2.setSelection(1);
                    edtNombYApellidos2.setEnabled(false);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos2.setText("");
                    spCargo2.setSelection(0);
                    edtNombYApellidos2.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos2.setEnabled(true);
                    lytFondoSpinner2.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo2.setEnabled(true);
                    edtNombYApellidos2.requestFocus();
                }
            }
        });
        edtNombYApellidos2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner2);
                    lytFondoSpinner2.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edtNombYApellidos2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtNombYApellidos2.setBackgroundResource(R.drawable.caja_texto_enabled);
                }
                else if(view.isEnabled()){
                    edtNombYApellidos2.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        lytFondoSpinner2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    lytFondoSpinner2.setBackgroundResource(R.drawable.caja_texto_enabled);
                    ocultarTeclado(lytFondoSpinner2);
                }
                else if(view.isEnabled()){
                    lytFondoSpinner2.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        edtEspecifiqueCargo2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtEspecifiqueCargo2.setBackgroundResource(R.drawable.caja_texto_enabled);
                }
                else if(view.isEnabled()){
                    edtEspecifiqueCargo2.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        edtEspecifiqueCargo2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo2);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
        spCargo2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo2.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo2.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo2.requestFocus();
                else if (pos > 0 && pos <4)lytP1.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        LinearLayout[] linearLayouts = {lytP1,lytP2,lytP3,lytP4,lytP5};
        TextView[] textViews = {txtPregunta1,txtPregunta2,txtPregunta3,txtPregunta4,txtPregunta5};


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

        EditText[] editTexts = {edtP1,edtP2,edtP3,edtP4};
        for (int i = 0; i < editTexts.length; i++) {
            final EditText editText = editTexts[i];
            final LinearLayout linearLayout = linearLayouts[i+1];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                    }
                    else if(view.isEnabled()){
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            });
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                    if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        ocultarTeclado(editText);
                        linearLayout.requestFocus();
                        return true;
                    }
                    return false;
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        }



        EditText[] editTexts1 = {edt1,edt2,edt3,edt4,edt5};
        final CheckBox[] checkBoxes = {ck1,ck2,ck3,ck4,ck5};
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
                        txtTotal.setText((Integer.parseInt(txtTotal.getText().toString()) - Integer.parseInt(charSequence.toString()))+"");
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    int despues = 0;
                    if(!editable.toString().equals("")) despues = Integer.parseInt(editable.toString());
                    if(!(Integer.parseInt(txtTotal.getText().toString())== 0)){
                        txtTotal.setText((Integer.parseInt(txtTotal.getText().toString()) + despues) +"");
                    }else{
                        txtTotal.setText(despues+"");
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

        edt5.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edt5);
                    lytP5.requestFocus();
                    txtPregunta5.setBackgroundColor(Color.TRANSPARENT);
                    return true;
                }
                return false;
            }
        });
//        ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                    EditText[] editTexts2 = {edt1,edt2,edt3,edt4};
//                    CheckBox[] checkBoxes1 = {ck1,ck2,ck3,ck4};
//                    for (int i = 0; i <checkBoxes1.length ; i++) {
//                        EditText editText = editTexts2[i];
//                        CheckBox checkBox = checkBoxes1[i];
//                        if(b){
//                            checkBox.setChecked(false);
//                            checkBox.setEnabled(false);
//                            checkBox.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
//                            editText.setEnabled(false);
//                            editText.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
//                        }else{
//                            checkBox.setEnabled(true);
//                            checkBox.setBackgroundResource(R.drawable.cajas_de_texto);
//                        }
//                    }
//            }
//        });
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
