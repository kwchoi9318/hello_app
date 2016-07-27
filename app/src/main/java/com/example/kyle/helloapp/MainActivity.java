package com.example.kyle.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText et_first_num, et_second_num;
    Button bt_add, bt_subtract, bt_multiply, bt_divide, bt_rest, bt_equal;
    TextView tv_result;
    private int calcResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_first_num = (EditText) findViewById(R.id.et_first_num);
        et_second_num = (EditText) findViewById(R.id.et_second_num);
        bt_add = (Button) findViewById(R.id.bt_add);
        bt_multiply = (Button) findViewById(R.id.bt_multiply);
        bt_divide = (Button) findViewById(R.id.bt_divide);
        bt_rest = (Button) findViewById(R.id.bt_rest);
        bt_equal = (Button) findViewById(R.id.bt_equal);
        bt_subtract = (Button) findViewById(R.id.bt_subtract);
        tv_result = (TextView) findViewById(R.id.tv_result);
        bt_add.setOnClickListener(this);
        bt_subtract.setOnClickListener(this);
        bt_multiply.setOnClickListener(this);
        bt_divide.setOnClickListener(this);
        bt_rest.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_add:
                Toast.makeText(MainActivity.this,et_first_num.getText().toString(),Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,et_second_num.getText().toString(),Toast.LENGTH_LONG);
                 this.setCalcResult(
                        Integer.parseInt(et_first_num.getText().toString())
                                + Integer.parseInt(et_second_num.getText().toString())); break;
            case R.id.bt_subtract:
                Toast.makeText(MainActivity.this,et_first_num.getText().toString(),Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,et_second_num.getText().toString(),Toast.LENGTH_LONG);
                this.setCalcResult(
                        Integer.parseInt(et_first_num.getText().toString())
                                - Integer.parseInt(et_second_num.getText().toString())); break;
            case R.id.bt_multiply:
                Toast.makeText(MainActivity.this,et_first_num.getText().toString(),Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,et_second_num.getText().toString(),Toast.LENGTH_LONG);
                this.setCalcResult(
                        Integer.parseInt(et_first_num.getText().toString())
                                * Integer.parseInt(et_second_num.getText().toString())); break;
            case R.id.bt_divide:
                Toast.makeText(MainActivity.this,et_first_num.getText().toString(),Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,et_second_num.getText().toString(),Toast.LENGTH_LONG);
                this.setCalcResult(
                        Integer.parseInt(et_first_num.getText().toString())
                                / Integer.parseInt(et_second_num.getText().toString())); break;
            case R.id.bt_rest:
                Toast.makeText(MainActivity.this,et_first_num.getText().toString(),Toast.LENGTH_LONG);
                Toast.makeText(MainActivity.this,et_second_num.getText().toString(),Toast.LENGTH_LONG);
                this.setCalcResult(
                        Integer.parseInt(et_first_num.getText().toString())
                                % Integer.parseInt(et_second_num.getText().toString())); break;
            case R.id.bt_equal:
                this.tv_result.setText("계산결과:"+this.getCalcResult());
                break;
        }
    }

    public int getCalcResult() {
        return calcResult;
    }

    public void setCalcResult(int calcResult) {
        this.calcResult = calcResult;
    }
}
