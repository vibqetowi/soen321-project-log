package b6;

import h5.g0;
import h5.p;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import ug.l;
import y5.a;
/* compiled from: CrashShieldHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Object> f3946a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3947b;

    public static final void a(Object o10, Throwable th2) {
        i.g(o10, "o");
        if (!f3947b) {
            return;
        }
        f3946a.add(o10);
        p pVar = p.f17269a;
        if (g0.b()) {
            l.c(th2);
            new y5.a(th2, a.EnumC0649a.CrashShield).c();
        }
    }

    public static final boolean b(Object o10) {
        i.g(o10, "o");
        return f3946a.contains(o10);
    }
}
