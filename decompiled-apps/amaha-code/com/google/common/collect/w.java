package com.google.common.collect;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Iterators.java */
/* loaded from: classes.dex */
public final class w implements Iterator<Object>, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public static final w f9470u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ w[] f9471v;

    static {
        w wVar = new w();
        f9470u = wVar;
        f9471v = new w[]{wVar};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f9471v.clone();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        sc.b.B("no calls to next() since the last call to remove()", false);
    }
}
