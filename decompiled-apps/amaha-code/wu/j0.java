package wu;

import java.util.List;
/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes2.dex */
public final class j0 extends i0 {

    /* renamed from: v  reason: collision with root package name */
    public final x0 f37250v;

    /* renamed from: w  reason: collision with root package name */
    public final List<d1> f37251w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f37252x;

    /* renamed from: y  reason: collision with root package name */
    public final pu.i f37253y;

    /* renamed from: z  reason: collision with root package name */
    public final ss.l<xu.e, i0> f37254z;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(x0 constructor, List<? extends d1> arguments, boolean z10, pu.i memberScope, ss.l<? super xu.e, ? extends i0> refinedTypeFactory) {
        kotlin.jvm.internal.i.g(constructor, "constructor");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        kotlin.jvm.internal.i.g(memberScope, "memberScope");
        kotlin.jvm.internal.i.g(refinedTypeFactory, "refinedTypeFactory");
        this.f37250v = constructor;
        this.f37251w = arguments;
        this.f37252x = z10;
        this.f37253y = memberScope;
        this.f37254z = refinedTypeFactory;
        if ((memberScope instanceof yu.e) && !(memberScope instanceof yu.j)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
        }
    }

    @Override // wu.b0
    public final List<d1> M0() {
        return this.f37251w;
    }

    @Override // wu.b0
    public final v0 N0() {
        v0.f37300v.getClass();
        return v0.f37301w;
    }

    @Override // wu.b0
    public final x0 O0() {
        return this.f37250v;
    }

    @Override // wu.b0
    public final boolean P0() {
        return this.f37252x;
    }

    @Override // wu.b0
    public final b0 Q0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 invoke = this.f37254z.invoke(kotlinTypeRefiner);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    @Override // wu.m1
    public final m1 T0(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        i0 invoke = this.f37254z.invoke(kotlinTypeRefiner);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    @Override // wu.i0
    public final i0 V0(boolean z10) {
        if (z10 == this.f37252x) {
            return this;
        }
        if (z10) {
            return new g0(this, 1);
        }
        return new g0(this, 0);
    }

    @Override // wu.i0
    public final i0 W0(v0 newAttributes) {
        kotlin.jvm.internal.i.g(newAttributes, "newAttributes");
        if (newAttributes.isEmpty()) {
            return this;
        }
        return new k0(this, newAttributes);
    }

    @Override // wu.b0
    public final pu.i p() {
        return this.f37253y;
    }
}
