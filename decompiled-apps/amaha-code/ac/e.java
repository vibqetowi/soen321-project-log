package ac;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.snackbar.BaseTransientBottomBar;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class e extends t0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f472d;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f472d = baseTransientBottomBar;
    }

    @Override // t0.a
    public final void d(View view, u0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        hVar.a(1048576);
        accessibilityNodeInfo.setDismissable(true);
    }

    @Override // t0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 == 1048576) {
            this.f472d.a();
            return true;
        }
        return super.g(view, i6, bundle);
    }
}
