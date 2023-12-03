package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: WriteResult.java */
/* loaded from: classes.dex */
public final class w extends com.google.protobuf.v<w, a> implements r0 {
    private static final w DEFAULT_INSTANCE;
    private static volatile z0<w> PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private y.d<s> transformResults_ = c1.f9893x;
    private l1 updateTime_;

    /* compiled from: WriteResult.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<w, a> implements r0 {
        public a() {
            super(w.DEFAULT_INSTANCE);
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.google.protobuf.v.J(w.class, wVar);
    }

    public final s M(int i6) {
        return this.transformResults_.get(i6);
    }

    public final int N() {
        return this.transformResults_.size();
    }

    public final l1 O() {
        l1 l1Var = this.updateTime_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"updateTime_", "transformResults_", s.class});
            case 3:
                return new w();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<w> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (w.class) {
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
