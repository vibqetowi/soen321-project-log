package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import u0.h;
/* compiled from: ClockFaceView.java */
/* loaded from: classes.dex */
public final class b extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9314d;

    public b(ClockFaceView clockFaceView) {
        this.f9314d = clockFaceView;
    }

    @Override // t0.a
    public final void d(View view, h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            TextView textView = this.f9314d.R.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(textView);
            }
        }
        hVar.h(h.c.a(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        hVar.b(h.a.f33735g);
    }

    @Override // t0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f9314d;
            view.getHitRect(clockFaceView.O);
            float centerX = clockFaceView.O.centerX();
            float centerY = clockFaceView.O.centerY();
            clockFaceView.N.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.N.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i6, bundle);
    }
}
