package com.example.fashionshop.dialogs;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.fashionshop.R;
import com.example.fashionshop.ui.CheckoutActivity;
import com.example.fashionshop.utils.Communicator;

public class MoneyAddedDialog extends DialogFragment implements View.OnClickListener {

    Communicator comm;
    Bundle bundle;
    Button ok;
    double cart_total;
    TextView money_tv;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity a;

        if (context instanceof Activity){
            a=(Activity) context;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        bundle = getArguments();
        cart_total = bundle.getDouble("wallet_value");
        View view = inflater.inflate(R.layout.dialog_layout_wallet_money_added, null);
        ok = (Button) view.findViewById(R.id.ok_money_added_button);
        money_tv = (TextView) view.findViewById(R.id.money_added_text);
        money_tv.setText("Your Wallet has been updated to \nRs. " + cart_total + "\n\nHappy Shopping !!");
        ok.setOnClickListener(this);
        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ok_money_added_button) {
            dismiss();
            Intent intent = new Intent(getActivity(), CheckoutActivity.class);
            intent.putExtras(bundle);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}
