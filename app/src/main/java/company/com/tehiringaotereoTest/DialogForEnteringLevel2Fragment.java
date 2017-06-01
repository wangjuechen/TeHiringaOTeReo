package company.com.tehiringaotereoTest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;


public class DialogForEnteringLevel2Fragment extends DialogFragment implements View.OnClickListener{
    private Dialog dialog;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), R.style.translucentDialog));

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.dialogforenteringlevel2, null);

        builder.setView(view);

        dialog = builder.create();

        view.findViewById(R.id.btn_closeDialog).setOnClickListener(this);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        return dialog;

        }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_closeDialog){
            dialog.cancel();
        }
    }
}

