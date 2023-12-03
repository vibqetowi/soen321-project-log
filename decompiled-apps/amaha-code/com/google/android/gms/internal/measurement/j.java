package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class j implements Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Iterator f8434u;

    public j(Iterator it) {
        this.f8434u = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8434u.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new r((String) this.f8434u.next());
    }
}
