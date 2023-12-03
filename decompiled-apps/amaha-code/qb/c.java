package qb;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
/* compiled from: CheckableImageButton.java */
/* loaded from: classes.dex */
public final class c extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f29412d;

    public c(CheckableImageButton checkableImageButton) {
        this.f29412d = checkableImageButton;
    }

    @Override // t0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f29412d.isChecked());
    }

    @Override // t0.a
    public final void d(View view, u0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f29412d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f9087y);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
