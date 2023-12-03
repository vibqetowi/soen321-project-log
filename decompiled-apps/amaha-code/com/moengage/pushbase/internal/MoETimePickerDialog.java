package com.moengage.pushbase.internal;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.Calendar;
@Keep
/* loaded from: classes.dex */
public class MoETimePickerDialog extends TimePickerDialog {
    private Calendar calendar;
    private int currentHour;
    private int currentMinute;
    private DateFormat dateFormat;
    private int maxHour;
    private int maxMinute;
    private int minHour;
    private int minMinute;

    public MoETimePickerDialog(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i6, int i10, boolean z10) {
        super(context, onTimeSetListener, i6, i10, z10);
        this.minHour = -1;
        this.minMinute = -1;
        this.maxHour = 25;
        this.maxMinute = 25;
        this.currentHour = 0;
        this.currentMinute = 0;
        this.calendar = Calendar.getInstance();
        this.currentHour = i6;
        this.currentMinute = i10;
        this.dateFormat = DateFormat.getTimeInstance(3);
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mTimePicker");
            declaredField.setAccessible(true);
            ((TimePicker) declaredField.get(this)).setOnTimeChangedListener(this);
        } catch (Exception unused) {
        }
    }

    private void updateDialogTitle(TimePicker timePicker, int i6, int i10) {
        this.calendar.set(11, i6);
        this.calendar.set(12, i10);
        setTitle(this.dateFormat.format(this.calendar.getTime()));
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public void onTimeChanged(TimePicker timePicker, int i6, int i10) {
        boolean z10;
        int i11 = this.minHour;
        boolean z11 = false;
        if (i6 >= i11 && (i6 != i11 || i10 >= this.minMinute)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = this.maxHour;
        if (i6 <= i12 && (i6 != i12 || i10 <= this.maxMinute)) {
            z11 = z10;
        }
        if (z11) {
            this.currentHour = i6;
            this.currentMinute = i10;
        }
        updateTime(this.currentHour, this.currentMinute);
        updateDialogTitle(timePicker, this.currentHour, this.currentMinute);
    }

    public void setMax(int i6, int i10) {
        this.maxHour = i6;
        this.maxMinute = i10;
    }

    public void setMin(int i6, int i10) {
        this.minHour = i6;
        this.minMinute = i10;
    }
}
