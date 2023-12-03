package lu;

import kotlin.jvm.internal.i;
import v.h;
/* compiled from: DeprecationInfo.kt */
/* loaded from: classes2.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a other = aVar;
        i.g(other, "other");
        d();
        other.d();
        int a10 = h.a(2, 2);
        if (a10 == 0) {
            f();
        }
        return a10;
    }

    public abstract void d();

    public abstract void f();
}
