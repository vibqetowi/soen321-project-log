package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.ca;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class f6 extends y5 {
    public f6(d6 d6Var) {
        super(d6Var);
    }

    public static ArrayList D(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i6 = 0; i6 < length; i6++) {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i6 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j10 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(E((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(E((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(E((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap E(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (!z11 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static boolean G(int i6, com.google.android.gms.internal.measurement.a6 a6Var) {
        if (i6 < ((com.google.android.gms.internal.measurement.l6) a6Var).f8458w * 64) {
            if (((1 << (i6 % 64)) & ((Long) ((com.google.android.gms.internal.measurement.l6) a6Var).get(i6 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean I(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static final void K(com.google.android.gms.internal.measurement.l2 l2Var, String str, Long l2) {
        List q10 = l2Var.q();
        int i6 = 0;
        while (true) {
            if (i6 < q10.size()) {
                if (str.equals(((com.google.android.gms.internal.measurement.q2) q10.get(i6)).A())) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        com.google.android.gms.internal.measurement.p2 y10 = com.google.android.gms.internal.measurement.q2.y();
        y10.l(str);
        if (l2 instanceof Long) {
            y10.k(l2.longValue());
        }
        if (i6 >= 0) {
            l2Var.i();
            com.google.android.gms.internal.measurement.m2.D((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, i6, (com.google.android.gms.internal.measurement.q2) y10.f());
            return;
        }
        l2Var.m(y10);
    }

    public static final com.google.android.gms.internal.measurement.q2 l(com.google.android.gms.internal.measurement.m2 m2Var, String str) {
        for (com.google.android.gms.internal.measurement.q2 q2Var : m2Var.C()) {
            if (q2Var.A().equals(str)) {
                return q2Var;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable m(com.google.android.gms.internal.measurement.m2 m2Var, String str) {
        com.google.android.gms.internal.measurement.q2 l2 = l(m2Var, str);
        if (l2 != null) {
            if (l2.R()) {
                return l2.B();
            }
            if (l2.P()) {
                return Long.valueOf(l2.x());
            }
            if (l2.N()) {
                return Double.valueOf(l2.u());
            }
            if (l2.w() > 0) {
                com.google.android.gms.internal.measurement.b6<com.google.android.gms.internal.measurement.q2> C = l2.C();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.q2 q2Var : C) {
                    if (q2Var != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.q2 q2Var2 : q2Var.C()) {
                            if (q2Var2.R()) {
                                bundle.putString(q2Var2.A(), q2Var2.B());
                            } else if (q2Var2.P()) {
                                bundle.putLong(q2Var2.A(), q2Var2.x());
                            } else if (q2Var2.N()) {
                                bundle.putDouble(q2Var2.A(), q2Var2.u());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static final void p(int i6, StringBuilder sb2) {
        for (int i10 = 0; i10 < i6; i10++) {
            sb2.append("  ");
        }
    }

    public static final String q(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void r(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.a3 a3Var) {
        Integer num;
        Integer num2;
        Long l2;
        if (a3Var == null) {
            return;
        }
        p(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (a3Var.v() != 0) {
            p(4, sb2);
            sb2.append("results: ");
            int i6 = 0;
            for (Long l10 : a3Var.E()) {
                int i10 = i6 + 1;
                if (i6 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i6 = i10;
            }
            sb2.append('\n');
        }
        if (a3Var.x() != 0) {
            p(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : a3Var.G()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (a3Var.u() != 0) {
            p(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (com.google.android.gms.internal.measurement.k2 k2Var : a3Var.D()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                if (k2Var.B()) {
                    num2 = Integer.valueOf(k2Var.u());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (k2Var.A()) {
                    l2 = Long.valueOf(k2Var.v());
                } else {
                    l2 = null;
                }
                sb2.append(l2);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (a3Var.w() != 0) {
            p(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.c3 c3Var : a3Var.F()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                if (c3Var.C()) {
                    num = Integer.valueOf(c3Var.v());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                int i17 = 0;
                for (Long l12 : c3Var.z()) {
                    long longValue = l12.longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        p(3, sb2);
        sb2.append("}\n");
    }

    public static final void s(StringBuilder sb2, int i6, String str, Object obj) {
        if (obj == null) {
            return;
        }
        p(i6 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void t(StringBuilder sb2, int i6, String str, com.google.android.gms.internal.measurement.s1 s1Var) {
        String str2;
        if (s1Var == null) {
            return;
        }
        p(i6, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (s1Var.A()) {
            int F = s1Var.F();
            if (F != 1) {
                if (F != 2) {
                    if (F != 3) {
                        if (F != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            s(sb2, i6, "comparison_type", str2);
        }
        if (s1Var.C()) {
            s(sb2, i6, "match_as_float", Boolean.valueOf(s1Var.z()));
        }
        if (s1Var.B()) {
            s(sb2, i6, "comparison_value", s1Var.w());
        }
        if (s1Var.E()) {
            s(sb2, i6, "min_comparison_value", s1Var.y());
        }
        if (s1Var.D()) {
            s(sb2, i6, "max_comparison_value", s1Var.x());
        }
        p(i6, sb2);
        sb2.append("}\n");
    }

    public static int u(com.google.android.gms.internal.measurement.u2 u2Var, String str) {
        for (int i6 = 0; i6 < ((com.google.android.gms.internal.measurement.v2) u2Var.f8613v).r1(); i6++) {
            if (str.equals(((com.google.android.gms.internal.measurement.v2) u2Var.f8613v).F1(i6).z())) {
                return i6;
            }
        }
        return -1;
    }

    public static Bundle w(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z10) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        arrayList2.add(w((Map) arrayList.get(i6), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static s y(com.google.android.gms.internal.measurement.b bVar) {
        String str;
        Object obj;
        Bundle w10 = w(bVar.f8307c, true);
        if (w10.containsKey("_o") && (obj = w10.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String r02 = kotlin.jvm.internal.h.r0(bVar.f8305a, kc.f.f23225o0, kc.f.f23227q0);
        if (r02 == null) {
            r02 = bVar.f8305a;
        }
        return new s(r02, new q(w10), str2, bVar.f8306b);
    }

    public static com.google.android.gms.internal.measurement.t5 z(com.google.android.gms.internal.measurement.t5 t5Var, byte[] bArr) {
        com.google.android.gms.internal.measurement.i5 i5Var;
        com.google.android.gms.internal.measurement.i5 i5Var2 = com.google.android.gms.internal.measurement.i5.f8424b;
        if (i5Var2 == null) {
            synchronized (com.google.android.gms.internal.measurement.i5.class) {
                i5Var = com.google.android.gms.internal.measurement.i5.f8424b;
                if (i5Var == null) {
                    i5Var = com.google.android.gms.internal.measurement.q5.b();
                    com.google.android.gms.internal.measurement.i5.f8424b = i5Var;
                }
            }
            i5Var2 = i5Var;
        }
        if (i5Var2 != null) {
            t5Var.getClass();
            t5Var.e(bArr, bArr.length, i5Var2);
            return t5Var;
        }
        t5Var.getClass();
        t5Var.e(bArr, bArr.length, com.google.android.gms.internal.measurement.i5.f8425c);
        return t5Var;
    }

    public final String A(com.google.android.gms.internal.measurement.t2 t2Var) {
        Long l2;
        Long l10;
        Double d10;
        StringBuilder c10 = v.h.c("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.v2 v2Var : t2Var.x()) {
            if (v2Var != null) {
                p(1, c10);
                c10.append("bundle {\n");
                if (v2Var.f1()) {
                    s(c10, 1, "protocol_version", Integer.valueOf(v2Var.o1()));
                }
                ca.c();
                y3 y3Var = this.f32943u;
                if (y3Var.A.q(null, j2.f32651h0)) {
                    if (y3Var.A.q(v2Var.H1(), j2.f32655j0) && v2Var.i1()) {
                        s(c10, 1, "session_stitching_token", v2Var.E());
                    }
                }
                s(c10, 1, "platform", v2Var.C());
                if (v2Var.b1()) {
                    s(c10, 1, "gmp_version", Long.valueOf(v2Var.w1()));
                }
                if (v2Var.m1()) {
                    s(c10, 1, "uploading_gmp_version", Long.valueOf(v2Var.B1()));
                }
                if (v2Var.Z0()) {
                    s(c10, 1, "dynamite_version", Long.valueOf(v2Var.u1()));
                }
                if (v2Var.W0()) {
                    s(c10, 1, "config_version", Long.valueOf(v2Var.s1()));
                }
                s(c10, 1, "gmp_app_id", v2Var.z());
                s(c10, 1, "admob_app_id", v2Var.G1());
                s(c10, 1, "app_id", v2Var.H1());
                s(c10, 1, "app_version", v2Var.u());
                if (v2Var.s0()) {
                    s(c10, 1, "app_version_major", Integer.valueOf(v2Var.T()));
                }
                s(c10, 1, "firebase_instance_id", v2Var.y());
                if (v2Var.Y0()) {
                    s(c10, 1, "dev_cert_hash", Long.valueOf(v2Var.t1()));
                }
                s(c10, 1, "app_store", v2Var.J1());
                if (v2Var.l1()) {
                    s(c10, 1, "upload_timestamp_millis", Long.valueOf(v2Var.A1()));
                }
                if (v2Var.j1()) {
                    s(c10, 1, "start_timestamp_millis", Long.valueOf(v2Var.z1()));
                }
                if (v2Var.a1()) {
                    s(c10, 1, "end_timestamp_millis", Long.valueOf(v2Var.v1()));
                }
                if (v2Var.e1()) {
                    s(c10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(v2Var.y1()));
                }
                if (v2Var.d1()) {
                    s(c10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(v2Var.x1()));
                }
                s(c10, 1, "app_instance_id", v2Var.I1());
                s(c10, 1, "resettable_device_id", v2Var.D());
                s(c10, 1, "ds_id", v2Var.x());
                if (v2Var.c1()) {
                    s(c10, 1, "limited_ad_tracking", Boolean.valueOf(v2Var.q0()));
                }
                s(c10, 1, "os_version", v2Var.B());
                s(c10, 1, "device_model", v2Var.w());
                s(c10, 1, "user_default_language", v2Var.F());
                if (v2Var.k1()) {
                    s(c10, 1, "time_zone_offset_minutes", Integer.valueOf(v2Var.q1()));
                }
                if (v2Var.t0()) {
                    s(c10, 1, "bundle_sequential_index", Integer.valueOf(v2Var.T0()));
                }
                if (v2Var.h1()) {
                    s(c10, 1, "service_upload", Boolean.valueOf(v2Var.r0()));
                }
                s(c10, 1, "health_monitor", v2Var.A());
                if (v2Var.g1()) {
                    s(c10, 1, "retry_counter", Integer.valueOf(v2Var.p1()));
                }
                if (v2Var.X0()) {
                    s(c10, 1, "consent_signals", v2Var.v());
                }
                com.google.android.gms.internal.measurement.b6<com.google.android.gms.internal.measurement.e3> I = v2Var.I();
                r2 r2Var = y3Var.G;
                if (I != null) {
                    for (com.google.android.gms.internal.measurement.e3 e3Var : I) {
                        if (e3Var != null) {
                            p(2, c10);
                            c10.append("user_property {\n");
                            if (e3Var.L()) {
                                l2 = Long.valueOf(e3Var.w());
                            } else {
                                l2 = null;
                            }
                            s(c10, 2, "set_timestamp_millis", l2);
                            s(c10, 2, SessionManager.KEY_NAME, r2Var.f(e3Var.z()));
                            s(c10, 2, "string_value", e3Var.A());
                            if (e3Var.K()) {
                                l10 = Long.valueOf(e3Var.v());
                            } else {
                                l10 = null;
                            }
                            s(c10, 2, "int_value", l10);
                            if (e3Var.J()) {
                                d10 = Double.valueOf(e3Var.u());
                            } else {
                                d10 = null;
                            }
                            s(c10, 2, "double_value", d10);
                            p(2, c10);
                            c10.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.b6<com.google.android.gms.internal.measurement.i2> G = v2Var.G();
                if (G != null) {
                    for (com.google.android.gms.internal.measurement.i2 i2Var : G) {
                        if (i2Var != null) {
                            p(2, c10);
                            c10.append("audience_membership {\n");
                            if (i2Var.E()) {
                                s(c10, 2, "audience_id", Integer.valueOf(i2Var.u()));
                            }
                            if (i2Var.F()) {
                                s(c10, 2, "new_audience", Boolean.valueOf(i2Var.D()));
                            }
                            r(c10, "current_data", i2Var.x());
                            if (i2Var.G()) {
                                r(c10, "previous_data", i2Var.y());
                            }
                            p(2, c10);
                            c10.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.b6<com.google.android.gms.internal.measurement.m2> H = v2Var.H();
                if (H != null) {
                    for (com.google.android.gms.internal.measurement.m2 m2Var : H) {
                        if (m2Var != null) {
                            p(2, c10);
                            c10.append("event {\n");
                            s(c10, 2, SessionManager.KEY_NAME, r2Var.d(m2Var.B()));
                            if (m2Var.N()) {
                                s(c10, 2, "timestamp_millis", Long.valueOf(m2Var.x()));
                            }
                            if (m2Var.M()) {
                                s(c10, 2, "previous_timestamp_millis", Long.valueOf(m2Var.w()));
                            }
                            if (m2Var.L()) {
                                s(c10, 2, "count", Integer.valueOf(m2Var.u()));
                            }
                            if (m2Var.v() != 0) {
                                n(c10, 2, m2Var.C());
                            }
                            p(2, c10);
                            c10.append("}\n");
                        }
                    }
                }
                p(1, c10);
                c10.append("}\n");
            }
        }
        c10.append("}\n");
        return c10.toString();
    }

    public final String B(com.google.android.gms.internal.measurement.u1 u1Var) {
        StringBuilder c10 = v.h.c("\nproperty_filter {\n");
        if (u1Var.D()) {
            s(c10, 0, "filter_id", Integer.valueOf(u1Var.u()));
        }
        s(c10, 0, "property_name", this.f32943u.G.f(u1Var.y()));
        String q10 = q(u1Var.A(), u1Var.B(), u1Var.C());
        if (!q10.isEmpty()) {
            s(c10, 0, "filter_type", q10);
        }
        o(c10, 1, u1Var.v());
        c10.append("}\n");
        return c10.toString();
    }

    public final List C(com.google.android.gms.internal.measurement.a6 a6Var, List list) {
        int i6;
        ArrayList arrayList = new ArrayList(a6Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            y3 y3Var = this.f32943u;
            if (intValue < 0) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.C.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.C.d("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i6 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i6);
    }

    public final void F(com.google.android.gms.internal.measurement.p2 p2Var, Object obj) {
        Bundle[] bundleArr;
        p2Var.i();
        com.google.android.gms.internal.measurement.q2.F((com.google.android.gms.internal.measurement.q2) p2Var.f8613v);
        p2Var.i();
        com.google.android.gms.internal.measurement.q2.H((com.google.android.gms.internal.measurement.q2) p2Var.f8613v);
        p2Var.i();
        com.google.android.gms.internal.measurement.q2.J((com.google.android.gms.internal.measurement.q2) p2Var.f8613v);
        p2Var.i();
        com.google.android.gms.internal.measurement.q2.M((com.google.android.gms.internal.measurement.q2) p2Var.f8613v);
        if (obj instanceof String) {
            p2Var.i();
            com.google.android.gms.internal.measurement.q2.E((com.google.android.gms.internal.measurement.q2) p2Var.f8613v, (String) obj);
        } else if (obj instanceof Long) {
            p2Var.k(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            p2Var.i();
            com.google.android.gms.internal.measurement.q2.I((com.google.android.gms.internal.measurement.q2) p2Var.f8613v, doubleValue);
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.p2 y10 = com.google.android.gms.internal.measurement.q2.y();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.p2 y11 = com.google.android.gms.internal.measurement.q2.y();
                        y11.l(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            y11.k(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            y11.i();
                            com.google.android.gms.internal.measurement.q2.E((com.google.android.gms.internal.measurement.q2) y11.f8613v, (String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            y11.i();
                            com.google.android.gms.internal.measurement.q2.I((com.google.android.gms.internal.measurement.q2) y11.f8613v, doubleValue2);
                        }
                        y10.i();
                        com.google.android.gms.internal.measurement.q2.K((com.google.android.gms.internal.measurement.q2) y10.f8613v, (com.google.android.gms.internal.measurement.q2) y11.f());
                    }
                    if (((com.google.android.gms.internal.measurement.q2) y10.f8613v).w() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.q2) y10.f());
                    }
                }
            }
            p2Var.i();
            com.google.android.gms.internal.measurement.q2.L((com.google.android.gms.internal.measurement.q2) p2Var.f8613v, arrayList);
        } else {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.c(obj, "Ignoring invalid (type) event param value");
        }
    }

    public final boolean H(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            this.f32943u.H.getClass();
            if (Math.abs(System.currentTimeMillis() - j10) <= j11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final byte[] J(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.c(e10, "Failed to gzip content");
            throw e10;
        }
    }

    public final void n(StringBuilder sb2, int i6, com.google.android.gms.internal.measurement.b6 b6Var) {
        String str;
        String str2;
        Long l2;
        if (b6Var == null) {
            return;
        }
        int i10 = i6 + 1;
        Iterator it = b6Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.q2 q2Var = (com.google.android.gms.internal.measurement.q2) it.next();
            if (q2Var != null) {
                p(i10, sb2);
                sb2.append("param {\n");
                Double d10 = null;
                if (q2Var.Q()) {
                    str = this.f32943u.G.e(q2Var.A());
                } else {
                    str = null;
                }
                s(sb2, i10, SessionManager.KEY_NAME, str);
                if (q2Var.R()) {
                    str2 = q2Var.B();
                } else {
                    str2 = null;
                }
                s(sb2, i10, "string_value", str2);
                if (q2Var.P()) {
                    l2 = Long.valueOf(q2Var.x());
                } else {
                    l2 = null;
                }
                s(sb2, i10, "int_value", l2);
                if (q2Var.N()) {
                    d10 = Double.valueOf(q2Var.u());
                }
                s(sb2, i10, "double_value", d10);
                if (q2Var.w() > 0) {
                    n(sb2, i10, q2Var.C());
                }
                p(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public final void o(StringBuilder sb2, int i6, com.google.android.gms.internal.measurement.p1 p1Var) {
        String str;
        if (p1Var == null) {
            return;
        }
        p(i6, sb2);
        sb2.append("filter {\n");
        if (p1Var.B()) {
            s(sb2, i6, "complement", Boolean.valueOf(p1Var.A()));
        }
        if (p1Var.D()) {
            s(sb2, i6, "param_name", this.f32943u.G.e(p1Var.y()));
        }
        if (p1Var.E()) {
            int i10 = i6 + 1;
            com.google.android.gms.internal.measurement.w1 x10 = p1Var.x();
            if (x10 != null) {
                p(i10, sb2);
                sb2.append("string_filter {\n");
                if (x10.C()) {
                    switch (x10.D()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    s(sb2, i10, "match_type", str);
                }
                if (x10.B()) {
                    s(sb2, i10, "expression", x10.x());
                }
                if (x10.A()) {
                    s(sb2, i10, "case_sensitive", Boolean.valueOf(x10.z()));
                }
                if (x10.u() > 0) {
                    p(i10 + 1, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : x10.y()) {
                        p(i10 + 2, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                p(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (p1Var.C()) {
            t(sb2, i6 + 1, "number_filter", p1Var.w());
        }
        p(i6, sb2);
        sb2.append("}\n");
    }

    public final long v(byte[] bArr) {
        y3 y3Var = this.f32943u;
        k6 k6Var = y3Var.F;
        y3.i(k6Var);
        k6Var.h();
        MessageDigest p10 = k6.p();
        if (p10 == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Failed to get MD5");
            return 0L;
        }
        return k6.i0(p10.digest(bArr));
    }

    public final Parcelable x(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    @Override // ta.y5
    public final void k() {
    }
}
