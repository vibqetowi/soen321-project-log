package rf;

import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: ListenRequest.java */
/* loaded from: classes.dex */
public final class l extends com.google.protobuf.v<l, a> implements r0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final l DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile z0<l> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private k0<String, String> labels_ = k0.f9995v;
    private String database_ = "";

    /* compiled from: ListenRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<l, a> implements r0 {
        public a() {
            super(l.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ListenRequest.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, String> f30670a;

        static {
            s1.a aVar = s1.f10037x;
            f30670a = new j0<>(aVar, aVar, "");
        }
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.protobuf.v.J(l.class, lVar);
    }

    public static k0 M(l lVar) {
        k0<String, String> k0Var = lVar.labels_;
        if (!k0Var.f9996u) {
            lVar.labels_ = k0Var.c();
        }
        return lVar.labels_;
    }

    public static void N(l lVar, String str) {
        lVar.getClass();
        str.getClass();
        lVar.database_ = str;
    }

    public static void O(l lVar, q qVar) {
        lVar.getClass();
        lVar.targetChange_ = qVar;
        lVar.targetChangeCase_ = 2;
    }

    public static void P(l lVar, int i6) {
        lVar.targetChangeCase_ = 3;
        lVar.targetChange_ = Integer.valueOf(i6);
    }

    public static l Q() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", q.class, "labels_", b.f30670a});
            case 3:
                return new l();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<l> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (l.class) {
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
