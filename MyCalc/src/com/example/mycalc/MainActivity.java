package com.example.mycalc;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener
{
	TextView t1;
	TextView t2;
	TextView t3;
	TextView t4;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	EditText e1;
	EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(TextView) findViewById(R.id.t4);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Float c=(float) 0;
		String n1=e1.getText().toString();
		String n2=e2.getText().toString();
		if (TextUtils.isEmpty(n1) || TextUtils.isEmpty(n2))
		{
	    return;
	    }
		Float a=Float.parseFloat(n1);
		Float b=Float.parseFloat(n2);
			switch (v.getId())
			{
				case R.id.b1:
					c=a+b;
				break;
				case R.id.b2:
					c=a-b;
				break;
				case R.id.b3:
					c=a*b;
				break;
				case R.id.b4:
						c=a/b;
				break;
				default:
				break;
			}
			t4.setText("Result = "+String.valueOf(c));
	}
}
