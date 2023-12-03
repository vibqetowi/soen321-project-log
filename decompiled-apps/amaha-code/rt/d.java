package rt;

import gt.b;
import gt.k0;
import gt.p0;
import gt.q;
import gt.z;
import ht.h;
import kotlin.jvm.internal.i;
/* compiled from: JavaForKotlinOverridePropertyDescriptor.kt */
/* loaded from: classes2.dex */
public final class d extends f {
    public final p0 X;
    public final p0 Y;
    public final k0 Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(gt.e ownerDescriptor, p0 p0Var, p0 p0Var2, k0 k0Var) {
        super(ownerDescriptor, r2, r3, r4, r5, k0Var.getName(), p0Var.g(), null, b.a.DECLARATION, false, null);
        boolean z10;
        i.g(ownerDescriptor, "ownerDescriptor");
        h.a.C0293a c0293a = h.a.f19495a;
        z m10 = p0Var.m();
        q visibility = p0Var.getVisibility();
        if (p0Var2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = p0Var;
        this.Y = p0Var2;
        this.Z = k0Var;
    }
}
