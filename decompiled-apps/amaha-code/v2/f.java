package v2;

import androidx.work.impl.WorkDatabase;
/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f extends x1.e<d> {
    public f(WorkDatabase workDatabase) {
        super(workDatabase);
    }

    @Override // x1.u
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // x1.e
    public final void e(b2.f fVar, d dVar) {
        d dVar2 = dVar;
        String str = dVar2.f34711a;
        if (str == null) {
            fVar.i0(1);
        } else {
            fVar.t(1, str);
        }
        Long l2 = dVar2.f34712b;
        if (l2 == null) {
            fVar.i0(2);
        } else {
            fVar.M(2, l2.longValue());
        }
    }
}
