package pe.gob.inei.encuestahabilidades.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.fragments.CaratulaFragment;
import pe.gob.inei.encuestahabilidades.fragments.InicioFragment;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo5Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo6Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment10;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment11;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment12;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment13;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment14;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment15;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment16;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment17;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment8;
import pe.gob.inei.encuestahabilidades.fragments.Modulo7Fragment9;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo8Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo9Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.VisitaFragment;

public class EncuestaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("ENCUESTA HABILIDADES AL TRABAJO EN EL PERÚ");
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_encuesta);
        navigationView = (NavigationView)findViewById(R.id.navigation_view_encuesta);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                drawerLayout.closeDrawers();
                switch(item.getItemId()){
                    case R.id.opcion_1:
                        setFragment(0);
                        break;
                    case R.id.opcion_2:
                        setFragment(1);
                        break;
                    case R.id.opcion_3:
                        setFragment(2);
                        break;
                    case R.id.opcion_4:
                        setFragment(3);
                        break;
                    case R.id.opcion_5:
                        setFragment(4);
                        break;
                    case R.id.opcion_6:
                        setFragment(5);
                        break;
                    case R.id.opcion_7:
                        setFragment(6);
                        break;
                    case R.id.opcion_8:
                        setFragment(7);
                        break;
                    case R.id.opcion_9:
                        setFragment(8);
                        break;
                    case R.id.opcion_10:
                        setFragment(9);
                        break;
                    case R.id.opcion_11:
                        setFragment(10);
                        break;
                    case R.id.opcion_12:
                        setFragment(11);
                        break;
                    case R.id.opcion_13:
                        setFragment(12);
                        break;
                    case R.id.opcion_14:
                        setFragment(13);
                        break;
                    case R.id.opcion_15:
                        setFragment(14);
                        break;
                    case R.id.opcion_16:
                        setFragment(15);
                        break;
                    case R.id.opcion_17:
                        setFragment(16);
                        break;
                    case R.id.opcion_18:
                        setFragment(17);
                        break;
                    case R.id.opcion_19:
                        setFragment(18);
                        break;
                    case R.id.opcion_20:
                        setFragment(19);
                        break;
                    case R.id.opcion_21:
                        setFragment(20);
                        break;
                    case R.id.opcion_22:
                        setFragment(21);
                        break;
                    case R.id.opcion_23:
                        setFragment(22);
                        break;
                    case R.id.opcion_24:
                        setFragment(23);
                        break;
                    case R.id.opcion_25:
                        setFragment(24);
                        break;
                    case R.id.opcion_26:
                        setFragment(25);
                        break;
                    case R.id.opcion_27:
                        setFragment(26);
                        break;
                    case R.id.opcion_28:
                        setFragment(27);
                        break;
                    case R.id.opcion_29:
                        setFragment(28);
                        break;
                    case R.id.opcion_30:
                        setFragment(29);
                        break;
                    case R.id.opcion_31:
                        setFragment(30);
                        break;
                    case R.id.opcion_32:
                        setFragment(31);
                        break;
                    case R.id.opcion_33:
                        setFragment(32);
                        break;
                    case R.id.opcion_34:
                        setFragment(33);
                        break;
                    case R.id.opcion_35:
                        setFragment(34);
                        break;
                    case R.id.opcion_36:
                        setFragment(35);
                        break;
                    case R.id.opcion_37:
                        setFragment(36);
                        break;
                    case R.id.opcion_38:
                        setFragment(37);
                        break;
                    case R.id.opcion_39:
                        setFragment(38);
                        break;
                    case R.id.opcion_40:
                        setFragment(39);
                        break;
                    case R.id.opcion_41:
                        setFragment(40);
                        break;
                    case R.id.opcion_42:
                        setFragment(41);
                        break;
                    case R.id.opcion_43:
                        setFragment(42);
                        break;
                    case R.id.opcion_44:
                        setFragment(43);
                        break;
                    case R.id.opcion_45:
                        setFragment(44);
                        break;
                    case R.id.opcion_46:
                        setFragment(45);
                        break;
                    case R.id.opcion_47:
                        setFragment(46);
                        break;
                    case R.id.opcion_48:
                        setFragment(47);
                        break;
                    case R.id.opcion_49:
                        setFragment(48);
                        break;
                    case R.id.opcion_50:
                        setFragment(49);
                        break;
                    case R.id.opcion_51:
                        setFragment(50);
                        break;
                    case R.id.opcion_52:
                        setFragment(51);
                        break;
                    case R.id.opcion_53:
                        setFragment(52);
                        break;
                    case R.id.opcion_54:
                        setFragment(53);
                        break;
                    case R.id.opcion_55:
                        setFragment(54);
                        break;
                    case R.id.opcion_56:
                        setFragment(55);
                        break;
                    case R.id.opcion_57:
                        setFragment(56);
                        break;
                }
                return false;
            }
        });
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        setFragment(0);
    }
    public void setFragment(int pos){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (pos){
            case 0:
                CaratulaFragment caratulaFragment = new CaratulaFragment();
                fragmentTransaction.replace(R.id.container_encuesta, caratulaFragment);
                break;
            case 1:
                VisitaFragment visitaFragment = new VisitaFragment();
                fragmentTransaction.replace(R.id.container_encuesta, visitaFragment);
                break;
            case 2:
                InicioFragment inicioFragment = new InicioFragment();
                fragmentTransaction.replace(R.id.container_encuesta, inicioFragment);
                break;
            case 3:
                Modulo1Fragment1 modulo1Fragment1 = new Modulo1Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo1Fragment1);
                break;
            case 4:
                Modulo1Fragment2 modulo1Fragment2= new Modulo1Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo1Fragment2);
                break;
            case 5:
                Modulo1Fragment3 modulo1Fragment3= new Modulo1Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo1Fragment3);
                break;
            case 6:
                Modulo2Fragment1 modulo2Fragment1= new Modulo2Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment1);
                break;
            case 7:
                Modulo2Fragment2 modulo2Fragment2 = new Modulo2Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment2);
                break;
            case 8:
                Modulo2Fragment3 modulo2Fragment3 = new Modulo2Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment3);
                break;
            case 9:
                Modulo2Fragment4 modulo2Fragment4 = new Modulo2Fragment4();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment4);
                break;
            case 10:
                Modulo2Fragment5 modulo2Fragment5 = new Modulo2Fragment5();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment5);
                break;
            case 11:
                Modulo2Fragment6 modulo2Fragment6 = new Modulo2Fragment6();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment6);
                break;
            case 12:
                Modulo2Fragment7 modulo2Fragment7 = new Modulo2Fragment7();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment7);
                break;
            case 13:
                Modulo3Fragment1 modulo3Fragment1 = new Modulo3Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo3Fragment1);
                break;
            case 14:
                Modulo3Fragment2 modulo3Fragment2 = new Modulo3Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo3Fragment2);
                break;
            case 15:
                Modulo3Fragment3 modulo3Fragment3 = new Modulo3Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo3Fragment3);
                break;
            case 16:
                Modulo4Fragment1 modulo4Fragment1 = new Modulo4Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo4Fragment1);
                break;
            case 17:
                Modulo4Fragment2 modulo4Fragment2 = new Modulo4Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo4Fragment2);
                break;
            case 18:
                Modulo4Fragment3 modulo4Fragment3 = new Modulo4Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo4Fragment3);
                break;
            case 19:
                Modulo5Fragment1 modulo5Fragment1 = new Modulo5Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo5Fragment1);
                break;
            case 20:
                Modulo5Fragment2 modulo5Fragment2 = new Modulo5Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo5Fragment2);
                break;
            case 21:
                Modulo5Fragment3 modulo5Fragment3 = new Modulo5Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo5Fragment3);
                break;
            case 22:
                Modulo5Fragment4 modulo5Fragment4 = new Modulo5Fragment4();
                fragmentTransaction.replace(R.id.container_encuesta, modulo5Fragment4);
                break;
            case 23:
                Modulo5Fragment5 modulo5Fragment5 = new Modulo5Fragment5();
                fragmentTransaction.replace(R.id.container_encuesta, modulo5Fragment5);
                break;
            case 24:
                Modulo5Fragment6 modulo5Fragment6 = new Modulo5Fragment6();
                fragmentTransaction.replace(R.id.container_encuesta, modulo5Fragment6);
                break;
            case 25:
                Modulo6Fragment1 modulo6Fragment1 = new Modulo6Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo6Fragment1);
                break;
            case 26:
                Modulo6Fragment2 modulo6Fragment2 = new Modulo6Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo6Fragment2);
                break;
            case 27:
                Modulo6Fragment3 modulo6Fragment3 = new Modulo6Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo6Fragment3);
                break;
            case 28:
                Modulo6Fragment4 modulo6Fragment4 = new Modulo6Fragment4();
                fragmentTransaction.replace(R.id.container_encuesta, modulo6Fragment4);
                break;
            case 29:
                Modulo7Fragment1 modulo7Fragment1 = new Modulo7Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment1);
                break;
            case 30:
                Modulo7Fragment2 modulo7Fragment2 = new Modulo7Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment2);
                break;
            case 31:
                Modulo7Fragment3 modulo7Fragment3 = new Modulo7Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment3);
                break;
            case 32:
                Modulo7Fragment4 modulo7Fragment4 = new Modulo7Fragment4();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment4);
                break;
            case 33:
                Modulo7Fragment5 modulo7Fragment5 = new Modulo7Fragment5();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment5);
                break;
            case 34:
                Modulo7Fragment6 modulo7Fragment6 = new Modulo7Fragment6();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment6);
                break;
            case 35:
                Modulo7Fragment7 modulo7Fragment7 = new Modulo7Fragment7();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment7);
                break;
            case 36:
                Modulo7Fragment8 modulo7Fragment8 = new Modulo7Fragment8();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment8);
                break;
            case 37:
                Modulo7Fragment9 modulo7Fragment9 = new Modulo7Fragment9();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment9);
                break;
            case 38:
                Modulo7Fragment10 modulo7Fragment10 = new Modulo7Fragment10();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment10);
                break;
            case 39:
                Modulo7Fragment11 modulo7Fragment11 = new Modulo7Fragment11();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment11);
                break;
            case 40:
                Modulo7Fragment12 modulo7Fragment12 = new Modulo7Fragment12();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment12);
                break;
            case 41:
                Modulo7Fragment13 modulo7Fragment13 = new Modulo7Fragment13();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment13);
                break;
            case 42:
                Modulo7Fragment14 modulo7Fragment14 = new Modulo7Fragment14();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment14);
                break;
            case 43:
                Modulo7Fragment15 modulo7Fragment15 = new Modulo7Fragment15();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment15);
                break;
            case 44:
                Modulo7Fragment16 modulo7Fragment16 = new Modulo7Fragment16();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment16);
                break;
            case 45:
                Modulo7Fragment17 modulo7Fragment17 = new Modulo7Fragment17();
                fragmentTransaction.replace(R.id.container_encuesta, modulo7Fragment17);
                break;
            case 46:
                Modulo8Fragment1 modulo8Fragment1 = new Modulo8Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment1);
                break;
            case 47:
                Modulo8Fragment2 modulo8Fragment2 = new Modulo8Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment2);
                break;
            case 48:
                Modulo8Fragment3 modulo8Fragment3 = new Modulo8Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment3);
                break;
            case 49:
                Modulo8Fragment4 modulo8Fragment4 = new Modulo8Fragment4();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment4);
                break;
            case 50:
                Modulo8Fragment5 modulo8Fragment5 = new Modulo8Fragment5();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment5);
                break;
            case 51:
                Modulo8Fragment6 modulo8Fragment6 = new Modulo8Fragment6();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment6);
                break;
            case 52:
                Modulo8Fragment7 modulo8Fragment7 = new Modulo8Fragment7();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment7);
                break;
            case 53:
                Modulo8Fragment8 modulo8Fragment8 = new Modulo8Fragment8();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment8);
                break;
            case 54:
                Modulo8Fragment9 modulo8Fragment9 = new Modulo8Fragment9();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment9);
                break;
            case 55:
                Modulo8Fragment10 modulo8Fragment10 = new Modulo8Fragment10();
                fragmentTransaction.replace(R.id.container_encuesta, modulo8Fragment10);
                break;
            case 56:
                Modulo9Fragment1 modulo9Fragment1 = new Modulo9Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo9Fragment1);
                break;
        }
        fragmentTransaction.commit();
    }
}
