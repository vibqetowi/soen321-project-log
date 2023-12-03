package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.u7;
import j$.util.Iterator;
import java.util.Iterator;
import java.util.function.Consumer;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class d5 implements Iterator, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f7513u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final Iterator f7514v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Iterable f7515w;

    public d5(e5 e5Var) {
        this.f7515w = e5Var;
        this.f7514v = e5Var.f7517u.iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f7513u) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            case 1:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f7513u;
        java.util.Iterator it = this.f7514v;
        switch (i6) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i6 = this.f7513u;
        java.util.Iterator it = this.f7514v;
        switch (i6) {
            case 0:
                return (String) it.next();
            case 1:
                return (String) it.next();
            default:
                return (String) it.next();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        switch (this.f7513u) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public d5(u7 u7Var) {
        this.f7515w = u7Var;
        this.f7514v = u7Var.f8622u.iterator();
    }

    public d5(ta.q qVar) {
        this.f7515w = qVar;
        this.f7514v = qVar.f32819u.keySet().iterator();
    }
}
