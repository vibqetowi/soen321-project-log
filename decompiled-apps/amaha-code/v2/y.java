package v2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    public final x1.n f34774a;

    /* renamed from: b  reason: collision with root package name */
    public final a f34775b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends x1.e<w> {
        public a(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // x1.e
        public final void e(b2.f fVar, w wVar) {
            w wVar2 = wVar;
            String str = wVar2.f34772a;
            if (str == null) {
                fVar.i0(1);
            } else {
                fVar.t(1, str);
            }
            String str2 = wVar2.f34773b;
            if (str2 == null) {
                fVar.i0(2);
            } else {
                fVar.t(2, str2);
            }
        }
    }

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends x1.u {
        public b(x1.n nVar) {
            super(nVar);
        }

        @Override // x1.u
        public final String c() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public y(x1.n nVar) {
        this.f34774a = nVar;
        this.f34775b = new a(nVar);
        new b(nVar);
    }

    @Override // v2.x
    public final ArrayList a(String str) {
        String string;
        x1.p g5 = x1.p.g(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            g5.i0(1);
        } else {
            g5.t(1, str);
        }
        x1.n nVar = this.f34774a;
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

    @Override // v2.x
    public final void b(String str, Set<String> tags) {
        kotlin.jvm.internal.i.g(tags, "tags");
        for (String str2 : tags) {
            c(new w(str2, str));
        }
    }

    public final void c(w wVar) {
        x1.n nVar = this.f34774a;
        nVar.b();
        nVar.c();
        try {
            this.f34775b.f(wVar);
            nVar.n();
        } finally {
            nVar.j();
        }
    }
}
