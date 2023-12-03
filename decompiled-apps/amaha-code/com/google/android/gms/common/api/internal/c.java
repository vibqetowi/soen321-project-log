package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import t9.c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class c<R extends t9.c, A> extends BasePendingResult<R> implements d<R> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.google.android.gms.common.api.a aVar, f0 f0Var) {
        super(f0Var);
        if (f0Var != null) {
            if (aVar != null) {
                return;
            }
            throw new NullPointerException("Api must not be null");
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    public abstract void m(a.e eVar);

    public final void n(Status status) {
        v9.o.a("Failed result must not be success", !status.f0());
        a(d(status));
    }
}
