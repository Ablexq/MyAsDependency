package com.xq.myasdependency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.xq.myasdependency.popwindow.PopItemAction;
import com.xq.myasdependency.popwindow.PopWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PopItemAction item1 = new PopItemAction("item1", PopItemAction.PopItemStyle.Normal, new PopItemAction.OnClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "item1", Toast.LENGTH_SHORT).show();
            }
        });
        PopItemAction item2 = new PopItemAction("item2", PopItemAction.PopItemStyle.Normal, new PopItemAction.OnClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this,
                        "item2", Toast.LENGTH_SHORT).show();
            }
        });
        PopItemAction item3 = new PopItemAction("item3",
                PopItemAction.PopItemStyle.Cancel,
                new PopItemAction.OnClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        PopWindow.Builder builder = new PopWindow.Builder(this)
                .addItemAction(item1)
                .addItemAction(item2)
                .addItemAction(item3);
        builder.show();
    }
}
