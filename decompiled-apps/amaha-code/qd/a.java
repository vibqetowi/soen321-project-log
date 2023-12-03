package qd;

import android.util.Base64;
import android.util.JsonReader;
import ce.c;
import ce.d;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import d9.p;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import pd.b;
import pd.b0;
import pd.c;
import pd.c0;
import pd.e;
import pd.f;
import pd.g;
import pd.h;
import pd.i;
import pd.k;
import pd.l;
import pd.m;
import pd.n;
import pd.o;
import pd.q;
import pd.r;
import pd.s;
import pd.t;
import pd.u;
import pd.v;
import pd.w;
/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f29523a;

    static {
        d dVar = new d();
        pd.a.f28101a.a(dVar);
        dVar.f5252d = true;
        f29523a = new c(dVar);
    }

    public static s a(JsonReader jsonReader) {
        s.a aVar = new s.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.f28352d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f28350b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    aVar.f28349a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f28351c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f28353e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static e b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new e(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c0 c(JsonReader jsonReader, p pVar) {
        Object dVar;
        char c10;
        Object d10;
        char c11;
        char c12;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = "";
            String str2 = null;
            switch (pVar.f12711u) {
                case 10:
                    d10 = d(jsonReader);
                    continue;
                    arrayList.add(d10);
                case 11:
                    jsonReader.beginObject();
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        if (!nextName.equals("filename")) {
                            if (!nextName.equals("contents")) {
                                jsonReader.skipValue();
                            } else {
                                bArr = Base64.decode(jsonReader.nextString(), 2);
                                if (bArr == null) {
                                    throw new NullPointerException("Null contents");
                                }
                            }
                        } else {
                            str2 = jsonReader.nextString();
                            if (str2 == null) {
                                throw new NullPointerException("Null filename");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (str2 == null) {
                        str = " filename";
                    }
                    if (bArr == null) {
                        str = str.concat(" contents");
                    }
                    if (str.isEmpty()) {
                        dVar = new g(str2, bArr);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                case 12:
                case 13:
                    d10 = b(jsonReader);
                    continue;
                    arrayList.add(d10);
                case 14:
                    jsonReader.beginObject();
                    Integer num = null;
                    c0 c0Var = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        int hashCode = nextName2.hashCode();
                        if (hashCode != -1266514778) {
                            if (hashCode != 3373707) {
                                if (hashCode == 2125650548 && nextName2.equals("importance")) {
                                    c11 = 2;
                                }
                                c11 = 65535;
                            } else {
                                if (nextName2.equals(SessionManager.KEY_NAME)) {
                                    c11 = 1;
                                }
                                c11 = 65535;
                            }
                        } else {
                            if (nextName2.equals("frames")) {
                                c11 = 0;
                            }
                            c11 = 65535;
                        }
                        if (c11 != 0) {
                            if (c11 != 1) {
                                if (c11 != 2) {
                                    jsonReader.skipValue();
                                } else {
                                    num = Integer.valueOf(jsonReader.nextInt());
                                }
                            } else {
                                str2 = jsonReader.nextString();
                                if (str2 == null) {
                                    throw new NullPointerException("Null name");
                                }
                            }
                        } else {
                            c0Var = c(jsonReader, new p(16));
                        }
                    }
                    jsonReader.endObject();
                    if (str2 == null) {
                        str = " name";
                    }
                    if (num == null) {
                        str = str.concat(" importance");
                    }
                    if (c0Var == null) {
                        str = pl.a.f(str, " frames");
                    }
                    if (str.isEmpty()) {
                        d10 = new r(str2, num.intValue(), c0Var);
                        continue;
                        arrayList.add(d10);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    break;
                case 15:
                    o.a aVar = new o.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case 3373707:
                                if (nextName3.equals(SessionManager.KEY_NAME)) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3530753:
                                if (nextName3.equals("size")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3601339:
                                if (nextName3.equals(SessionManager.KEY_UUID)) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1153765347:
                                if (nextName3.equals("baseAddress")) {
                                    c12 = 3;
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
                                        jsonReader.skipValue();
                                    } else {
                                        aVar.f28329a = Long.valueOf(jsonReader.nextLong());
                                    }
                                } else {
                                    aVar.f28332d = new String(Base64.decode(jsonReader.nextString(), 2), b0.f28231a);
                                }
                            } else {
                                aVar.f28330b = Long.valueOf(jsonReader.nextLong());
                            }
                        } else {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f28331c = nextString;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        }
                    }
                    jsonReader.endObject();
                    d10 = aVar.a();
                    continue;
                    arrayList.add(d10);
                case 16:
                case 17:
                    d10 = a(jsonReader);
                    continue;
                    arrayList.add(d10);
                default:
                    jsonReader.beginObject();
                    String str3 = null;
                    String str4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        int hashCode2 = nextName4.hashCode();
                        if (hashCode2 != -609862170) {
                            if (hashCode2 != 3002454) {
                                if (hashCode2 == 230943785 && nextName4.equals("buildId")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            } else {
                                if (nextName4.equals("arch")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            }
                        } else {
                            if (nextName4.equals("libraryName")) {
                                c10 = 0;
                            }
                            c10 = 65535;
                        }
                        if (c10 != 0) {
                            if (c10 != 1) {
                                if (c10 != 2) {
                                    jsonReader.skipValue();
                                } else {
                                    str4 = jsonReader.nextString();
                                    if (str4 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                }
                            } else {
                                str2 = jsonReader.nextString();
                                if (str2 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                            }
                        } else {
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (str2 == null) {
                        str = " arch";
                    }
                    if (str3 == null) {
                        str = str.concat(" libraryName");
                    }
                    if (str4 == null) {
                        str = pl.a.f(str, " buildId");
                    }
                    if (str.isEmpty()) {
                        dVar = new pd.d(str2, str3, str4);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
            }
            d10 = dVar;
            arrayList.add(d10);
        }
        jsonReader.endArray();
        return new c0(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l d(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        char c13;
        String str2;
        char c14;
        char c15;
        l.a aVar = new l.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c16 = 3;
            char c17 = 4;
            char c18 = 1;
            char c19 = 2;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals(ServerValues.NAME_OP_TIMESTAMP)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                String str3 = "";
                if (c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                jsonReader.skipValue();
                            } else {
                                aVar.f28305a = Long.valueOf(jsonReader.nextLong());
                            }
                        } else {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                aVar.f28306b = nextString;
                            } else {
                                throw new NullPointerException("Null type");
                            }
                        }
                    } else {
                        jsonReader.beginObject();
                        String str4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (!nextName2.equals("content")) {
                                jsonReader.skipValue();
                            } else {
                                str4 = jsonReader.nextString();
                                if (str4 == null) {
                                    throw new NullPointerException("Null content");
                                }
                            }
                        }
                        jsonReader.endObject();
                        if (str4 == null) {
                            str3 = " content";
                        }
                        if (str3.isEmpty()) {
                            aVar.f28309e = new u(str4);
                        } else {
                            throw new IllegalStateException("Missing required properties:".concat(str3));
                        }
                    }
                } else {
                    jsonReader.beginObject();
                    Integer num = null;
                    Boolean bool = null;
                    c0 c0Var = null;
                    c0 c0Var2 = null;
                    n nVar = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1332194002:
                                if (nextName3.equals("background")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1090974952:
                                if (nextName3.equals("execution")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -80231855:
                                if (nextName3.equals("internalKeys")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 555169704:
                                if (nextName3.equals("customAttributes")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 928737948:
                                if (nextName3.equals("uiOrientation")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        if (c11 != 0) {
                            if (c11 != c18) {
                                if (c11 != c19) {
                                    if (c11 != c16) {
                                        if (c11 != c17) {
                                            jsonReader.skipValue();
                                        } else {
                                            num = Integer.valueOf(jsonReader.nextInt());
                                        }
                                    } else {
                                        c0Var2 = c(jsonReader, new p(12));
                                    }
                                } else {
                                    c0Var = c(jsonReader, new p(13));
                                }
                            } else {
                                jsonReader.beginObject();
                                pd.c cVar = null;
                                q qVar = null;
                                c0 c0Var3 = null;
                                c0 c0Var4 = null;
                                pd.p pVar = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1375141843:
                                            if (nextName4.equals("appExitInfo")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName4.equals("threads")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName4.equals("signal")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName4.equals("binaries")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName4.equals("exception")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    if (c12 != 0) {
                                        if (c12 != c18) {
                                            if (c12 != c19) {
                                                if (c12 != c16) {
                                                    if (c12 != c17) {
                                                        jsonReader.skipValue();
                                                    } else {
                                                        pVar = e(jsonReader);
                                                    }
                                                } else {
                                                    c0Var3 = c(jsonReader, new p(15));
                                                }
                                            } else {
                                                jsonReader.beginObject();
                                                String str5 = null;
                                                String str6 = null;
                                                Long l2 = null;
                                                while (jsonReader.hasNext()) {
                                                    String nextName5 = jsonReader.nextName();
                                                    nextName5.getClass();
                                                    int hashCode = nextName5.hashCode();
                                                    if (hashCode != -1147692044) {
                                                        if (hashCode != 3059181) {
                                                            if (hashCode == 3373707 && nextName5.equals(SessionManager.KEY_NAME)) {
                                                                c14 = 2;
                                                            }
                                                            c14 = 65535;
                                                        } else {
                                                            if (nextName5.equals("code")) {
                                                                c14 = 1;
                                                            }
                                                            c14 = 65535;
                                                        }
                                                    } else {
                                                        if (nextName5.equals("address")) {
                                                            c14 = 0;
                                                        }
                                                        c14 = 65535;
                                                    }
                                                    if (c14 != 0) {
                                                        if (c14 != c18) {
                                                            if (c14 != 2) {
                                                                jsonReader.skipValue();
                                                            } else {
                                                                String nextString2 = jsonReader.nextString();
                                                                if (nextString2 != null) {
                                                                    str5 = nextString2;
                                                                } else {
                                                                    throw new NullPointerException("Null name");
                                                                }
                                                            }
                                                        } else {
                                                            String nextString3 = jsonReader.nextString();
                                                            if (nextString3 != null) {
                                                                str6 = nextString3;
                                                            } else {
                                                                throw new NullPointerException("Null code");
                                                            }
                                                        }
                                                    } else {
                                                        l2 = Long.valueOf(jsonReader.nextLong());
                                                    }
                                                }
                                                jsonReader.endObject();
                                                if (str5 != null) {
                                                    str2 = "";
                                                } else {
                                                    str2 = " name";
                                                }
                                                if (str6 == null) {
                                                    str2 = str2.concat(" code");
                                                }
                                                if (l2 == null) {
                                                    str2 = pl.a.f(str2, " address");
                                                }
                                                if (str2.isEmpty()) {
                                                    qVar = new q(str5, str6, l2.longValue());
                                                } else {
                                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                                }
                                            }
                                        } else {
                                            c0Var4 = c(jsonReader, new p(14));
                                        }
                                    } else {
                                        c.a aVar2 = new c.a();
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String nextName6 = jsonReader.nextName();
                                            nextName6.getClass();
                                            switch (nextName6.hashCode()) {
                                                case -1516200806:
                                                    if (nextName6.equals("buildIdMappingForArch")) {
                                                        c13 = 0;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 110987:
                                                    if (nextName6.equals("pid")) {
                                                        c13 = 1;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 111312:
                                                    if (nextName6.equals("pss")) {
                                                        c13 = 2;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 113234:
                                                    if (nextName6.equals("rss")) {
                                                        c13 = 3;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 55126294:
                                                    if (nextName6.equals(ServerValues.NAME_OP_TIMESTAMP)) {
                                                        c13 = 4;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 202325402:
                                                    if (nextName6.equals("processName")) {
                                                        c13 = 5;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 722137681:
                                                    if (nextName6.equals("reasonCode")) {
                                                        c13 = 6;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 723857505:
                                                    if (nextName6.equals("traceFile")) {
                                                        c13 = 7;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 2125650548:
                                                    if (nextName6.equals("importance")) {
                                                        c13 = '\b';
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
                                                    aVar2.f28247i = c(jsonReader, new p(18));
                                                    break;
                                                case 1:
                                                    aVar2.f28240a = Integer.valueOf(jsonReader.nextInt());
                                                    break;
                                                case 2:
                                                    aVar2.f28244e = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 3:
                                                    aVar2.f = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 4:
                                                    aVar2.f28245g = Long.valueOf(jsonReader.nextLong());
                                                    break;
                                                case 5:
                                                    String nextString4 = jsonReader.nextString();
                                                    if (nextString4 != null) {
                                                        aVar2.f28241b = nextString4;
                                                        break;
                                                    } else {
                                                        throw new NullPointerException("Null processName");
                                                    }
                                                case 6:
                                                    aVar2.f28242c = Integer.valueOf(jsonReader.nextInt());
                                                    break;
                                                case 7:
                                                    aVar2.f28246h = jsonReader.nextString();
                                                    break;
                                                case '\b':
                                                    aVar2.f28243d = Integer.valueOf(jsonReader.nextInt());
                                                    break;
                                                default:
                                                    jsonReader.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader.endObject();
                                        cVar = aVar2.a();
                                    }
                                    c17 = 4;
                                    c16 = 3;
                                    c18 = 1;
                                    c19 = 2;
                                }
                                jsonReader.endObject();
                                if (qVar != null) {
                                    str = "";
                                } else {
                                    str = " signal";
                                }
                                if (c0Var3 == null) {
                                    str = str.concat(" binaries");
                                }
                                if (str.isEmpty()) {
                                    nVar = new n(c0Var4, pVar, cVar, qVar, c0Var3);
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            }
                        } else {
                            bool = Boolean.valueOf(jsonReader.nextBoolean());
                        }
                        c17 = 4;
                        c16 = 3;
                        c18 = 1;
                        c19 = 2;
                    }
                    jsonReader.endObject();
                    if (nVar == null) {
                        str3 = " execution";
                    }
                    if (num == null) {
                        str3 = str3.concat(" uiOrientation");
                    }
                    if (str3.isEmpty()) {
                        aVar.f28307c = new m(nVar, c0Var2, c0Var, bool, num.intValue());
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                }
            } else {
                t.a aVar3 = new t.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName7 = jsonReader.nextName();
                    nextName7.getClass();
                    switch (nextName7.hashCode()) {
                        case -1708606089:
                            if (nextName7.equals("batteryLevel")) {
                                c15 = 0;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1455558134:
                            if (nextName7.equals("batteryVelocity")) {
                                c15 = 1;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case -1439500848:
                            if (nextName7.equals("orientation")) {
                                c15 = 2;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 279795450:
                            if (nextName7.equals("diskUsed")) {
                                c15 = 3;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 976541947:
                            if (nextName7.equals("ramUsed")) {
                                c15 = 4;
                                break;
                            }
                            c15 = 65535;
                            break;
                        case 1516795582:
                            if (nextName7.equals("proximityOn")) {
                                c15 = 5;
                                break;
                            }
                            c15 = 65535;
                            break;
                        default:
                            c15 = 65535;
                            break;
                    }
                    if (c15 != 0) {
                        if (c15 != 1) {
                            if (c15 != 2) {
                                if (c15 != 3) {
                                    if (c15 != 4) {
                                        if (c15 != 5) {
                                            jsonReader.skipValue();
                                        } else {
                                            aVar3.f28361c = Boolean.valueOf(jsonReader.nextBoolean());
                                        }
                                    } else {
                                        aVar3.f28363e = Long.valueOf(jsonReader.nextLong());
                                    }
                                } else {
                                    aVar3.f = Long.valueOf(jsonReader.nextLong());
                                }
                            } else {
                                aVar3.f28362d = Integer.valueOf(jsonReader.nextInt());
                            }
                        } else {
                            aVar3.f28360b = Integer.valueOf(jsonReader.nextInt());
                        }
                    } else {
                        aVar3.f28359a = Double.valueOf(jsonReader.nextDouble());
                    }
                }
                jsonReader.endObject();
                aVar.f28308d = aVar3.a();
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static pd.p e(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        c0 c0Var = null;
        pd.p pVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c0Var = c(jsonReader, new p(17));
                    break;
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    if (str2 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    pVar = e(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " type";
        } else {
            str = "";
        }
        if (c0Var == null) {
            str = str.concat(" frames");
        }
        if (num == null) {
            str = pl.a.f(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new pd.p(str2, str3, c0Var, pVar, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b f(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        String str;
        char c14;
        String str2;
        Charset charset = b0.f28231a;
        b.a aVar = new b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = "";
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    c0 c0Var = null;
                    String str4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str4 = jsonReader.nextString();
                            }
                        } else {
                            c0Var = c(jsonReader, new p(11));
                        }
                    }
                    jsonReader.endObject();
                    if (c0Var == null) {
                        str3 = " files";
                    }
                    String str5 = str3;
                    if (str5.isEmpty()) {
                        aVar.f28230h = new f(c0Var, str4);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f28224a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        aVar.f28228e = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 3:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        aVar.f28225b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 4:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        aVar.f28227d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 5:
                    aVar.f28226c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        aVar.f = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 7:
                    h.a aVar2 = new h.a();
                    aVar2.f28272e = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                aVar2.f28270c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                aVar2.f28269b = new String(Base64.decode(jsonReader.nextString(), 2), b0.f28231a);
                                break;
                            case 2:
                                aVar2.f28271d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 3:
                                k.a aVar3 = new k.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            aVar3.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                aVar3.f28298h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            aVar3.f28295d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            aVar3.f28292a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            aVar3.f28296e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            aVar3.f28294c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                aVar3.f28293b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            aVar3.f28297g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                aVar3.f28299i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f28275i = aVar3.a();
                                break;
                            case 4:
                                aVar2.f28276j = c(jsonReader, new p(10));
                                break;
                            case 5:
                                v.a aVar4 = new v.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    if (c13 != 0) {
                                        if (c13 != 1) {
                                            if (c13 != 2) {
                                                if (c13 != 3) {
                                                    jsonReader.skipValue();
                                                } else {
                                                    aVar4.f28369a = Integer.valueOf(jsonReader.nextInt());
                                                }
                                            } else {
                                                String nextString9 = jsonReader.nextString();
                                                if (nextString9 != null) {
                                                    aVar4.f28370b = nextString9;
                                                } else {
                                                    throw new NullPointerException("Null version");
                                                }
                                            }
                                        } else {
                                            aVar4.f28372d = Boolean.valueOf(jsonReader.nextBoolean());
                                        }
                                    } else {
                                        String nextString10 = jsonReader.nextString();
                                        if (nextString10 != null) {
                                            aVar4.f28371c = nextString10;
                                        } else {
                                            throw new NullPointerException("Null buildVersion");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f28274h = aVar4.a();
                                break;
                            case 6:
                                jsonReader.beginObject();
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c14 = 4;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c14 = 5;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    if (c14 != 0) {
                                        if (c14 != 1) {
                                            if (c14 != 2) {
                                                if (c14 != 3) {
                                                    if (c14 != 4) {
                                                        if (c14 != 5) {
                                                            jsonReader.skipValue();
                                                        } else {
                                                            str8 = jsonReader.nextString();
                                                        }
                                                    } else {
                                                        str9 = jsonReader.nextString();
                                                    }
                                                } else {
                                                    str7 = jsonReader.nextString();
                                                    if (str7 == null) {
                                                        throw new NullPointerException("Null version");
                                                    }
                                                }
                                            } else {
                                                str11 = jsonReader.nextString();
                                            }
                                        } else {
                                            str10 = jsonReader.nextString();
                                        }
                                    } else {
                                        str6 = jsonReader.nextString();
                                        if (str6 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str6 != null) {
                                    str = "";
                                } else {
                                    str = " identifier";
                                }
                                if (str7 == null) {
                                    str = str.concat(" version");
                                }
                                if (str.isEmpty()) {
                                    aVar2.f = new i(str6, str7, str8, str9, str10, str11);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 7:
                                jsonReader.beginObject();
                                String str12 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName7 = jsonReader.nextName();
                                    nextName7.getClass();
                                    if (!nextName7.equals("identifier")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str12 = jsonReader.nextString();
                                        if (str12 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str12 != null) {
                                    str2 = "";
                                } else {
                                    str2 = " identifier";
                                }
                                if (str2.isEmpty()) {
                                    aVar2.f28273g = new w(str12);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                            case '\b':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    aVar2.f28268a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\t':
                                aVar2.f28272e = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case '\n':
                                aVar2.f28277k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.f28229g = aVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static b g(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            b f = f(jsonReader);
            jsonReader.close();
            return f;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
