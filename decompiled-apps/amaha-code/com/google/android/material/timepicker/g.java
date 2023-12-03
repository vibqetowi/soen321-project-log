package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* compiled from: TimePickerView.java */
/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f9318u;

    public g(GestureDetector gestureDetector) {
        this.f9318u = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f9318u.onTouchEvent(motionEvent);
        }
        return false;
    }
}
