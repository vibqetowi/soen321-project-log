package com.google.android.gms.internal.p000firebaseauthapi;

import j$.util.Iterator;
import java.util.function.Consumer;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d0  reason: invalid package */
/* loaded from: classes.dex */
public abstract class d0 implements Iterator, java.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f7768u;

    public abstract byte a();

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f7768u) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f7768u) {
            case 0:
                return Byte.valueOf(a());
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // j$.util.Iterator
    public final void remove() {
        switch (this.f7768u) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
