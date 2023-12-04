package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface SetMultimap<K, V> extends Multimap<K, V> {
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.Multimap
    Set<Map.Entry<K, V>> entries();

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    boolean equals(@CheckForNull Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set<V> get(@ParametricNullness K k);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set<V> removeAll(@CheckForNull Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    Set<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);

    /* renamed from: com.google.common.collect.SetMultimap$-CC  reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class CC {
    }
}
