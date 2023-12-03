package lf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.r0;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
/* compiled from: GaugeMetric.java */
/* loaded from: classes.dex */
public final class g extends v<g, a> implements r0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile z0<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private y.d<b> androidMemoryReadings_;
    private int bitField0_;
    private y.d<e> cpuMetricReadings_;
    private f gaugeMetadata_;
    private String sessionId_ = "";

    /* compiled from: GaugeMetric.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<g, a> implements r0 {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        v.J(g.class, gVar);
    }

    public g() {
        c1<Object> c1Var = c1.f9893x;
        this.cpuMetricReadings_ = c1Var;
        this.androidMemoryReadings_ = c1Var;
    }

    public static void M(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 1;
        gVar.sessionId_ = str;
    }

    public static void N(g gVar, b bVar) {
        gVar.getClass();
        bVar.getClass();
        y.d<b> dVar = gVar.androidMemoryReadings_;
        if (!dVar.d0()) {
            gVar.androidMemoryReadings_ = v.G(dVar);
        }
        gVar.androidMemoryReadings_.add(bVar);
    }

    public static void O(g gVar, f fVar) {
        gVar.getClass();
        fVar.getClass();
        gVar.gaugeMetadata_ = fVar;
        gVar.bitField0_ |= 2;
    }

    public static void P(g gVar, e eVar) {
        gVar.getClass();
        eVar.getClass();
        y.d<e> dVar = gVar.cpuMetricReadings_;
        if (!dVar.d0()) {
            gVar.cpuMetricReadings_ = v.G(dVar);
        }
        gVar.cpuMetricReadings_.add(eVar);
    }

    public static g S() {
        return DEFAULT_INSTANCE;
    }

    public static a W() {
        return DEFAULT_INSTANCE.x();
    }

    public final int Q() {
        return this.androidMemoryReadings_.size();
    }

    public final int R() {
        return this.cpuMetricReadings_.size();
    }

    public final f T() {
        f fVar = this.gaugeMetadata_;
        if (fVar == null) {
            return f.P();
        }
        return fVar;
    }

    public final boolean U() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
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
                return new d1(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", b.class});
            case 3:
                return new g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
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
