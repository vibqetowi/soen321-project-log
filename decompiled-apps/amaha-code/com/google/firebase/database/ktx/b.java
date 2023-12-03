package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import iv.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9607u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f9608v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ DataSnapshot f9609w;

    public /* synthetic */ b(q qVar, DataSnapshot dataSnapshot, int i6) {
        this.f9607u = i6;
        this.f9608v = qVar;
        this.f9609w = dataSnapshot;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f9607u;
        DataSnapshot dataSnapshot = this.f9609w;
        q qVar = this.f9608v;
        switch (i6) {
            case 0:
                DatabaseKt$childEvents$1$listener$1.m3onChildRemoved$lambda2(qVar, dataSnapshot);
                return;
            default:
                DatabaseKt$snapshots$1$listener$1.a(qVar, dataSnapshot);
                return;
        }
    }
}
