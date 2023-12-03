package rf;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: ExistenceFilter.java */
/* loaded from: classes.dex */
public final class j extends com.google.protobuf.v<j, a> implements r0 {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final j DEFAULT_INSTANCE;
    private static volatile z0<j> PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int count_;
    private int targetId_;

    /* compiled from: ExistenceFilter.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<j, a> implements r0 {
        public a() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        com.google.protobuf.v.J(j.class, jVar);
    }

    public static j N() {
        return DEFAULT_INSTANCE;
    }

    public final int M() {
        return this.count_;
    }

    public final int O() {
        return this.targetId_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"targetId_", "count_"});
            case 3:
                return new j();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<j> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (j.class) {
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
