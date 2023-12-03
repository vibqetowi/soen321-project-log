package u0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f33729a;

    public e(d dVar) {
        this.f33729a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f33729a.equals(((e) obj).f33729a);
    }

    public final int hashCode() {
        return this.f33729a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        boolean z11;
        dc.k kVar = (dc.k) ((f0.b) this.f33729a).f14603v;
        AutoCompleteTextView autoCompleteTextView = kVar.f12754h;
        if (autoCompleteTextView != null) {
            int i6 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (z10) {
                    i6 = 2;
                }
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.s(kVar.f12767d, i6);
            }
        }
    }
}
