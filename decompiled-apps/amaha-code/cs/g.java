package cs;

import cs.f;
import io.grpc.h;
import io.grpc.j;
import io.grpc.l;
import java.util.List;
import java.util.Map;
import tr.i0;
import vr.b3;
import vr.m1;
/* compiled from: OutlierDetectionLoadBalancerProvider.java */
/* loaded from: classes2.dex */
public final class g extends io.grpc.i {
    @Override // io.grpc.h.b
    public final io.grpc.h a(h.c cVar) {
        return new f(cVar);
    }

    @Override // io.grpc.i
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // io.grpc.i
    public int c() {
        return 5;
    }

    @Override // io.grpc.i
    public boolean d() {
        return true;
    }

    @Override // io.grpc.i
    public l.b e(Map<String, ?> map) {
        Long l2;
        Long l10;
        Long l11;
        Integer num;
        f.C0178f.b bVar;
        f.C0178f.a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Integer num2;
        Integer num3;
        boolean z16;
        boolean z17;
        boolean z18;
        Long h10 = m1.h("interval", map);
        Long h11 = m1.h("baseEjectionTime", map);
        Long h12 = m1.h("maxEjectionTime", map);
        Integer e10 = m1.e("maxEjectionPercentage", map);
        if (h10 != null) {
            l2 = h10;
        } else {
            l2 = 10000000000L;
        }
        if (h11 != null) {
            l10 = h11;
        } else {
            l10 = 30000000000L;
        }
        if (h12 != null) {
            l11 = h12;
        } else {
            l11 = 30000000000L;
        }
        if (e10 != null) {
            num = e10;
        } else {
            num = 10;
        }
        Map f = m1.f("successRateEjection", map);
        if (f != null) {
            Integer num4 = 1900;
            Integer num5 = 100;
            Integer e11 = m1.e("stdevFactor", f);
            Integer e12 = m1.e("enforcementPercentage", f);
            Integer e13 = m1.e("minimumHosts", f);
            Integer e14 = m1.e("requestVolume", f);
            if (e11 != null) {
                num4 = e11;
            }
            if (e12 != null) {
                if (e12.intValue() >= 0 && e12.intValue() <= 100) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                sc.b.t(z18);
                num2 = e12;
            } else {
                num2 = num5;
            }
            if (e13 != null) {
                if (e13.intValue() >= 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                sc.b.t(z17);
                num3 = e13;
            } else {
                num3 = 5;
            }
            if (e14 != null) {
                if (e14.intValue() >= 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                sc.b.t(z16);
                num5 = e14;
            }
            bVar = new f.C0178f.b(num4, num2, num3, num5);
        } else {
            bVar = null;
        }
        Map f2 = m1.f("failurePercentageEjection", map);
        if (f2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer num9 = 50;
            Integer e15 = m1.e("threshold", f2);
            Integer e16 = m1.e("enforcementPercentage", f2);
            Integer e17 = m1.e("minimumHosts", f2);
            Integer e18 = m1.e("requestVolume", f2);
            if (e15 != null) {
                if (e15.intValue() >= 0 && e15.intValue() <= 100) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                sc.b.t(z15);
                num6 = e15;
            }
            if (e16 != null) {
                if (e16.intValue() >= 0 && e16.intValue() <= 100) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                sc.b.t(z14);
                num7 = e16;
            }
            if (e17 != null) {
                if (e17.intValue() >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sc.b.t(z13);
                num8 = e17;
            }
            if (e18 != null) {
                if (e18.intValue() >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.t(z12);
                num9 = e18;
            }
            aVar = new f.C0178f.a(num6, num7, num8, num9);
        } else {
            aVar = null;
        }
        List b10 = m1.b("childPolicy", map);
        if (b10 == null) {
            b10 = null;
        } else {
            m1.a(b10);
        }
        List<b3.a> d10 = b3.d(b10);
        if (d10 != null && !d10.isEmpty()) {
            l.b c10 = b3.c(d10, j.b());
            if (c10.f20491a != null) {
                return c10;
            }
            b3.b bVar2 = (b3.b) c10.f20492b;
            if (bVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.D(z10);
            if (bVar2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.D(z11);
            return new l.b(new f.C0178f(l2, l10, l11, num, bVar, aVar, bVar2));
        }
        return new l.b(i0.f33487l.g("No child policy in outlier_detection_experimental LB policy: " + map));
    }
}
