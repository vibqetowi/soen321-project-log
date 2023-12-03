package vr;

import com.google.common.base.VerifyException;
import io.grpc.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import nc.f;
import tr.i0;
/* compiled from: ServiceConfigUtil.java */
/* loaded from: classes2.dex */
public final class b3 {

    /* compiled from: ServiceConfigUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f35405a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, ?> f35406b;

        public a(String str, Map<String, ?> map) {
            sc.b.w(str, "policyName");
            this.f35405a = str;
            sc.b.w(map, "rawConfigValue");
            this.f35406b = map;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f35405a.equals(aVar.f35405a) || !this.f35406b.equals(aVar.f35406b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f35405a, this.f35406b});
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f35405a, "policyName");
            c10.c(this.f35406b, "rawConfigValue");
            return c10.toString();
        }
    }

    /* compiled from: ServiceConfigUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final io.grpc.i f35407a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f35408b;

        public b(io.grpc.i iVar, Object obj) {
            this.f35407a = iVar;
            this.f35408b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (f6.b.v0(this.f35407a, bVar.f35407a) && f6.b.v0(this.f35408b, bVar.f35408b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f35407a, this.f35408b});
        }

        public final String toString() {
            f.a c10 = nc.f.c(this);
            c10.c(this.f35407a, "provider");
            c10.c(this.f35408b, "config");
            return c10.toString();
        }
    }

    public static Set a(String str, Map map) {
        i0.a valueOf;
        boolean z10;
        List b10 = m1.b(str, map);
        if (b10 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(i0.a.class);
        for (Object obj : b10) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int intValue = d10.intValue();
                boolean z11 = true;
                if (intValue == d10.doubleValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f6.b.U0(obj, "Status code %s is not integral", z10);
                valueOf = tr.i0.c(intValue).f33491a;
                if (valueOf.f33498u != d10.intValue()) {
                    z11 = false;
                }
                f6.b.U0(obj, "Status code %s is not valid", z11);
            } else if (obj instanceof String) {
                try {
                    valueOf = i0.a.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new VerifyException("Status code " + obj + " is not valid", e10);
                }
            } else {
                throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List<Map<String, ?>> b(Map<String, ?> map) {
        String g5;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List b10 = m1.b("loadBalancingConfig", map);
            if (b10 == null) {
                b10 = null;
            } else {
                m1.a(b10);
            }
            arrayList.addAll(b10);
        }
        if (arrayList.isEmpty() && (g5 = m1.g("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(g5.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static l.b c(List<a> list, io.grpc.j jVar) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String str = aVar.f35405a;
            io.grpc.i c10 = jVar.c(str);
            if (c10 == null) {
                arrayList.add(str);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(b3.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                l.b e10 = c10.e(aVar.f35406b);
                if (e10.f20491a != null) {
                    return e10;
                }
                return new l.b(new b(c10, e10.f20492b));
            }
        }
        tr.i0 i0Var = tr.i0.f33482g;
        return new l.b(i0Var.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List<a> d(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            if (map.size() == 1) {
                String key = map.entrySet().iterator().next().getKey();
                arrayList.add(new a(key, m1.f(key, map)));
            } else {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
