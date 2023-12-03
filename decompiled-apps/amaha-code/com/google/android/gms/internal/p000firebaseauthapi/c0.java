package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c0  reason: invalid package */
/* loaded from: classes.dex */
public final class c0 extends d0 {

    /* renamed from: v  reason: collision with root package name */
    public int f7746v;

    /* renamed from: w  reason: collision with root package name */
    public final int f7747w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ h0 f7748x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var) {
        super(0);
        this.f7748x = h0Var;
        this.f7746v = 0;
        this.f7747w = h0Var.m();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d0
    public final byte a() {
        int i6 = this.f7746v;
        if (i6 < this.f7747w) {
            this.f7746v = i6 + 1;
            return this.f7748x.g(i6);
        }
        throw new NoSuchElementException();
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        if (this.f7746v < this.f7747w) {
            return true;
        }
        return false;
    }
}
