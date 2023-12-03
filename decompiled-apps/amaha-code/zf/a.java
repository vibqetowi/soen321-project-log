package zf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.e;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: Status.java */
/* loaded from: classes.dex */
public final class a extends v<a, C0673a> implements r0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile z0<a> PARSER;
    private int code_;
    private String message_ = "";
    private y.d<e> details_ = c1.f9893x;

    /* compiled from: Status.java */
    /* renamed from: zf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0673a extends v.a<a, C0673a> implements r0 {
        public C0673a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        v.J(a.class, aVar);
    }

    public static a N() {
        return DEFAULT_INSTANCE;
    }

    public final int M() {
        return this.code_;
    }

    public final String O() {
        return this.message_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", e.class});
            case 3:
                return new a();
            case 4:
                return new C0673a();
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
