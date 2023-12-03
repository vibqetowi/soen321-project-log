package com.google.android.gms.internal.p000firebaseauthapi;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a3  reason: invalid package */
/* loaded from: classes.dex */
public final class a3 implements Iterator, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final Iterator f7700u;

    public a3(b3 b3Var) {
        this.f7700u = b3Var.f7724u.iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f7700u.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f7700u.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
