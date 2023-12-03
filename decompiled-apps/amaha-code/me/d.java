package me;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: UnknownDocument.java */
/* loaded from: classes.dex */
public final class d extends v<d, a> implements r0 {
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String name_ = "";
    private l1 version_;

    /* compiled from: UnknownDocument.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<d, a> implements r0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        v.J(d.class, dVar);
    }

    public static void M(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.name_ = str;
    }

    public static void N(d dVar, l1 l1Var) {
        dVar.getClass();
        dVar.version_ = l1Var;
    }

    public static d O() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.x();
    }

    public final String P() {
        return this.name_;
    }

    public final l1 Q() {
        l1 l1Var = this.version_;
        if (l1Var == null) {
            return l1.O();
        }
        return l1Var;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "version_"});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<d> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (d.class) {
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
