package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class h6 extends k6 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f8412c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.measurement.k6
    public final void a(long j10, Object obj) {
        Object unmodifiableList;
        List list = (List) y7.j(j10, obj);
        if (list instanceof g6) {
            unmodifiableList = ((g6) list).d();
        } else {
            if (f8412c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof c7) && (list instanceof b6)) {
                b6 b6Var = (b6) list;
                if (b6Var.c()) {
                    b6Var.b();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        y7.r(j10, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.k6
    public final void b(long j10, Object obj, Object obj2) {
        f6 f6Var;
        List list = (List) y7.j(j10, obj2);
        int size = list.size();
        List list2 = (List) y7.j(j10, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof g6) {
                list2 = new f6(size);
            } else if ((list2 instanceof c7) && (list2 instanceof b6)) {
                list2 = ((b6) list2).k(size);
            } else {
                list2 = new ArrayList(size);
            }
            y7.r(j10, obj, list2);
        } else {
            if (f8412c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                y7.r(j10, obj, arrayList);
                f6Var = arrayList;
            } else if (list2 instanceof u7) {
                f6 f6Var2 = new f6(list2.size() + size);
                f6Var2.addAll(f6Var2.size(), (u7) list2);
                y7.r(j10, obj, f6Var2);
                f6Var = f6Var2;
            } else if ((list2 instanceof c7) && (list2 instanceof b6)) {
                b6 b6Var = (b6) list2;
                if (!b6Var.c()) {
                    list2 = b6Var.k(list2.size() + size);
                    y7.r(j10, obj, list2);
                }
            }
            list2 = f6Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        y7.r(j10, obj, list);
    }
}
