package ju;

import is.w;
import java.util.List;
import kotlin.jvm.internal.i;
import wu.b0;
import wu.d1;
import wu.i0;
import wu.m1;
import wu.v0;
import wu.x0;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class a extends i0 implements zu.d {

    /* renamed from: v  reason: collision with root package name */
    public final d1 f22628v;

    /* renamed from: w  reason: collision with root package name */
    public final b f22629w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f22630x;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f22631y;

    public a(d1 typeProjection, b constructor, boolean z10, v0 attributes) {
        i.g(typeProjection, "typeProjection");
        i.g(constructor, "constructor");
        i.g(attributes, "attributes");
        this.f22628v = typeProjection;
        this.f22629w = constructor;
        this.f22630x = z10;
        this.f22631y = attributes;
    }

    @Override // wu.b0
    public final List<d1> M0() {
        return w.f20676u;
    }

    @Override // wu.b0
    public final v0 N0() {
        return this.f22631y;
    }

    @Override // wu.b0
    public final x0 O0() {
        return this.f22629w;
    }

    @Override // wu.b0
    public final boolean P0() {
        return this.f22630x;
    }

    @Override // wu.b0
    public final b0 Q0(xu.e kotlinTypeRefiner) {
        i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        d1 c10 = this.f22628v.c(kotlinTypeRefiner);
        i.f(c10, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(c10, this.f22629w, this.f22630x, this.f22631y);
    }

    @Override // wu.i0, wu.m1
    public final m1 S0(boolean z10) {
        if (z10 == this.f22630x) {
            return this;
        }
        return new a(this.f22628v, this.f22629w, z10, this.f22631y);
    }

    @Override // wu.m1
    public final m1 T0(xu.e kotlinTypeRefiner) {
        i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        d1 c10 = this.f22628v.c(kotlinTypeRefiner);
        i.f(c10, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(c10, this.f22629w, this.f22630x, this.f22631y);
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        if (z10 == this.f22630x) {
            return this;
        }
        return new a(this.f22628v, this.f22629w, z10, this.f22631y);
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        i.g(newAttributes, "newAttributes");
        return new a(this.f22628v, this.f22629w, this.f22630x, newAttributes);
    }

    @Override // wu.b0
    public final pu.i p() {
        return yu.i.a(1, true, new String[0]);
    }

    @Override // wu.i0
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f22628v);
        sb2.append(')');
        if (this.f22630x) {
            str = "?";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
