package ih;

import com.moengage.evaluator.InvalidFieldValueException;
import com.moengage.evaluator.InvalidFilterException;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Date;
import nd.z;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: InAppV3Meta.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f20098a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f20099b;

    public /* synthetic */ k(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f20098a = jSONObject;
        this.f20099b = jSONObject2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0238, code lost:
        if (r15.compareTo(r5) > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x025a, code lost:
        if (r15.d() != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0262, code lost:
        if (r15.compareTo(r5) < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02c1, code lost:
        if (r0.compareTo(r15) == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02cd, code lost:
        if (r5.toString().toLowerCase() != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0360, code lost:
        if (r9.compareTo(r5) == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03ad, code lost:
        if (r9.d() != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0479, code lost:
        if (r9.d() != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x047b, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
        if (nd.z.h(r15) != false) goto L279;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        JSONObject jSONObject;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        JSONArray jSONArray;
        boolean z14;
        char c10;
        char c11;
        boolean z15;
        char c12;
        String obj;
        String lowerCase;
        char c13;
        JSONObject jSONObject2 = this.f20098a;
        if (jSONObject2 != null && (jSONObject = this.f20099b) != null) {
            String optString = jSONObject2.optString("filter_operator");
            Object opt = jSONObject2.opt("filters");
            ?? r52 = 0;
            if (!(opt instanceof JSONArray)) {
                return false;
            }
            JSONArray jSONArray2 = (JSONArray) opt;
            if (jSONArray2.length() == 0) {
                return true;
            }
            if (jSONArray2.length() <= 1) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                if ("custom_segments".equals(jSONObject3.optString("filter_type")) && "moe_all_users".equals(jSONObject3.optString("id"))) {
                    z10 = true;
                    if (!z10) {
                        return true;
                    }
                    int i6 = 0;
                    boolean z16 = false;
                    while (i6 < jSONArray2.length()) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i6);
                        hi.a aVar = new hi.a();
                        aVar.f17619a = jSONObject4.getString(SessionManager.KEY_NAME);
                        aVar.f17624g = jSONObject4.getString("operator");
                        aVar.f17625h = jSONObject4.getString("data_type");
                        String optString2 = jSONObject4.optString("value_type");
                        if (optString2 == null) {
                            optString2 = "absolute";
                        }
                        if (aVar.f17624g.equals("inTheNext")) {
                            optString2 = "relative_future";
                        }
                        aVar.f = optString2;
                        aVar.f17621c = Boolean.valueOf(jSONObject4.optBoolean("case_sensitive", r52)).booleanValue();
                        aVar.f17620b = Boolean.valueOf(jSONObject4.optBoolean("negate", r52)).booleanValue();
                        Object opt2 = jSONObject4.opt("value");
                        if (aVar.f17624g.equals("today")) {
                            opt2 = Integer.valueOf((int) r52);
                        }
                        aVar.f17622d = opt2;
                        aVar.f17623e = jSONObject4.opt("value1");
                        Object opt3 = jSONObject.opt(aVar.f17619a);
                        if (aVar.f17625h.equals("datetime") && opt3 != null) {
                            z11 = z.h(opt3);
                        } else {
                            if (aVar.f17625h.equals("double") && opt3 != null) {
                                try {
                                    Double.parseDouble(opt3.toString());
                                } catch (Exception unused) {
                                    z11 = false;
                                }
                            }
                            z11 = true;
                        }
                        if (z11) {
                            String str = aVar.f17624g;
                            if (str != null && aVar.f17625h != null && aVar.f17619a != null && ((str.equals("exists") || aVar.f17622d != null) && (!aVar.f17624g.equals("between") || aVar.f17623e != null))) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z12) {
                                if (aVar.f17625h.equals("datetime") && aVar.f.equals("absolute")) {
                                    z13 = z.h(aVar.f17622d);
                                    Object obj2 = aVar.f17623e;
                                    if (obj2 != null) {
                                        if (z13) {
                                        }
                                    }
                                    if (z13) {
                                        gd.d dVar = new gd.d(9, aVar);
                                        if (opt3 != null) {
                                            String str2 = ((hi.a) dVar.f16400v).f17625h;
                                            str2.getClass();
                                            switch (str2.hashCode()) {
                                                case -1325958191:
                                                    if (str2.equals("double")) {
                                                        c10 = 0;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case -891985903:
                                                    if (str2.equals("string")) {
                                                        c10 = 1;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 3029738:
                                                    if (str2.equals("bool")) {
                                                        c10 = 2;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                case 1793702779:
                                                    if (str2.equals("datetime")) {
                                                        c10 = 3;
                                                        break;
                                                    }
                                                    c10 = 65535;
                                                    break;
                                                default:
                                                    c10 = 65535;
                                                    break;
                                            }
                                            if (c10 != 0) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            hi.a aVar2 = (hi.a) dVar.f16400v;
                                                            String str3 = aVar2.f;
                                                            Object obj3 = aVar2.f17622d;
                                                            Object obj4 = aVar2.f17623e;
                                                            String str4 = aVar2.f17624g;
                                                            gi.b bVar = new gi.b(str3, str4, opt3);
                                                            gi.b bVar2 = new gi.b(str3, str4, obj3);
                                                            gi.b bVar3 = new gi.b(str3, str4, obj4);
                                                            str4.getClass();
                                                            jSONArray = jSONArray2;
                                                            switch (str4.hashCode()) {
                                                                case -2054582846:
                                                                    if (str4.equals("inTheLast")) {
                                                                        c13 = 0;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case -2054519265:
                                                                    if (str4.equals("inTheNext")) {
                                                                        c13 = 1;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case -1392885889:
                                                                    if (str4.equals("before")) {
                                                                        c13 = 2;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case -1289358244:
                                                                    if (str4.equals("exists")) {
                                                                        c13 = 3;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case -216634360:
                                                                    if (str4.equals("between")) {
                                                                        c13 = 4;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case 3551:
                                                                    if (str4.equals("on")) {
                                                                        c13 = 5;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case 92734940:
                                                                    if (str4.equals("after")) {
                                                                        c13 = 6;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case 110534465:
                                                                    if (str4.equals("today")) {
                                                                        c13 = 7;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                default:
                                                                    c13 = 65535;
                                                                    break;
                                                            }
                                                            switch (c13) {
                                                                case 0:
                                                                    z14 = dj.a.J(bVar, bVar2, new gi.b("absolute", "inTheLast", defpackage.b.n("yyyy-MM-dd'T'HH:mm:ss", new Date())));
                                                                    break;
                                                                case 1:
                                                                    z14 = dj.a.J(bVar, new gi.b("absolute", "inTheNext", defpackage.b.n("yyyy-MM-dd'T'HH:mm:ss", new Date())), bVar2);
                                                                    break;
                                                                case 2:
                                                                    break;
                                                                case 3:
                                                                    break;
                                                                case 4:
                                                                    if (str3.equals("relative_past")) {
                                                                        z14 = dj.a.J(bVar, bVar3, bVar2);
                                                                        break;
                                                                    } else {
                                                                        z14 = dj.a.J(bVar, bVar2, bVar3);
                                                                        break;
                                                                    }
                                                                case 5:
                                                                    z14 = dj.b.K(bVar, bVar2);
                                                                    break;
                                                                case 6:
                                                                    break;
                                                                case 7:
                                                                    z14 = dj.b.K(bVar, bVar2);
                                                                    break;
                                                                default:
                                                                    z14 = false;
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        jSONArray = jSONArray2;
                                                        hi.a aVar3 = (hi.a) dVar.f16400v;
                                                        Object obj5 = aVar3.f17622d;
                                                        String str5 = aVar3.f17624g;
                                                        str5.getClass();
                                                        if (!str5.equals("exists")) {
                                                            if (str5.equals("is")) {
                                                                String lowerCase2 = opt3.toString().toLowerCase();
                                                                if (obj5 == null) {
                                                                    lowerCase = null;
                                                                } else {
                                                                    lowerCase = obj5.toString().toLowerCase();
                                                                }
                                                            }
                                                            z14 = false;
                                                        }
                                                    }
                                                } else {
                                                    jSONArray = jSONArray2;
                                                    boolean booleanValue = Boolean.valueOf(((hi.a) dVar.f16400v).f17621c).booleanValue();
                                                    hi.a aVar4 = (hi.a) dVar.f16400v;
                                                    Object obj6 = aVar4.f17622d;
                                                    String str6 = aVar4.f17624g;
                                                    gi.d dVar2 = new gi.d(opt3, booleanValue);
                                                    gi.d dVar3 = new gi.d(obj6, booleanValue);
                                                    str6.getClass();
                                                    switch (str6.hashCode()) {
                                                        case -1555538761:
                                                            if (str6.equals("startsWith")) {
                                                                c12 = 0;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case -1289358244:
                                                            if (str6.equals("exists")) {
                                                                c12 = 1;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case -567445985:
                                                            if (str6.equals("contains")) {
                                                                c12 = 2;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3365:
                                                            if (str6.equals("in")) {
                                                                c12 = 3;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 3370:
                                                            if (str6.equals("is")) {
                                                                c12 = 4;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        case 1743158238:
                                                            if (str6.equals("endsWith")) {
                                                                c12 = 5;
                                                                break;
                                                            }
                                                            c12 = 65535;
                                                            break;
                                                        default:
                                                            c12 = 65535;
                                                            break;
                                                    }
                                                    if (c12 != 0) {
                                                        if (c12 != 1) {
                                                            if (c12 != 2) {
                                                                if (c12 != 3) {
                                                                    if (c12 != 4) {
                                                                        if (c12 == 5) {
                                                                            z14 = dVar2.d().endsWith(dVar3.d());
                                                                        }
                                                                    }
                                                                } else if (obj6 instanceof JSONArray) {
                                                                    JSONArray jSONArray3 = (JSONArray) obj6;
                                                                    z15 = false;
                                                                    for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                                                                        Object obj7 = jSONArray3.get(i10);
                                                                        String d10 = dVar2.d();
                                                                        if (obj7 == null) {
                                                                            obj = null;
                                                                        } else {
                                                                            obj = obj7.toString();
                                                                            if (!booleanValue) {
                                                                                obj = obj.toLowerCase();
                                                                            }
                                                                        }
                                                                        if (d10.compareTo(obj) == 0) {
                                                                            z15 = true;
                                                                        } else {
                                                                            z15 = false;
                                                                        }
                                                                        if (z15) {
                                                                            z14 = z15;
                                                                        }
                                                                    }
                                                                    z14 = z15;
                                                                }
                                                                z14 = false;
                                                            } else {
                                                                z14 = dVar2.d().contains(dVar3.d());
                                                            }
                                                        }
                                                    } else {
                                                        z14 = dVar2.d().startsWith(dVar3.d());
                                                    }
                                                }
                                            } else {
                                                jSONArray = jSONArray2;
                                                hi.a aVar5 = (hi.a) dVar.f16400v;
                                                Object obj8 = aVar5.f17622d;
                                                Object obj9 = aVar5.f17623e;
                                                String str7 = aVar5.f17624g;
                                                gi.c cVar = new gi.c(opt3);
                                                gi.c cVar2 = new gi.c(obj8);
                                                gi.c cVar3 = new gi.c(obj9);
                                                str7.getClass();
                                                switch (str7.hashCode()) {
                                                    case -1289358244:
                                                        if (str7.equals("exists")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case -216634360:
                                                        if (str7.equals("between")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3365:
                                                        if (str7.equals("in")) {
                                                            c11 = 2;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3370:
                                                        if (str7.equals("is")) {
                                                            c11 = 3;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 925147323:
                                                        if (str7.equals("greaterThan")) {
                                                            c11 = 4;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 2089676506:
                                                        if (str7.equals("lessThan")) {
                                                            c11 = 5;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    default:
                                                        c11 = 65535;
                                                        break;
                                                }
                                                if (c11 != 0) {
                                                    if (c11 != 1) {
                                                        if (c11 != 2) {
                                                            if (c11 == 3) {
                                                            }
                                                        } else if (obj8 instanceof JSONArray) {
                                                            JSONArray jSONArray4 = (JSONArray) obj8;
                                                            z15 = false;
                                                            for (int i11 = 0; i11 < jSONArray4.length(); i11++) {
                                                                if (cVar.compareTo(new gi.c(jSONArray4.get(i11))) == 0) {
                                                                    z15 = true;
                                                                } else {
                                                                    z15 = false;
                                                                }
                                                                if (z15) {
                                                                    z14 = z15;
                                                                }
                                                            }
                                                            z14 = z15;
                                                        }
                                                        z14 = false;
                                                    } else {
                                                        z14 = dj.a.J(cVar, cVar2, cVar3);
                                                    }
                                                }
                                            }
                                            if (Boolean.valueOf(((hi.a) dVar.f16400v).f17620b).booleanValue() == z14) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            if (!z16 && optString.equals("or")) {
                                                return true;
                                            }
                                            if (z16 && optString.equals("and")) {
                                                return false;
                                            }
                                            i6++;
                                            r52 = 0;
                                            jSONArray2 = jSONArray;
                                        }
                                        jSONArray = jSONArray2;
                                        z14 = false;
                                        if (Boolean.valueOf(((hi.a) dVar.f16400v).f17620b).booleanValue() == z14) {
                                        }
                                        if (!z16) {
                                        }
                                        if (z16) {
                                        }
                                        i6++;
                                        r52 = 0;
                                        jSONArray2 = jSONArray;
                                    } else {
                                        throw new InvalidFilterException("Provided condition filters are not valid");
                                    }
                                }
                                z13 = true;
                                if (z13) {
                                }
                            }
                            z13 = false;
                            if (z13) {
                            }
                        } else {
                            throw new InvalidFieldValueException();
                        }
                    }
                    return z16;
                }
            }
            z10 = false;
            if (!z10) {
            }
        } else {
            throw new InvalidFilterException("Provided filters are null");
        }
    }
}
