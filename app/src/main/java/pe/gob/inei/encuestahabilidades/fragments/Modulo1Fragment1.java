package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.res.ResourcesCompat;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment1 extends Fragment {

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


    private LinearLayout lytFragment;

    private CheckBox ckMismoInformante1;
    private EditText edtNombYApellidos1;
    private EditText edtEspecifiqueCargo1;
    private LinearLayout lytFondoSpinner1;
    private Spinner spCargo1;

    private EditText edtActividadPrimaria;
    private EditText edtCIUPrimaria;
    private CheckBox ckNoSecundaria2;
    private EditText edtActividadSecundaria1;
    private EditText edtCIUSecundaria1;
    private EditText edtActividadSecundaria2;
    private EditText edtCIUSecundaria2;


    private LinearLayout lytActividadSec2;

    private RadioGroup rgOrgEmpresa;
    private LinearLayout lytespecifiqueOrg;
    private EditText edtEspecifiqueOrg;

    private RadioGroup rgSP41;
    private RadioGroup rgSP42;



    public Modulo1Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment1, container, false);

        lytP1 = (LinearLayout) rootView.findViewById(R.id.mod1_p1_lyt);
        lytP2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lyt);
        lytP3 = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lyt);
        lytP4 = (LinearLayout) rootView.findViewById(R.id.mod1_p4_lyt);
        lytP5 = (LinearLayout) rootView.findViewById(R.id.mod1_p5_lyt);

        txtPregunta1 = (TextView) rootView.findViewById(R.id.mod1_p1_txtPregunta);
        txtPregunta2 = (TextView) rootView.findViewById(R.id.mod1_p2_txtPregunta);
        txtPregunta3 = (TextView) rootView.findViewById(R.id.mod1_p3_txtPregunta);
        txtPregunta4 = (TextView) rootView.findViewById(R.id.mod1_p4_txtPregunta);
        txtPregunta5 = (TextView) rootView.findViewById(R.id.mod1_p5_txtPregunta);

        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment1);
        ckMismoInformante1 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos1 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo1 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo1 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner1 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        edtActividadPrimaria = (EditText)rootView.findViewById(R.id.mod1_p1_edtActividadPrimaria);
        edtCIUPrimaria = (EditText) rootView.findViewById(R.id.mod1_p1_edtCIUPrimaria);
        edtActividadSecundaria1 = (EditText)rootView.findViewById(R.id.mod1_p2_edtActividadSecundaria1);
        edtCIUSecundaria1 = (EditText)rootView.findViewById(R.id.mod1_p2_edtCIUSecundaria1);
        ckNoSecundaria2 = (CheckBox) rootView.findViewById(R.id.mod1_p2_ckNoActividadSec2);
        edtActividadSecundaria2 = (EditText)rootView.findViewById(R.id.mod1_p2_edtActividadSecundaria2);
        edtCIUSecundaria2 = (EditText)rootView.findViewById(R.id.mod1_p2_edtCIUSecundaria2);
        lytActividadSec2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lytActividadSecundaria2);


        rgOrgEmpresa = (RadioGroup) rootView.findViewById(R.id.mod1_p3_rgOrgEmpresa);
        lytespecifiqueOrg = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lytEspecifiqueOrg);
        edtEspecifiqueOrg = (EditText) rootView.findViewById(R.id.mod1_p3_edtEspecifiqueOrg);


        rgSP41 = (RadioGroup) rootView.findViewById(R.id.mod1_p4_rg41);
        rgSP42 = (RadioGroup) rootView.findViewById(R.id.mod1_p4_rg42);
        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

        EditText[] cajasDeTexto = {edtActividadPrimaria, edtCIUPrimaria, edtActividadSecundaria1,
        edtActividadSecundaria2,edtCIUSecundaria1,edtCIUSecundaria2, edtEspecifiqueOrg};

        for (int i = 0; i < cajasDeTexto.length; i++) {
            final EditText editText = cajasDeTexto[i];
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
        }

        rgSP42.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) rgSP42.setBackgroundColor(Color.CYAN);
                else rgSP42.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        ckMismoInformante1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    lytFondoSpinner1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo1.setEnabled(false);
                    edtNombYApellidos1.setText("JULIO LAVADO");
                    spCargo1.setSelection(1);
                    edtNombYApellidos1.setEnabled(false);
                    lytP1.requestFocus();
                }else{
                    edtNombYApellidos1.setText("");
                    spCargo1.setSelection(0);
                    edtNombYApellidos1.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos1.setEnabled(true);
                    lytFondoSpinner1.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo1.setEnabled(true);
                    edtNombYApellidos1.requestFocus();
                }
            }
        });
        edtNombYApellidos1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner1);
                    lytFondoSpinner1.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edtNombYApellidos1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtNombYApellidos1.setBackgroundResource(R.drawable.caja_texto_enabled);
                }
                else if(view.isEnabled()){
                    edtNombYApellidos1.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        lytFondoSpinner1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    lytFondoSpinner1.setBackgroundResource(R.drawable.caja_texto_enabled);
                    ocultarTeclado(lytFondoSpinner1);
                }
                else if(view.isEnabled()){
                    lytFondoSpinner1.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        spCargo1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo1.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo1.setVisibility(View.VISIBLE);
                        edtEspecifiqueCargo1.requestFocus();
                        break;
                }
                if (pos > 0 && pos <4)lytP1.requestFocus();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
        edtEspecifiqueCargo1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueCargo1);
                    lytP1.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edtEspecifiqueCargo1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtEspecifiqueCargo1.setBackgroundResource(R.drawable.caja_texto_enabled);
                }
                else if(view.isEnabled()){
                    edtEspecifiqueCargo1.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });


        edtCIUPrimaria.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtActividadSecundaria1);
                    lytP2.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edtCIUSecundaria1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    if(ckNoSecundaria2.isChecked()){
                        ocultarTeclado(edtActividadSecundaria1);
                        lytP3.requestFocus();
                    }
                    return true;
                }
                return false;
            }
        });
        ckNoSecundaria2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checkeado) {
                if(checkeado) {
                    lytActividadSec2.setVisibility(View.GONE);
                    ocultarTeclado(ckNoSecundaria2);
                    lytP3.requestFocus();
                } else {
                    lytActividadSec2.setVisibility(View.VISIBLE);
                    edtActividadSecundaria2.setText("");
                    edtCIUSecundaria2.setText("");
                    edtActividadSecundaria2.requestFocus();
                }
            }
        });
        edtActividadSecundaria2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUSecundaria2.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtCIUSecundaria2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtActividadSecundaria2);
                    lytP3.requestFocus();
                    return true;
                }
                return false;
            }
        });

        rgOrgEmpresa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                lytespecifiqueOrg.setVisibility(View.GONE);
                switch (i){
                    case R.id.mod1_p3_rb1: break;
                    case R.id.mod1_p3_rb2: break;
                    case R.id.mod1_p3_rb3: break;
                    case R.id.mod1_p3_rb4: break;
                    case R.id.mod1_p3_rb5: break;
                    case R.id.mod1_p3_rb6: break;
                    case R.id.mod1_p3_rb7:
                        lytespecifiqueOrg.setVisibility(View.VISIBLE);
                        edtEspecifiqueOrg.requestFocus();
                        break;
                }
                if(i != R.id.mod1_p3_rb7){
                    ocultarTeclado(rgOrgEmpresa);
                    lytP4.requestFocus();
                }
            }
        });
        edtEspecifiqueOrg.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueOrg.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecifiqueOrg);
                    lytP4.requestFocus();
                    return true;
                }
                return false;
            }
        });

        rgSP41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                rgSP42.requestFocus();
                switch(i){
                    case R.id.mod1_p4_sp1_rb1:break;
                    case R.id.mod1_p4_sp1_rb2:break;
                    case R.id.mod1_p4_sp1_rb3:break;
                }
            }
        });

        rgSP42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                lytP5.requestFocus();
                switch(i){
                    case R.id.mod1_p4_sp2_rb1:break;
                    case R.id.mod1_p4_sp2_rb2:break;
                }
            }
        });

        lytFragment.requestFocus();
        edtActividadPrimaria.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUPrimaria.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtActividadSecundaria1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUSecundaria1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
    }

    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
