package com.example.fashionshop.dialogs;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import com.example.fashionshop.R;
import com.example.fashionshop.utils.Communicator;

public class CouponCodesDialog extends DialogFragment implements View.OnClickListener {

    Communicator comm;
    Bundle bundle;
    Button ok;

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
        View view = inflater.inflate(R.layout.dialog_layout_coupon_codes, null);
        ok = (Button) view.findViewById(R.id.ok);
        ok.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ok) {
            dismiss();
        }
    }
}
