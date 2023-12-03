package yu;

import java.util.Arrays;
import java.util.List;
import wu.b0;
import wu.d1;
import wu.i0;
import wu.m1;
import wu.v0;
import wu.x0;
/* compiled from: ErrorType.kt */
/* loaded from: classes2.dex */
public final class f extends i0 {
    public final String[] A;
    public final String B;

    /* renamed from: v  reason: collision with root package name */
    public final x0 f39076v;

    /* renamed from: w  reason: collision with root package name */
    public final pu.i f39077w;

    /* renamed from: x  reason: collision with root package name */
    public final h f39078x;

    /* renamed from: y  reason: collision with root package name */
    public final List<d1> f39079y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f39080z;

    /* JADX WARN: Multi-variable type inference failed */
    public f(x0 constructor, pu.i memberScope, h kind, List<? extends d1> arguments, boolean z10, String... formatParams) {
        kotlin.jvm.internal.i.g(constructor, "constructor");
        kotlin.jvm.internal.i.g(memberScope, "memberScope");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        kotlin.jvm.internal.i.g(formatParams, "formatParams");
        this.f39076v = constructor;
        this.f39077w = memberScope;
        this.f39078x = kind;
        this.f39079y = arguments;
        this.f39080z = z10;
        this.A = formatParams;
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(kind.f39088u, Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.i.f(format, "format(format, *args)");
        this.B = format;
    }

    @Override // wu.b0
    public final List<d1> M0() {
        return this.f39079y;
    }

    @Override // wu.b0
    public final v0 N0() {
        v0.f37300v.getClass();
        return v0.f37301w;
    }

    @Override // wu.b0
    public final x0 O0() {
        return this.f39076v;
    }

    @Override // wu.b0
    public final boolean P0() {
        return this.f39080z;
    }

    @Override // wu.b0
    public final b0 Q0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // wu.m1
    public final m1 T0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // wu.i0, wu.m1
    public final m1 U0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return this;
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        x0 x0Var = this.f39076v;
        pu.i iVar = this.f39077w;
        h hVar = this.f39078x;
        List<d1> list = this.f39079y;
        String[] strArr = this.A;
        return new f(x0Var, iVar, hVar, list, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        return this;
    }

    @Override // wu.b0
    public final pu.i p() {
        return this.f39077w;
    }
}
