package pe.gob.inei.encuestahabilidades.fragments;


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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment1 extends Fragment {

    private CheckBox ckMismoInformante;
    private EditText edtNombYApellidos;
    private EditText edtEspecifiqueCargo;

    private EditText edtActividadPrimaria;
    private EditText edtCIUPrimaria;
    private CheckBox ckNoSecundaria2;
    private EditText edtActividadSecundaria1;
    private EditText edtCIUSecundaria1;
    private EditText edtActividadSecundaria2;
    private EditText edtCIUSecundaria2;
    private Spinner spCargo;
    private LinearLayout lytFondoSpinner;
    private LinearLayout lytActividadSec2;

    private LinearLayout lytPregunta3;
    private RadioGroup rgOrgEmpresa;
    private LinearLayout lytespecifiqueOrg;
    private EditText edtEspecifiqueOrg;

    private LinearLayout lytPregunta4;
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

        ckMismoInformante = (CheckBox) rootView.findViewById(R.id.mod1_cab_ckMismoInformante);
        edtNombYApellidos = (EditText)rootView.findViewById(R.id.mod1_cab_edtApeYNom);
        spCargo = (Spinner) rootView.findViewById(R.id.mod1_cab_spCargo);
        edtEspecifiqueCargo = (EditText) rootView.findViewById(R.id.mod1_cab_edtEspecifiqueCargo);
        lytFondoSpinner = (LinearLayout) rootView.findViewById(R.id.mod1_cab_lytFondoSpinner);

        edtActividadPrimaria = (EditText)rootView.findViewById(R.id.mod1_p1_edtActividadPrimaria);
        edtCIUPrimaria = (EditText) rootView.findViewById(R.id.mod1_p1_edtCIUPrimaria);
        edtActividadSecundaria1 = (EditText)rootView.findViewById(R.id.mod1_p2_edtActividadSecundaria1);
        edtCIUSecundaria1 = (EditText)rootView.findViewById(R.id.mod1_p2_edtCIUSecundaria1);
        ckNoSecundaria2 = (CheckBox) rootView.findViewById(R.id.mod1_p2_ckNoActividadSec2);
        edtActividadSecundaria2 = (EditText)rootView.findViewById(R.id.mod1_p2_edtActividadSecundaria2);
        edtCIUSecundaria2 = (EditText)rootView.findViewById(R.id.mod1_p2_edtCIUSecundaria2);
        lytActividadSec2 = (LinearLayout) rootView.findViewById(R.id.mod1_p2_lytActividadSecundaria2);

        lytPregunta3 = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lytPregunta3);
        rgOrgEmpresa = (RadioGroup) rootView.findViewById(R.id.mod1_p3_rgOrgEmpresa);
        lytespecifiqueOrg = (LinearLayout) rootView.findViewById(R.id.mod1_p3_lytEspecifiqueOrg);
        edtEspecifiqueOrg = (EditText) rootView.findViewById(R.id.mod1_p3_edtEspecifiqueOrg);

        lytPregunta4 = (LinearLayout) rootView.findViewById(R.id.mod1_p4_lytSubpreguntas);
        rgSP41 = (RadioGroup) rootView.findViewById(R.id.mod1_p4_rg41);
        rgSP42 = (RadioGroup) rootView.findViewById(R.id.mod1_p4_rg42);

        return rootView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ckMismoInformante.requestFocus();
        ckMismoInformante.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo.setEnabled(false);
                    edtNombYApellidos.setText("JULIO LAVADO");
                    spCargo.setSelection(1);
                    edtNombYApellidos.setEnabled(false);
                    edtActividadPrimaria.requestFocus();
                }else{
                    edtNombYApellidos.setText("");
                    spCargo.setSelection(0);
                    edtNombYApellidos.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos.setEnabled(true);
                    lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo.setEnabled(true);
                    edtNombYApellidos.requestFocus();
                }
            }
        });
        edtNombYApellidos.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    lytFondoSpinner.requestFocus();
                    ocultarTeclado();
                    return true;
                }
                return false;
            }
        });

        spCargo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo.requestFocus();
                else if (pos > 0 && pos <4)edtActividadPrimaria.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        edtActividadPrimaria.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUPrimaria.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtActividadSecundaria1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtCIUSecundaria1.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        ckNoSecundaria2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytActividadSec2.setVisibility(View.GONE);
                    lytPregunta3.requestFocus();
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
                    ocultarTeclado();
                    rgOrgEmpresa.requestFocus();
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
            }
        });
        edtEspecifiqueOrg.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueOrg.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado();
                    lytPregunta4.requestFocus();
                    return true;
                }
                return false;
            }
        });

        rgSP41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
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
                switch(i){
                    case R.id.mod1_p4_sp2_rb1:break;
                    case R.id.mod1_p4_sp2_rb2:break;
                }
            }
        });
    }

    public void ocultarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
