package lf;

import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.z0;
import lf.d;
/* compiled from: ApplicationInfo.java */
/* loaded from: classes.dex */
public final class c extends v<c, a> implements r0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile z0<c> PARSER;
    private lf.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private k0<String, String> customAttributes_ = k0.f9995v;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* compiled from: ApplicationInfo.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<c, a> implements r0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, String> f24232a;

        static {
            s1.a aVar = s1.f10037x;
            f24232a = new j0<>(aVar, aVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        v.J(c.class, cVar);
    }

    public static void M(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 1;
        cVar.googleAppId_ = str;
    }

    public static void N(c cVar, d dVar) {
        cVar.getClass();
        cVar.applicationProcessState_ = dVar.f24238u;
        cVar.bitField0_ |= 8;
    }

    public static k0 O(c cVar) {
        k0<String, String> k0Var = cVar.customAttributes_;
        if (!k0Var.f9996u) {
            cVar.customAttributes_ = k0Var.c();
        }
        return cVar.customAttributes_;
    }

    public static void P(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 2;
        cVar.appInstanceId_ = str;
    }

    public static void Q(c cVar, lf.a aVar) {
        cVar.getClass();
        cVar.androidAppInfo_ = aVar;
        cVar.bitField0_ |= 4;
    }

    public static c S() {
        return DEFAULT_INSTANCE;
    }

    public static a X() {
        return DEFAULT_INSTANCE.x();
    }

    public final lf.a R() {
        lf.a aVar = this.androidAppInfo_;
        if (aVar == null) {
            return lf.a.P();
        }
        return aVar;
    }

    public final boolean T() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.a.f24239a, "customAttributes_", b.f24232a});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<c> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c.class) {
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
