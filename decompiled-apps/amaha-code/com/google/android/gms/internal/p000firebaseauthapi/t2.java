package com.google.android.gms.internal.p000firebaseauthapi;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t2  reason: invalid package */
/* loaded from: classes.dex */
public final class t2 implements Iterator, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f8145u = -1;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8146v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator f8147w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ v2 f8148x;

    public final Iterator a() {
        if (this.f8147w == null) {
            this.f8147w = this.f8148x.f8190w.entrySet().iterator();
        }
        return this.f8147w;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f8145u + 1;
        v2 v2Var = this.f8148x;
        if (i6 < v2Var.f8189v.size()) {
            return true;
        }
        if (!v2Var.f8190w.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f8146v = true;
        int i6 = this.f8145u + 1;
        this.f8145u = i6;
        v2 v2Var = this.f8148x;
        if (i6 < v2Var.f8189v.size()) {
            return (Map.Entry) v2Var.f8189v.get(this.f8145u);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.f8146v) {
            this.f8146v = false;
            int i6 = v2.A;
            v2 v2Var = this.f8148x;
            v2Var.h();
            if (this.f8145u < v2Var.f8189v.size()) {
                int i10 = this.f8145u;
                this.f8145u = i10 - 1;
                v2Var.f(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
