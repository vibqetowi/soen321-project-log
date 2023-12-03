package v2;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34709a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34710b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends x1.e<v2.a> {
        public a(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // x1.e
        public final void e(b2.f fVar, v2.a aVar) {
            v2.a aVar2 = aVar;
            String str = aVar2.f34707a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.t(1, str);
            }
            String str2 = aVar2.f34708b;
            if (str2 == null) {
                fVar.i0(2);
            } else {
                fVar.t(2, str2);
            }
        }
    }

    public c(x1.n nVar) {
        this.f34709a = nVar;
        this.f34710b = new a(nVar);
    }

    @Override // v2.b
    public final void a(v2.a aVar) {
        x1.n nVar = this.f34709a;
        nVar.b();
        nVar.c();
        try {
            this.f34710b.f(aVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }

    @Override // v2.b
    public final ArrayList b(String str) {
        String string;
        x1.p g5 = x1.p.g(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34709a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            ArrayList arrayList = new ArrayList(S.getCount());
            while (S.moveToNext()) {
                if (S.isNull(0)) {
                    string = null;
                } else {
                    string = S.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.b
    public final boolean c(String str) {
        boolean z10 = true;
        x1.p g5 = x1.p.g(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34709a;
        nVar.b();
        boolean z11 = false;
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            if (S.moveToFirst()) {
                if (S.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            S.close();
            g5.h();
        }
    }

    @Override // v2.b
    public final boolean d(String str) {
        boolean z10 = true;
        x1.p g5 = x1.p.g(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34709a;
        nVar.b();
        boolean z11 = false;
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            if (S.moveToFirst()) {
                if (S.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            S.close();
            g5.h();
        }
    }
}
