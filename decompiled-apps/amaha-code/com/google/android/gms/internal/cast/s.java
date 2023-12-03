package com.google.android.gms.internal.cast;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class s<K> extends o<K> {

    /* renamed from: w  reason: collision with root package name */
    public final transient m<K> f7633w;

    public s(t tVar) {
        this.f7633w = tVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.f7633w.listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.j
    public final int o(Object[] objArr) {
        return this.f7633w.o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
