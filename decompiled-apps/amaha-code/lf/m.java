package lf;

import com.google.protobuf.c1;
import com.google.protobuf.d1;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.v;
import com.google.protobuf.y;
import com.google.protobuf.z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: TraceMetric.java */
/* loaded from: classes.dex */
public final class m extends v<m, a> implements r0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private k0<String, Long> counters_;
    private k0<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private y.d<k> perfSessions_;
    private y.d<m> subtraces_;

    /* compiled from: TraceMetric.java */
    /* loaded from: classes.dex */
    public static final class a extends v.a<m, a> implements r0 {
        public a() {
            super(m.DEFAULT_INSTANCE);
        }

        public final void A(long j10) {
            u();
            m.U((m) this.f10073v, j10);
        }

        public final void B(String str) {
            u();
            m.M((m) this.f10073v, str);
        }

        public final void x(m mVar) {
            u();
            m.O((m) this.f10073v, mVar);
        }

        public final void y(long j10, String str) {
            str.getClass();
            u();
            m.N((m) this.f10073v).put(str, Long.valueOf(j10));
        }

        public final void z(long j10) {
            u();
            m.T((m) this.f10073v, j10);
        }
    }

    /* compiled from: TraceMetric.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, Long> f24258a = new j0<>(s1.f10037x, s1.f10036w, 0L);
    }

    /* compiled from: TraceMetric.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final j0<String, String> f24259a;

        static {
            s1.a aVar = s1.f10037x;
            f24259a = new j0<>(aVar, aVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        v.J(m.class, mVar);
    }

    public m() {
        k0 k0Var = k0.f9995v;
        this.counters_ = k0Var;
        this.customAttributes_ = k0Var;
        this.name_ = "";
        c1<Object> c1Var = c1.f9893x;
        this.subtraces_ = c1Var;
        this.perfSessions_ = c1Var;
    }

    public static void M(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.bitField0_ |= 1;
        mVar.name_ = str;
    }

    public static k0 N(m mVar) {
        k0<String, Long> k0Var = mVar.counters_;
        if (!k0Var.f9996u) {
            mVar.counters_ = k0Var.c();
        }
        return mVar.counters_;
    }

    public static void O(m mVar, m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        y.d<m> dVar = mVar.subtraces_;
        if (!dVar.d0()) {
            mVar.subtraces_ = v.G(dVar);
        }
        mVar.subtraces_.add(mVar2);
    }

    public static void P(m mVar, ArrayList arrayList) {
        y.d<m> dVar = mVar.subtraces_;
        if (!dVar.d0()) {
            mVar.subtraces_ = v.G(dVar);
        }
        com.google.protobuf.a.g(arrayList, mVar.subtraces_);
    }

    public static k0 Q(m mVar) {
        k0<String, String> k0Var = mVar.customAttributes_;
        if (!k0Var.f9996u) {
            mVar.customAttributes_ = k0Var.c();
        }
        return mVar.customAttributes_;
    }

    public static void R(m mVar, k kVar) {
        mVar.getClass();
        y.d<k> dVar = mVar.perfSessions_;
        if (!dVar.d0()) {
            mVar.perfSessions_ = v.G(dVar);
        }
        mVar.perfSessions_.add(kVar);
    }

    public static void S(m mVar, List list) {
        y.d<k> dVar = mVar.perfSessions_;
        if (!dVar.d0()) {
            mVar.perfSessions_ = v.G(dVar);
        }
        com.google.protobuf.a.g(list, mVar.perfSessions_);
    }

    public static void T(m mVar, long j10) {
        mVar.bitField0_ |= 4;
        mVar.clientStartTimeUs_ = j10;
    }

    public static void U(m mVar, long j10) {
        mVar.bitField0_ |= 8;
        mVar.durationUs_ = j10;
    }

    public static m Z() {
        return DEFAULT_INSTANCE;
    }

    public static a f0() {
        return DEFAULT_INSTANCE.x();
    }

    public final boolean V() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int W() {
        return this.counters_.size();
    }

    public final Map<String, Long> X() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> Y() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long a0() {
        return this.durationUs_;
    }

    public final String b0() {
        return this.name_;
    }

    public final y.d c0() {
        return this.perfSessions_;
    }

    public final y.d d0() {
        return this.subtraces_;
    }

    public final boolean e0() {
        if ((this.bitField0_ & 4) != 0) {
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
                return new d1(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", b.f24258a, "subtraces_", m.class, "customAttributes_", c.f24259a, "perfSessions_", k.class});
            case 3:
                return new m();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                z0<m> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (m.class) {
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
