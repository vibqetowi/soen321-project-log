package rf;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: DocumentDelete.java */
/* loaded from: classes.dex */
public final class f extends com.google.protobuf.v<f, a> implements r0 {
    private static final f DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile z0<f> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private l1 readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private String document_ = "";
    private y.c removedTargetIds_ = x.f10081x;

    /* compiled from: DocumentDelete.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<f, a> implements r0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.protobuf.v.J(f.class, fVar);
    }

    public static f M() {
        return DEFAULT_INSTANCE;
    }

    public final String N() {
        return this.document_;
    }

    public final l1 O() {
        l1 l1Var = this.readTime_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    public final y.c P() {
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
                return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0001\u0000\u0001Ȉ\u0004\t\u0006'", new Object[]{"document_", "readTime_", "removedTargetIds_"});
            case 3:
                return new f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<f> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (f.class) {
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
