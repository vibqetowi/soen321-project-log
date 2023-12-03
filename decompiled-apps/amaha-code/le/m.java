package le;

import com.google.protobuf.l1;
import rf.n;
import rf.s;
/* compiled from: ServerTimestampOperation.java */
/* loaded from: classes.dex */
public final class m implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final m f24230a = new m();

    @Override // le.o
    public final s a(sc.h hVar, s sVar) {
        s.a j02 = s.j0();
        j02.u();
        s.N((s) j02.f10073v, "server_timestamp");
        s.a j03 = s.j0();
        l1.a R = l1.R();
        long j10 = hVar.f31450u;
        R.u();
        l1.M((l1) R.f10073v, j10);
        R.u();
        l1.N((l1) R.f10073v, hVar.f31451v);
        j03.B(R);
        n.a S = rf.n.S();
        S.x(j02.r(), "__type__");
        S.x(j03.r(), "__local_write_time__");
        if (sVar != null) {
            S.x(sVar, "__previous_value__");
        }
        s.a j04 = s.j0();
        j04.z(S);
        return j04.r();
    }

    @Override // le.o
    public final s c(s sVar) {
        return null;
    }

    @Override // le.o
    public final s b(s sVar, s sVar2) {
        return sVar2;
    }
}
