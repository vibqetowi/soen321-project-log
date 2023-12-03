package x7;

import c9.q;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u7.g;
/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes.dex */
public final class b extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    public long f37682b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f37683c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f37684d;

    public b() {
        super(new g());
        this.f37682b = -9223372036854775807L;
        this.f37683c = new long[0];
        this.f37684d = new long[0];
    }

    public static Serializable b(int i6, q qVar) {
        if (i6 != 0) {
            boolean z10 = true;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 8) {
                            if (i6 != 10) {
                                if (i6 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(qVar.j())).doubleValue());
                                qVar.B(2);
                                return date;
                            }
                            int t3 = qVar.t();
                            ArrayList arrayList = new ArrayList(t3);
                            for (int i10 = 0; i10 < t3; i10++) {
                                Serializable b10 = b(qVar.q(), qVar);
                                if (b10 != null) {
                                    arrayList.add(b10);
                                }
                            }
                            return arrayList;
                        }
                        return c(qVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String d10 = d(qVar);
                        int q10 = qVar.q();
                        if (q10 == 9) {
                            return hashMap;
                        }
                        Serializable b11 = b(q10, qVar);
                        if (b11 != null) {
                            hashMap.put(d10, b11);
                        }
                    }
                } else {
                    return d(qVar);
                }
            } else {
                if (qVar.q() != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(qVar.j()));
        }
    }

    public static HashMap<String, Object> c(q qVar) {
        int t3 = qVar.t();
        HashMap<String, Object> hashMap = new HashMap<>(t3);
        for (int i6 = 0; i6 < t3; i6++) {
            String d10 = d(qVar);
            Serializable b10 = b(qVar.q(), qVar);
            if (b10 != null) {
                hashMap.put(d10, b10);
            }
        }
        return hashMap;
    }

    public static String d(q qVar) {
        int v10 = qVar.v();
        int i6 = qVar.f5187b;
        qVar.B(v10);
        return new String(qVar.f5186a, i6, v10);
    }

    public final boolean a(long j10, q qVar) {
        if (qVar.q() != 2 || !"onMetaData".equals(d(qVar)) || qVar.q() != 8) {
            return false;
        }
        HashMap<String, Object> c10 = c(qVar);
        Object obj = c10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f37682b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = c10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f37683c = new long[size];
                this.f37684d = new long[size];
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj5 = list.get(i6);
                    Object obj6 = list2.get(i6);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f37683c[i6] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f37684d[i6] = ((Double) obj5).longValue();
                    } else {
                        this.f37683c = new long[0];
                        this.f37684d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
