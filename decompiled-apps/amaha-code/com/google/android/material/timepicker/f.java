package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: TimePickerView.java */
/* loaded from: classes.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f9317u;

    public f(TimePickerView timePickerView) {
        this.f9317u = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i6 = TimePickerView.L;
        this.f9317u.getClass();
        return false;
    }
}
