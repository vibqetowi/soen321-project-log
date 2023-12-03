package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import t9.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class r implements a.InterfaceC0547a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f7429a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f7430b;

    public r(t tVar, c cVar) {
        this.f7430b = tVar;
        this.f7429a = cVar;
    }

    @Override // t9.a.InterfaceC0547a
    public final void a(Status status) {
        this.f7430b.f7436a.remove(this.f7429a);
    }
}
