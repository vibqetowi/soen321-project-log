package v2;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34726a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34727b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends x1.e<m> {
        public a(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // x1.e
        public final void e(b2.f fVar, m mVar) {
            m mVar2 = mVar;
            String str = mVar2.f34724a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.t(1, str);
            }
            String str2 = mVar2.f34725b;
            if (str2 == null) {
                fVar.i0(2);
            } else {
                fVar.t(2, str2);
            }
        }
    }

    public o(x1.n nVar) {
        this.f34726a = nVar;
        this.f34727b = new a(nVar);
    }

    @Override // v2.n
    public final void a(m mVar) {
        x1.n nVar = this.f34726a;
        nVar.b();
        nVar.c();
        try {
            this.f34727b.f(mVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }

    @Override // v2.n
    public final ArrayList b(String str) {
        String string;
        x1.p g5 = x1.p.g(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34726a;
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
}
