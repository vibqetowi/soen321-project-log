package com.google.android.gms.internal.measurement;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class f1 extends p0 {

    /* renamed from: a  reason: collision with root package name */
    public final ta.g4 f8374a;

    public f1(ta.g4 g4Var) {
        this.f8374a = g4Var;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final void d0(long j10, Bundle bundle, String str, String str2) {
        this.f8374a.a(j10, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final int e() {
        return System.identityHashCode(this.f8374a);
    }
}
