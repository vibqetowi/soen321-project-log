package rf;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: DocumentRemove.java */
/* loaded from: classes.dex */
public final class h extends com.google.protobuf.v<h, a> implements r0 {
    private static final h DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile z0<h> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private l1 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private y.c removedTargetIds_ = x.f10081x;

    /* compiled from: DocumentRemove.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<h, a> implements r0 {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.protobuf.v.J(h.class, hVar);
    }

    public static h M() {
        return DEFAULT_INSTANCE;
    }

    public final String N() {
        return this.document_;
    }

    public final y.c O() {
        return this.removedTargetIds_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002'\u0004\t", new Object[]{"document_", "removedTargetIds_", "readTime_"});
            case 3:
                return new h();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<h> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (h.class) {
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
