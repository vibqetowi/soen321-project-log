package rf;

import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.z0;
import java.util.Collections;
import java.util.Map;
/* compiled from: MapValue.java */
/* loaded from: classes.dex */
public final class n extends com.google.protobuf.v<n, a> implements r0 {
    private static final n DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile z0<n> PARSER;
    private k0<String, s> fields_ = k0.f9995v;

    /* compiled from: MapValue.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<n, a> implements r0 {
        public a() {
            super(n.DEFAULT_INSTANCE);
        }

        public final void x(s sVar, String str) {
            str.getClass();
            sVar.getClass();
            u();
            n.M((n) this.f10073v).put(str, sVar);
        }
    }

    /* compiled from: MapValue.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, s> f30671a = new j0<>(s1.f10037x, s1.f10039z, s.a0());
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.protobuf.v.J(n.class, nVar);
    }

    public static k0 M(n nVar) {
        k0<String, s> k0Var = nVar.fields_;
        if (!k0Var.f9996u) {
            nVar.fields_ = k0Var.c();
        }
        return nVar.fields_;
    }

    public static n N() {
        return DEFAULT_INSTANCE;
    }

    public static a S() {
        return DEFAULT_INSTANCE.x();
    }

    public final int O() {
        return this.fields_.size();
    }

    public final Map<String, s> P() {
        return Collections.unmodifiableMap(this.fields_);
    }

    public final s Q(String str) {
        str.getClass();
        k0<String, s> k0Var = this.fields_;
        if (k0Var.containsKey(str)) {
            return k0Var.get(str);
        }
        return null;
    }

    public final s R(String str) {
        str.getClass();
        k0<String, s> k0Var = this.fields_;
        if (k0Var.containsKey(str)) {
            return k0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.f30671a});
            case 3:
                return new n();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<n> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (n.class) {
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
