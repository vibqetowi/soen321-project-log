package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: MaterialCalendarGridView.java */
/* loaded from: classes.dex */
public final class q extends t0.a {
    @Override // t0.a
    public final void d(View view, u0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
