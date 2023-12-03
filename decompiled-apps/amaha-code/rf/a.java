package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.util.Collections;
import java.util.List;
/* compiled from: ArrayValue.java */
/* loaded from: classes.dex */
public final class a extends com.google.protobuf.v<a, C0520a> implements b {
    private static final a DEFAULT_INSTANCE;
    private static volatile z0<a> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private y.d<s> values_ = c1.f9893x;

    /* compiled from: ArrayValue.java */
    /* renamed from: rf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0520a extends v.a<a, C0520a> implements b {
        public C0520a() {
            super(a.DEFAULT_INSTANCE);
        }

        @Override // rf.b
        public final List<s> p() {
            return Collections.unmodifiableList(((a) this.f10073v).p());
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.protobuf.v.J(a.class, aVar);
    }

    public static void M(a aVar, s sVar) {
        aVar.getClass();
        sVar.getClass();
        y.d<s> dVar = aVar.values_;
        if (!dVar.d0()) {
            aVar.values_ = com.google.protobuf.v.G(dVar);
        }
        aVar.values_.add(sVar);
    }

    public static void N(a aVar, List list) {
        y.d<s> dVar = aVar.values_;
        if (!dVar.d0()) {
            aVar.values_ = com.google.protobuf.v.G(dVar);
        }
        com.google.protobuf.a.g(list, aVar.values_);
    }

    public static void O(a aVar, int i6) {
        y.d<s> dVar = aVar.values_;
        if (!dVar.d0()) {
            aVar.values_ = com.google.protobuf.v.G(dVar);
        }
        aVar.values_.remove(i6);
    }

    public static a P() {
        return DEFAULT_INSTANCE;
    }

    public static C0520a S() {
        return DEFAULT_INSTANCE.x();
    }

    public final s Q(int i6) {
        return this.values_.get(i6);
    }

    public final int R() {
        return this.values_.size();
    }

    @Override // rf.b
    public final List<s> p() {
        return this.values_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", s.class});
            case 3:
                return new a();
            case 4:
                return new C0520a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<a> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new v.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
