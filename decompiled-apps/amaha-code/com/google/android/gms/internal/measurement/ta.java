package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class ta {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f8616a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f8617b = new TreeMap();

    public final void a(v.c cVar, s1.s sVar) {
        int i6;
        j6 j6Var = new j6(sVar);
        TreeMap treeMap = this.f8616a;
        for (Integer num : treeMap.keySet()) {
            b clone = ((b) sVar.f31225w).clone();
            o a10 = ((n) treeMap.get(num)).a(cVar, Collections.singletonList(j6Var));
            if (a10 instanceof h) {
                i6 = l3.b(a10.f().doubleValue());
            } else {
                i6 = -1;
            }
            if (i6 == 2 || i6 == -1) {
                sVar.f31225w = clone;
            }
        }
        TreeMap treeMap2 = this.f8617b;
        for (Integer num2 : treeMap2.keySet()) {
            o a11 = ((n) treeMap2.get(num2)).a(cVar, Collections.singletonList(j6Var));
            if (a11 instanceof h) {
                l3.b(a11.f().doubleValue());
            }
        }
    }
}
