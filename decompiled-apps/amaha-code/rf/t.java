package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import rf.i;
/* compiled from: Write.java */
/* loaded from: classes.dex */
public final class t extends com.google.protobuf.v<t, a> implements r0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final t DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile z0<t> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private o currentDocument_;
    private Object operation_;
    private g updateMask_;
    private int operationCase_ = 0;
    private y.d<i.b> updateTransforms_ = c1.f9893x;

    /* compiled from: Write.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<t, a> implements r0 {
        public a() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Write.java */
    /* loaded from: classes.dex */
    public enum b {
        UPDATE,
        DELETE,
        VERIFY,
        TRANSFORM,
        OPERATION_NOT_SET
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        com.google.protobuf.v.J(t.class, tVar);
    }

    public static void M(t tVar, g gVar) {
        tVar.getClass();
        tVar.updateMask_ = gVar;
    }

    public static void N(t tVar, i.b bVar) {
        tVar.getClass();
        bVar.getClass();
        y.d<i.b> dVar = tVar.updateTransforms_;
        if (!dVar.d0()) {
            tVar.updateTransforms_ = com.google.protobuf.v.G(dVar);
        }
        tVar.updateTransforms_.add(bVar);
    }

    public static void O(t tVar, d dVar) {
        tVar.getClass();
        tVar.operation_ = dVar;
        tVar.operationCase_ = 1;
    }

    public static void P(t tVar, o oVar) {
        tVar.getClass();
        tVar.currentDocument_ = oVar;
    }

    public static void Q(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        tVar.operationCase_ = 2;
        tVar.operation_ = str;
    }

    public static void R(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        tVar.operationCase_ = 5;
        tVar.operation_ = str;
    }

    public static a e0() {
        return DEFAULT_INSTANCE.x();
    }

    public static a f0(t tVar) {
        a x10 = DEFAULT_INSTANCE.x();
        x10.v(tVar);
        return x10;
    }

    public static t g0(byte[] bArr) {
        return (t) com.google.protobuf.v.H(DEFAULT_INSTANCE, bArr);
    }

    public final o S() {
        o oVar = this.currentDocument_;
        if (oVar == null) {
            return o.P();
        }
        return oVar;
    }

    public final String T() {
        if (this.operationCase_ == 2) {
            return (String) this.operation_;
        }
        return "";
    }

    public final b U() {
        int i6 = this.operationCase_;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 5) {
                        if (i6 != 6) {
                            return null;
                        }
                        return b.TRANSFORM;
                    }
                    return b.VERIFY;
                }
                return b.DELETE;
            }
            return b.UPDATE;
        }
        return b.OPERATION_NOT_SET;
    }

    public final i V() {
        if (this.operationCase_ == 6) {
            return (i) this.operation_;
        }
        return i.M();
    }

    public final d W() {
        if (this.operationCase_ == 1) {
            return (d) this.operation_;
        }
        return d.P();
    }

    public final g X() {
        g gVar = this.updateMask_;
        if (gVar == null) {
            return g.N();
        }
        return gVar;
    }

    public final y.d Y() {
        return this.updateTransforms_;
    }

    public final String Z() {
        if (this.operationCase_ == 5) {
            return (String) this.operation_;
        }
        return "";
    }

    public final boolean a0() {
        if (this.currentDocument_ != null) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        if (this.operationCase_ == 6) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if (this.operationCase_ == 1) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if (this.updateMask_ != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", d.class, "updateMask_", "currentDocument_", i.class, "updateTransforms_", i.b.class});
            case 3:
                return new t();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<t> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (t.class) {
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
