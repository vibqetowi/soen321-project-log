package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.j;
import hd.b;
import hd.g;
import hd.l;
import hd.o;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import yc.a;
import yc.c;
import yc.d;
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final l<ScheduledExecutorService> f9561a = new l<>(new g(2));

    /* renamed from: b  reason: collision with root package name */
    public static final l<ScheduledExecutorService> f9562b = new l<>(new g(3));

    /* renamed from: c  reason: collision with root package name */
    public static final l<ScheduledExecutorService> f9563c = new l<>(new g(4));

    /* renamed from: d  reason: collision with root package name */
    public static final l<ScheduledExecutorService> f9564d = new l<>(new g(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<b<?>> getComponents() {
        b[] bVarArr = new b[4];
        o oVar = new o(a.class, ScheduledExecutorService.class);
        o[] oVarArr = {new o(a.class, ExecutorService.class), new o(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oVar);
        for (o oVar2 : oVarArr) {
            if (oVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, oVarArr);
        bVarArr[0] = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new j(1), hashSet3);
        o oVar3 = new o(yc.b.class, ScheduledExecutorService.class);
        o[] oVarArr2 = {new o(yc.b.class, ExecutorService.class), new o(yc.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oVar3);
        for (o oVar4 : oVarArr2) {
            if (oVar4 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet4, oVarArr2);
        bVarArr[1] = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new j(2), hashSet6);
        o oVar5 = new o(c.class, ScheduledExecutorService.class);
        o[] oVarArr3 = {new o(c.class, ExecutorService.class), new o(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oVar5);
        for (o oVar6 : oVarArr3) {
            if (oVar6 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet7, oVarArr3);
        bVarArr[2] = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new j(3), hashSet9);
        o oVar7 = new o(d.class, Executor.class);
        o[] oVarArr4 = new o[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(oVar7);
        for (o oVar8 : oVarArr4) {
            if (oVar8 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet10, oVarArr4);
        bVarArr[3] = new b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new j(4), hashSet12);
        return Arrays.asList(bVarArr);
    }
}
