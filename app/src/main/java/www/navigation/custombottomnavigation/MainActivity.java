package www.navigation.custombottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private FloatingActionButton fButton;
    private BottomNavigationView mBtmView;
    private int mMenuId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fButton = findViewById(R.id.float_action);
        mBtmView = findViewById(R.id.customBottomBar);
        mBtmView.setOnNavigationItemSelectedListener(this);
        mBtmView.getMenu().findItem(R.id.action_home).setChecked(true);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // uncheck the other items.
        mMenuId = item.getItemId();
        for (int i = 0; i < mBtmView.getMenu().size(); i++) {
            MenuItem menuItem = mBtmView.getMenu().getItem(i);
            boolean isChecked = menuItem.getItemId() == item.getItemId();
            menuItem.setChecked(isChecked);
        }

        switch (item.getItemId()) {
            case R.id.action_home: {
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.action_service: {
                Toast.makeText(this, "Service", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.action_list: {
                Toast.makeText(this, "List", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.action_setting: {
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
            }
            break;
        }
        return true;
    }

    public void floatHome(View view) {
        Toast.makeText(this,"Float Button",Toast.LENGTH_SHORT).show();
    }
}
