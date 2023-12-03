package y5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.database.core.ServerValues;
import gv.n;
import h5.p;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.e0;
/* compiled from: InstrumentData.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f38256a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0649a f38257b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONArray f38258c;

    /* renamed from: d  reason: collision with root package name */
    public final String f38259d;

    /* renamed from: e  reason: collision with root package name */
    public final String f38260e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f38261g;

    /* compiled from: InstrumentData.kt */
    /* renamed from: y5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0649a {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0649a[] valuesCustom() {
            return (EnumC0649a[]) Arrays.copyOf(values(), 6);
        }

        @Override // java.lang.Enum
        public final String toString() {
            int ordinal = ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                return "Unknown";
                            }
                            return "ThreadCheck";
                        }
                        return "CrashShield";
                    }
                    return "CrashReport";
                }
                return "AnrReport";
            }
            return "Analysis";
        }
    }

    /* compiled from: InstrumentData.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38268a;

        static {
            int[] iArr = new int[EnumC0649a.valuesCustom().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[4] = 4;
            iArr[5] = 5;
            f38268a = iArr;
        }
    }

    public a(JSONArray jSONArray) {
        this.f38257b = EnumC0649a.Analysis;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f38261g = valueOf;
        this.f38258c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        i.f(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f38256a = stringBuffer2;
    }

    public final int a(a data) {
        i.g(data, "data");
        Long l2 = this.f38261g;
        if (l2 == null) {
            return -1;
        }
        long longValue = l2.longValue();
        Long l10 = data.f38261g;
        if (l10 == null) {
            return 1;
        }
        return i.j(l10.longValue(), longValue);
    }

    public final boolean b() {
        int i6;
        EnumC0649a enumC0649a = this.f38257b;
        if (enumC0649a == null) {
            i6 = -1;
        } else {
            i6 = b.f38268a[enumC0649a.ordinal()];
        }
        Long l2 = this.f38261g;
        if (i6 != 1) {
            String str = this.f;
            if (i6 != 2) {
                if ((i6 != 3 && i6 != 4 && i6 != 5) || str == null || l2 == null) {
                    return false;
                }
            } else if (str == null || this.f38260e == null || l2 == null) {
                return false;
            }
        } else if (this.f38258c == null || l2 == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (!b()) {
            return;
        }
        sp.b.k0(this.f38256a, toString());
    }

    public final String toString() {
        int i6;
        JSONObject jSONObject;
        EnumC0649a enumC0649a = this.f38257b;
        if (enumC0649a == null) {
            i6 = -1;
        } else {
            i6 = b.f38268a[enumC0649a.ordinal()];
        }
        Long l2 = this.f38261g;
        if (i6 != 1) {
            if (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) {
                jSONObject = new JSONObject();
                jSONObject.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject.put("device_model", Build.MODEL);
                String str = this.f38259d;
                if (str != null) {
                    jSONObject.put("app_version", str);
                }
                if (l2 != null) {
                    jSONObject.put(ServerValues.NAME_OP_TIMESTAMP, l2);
                }
                String str2 = this.f38260e;
                if (str2 != null) {
                    jSONObject.put("reason", str2);
                }
                String str3 = this.f;
                if (str3 != null) {
                    jSONObject.put("callstack", str3);
                }
                if (enumC0649a != null) {
                    jSONObject.put("type", enumC0649a);
                }
            }
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            JSONArray jSONArray = this.f38258c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            if (l2 != null) {
                jSONObject.put(ServerValues.NAME_OP_TIMESTAMP, l2);
            }
        }
        if (jSONObject == null) {
            String jSONObject2 = new JSONObject().toString();
            i.f(jSONObject2, "JSONObject().toString()");
            return jSONObject2;
        }
        String jSONObject3 = jSONObject.toString();
        i.f(jSONObject3, "params.toString()");
        return jSONObject3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Throwable th2, EnumC0649a enumC0649a) {
        String str;
        String valueOf;
        PackageInfo packageInfo;
        this.f38257b = enumC0649a;
        e0 e0Var = e0.f36453a;
        Context a10 = p.a();
        String str2 = 0;
        try {
            packageInfo = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            str = packageInfo.versionName;
            this.f38259d = str;
            if (th2 != null) {
            }
            this.f38260e = valueOf;
            if (th2 != null) {
            }
            this.f = str2;
            Long valueOf2 = Long.valueOf(System.currentTimeMillis() / 1000);
            this.f38261g = valueOf2;
            StringBuffer stringBuffer = new StringBuffer();
            int ordinal = enumC0649a.ordinal();
            stringBuffer.append(ordinal == 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
            stringBuffer.append(String.valueOf(valueOf2));
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            i.f(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
            this.f38256a = stringBuffer2;
        }
        str = null;
        this.f38259d = str;
        if (th2 != null) {
            valueOf = null;
        } else if (th2.getCause() == null) {
            valueOf = th2.toString();
        } else {
            valueOf = String.valueOf(th2.getCause());
        }
        this.f38260e = valueOf;
        if (th2 != null) {
            JSONArray jSONArray = new JSONArray();
            while (th2 != null && th2 != str2) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                i.f(stackTrace, "t.stackTrace");
                int length = stackTrace.length;
                int i6 = 0;
                while (i6 < length) {
                    StackTraceElement stackTraceElement = stackTrace[i6];
                    i6++;
                    jSONArray.put(stackTraceElement.toString());
                }
                str2 = th2;
                th2 = th2.getCause();
            }
            str2 = jSONArray.toString();
        }
        this.f = str2;
        Long valueOf22 = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f38261g = valueOf22;
        StringBuffer stringBuffer3 = new StringBuffer();
        int ordinal2 = enumC0649a.ordinal();
        stringBuffer3.append(ordinal2 == 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
        stringBuffer3.append(String.valueOf(valueOf22));
        stringBuffer3.append(".json");
        String stringBuffer22 = stringBuffer3.toString();
        i.f(stringBuffer22, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f38256a = stringBuffer22;
    }

    public a(String str, String str2) {
        this.f38257b = EnumC0649a.AnrReport;
        e0 e0Var = e0.f36453a;
        Context a10 = p.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f38259d = str3;
        this.f38260e = str;
        this.f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f38261g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        i.f(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f38256a = stringBuffer2;
    }

    public a(File file) {
        EnumC0649a enumC0649a;
        String name = file.getName();
        i.f(name, "file.name");
        this.f38256a = name;
        if (n.H0(name, "crash_log_")) {
            enumC0649a = EnumC0649a.CrashReport;
        } else if (n.H0(name, "shield_log_")) {
            enumC0649a = EnumC0649a.CrashShield;
        } else if (n.H0(name, "thread_check_log_")) {
            enumC0649a = EnumC0649a.ThreadCheck;
        } else if (n.H0(name, "analysis_log_")) {
            enumC0649a = EnumC0649a.Analysis;
        } else if (n.H0(name, "anr_log_")) {
            enumC0649a = EnumC0649a.AnrReport;
        } else {
            enumC0649a = EnumC0649a.Unknown;
        }
        this.f38257b = enumC0649a;
        JSONObject T = sp.b.T(name);
        if (T != null) {
            this.f38261g = Long.valueOf(T.optLong(ServerValues.NAME_OP_TIMESTAMP, 0L));
            this.f38259d = T.optString("app_version", null);
            this.f38260e = T.optString("reason", null);
            this.f = T.optString("callstack", null);
            this.f38258c = T.optJSONArray("feature_names");
        }
    }
}
