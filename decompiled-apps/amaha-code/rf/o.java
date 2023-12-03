package rf;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: Precondition.java */
/* loaded from: classes.dex */
public final class o extends com.google.protobuf.v<o, a> implements r0 {
    private static final o DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile z0<o> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    /* compiled from: Precondition.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<o, a> implements r0 {
        public a() {
            super(o.DEFAULT_INSTANCE);
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.protobuf.v.J(o.class, oVar);
    }

    public static void M(o oVar, boolean z10) {
        oVar.conditionTypeCase_ = 1;
        oVar.conditionType_ = Boolean.valueOf(z10);
    }

    public static void N(o oVar, l1 l1Var) {
        oVar.getClass();
        oVar.conditionType_ = l1Var;
        oVar.conditionTypeCase_ = 2;
    }

    public static o P() {
        return DEFAULT_INSTANCE;
    }

    public static a S() {
        return DEFAULT_INSTANCE.x();
    }

    public final int O() {
        int i6 = this.conditionTypeCase_;
        if (i6 != 0) {
            if (i6 == 1) {
                return 1;
            }
            if (i6 == 2) {
                return 2;
            }
            return 0;
        }
        return 3;
    }

    public final boolean Q() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public final l1 R() {
        if (this.conditionTypeCase_ == 2) {
            return (l1) this.conditionType_;
        }
        return l1.O();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", l1.class});
            case 3:
                return new o();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<o> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (o.class) {
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
