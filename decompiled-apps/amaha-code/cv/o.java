package cv;

import cv.e;
import gt.z0;
import java.util.List;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public final class o implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final o f12075a = new o();

    @Override // cv.e
    public final String a() {
        return "should not have varargs or parameters with default values";
    }

    @Override // cv.e
    public final String b(gt.u uVar) {
        return e.a.a(this, uVar);
    }

    @Override // cv.e
    public final boolean c(gt.u functionDescriptor) {
        boolean z10;
        kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
        List<z0> i6 = functionDescriptor.i();
        kotlin.jvm.internal.i.f(i6, "functionDescriptor.valueParameters");
        if (i6.isEmpty()) {
            return true;
        }
        for (z0 it : i6) {
            kotlin.jvm.internal.i.f(it, "it");
            if (!mu.a.a(it) && it.j0() == null) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
