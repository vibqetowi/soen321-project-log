package lf;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: TransportInfo.java */
/* loaded from: classes.dex */
public final class n extends v<n, a> implements r0 {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile z0<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* compiled from: TransportInfo.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<n, a> implements r0 {
        public a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TransportInfo.java */
    /* loaded from: classes.dex */
    public enum b implements y.a {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f24263u;

        /* compiled from: TransportInfo.java */
        /* loaded from: classes.dex */
        public static final class a implements y.b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f24264a = new a();

            @Override // com.google.protobuf.y.b
            public final boolean a(int i6) {
                b bVar;
                if (i6 != 0) {
                    if (i6 != 1) {
                        bVar = null;
                    } else {
                        bVar = b.FL_LEGACY_V1;
                    }
                } else {
                    bVar = b.SOURCE_UNKNOWN;
                }
                if (bVar != null) {
                    return true;
                }
                return false;
            }
        }

        b(int i6) {
            this.f24263u = i6;
        }

        @Override // com.google.protobuf.y.a
        public final int e() {
            return this.f24263u;
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        v.J(n.class, nVar);
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", b.a.f24264a});
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
