package mf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f25046a;

    /* renamed from: b  reason: collision with root package name */
    public final c f25047b;

    public b(Set<d> set, c cVar) {
        this.f25046a = b(set);
        this.f25047b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // mf.f
    public final String a() {
        Set unmodifiableSet;
        c cVar = this.f25047b;
        synchronized (cVar.f25049a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f25049a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f25046a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(cVar.a());
    }
}
