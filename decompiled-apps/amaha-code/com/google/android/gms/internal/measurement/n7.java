package com.google.android.gms.internal.measurement;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class n7 implements Iterator, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f8491u = -1;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8492v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator f8493w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ p7 f8494x;

    public final Iterator a() {
        if (this.f8493w == null) {
            this.f8493w = this.f8494x.f8553w.entrySet().iterator();
        }
        return this.f8493w;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f8491u + 1;
        p7 p7Var = this.f8494x;
        if (i6 < p7Var.f8552v.size()) {
            return true;
        }
        if (!p7Var.f8553w.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f8492v = true;
        int i6 = this.f8491u + 1;
        this.f8491u = i6;
        p7 p7Var = this.f8494x;
        if (i6 < p7Var.f8552v.size()) {
            return (Map.Entry) p7Var.f8552v.get(this.f8491u);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.f8492v) {
            this.f8492v = false;
            int i6 = p7.A;
            p7 p7Var = this.f8494x;
            p7Var.h();
            if (this.f8491u < p7Var.f8552v.size()) {
                int i10 = this.f8491u;
                this.f8491u = i10 - 1;
                p7Var.f(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
