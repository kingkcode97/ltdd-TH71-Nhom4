package com.example.fashionshop.dialogs;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import com.example.fashionshop.R;
import com.example.fashionshop.tasks.DeleteCartItemByIdTask;
import com.example.fashionshop.utils.Commons;
import com.example.fashionshop.utils.Communicator;

public class SimpleDialogClass extends DialogFragment implements View.OnClickListener {

    Bundle bundle;
    Button yes, no;
    Communicator comm;
    int cart_item_id;

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
        View view = inflater.inflate(R.layout.dialog_layout, null);
        yes = (Button) view.findViewById(R.id.deleteQueryYes);
        no = (Button) view.findViewById(R.id.deleteQueryNo);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        setCancelable(false);
        return view;
    }


    @Override
    public void onClick(View v) {
        try {
            if (v.getId() == R.id.deleteQueryYes) {
                cart_item_id = bundle.getInt("cart_item_id");

                DeleteCartItemByIdTask deleteCartItemByIdTask = new DeleteCartItemByIdTask(getActivity().getApplicationContext(), cart_item_id);
                deleteCartItemByIdTask.execute().get();

                Commons.cartItemCount--;
                // Toast.makeText(getActivity(),"CartItem Deleted",Toast.LENGTH_SHORT).show();
                bundle.clear();
                comm.dialogMessage("Yes Was Clicked with position");
                dismiss();
            } else {
                dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show(FragmentManager fragmentManager, String delete_cart_item) {
    }
}