package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import c9.j;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.w;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.internal.a;
import com.theinnerhour.b2b.utils.InsetsUtils;
import ik.b1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import t0.s0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ya.b, a7.e, ya.g, t0.t, s6.c, androidx.activity.result.b, j.a, f.a, j.b, c9.e, d.b, u7.k, hd.e {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9739u;

    public /* synthetic */ j(int i6) {
        this.f9739u = i6;
    }

    @Override // c9.e
    public void accept(Object obj) {
        ((c.a) obj).c();
    }

    @Override // a7.e
    public Object apply(Object obj) {
        switch (this.f9739u) {
            case 1:
                ye.b bVar = (ye.b) obj;
                bVar.getClass();
                de.f fVar = w.f9785a;
                fVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fVar.a(bVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return ((lf.i) obj).q();
        }
    }

    @Override // androidx.activity.result.b
    public void b(Object obj) {
        Intent intent;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        int i6 = hm.a.B;
        if (aVar.f976u == -1 && (intent = aVar.f977v) != null) {
            intent.getBooleanExtra("expert_payment_done", false);
        }
    }

    @Override // com.google.android.exoplayer2.f.a
    public com.google.android.exoplayer2.f c(Bundle bundle) {
        int i6;
        int i10;
        boolean z10;
        q.e eVar;
        com.google.android.exoplayer2.r rVar;
        q.c cVar;
        boolean z11;
        Integer num;
        byte[] bArr;
        Bundle bundle2;
        Bundle bundle3;
        boolean z12;
        com.google.android.exoplayer2.source.ads.a aVar;
        com.google.android.exoplayer2.q qVar;
        q.e eVar2;
        j jVar = q.e.A;
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i12 = 0;
        int i13 = 1;
        r12 = true;
        boolean z15 = true;
        switch (this.f9739u) {
            case 2:
                com.google.android.exoplayer2.n nVar = com.google.android.exoplayer2.n.f6648a0;
                n.a aVar2 = new n.a();
                if (bundle != null) {
                    ClassLoader classLoader = c9.a.class.getClassLoader();
                    int i14 = c9.w.f5205a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(com.google.android.exoplayer2.n.d(0));
                com.google.android.exoplayer2.n nVar2 = com.google.android.exoplayer2.n.f6648a0;
                String str = nVar2.f6650u;
                if (string == null) {
                    string = str;
                }
                aVar2.f6656a = string;
                String string2 = bundle.getString(com.google.android.exoplayer2.n.d(1));
                if (string2 == null) {
                    string2 = nVar2.f6651v;
                }
                aVar2.f6657b = string2;
                String string3 = bundle.getString(com.google.android.exoplayer2.n.d(2));
                if (string3 == null) {
                    string3 = nVar2.f6652w;
                }
                aVar2.f6658c = string3;
                aVar2.f6659d = bundle.getInt(com.google.android.exoplayer2.n.d(3), nVar2.f6653x);
                aVar2.f6660e = bundle.getInt(com.google.android.exoplayer2.n.d(4), nVar2.f6654y);
                aVar2.f = bundle.getInt(com.google.android.exoplayer2.n.d(5), nVar2.f6655z);
                aVar2.f6661g = bundle.getInt(com.google.android.exoplayer2.n.d(6), nVar2.A);
                String string4 = bundle.getString(com.google.android.exoplayer2.n.d(7));
                if (string4 == null) {
                    string4 = nVar2.C;
                }
                aVar2.f6662h = string4;
                g8.a aVar3 = (g8.a) bundle.getParcelable(com.google.android.exoplayer2.n.d(8));
                if (aVar3 == null) {
                    aVar3 = nVar2.D;
                }
                aVar2.f6663i = aVar3;
                String string5 = bundle.getString(com.google.android.exoplayer2.n.d(9));
                if (string5 == null) {
                    string5 = nVar2.E;
                }
                aVar2.f6664j = string5;
                String string6 = bundle.getString(com.google.android.exoplayer2.n.d(10));
                if (string6 == null) {
                    string6 = nVar2.F;
                }
                aVar2.f6665k = string6;
                aVar2.f6666l = bundle.getInt(com.google.android.exoplayer2.n.d(11), nVar2.G);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(com.google.android.exoplayer2.n.e(i12));
                    if (byteArray == null) {
                        aVar2.f6667m = arrayList;
                        aVar2.f6668n = (com.google.android.exoplayer2.drm.b) bundle.getParcelable(com.google.android.exoplayer2.n.d(13));
                        aVar2.f6669o = bundle.getLong(com.google.android.exoplayer2.n.d(14), nVar2.J);
                        aVar2.f6670p = bundle.getInt(com.google.android.exoplayer2.n.d(15), nVar2.K);
                        aVar2.f6671q = bundle.getInt(com.google.android.exoplayer2.n.d(16), nVar2.L);
                        aVar2.r = bundle.getFloat(com.google.android.exoplayer2.n.d(17), nVar2.M);
                        aVar2.f6672s = bundle.getInt(com.google.android.exoplayer2.n.d(18), nVar2.N);
                        aVar2.f6673t = bundle.getFloat(com.google.android.exoplayer2.n.d(19), nVar2.O);
                        aVar2.f6674u = bundle.getByteArray(com.google.android.exoplayer2.n.d(20));
                        aVar2.f6675v = bundle.getInt(com.google.android.exoplayer2.n.d(21), nVar2.Q);
                        aVar2.f6676w = (d9.b) c9.a.b(d9.b.f12608z, bundle.getBundle(com.google.android.exoplayer2.n.d(22)));
                        aVar2.f6677x = bundle.getInt(com.google.android.exoplayer2.n.d(23), nVar2.S);
                        aVar2.f6678y = bundle.getInt(com.google.android.exoplayer2.n.d(24), nVar2.T);
                        aVar2.f6679z = bundle.getInt(com.google.android.exoplayer2.n.d(25), nVar2.U);
                        aVar2.A = bundle.getInt(com.google.android.exoplayer2.n.d(26), nVar2.V);
                        aVar2.B = bundle.getInt(com.google.android.exoplayer2.n.d(27), nVar2.W);
                        aVar2.C = bundle.getInt(com.google.android.exoplayer2.n.d(28), nVar2.X);
                        aVar2.D = bundle.getInt(com.google.android.exoplayer2.n.d(29), nVar2.Y);
                        return new com.google.android.exoplayer2.n(aVar2);
                    }
                    arrayList.add(byteArray);
                    i12++;
                }
            case 3:
                if (bundle.getInt(com.google.android.exoplayer2.o.b(0), -1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.q(z10);
                if (bundle.getBoolean(com.google.android.exoplayer2.o.b(1), false)) {
                    return new com.google.android.exoplayer2.o(bundle.getBoolean(com.google.android.exoplayer2.o.b(2), false));
                }
                return new com.google.android.exoplayer2.o();
            case 4:
                String string7 = bundle.getString(com.google.android.exoplayer2.q.c(0), "");
                string7.getClass();
                Bundle bundle4 = bundle.getBundle(com.google.android.exoplayer2.q.c(1));
                if (bundle4 == null) {
                    eVar = q.e.f6724z;
                } else {
                    eVar = (q.e) jVar.c(bundle4);
                }
                q.e eVar3 = eVar;
                Bundle bundle5 = bundle.getBundle(com.google.android.exoplayer2.q.c(2));
                if (bundle5 == null) {
                    rVar = com.google.android.exoplayer2.r.f6751a0;
                } else {
                    rVar = (com.google.android.exoplayer2.r) com.google.android.exoplayer2.r.f6752b0.c(bundle5);
                }
                com.google.android.exoplayer2.r rVar2 = rVar;
                Bundle bundle6 = bundle.getBundle(com.google.android.exoplayer2.q.c(3));
                if (bundle6 == null) {
                    cVar = q.c.A;
                } else {
                    cVar = (q.c) q.b.f6699z.c(bundle6);
                }
                return new com.google.android.exoplayer2.q(string7, cVar, null, eVar3, rVar2);
            case 5:
                q.b.a aVar4 = new q.b.a();
                long j10 = bundle.getLong(q.b.b(0), 0L);
                if (j10 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.q(z11);
                aVar4.f6705a = j10;
                long j11 = bundle.getLong(q.b.b(1), Long.MIN_VALUE);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    z15 = false;
                }
                sc.b.q(z15);
                aVar4.f6706b = j11;
                aVar4.f6707c = bundle.getBoolean(q.b.b(2), false);
                aVar4.f6708d = bundle.getBoolean(q.b.b(3), false);
                aVar4.f6709e = bundle.getBoolean(q.b.b(4), false);
                return new q.c(aVar4);
            case 6:
                return new q.e(bundle.getLong(q.e.b(0), -9223372036854775807L), bundle.getLong(q.e.b(1), -9223372036854775807L), bundle.getLong(q.e.b(2), -9223372036854775807L), bundle.getFloat(q.e.b(3), -3.4028235E38f), bundle.getFloat(q.e.b(4), -3.4028235E38f));
            case 7:
                r.a aVar5 = new r.a();
                aVar5.f6759a = bundle.getCharSequence(com.google.android.exoplayer2.r.b(0));
                aVar5.f6760b = bundle.getCharSequence(com.google.android.exoplayer2.r.b(1));
                aVar5.f6761c = bundle.getCharSequence(com.google.android.exoplayer2.r.b(2));
                aVar5.f6762d = bundle.getCharSequence(com.google.android.exoplayer2.r.b(3));
                aVar5.f6763e = bundle.getCharSequence(com.google.android.exoplayer2.r.b(4));
                aVar5.f = bundle.getCharSequence(com.google.android.exoplayer2.r.b(5));
                aVar5.f6764g = bundle.getCharSequence(com.google.android.exoplayer2.r.b(6));
                aVar5.f6765h = (Uri) bundle.getParcelable(com.google.android.exoplayer2.r.b(7));
                byte[] byteArray2 = bundle.getByteArray(com.google.android.exoplayer2.r.b(10));
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(29))) {
                    num = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(29)));
                } else {
                    num = null;
                }
                if (byteArray2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) byteArray2.clone();
                }
                aVar5.f6768k = bArr;
                aVar5.f6769l = num;
                aVar5.f6770m = (Uri) bundle.getParcelable(com.google.android.exoplayer2.r.b(11));
                aVar5.f6780x = bundle.getCharSequence(com.google.android.exoplayer2.r.b(22));
                aVar5.f6781y = bundle.getCharSequence(com.google.android.exoplayer2.r.b(23));
                aVar5.f6782z = bundle.getCharSequence(com.google.android.exoplayer2.r.b(24));
                aVar5.C = bundle.getCharSequence(com.google.android.exoplayer2.r.b(27));
                aVar5.D = bundle.getCharSequence(com.google.android.exoplayer2.r.b(28));
                aVar5.E = bundle.getBundle(com.google.android.exoplayer2.r.b(1000));
                boolean containsKey = bundle.containsKey(com.google.android.exoplayer2.r.b(8));
                j jVar2 = com.google.android.exoplayer2.y.f7215u;
                if (containsKey && (bundle3 = bundle.getBundle(com.google.android.exoplayer2.r.b(8))) != null) {
                    aVar5.f6766i = (com.google.android.exoplayer2.y) jVar2.c(bundle3);
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(9)) && (bundle2 = bundle.getBundle(com.google.android.exoplayer2.r.b(9))) != null) {
                    aVar5.f6767j = (com.google.android.exoplayer2.y) jVar2.c(bundle2);
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(12))) {
                    aVar5.f6771n = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(12)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(13))) {
                    aVar5.f6772o = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(13)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(14))) {
                    aVar5.f6773p = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(14)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(15))) {
                    aVar5.f6774q = Boolean.valueOf(bundle.getBoolean(com.google.android.exoplayer2.r.b(15)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(16))) {
                    aVar5.r = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(16)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(17))) {
                    aVar5.f6775s = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(17)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(18))) {
                    aVar5.f6776t = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(18)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(19))) {
                    aVar5.f6777u = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(19)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(20))) {
                    aVar5.f6778v = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(20)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(21))) {
                    aVar5.f6779w = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(21)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(25))) {
                    aVar5.A = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(25)));
                }
                if (bundle.containsKey(com.google.android.exoplayer2.r.b(26))) {
                    aVar5.B = Integer.valueOf(bundle.getInt(com.google.android.exoplayer2.r.b(26)));
                }
                return new com.google.android.exoplayer2.r(aVar5);
            case 8:
                if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                    z14 = true;
                }
                sc.b.q(z14);
                float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                if (f == -1.0f) {
                    return new com.google.android.exoplayer2.u();
                }
                return new com.google.android.exoplayer2.u(f);
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 19:
            default:
                if (bundle.containsKey(q7.d.c(0))) {
                    i6 = bundle.getInt(q7.d.c(0));
                } else {
                    i6 = 0;
                }
                if (bundle.containsKey(q7.d.c(1))) {
                    i11 = bundle.getInt(q7.d.c(1));
                }
                if (bundle.containsKey(q7.d.c(2))) {
                    i10 = bundle.getInt(q7.d.c(2));
                } else {
                    i10 = 1;
                }
                if (bundle.containsKey(q7.d.c(3))) {
                    i13 = bundle.getInt(q7.d.c(3));
                }
                return new q7.d(i6, i11, i10, i13);
            case 13:
                int i15 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 == 3) {
                                return (com.google.android.exoplayer2.y) com.google.android.exoplayer2.d0.f6356x.c(bundle);
                            }
                            throw new IllegalArgumentException(defpackage.b.h(44, "Encountered unknown rating type: ", i15));
                        }
                        return (com.google.android.exoplayer2.y) com.google.android.exoplayer2.b0.f6334x.c(bundle);
                    }
                    return (com.google.android.exoplayer2.y) com.google.android.exoplayer2.u.f7047w.c(bundle);
                }
                return (com.google.android.exoplayer2.y) com.google.android.exoplayer2.o.f6680x.c(bundle);
            case 14:
                if (bundle.getInt(com.google.android.exoplayer2.b0.b(0), -1) == 2) {
                    z13 = true;
                }
                sc.b.q(z13);
                int i16 = bundle.getInt(com.google.android.exoplayer2.b0.b(1), 5);
                float f2 = bundle.getFloat(com.google.android.exoplayer2.b0.b(2), -1.0f);
                if (f2 == -1.0f) {
                    return new com.google.android.exoplayer2.b0(i16);
                }
                return new com.google.android.exoplayer2.b0(f2, i16);
            case 15:
                if (bundle.getInt(com.google.android.exoplayer2.d0.b(0), -1) == 3) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.q(z12);
                if (bundle.getBoolean(com.google.android.exoplayer2.d0.b(1), false)) {
                    return new com.google.android.exoplayer2.d0(bundle.getBoolean(com.google.android.exoplayer2.d0.b(2), false));
                }
                return new com.google.android.exoplayer2.d0();
            case 17:
                int i17 = bundle.getInt(e0.b.f(0), 0);
                long j12 = bundle.getLong(e0.b.f(1), -9223372036854775807L);
                long j13 = bundle.getLong(e0.b.f(2), 0L);
                boolean z16 = bundle.getBoolean(e0.b.f(3));
                Bundle bundle7 = bundle.getBundle(e0.b.f(4));
                if (bundle7 != null) {
                    aVar = (com.google.android.exoplayer2.source.ads.a) com.google.android.exoplayer2.source.ads.a.C.c(bundle7);
                } else {
                    aVar = com.google.android.exoplayer2.source.ads.a.A;
                }
                com.google.android.exoplayer2.source.ads.a aVar6 = aVar;
                e0.b bVar = new e0.b();
                bVar.g(null, null, i17, j12, j13, aVar6, z16);
                return bVar;
            case 18:
                Bundle bundle8 = bundle.getBundle(e0.c.c(1));
                if (bundle8 != null) {
                    qVar = (com.google.android.exoplayer2.q) com.google.android.exoplayer2.q.f6683z.c(bundle8);
                } else {
                    qVar = null;
                }
                long j14 = bundle.getLong(e0.c.c(2), -9223372036854775807L);
                long j15 = bundle.getLong(e0.c.c(3), -9223372036854775807L);
                long j16 = bundle.getLong(e0.c.c(4), -9223372036854775807L);
                boolean z17 = bundle.getBoolean(e0.c.c(5), false);
                boolean z18 = bundle.getBoolean(e0.c.c(6), false);
                Bundle bundle9 = bundle.getBundle(e0.c.c(7));
                if (bundle9 != null) {
                    eVar2 = (q.e) jVar.c(bundle9);
                } else {
                    eVar2 = null;
                }
                boolean z19 = bundle.getBoolean(e0.c.c(8), false);
                long j17 = bundle.getLong(e0.c.c(9), 0L);
                long j18 = bundle.getLong(e0.c.c(10), -9223372036854775807L);
                int i18 = bundle.getInt(e0.c.c(11), 0);
                int i19 = bundle.getInt(e0.c.c(12), 0);
                long j19 = bundle.getLong(e0.c.c(13), 0L);
                e0.c cVar2 = new e0.c();
                cVar2.d(e0.c.M, qVar, null, j14, j15, j16, z17, z18, eVar2, j17, j18, i18, i19, j19);
                cVar2.F = z19;
                return cVar2;
            case 20:
                o8.o oVar = (o8.o) c9.a.b(o8.o.f27301x, bundle.getBundle(f0.a.b(0)));
                oVar.getClass();
                int[] intArray = bundle.getIntArray(f0.a.b(1));
                int i20 = oVar.f27302u;
                return new f0.a(oVar, (int[]) nc.f.a(intArray, new int[i20]), bundle.getInt(f0.a.b(2), -1), (boolean[]) nc.f.a(bundle.getBooleanArray(f0.a.b(3)), new boolean[i20]));
        }
    }

    @Override // u7.k
    public u7.h[] d(Uri uri, Map map) {
        return j();
    }

    @Override // hd.e
    public Object e(hd.p pVar) {
        switch (this.f9739u) {
            case 0:
                return AbtRegistrar.a(pVar);
            case 1:
                return ExecutorsRegistrar.f9561a.get();
            case 2:
                return ExecutorsRegistrar.f9563c.get();
            case 3:
                return ExecutorsRegistrar.f9562b.get();
            case 4:
                hd.l<ScheduledExecutorService> lVar = ExecutorsRegistrar.f9561a;
                return id.i.f19988u;
            case 5:
                return DatabaseRegistrar.a(pVar);
            case 6:
                return TransportRegistrar.a(pVar);
            case 7:
                return FirebaseDynamicLinkRegistrar.a(pVar);
            case 8:
                return FirestoreRegistrar.a(pVar);
            case 9:
                return FirebaseInstallationsRegistrar.a(pVar);
            case 10:
                return FirebaseMessagingRegistrar.a(pVar);
            case 11:
                return FirebasePerfRegistrar.a(pVar);
            default:
                Set h10 = pVar.h(mf.d.class);
                mf.c cVar = mf.c.f25048b;
                if (cVar == null) {
                    synchronized (mf.c.class) {
                        cVar = mf.c.f25048b;
                        if (cVar == null) {
                            cVar = new mf.c();
                            mf.c.f25048b = cVar;
                        }
                    }
                }
                return new mf.b(h10, cVar);
        }
    }

    @Override // c9.j.b
    public void f(Object obj, c9.h hVar) {
        p7.o oVar = (p7.o) obj;
    }

    @Override // s6.c
    public String g(float f) {
        int i6 = b1.I;
        return String.valueOf((int) f);
    }

    @Override // ya.g
    public ya.h h(Object obj) {
        switch (this.f9739u) {
            case 3:
                of.c cVar = (of.c) obj;
                return ya.k.e(null);
            default:
                a.C0162a c0162a = (a.C0162a) obj;
                return ya.k.e(null);
        }
    }

    @Override // t0.t
    public s0 i(View view, s0 s0Var) {
        switch (this.f9739u) {
            case 5:
                kotlin.jvm.internal.i.g(view, "<anonymous parameter 0>");
                return s0.f32350b;
            default:
                return InsetsUtils.a(view, s0Var);
        }
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        switch (this.f9739u) {
            case 0:
                ((w.b) obj).b();
                return;
            default:
                ((w.b) obj).q(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
                return;
        }
    }

    public u7.h[] j() {
        return new u7.h[]{new w7.b()};
    }

    @Override // ya.b
    public Object then(ya.h hVar) {
        return 403;
    }

    @Override // com.google.android.exoplayer2.drm.d.b
    public void a() {
    }
}
