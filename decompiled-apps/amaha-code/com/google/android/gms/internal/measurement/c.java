package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Iterator f8315u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Iterator f8316v;

    public c(Iterator it, Iterator it2) {
        this.f8315u = it;
        this.f8316v = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8315u.hasNext()) {
            return true;
        }
        return this.f8316v.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f8315u;
        if (it.hasNext()) {
            return new r(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f8316v;
        if (it2.hasNext()) {
            return new r((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
