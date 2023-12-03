package com.google.protobuf;

import com.google.protobuf.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9919a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f9920b = new b();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    public static final class a extends g0 {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f9921c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(int i6, long j10, Object obj) {
            e0 e0Var;
            List arrayList;
            List list = (List) q1.p(j10, obj);
            if (list.isEmpty()) {
                if (list instanceof f0) {
                    arrayList = new e0(i6);
                } else if ((list instanceof a1) && (list instanceof y.d)) {
                    arrayList = ((y.d) list).A(i6);
                } else {
                    arrayList = new ArrayList(i6);
                }
                q1.z(j10, obj, arrayList);
                return arrayList;
            }
            if (f9921c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i6);
                arrayList2.addAll(list);
                q1.z(j10, obj, arrayList2);
                e0Var = arrayList2;
            } else if (list instanceof p1) {
                e0 e0Var2 = new e0(list.size() + i6);
                e0Var2.addAll((p1) list);
                q1.z(j10, obj, e0Var2);
                e0Var = e0Var2;
            } else if ((list instanceof a1) && (list instanceof y.d)) {
                y.d dVar = (y.d) list;
                if (!dVar.d0()) {
                    y.d A = dVar.A(list.size() + i6);
                    q1.z(j10, obj, A);
                    return A;
                }
                return list;
            } else {
                return list;
            }
            return e0Var;
        }

        @Override // com.google.protobuf.g0
        public final void a(long j10, Object obj) {
            Object unmodifiableList;
            List list = (List) q1.p(j10, obj);
            if (list instanceof f0) {
                unmodifiableList = ((f0) list).p();
            } else {
                if (f9921c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof a1) && (list instanceof y.d)) {
                    y.d dVar = (y.d) list;
                    if (dVar.d0()) {
                        dVar.w();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            q1.z(j10, obj, unmodifiableList);
        }

        @Override // com.google.protobuf.g0
        public final void b(long j10, Object obj, Object obj2) {
            List list = (List) q1.p(j10, obj2);
            List d10 = d(list.size(), j10, obj);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            q1.z(j10, obj, list);
        }

        @Override // com.google.protobuf.g0
        public final List c(long j10, Object obj) {
            return d(10, j10, obj);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    public static final class b extends g0 {
        @Override // com.google.protobuf.g0
        public final void a(long j10, Object obj) {
            ((y.d) q1.p(j10, obj)).w();
        }

        @Override // com.google.protobuf.g0
        public final void b(long j10, Object obj, Object obj2) {
            y.d dVar = (y.d) q1.p(j10, obj);
            y.d dVar2 = (y.d) q1.p(j10, obj2);
            int size = dVar.size();
            int size2 = dVar2.size();
            if (size > 0 && size2 > 0) {
                if (!dVar.d0()) {
                    dVar = dVar.A(size2 + size);
                }
                dVar.addAll(dVar2);
            }
            if (size > 0) {
                dVar2 = dVar;
            }
            q1.z(j10, obj, dVar2);
        }

        @Override // com.google.protobuf.g0
        public final List c(long j10, Object obj) {
            int i6;
            y.d dVar = (y.d) q1.p(j10, obj);
            if (!dVar.d0()) {
                int size = dVar.size();
                if (size == 0) {
                    i6 = 10;
                } else {
                    i6 = size * 2;
                }
                y.d A = dVar.A(i6);
                q1.z(j10, obj, A);
                return A;
            }
            return dVar;
        }
    }

    public abstract void a(long j10, Object obj);

    public abstract void b(long j10, Object obj, Object obj2);

    public abstract List c(long j10, Object obj);
}
