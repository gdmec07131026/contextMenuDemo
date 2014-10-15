package cn.edu.gdmec07131026.contextmenudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTv;
	EditText mtEd;
	final static int CONTEXT_MENU_1 = Menu.FIRST;
	final static int CONTEXT_MENU_2 = Menu.FIRST;
	final static int CONTEXT_MENU_3 = Menu.FIRST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv = (TextView) findViewById(R.id.textView1);
        mtEd = (EditText) findViewById(R.id.editText1);
        registerForContextMenu(mtEd);
    }

    @Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
    	myTv.setText("Äãµã»÷²Ëµ¥"+item.getTitle() + "   ");
		return super.onContextItemSelected(item);
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		menu.setHeaderTitle("¿ì½Ý²Ëµ¥");
		menu.add(0,CONTEXT_MENU_1,0,"²Ëµ¥1");
		menu.add(0,CONTEXT_MENU_2,1,"²Ëµ¥2");
		menu.add(0,CONTEXT_MENU_3,2,"²Ëµ¥3");
		super.onCreateContextMenu(menu, v, menuInfo);
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
