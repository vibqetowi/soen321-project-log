package me;

import com.google.protobuf.d1;
import com.google.protobuf.h;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
import rf.q;
/* compiled from: Target.java */
/* loaded from: classes.dex */
public final class c extends v<c, a> implements r0 {
    private static final c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile z0<c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private l1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private l1 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private h resumeToken_ = h.f9922v;

    /* compiled from: Target.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<c, a> implements r0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Target.java */
    /* loaded from: classes.dex */
    public enum b {
        QUERY,
        DOCUMENTS,
        TARGETTYPE_NOT_SET
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        v.J(c.class, cVar);
    }

    public static void M(c cVar, q.c cVar2) {
        cVar.getClass();
        cVar.targetType_ = cVar2;
        cVar.targetTypeCase_ = 5;
    }

    public static void N(c cVar, q.b bVar) {
        cVar.getClass();
        cVar.targetType_ = bVar;
        cVar.targetTypeCase_ = 6;
    }

    public static void O(c cVar, l1 l1Var) {
        cVar.getClass();
        cVar.lastLimboFreeSnapshotVersion_ = l1Var;
    }

    public static void P(c cVar) {
        cVar.lastLimboFreeSnapshotVersion_ = null;
    }

    public static void Q(c cVar, int i6) {
        cVar.targetId_ = i6;
    }

    public static void R(c cVar, l1 l1Var) {
        cVar.getClass();
        cVar.snapshotVersion_ = l1Var;
    }

    public static void S(c cVar, h hVar) {
        cVar.getClass();
        hVar.getClass();
        cVar.resumeToken_ = hVar;
    }

    public static void T(c cVar, long j10) {
        cVar.lastListenSequenceNumber_ = j10;
    }

    public static a c0() {
        return DEFAULT_INSTANCE.x();
    }

    public static c d0(byte[] bArr) {
        return (c) v.H(DEFAULT_INSTANCE, bArr);
    }

    public final q.b U() {
        if (this.targetTypeCase_ == 6) {
            return (q.b) this.targetType_;
        }
        return q.b.N();
    }

    public final l1 V() {
        l1 l1Var = this.lastLimboFreeSnapshotVersion_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    public final long W() {
        return this.lastListenSequenceNumber_;
    }

    public final q.c X() {
        if (this.targetTypeCase_ == 5) {
            return (q.c) this.targetType_;
        }
        return q.c.O();
    }

    public final h Y() {
        return this.resumeToken_;
    }

    public final l1 Z() {
        l1 l1Var = this.snapshotVersion_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    public final int a0() {
        return this.targetId_;
    }

    public final b b0() {
        int i6 = this.targetTypeCase_;
        if (i6 != 0) {
            if (i6 != 5) {
                if (i6 != 6) {
                    return null;
                }
                return b.DOCUMENTS;
            }
            return b.QUERY;
        }
        return b.TARGETTYPE_NOT_SET;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", q.c.class, q.b.class, "lastLimboFreeSnapshotVersion_"});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<c> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c.class) {
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
