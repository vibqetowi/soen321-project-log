package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: DocumentMask.java */
/* loaded from: classes.dex */
public final class g extends com.google.protobuf.v<g, a> implements r0 {
    private static final g DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile z0<g> PARSER;
    private y.d<String> fieldPaths_ = c1.f9893x;

    /* compiled from: DocumentMask.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<g, a> implements r0 {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.protobuf.v.J(g.class, gVar);
    }

    public static void M(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        y.d<String> dVar = gVar.fieldPaths_;
        if (!dVar.d0()) {
            gVar.fieldPaths_ = com.google.protobuf.v.G(dVar);
        }
        gVar.fieldPaths_.add(str);
    }

    public static g N() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return DEFAULT_INSTANCE.x();
    }

    public final String O(int i6) {
        return this.fieldPaths_.get(i6);
    }

    public final int P() {
        return this.fieldPaths_.size();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 3:
                return new g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
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
