package dt;

import java.util.Set;
/* compiled from: PrimitiveType.kt */
/* loaded from: classes2.dex */
public enum k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: u  reason: collision with root package name */
    public final fu.e f13370u;

    /* renamed from: v  reason: collision with root package name */
    public final fu.e f13371v;

    /* renamed from: w  reason: collision with root package name */
    public final hs.d f13372w = sp.b.N(2, new b());

    /* renamed from: x  reason: collision with root package name */
    public final hs.d f13373x = sp.b.N(2, new a());

    /* renamed from: y  reason: collision with root package name */
    public static final Set<k> f13368y = ca.a.m1(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE);

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<fu.c> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final fu.c invoke() {
            return n.f13390j.c(k.this.f13371v);
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<fu.c> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final fu.c invoke() {
            return n.f13390j.c(k.this.f13370u);
        }
    }

    k(String str) {
        this.f13370u = fu.e.j(str);
        this.f13371v = fu.e.j(str.concat("Array"));
    }
}
