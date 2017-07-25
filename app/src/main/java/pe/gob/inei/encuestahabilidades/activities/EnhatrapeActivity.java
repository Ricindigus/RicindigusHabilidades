package pe.gob.inei.encuestahabilidades.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.adapters.ExpandListAdapter;
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

public class EnhatrapeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private ArrayList<String> listDataHeader;
    private ExpandableListView expListView;
    private HashMap<String, List<String>> listDataChild;
    private ExpandListAdapter listAdapter;
    private ViewPager pager;
    private Button btnSkip, btnNext;
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enhatrape);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnSkip = (Button) findViewById(R.id.btn_anterior);
        btnNext = (Button) findViewById(R.id.btn_siguiente);
        pager = (ViewPager) findViewById(R.id.container_enhatrape);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                launchHomeScreen();
                int current = pager.getCurrentItem() - 1;
                if (current > -1) {
                    // move to next screen
                    pager.setCurrentItem(current);}
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checking for last page
                // if last page home screen will be launched
                int current = pager.getCurrentItem() + 1;
                if (current < myPagerAdapter.getCount()) {
                    // move to next screen
                    pager.setCurrentItem(current);}
            }
        });

        setSupportActionBar(toolbar);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(myPagerAdapter);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        enableExpandableList();

        pager.setCurrentItem(3);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.enhatrape, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_marco) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void enableExpandableList() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        expListView = (ExpandableListView) findViewById(R.id.left_drawer);

        prepareListData(listDataHeader, listDataChild);
        listAdapter = new ExpandListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                // Temporary code:

                // till here
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition)+ "\n"+groupPosition, Toast.LENGTH_SHORT)
//                        .show();
                switch (groupPosition){
                    case 0:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(3);break;
                            case 1: pager.setCurrentItem(4);break;
                            case 2: pager.setCurrentItem(5);break;
                        }
                        break;
                    case 1:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(6);break;
                            case 1: pager.setCurrentItem(7);break;
                            case 2: pager.setCurrentItem(8);break;
                            case 3: pager.setCurrentItem(9);break;
                            case 4: pager.setCurrentItem(10);break;
                            case 5: pager.setCurrentItem(11);break;
                            case 6: pager.setCurrentItem(12);break;
                        }
                        break;
                    case 2:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(13);break;
                            case 1: pager.setCurrentItem(14);break;
                            case 2: pager.setCurrentItem(15);break;
                        }
                        break;
                    case 3:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(16);break;
                            case 1: pager.setCurrentItem(17);break;
                            case 2: pager.setCurrentItem(18);break;
                        }
                        break;
                    case 4:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(19);break;
                            case 1: pager.setCurrentItem(20);break;
                            case 2: pager.setCurrentItem(21);break;
                            case 3: pager.setCurrentItem(22);break;
                            case 4: pager.setCurrentItem(23);break;
                            case 5: pager.setCurrentItem(24);break;
                        }
                        break;
                    case 5:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(25);break;
                            case 1: pager.setCurrentItem(26);break;
                            case 2: pager.setCurrentItem(27);break;
                            case 3: pager.setCurrentItem(28);break;
                        }
                        break;
                    case 6:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(29);break;
                            case 1: pager.setCurrentItem(30);break;
                            case 2: pager.setCurrentItem(31);break;
                            case 3: pager.setCurrentItem(32);break;
                            case 4: pager.setCurrentItem(33);break;
                            case 5: pager.setCurrentItem(34);break;
                            case 6: pager.setCurrentItem(35);break;
                            case 7: pager.setCurrentItem(36);break;
                            case 8: pager.setCurrentItem(37);break;
                            case 9: pager.setCurrentItem(38);break;
                            case 10: pager.setCurrentItem(39);break;
                            case 11: pager.setCurrentItem(40);break;
                            case 12: pager.setCurrentItem(41);break;
                            case 13: pager.setCurrentItem(42);break;
                            case 14: pager.setCurrentItem(43);break;
                            case 15: pager.setCurrentItem(44);break;
                            case 16: pager.setCurrentItem(45);break;
                        }
                        break;
                    case 7:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(46);break;
                            case 1: pager.setCurrentItem(47);break;
                            case 2: pager.setCurrentItem(48);break;
                            case 3: pager.setCurrentItem(49);break;
                            case 4: pager.setCurrentItem(50);break;
                            case 5: pager.setCurrentItem(51);break;
                            case 6: pager.setCurrentItem(52);break;
                            case 7: pager.setCurrentItem(53);break;
                            case 8: pager.setCurrentItem(54);break;
                            case 9: pager.setCurrentItem(55);break;
                        }
                        break;
                    case 8:
                        switch (childPosition){
                            case 0: pager.setCurrentItem(56);break;
                        }
                        break;
                }
                return false;
            }
        });
    }
    private void prepareListData(List<String> listDataHeader, Map<String, List<String>> listDataChild) {

        // Adding child data
        listDataHeader.add("MÓDULO I");listDataHeader.add("MÓDULO II");listDataHeader.add("MÓDULO III");
        listDataHeader.add("MÓDULO IV");listDataHeader.add("MÓDULO V");listDataHeader.add("MÓDULO VI");
        listDataHeader.add("MÓDULO VII");listDataHeader.add("MÓDULO VIII");listDataHeader.add("MÓDULO IX");

        // Adding child data
        List<String> modulo1 = new ArrayList<String>();
        modulo1.add("Módulo I: P1 - P4");modulo1.add("Módulo I: P5 - P8");modulo1.add("Módulo I: P9 - P12");


        List<String> modulo2 = new ArrayList<String>();
        modulo2.add("Módulo II: P1 - P5");modulo2.add("Módulo II: P6 - P9");modulo2.add("Módulo II: P10 - P11");
        modulo2.add("Módulo II: P12 - P13");modulo2.add("Módulo II: P14 - P17");modulo2.add("Módulo II: P18 - P20");
        modulo2.add("Módulo II: P21 - P25");

        List<String> modulo3 = new ArrayList<String>();
        modulo3.add("Módulo III: P1 - P6");modulo3.add("Módulo III: P7 - P10");modulo3.add("Módulo III: P11 - P12");

        List<String> modulo4 = new ArrayList<String>();
        modulo4.add("Módulo IV: P1 - P3");modulo4.add("Módulo IV: P4 - P7");modulo4.add("Módulo IV: P8 - P10");

        List<String> modulo5 = new ArrayList<String>();
        modulo5.add("Módulo V: P1");modulo5.add("Módulo V: P2");modulo5.add("Módulo V: P3");
        modulo5.add("Módulo V: P4 - P6");modulo5.add("Módulo V: P7");modulo5.add("Módulo V: P8 - P27");

        List<String> modulo6 = new ArrayList<String>();
        modulo6.add("Módulo VI: P1 - P3");modulo6.add("Módulo VI: P4 - P5");modulo6.add("Módulo VI: P6 - P7");
        modulo6.add("Módulo VI: P8 - P11");

        List<String> modulo7 = new ArrayList<String>();
        modulo7.add("Módulo VII: P1 - P4");modulo7.add("Módulo VII: P5 - P7");modulo7.add("Módulo VII: P8");
        modulo7.add("Módulo VII: P9");modulo7.add("Módulo VII: P10 - P14");modulo7.add("Módulo VII: P15 - P17");
        modulo7.add("Módulo VII: P18");modulo7.add("Módulo VII: P19 - P21");modulo7.add("Módulo VII: P22");
        modulo7.add("Módulo VII: P23 - P25");modulo7.add("Módulo VII: P26");modulo7.add("Módulo VII: P27 - P30");
        modulo7.add("Módulo VII: P31");modulo7.add("Módulo VII: P32 - P36");modulo7.add("Módulo VII: P37 - P39");
        modulo7.add("Módulo VII: P40 - P43");modulo7.add("Módulo VII: P44 - P46");

        List<String> modulo8 = new ArrayList<String>();
        modulo8.add("Módulo VIII: P1");modulo8.add("Módulo VIII: P2");modulo8.add("Módulo VIII: P3");
        modulo8.add("Módulo VIII: P4");modulo8.add("Módulo VIII: P5");modulo8.add("Módulo VIII: P6");
        modulo8.add("Módulo VIII: P7");modulo8.add("Módulo VIII: P8");modulo8.add("Módulo VIII: P9");
        modulo8.add("Módulo VIII: P10");

        List<String> modulo9 = new ArrayList<String>();
        modulo9.add("Módulo IX: P1 - P3");



        listDataChild.put(listDataHeader.get(0), modulo1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), modulo2);
        listDataChild.put(listDataHeader.get(2), modulo3);
        listDataChild.put(listDataHeader.get(3), modulo4);
        listDataChild.put(listDataHeader.get(4), modulo5);
        listDataChild.put(listDataHeader.get(5), modulo6);
        listDataChild.put(listDataHeader.get(6), modulo7);
        listDataChild.put(listDataHeader.get(7), modulo8);
        listDataChild.put(listDataHeader.get(8), modulo9);

    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {

            switch(pos) {
                case 0: return new InicioFragment();
                case 1: return new CaratulaFragment();
                case 2: return new VisitaFragment();
                
                case 3: return new Modulo1Fragment1();
                case 4: return new Modulo1Fragment2();
                case 5: return new Modulo1Fragment3();
                
                case 6: return new Modulo2Fragment1();
                case 7: return new Modulo2Fragment2();
                case 8: return new Modulo2Fragment3();
                case 9: return new Modulo2Fragment4();
                case 10: return new Modulo2Fragment5();
                case 11: return new Modulo2Fragment6();
                case 12: return new Modulo2Fragment7();

                case 13: return new Modulo3Fragment1();
                case 14: return new Modulo3Fragment2();
                case 15: return new Modulo3Fragment3();

                case 16: return new Modulo4Fragment1();
                case 17: return new Modulo4Fragment2();
                case 18: return new Modulo4Fragment3();

                case 19: return new Modulo5Fragment1();
                case 20: return new Modulo5Fragment2();
                case 21: return new Modulo5Fragment3();
                case 22: return new Modulo5Fragment4();
                case 23: return new Modulo5Fragment5();
                case 24: return new Modulo5Fragment6();

                case 25: return new Modulo6Fragment1();
                case 26: return new Modulo6Fragment2();
                case 27: return new Modulo6Fragment3();
                case 28: return new Modulo6Fragment4();

                case 29: return new Modulo7Fragment1();
                case 30: return new Modulo7Fragment2();
                case 31: return new Modulo7Fragment3();
                case 32: return new Modulo7Fragment4();
                case 33: return new Modulo7Fragment5();
                case 34: return new Modulo7Fragment6();
                case 35: return new Modulo7Fragment7();
                case 36: return new Modulo7Fragment8();
                case 37: return new Modulo7Fragment9();
                case 38: return new Modulo7Fragment10();
                case 39: return new Modulo7Fragment11();
                case 40: return new Modulo7Fragment12();
                case 41: return new Modulo7Fragment13();
                case 42: return new Modulo7Fragment14();
                case 43: return new Modulo7Fragment15();
                case 44: return new Modulo7Fragment16();
                case 45: return new Modulo7Fragment17();

                case 46: return new Modulo8Fragment1();
                case 47: return new Modulo8Fragment2();
                case 48: return new Modulo8Fragment3();
                case 49: return new Modulo8Fragment4();
                case 50: return new Modulo8Fragment5();
                case 51: return new Modulo8Fragment6();
                case 52: return new Modulo8Fragment7();
                case 53: return new Modulo8Fragment8();
                case 54: return new Modulo8Fragment9();
                case 55: return new Modulo8Fragment10();

                case 56: return new Modulo9Fragment1();

                default: return new InicioFragment();
            }
        }

        @Override
        public int getCount() {
            return 57;
        }

    }
