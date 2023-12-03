package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MultimapBuilder.java */
/* loaded from: classes.dex */
public final class g0<V> implements nc.m<List<V>>, Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final int f9389u;

    public g0(int i6) {
        x.a(i6, "expectedValuesPerKey");
        this.f9389u = i6;
    }

    @Override // nc.m
    public final Object get() {
        return new ArrayList(this.f9389u);
    }
}
