package com.bugsnag.android;

import java.util.Collection;
/* loaded from: classes.dex */
class CollectionUtils {
    public static <T> boolean containsNullElements(Collection<T> collection) {
        if (collection == null) {
            return true;
        }
        for (T t3 : collection) {
            if (t3 == null) {
                return true;
            }
        }
        return false;
    }
}
