package com.google.firebase.database.core;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.connection.ConnectionTokenProvider;
import com.google.firebase.database.core.Context;
import ya.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9591u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f9592v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f9593w;

    public /* synthetic */ b(Object obj, int i6, Object obj2) {
        this.f9591u = i6;
        this.f9592v = obj;
        this.f9593w = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f9591u;
        Object obj = this.f9593w;
        Object obj2 = this.f9592v;
        switch (i6) {
            case 0:
                Context.AnonymousClass1.b((ConnectionTokenProvider.GetTokenCallback) obj2, (String) obj);
                return;
            case 1:
                Context.AnonymousClass1.a((ConnectionTokenProvider.GetTokenCallback) obj2, (String) obj);
                return;
            default:
                ((i) obj2).d((DataSnapshot) obj);
                return;
        }
    }
}
