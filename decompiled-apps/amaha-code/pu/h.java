package pu;
/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes2.dex */
public final class h extends pu.a {

    /* renamed from: b  reason: collision with root package name */
    public final vu.i<i> f29002b;

    /* compiled from: LazyScopeAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<i> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ss.a<i> f29003u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ss.a<? extends i> aVar) {
            super(0);
            this.f29003u = aVar;
        }

        @Override // ss.a
        public final i invoke() {
            i invoke = this.f29003u.invoke();
            if (invoke instanceof pu.a) {
                return ((pu.a) invoke).h();
            }
            return invoke;
        }
    }

    public h(vu.l storageManager, ss.a<? extends i> aVar) {
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        this.f29002b = storageManager.e(new a(aVar));
    }

    @Override // pu.a
    public final i i() {
        return this.f29002b.invoke();
    }
}
