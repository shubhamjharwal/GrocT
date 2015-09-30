package tjs.co.in.groct;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;


import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private SliderLayout mDemoSlider;

    String TITLES[] = {"Home", "MyCart", "Beverages", "Vegetables", "Personal Care", "Household", "Party Time ", "Help & Support"};
    int ICONS[] = {R.drawable.home, R.drawable.cart, R.drawable.beverages, R.drawable.vagetables, R.drawable.personal, R.drawable.household, R.drawable.party, R.drawable.four};

    String NAME = "shubham jharwal";
    String EMAIL = "shubham@tjs.co.in";
    int PROFILE;

    private Toolbar toolbar;

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    DrawerLayout Drawer;

    ActionBarDrawerToggle mDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // The number of Columns
        mLayoutManager = new GridLayoutManager(this, 1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new GridAdapter();
        mRecyclerView.setAdapter(mAdapter);


        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        SliderLayout slideshow = (SliderLayout) findViewById(R.id.slider);

        TextSliderView demoSlider = new TextSliderView(this);
        TextSliderView demoSlider1 = new TextSliderView(this);
        TextSliderView demoSlider2 = new TextSliderView(this);
        TextSliderView demoSlider3 = new TextSliderView(this);
        demoSlider.description("Mind,Body & Soul")
                .image(R.drawable.one);
        slideshow.addSlider(demoSlider);
        demoSlider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Intent intent = new Intent(MainActivity.this,One.class);
                startActivity(intent);

            }
        });

        demoSlider1.description("Go with the flavor")
                .image(R.drawable.two);
        slideshow.addSlider(demoSlider1);
        demoSlider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Intent intent1 = new Intent(MainActivity.this,Two.class);
                startActivity(intent1);


            }
        });

        demoSlider2.description("Juice Cocktail")
                .image(R.drawable.three);
        slideshow.addSlider(demoSlider2);
        demoSlider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Intent intent2 = new Intent(MainActivity.this,Three.class);
                startActivity(intent2);


            }
        });

        demoSlider3.description("Wow!!")
                .image(R.drawable.four);
        slideshow.addSlider(demoSlider3);
        demoSlider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Intent intent3 = new Intent(MainActivity.this,Four.class);
                startActivity(intent3);

            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView); // Assigning the RecyclerView Object to the xml View

        mRecyclerView.setHasFixedSize(true);                            // Letting the system know that the list objects are of fixed size

        mAdapter = new MyAdapter(TITLES, ICONS, NAME, EMAIL, PROFILE, this);       // Creating the Adapter of MyAdapter class(which we are going to see in a bit)
        // And passing the titles,icons,header view name, header view email,
        // and header view profile picture

        mRecyclerView.setAdapter(mAdapter);                              // Setting the adapter to RecyclerView

        mLayoutManager = new LinearLayoutManager(this);                 // Creating a layout Manager

        mRecyclerView.setLayoutManager(mLayoutManager);                 // Setting the layout Manager


        Drawer = (DrawerLayout) findViewById(R.id.DrawerLayout);        // Drawer object Assigned to the view
        mDrawerToggle = new ActionBarDrawerToggle(this, Drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // code here will execute once the drawer is opened( As I dont want anything happened whe drawer is
                // open I am not going to put anything here)
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Code here will execute once drawer is closed
            }


        };

        Drawer.setDrawerListener(mDrawerToggle); // Drawer Listener set to the Drawer toggle
        mDrawerToggle.syncState();// Finally we set the drawer toggle sync State


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {

            case R.id.cart:
                Intent intent = new Intent(MainActivity.this, Cart.class);
                startActivity(intent);
                return true;
            case R.id.search:
                Intent intent1 = new Intent(MainActivity.this, Search.class);
                startActivity(intent1);
                return true;
            case R.id.My_Cart:
                Intent intent2 = new Intent(MainActivity.this, Cart.class);
                startActivity(intent2);
                return true;
            case R.id.My_Wishlist:
                Intent intent3 = new Intent(MainActivity.this, My_wishlist.class);
                startActivity(intent3);
                return true;
            case R.id.My_Orders:
                Intent intent4 = new Intent(MainActivity.this, Myorders.class);
                startActivity(intent4);
                return true;
            case R.id.about_us:
                Intent intent5 = new Intent(MainActivity.this, About_us.class);
                startActivity(intent5);
                return true;
            case R.id.help_center:
                Intent intent6 = new Intent(MainActivity.this, Helpline.class);
                startActivity(intent6);
                return true;
            case R.id.My_profile:
                Intent intent7 = new Intent(MainActivity.this, Myprofile.class);
                startActivity(intent7);
                return true;


        }




        return super.onOptionsItemSelected(item);
    }


}

