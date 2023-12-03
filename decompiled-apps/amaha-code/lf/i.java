package lf;

import com.google.protobuf.d1;
import com.google.protobuf.v;
import com.google.protobuf.z0;
/* compiled from: PerfMetric.java */
/* loaded from: classes.dex */
public final class i extends v<i, a> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile z0<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* compiled from: PerfMetric.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<i, a> implements j {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }

        @Override // lf.j
        public final boolean e() {
            return ((i) this.f10073v).e();
        }

        @Override // lf.j
        public final boolean h() {
            return ((i) this.f10073v).h();
        }

        @Override // lf.j
        public final m j() {
            return ((i) this.f10073v).j();
        }

        @Override // lf.j
        public final boolean l() {
            return ((i) this.f10073v).l();
        }

        @Override // lf.j
        public final h m() {
            return ((i) this.f10073v).m();
        }

        @Override // lf.j
        public final g n() {
            return ((i) this.f10073v).n();
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        v.J(i.class, iVar);
    }

    public static void M(i iVar, c cVar) {
        iVar.getClass();
        iVar.applicationInfo_ = cVar;
        iVar.bitField0_ |= 1;
    }

    public static void N(i iVar, g gVar) {
        iVar.getClass();
        gVar.getClass();
        iVar.gaugeMetric_ = gVar;
        iVar.bitField0_ |= 8;
    }

    public static void O(i iVar, m mVar) {
        iVar.getClass();
        mVar.getClass();
        iVar.traceMetric_ = mVar;
        iVar.bitField0_ |= 2;
    }

    public static void P(i iVar, h hVar) {
        iVar.getClass();
        hVar.getClass();
        iVar.networkRequestMetric_ = hVar;
        iVar.bitField0_ |= 4;
    }

    public static a S() {
        return DEFAULT_INSTANCE.x();
    }

    public final c Q() {
        c cVar = this.applicationInfo_;
        if (cVar == null) {
            return c.S();
        }
        return cVar;
    }

    public final boolean R() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // lf.j
    public final boolean e() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // lf.j
    public final boolean h() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // lf.j
    public final m j() {
        m mVar = this.traceMetric_;
        if (mVar == null) {
            return m.Z();
        }
        return mVar;
    }

    @Override // lf.j
    public final boolean l() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // lf.j
    public final h m() {
        h hVar = this.networkRequestMetric_;
        if (hVar == null) {
            return h.a0();
        }
        return hVar;
    }

    @Override // lf.j
    public final g n() {
        g gVar = this.gaugeMetric_;
        if (gVar == null) {
            return g.S();
        }
        return gVar;
    }

    @Override // com.google.protobuf.v
    public final Object y(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d1(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new i();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<i> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (i.class) {
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
