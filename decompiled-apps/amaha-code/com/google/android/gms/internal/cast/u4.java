package com.google.android.gms.internal.cast;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class u4 implements Iterator<Map.Entry>, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f7648u = -1;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7649v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator<Map.Entry> f7650w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w4 f7651x;

    public /* synthetic */ u4(w4 w4Var) {
        this.f7651x = w4Var;
    }

    public final Iterator<Map.Entry> a() {
        if (this.f7650w == null) {
            this.f7650w = this.f7651x.f7675w.entrySet().iterator();
        }
        return this.f7650w;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f7648u + 1;
        w4 w4Var = this.f7651x;
        if (i6 < w4Var.f7674v.size()) {
            return true;
        }
        if (!w4Var.f7675w.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        this.f7649v = true;
        int i6 = this.f7648u + 1;
        this.f7648u = i6;
        w4 w4Var = this.f7651x;
        if (i6 < w4Var.f7674v.size()) {
            return w4Var.f7674v.get(this.f7648u);
        }
        return a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.f7649v) {
            this.f7649v = false;
            int i6 = w4.A;
            w4 w4Var = this.f7651x;
            w4Var.f();
            if (this.f7648u < w4Var.f7674v.size()) {
                int i10 = this.f7648u;
                this.f7648u = i10 - 1;
                w4Var.c(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
