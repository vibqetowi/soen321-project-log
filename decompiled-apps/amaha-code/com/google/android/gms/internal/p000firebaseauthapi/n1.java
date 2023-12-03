package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n1  reason: invalid package */
/* loaded from: classes.dex */
public final class n1 extends p1 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f7997c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i6, long j10, Object obj) {
        l1 l1Var;
        List arrayList;
        List list = (List) f3.j(j10, obj);
        if (list.isEmpty()) {
            if (list instanceof m1) {
                arrayList = new l1(i6);
            } else if ((list instanceof i2) && (list instanceof h1)) {
                arrayList = ((h1) list).k(i6);
            } else {
                arrayList = new ArrayList(i6);
            }
            f3.s(j10, obj, arrayList);
            return arrayList;
        }
        if (f7997c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i6);
            arrayList2.addAll(list);
            f3.s(j10, obj, arrayList2);
            l1Var = arrayList2;
        } else if (list instanceof b3) {
            l1 l1Var2 = new l1(list.size() + i6);
            l1Var2.addAll(l1Var2.size(), (b3) list);
            f3.s(j10, obj, l1Var2);
            l1Var = l1Var2;
        } else if ((list instanceof i2) && (list instanceof h1)) {
            h1 h1Var = (h1) list;
            if (!h1Var.c()) {
                h1 k10 = h1Var.k(list.size() + i6);
                f3.s(j10, obj, k10);
                return k10;
            }
            return list;
        } else {
            return list;
        }
        return l1Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p1
    public final List a(long j10, Object obj) {
        return d(10, j10, obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p1
    public final void b(long j10, Object obj) {
        Object unmodifiableList;
        List list = (List) f3.j(j10, obj);
        if (list instanceof m1) {
            unmodifiableList = ((m1) list).d();
        } else {
            if (f7997c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof i2) && (list instanceof h1)) {
                h1 h1Var = (h1) list;
                if (h1Var.c()) {
                    h1Var.b();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        f3.s(j10, obj, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p1
    public final void c(long j10, Object obj, Object obj2) {
        List list = (List) f3.j(j10, obj2);
        List d10 = d(list.size(), j10, obj);
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        f3.s(j10, obj, list);
    }
}
