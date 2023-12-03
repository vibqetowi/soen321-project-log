package lf;

import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import com.google.protobuf.y;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.util.Arrays;
import lf.l;
/* compiled from: PerfSession.java */
/* loaded from: classes.dex */
public final class k extends v<k, b> implements r0 {
    private static final k DEFAULT_INSTANCE;
    private static volatile z0<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final z<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private y.c sessionVerbosity_ = x.f10081x;

    /* compiled from: PerfSession.java */
    /* loaded from: classes.dex */
    public class a implements z<Integer, l> {
    }

    /* compiled from: PerfSession.java */
    /* loaded from: classes.dex */
    public static final class b extends v.a<k, b> implements r0 {
        public b() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        v.J(k.class, kVar);
    }

    public static void M(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.bitField0_ |= 1;
        kVar.sessionId_ = str;
    }

    public static void N(k kVar) {
        int i6;
        kVar.getClass();
        y.c cVar = kVar.sessionVerbosity_;
        if (!((com.google.protobuf.c) cVar).f9890u) {
            x xVar = (x) cVar;
            int i10 = xVar.f10083w;
            if (i10 == 0) {
                i6 = 10;
            } else {
                i6 = i10 * 2;
            }
            if (i6 >= i10) {
                kVar.sessionVerbosity_ = new x(Arrays.copyOf(xVar.f10082v, i6), xVar.f10083w);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((x) kVar.sessionVerbosity_).g(1);
    }

    public static b Q() {
        return DEFAULT_INSTANCE.x();
    }

    public final l O() {
        l lVar;
        z<Integer, l> zVar = sessionVerbosity_converter_;
        Integer valueOf = Integer.valueOf(((x) this.sessionVerbosity_).o(0));
        ((a) zVar).getClass();
        int intValue = valueOf.intValue();
        l lVar2 = l.SESSION_VERBOSITY_NONE;
        if (intValue != 0) {
            if (intValue != 1) {
                lVar = null;
            } else {
                lVar = l.GAUGES_AND_SYSTEM_EVENTS;
            }
        } else {
            lVar = lVar2;
        }
        if (lVar != null) {
            return lVar;
        }
        return lVar2;
    }

    public final int P() {
        return ((x) this.sessionVerbosity_).f10083w;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.a.f24257a});
            case 3:
                return new k();
            case 4:
                return new b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<k> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (k.class) {
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
