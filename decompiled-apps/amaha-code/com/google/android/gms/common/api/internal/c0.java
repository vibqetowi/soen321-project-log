package com.google.android.gms.common.api.internal;

import java.util.Arrays;
import v9.m;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f7356a;

    /* renamed from: b  reason: collision with root package name */
    public final s9.d f7357b;

    public /* synthetic */ c0(a aVar, s9.d dVar) {
        this.f7356a = aVar;
        this.f7357b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof c0)) {
            c0 c0Var = (c0) obj;
            if (v9.m.a(this.f7356a, c0Var.f7356a) && v9.m.a(this.f7357b, c0Var.f7357b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7356a, this.f7357b});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f7356a, "key");
        aVar.a(this.f7357b, "feature");
        return aVar.toString();
    }
}
