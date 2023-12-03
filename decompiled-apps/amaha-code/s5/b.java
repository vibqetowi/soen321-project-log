package s5;

import h5.p;
import java.util.Set;
import w5.e0;
/* compiled from: OnDeviceProcessingManager.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f31274a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f31275b = ca.a.m1("fb_mobile_purchase", "StartTrial", "Subscribe");

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (b6.a.b(b.class)) {
            return false;
        }
        try {
            if (!p.f(p.a()) && !e0.y()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            d dVar = d.f31277a;
            if (!b6.a.b(d.class)) {
                if (d.f31278b == null) {
                    if (d.f31277a.a(p.a()) != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    d.f31278b = Boolean.valueOf(z12);
                }
                Boolean bool = d.f31278b;
                if (bool != null) {
                    z11 = bool.booleanValue();
                    if (z11) {
                        return false;
                    }
                    return true;
                }
            }
            z11 = false;
            if (z11) {
            }
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return false;
        }
    }
}
