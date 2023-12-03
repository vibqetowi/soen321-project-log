package cu;

import au.p;
import au.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: TypeTable.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<p> f12048a;

    public e(s sVar) {
        boolean z10;
        List<p> list = sVar.f3853w;
        int i6 = 0;
        if ((sVar.f3852v & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = sVar.f3854x;
            i.f(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
            for (Object obj : list) {
                int i11 = i6 + 1;
                if (i6 >= 0) {
                    p pVar = (p) obj;
                    if (i6 >= i10) {
                        pVar.getClass();
                        p.c s10 = p.s(pVar);
                        s10.f3827x |= 2;
                        s10.f3829z = true;
                        pVar = s10.l();
                        if (!pVar.d()) {
                            throw new UninitializedMessageException();
                        }
                    }
                    arrayList.add(pVar);
                    i6 = i11;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
            list = arrayList;
        }
        i.f(list, "run {\n        val origin… else originalTypes\n    }");
        this.f12048a = list;
    }

    public final p a(int i6) {
        return this.f12048a.get(i6);
    }
}
