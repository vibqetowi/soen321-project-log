package yu;

import gt.k0;
import is.w;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import wu.x0;
/* compiled from: ErrorUtils.kt */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f39090a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static final c f39091b = c.f39070u;

    /* renamed from: c  reason: collision with root package name */
    public static final a f39092c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f39093d;

    /* renamed from: e  reason: collision with root package name */
    public static final f f39094e;
    public static final Set<k0> f;

    static {
        String format = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1));
        kotlin.jvm.internal.i.f(format, "format(this, *args)");
        f39092c = new a(fu.e.l(format));
        f39093d = c(h.B, new String[0]);
        f39094e = c(h.O, new String[0]);
        f = ca.a.l1(new d());
    }

    public static final e a(int i6, boolean z10, String... formatParams) {
        defpackage.d.j(i6, "kind");
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        if (z10) {
            return new j(i6, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        return new e(i6, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final e b(int i6, String... strArr) {
        defpackage.d.j(i6, "kind");
        return a(i6, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f c(h hVar, String... strArr) {
        w wVar = w.f20676u;
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        return e(hVar, wVar, d(hVar, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static g d(h hVar, String... formatParams) {
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        return new g(hVar, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static f e(h hVar, List list, x0 x0Var, String... formatParams) {
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        return new f(x0Var, b(7, x0Var.toString()), hVar, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(gt.j jVar) {
        if (jVar != null && ((jVar instanceof a) || (jVar.c() instanceof a) || jVar == f39091b)) {
            return true;
        }
        return false;
    }
}
