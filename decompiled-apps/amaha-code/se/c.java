package se;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import hd.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import nd.z;
import org.json.JSONException;
import org.json.JSONObject;
import ue.a;
import v9.o;
import ya.k;
import ya.v;
/* compiled from: FirebaseInstallations.java */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f31470m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final sc.e f31471a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.c f31472b;

    /* renamed from: c  reason: collision with root package name */
    public final ue.c f31473c;

    /* renamed from: d  reason: collision with root package name */
    public final j f31474d;

    /* renamed from: e  reason: collision with root package name */
    public final l<ue.b> f31475e;
    public final h f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f31476g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f31477h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f31478i;

    /* renamed from: j  reason: collision with root package name */
    public String f31479j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f31480k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f31481l;

    static {
        new AtomicInteger(1);
    }

    public c() {
        throw null;
    }

    public c(sc.e eVar, re.b bVar, ExecutorService executorService, id.h hVar) {
        eVar.b();
        ve.c cVar = new ve.c(eVar.f31432a, bVar);
        ue.c cVar2 = new ue.c(eVar);
        j a10 = j.a();
        l<ue.b> lVar = new l<>(new hd.d(2, eVar));
        h hVar2 = new h();
        this.f31476g = new Object();
        this.f31480k = new HashSet();
        this.f31481l = new ArrayList();
        this.f31471a = eVar;
        this.f31472b = cVar;
        this.f31473c = cVar2;
        this.f31474d = a10;
        this.f31475e = lVar;
        this.f = hVar2;
        this.f31477h = executorService;
        this.f31478i = hVar;
    }

    @Override // se.d
    public final v a() {
        f();
        ya.i iVar = new ya.i();
        b(new e(this.f31474d, iVar));
        this.f31477h.execute(new b(this, false, 1));
        return iVar.f38392a;
    }

    public final void b(i iVar) {
        synchronized (this.f31476g) {
            this.f31481l.add(iVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r3 = g(r2);
        r5 = r7.f31473c;
        r6 = new ue.a.C0569a(r2);
        r6.f34032a = r3;
        r6.b(3);
        r2 = r6.a();
        r5.b(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        ue.a c10;
        synchronized (f31470m) {
            sc.e eVar = this.f31471a;
            eVar.b();
            z b10 = z.b(eVar.f31432a);
            c10 = this.f31473c.c();
            int i6 = c10.f34027c;
            boolean z11 = true;
            if (i6 != 2 && i6 != 1) {
                z11 = false;
            }
            if (b10 != null) {
                b10.k();
            }
        }
        if (z10) {
            a.C0569a c0569a = new a.C0569a(c10);
            c0569a.f34034c = null;
            c10 = c0569a.a();
        }
        j(c10);
        this.f31478i.execute(new b(this, z10, 0));
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r2v14, types: [ve.b] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final ue.a d(ue.a aVar) {
        String str;
        String str2;
        int responseCode;
        boolean z10;
        String str3;
        String str4;
        sc.e eVar = this.f31471a;
        eVar.b();
        String str5 = eVar.f31434c.f31444a;
        eVar.b();
        String str6 = eVar.f31434c.f31449g;
        String str7 = aVar.f34029e;
        ve.c cVar = this.f31472b;
        ve.e eVar2 = cVar.f34989c;
        String str8 = "Firebase Installations Service is unavailable. Please try again later.";
        if (eVar2.b()) {
            ?? r11 = 1;
            URL a10 = ve.c.a(String.format("projects/%s/installations/%s/authTokens:generate", str6, aVar.f34026b));
            int i6 = 0;
            ve.b bVar = str6;
            while (i6 <= r11) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, str5);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.addRequestProperty("Authorization", "FIS_v2 " + str7);
                        c10.setDoOutput(r11);
                        ve.c.h(c10);
                        responseCode = c10.getResponseCode();
                        eVar2.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                    if (z10) {
                        bVar = ve.c.f(c10);
                        str = str8;
                    } else {
                        ve.c.b(c10, null, str5, bVar);
                        if (responseCode != 401 && responseCode != 404) {
                            if (responseCode != 429) {
                                if (responseCode < 500 || responseCode >= 600) {
                                    try {
                                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                        Long l2 = 0L;
                                        if (l2 == null) {
                                            str4 = " tokenExpirationTimestamp";
                                        } else {
                                            str4 = "";
                                        }
                                        if (str4.isEmpty()) {
                                            str = str8;
                                            bVar = new ve.b(null, l2.longValue(), 2);
                                        } else {
                                            throw new IllegalStateException("Missing required properties:".concat(str4));
                                        }
                                    } catch (IOException | AssertionError unused2) {
                                        str = str8;
                                        str2 = str;
                                        bVar = bVar;
                                        c10.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                        i6++;
                                        str8 = str2;
                                        r11 = 1;
                                        bVar = bVar;
                                    }
                                }
                                str2 = str8;
                                bVar = bVar;
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i6++;
                                str8 = str2;
                                r11 = 1;
                                bVar = bVar;
                            } else {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                        } else {
                            str = str8;
                            Long l10 = 0L;
                            if (l10 == null) {
                                str3 = " tokenExpirationTimestamp";
                            } else {
                                str3 = "";
                            }
                            if (str3.isEmpty()) {
                                bVar = new ve.b(null, l10.longValue(), 3);
                            } else {
                                str2 = str;
                                try {
                                    throw new IllegalStateException("Missing required properties:".concat(str3));
                                    break;
                                } catch (IOException | AssertionError unused3) {
                                    continue;
                                }
                            }
                        }
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int d10 = v.h.d(bVar.f34984c);
                    if (d10 != 0) {
                        if (d10 != 1) {
                            if (d10 == 2) {
                                k(null);
                                a.C0569a c0569a = new a.C0569a(aVar);
                                c0569a.b(2);
                                return c0569a.a();
                            }
                            throw new FirebaseInstallationsException(str);
                        }
                        a.C0569a h10 = aVar.h();
                        h10.f34037g = "BAD CONFIG";
                        h10.b(5);
                        return h10.a();
                    }
                    j jVar = this.f31474d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f31490a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    a.C0569a c0569a2 = new a.C0569a(aVar);
                    c0569a2.f34034c = bVar.f34982a;
                    c0569a2.f34036e = Long.valueOf(bVar.f34983b);
                    c0569a2.f = Long.valueOf(seconds);
                    return c0569a2.a();
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            throw new FirebaseInstallationsException(str8);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void e(ue.a aVar) {
        synchronized (f31470m) {
            sc.e eVar = this.f31471a;
            eVar.b();
            z b10 = z.b(eVar.f31432a);
            this.f31473c.b(aVar);
            if (b10 != null) {
                b10.k();
            }
        }
    }

    public final void f() {
        sc.e eVar = this.f31471a;
        eVar.b();
        o.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", eVar.f31434c.f31445b);
        eVar.b();
        o.f("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", eVar.f31434c.f31449g);
        eVar.b();
        o.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", eVar.f31434c.f31444a);
        eVar.b();
        String str = eVar.f31434c.f31445b;
        Pattern pattern = j.f31488c;
        o.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        eVar.b();
        o.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f31488c.matcher(eVar.f31434c.f31444a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f31433b) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g(ue.a aVar) {
        String a10;
        sc.e eVar = this.f31471a;
        eVar.b();
        if (!eVar.f31433b.equals("CHIME_ANDROID_SDK")) {
            sc.e eVar2 = this.f31471a;
            eVar2.b();
        }
        boolean z10 = true;
        if (aVar.f34027c != 1) {
            z10 = false;
        }
        if (z10) {
            ue.b bVar = this.f31475e.get();
            synchronized (bVar.f34039a) {
                a10 = bVar.a();
                if (a10 == null) {
                    a10 = bVar.b();
                }
            }
            if (TextUtils.isEmpty(a10)) {
                this.f.getClass();
                return h.a();
            }
            return a10;
        }
        this.f.getClass();
        return h.a();
    }

    @Override // se.d
    public final v getId() {
        String str;
        f();
        synchronized (this) {
            str = this.f31479j;
        }
        if (str != null) {
            return k.e(str);
        }
        ya.i iVar = new ya.i();
        b(new f(iVar));
        v vVar = iVar.f38392a;
        this.f31477h.execute(new je.o(7, this));
        return vVar;
    }

    public final ue.a h(ue.a aVar) {
        int responseCode;
        boolean z10;
        ve.a e10;
        String str = aVar.f34026b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ue.b bVar = this.f31475e.get();
            synchronized (bVar.f34039a) {
                String[] strArr = ue.b.f34038c;
                int i6 = 0;
                while (true) {
                    if (i6 >= 4) {
                        break;
                    }
                    String str3 = strArr[i6];
                    String str4 = bVar.f34040b;
                    String string = bVar.f34039a.getString("|T|" + str4 + "|" + str3, null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            try {
                                str2 = new JSONObject(string).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            str2 = string;
                        }
                    } else {
                        i6++;
                    }
                }
            }
        }
        ve.c cVar = this.f31472b;
        sc.e eVar = this.f31471a;
        eVar.b();
        String str5 = eVar.f31434c.f31444a;
        String str6 = aVar.f34026b;
        sc.e eVar2 = this.f31471a;
        eVar2.b();
        String str7 = eVar2.f31434c.f31449g;
        sc.e eVar3 = this.f31471a;
        eVar3.b();
        String str8 = eVar3.f31434c.f31445b;
        ve.e eVar4 = cVar.f34989c;
        if (eVar4.b()) {
            URL a10 = ve.c.a(String.format("projects/%s/installations", str7));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = cVar.c(a10, str5);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        ve.c.g(c10, str6, str8);
                        responseCode = c10.getResponseCode();
                        eVar4.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } finally {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (z10) {
                    e10 = ve.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    ve.c.b(c10, str8, str5, str7);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            try {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ve.a aVar2 = new ve.a(null, null, null, null, 2);
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                e10 = aVar2;
                            } catch (IOException | AssertionError unused3) {
                            }
                        }
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int d10 = v.h.d(e10.f34981e);
                if (d10 != 0) {
                    if (d10 == 1) {
                        a.C0569a h10 = aVar.h();
                        h10.f34037g = "BAD CONFIG";
                        h10.b(5);
                        return h10.a();
                    }
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str9 = e10.f34978b;
                String str10 = e10.f34979c;
                j jVar = this.f31474d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f31490a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                String b10 = e10.f34980d.b();
                long c11 = e10.f34980d.c();
                a.C0569a c0569a = new a.C0569a(aVar);
                c0569a.f34032a = str9;
                c0569a.b(4);
                c0569a.f34034c = b10;
                c0569a.f34035d = str10;
                c0569a.f34036e = Long.valueOf(c11);
                c0569a.f = Long.valueOf(seconds);
                return c0569a.a();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void i(Exception exc) {
        synchronized (this.f31476g) {
            Iterator it = this.f31481l.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void j(ue.a aVar) {
        synchronized (this.f31476g) {
            Iterator it = this.f31481l.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).b(aVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void k(String str) {
        this.f31479j = str;
    }

    public final synchronized void l(ue.a aVar, ue.a aVar2) {
        if (this.f31480k.size() != 0 && !TextUtils.equals(aVar.f34026b, aVar2.f34026b)) {
            Iterator it = this.f31480k.iterator();
            while (it.hasNext()) {
                ((te.a) it.next()).a();
            }
        }
    }
}
