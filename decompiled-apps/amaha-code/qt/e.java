package qt;

import dt.n;
import ht.m;
import ht.n;
import is.e0;
import is.q;
import is.y;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, EnumSet<n>> f30121a = e0.u0(new hs.f("PACKAGE", EnumSet.noneOf(n.class)), new hs.f("TYPE", EnumSet.of(n.J, n.V)), new hs.f("ANNOTATION_TYPE", EnumSet.of(n.K)), new hs.f("TYPE_PARAMETER", EnumSet.of(n.L)), new hs.f("FIELD", EnumSet.of(n.N)), new hs.f("LOCAL_VARIABLE", EnumSet.of(n.O)), new hs.f("PARAMETER", EnumSet.of(n.P)), new hs.f("CONSTRUCTOR", EnumSet.of(n.Q)), new hs.f("METHOD", EnumSet.of(n.R, n.S, n.T)), new hs.f("TYPE_USE", EnumSet.of(n.U)));

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, m> f30122b = e0.u0(new hs.f("RUNTIME", m.RUNTIME), new hs.f("CLASS", m.BINARY), new hs.f("SOURCE", m.SOURCE));

    public static ku.b a(List arguments) {
        String str;
        kotlin.jvm.internal.i.g(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof wt.m) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fu.e d10 = ((wt.m) it.next()).d();
            if (d10 != null) {
                str = d10.f();
            } else {
                str = null;
            }
            EnumSet<n> enumSet = f30121a.get(str);
            if (enumSet == null) {
                enumSet = y.f20678u;
            }
            q.R1(enumSet, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(is.i.H1(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new ku.j(fu.b.l(n.a.f13415u), fu.e.j(((ht.n) it2.next()).name())));
        }
        return new ku.b(arrayList3, d.f30120u);
    }
}
