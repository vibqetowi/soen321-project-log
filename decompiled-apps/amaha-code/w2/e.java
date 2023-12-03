package w2;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.s;
import androidx.work.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import n2.a0;
import v2.s;
/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public static final String f36290w = androidx.work.q.f("EnqueueRunnable");

    /* renamed from: u  reason: collision with root package name */
    public final n2.u f36291u;

    /* renamed from: v  reason: collision with root package name */
    public final n2.m f36292v;

    public e(n2.u uVar) {
        n2.m mVar = new n2.m();
        this.f36291u = uVar;
        this.f36292v = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(n2.u uVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        a0 a0Var;
        boolean z18;
        boolean z19;
        Iterator<? extends androidx.work.w> it;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        List<n2.u> list = uVar.B;
        String str = f36290w;
        if (list != null) {
            z10 = false;
            for (n2.u uVar2 : list) {
                if (!uVar2.C) {
                    z10 |= a(uVar2);
                } else {
                    androidx.work.q.d().g(str, "Already enqueued work ids (" + TextUtils.join(", ", uVar2.f25856z) + ")");
                }
            }
        } else {
            z10 = false;
        }
        String[] strArr = (String[]) n2.u.L(uVar).toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        a0 a0Var2 = uVar.f25852v;
        WorkDatabase workDatabase = a0Var2.f25794c;
        if (strArr != null && strArr.length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u.a aVar = u.a.SUCCEEDED;
        u.a aVar2 = u.a.CANCELLED;
        u.a aVar3 = u.a.FAILED;
        if (z11) {
            z12 = true;
            z13 = false;
            z14 = false;
            for (String str2 : strArr) {
                v2.s p10 = workDatabase.u().p(str2);
                if (p10 == null) {
                    androidx.work.q.d().b(str, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    z17 = z10;
                    break;
                }
                u.a aVar4 = p10.f34735b;
                if (aVar4 == aVar) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z12 &= z25;
                if (aVar4 == aVar3) {
                    z14 = true;
                } else if (aVar4 == aVar2) {
                    z13 = true;
                }
            }
        } else {
            z12 = true;
            z13 = false;
            z14 = false;
        }
        String str3 = uVar.f25853w;
        boolean z26 = !TextUtils.isEmpty(str3);
        if (z26 && !z11) {
            z15 = true;
        } else {
            z15 = false;
        }
        u.a aVar5 = u.a.ENQUEUED;
        if (z15) {
            ArrayList<s.a> e10 = workDatabase.u().e(str3);
            if (!e10.isEmpty()) {
                androidx.work.f fVar = androidx.work.f.APPEND;
                boolean z27 = z11;
                androidx.work.f fVar2 = androidx.work.f.APPEND_OR_REPLACE;
                z17 = z10;
                androidx.work.f fVar3 = uVar.f25854x;
                if (fVar3 != fVar && fVar3 != fVar2) {
                    if (fVar3 == androidx.work.f.KEEP) {
                        for (s.a aVar6 : e10) {
                            u.a aVar7 = aVar6.f34753b;
                            if (aVar7 != aVar5) {
                                if (aVar7 == u.a.RUNNING) {
                                }
                            }
                            z21 = true;
                            z20 = false;
                        }
                    }
                    new c(a0Var2, str3).run();
                    v2.t u10 = workDatabase.u();
                    for (s.a aVar8 : e10) {
                        u10.a(aVar8.f34752a);
                    }
                    z16 = z26;
                    a0Var = a0Var2;
                    z18 = z27;
                    z19 = true;
                    it = uVar.f25855y.iterator();
                    while (it.hasNext()) {
                    }
                    z20 = z19;
                    z21 = true;
                    uVar.C = z21;
                    return z17 | z20;
                }
                v2.b p11 = workDatabase.p();
                z16 = z26;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = e10.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    s.a aVar9 = (s.a) it2.next();
                    a0 a0Var3 = a0Var2;
                    if (!p11.d(aVar9.f34752a)) {
                        u.a aVar10 = aVar9.f34753b;
                        if (aVar10 == aVar) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z12 &= z24;
                        if (aVar10 == aVar3) {
                            z14 = true;
                        } else if (aVar10 == aVar2) {
                            z13 = true;
                        }
                        arrayList.add(aVar9.f34752a);
                    }
                    it2 = it3;
                    a0Var2 = a0Var3;
                }
                a0Var = a0Var2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (fVar3 == fVar2 && (z13 || z14)) {
                    v2.t u11 = workDatabase.u();
                    for (s.a aVar11 : u11.e(str3)) {
                        u11.a(aVar11.f34752a);
                    }
                    z13 = false;
                    z14 = false;
                    arrayList2 = Collections.emptyList();
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                if (strArr.length > 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = false;
                it = uVar.f25855y.iterator();
                while (it.hasNext()) {
                    androidx.work.w next = it.next();
                    v2.s sVar = next.f3352b;
                    if (z18 && !z12) {
                        if (z14) {
                            sVar.f34735b = aVar3;
                        } else if (z13) {
                            sVar.f34735b = aVar2;
                        } else {
                            sVar.f34735b = u.a.BLOCKED;
                        }
                    } else {
                        sVar.f34746n = currentTimeMillis;
                    }
                    if (sVar.f34735b == aVar5) {
                        z19 = true;
                    }
                    v2.t u12 = workDatabase.u();
                    Iterator<? extends androidx.work.w> it4 = it;
                    a0 a0Var4 = a0Var;
                    List<n2.r> schedulers = a0Var4.f25796e;
                    long j10 = currentTimeMillis;
                    kotlin.jvm.internal.i.g(schedulers, "schedulers");
                    int i6 = Build.VERSION.SDK_INT;
                    if (23 <= i6 && i6 < 26) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (z22) {
                        sVar = kc.f.c0(sVar);
                    } else if (i6 <= 22) {
                        try {
                            Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                            if (!schedulers.isEmpty()) {
                                for (n2.r rVar : schedulers) {
                                    if (cls.isAssignableFrom(rVar.getClass())) {
                                        z23 = true;
                                        break;
                                    }
                                }
                            }
                        } catch (ClassNotFoundException unused) {
                        }
                        z23 = false;
                        if (z23) {
                            sVar = kc.f.c0(sVar);
                        }
                    }
                    u12.u(sVar);
                    UUID uuid = next.f3351a;
                    if (z18) {
                        int length = strArr.length;
                        int i10 = 0;
                        while (i10 < length) {
                            String str4 = strArr[i10];
                            int i11 = length;
                            String uuid2 = uuid.toString();
                            kotlin.jvm.internal.i.f(uuid2, "id.toString()");
                            workDatabase.p().a(new v2.a(uuid2, str4));
                            i10++;
                            strArr = strArr;
                            length = i11;
                        }
                    }
                    String[] strArr2 = strArr;
                    v2.x v10 = workDatabase.v();
                    String uuid3 = uuid.toString();
                    kotlin.jvm.internal.i.f(uuid3, "id.toString()");
                    v10.b(uuid3, next.f3353c);
                    if (z16) {
                        v2.n s10 = workDatabase.s();
                        String uuid4 = uuid.toString();
                        kotlin.jvm.internal.i.f(uuid4, "id.toString()");
                        s10.a(new v2.m(str3, uuid4));
                    }
                    it = it4;
                    currentTimeMillis = j10;
                    strArr = strArr2;
                    a0Var = a0Var4;
                }
                z20 = z19;
                z21 = true;
                uVar.C = z21;
                return z17 | z20;
            }
        }
        z16 = z26;
        z17 = z10;
        a0Var = a0Var2;
        z18 = z11;
        z19 = false;
        it = uVar.f25855y.iterator();
        while (it.hasNext()) {
        }
        z20 = z19;
        z21 = true;
        uVar.C = z21;
        return z17 | z20;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n2.m mVar = this.f36292v;
        n2.u uVar = this.f36291u;
        try {
            uVar.getClass();
            a0 a0Var = uVar.f25852v;
            if (!n2.u.K(uVar, new HashSet())) {
                WorkDatabase workDatabase = a0Var.f25794c;
                workDatabase.c();
                boolean a10 = a(uVar);
                workDatabase.n();
                workDatabase.j();
                if (a10) {
                    l.a(a0Var.f25792a, RescheduleReceiver.class, true);
                    n2.s.a(a0Var.f25793b, a0Var.f25794c, a0Var.f25796e);
                }
                mVar.a(androidx.work.s.f3336a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + uVar + ")");
        } catch (Throwable th2) {
            mVar.a(new s.a.C0044a(th2));
        }
    }
}
