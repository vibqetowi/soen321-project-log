package com.google.protobuf;

import com.google.protobuf.v;
/* compiled from: Int32Value.java */
/* loaded from: classes.dex */
public final class w extends v<w, a> implements r0 {
    private static final w DEFAULT_INSTANCE;
    private static volatile z0<w> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* compiled from: Int32Value.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<w, a> implements r0 {
        public a() {
            super(w.DEFAULT_INSTANCE);
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        v.J(w.class, wVar);
    }

    public static void M(w wVar, int i6) {
        wVar.value_ = i6;
    }

    public static w N() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return DEFAULT_INSTANCE.x();
    }

    public final int O() {
        return this.value_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 3:
                return new w();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<w> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (w.class) {
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
