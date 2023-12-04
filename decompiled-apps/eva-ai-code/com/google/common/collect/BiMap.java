package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface BiMap<K, V> extends Map<K, V> {
    @CheckForNull
    V forcePut(@ParametricNullness K k, @ParametricNullness V v);

    BiMap<V, K> inverse();

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    V put(@ParametricNullness K k, @ParametricNullness V v);

    @Override // com.google.common.collect.BiMap
    void putAll(Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.BiMap
    Set<V> values();

    /* renamed from: com.google.common.collect.BiMap$-CC  reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class CC {
    }
}
