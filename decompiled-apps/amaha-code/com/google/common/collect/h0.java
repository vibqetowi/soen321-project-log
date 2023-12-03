package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: Multimaps.java */
/* loaded from: classes.dex */
public final class h0<K, V> extends c<K, V> {

    /* renamed from: z  reason: collision with root package name */
    public transient nc.m<? extends List<V>> f9391z;

    public h0(Map map, g0 g0Var) {
        super(map);
        this.f9391z = g0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f9391z = (nc.m) objectInputStream.readObject();
        Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
        this.f9352x = map;
        this.f9353y = 0;
        for (Collection<V> collection : map.values()) {
            sc.b.t(!collection.isEmpty());
            this.f9353y = collection.size() + this.f9353y;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f9391z);
        objectOutputStream.writeObject(this.f9352x);
    }
}
