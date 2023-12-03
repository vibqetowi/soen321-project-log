package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import u0.h;
/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class c extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f8859d;

    public c(e eVar) {
        this.f8859d = eVar;
    }

    @Override // t0.a
    public final void d(View view, h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (this.f8859d.C) {
            hVar.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
            return;
        }
        accessibilityNodeInfo.setDismissable(false);
    }

    @Override // t0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 == 1048576) {
            e eVar = this.f8859d;
            if (eVar.C) {
                eVar.cancel();
                return true;
            }
        }
        return super.g(view, i6, bundle);
    }
}
