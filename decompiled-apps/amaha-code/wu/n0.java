package wu;
/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes2.dex */
public final class n0 extends e1 {

    /* renamed from: a  reason: collision with root package name */
    public final gt.v0 f37271a;

    /* renamed from: b  reason: collision with root package name */
    public final hs.d f37272b;

    /* compiled from: StarProjectionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<b0> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final b0 invoke() {
            return kc.f.X(n0.this.f37271a);
        }
    }

    public n0(gt.v0 typeParameter) {
        kotlin.jvm.internal.i.g(typeParameter, "typeParameter");
        this.f37271a = typeParameter;
        this.f37272b = sp.b.N(2, new a());
    }

    @Override // wu.d1
    public final b0 a() {
        return (b0) this.f37272b.getValue();
    }

    @Override // wu.d1
    public final n1 b() {
        return n1.OUT_VARIANCE;
    }

    @Override // wu.d1
    public final d1 c(xu.e kotlinTypeRefiner) {
        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // wu.d1
    public final boolean d() {
        return true;
    }
}
