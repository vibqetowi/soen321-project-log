package rf;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: ListenResponse.java */
/* loaded from: classes.dex */
public final class m extends com.google.protobuf.v<m, a> implements r0 {
    private static final m DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile z0<m> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* compiled from: ListenResponse.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<m, a> implements r0 {
        public a() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        com.google.protobuf.v.J(m.class, mVar);
    }

    public static m M() {
        return DEFAULT_INSTANCE;
    }

    public final e N() {
        if (this.responseTypeCase_ == 3) {
            return (e) this.responseType_;
        }
        return e.M();
    }

    public final f O() {
        if (this.responseTypeCase_ == 4) {
            return (f) this.responseType_;
        }
        return f.M();
    }

    public final h P() {
        if (this.responseTypeCase_ == 6) {
            return (h) this.responseType_;
        }
        return h.M();
    }

    public final j Q() {
        if (this.responseTypeCase_ == 5) {
            return (j) this.responseType_;
        }
        return j.N();
    }

    public final int R() {
        int i6 = this.responseTypeCase_;
        if (i6 == 0) {
            return 6;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 5) {
                        if (i6 != 6) {
                            return 0;
                        }
                        return 4;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public final r S() {
        if (this.responseTypeCase_ == 2) {
            return (r) this.responseType_;
        }
        return r.N();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", r.class, e.class, f.class, j.class, h.class});
            case 3:
                return new m();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<m> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (m.class) {
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
