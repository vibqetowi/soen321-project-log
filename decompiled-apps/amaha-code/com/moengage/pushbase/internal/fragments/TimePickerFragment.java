package com.moengage.pushbase.internal.fragments;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import androidx.annotation.Keep;
import androidx.fragment.app.n;
import com.moengage.pushbase.internal.MoETimePickerDialog;
import hh.g;
import ij.c;
import java.util.Calendar;
import ni.r;
@Keep
/* loaded from: classes.dex */
public class TimePickerFragment extends n implements TimePickerDialog.OnTimeSetListener {
    private static final String TAG = "PushBase_6.6.0_TimePickerFragment";
    private c timeSelectedListener;

    public static /* synthetic */ String lambda$onCancel$1() {
        return "PushBase_6.6.0_TimePickerFragment onCancel() : Dialog cancelled.";
    }

    public static /* synthetic */ String lambda$onDismiss$2() {
        return "PushBase_6.6.0_TimePickerFragment onDismiss() : Dialog dismissed.";
    }

    public static /* synthetic */ String lambda$onTimeSet$0() {
        return "PushBase_6.6.0_TimePickerFragment onTimeSet() : Time set by user.";
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        g.c(new r(24));
        super.onCancel(dialogInterface);
        this.timeSelectedListener.onTimeDialogCancelled();
    }

    @Override // androidx.fragment.app.n
    public Dialog onCreateDialog(Bundle bundle) {
        Calendar calendar = Calendar.getInstance();
        MoETimePickerDialog moETimePickerDialog = new MoETimePickerDialog(new k.c(getActivity(), 16973934), this, calendar.get(10), calendar.get(12), DateFormat.is24HourFormat(getActivity()));
        moETimePickerDialog.setMin(calendar.get(10), calendar.get(12));
        return moETimePickerDialog;
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        g.c(new r(22));
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public void onTimeSet(TimePicker timePicker, int i6, int i10) {
        g.c(new r(23));
        this.timeSelectedListener.onTimeSelected(i6, i10);
    }

    public void setTimeSelectedListener(c cVar) {
        this.timeSelectedListener = cVar;
    }
}
