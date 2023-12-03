package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f8324u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f8325v;

    public d(e eVar) {
        this.f8325v = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8324u < this.f8325v.t()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i6 = this.f8324u;
        e eVar = this.f8325v;
        if (i6 < eVar.t()) {
            int i10 = this.f8324u;
            this.f8324u = i10 + 1;
            return eVar.v(i10);
        }
        throw new NoSuchElementException(defpackage.c.p("Out of bounds index: ", this.f8324u));
    }
}
