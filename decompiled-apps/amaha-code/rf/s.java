package rf;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import rf.a;
import rf.n;
/* compiled from: Value.java */
/* loaded from: classes.dex */
public final class s extends com.google.protobuf.v<s, a> implements r0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final s DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile z0<s> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* compiled from: Value.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<s, a> implements r0 {
        public a() {
            super(s.DEFAULT_INSTANCE);
        }

        public final void A(n nVar) {
            u();
            s.S((s) this.f10073v, nVar);
        }

        public final void B(l1.a aVar) {
            u();
            s.M((s) this.f10073v, aVar.r());
        }

        public final void x(a.C0520a c0520a) {
            u();
            s.R(c0520a.r(), (s) this.f10073v);
        }

        public final void y(double d10) {
            u();
            s.W((s) this.f10073v, d10);
        }

        public final void z(n.a aVar) {
            u();
            s.S((s) this.f10073v, aVar.r());
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.google.protobuf.v.J(s.class, sVar);
    }

    public static void M(s sVar, l1 l1Var) {
        sVar.getClass();
        sVar.valueType_ = l1Var;
        sVar.valueTypeCase_ = 10;
    }

    public static void N(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.valueTypeCase_ = 17;
        sVar.valueType_ = str;
    }

    public static void O(s sVar, com.google.protobuf.h hVar) {
        sVar.getClass();
        hVar.getClass();
        sVar.valueTypeCase_ = 18;
        sVar.valueType_ = hVar;
    }

    public static void P(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.valueTypeCase_ = 5;
        sVar.valueType_ = str;
    }

    public static void Q(s sVar, ag.a aVar) {
        sVar.getClass();
        sVar.valueType_ = aVar;
        sVar.valueTypeCase_ = 8;
    }

    public static void R(rf.a aVar, s sVar) {
        sVar.getClass();
        aVar.getClass();
        sVar.valueType_ = aVar;
        sVar.valueTypeCase_ = 9;
    }

    public static void S(s sVar, n nVar) {
        sVar.getClass();
        nVar.getClass();
        sVar.valueType_ = nVar;
        sVar.valueTypeCase_ = 6;
    }

    public static void T(s sVar) {
        y0 y0Var = y0.NULL_VALUE;
        sVar.getClass();
        sVar.valueType_ = Integer.valueOf(y0Var.e());
        sVar.valueTypeCase_ = 11;
    }

    public static void U(s sVar, boolean z10) {
        sVar.valueTypeCase_ = 1;
        sVar.valueType_ = Boolean.valueOf(z10);
    }

    public static void V(s sVar, long j10) {
        sVar.valueTypeCase_ = 2;
        sVar.valueType_ = Long.valueOf(j10);
    }

    public static void W(s sVar, double d10) {
        sVar.valueTypeCase_ = 3;
        sVar.valueType_ = Double.valueOf(d10);
    }

    public static s a0() {
        return DEFAULT_INSTANCE;
    }

    public static a j0() {
        return DEFAULT_INSTANCE.x();
    }

    public final rf.a X() {
        if (this.valueTypeCase_ == 9) {
            return (rf.a) this.valueType_;
        }
        return rf.a.P();
    }

    public final boolean Y() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final com.google.protobuf.h Z() {
        if (this.valueTypeCase_ == 18) {
            return (com.google.protobuf.h) this.valueType_;
        }
        return com.google.protobuf.h.f9922v;
    }

    public final double b0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final ag.a c0() {
        if (this.valueTypeCase_ == 8) {
            return (ag.a) this.valueType_;
        }
        return ag.a.O();
    }

    public final long d0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final n e0() {
        if (this.valueTypeCase_ == 6) {
            return (n) this.valueType_;
        }
        return n.N();
    }

    public final String f0() {
        if (this.valueTypeCase_ == 5) {
            return (String) this.valueType_;
        }
        return "";
    }

    public final String g0() {
        if (this.valueTypeCase_ == 17) {
            return (String) this.valueType_;
        }
        return "";
    }

    public final l1 h0() {
        if (this.valueTypeCase_ == 10) {
            return (l1) this.valueType_;
        }
        return l1.O();
    }

    public final int i0() {
        int i6 = this.valueTypeCase_;
        if (i6 != 0) {
            if (i6 == 1) {
                return 2;
            }
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 5) {
                        if (i6 != 6) {
                            if (i6 != 17) {
                                if (i6 != 18) {
                                    switch (i6) {
                                        case 8:
                                            return 9;
                                        case 9:
                                            return 10;
                                        case 10:
                                            return 5;
                                        case 11:
                                            return 1;
                                        default:
                                            return 0;
                                    }
                                }
                                return 7;
                            }
                            return 6;
                        }
                        return 11;
                    }
                    return 8;
                }
                return 4;
            }
            return 3;
        }
        return 12;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", n.class, ag.a.class, rf.a.class, l1.class});
            case 3:
                return new s();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<s> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (s.class) {
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
