package v2;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34718a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34719b;

    /* renamed from: c  reason: collision with root package name */
    public final b f34720c;

    /* renamed from: d  reason: collision with root package name */
    public final c f34721d;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends x1.e<i> {
        public a(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // x1.e
        public final void e(b2.f fVar, i iVar) {
            i iVar2 = iVar;
            String str = iVar2.f34715a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.t(1, str);
            }
            fVar.M(2, iVar2.f34716b);
            fVar.M(3, iVar2.f34717c);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends x1.u {
        public b(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends x1.u {
        public c(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(x1.n nVar) {
        this.f34718a = nVar;
        this.f34719b = new a(nVar);
        this.f34720c = new b(nVar);
        this.f34721d = new c(nVar);
    }

    @Override // v2.j
    public final void a(l lVar) {
        g(lVar.f34723b, lVar.f34722a);
    }

    @Override // v2.j
    public final ArrayList b() {
        String string;
        x1.p g5 = x1.p.g(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        x1.n nVar = this.f34718a;
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

    @Override // v2.j
    public final i c(l id2) {
        kotlin.jvm.internal.i.g(id2, "id");
        return f(id2.f34723b, id2.f34722a);
    }

    @Override // v2.j
    public final void d(String str) {
        x1.n nVar = this.f34718a;
        nVar.b();
        c cVar = this.f34721d;
        b2.f a10 = cVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            cVar.d(a10);
        }
    }

    @Override // v2.j
    public final void e(i iVar) {
        x1.n nVar = this.f34718a;
        nVar.b();
        nVar.c();
        try {
            this.f34719b.f(iVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }

    public final i f(int i6, String str) {
        x1.p g5 = x1.p.g(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        g5.M(2, i6);
        x1.n nVar = this.f34718a;
        nVar.b();
        Cursor S = kc.f.S(nVar, g5, false);
        try {
            int d02 = ca.a.d0(S, "work_spec_id");
            int d03 = ca.a.d0(S, "generation");
            int d04 = ca.a.d0(S, "system_id");
            i iVar = null;
            String string = null;
            if (S.moveToFirst()) {
                if (!S.isNull(d02)) {
                    string = S.getString(d02);
                }
                iVar = new i(string, S.getInt(d03), S.getInt(d04));
            }
            return iVar;
        } finally {
            S.close();
            g5.h();
        }
    }

    public final void g(int i6, String str) {
        x1.n nVar = this.f34718a;
        nVar.b();
        b bVar = this.f34720c;
        b2.f a10 = bVar.a();
        if (str == null) {
            a10.i0(1);
        } else {
            a10.t(1, str);
        }
        a10.M(2, i6);
        nVar.c();
        try {
            a10.v();
            nVar.n();
        } finally {
            nVar.j();
            bVar.d(a10);
        }
    }
}
