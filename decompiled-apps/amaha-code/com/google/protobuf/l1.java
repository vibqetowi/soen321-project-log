package com.google.protobuf;

import com.google.protobuf.v;
/* compiled from: Timestamp.java */
/* loaded from: classes.dex */
public final class l1 extends v<l1, a> implements r0 {
    private static final l1 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile z0<l1> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* compiled from: Timestamp.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<l1, a> implements r0 {
        public a() {
            super(l1.DEFAULT_INSTANCE);
        }
    }

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        v.J(l1.class, l1Var);
    }

    public static void M(l1 l1Var, long j10) {
        l1Var.seconds_ = j10;
    }

    public static void N(l1 l1Var, int i6) {
        l1Var.nanos_ = i6;
    }

    public static l1 O() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.x();
    }

    public final int P() {
        return this.nanos_;
    }

    public final long Q() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new l1();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<l1> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (l1.class) {
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
