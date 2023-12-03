package cv;

import cv.e;
import wu.b0;
import wu.i0;
/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class t implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ss.l<dt.j, b0> f12103a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12104b;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends t {

        /* renamed from: c  reason: collision with root package name */
        public static final a f12105c = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: cv.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0181a extends kotlin.jvm.internal.k implements ss.l<dt.j, b0> {

            /* renamed from: u  reason: collision with root package name */
            public static final C0181a f12106u = new C0181a();

            public C0181a() {
                super(1);
            }

            @Override // ss.l
            public final b0 invoke(dt.j jVar) {
                dt.j jVar2 = jVar;
                kotlin.jvm.internal.i.g(jVar2, "$this$null");
                i0 t3 = jVar2.t(dt.k.BOOLEAN);
                if (t3 != null) {
                    return t3;
                }
                dt.j.a(63);
                throw null;
            }
        }

        public a() {
            super("Boolean", C0181a.f12106u);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends t {

        /* renamed from: c  reason: collision with root package name */
        public static final b f12107c = new b();

        /* compiled from: modifierChecks.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.l<dt.j, b0> {

            /* renamed from: u  reason: collision with root package name */
            public static final a f12108u = new a();

            public a() {
                super(1);
            }

            @Override // ss.l
            public final b0 invoke(dt.j jVar) {
                dt.j jVar2 = jVar;
                kotlin.jvm.internal.i.g(jVar2, "$this$null");
                i0 t3 = jVar2.t(dt.k.INT);
                if (t3 != null) {
                    return t3;
                }
                dt.j.a(58);
                throw null;
            }
        }

        public b() {
            super("Int", a.f12108u);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends t {

        /* renamed from: c  reason: collision with root package name */
        public static final c f12109c = new c();

        /* compiled from: modifierChecks.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.l<dt.j, b0> {

            /* renamed from: u  reason: collision with root package name */
            public static final a f12110u = new a();

            public a() {
                super(1);
            }

            @Override // ss.l
            public final b0 invoke(dt.j jVar) {
                dt.j jVar2 = jVar;
                kotlin.jvm.internal.i.g(jVar2, "$this$null");
                i0 unitType = jVar2.x();
                kotlin.jvm.internal.i.f(unitType, "unitType");
                return unitType;
            }
        }

        public c() {
            super("Unit", a.f12110u);
        }
    }

    public t(String str, ss.l lVar) {
        this.f12103a = lVar;
        this.f12104b = "must return ".concat(str);
    }

    @Override // cv.e
    public final String a() {
        return this.f12104b;
    }

    @Override // cv.e
    public final String b(gt.u uVar) {
        return e.a.a(this, uVar);
    }

    @Override // cv.e
    public final boolean c(gt.u functionDescriptor) {
        kotlin.jvm.internal.i.g(functionDescriptor, "functionDescriptor");
        return kotlin.jvm.internal.i.b(functionDescriptor.getReturnType(), this.f12103a.invoke(mu.a.e(functionDescriptor)));
    }
}
