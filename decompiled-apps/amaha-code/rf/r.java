package rf;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: TargetChange.java */
/* loaded from: classes.dex */
public final class r extends com.google.protobuf.v<r, a> implements r0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final r DEFAULT_INSTANCE;
    private static volatile z0<r> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private zf.a cause_;
    private l1 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private y.c targetIds_ = x.f10081x;
    private com.google.protobuf.h resumeToken_ = com.google.protobuf.h.f9922v;

    /* compiled from: TargetChange.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<r, a> implements r0 {
        public a() {
            super(r.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TargetChange.java */
    /* loaded from: classes.dex */
    public enum b implements y.a {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f30706u;

        b(int i6) {
            this.f30706u = i6;
        }

        public static b d(int i6) {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                return null;
                            }
                            return RESET;
                        }
                        return CURRENT;
                    }
                    return REMOVE;
                }
                return ADD;
            }
            return NO_CHANGE;
        }

        @Override // com.google.protobuf.y.a
        public final int e() {
            if (this != UNRECOGNIZED) {
                return this.f30706u;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.protobuf.v.J(r.class, rVar);
    }

    public static r N() {
        return DEFAULT_INSTANCE;
    }

    public final zf.a M() {
        zf.a aVar = this.cause_;
        if (aVar == null) {
            return zf.a.N();
        }
        return aVar;
    }

    public final l1 O() {
        l1 l1Var = this.readTime_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    public final com.google.protobuf.h P() {
        return this.resumeToken_;
    }

    public final b Q() {
        b d10 = b.d(this.targetChangeType_);
        if (d10 == null) {
            return b.UNRECOGNIZED;
        }
        return d10;
    }

    public final int R() {
        return ((x) this.targetIds_).f10083w;
    }

    public final y.c S() {
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
                return new d1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 3:
                return new r();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<r> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (r.class) {
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
