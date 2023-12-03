package nd;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.c;
import nd.f;
import pd.b;
import pd.b0;
import pd.c;
import pd.h;
import pd.k;
import pd.l;
import pd.v;
/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: q  reason: collision with root package name */
    public static final w5.d0 f26111q = new w5.d0(5);

    /* renamed from: a  reason: collision with root package name */
    public final Context f26112a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f26113b;

    /* renamed from: c  reason: collision with root package name */
    public final z f26114c;

    /* renamed from: d  reason: collision with root package name */
    public final od.h f26115d;

    /* renamed from: e  reason: collision with root package name */
    public final g f26116e;
    public final h0 f;

    /* renamed from: g  reason: collision with root package name */
    public final sd.b f26117g;

    /* renamed from: h  reason: collision with root package name */
    public final a f26118h;

    /* renamed from: i  reason: collision with root package name */
    public final od.c f26119i;

    /* renamed from: j  reason: collision with root package name */
    public final kd.a f26120j;

    /* renamed from: k  reason: collision with root package name */
    public final ld.a f26121k;

    /* renamed from: l  reason: collision with root package name */
    public final l0 f26122l;

    /* renamed from: m  reason: collision with root package name */
    public c0 f26123m;

    /* renamed from: n  reason: collision with root package name */
    public final ya.i<Boolean> f26124n = new ya.i<>();

    /* renamed from: o  reason: collision with root package name */
    public final ya.i<Boolean> f26125o = new ya.i<>();

    /* renamed from: p  reason: collision with root package name */
    public final ya.i<Void> f26126p = new ya.i<>();

    public t(Context context, g gVar, h0 h0Var, d0 d0Var, sd.b bVar, z zVar, a aVar, od.h hVar, od.c cVar, l0 l0Var, kd.a aVar2, ld.a aVar3) {
        new AtomicBoolean(false);
        this.f26112a = context;
        this.f26116e = gVar;
        this.f = h0Var;
        this.f26113b = d0Var;
        this.f26117g = bVar;
        this.f26114c = zVar;
        this.f26118h = aVar;
        this.f26115d = hVar;
        this.f26119i = cVar;
        this.f26120j = aVar2;
        this.f26121k = aVar3;
        this.f26122l = l0Var;
    }

    public static void a(t tVar, String str) {
        int i6;
        int i10;
        Integer num;
        tVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String r = defpackage.c.r("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", r, null);
        }
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "18.3.5");
        h0 h0Var = tVar.f;
        String str2 = h0Var.f26069c;
        a aVar = tVar.f26118h;
        String str3 = aVar.f;
        String str4 = aVar.f26021g;
        String c10 = h0Var.c();
        if (aVar.f26019d != null) {
            i6 = 4;
        } else {
            i6 = 1;
        }
        pd.y yVar = new pd.y(str2, str3, str4, c10, defpackage.e.c(i6), aVar.f26022h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        pd.a0 a0Var = new pd.a0(str5, str6, f.j());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f.a aVar2 = f.a.UNKNOWN;
        String str7 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str7);
        f.a aVar3 = f.a.UNKNOWN;
        if (isEmpty) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            f.a aVar4 = (f.a) f.a.f26053v.get(str7.toLowerCase(locale));
            if (aVar4 != null) {
                aVar3 = aVar4;
            }
        }
        int ordinal = aVar3.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long g5 = f.g();
        boolean i11 = f.i();
        int d10 = f.d();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        tVar.f26120j.c(str, format, currentTimeMillis, new pd.x(yVar, a0Var, new pd.z(ordinal, str8, availableProcessors, g5, blockCount, i11, d10, str9, str10)));
        tVar.f26119i.a(str);
        l0 l0Var = tVar.f26122l;
        a0 a0Var2 = l0Var.f26083a;
        a0Var2.getClass();
        Charset charset = pd.b0.f28231a;
        b.a aVar5 = new b.a();
        aVar5.f28224a = "18.3.5";
        a aVar6 = a0Var2.f26026c;
        String str11 = aVar6.f26016a;
        if (str11 != null) {
            aVar5.f28225b = str11;
            h0 h0Var2 = a0Var2.f26025b;
            String c11 = h0Var2.c();
            if (c11 != null) {
                aVar5.f28227d = c11;
                String str12 = aVar6.f;
                if (str12 != null) {
                    aVar5.f28228e = str12;
                    String str13 = aVar6.f26021g;
                    if (str13 != null) {
                        aVar5.f = str13;
                        aVar5.f28226c = 4;
                        h.a aVar7 = new h.a();
                        aVar7.f28272e = Boolean.FALSE;
                        aVar7.f28270c = Long.valueOf(currentTimeMillis);
                        if (str != null) {
                            aVar7.f28269b = str;
                            String str14 = a0.f26023g;
                            if (str14 != null) {
                                aVar7.f28268a = str14;
                                String str15 = h0Var2.f26069c;
                                if (str15 != null) {
                                    String c12 = h0Var2.c();
                                    kd.c cVar = aVar6.f26022h;
                                    if (cVar.f23254b == null) {
                                        cVar.f23254b = new c.a(cVar);
                                    }
                                    c.a aVar8 = cVar.f23254b;
                                    String str16 = aVar8.f23255a;
                                    if (aVar8 == null) {
                                        cVar.f23254b = new c.a(cVar);
                                    }
                                    aVar7.f = new pd.i(str15, str12, str13, c12, str16, cVar.f23254b.f23256b);
                                    v.a aVar9 = new v.a();
                                    aVar9.f28369a = 3;
                                    aVar9.f28370b = str5;
                                    aVar9.f28371c = str6;
                                    aVar9.f28372d = Boolean.valueOf(f.j());
                                    aVar7.f28274h = aVar9.a();
                                    StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                    if (TextUtils.isEmpty(str7) || (num = (Integer) a0.f.get(str7.toLowerCase(locale))) == null) {
                                        i10 = 7;
                                    } else {
                                        i10 = num.intValue();
                                    }
                                    int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                    long g10 = f.g();
                                    long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                    boolean i12 = f.i();
                                    int d11 = f.d();
                                    k.a aVar10 = new k.a();
                                    aVar10.f28292a = Integer.valueOf(i10);
                                    aVar10.f28293b = str8;
                                    aVar10.f28294c = Integer.valueOf(availableProcessors2);
                                    aVar10.f28295d = Long.valueOf(g10);
                                    aVar10.f28296e = Long.valueOf(blockCount2);
                                    aVar10.f = Boolean.valueOf(i12);
                                    aVar10.f28297g = Integer.valueOf(d11);
                                    aVar10.f28298h = str9;
                                    aVar10.f28299i = str10;
                                    aVar7.f28275i = aVar10.a();
                                    aVar7.f28277k = 3;
                                    aVar5.f28229g = aVar7.a();
                                    pd.b a10 = aVar5.a();
                                    sd.b bVar = l0Var.f26084b.f31457b;
                                    b0.e eVar = a10.f28222h;
                                    if (eVar == null) {
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                            return;
                                        }
                                        return;
                                    }
                                    String g11 = eVar.g();
                                    try {
                                        sd.a.f.getClass();
                                        ce.c cVar2 = qd.a.f29523a;
                                        cVar2.getClass();
                                        StringWriter stringWriter = new StringWriter();
                                        try {
                                            cVar2.a(a10, stringWriter);
                                        } catch (IOException unused) {
                                        }
                                        sd.a.e(bVar.b(g11, "report"), stringWriter.toString());
                                        File b10 = bVar.b(g11, "start-time");
                                        long i13 = eVar.i();
                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b10), sd.a.f31452d);
                                        outputStreamWriter.write("");
                                        b10.setLastModified(i13 * 1000);
                                        outputStreamWriter.close();
                                        return;
                                    } catch (IOException e10) {
                                        String r10 = defpackage.c.r("Could not persist report for session ", g11);
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", r10, e10);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new NullPointerException("Null identifier");
                            }
                            throw new NullPointerException("Null generator");
                        }
                        throw new NullPointerException("Null identifier");
                    }
                    throw new NullPointerException("Null displayVersion");
                }
                throw new NullPointerException("Null buildVersion");
            }
            throw new NullPointerException("Null installationUuid");
        }
        throw new NullPointerException("Null gmpAppId");
    }

    public static ya.v b(t tVar) {
        boolean z10;
        ya.v c10;
        tVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : sd.b.e(tVar.f26117g.f31460b.listFiles(f26111q))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    c10 = ya.k.e(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    c10 = ya.k.c(new ScheduledThreadPoolExecutor(1), new s(tVar, parseLong));
                }
                arrayList.add(c10);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return ya.k.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f1 A[LOOP:1: B:124:0x03f1->B:129:0x040e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, ud.f fVar) {
        ArrayList arrayList;
        sd.a aVar;
        kd.a aVar2;
        Object obj;
        boolean z11;
        int size;
        int size2;
        File file;
        JsonReader jsonReader;
        boolean z12;
        List<ApplicationExitInfo> historicalProcessExitReasons;
        String applicationExitInfo;
        String str;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        String str2;
        sd.a aVar3;
        pd.c0<b0.a.AbstractC0471a> c0Var;
        String str3;
        boolean z13;
        String str4;
        InputStream traceInputStream;
        long timestamp2;
        int reason2;
        t tVar = this;
        l0 l0Var = tVar.f26122l;
        sd.a aVar4 = l0Var.f26084b;
        aVar4.getClass();
        ArrayList arrayList2 = new ArrayList(new TreeSet(sd.b.e(aVar4.f31457b.f31461c.list())).descendingSet());
        if (arrayList2.size() <= z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str5 = (String) arrayList2.get(z10 ? 1 : 0);
        boolean z14 = ((ud.d) fVar).b().f34001b.f34006b;
        sd.a aVar5 = l0Var.f26084b;
        if (z14) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                historicalProcessExitReasons = ((ActivityManager) tVar.f26112a.getSystemService(Constants.SCREEN_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    sd.b bVar = tVar.f26117g;
                    od.c cVar = new od.c(bVar, str5);
                    od.e eVar = new od.e(bVar);
                    od.h hVar = new od.h(str5, bVar, tVar.f26116e);
                    hVar.f27378d.f27380a.getReference().b(eVar.b(str5, false));
                    hVar.f27379e.f27380a.getReference().b(eVar.b(str5, true));
                    hVar.f.set(eVar.c(str5), false);
                    long lastModified = aVar5.f31457b.b(str5, "start-time").lastModified();
                    for (ApplicationExitInfo applicationExitInfo2 : historicalProcessExitReasons) {
                        timestamp2 = applicationExitInfo2.getTimestamp();
                        if (timestamp2 < lastModified) {
                            break;
                        }
                        reason2 = applicationExitInfo2.getReason();
                        if (reason2 == 6) {
                            break;
                        }
                    }
                    applicationExitInfo2 = null;
                    if (applicationExitInfo2 != null) {
                        try {
                            traceInputStream = applicationExitInfo2.getTraceInputStream();
                        } catch (IOException e10) {
                            StringBuilder sb2 = new StringBuilder("Could not get input trace in application exit info: ");
                            applicationExitInfo = applicationExitInfo2.toString();
                            sb2.append(applicationExitInfo);
                            sb2.append(" Error: ");
                            sb2.append(e10);
                            Log.w("FirebaseCrashlytics", sb2.toString(), null);
                        }
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = traceInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                            str = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            c.a aVar6 = new c.a();
                            importance = applicationExitInfo2.getImportance();
                            aVar6.f28243d = Integer.valueOf(importance);
                            processName = applicationExitInfo2.getProcessName();
                            String str6 = "Null processName";
                            if (processName == null) {
                                aVar6.f28241b = processName;
                                reason = applicationExitInfo2.getReason();
                                aVar6.f28242c = Integer.valueOf(reason);
                                timestamp = applicationExitInfo2.getTimestamp();
                                aVar6.f28245g = Long.valueOf(timestamp);
                                pid = applicationExitInfo2.getPid();
                                aVar6.f28240a = Integer.valueOf(pid);
                                pss = applicationExitInfo2.getPss();
                                aVar6.f28244e = Long.valueOf(pss);
                                rss = applicationExitInfo2.getRss();
                                aVar6.f = Long.valueOf(rss);
                                aVar6.f28246h = str;
                                pd.c a10 = aVar6.a();
                                a0 a0Var = l0Var.f26083a;
                                int i10 = a0Var.f26024a.getResources().getConfiguration().orientation;
                                l.a aVar7 = new l.a();
                                aVar7.f28306b = "anr";
                                long j10 = a10.f28237g;
                                aVar7.f28305a = Long.valueOf(j10);
                                arrayList = arrayList2;
                                String str7 = "";
                                if (((ud.d) a0Var.f26028e).b().f34001b.f34007c) {
                                    a aVar8 = a0Var.f26026c;
                                    if (aVar8.f26018c.size() > 0) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator<d> it = aVar8.f26018c.iterator();
                                        while (it.hasNext()) {
                                            Iterator<d> it2 = it;
                                            d next = it.next();
                                            String str8 = next.f26037a;
                                            if (str8 != null) {
                                                String str9 = str6;
                                                String str10 = next.f26038b;
                                                if (str10 != null) {
                                                    String str11 = next.f26039c;
                                                    if (str11 != null) {
                                                        arrayList3.add(new pd.d(str10, str8, str11));
                                                        it = it2;
                                                        str6 = str9;
                                                        aVar5 = aVar5;
                                                    } else {
                                                        throw new NullPointerException("Null buildId");
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null arch");
                                                }
                                            } else {
                                                throw new NullPointerException("Null libraryName");
                                            }
                                        }
                                        str2 = str6;
                                        aVar3 = aVar5;
                                        c0Var = new pd.c0<>(arrayList3);
                                        c.a aVar9 = new c.a();
                                        aVar9.f28243d = Integer.valueOf(a10.f28235d);
                                        str3 = a10.f28233b;
                                        if (str3 == null) {
                                            aVar9.f28241b = str3;
                                            aVar9.f28242c = Integer.valueOf(a10.f28234c);
                                            aVar9.f28245g = Long.valueOf(j10);
                                            aVar9.f28240a = Integer.valueOf(a10.f28232a);
                                            aVar9.f28244e = Long.valueOf(a10.f28236e);
                                            aVar9.f = Long.valueOf(a10.f);
                                            aVar9.f28246h = a10.f28238h;
                                            aVar9.f28247i = c0Var;
                                            pd.c a11 = aVar9.a();
                                            if (a11.f28235d != 100) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            Boolean valueOf = Boolean.valueOf(z13);
                                            Integer valueOf2 = Integer.valueOf(i10);
                                            Long l2 = 0L;
                                            if (l2 != null) {
                                                str4 = "";
                                            } else {
                                                str4 = " address";
                                            }
                                            if (str4.isEmpty()) {
                                                pd.n nVar = new pd.n(null, null, a11, new pd.q("0", "0", l2.longValue()), a0Var.a());
                                                if (valueOf2 == null) {
                                                    str7 = "".concat(" uiOrientation");
                                                }
                                                if (str7.isEmpty()) {
                                                    aVar7.f28307c = new pd.m(nVar, null, null, valueOf, valueOf2.intValue());
                                                    aVar7.f28308d = a0Var.b(i10);
                                                    pd.l a12 = aVar7.a();
                                                    String r = defpackage.c.r("Persisting anr for session ", str5);
                                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                        Log.d("FirebaseCrashlytics", r, null);
                                                    }
                                                    aVar = aVar3;
                                                    aVar.c(l0.a(a12, cVar, hVar), str5, true);
                                                } else {
                                                    throw new IllegalStateException("Missing required properties:".concat(str7));
                                                }
                                            } else {
                                                throw new IllegalStateException("Missing required properties:".concat(str4));
                                            }
                                        } else {
                                            throw new NullPointerException(str2);
                                        }
                                    }
                                }
                                str2 = "Null processName";
                                aVar3 = aVar5;
                                c0Var = null;
                                c.a aVar92 = new c.a();
                                aVar92.f28243d = Integer.valueOf(a10.f28235d);
                                str3 = a10.f28233b;
                                if (str3 == null) {
                                }
                            } else {
                                throw new NullPointerException("Null processName");
                            }
                        }
                        str = null;
                        c.a aVar62 = new c.a();
                        importance = applicationExitInfo2.getImportance();
                        aVar62.f28243d = Integer.valueOf(importance);
                        processName = applicationExitInfo2.getProcessName();
                        String str62 = "Null processName";
                        if (processName == null) {
                        }
                    } else {
                        String r10 = defpackage.c.r("No relevant ApplicationExitInfo occurred during session: ", str5);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", r10, null);
                        }
                        arrayList = arrayList2;
                        aVar = aVar5;
                        aVar2 = tVar.f26120j;
                        if (aVar2.d(str5)) {
                            String r11 = defpackage.c.r("Finalizing native report for session ", str5);
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", r11, null);
                            }
                            aVar2.a(str5).getClass();
                            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str5, null);
                        }
                        if (z10 == 0) {
                            obj = (String) arrayList.get(0);
                        } else {
                            obj = null;
                        }
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        sd.b bVar2 = aVar.f31457b;
                        bVar2.getClass();
                        File file2 = bVar2.f31459a;
                        sd.b.a(new File(file2, ".com.google.firebase.crashlytics"));
                        sd.b.a(new File(file2, ".com.google.firebase.crashlytics-ndk"));
                        if (Build.VERSION.SDK_INT < 28) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            sd.b.a(new File(file2, ".com.google.firebase.crashlytics.files.v1"));
                        }
                        NavigableSet<String> descendingSet = new TreeSet(sd.b.e(aVar.f31457b.f31461c.list())).descendingSet();
                        if (obj != null) {
                            descendingSet.remove(obj);
                        }
                        size = descendingSet.size();
                        File file3 = bVar2.f31461c;
                        if (size > 8) {
                            while (descendingSet.size() > 8) {
                                String str12 = (String) descendingSet.last();
                                String r12 = defpackage.c.r("Removing session over cap: ", str12);
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", r12, null);
                                }
                                sd.b.d(new File(file3, str12));
                                descendingSet.remove(str12);
                            }
                        }
                        loop2: for (String str13 : descendingSet) {
                            String r13 = defpackage.c.r("Finalizing report for session ", str13);
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", r13, null);
                            }
                            w5.d0 d0Var = sd.a.f31455h;
                            File file4 = new File(file3, str13);
                            file4.mkdirs();
                            List e11 = sd.b.e(file4.listFiles(d0Var));
                            if (e11.isEmpty()) {
                                String m10 = defpackage.b.m("Session ", str13, " has no events.");
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", m10, null);
                                }
                            } else {
                                Collections.sort(e11);
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it3 = e11.iterator();
                                while (true) {
                                    boolean z15 = false;
                                    while (true) {
                                        boolean hasNext = it3.hasNext();
                                        qd.a aVar10 = sd.a.f;
                                        if (hasNext) {
                                            File file5 = (File) it3.next();
                                            try {
                                                String d10 = sd.a.d(file5);
                                                aVar10.getClass();
                                                try {
                                                    jsonReader = new JsonReader(new StringReader(d10));
                                                } catch (IllegalStateException e12) {
                                                    throw new IOException(e12);
                                                }
                                            } catch (IOException e13) {
                                                Log.w("FirebaseCrashlytics", "Could not add event to report for " + file5, e13);
                                            }
                                            try {
                                                pd.l d11 = qd.a.d(jsonReader);
                                                jsonReader.close();
                                                arrayList4.add(d11);
                                                if (!z15) {
                                                    String name = file5.getName();
                                                    if (name.startsWith("event") && name.endsWith("_")) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (!z12) {
                                                        break;
                                                    }
                                                }
                                                z15 = true;
                                            } finally {
                                                break loop2;
                                            }
                                        } else if (arrayList4.isEmpty()) {
                                            Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str13, null);
                                        } else {
                                            String c10 = new od.e(bVar2).c(str13);
                                            File b10 = bVar2.b(str13, "report");
                                            try {
                                                String d12 = sd.a.d(b10);
                                                aVar10.getClass();
                                                pd.b i11 = qd.a.g(d12).i(c10, currentTimeMillis, z15);
                                                pd.c0<b0.e.d> c0Var2 = new pd.c0<>(arrayList4);
                                                b0.e eVar2 = i11.f28222h;
                                                if (eVar2 != null) {
                                                    b.a aVar11 = new b.a(i11);
                                                    h.a l10 = eVar2.l();
                                                    l10.f28276j = c0Var2;
                                                    aVar11.f28229g = l10.a();
                                                    pd.b a13 = aVar11.a();
                                                    b0.e eVar3 = a13.f28222h;
                                                    if (eVar3 != null) {
                                                        if (z15) {
                                                            file = new File(bVar2.f31463e, eVar3.g());
                                                        } else {
                                                            file = new File(bVar2.f31462d, eVar3.g());
                                                        }
                                                        ce.c cVar2 = qd.a.f29523a;
                                                        cVar2.getClass();
                                                        StringWriter stringWriter = new StringWriter();
                                                        try {
                                                            cVar2.a(a13, stringWriter);
                                                        } catch (IOException unused) {
                                                        }
                                                        sd.a.e(file, stringWriter.toString());
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                                    break;
                                                }
                                            } catch (IOException e14) {
                                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + b10, e14);
                                            }
                                        }
                                    }
                                }
                            }
                            sd.b.d(new File(file3, str13));
                        }
                        ((ud.d) aVar.f31458c).b().f34000a.getClass();
                        ArrayList b11 = aVar.b();
                        size2 = b11.size();
                        if (size2 <= 4) {
                            for (File file6 : b11.subList(4, size2)) {
                                file6.delete();
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    arrayList = arrayList2;
                    aVar = aVar5;
                    String r14 = defpackage.c.r("No ApplicationExitInfo available. Session: ", str5);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", r14, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                aVar = aVar5;
                String p10 = defpackage.c.p("ANR feature enabled, but device is API ", i6);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", p10, null);
                }
            }
        } else {
            arrayList = arrayList2;
            aVar = aVar5;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        tVar = this;
        aVar2 = tVar.f26120j;
        if (aVar2.d(str5)) {
        }
        if (z10 == 0) {
        }
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        sd.b bVar22 = aVar.f31457b;
        bVar22.getClass();
        File file22 = bVar22.f31459a;
        sd.b.a(new File(file22, ".com.google.firebase.crashlytics"));
        sd.b.a(new File(file22, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT < 28) {
        }
        if (z11) {
        }
        NavigableSet<String> descendingSet2 = new TreeSet(sd.b.e(aVar.f31457b.f31461c.list())).descendingSet();
        if (obj != null) {
        }
        size = descendingSet2.size();
        File file32 = bVar22.f31461c;
        if (size > 8) {
        }
        loop2: while (r6.hasNext()) {
        }
        ((ud.d) aVar.f31458c).b().f34000a.getClass();
        ArrayList b112 = aVar.b();
        size2 = b112.size();
        if (size2 <= 4) {
        }
    }

    public final boolean d(ud.f fVar) {
        boolean z10;
        if (Boolean.TRUE.equals(this.f26116e.f26062d.get())) {
            c0 c0Var = this.f26123m;
            if (c0Var != null && c0Var.f26036e.get()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, fVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        sd.a aVar = this.f26122l.f26084b;
        aVar.getClass();
        NavigableSet descendingSet = new TreeSet(sd.b.e(aVar.f31457b.f31461c.list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            return (String) descendingSet.first();
        }
        return null;
    }

    public final ya.h f(ya.v vVar) {
        boolean z10;
        ya.v vVar2;
        ya.v vVar3;
        sd.b bVar = this.f26122l.f26084b.f31457b;
        if (sd.b.e(bVar.f31462d.listFiles()).isEmpty() && sd.b.e(bVar.f31463e.listFiles()).isEmpty() && sd.b.e(bVar.f.listFiles()).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        ya.i<Boolean> iVar = this.f26124n;
        if (!z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            iVar.d(Boolean.FALSE);
            return ya.k.e(null);
        }
        com.google.android.gms.internal.cast.w wVar = com.google.android.gms.internal.cast.w.A;
        wVar.h("Crash reports are available to be sent.");
        d0 d0Var = this.f26113b;
        if (d0Var.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            iVar.d(Boolean.FALSE);
            vVar3 = ya.k.e(Boolean.TRUE);
        } else {
            wVar.e("Automatic data collection is disabled.");
            wVar.h("Notifying that unsent reports are available.");
            iVar.d(Boolean.TRUE);
            synchronized (d0Var.f26041b) {
                vVar2 = d0Var.f26042c.f38392a;
            }
            ya.h onSuccessTask = vVar2.onSuccessTask(new tr.r());
            wVar.e("Waiting for send/deleteUnsentReports to be called.");
            ya.v vVar4 = this.f26125o.f38392a;
            ExecutorService executorService = o0.f26099a;
            ya.i iVar2 = new ya.i();
            m0 m0Var = new m0(1, iVar2);
            onSuccessTask.continueWith(m0Var);
            vVar4.continueWith(m0Var);
            vVar3 = iVar2.f38392a;
        }
        return vVar3.onSuccessTask(new o(this, vVar));
    }
}
