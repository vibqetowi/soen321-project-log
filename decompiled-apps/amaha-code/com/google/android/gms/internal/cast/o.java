package com.google.android.gms.internal.cast;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public abstract class o<E> extends j<E> implements Set<E> {
    @NullableDecl

    /* renamed from: v  reason: collision with root package name */
    public transient m<E> f7611v;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int i6;
        int i10 = 0;
        for (E e10 : this) {
            if (e10 != null) {
                i6 = e10.hashCode();
            } else {
                i6 = 0;
            }
            i10 += i6;
        }
        return i10;
    }
}
