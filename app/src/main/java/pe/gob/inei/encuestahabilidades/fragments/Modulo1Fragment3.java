package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment3 extends Fragment {

    private LinearLayout lytP11;
    private LinearLayout lytP12;

    private TextView txtPregunta11;
    private TextView txtPregunta12;

    private EditText edtAnio;
    private EditText edtMes;
    private EditText edtVia;
    private EditText edtPuerta;
    private EditText edtBlock;
    private EditText edtInterior;
    private EditText edtPiso;
    private EditText edtManzana;
    private EditText edtLote;
    private EditText edtKm;
    private EditText edtDistrito;
    private EditText edtProvincia;
    private EditText edtDepartamento;
    private EditText edtEspecifique;

    private LinearLayout lytFondoSpinner;
    private LinearLayout lytEdit1;
    private LinearLayout lytEdit2;


    private RadioGroup rgAnio;

    private Spinner spTipoVia;


    public Modulo1Fragment3() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment3, container, false);

        lytP11 = (LinearLayout) rootView.findViewById(R.id.mod1_p11_lyt);
        lytP12 = (LinearLayout) rootView.findViewById(R.id.mod1_p12_lyt);

        txtPregunta11 = (TextView) rootView.findViewById(R.id.mod1_p11_txtPregunta);
        txtPregunta12 = (TextView) rootView.findViewById(R.id.mod1_p12_txtPregunta);

        rgAnio = (RadioGroup) rootView.findViewById(R.id.mod1_p11_rgAnio);

        edtAnio = (EditText) rootView.findViewById(R.id.mod1_p11_edt1);
        edtMes = (EditText) rootView.findViewById(R.id.mod1_p11_edt2);

        edtVia = (EditText) rootView.findViewById(R.id.mod1_p12_edtNomVia);
        edtPuerta = (EditText) rootView.findViewById(R.id.mod1_p12_edtPuerta);
        edtBlock = (EditText) rootView.findViewById(R.id.mod1_p12_edtBlock);
        edtInterior = (EditText) rootView.findViewById(R.id.mod1_p12_edtInterior);
        edtPiso = (EditText) rootView.findViewById(R.id.mod1_p12_edtPiso);
        edtManzana = (EditText) rootView.findViewById(R.id.mod1_p12_edtManzana);
        edtLote = (EditText) rootView.findViewById(R.id.mod1_p12_edtLote);
        edtKm = (EditText) rootView.findViewById(R.id.mod1_p12_edtKm);
        edtEspecifique = (EditText) rootView.findViewById(R.id.mod1_p12_edtEspecifique);

        edtDistrito = (EditText) rootView.findViewById(R.id.mod1_p12_edtDistrito);
        edtProvincia = (EditText) rootView.findViewById(R.id.mod1_p12_edtProvincia);
        edtDepartamento = (EditText) rootView.findViewById(R.id.mod1_p12_edtDepartamento);

        lytFondoSpinner = (LinearLayout)rootView.findViewById(R.id.mod1_p12_lytFondoSpVia);
        lytEdit1 = (LinearLayout)rootView.findViewById(R.id.mod1_p11_lytEdit1);
        lytEdit2 = (LinearLayout)rootView.findViewById(R.id.mod1_p11_lytEdit2);

        spTipoVia = (Spinner) rootView.findViewById(R.id.mod1_p12_sp);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout[] linearLayouts = {lytP11,lytP12};
        TextView[] textViews = {txtPregunta11,txtPregunta12};

        for (int i = 0; i < linearLayouts.length; i++) {
            final LinearLayout linearLayout = linearLayouts[i];
            final TextView textView = textViews[i];
            linearLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if(b) {
                        ocultarTeclado(linearLayout);
                        textView.setBackgroundColor(Color.CYAN);
                    }
                    else textView.setBackgroundColor(Color.TRANSPARENT);
                }
            });
        }


        edtAnio.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtMes.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtVia.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtPuerta.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtBlock.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtInterior.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtPiso.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtManzana.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtLote.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtKm.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtDistrito.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtProvincia.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtDepartamento.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifique.setFilters(new InputFilter[]{new InputFilter.AllCaps()});

        EditText[] editTexts = {edtAnio,edtMes, edtVia,edtPuerta,edtBlock,edtInterior,edtPiso, edtManzana,edtLote,edtKm,edtDistrito,
        edtProvincia,edtDepartamento,edtEspecifique};

        for (int i = 0; i < editTexts.length; i++) {
            final EditText editText = editTexts[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                    else editText.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            });
        }



        rgAnio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p11_rbSi:
                        lytEdit1.setVisibility(View.VISIBLE);
                        lytEdit2.setVisibility(View.GONE);
                        edtAnio.requestFocus();
                        break;
                    case R.id.mod1_p11_rbNo:
                        lytEdit2.setVisibility(View.VISIBLE);
                        lytEdit1.setVisibility(View.GONE);
                        edtMes.requestFocus();
                        break;
                }
            }
        });

        rgAnio.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) rgAnio.setBackgroundColor(Color.CYAN);
                else rgAnio.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        edtAnio.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtAnio);
                    lytP12.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edtMes.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtMes);
                    lytP12.requestFocus();
                    return true;
                }
                return false;
            }
        });

        lytFondoSpinner.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) lytFondoSpinner.setBackgroundResource(R.drawable.caja_texto_enabled);
                else lytFondoSpinner.setBackgroundResource(R.drawable.cajas_de_texto);
            }
        });

        spTipoVia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifique.setVisibility(View.GONE);
                switch (pos){
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:break;
                    case 5:break;
                    case 6:
                        edtEspecifique.setVisibility(View.VISIBLE);
                        edtEspecifique.requestFocus();
                        break;
                }
                if (pos > 0 && pos < 6) edtVia.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


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
