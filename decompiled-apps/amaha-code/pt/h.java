package pt;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class h extends j0 {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f28907m = 0;

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<gt.b, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f28908u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final Boolean invoke(gt.b bVar) {
            gt.b it = bVar;
            kotlin.jvm.internal.i.g(it, "it");
            int i6 = h.f28907m;
            return Boolean.valueOf(is.u.Z1(j0.f28927g, ta.v.o(it)));
        }
    }

    public static final gt.u a(gt.u functionDescriptor) {
        kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
        fu.e name = functionDescriptor.getName();
        kotlin.jvm.internal.i.f(name, "functionDescriptor.name");
        if (!b(name)) {
            return null;
        }
        return (gt.u) mu.a.b(functionDescriptor, a.f28908u);
    }

    public static boolean b(fu.e eVar) {
        kotlin.jvm.internal.i.g(eVar, "<this>");
        return j0.f.contains(eVar);
    }
}
