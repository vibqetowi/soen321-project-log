package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.util.List;
/* compiled from: Cursor.java */
/* loaded from: classes.dex */
public final class c extends com.google.protobuf.v<c, a> implements r0 {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    private static volatile z0<c> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private y.d<s> values_ = c1.f9893x;

    /* compiled from: Cursor.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<c, a> implements r0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        com.google.protobuf.v.J(c.class, cVar);
    }

    public static void M(c cVar, List list) {
        y.d<s> dVar = cVar.values_;
        if (!dVar.d0()) {
            cVar.values_ = com.google.protobuf.v.G(dVar);
        }
        com.google.protobuf.a.g(list, cVar.values_);
    }

    public static void N(c cVar, boolean z10) {
        cVar.before_ = z10;
    }

    public static c P() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.x();
    }

    public final boolean O() {
        return this.before_;
    }

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
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", s.class, "before_"});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<c> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c.class) {
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
