package vr;

import com.theinnerhour.b2b.utils.SessionManager;
import io.grpc.b;
import io.grpc.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.f;
import tr.i0;
import vr.v2;
/* compiled from: ManagedChannelServiceConfig.java */
/* loaded from: classes2.dex */
public final class f2 {

    /* renamed from: a  reason: collision with root package name */
    public final a f35604a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f35605b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, a> f35606c;

    /* renamed from: d  reason: collision with root package name */
    public final v2.a0 f35607d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f35608e;
    public final Map<String, ?> f;

    /* compiled from: ManagedChannelServiceConfig.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: g  reason: collision with root package name */
        public static final b.C0308b<a> f35609g = new b.C0308b<>("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a  reason: collision with root package name */
        public final Long f35610a;

        /* renamed from: b  reason: collision with root package name */
        public final Boolean f35611b;

        /* renamed from: c  reason: collision with root package name */
        public final Integer f35612c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f35613d;

        /* renamed from: e  reason: collision with root package name */
        public final x2 f35614e;
        public final w0 f;

        public a(Map<String, ?> map, boolean z10, int i6, int i10) {
            Boolean bool;
            Map map2;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            x2 x2Var;
            Map map3;
            boolean z18;
            boolean z19;
            w0 w0Var;
            boolean z20;
            boolean z21;
            this.f35610a = m1.h("timeout", map);
            if (!map.containsKey("waitForReady")) {
                bool = null;
            } else {
                Object obj = map.get("waitForReady");
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, "waitForReady", map));
                }
            }
            this.f35611b = bool;
            Integer e10 = m1.e("maxResponseMessageBytes", map);
            this.f35612c = e10;
            if (e10 != null) {
                if (e10.intValue() >= 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                sc.b.m(e10, "maxInboundMessageSize %s exceeds bounds", z21);
            }
            Integer e11 = m1.e("maxRequestMessageBytes", map);
            this.f35613d = e11;
            if (e11 != null) {
                if (e11.intValue() >= 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                sc.b.m(e11, "maxOutboundMessageSize %s exceeds bounds", z20);
            }
            if (z10) {
                map2 = m1.f("retryPolicy", map);
            } else {
                map2 = null;
            }
            if (map2 == null) {
                x2Var = null;
            } else {
                Integer e12 = m1.e("maxAttempts", map2);
                sc.b.w(e12, "maxAttempts cannot be empty");
                int intValue = e12.intValue();
                if (intValue >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.n("maxAttempts must be greater than 1: %s", intValue, z11);
                int min = Math.min(intValue, i6);
                Long h10 = m1.h("initialBackoff", map2);
                sc.b.w(h10, "initialBackoff cannot be empty");
                long longValue = h10.longValue();
                if (longValue > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.o("initialBackoffNanos must be greater than 0: %s", longValue, z12);
                Long h11 = m1.h("maxBackoff", map2);
                sc.b.w(h11, "maxBackoff cannot be empty");
                long longValue2 = h11.longValue();
                if (longValue2 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sc.b.o("maxBackoff must be greater than 0: %s", longValue2, z13);
                Double d10 = m1.d("backoffMultiplier", map2);
                sc.b.w(d10, "backoffMultiplier cannot be empty");
                double doubleValue = d10.doubleValue();
                if (doubleValue > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                sc.b.m(Double.valueOf(doubleValue), "backoffMultiplier must be greater than 0: %s", z14);
                Long h12 = m1.h("perAttemptRecvTimeout", map2);
                if (h12 != null && h12.longValue() < 0) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                sc.b.m(h12, "perAttemptRecvTimeout cannot be negative: %s", z15);
                Set a10 = b3.a("retryableStatusCodes", map2);
                if (a10 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                f6.b.U0("retryableStatusCodes", "%s is required in retry policy", z16);
                f6.b.U0("retryableStatusCodes", "%s must not contain OK", !a10.contains(i0.a.OK));
                if (h12 == null && a10.isEmpty()) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                sc.b.s("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", z17);
                x2Var = new x2(min, longValue, longValue2, doubleValue, h12, a10);
            }
            this.f35614e = x2Var;
            if (z10) {
                map3 = m1.f("hedgingPolicy", map);
            } else {
                map3 = null;
            }
            if (map3 == null) {
                w0Var = null;
            } else {
                Integer e13 = m1.e("maxAttempts", map3);
                sc.b.w(e13, "maxAttempts cannot be empty");
                int intValue2 = e13.intValue();
                if (intValue2 >= 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                sc.b.n("maxAttempts must be greater than 1: %s", intValue2, z18);
                int min2 = Math.min(intValue2, i10);
                Long h13 = m1.h("hedgingDelay", map3);
                sc.b.w(h13, "hedgingDelay cannot be empty");
                long longValue3 = h13.longValue();
                if (longValue3 >= 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                sc.b.o("hedgingDelay must not be negative: %s", longValue3, z19);
                Set a11 = b3.a("nonFatalStatusCodes", map3);
                if (a11 == null) {
                    a11 = Collections.unmodifiableSet(EnumSet.noneOf(i0.a.class));
                } else {
                    f6.b.U0("nonFatalStatusCodes", "%s must not contain OK", !a11.contains(i0.a.OK));
                }
                w0Var = new w0(min2, longValue3, a11);
            }
            this.f = w0Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!f6.b.v0(this.f35610a, aVar.f35610a) || !f6.b.v0(this.f35611b, aVar.f35611b) || !f6.b.v0(this.f35612c, aVar.f35612c) || !f6.b.v0(this.f35613d, aVar.f35613d) || !f6.b.v0(this.f35614e, aVar.f35614e) || !f6.b.v0(this.f, aVar.f)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f35610a, this.f35611b, this.f35612c, this.f35613d, this.f35614e, this.f});
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f35610a, "timeoutNanos");
            c10.c(this.f35611b, "waitForReady");
            c10.c(this.f35612c, "maxInboundMessageSize");
            c10.c(this.f35613d, "maxOutboundMessageSize");
            c10.c(this.f35614e, "retryPolicy");
            c10.c(this.f, "hedgingPolicy");
            return c10.toString();
        }
    }

    /* compiled from: ManagedChannelServiceConfig.java */
    /* loaded from: classes2.dex */
    public static final class b extends io.grpc.g {

        /* renamed from: b  reason: collision with root package name */
        public final f2 f35615b;

        public b(f2 f2Var) {
            this.f35615b = f2Var;
        }

        @Override // io.grpc.g
        public final g.a a() {
            f2 f2Var = this.f35615b;
            sc.b.w(f2Var, "config");
            return new g.a(tr.i0.f33481e, f2Var);
        }
    }

    public f2(a aVar, HashMap hashMap, HashMap hashMap2, v2.a0 a0Var, Object obj, Map map) {
        Map<String, ?> map2;
        this.f35604a = aVar;
        this.f35605b = defpackage.d.i(hashMap);
        this.f35606c = defpackage.d.i(hashMap2);
        this.f35607d = a0Var;
        this.f35608e = obj;
        if (map != null) {
            map2 = Collections.unmodifiableMap(new HashMap(map));
        } else {
            map2 = null;
        }
        this.f = map2;
    }

    public static f2 a(Map<String, ?> map, boolean z10, int i6, int i10, Object obj) {
        v2.a0 a0Var;
        Map f;
        boolean z11;
        v2.a0 a0Var2;
        Map f2;
        boolean z12;
        boolean z13;
        if (z10) {
            if (map == null || (f2 = m1.f("retryThrottling", map)) == null) {
                a0Var2 = null;
            } else {
                float floatValue = m1.d("maxTokens", f2).floatValue();
                float floatValue2 = m1.d("tokenRatio", f2).floatValue();
                if (floatValue > 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.B("maxToken should be greater than zero", z12);
                if (floatValue2 > 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sc.b.B("tokenRatio should be greater than zero", z13);
                a0Var2 = new v2.a0(floatValue, floatValue2);
            }
            a0Var = a0Var2;
        } else {
            a0Var = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (map == null) {
            f = null;
        } else {
            f = m1.f("healthCheckConfig", map);
        }
        List<Map> b10 = m1.b("methodConfig", map);
        if (b10 == null) {
            b10 = null;
        } else {
            m1.a(b10);
        }
        if (b10 == null) {
            return new f2(null, hashMap, hashMap2, a0Var, obj, f);
        }
        a aVar = null;
        for (Map map2 : b10) {
            a aVar2 = new a(map2, z10, i6, i10);
            List<Map> b11 = m1.b(SessionManager.KEY_NAME, map2);
            if (b11 == null) {
                b11 = null;
            } else {
                m1.a(b11);
            }
            if (b11 != null && !b11.isEmpty()) {
                for (Map map3 : b11) {
                    String g5 = m1.g("service", map3);
                    String g10 = m1.g("method", map3);
                    if (kotlin.jvm.internal.h.K(g5)) {
                        sc.b.m(g10, "missing service name for method %s", kotlin.jvm.internal.h.K(g10));
                        if (aVar == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        sc.b.m(map, "Duplicate default method config in service config %s", z11);
                        aVar = aVar2;
                    } else if (kotlin.jvm.internal.h.K(g10)) {
                        sc.b.m(g5, "Duplicate service %s", !hashMap2.containsKey(g5));
                        hashMap2.put(g5, aVar2);
                    } else {
                        String a10 = tr.d0.a(g5, g10);
                        sc.b.m(a10, "Duplicate method name %s", !hashMap.containsKey(a10));
                        hashMap.put(a10, aVar2);
                    }
                }
            }
        }
        return new f2(aVar, hashMap, hashMap2, a0Var, obj, f);
    }

    public final b b() {
        if (this.f35606c.isEmpty() && this.f35605b.isEmpty() && this.f35604a == null) {
            return null;
        }
        return new b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f2.class != obj.getClass()) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (f6.b.v0(this.f35604a, f2Var.f35604a) && f6.b.v0(this.f35605b, f2Var.f35605b) && f6.b.v0(this.f35606c, f2Var.f35606c) && f6.b.v0(this.f35607d, f2Var.f35607d) && f6.b.v0(this.f35608e, f2Var.f35608e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35604a, this.f35605b, this.f35606c, this.f35607d, this.f35608e});
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        c10.c(this.f35604a, "defaultMethodConfig");
        c10.c(this.f35605b, "serviceMethodMap");
        c10.c(this.f35606c, "serviceMap");
        c10.c(this.f35607d, "retryThrottling");
        c10.c(this.f35608e, "loadBalancingConfig");
        return c10.toString();
    }
}
