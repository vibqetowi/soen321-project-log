package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import iv.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9603u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f9604v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ DataSnapshot f9605w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f9606x;

    public /* synthetic */ a(q qVar, DataSnapshot dataSnapshot, String str, int i6) {
        this.f9603u = i6;
        this.f9604v = qVar;
        this.f9605w = dataSnapshot;
        this.f9606x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f9603u;
        q qVar = this.f9604v;
        String str = this.f9606x;
        DataSnapshot dataSnapshot = this.f9605w;
        switch (i6) {
            case 0:
                DatabaseKt$childEvents$1$listener$1.c(qVar, dataSnapshot, str);
                return;
            case 1:
                DatabaseKt$childEvents$1$listener$1.b(qVar, dataSnapshot, str);
                return;
            default:
                DatabaseKt$childEvents$1$listener$1.a(qVar, dataSnapshot, str);
                return;
        }
    }
}
