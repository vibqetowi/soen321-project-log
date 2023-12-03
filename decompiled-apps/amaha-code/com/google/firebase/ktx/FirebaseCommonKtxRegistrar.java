package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import hd.e;
import hd.j;
import hd.o;
import hd.p;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.a0;
import ta.v;
/* compiled from: Firebase.kt */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lhd/b;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements e {

        /* renamed from: u  reason: collision with root package name */
        public static final a<T> f9636u = new a<>();

        @Override // hd.e
        public final Object e(p pVar) {
            Object e10 = pVar.e(new o<>(yc.a.class, Executor.class));
            i.f(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return v.v((Executor) e10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes.dex */
    public static final class b<T> implements e {

        /* renamed from: u  reason: collision with root package name */
        public static final b<T> f9637u = new b<>();

        @Override // hd.e
        public final Object e(p pVar) {
            Object e10 = pVar.e(new o<>(yc.c.class, Executor.class));
            i.f(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return v.v((Executor) e10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes.dex */
    public static final class c<T> implements e {

        /* renamed from: u  reason: collision with root package name */
        public static final c<T> f9638u = new c<>();

        @Override // hd.e
        public final Object e(p pVar) {
            Object e10 = pVar.e(new o<>(yc.b.class, Executor.class));
            i.f(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return v.v((Executor) e10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes.dex */
    public static final class d<T> implements e {

        /* renamed from: u  reason: collision with root package name */
        public static final d<T> f9639u = new d<>();

        @Override // hd.e
        public final Object e(p pVar) {
            Object e10 = pVar.e(new o<>(yc.d.class, Executor.class));
            i.f(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return v.v((Executor) e10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hd.b<?>> getComponents() {
        hd.b[] bVarArr = new hd.b[5];
        bVarArr[0] = mf.e.a("fire-core-ktx", "20.3.1");
        o oVar = new o(yc.a.class, a0.class);
        o[] oVarArr = new o[0];
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
        j jVar = new j(new o(yc.a.class, Executor.class), 1, 0);
        if (!hashSet.contains(jVar.f17423a)) {
            hashSet2.add(jVar);
            bVarArr[1] = new hd.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, a.f9636u, hashSet3);
            o oVar3 = new o(yc.c.class, a0.class);
            o[] oVarArr2 = new o[0];
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
            j jVar2 = new j(new o(yc.c.class, Executor.class), 1, 0);
            if (!hashSet4.contains(jVar2.f17423a)) {
                hashSet5.add(jVar2);
                bVarArr[2] = new hd.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, b.f9637u, hashSet6);
                o oVar5 = new o(yc.b.class, a0.class);
                o[] oVarArr3 = new o[0];
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
                j jVar3 = new j(new o(yc.b.class, Executor.class), 1, 0);
                if (!hashSet7.contains(jVar3.f17423a)) {
                    hashSet8.add(jVar3);
                    bVarArr[3] = new hd.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, c.f9638u, hashSet9);
                    o oVar7 = new o(yc.d.class, a0.class);
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
                    j jVar4 = new j(new o(yc.d.class, Executor.class), 1, 0);
                    if (!hashSet10.contains(jVar4.f17423a)) {
                        hashSet11.add(jVar4);
                        bVarArr[4] = new hd.b(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, d.f9639u, hashSet12);
                        return ca.a.P0(bVarArr);
                    }
                    throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
