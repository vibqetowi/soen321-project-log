package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class w4 extends com.google.android.gms.internal.p000firebaseauthapi.d0 {

    /* renamed from: v  reason: collision with root package name */
    public int f8643v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8644w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b5 f8645x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(b5 b5Var) {
        super(1);
        this.f8645x = b5Var;
        this.f8643v = 0;
        this.f8644w = b5Var.m();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d0
    public final byte a() {
        int i6 = this.f8643v;
        if (i6 < this.f8644w) {
            this.f8643v = i6 + 1;
            return this.f8645x.g(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        if (this.f8643v < this.f8644w) {
            return true;
        }
        return false;
    }
}
