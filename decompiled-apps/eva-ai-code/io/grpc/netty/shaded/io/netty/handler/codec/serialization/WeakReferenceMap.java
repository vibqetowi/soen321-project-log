package io.grpc.netty.shaded.io.netty.handler.codec.serialization;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes4.dex */
final class WeakReferenceMap<K, V> extends ReferenceMap<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WeakReferenceMap(Map<K, Reference<V>> map) {
        super(map);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.serialization.ReferenceMap
    Reference<V> fold(V v) {
        return new WeakReference(v);
    }
}
