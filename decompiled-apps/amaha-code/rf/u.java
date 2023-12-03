package rf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: WriteRequest.java */
/* loaded from: classes.dex */
public final class u extends com.google.protobuf.v<u, a> implements r0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final u DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile z0<u> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private k0<String, String> labels_ = k0.f9995v;
    private String database_ = "";
    private String streamId_ = "";
    private y.d<t> writes_ = c1.f9893x;
    private com.google.protobuf.h streamToken_ = com.google.protobuf.h.f9922v;

    /* compiled from: WriteRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<u, a> implements r0 {
        public a() {
            super(u.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: WriteRequest.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, String> f30713a;

        static {
            s1.a aVar = s1.f10037x;
            f30713a = new j0<>(aVar, aVar, "");
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        com.google.protobuf.v.J(u.class, uVar);
    }

    public static void M(u uVar, String str) {
        uVar.getClass();
        str.getClass();
        uVar.database_ = str;
    }

    public static void N(u uVar, com.google.protobuf.h hVar) {
        uVar.getClass();
        hVar.getClass();
        uVar.streamToken_ = hVar;
    }

    public static void O(u uVar, t tVar) {
        uVar.getClass();
        y.d<t> dVar = uVar.writes_;
        if (!dVar.d0()) {
            uVar.writes_ = com.google.protobuf.v.G(dVar);
        }
        uVar.writes_.add(tVar);
    }

    public static u P() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
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
                return new d1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", t.class, "streamToken_", "labels_", b.f30713a});
            case 3:
                return new u();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<u> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (u.class) {
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