//    public void pager.setFragment(int pos){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        switch (pos){
//            case 0:
//                CaratulaFragment caratulaFragment = new CaratulaFragment();
//                fragmentTransaction.replace(R.id.container_enhatrape, caratulaFragment);
//                break;
//            case 1:
//                VisitaFragment visitaFragment = new VisitaFragment();
//                fragmentTransaction.replace(R.id.container_enhatrape, visitaFragment);
//                break;
//            case 2:
//                InicioFragment inicioFragment = new InicioFragment();
//                fragmentTransaction.replace(R.id.container_enhatrape, inicioFragment);
//                break;
//            case 3:
//                Modulo1Fragment1 modulo1Fragment1 = new Modulo1Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo1Fragment1);
//                break;
//            case 4:
//                Modulo1Fragment2 modulo1Fragment2= new Modulo1Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo1Fragment2);
//                break;
//            case 5:
//                Modulo1Fragment3 modulo1Fragment3= new Modulo1Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo1Fragment3);
//                break;
//            case 6:
//                Modulo2Fragment1 modulo2Fragment1= new Modulo2Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment1);
//                break;
//            case 7:
//                Modulo2Fragment2 modulo2Fragment2 = new Modulo2Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment2);
//                break;
//            case 8:
//                Modulo2Fragment3 modulo2Fragment3 = new Modulo2Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment3);
//                break;
//            case 9:
//                Modulo2Fragment4 modulo2Fragment4 = new Modulo2Fragment4();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment4);
//                break;
//            case 10:
//                Modulo2Fragment5 modulo2Fragment5 = new Modulo2Fragment5();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment5);
//                break;
//            case 11:
//                Modulo2Fragment6 modulo2Fragment6 = new Modulo2Fragment6();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment6);
//                break;
//            case 12:
//                Modulo2Fragment7 modulo2Fragment7 = new Modulo2Fragment7();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo2Fragment7);
//                break;
//            case 13:
//                Modulo3Fragment1 modulo3Fragment1 = new Modulo3Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo3Fragment1);
//                break;
//            case 14:
//                Modulo3Fragment2 modulo3Fragment2 = new Modulo3Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo3Fragment2);
//                break;
//            case 15:
//                Modulo3Fragment3 modulo3Fragment3 = new Modulo3Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo3Fragment3);
//                break;
//            case 16:
//                Modulo4Fragment1 modulo4Fragment1 = new Modulo4Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo4Fragment1);
//                break;
//            case 17:
//                Modulo4Fragment2 modulo4Fragment2 = new Modulo4Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo4Fragment2);
//                break;
//            case 18:
//                Modulo4Fragment3 modulo4Fragment3 = new Modulo4Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo4Fragment3);
//                break;
//            case 19:
//                Modulo5Fragment1 modulo5Fragment1 = new Modulo5Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo5Fragment1);
//                break;
//            case 20:
//                Modulo5Fragment2 modulo5Fragment2 = new Modulo5Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo5Fragment2);
//                break;
//            case 21:
//                Modulo5Fragment3 modulo5Fragment3 = new Modulo5Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo5Fragment3);
//                break;
//            case 22:
//                Modulo5Fragment4 modulo5Fragment4 = new Modulo5Fragment4();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo5Fragment4);
//                break;
//            case 23:
//                Modulo5Fragment5 modulo5Fragment5 = new Modulo5Fragment5();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo5Fragment5);
//                break;
//            case 24:
//                Modulo5Fragment6 modulo5Fragment6 = new Modulo5Fragment6();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo5Fragment6);
//                break;
//            case 25:
//                Modulo6Fragment1 modulo6Fragment1 = new Modulo6Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo6Fragment1);
//                break;
//            case 26:
//                Modulo6Fragment2 modulo6Fragment2 = new Modulo6Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo6Fragment2);
//                break;
//            case 27:
//                Modulo6Fragment3 modulo6Fragment3 = new Modulo6Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo6Fragment3);
//                break;
//            case 28:
//                Modulo6Fragment4 modulo6Fragment4 = new Modulo6Fragment4();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo6Fragment4);
//                break;
//            case 29:
//                Modulo7Fragment1 modulo7Fragment1 = new Modulo7Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment1);
//                break;
//            case 30:
//                Modulo7Fragment2 modulo7Fragment2 = new Modulo7Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment2);
//                break;
//            case 31:
//                Modulo7Fragment3 modulo7Fragment3 = new Modulo7Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment3);
//                break;
//            case 32:
//                Modulo7Fragment4 modulo7Fragment4 = new Modulo7Fragment4();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment4);
//                break;
//            case 33:
//                Modulo7Fragment5 modulo7Fragment5 = new Modulo7Fragment5();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment5);
//                break;
//            case 34:
//                Modulo7Fragment6 modulo7Fragment6 = new Modulo7Fragment6();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment6);
//                break;
//            case 35:
//                Modulo7Fragment7 modulo7Fragment7 = new Modulo7Fragment7();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment7);
//                break;
//            case 36:
//                Modulo7Fragment8 modulo7Fragment8 = new Modulo7Fragment8();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment8);
//                break;
//            case 37:
//                Modulo7Fragment9 modulo7Fragment9 = new Modulo7Fragment9();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment9);
//                break;
//            case 38:
//                Modulo7Fragment10 modulo7Fragment10 = new Modulo7Fragment10();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment10);
//                break;
//            case 39:
//                Modulo7Fragment11 modulo7Fragment11 = new Modulo7Fragment11();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment11);
//                break;
//            case 40:
//                Modulo7Fragment12 modulo7Fragment12 = new Modulo7Fragment12();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment12);
//                break;
//            case 41:
//                Modulo7Fragment13 modulo7Fragment13 = new Modulo7Fragment13();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment13);
//                break;
//            case 42:
//                Modulo7Fragment14 modulo7Fragment14 = new Modulo7Fragment14();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment14);
//                break;
//            case 43:
//                Modulo7Fragment15 modulo7Fragment15 = new Modulo7Fragment15();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment15);
//                break;
//            case 44:
//                Modulo7Fragment16 modulo7Fragment16 = new Modulo7Fragment16();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment16);
//                break;
//            case 45:
//                Modulo7Fragment17 modulo7Fragment17 = new Modulo7Fragment17();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo7Fragment17);
//                break;
//            case 46:
//                Modulo8Fragment1 modulo8Fragment1 = new Modulo8Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment1);
//                break;
//            case 47:
//                Modulo8Fragment2 modulo8Fragment2 = new Modulo8Fragment2();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment2);
//                break;
//            case 48:
//                Modulo8Fragment3 modulo8Fragment3 = new Modulo8Fragment3();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment3);
//                break;
//            case 49:
//                Modulo8Fragment4 modulo8Fragment4 = new Modulo8Fragment4();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment4);
//                break;
//            case 50:
//                Modulo8Fragment5 modulo8Fragment5 = new Modulo8Fragment5();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment5);
//                break;
//            case 51:
//                Modulo8Fragment6 modulo8Fragment6 = new Modulo8Fragment6();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment6);
//                break;
//            case 52:
//                Modulo8Fragment7 modulo8Fragment7 = new Modulo8Fragment7();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment7);
//                break;
//            case 53:
//                Modulo8Fragment8 modulo8Fragment8 = new Modulo8Fragment8();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment8);
//                break;
//            case 54:
//                Modulo8Fragment9 modulo8Fragment9 = new Modulo8Fragment9();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment9);
//                break;
//            case 55:
//                Modulo8Fragment10 modulo8Fragment10 = new Modulo8Fragment10();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo8Fragment10);
//                break;
//            case 56:
//                Modulo9Fragment1 modulo9Fragment1 = new Modulo9Fragment1();
//                fragmentTransaction.replace(R.id.container_enhatrape, modulo9Fragment1);
//                break;
//        }
//        fragmentTransaction.commit();
//    }
}
