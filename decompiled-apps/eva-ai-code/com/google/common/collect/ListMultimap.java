package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface ListMultimap<K, V> extends Multimap<K, V> {
    @Override // 
    Map<K, Collection<V>> asMap();

    @Override // 
    boolean equals(@CheckForNull Object obj);

    @Override // 
    List<V> get(@ParametricNullness K k);

    @Override // 
    List<V> removeAll(@CheckForNull Object obj);

    @Override // 
    List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);

    /* renamed from: com.google.common.collect.ListMultimap$-CC  reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class CC {
    }
}
