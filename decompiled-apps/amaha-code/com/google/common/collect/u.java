package com.google.common.collect;

import com.google.common.collect.s;
import j$.util.Objects;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: ImmutableSet.java */
/* loaded from: classes.dex */
public abstract class u<E> extends q<E> implements Set<E> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f9464w = 0;

    /* renamed from: v  reason: collision with root package name */
    public transient s<E> f9465v;

    /* compiled from: ImmutableSet.java */
    /* loaded from: classes.dex */
    public static class a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final Object[] f9466u;

        public a(Object[] objArr) {
            this.f9466u = objArr;
        }

        public Object readResolve() {
            return u.C(this.f9466u);
        }
    }

    public static <E> u<E> C(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return v(eArr.length, (Object[]) eArr.clone());
            }
            return new t0(eArr[0]);
        }
        return n0.D;
    }

    public static u J(String str, String str2, String str3) {
        return v(3, str, str2, str3);
    }

    public static int t(int i6) {
        int max = Math.max(i6, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        sc.b.s("collection too large", z10);
        return 1073741824;
    }

    public static <E> u<E> v(int i6, Object... objArr) {
        if (i6 != 0) {
            boolean z10 = false;
            if (i6 != 1) {
                int t3 = t(i6);
                Object[] objArr2 = new Object[t3];
                int i10 = t3 - 1;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i6; i13++) {
                    Object obj = objArr[i13];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int e10 = x.e(hashCode);
                        while (true) {
                            int i14 = e10 & i10;
                            Object obj2 = objArr2[i14];
                            if (obj2 == null) {
                                objArr[i12] = obj;
                                objArr2[i14] = obj;
                                i11 += hashCode;
                                i12++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                e10++;
                            }
                        }
                    } else {
                        throw new NullPointerException(defpackage.b.h(20, "at index ", i13));
                    }
                }
                Arrays.fill(objArr, i12, i6, (Object) null);
                if (i12 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new t0(obj3);
                } else if (t(i12) < t3 / 2) {
                    return v(i12, objArr);
                } else {
                    int length = objArr.length;
                    if (i12 < (length >> 1) + (length >> 2)) {
                        z10 = true;
                    }
                    if (z10) {
                        objArr = Arrays.copyOf(objArr, i12);
                    }
                    return new n0(i11, i10, i12, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new t0(obj4);
        }
        return n0.D;
    }

    public static <E> u<E> z(Collection<? extends E> collection) {
        if ((collection instanceof u) && !(collection instanceof SortedSet)) {
            u<E> uVar = (u) collection;
            if (!uVar.r()) {
                return uVar;
            }
        }
        Object[] array = collection.toArray();
        return v(array.length, array);
    }

    public s<E> I() {
        Object[] array = toArray();
        s.b bVar = s.f9446v;
        return s.t(array.length, array);
    }

    @Override // com.google.common.collect.q
    public s<E> e() {
        s<E> sVar = this.f9465v;
        if (sVar == null) {
            s<E> I = I();
            this.f9465v = I;
            return I;
        }
        return sVar;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u) && (this instanceof n0)) {
            u uVar = (u) obj;
            uVar.getClass();
            if ((uVar instanceof n0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return s0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s0.b(this);
    }

    @Override // com.google.common.collect.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.q
    public Object writeReplace() {
        return new a(toArray());
    }
}
