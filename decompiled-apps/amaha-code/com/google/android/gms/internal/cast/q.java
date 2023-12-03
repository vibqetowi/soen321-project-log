package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class q extends m<Map.Entry> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ r f7625w;

    public q(r rVar) {
        this.f7625w = rVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i6) {
        g.c(i6, 0);
        Object[] objArr = this.f7625w.f7629w;
        int i10 = i6 + i6;
        return new AbstractMap.SimpleImmutableEntry(objArr[i10], objArr[i10 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
