package me;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: MaybeDocument.java */
/* loaded from: classes.dex */
public final class a extends v<a, C0406a> implements r0 {
    private static final a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile z0<a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* compiled from: MaybeDocument.java */
    /* renamed from: me.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0406a extends v.a<a, C0406a> implements r0 {
        public C0406a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        v.J(a.class, aVar);
    }

    public static void M(a aVar, boolean z10) {
        aVar.hasCommittedMutations_ = z10;
    }

    public static void N(a aVar, b bVar) {
        aVar.getClass();
        aVar.documentType_ = bVar;
        aVar.documentTypeCase_ = 1;
    }

    public static void O(a aVar, rf.d dVar) {
        aVar.getClass();
        aVar.documentType_ = dVar;
        aVar.documentTypeCase_ = 2;
    }

    public static void P(a aVar, d dVar) {
        aVar.getClass();
        aVar.documentType_ = dVar;
        aVar.documentTypeCase_ = 3;
    }

    public static C0406a V() {
        return DEFAULT_INSTANCE.x();
    }

    public static a W(byte[] bArr) {
        return (a) v.H(DEFAULT_INSTANCE, bArr);
    }

    public final rf.d Q() {
        if (this.documentTypeCase_ == 2) {
            return (rf.d) this.documentType_;
        }
        return rf.d.P();
    }

    public final int R() {
        int i6 = this.documentTypeCase_;
        if (i6 != 0) {
            if (i6 == 1) {
                return 1;
            }
            if (i6 == 2) {
                return 2;
            }
            if (i6 == 3) {
                return 3;
            }
            return 0;
        }
        return 4;
    }

    public final boolean S() {
        return this.hasCommittedMutations_;
    }

    public final b T() {
        if (this.documentTypeCase_ == 1) {
            return (b) this.documentType_;
        }
        return b.O();
    }

    public final d U() {
        if (this.documentTypeCase_ == 3) {
            return (d) this.documentType_;
        }
        return d.O();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", b.class, rf.d.class, d.class, "hasCommittedMutations_"});
            case 3:
                return new a();
            case 4:
                return new C0406a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<a> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a.class) {
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
