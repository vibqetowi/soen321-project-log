package yu;

import gt.v0;
import is.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import wu.b0;
import wu.x0;
/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class g implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f39081a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f39082b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39083c;

    public g(h hVar, String... formatParams) {
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        this.f39081a = hVar;
        this.f39082b = formatParams;
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(hVar.f39088u, Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.i.f(format, "format(this, *args)");
        this.f39083c = defpackage.b.o(new Object[]{format}, 1, "[Error type: %s]", "format(this, *args)");
    }

    @Override // wu.x0
    public final gt.g a() {
        i.f39090a.getClass();
        return i.f39092c;
    }

    @Override // wu.x0
    public final Collection<b0> c() {
        return w.f20676u;
    }

    @Override // wu.x0
    public final boolean d() {
        return false;
    }

    @Override // wu.x0
    public final List<v0> getParameters() {
        return w.f20676u;
    }

    @Override // wu.x0
    public final dt.j o() {
        dt.d dVar = dt.d.f;
        return dt.d.f;
    }

    public final String toString() {
        return this.f39083c;
    }
}
