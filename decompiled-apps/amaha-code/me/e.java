package me;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.h;
import com.google.protobuf.i;
import com.google.protobuf.l1;
import com.google.protobuf.n;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import rf.t;
/* compiled from: WriteBatch.java */
/* loaded from: classes.dex */
public final class e extends v<e, a> implements r0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile z0<e> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private y.d<t> baseWrites_;
    private int batchId_;
    private l1 localWriteTime_;
    private y.d<t> writes_;

    /* compiled from: WriteBatch.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<e, a> implements r0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        v.J(e.class, eVar);
    }

    public e() {
        c1<Object> c1Var = c1.f9893x;
        this.writes_ = c1Var;
        this.baseWrites_ = c1Var;
    }

    public static void M(e eVar, int i6) {
        eVar.batchId_ = i6;
    }

    public static void N(e eVar, t tVar) {
        eVar.getClass();
        y.d<t> dVar = eVar.baseWrites_;
        if (!dVar.d0()) {
            eVar.baseWrites_ = v.G(dVar);
        }
        eVar.baseWrites_.add(tVar);
    }

    public static void O(e eVar, t tVar) {
        eVar.getClass();
        y.d<t> dVar = eVar.writes_;
        if (!dVar.d0()) {
            eVar.writes_ = v.G(dVar);
        }
        eVar.writes_.add(tVar);
    }

    public static void P(e eVar, l1 l1Var) {
        eVar.getClass();
        eVar.localWriteTime_ = l1Var;
    }

    public static a W() {
        return DEFAULT_INSTANCE.x();
    }

    public static e X(h hVar) {
        e eVar = DEFAULT_INSTANCE;
        n a10 = n.a();
        i J = hVar.J();
        v I = v.I(eVar, J, a10);
        try {
            J.a(0);
            v.u(I);
            v.u(I);
            return (e) I;
        } catch (InvalidProtocolBufferException e10) {
            throw e10;
        }
    }

    public static e Y(byte[] bArr) {
        return (e) v.H(DEFAULT_INSTANCE, bArr);
    }

    public final t Q(int i6) {
        return this.baseWrites_.get(i6);
    }

    public final int R() {
        return this.baseWrites_.size();
    }

    public final int S() {
        return this.batchId_;
    }

    public final l1 T() {
        l1 l1Var = this.localWriteTime_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    public final t U(int i6) {
        return this.writes_.get(i6);
    }

    public final int V() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", t.class, "localWriteTime_", "baseWrites_", t.class});
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
