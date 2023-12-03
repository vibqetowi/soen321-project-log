package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* compiled from: ClockFaceView.java */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9313u;

    public a(ClockFaceView clockFaceView) {
        this.f9313u = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f9313u;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.N.f9309x) - clockFaceView.V;
        if (height != clockFaceView.L) {
            clockFaceView.L = height;
            clockFaceView.l();
            int i6 = clockFaceView.L;
            ClockHandView clockHandView = clockFaceView.N;
            clockHandView.F = i6;
            clockHandView.invalidate();
        }
        return true;
    }
}
