package rf;

import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.l1;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.z0;
import java.util.Collections;
import java.util.Map;
/* compiled from: Document.java */
/* loaded from: classes.dex */
public final class d extends com.google.protobuf.v<d, a> implements r0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final d DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<d> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private l1 createTime_;
    private k0<String, s> fields_ = k0.f9995v;
    private String name_ = "";
    private l1 updateTime_;

    /* compiled from: Document.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<d, a> implements r0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Document.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, s> f30662a = new j0<>(s1.f10037x, s1.f10039z, s.a0());
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.protobuf.v.J(d.class, dVar);
    }

    public static void M(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        dVar.name_ = str;
    }

    public static k0 N(d dVar) {
        k0<String, s> k0Var = dVar.fields_;
        if (!k0Var.f9996u) {
            dVar.fields_ = k0Var.c();
        }
        return dVar.fields_;
    }

    public static void O(d dVar, l1 l1Var) {
        dVar.getClass();
        dVar.updateTime_ = l1Var;
    }

    public static d P() {
        return DEFAULT_INSTANCE;
    }

    public static a T() {
        return DEFAULT_INSTANCE.x();
    }

    public final Map<String, s> Q() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final String R() {
        return this.name_;
    }

    public final l1 S() {
        l1 l1Var = this.updateTime_;
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
                return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", b.f30662a, "createTime_", "updateTime_"});
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
