package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class l2 extends t5 implements w6 {
    public l2() {
        super(m2.z());
    }

    public final long k() {
        return ((m2) this.f8613v).w();
    }

    public final long l() {
        return ((m2) this.f8613v).x();
    }

    public final void m(p2 p2Var) {
        i();
        m2.E((m2) this.f8613v, (q2) p2Var.f());
    }

    public final q2 n(int i6) {
        return ((m2) this.f8613v).A(i6);
    }

    public final String p() {
        return ((m2) this.f8613v).B();
    }

    public final List q() {
        return Collections.unmodifiableList(((m2) this.f8613v).C());
    }

    public /* synthetic */ l2(int i6) {
        super(m2.z());
    }
}
