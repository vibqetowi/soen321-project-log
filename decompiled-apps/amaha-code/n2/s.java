package n2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25850a = androidx.work.q.f("Schedulers");

    public static void a(androidx.work.b bVar, WorkDatabase workDatabase, List<r> list) {
        if (list != null && list.size() != 0) {
            v2.t u10 = workDatabase.u();
            workDatabase.c();
            try {
                int i6 = Build.VERSION.SDK_INT;
                int i10 = bVar.f3221i;
                if (i6 == 23) {
                    i10 /= 2;
                }
                ArrayList<v2.s> g5 = u10.g(i10);
                ArrayList b10 = u10.b();
                if (g5 != null && g5.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (v2.s sVar : g5) {
                        u10.d(currentTimeMillis, sVar.f34734a);
                    }
                }
                workDatabase.n();
                if (g5 != null && g5.size() > 0) {
                    v2.s[] sVarArr = (v2.s[]) g5.toArray(new v2.s[g5.size()]);
                    for (r rVar : list) {
                        if (rVar.c()) {
                            rVar.b(sVarArr);
                        }
                    }
                }
                if (b10 != null && b10.size() > 0) {
                    v2.s[] sVarArr2 = (v2.s[]) b10.toArray(new v2.s[b10.size()]);
                    for (r rVar2 : list) {
                        if (!rVar2.c()) {
                            rVar2.b(sVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.j();
            }
        }
    }
}
