package com.moengage.pushbase.internal.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.annotation.Keep;
import androidx.fragment.app.n;
import hh.g;
import ij.a;
import java.util.Calendar;
import k.c;
import ni.r;
@Keep
/* loaded from: classes.dex */
public class DatePickerFragment extends n implements DatePickerDialog.OnDateSetListener {
    private static final String TAG = "PushBase_6.6.0_DatePickerFragment";
    private a dateSelectedListener;

    public static /* synthetic */ String lambda$onCancel$1() {
        return "PushBase_6.6.0_DatePickerFragment onCancel() : Dialog cancelled.";
    }

    public static /* synthetic */ String lambda$onDateSet$0() {
        return "PushBase_6.6.0_DatePickerFragment onDateSet() : Date selected.";
    }

    public static /* synthetic */ String lambda$onDismiss$2() {
        return "PushBase_6.6.0_DatePickerFragment onDismiss() : Dialog dismissed.";
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        g.c(new r(17));
        super.onCancel(dialogInterface);
        this.dateSelectedListener.onDateDialogCancelled();
    }

    @Override // androidx.fragment.app.n
    public Dialog onCreateDialog(Bundle bundle) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(new c(getActivity(), 16973934), this, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
        return datePickerDialog;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i6, int i10, int i11) {
        g.c(new r(18));
        this.dateSelectedListener.onDateSelected(i6, i10, i11);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        g.c(new r(19));
        super.onDismiss(dialogInterface);
    }

    public void setDateSelectedListener(a aVar) {
        this.dateSelectedListener = aVar;
    }
}
