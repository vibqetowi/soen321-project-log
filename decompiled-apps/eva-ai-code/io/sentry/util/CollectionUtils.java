package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class CollectionUtils {

    /* loaded from: classes4.dex */
    public interface Predicate<T> {
        boolean test(T t);
    }

    private CollectionUtils() {
    }

    public static int size(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    public static <K, V> Map<K, V> newConcurrentHashMap(Map<K, V> map) {
        if (map != null) {
            return new ConcurrentHashMap(map);
        }
        return null;
    }

    public static <K, V> Map<K, V> newHashMap(Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public static <T> List<T> newArrayList(List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static <K, V> Map<K, V> filterMapEntries(Map<K, V> map, Predicate<Map.Entry<K, V>> predicate) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry)) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }
}
