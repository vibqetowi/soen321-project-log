package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: WriteResponse.java */
/* loaded from: classes.dex */
public final class v extends com.google.protobuf.v<v, a> implements r0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final v DEFAULT_INSTANCE;
    private static volatile z0<v> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private l1 commitTime_;
    private String streamId_ = "";
    private com.google.protobuf.h streamToken_ = com.google.protobuf.h.f9922v;
    private y.d<w> writeResults_ = c1.f9893x;

    /* compiled from: WriteResponse.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<v, a> implements r0 {
        public a() {
            super(v.DEFAULT_INSTANCE);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        com.google.protobuf.v.J(v.class, vVar);
    }

    public static v N() {
        return DEFAULT_INSTANCE;
    }

    public final l1 M() {
        l1 l1Var = this.commitTime_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    public final com.google.protobuf.h O() {
        return this.streamToken_;
    }

    public final w P(int i6) {
        return this.writeResults_.get(i6);
    }

    public final int Q() {
        return this.writeResults_.size();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004\t", new Object[]{"streamId_", "streamToken_", "writeResults_", w.class, "commitTime_"});
            case 3:
                return new v();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<v> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (v.class) {
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
