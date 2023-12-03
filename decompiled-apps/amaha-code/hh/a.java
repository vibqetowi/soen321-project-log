package hh;

import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.i;
import lv.g0;
/* compiled from: DefaultLogPrinter.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f17604a;

    public a(int i6) {
        if (i6 != 1) {
            this.f17604a = new HashSet();
        } else {
            this.f17604a = new LinkedHashSet();
        }
    }

    public final synchronized void a(g0 route) {
        i.g(route, "route");
        this.f17604a.remove(route);
    }
}
