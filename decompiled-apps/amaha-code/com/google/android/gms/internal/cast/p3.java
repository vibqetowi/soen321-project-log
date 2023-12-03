package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class p3 extends r3 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f7620c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.cast.r3
    public final void a(long j10, c3 c3Var) {
        Object unmodifiableList;
        List list = (List) i5.l(j10, c3Var);
        if (list instanceof o3) {
            unmodifiableList = ((o3) list).i();
        } else {
            if (f7620c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof k4) && (list instanceof j3)) {
                j3 j3Var = (j3) list;
                if (j3Var.a()) {
                    j3Var.b();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        i5.m(j10, c3Var, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.r3
    public final void b(long j10, Object obj, Object obj2) {
        n3 n3Var;
        List list = (List) i5.l(j10, obj2);
        int size = list.size();
        List list2 = (List) i5.l(j10, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof o3) {
                list2 = new n3(size);
            } else if ((list2 instanceof k4) && (list2 instanceof j3)) {
                list2 = ((j3) list2).D(size);
            } else {
                list2 = new ArrayList(size);
            }
            i5.m(j10, obj, list2);
        } else {
            if (f7620c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                i5.m(j10, obj, arrayList);
                n3Var = arrayList;
            } else if (list2 instanceof e5) {
                n3 n3Var2 = new n3(list2.size() + size);
                n3Var2.addAll(n3Var2.size(), (e5) list2);
                i5.m(j10, obj, n3Var2);
                n3Var = n3Var2;
            } else if ((list2 instanceof k4) && (list2 instanceof j3)) {
                j3 j3Var = (j3) list2;
                if (!j3Var.a()) {
                    list2 = j3Var.D(list2.size() + size);
                    i5.m(j10, obj, list2);
                }
            }
            list2 = n3Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        i5.m(j10, obj, list);
    }
}
