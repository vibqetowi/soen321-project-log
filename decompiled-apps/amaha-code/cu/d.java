package cu;

import au.n;
import au.o;
import hs.j;
import is.u;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: NameResolverImpl.kt */
/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final o f12046a;

    /* renamed from: b  reason: collision with root package name */
    public final n f12047b;

    public d(o oVar, n nVar) {
        this.f12046a = oVar;
        this.f12047b = nVar;
    }

    @Override // cu.c
    public final String a(int i6) {
        j<List<String>, List<String>, Boolean> c10 = c(i6);
        List<String> list = c10.f19473u;
        String m22 = u.m2(c10.f19474v, ".", null, null, null, 62);
        if (!list.isEmpty()) {
            return u.m2(list, "/", null, null, null, 62) + '/' + m22;
        }
        return m22;
    }

    @Override // cu.c
    public final boolean b(int i6) {
        return c(i6).f19475w.booleanValue();
    }

    public final j<List<String>, List<String>, Boolean> c(int i6) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i6 != -1) {
            n.c cVar = this.f12047b.f3778v.get(i6);
            String str = (String) this.f12046a.f3801v.get(cVar.f3786x);
            n.c.EnumC0068c enumC0068c = cVar.f3787y;
            i.d(enumC0068c);
            int ordinal = enumC0068c.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        linkedList2.addFirst(str);
                        z10 = true;
                    }
                } else {
                    linkedList.addFirst(str);
                }
            } else {
                linkedList2.addFirst(str);
            }
            i6 = cVar.f3785w;
        }
        return new j<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // cu.c
    public final String getString(int i6) {
        String str = (String) this.f12046a.f3801v.get(i6);
        i.f(str, "strings.getString(index)");
        return str;
    }
}
