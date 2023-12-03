package su;

import au.b;
import gt.q0;
/* compiled from: ProtoContainer.kt */
/* loaded from: classes2.dex */
public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final cu.c f32006a;

    /* renamed from: b  reason: collision with root package name */
    public final cu.e f32007b;

    /* renamed from: c  reason: collision with root package name */
    public final q0 f32008c;

    /* compiled from: ProtoContainer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f0 {

        /* renamed from: d  reason: collision with root package name */
        public final au.b f32009d;

        /* renamed from: e  reason: collision with root package name */
        public final a f32010e;
        public final fu.b f;

        /* renamed from: g  reason: collision with root package name */
        public final b.c f32011g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f32012h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(au.b classProto, cu.c nameResolver, cu.e typeTable, q0 q0Var, a aVar) {
            super(nameResolver, typeTable, q0Var);
            kotlin.jvm.internal.i.g(classProto, "classProto");
            kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.i.g(typeTable, "typeTable");
            this.f32009d = classProto;
            this.f32010e = aVar;
            this.f = ta.v.w(nameResolver, classProto.f3668y);
            b.c cVar = (b.c) cu.b.f.c(classProto.f3667x);
            this.f32011g = cVar == null ? b.c.CLASS : cVar;
            this.f32012h = ri.e.g(cu.b.f12024g, classProto.f3667x, "IS_INNER.get(classProto.flags)");
        }

        @Override // su.f0
        public final fu.c a() {
            fu.c b10 = this.f.b();
            kotlin.jvm.internal.i.f(b10, "classId.asSingleFqName()");
            return b10;
        }
    }

    /* compiled from: ProtoContainer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f0 {

        /* renamed from: d  reason: collision with root package name */
        public final fu.c f32013d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fu.c fqName, cu.c nameResolver, cu.e typeTable, uu.g gVar) {
            super(nameResolver, typeTable, gVar);
            kotlin.jvm.internal.i.g(fqName, "fqName");
            kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.i.g(typeTable, "typeTable");
            this.f32013d = fqName;
        }

        @Override // su.f0
        public final fu.c a() {
            return this.f32013d;
        }
    }

    public f0(cu.c cVar, cu.e eVar, q0 q0Var) {
        this.f32006a = cVar;
        this.f32007b = eVar;
        this.f32008c = q0Var;
    }

    public abstract fu.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
