package rf;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: DocumentChange.java */
/* loaded from: classes.dex */
public final class e extends com.google.protobuf.v<e, a> implements r0 {
    private static final e DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile z0<e> PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private d document_;
    private y.c removedTargetIds_;
    private y.c targetIds_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;

    /* compiled from: DocumentChange.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<e, a> implements r0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.protobuf.v.J(e.class, eVar);
    }

    public e() {
        x xVar = x.f10081x;
        this.targetIds_ = xVar;
        this.removedTargetIds_ = xVar;
    }

    public static e M() {
        return DEFAULT_INSTANCE;
    }

    public final d N() {
        d dVar = this.document_;
        if (dVar == null) {
            return d.P();
        }
        return dVar;
    }

    public final y.c O() {
        return this.removedTargetIds_;
    }

    public final y.c P() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0002\u0000\u0001\t\u0005'\u0006'", new Object[]{"document_", "targetIds_", "removedTargetIds_"});
            case 3:
                return new e();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<e> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (e.class) {
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
