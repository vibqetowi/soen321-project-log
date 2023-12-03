package ag;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: LatLng.java */
/* loaded from: classes.dex */
public final class a extends v<a, C0011a> implements r0 {
    private static final a DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile z0<a> PARSER;
    private double latitude_;
    private double longitude_;

    /* compiled from: LatLng.java */
    /* renamed from: ag.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0011a extends v.a<a, C0011a> implements r0 {
        public C0011a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        v.J(a.class, aVar);
    }

    public static void M(a aVar, double d10) {
        aVar.latitude_ = d10;
    }

    public static void N(a aVar, double d10) {
        aVar.longitude_ = d10;
    }

    public static a O() {
        return DEFAULT_INSTANCE;
    }

    public static C0011a R() {
        return DEFAULT_INSTANCE.x();
    }

    public final double P() {
        return this.latitude_;
    }

    public final double Q() {
        return this.longitude_;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 3:
                return new a();
            case 4:
                return new C0011a();
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
