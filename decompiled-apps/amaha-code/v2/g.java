package v2;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34713a;

    /* renamed from: b  reason: collision with root package name */
    public final f f34714b;

    public g(WorkDatabase workDatabase) {
        this.f34713a = workDatabase;
        this.f34714b = new f(workDatabase);
    }

    @Override // v2.e
    public final void a(d dVar) {
        x1.n nVar = this.f34713a;
        nVar.b();
        nVar.c();
        try {
            this.f34714b.f(dVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }

    @Override // v2.e
    public final Long b(String str) {
        Long l2;
        x1.p g5 = x1.p.g(1, "SELECT long_value FROM Preference where `key`=?");
        g5.t(1, str);
        x1.n nVar = this.f34713a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            if (S.moveToFirst() && !S.isNull(0)) {
                l2 = Long.valueOf(S.getLong(0));
                return l2;
            }
            l2 = null;
            return l2;
        } finally {
            S.close();
            g5.h();
        }
    }
}
