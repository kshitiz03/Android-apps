package com.example.android.ps2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.checked;
import static android.R.attr.name;
import static android.R.attr.order;
import static android.R.id.message;
import static android.R.id.toggle;
import static com.example.android.ps2.R.id.cb;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txt = (EditText) findViewById(R.id.tf);
        txt.setEllipsize(TextUtils.TruncateAt.END);
        txt.setSingleLine(true);
    }
    int quantity,c=0;


    public void updateAdd(View view) {
        quantity+=1;
        display(quantity);
    }
    public void updateSub(View view) {
        if (quantity > 0) {
            quantity -= 1;
            display(quantity);
        }
    }
    public int calcprice(int quan) {
        return quan*5;
    }

    public void notun(View view){
        String store;
        quantity=0;
        display(quantity);
        CheckBox ch=(CheckBox) findViewById(R.id.cb);
        ch.setChecked(false);
        CheckBox che=(CheckBox) findViewById(R.id.cs);
        che.setChecked(false);

        EditText txt = (EditText) findViewById(R.id.tf);
        txt.setText("");
        displayMess(0);
    }
    public void submitOrder(View view){
        displayMess(1);
    }
    public void displayMess(int n){
        String name,msg,msg1,store;

        if(n!=0) {
            int pric = calcprice(quantity);
            msg = "Add whipped cream? ";
            msg1="Add choclate syrup?";
            EditText txt = (EditText) findViewById(R.id.tf);
            store = String.valueOf(txt.getText());
            CheckBox ch=(CheckBox) findViewById(R.id.cb);
            boolean checked=ch.isChecked();
            if(checked){pric+=1*quantity;}
            CheckBox che=(CheckBox) findViewById(R.id.cs);
            boolean check=che.isChecked();
            if(check){pric+=2*quantity;}
            name = "ORDER SUMMARY:" + "\n" + "Name = " + store + "\n" + "No of cups = " + quantity + "\n" + msg  + checked + "\n" + msg1 + check +"\n" + "Total cost = " + pric + "\n" + "Thank you!!!";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, "as.rm03@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "coffee order summary");
            intent.putExtra(Intent. EXTRA_TEXT,name);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        else{
            name="";
        }
       // TextView quantityTextView = (TextView) findViewById(R.id.displayMessage);
      //  quantityTextView.setText(name);
    }

    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));
    }


}