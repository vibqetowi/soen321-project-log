package u0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f33749a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final i f33750a;

        public a(i iVar) {
            this.f33750a = iVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
            h a10 = this.f33750a.a(i6);
            if (a10 == null) {
                return null;
            }
            return a10.f33731a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i6) {
            this.f33750a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i6, int i10, Bundle bundle) {
            return this.f33750a.c(i6, i10, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(i iVar) {
            super(iVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i6) {
            h b10 = this.f33750a.b(i6);
            if (b10 == null) {
                return null;
            }
            return b10.f33731a;
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(i iVar) {
            super(iVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i6, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f33750a.getClass();
        }
    }

    public i() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33749a = new c(this);
        } else {
            this.f33749a = new b(this);
        }
    }

    public h a(int i6) {
        return null;
    }

    public h b(int i6) {
        return null;
    }

    public boolean c(int i6, int i10, Bundle bundle) {
        return false;
    }

    public i(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f33749a = accessibilityNodeProvider;
    }
}
