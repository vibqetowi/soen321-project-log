package me;

import com.google.protobuf.d1;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: NoDocument.java */
/* loaded from: classes.dex */
public final class b extends v<b, a> implements r0 {
    private static final b DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<b> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private String name_ = "";
    private l1 readTime_;

    /* compiled from: NoDocument.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<b, a> implements r0 {
        public a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        v.J(b.class, bVar);
    }

    public static void M(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.name_ = str;
    }

    public static void N(b bVar, l1 l1Var) {
        bVar.getClass();
        bVar.readTime_ = l1Var;
    }

    public static b O() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.x();
    }

    public final String P() {
        return this.name_;
    }

    public final l1 Q() {
        l1 l1Var = this.readTime_;
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
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "readTime_"});
            case 3:
                return new b();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<b> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (b.class) {
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
