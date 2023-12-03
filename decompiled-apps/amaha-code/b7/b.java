package b7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import c7.e;
import c7.f;
import c7.g;
import c7.i;
import c7.j;
import c7.k;
import c7.o;
import c7.p;
import ce.c;
import ce.d;
import d7.h;
import d7.m;
import d7.n;
import e7.l;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final c f3953a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f3954b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3955c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f3956d;

    /* renamed from: e  reason: collision with root package name */
    public final m7.a f3957e;
    public final m7.a f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3958g;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f3959a;

        /* renamed from: b  reason: collision with root package name */
        public final j f3960b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3961c;

        public a(URL url, j jVar, String str) {
            this.f3959a = url;
            this.f3960b = jVar;
            this.f3961c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: b7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0076b {

        /* renamed from: a  reason: collision with root package name */
        public final int f3962a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f3963b;

        /* renamed from: c  reason: collision with root package name */
        public final long f3964c;

        public C0076b(int i6, URL url, long j10) {
            this.f3962a = i6;
            this.f3963b = url;
            this.f3964c = j10;
        }
    }

    public b(Context context, m7.a aVar, m7.a aVar2) {
        d dVar = new d();
        c7.b.f4992a.a(dVar);
        dVar.f5252d = true;
        this.f3953a = new c(dVar);
        this.f3955c = context;
        this.f3954b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = b7.a.f3948c;
        try {
            this.f3956d = new URL(str);
            this.f3957e = aVar2;
            this.f = aVar;
            this.f3958g = 130000;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(c.r("Invalid url: ", str), e10);
        }
    }

    @Override // e7.l
    public final e7.b a(e7.a aVar) {
        String str;
        Object apply;
        Integer num;
        String str2;
        String str3;
        f.a aVar2;
        long longValue;
        String str4;
        HashMap hashMap = new HashMap();
        for (n nVar : aVar.f13810a) {
            String g5 = nVar.g();
            if (!hashMap.containsKey(g5)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(nVar);
                hashMap.put(g5, arrayList);
            } else {
                ((List) hashMap.get(g5)).add(nVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n nVar2 = (n) ((List) entry.getValue()).get(0);
            p pVar = p.DEFAULT;
            Long valueOf = Long.valueOf(this.f.a());
            Long valueOf2 = Long.valueOf(this.f3957e.a());
            e eVar = new e(k.a.ANDROID_FIREBASE, new c7.c(Integer.valueOf(nVar2.f("sdk-version")), nVar2.a("model"), nVar2.a("hardware"), nVar2.a("device"), nVar2.a("product"), nVar2.a("os-uild"), nVar2.a("manufacturer"), nVar2.a("fingerprint"), nVar2.a("locale"), nVar2.a("country"), nVar2.a("mcc_mnc"), nVar2.a("application_build")));
            try {
                str2 = null;
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                num = null;
                str2 = (String) entry.getKey();
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                n nVar3 = (n) it2.next();
                m d10 = nVar3.d();
                Iterator it3 = it;
                a7.b bVar = d10.f12253a;
                Iterator it4 = it2;
                boolean equals = bVar.equals(new a7.b("proto"));
                byte[] bArr = d10.f12254b;
                if (equals) {
                    aVar2 = new f.a();
                    aVar2.f5050d = bArr;
                } else if (bVar.equals(new a7.b("json"))) {
                    String str5 = new String(bArr, Charset.forName("UTF-8"));
                    f.a aVar3 = new f.a();
                    aVar3.f5051e = str5;
                    aVar2 = aVar3;
                } else {
                    String c10 = h7.a.c("CctTransportBackend");
                    if (Log.isLoggable(c10, 5)) {
                        Log.w(c10, String.format("Received event of unsupported encoding %s. Skipping...", bVar));
                    }
                    it2 = it4;
                    it = it3;
                }
                aVar2.f5047a = Long.valueOf(nVar3.e());
                aVar2.f5049c = Long.valueOf(nVar3.h());
                String str6 = nVar3.b().get("tz-offset");
                if (str6 == null) {
                    longValue = 0;
                } else {
                    longValue = Long.valueOf(str6).longValue();
                }
                aVar2.f = Long.valueOf(longValue);
                aVar2.f5052g = new i(o.b.f5066u.get(nVar3.f("net-type")), o.a.f5064u.get(nVar3.f("mobile-subtype")));
                if (nVar3.c() != null) {
                    aVar2.f5048b = nVar3.c();
                }
                if (aVar2.f5047a != null) {
                    str4 = "";
                } else {
                    str4 = " eventTimeMs";
                }
                if (aVar2.f5049c == null) {
                    str4 = str4.concat(" eventUptimeMs");
                }
                if (aVar2.f == null) {
                    str4 = pl.a.f(str4, " timezoneOffsetSeconds");
                }
                if (str4.isEmpty()) {
                    arrayList3.add(new f(aVar2.f5047a.longValue(), aVar2.f5048b, aVar2.f5049c.longValue(), aVar2.f5050d, aVar2.f5051e, aVar2.f.longValue(), aVar2.f5052g));
                    it2 = it4;
                    it = it3;
                } else {
                    throw new IllegalStateException("Missing required properties:".concat(str4));
                }
            }
            Iterator it5 = it;
            if (valueOf != null) {
                str3 = "";
            } else {
                str3 = " requestTimeMs";
            }
            if (valueOf2 == null) {
                str3 = str3.concat(" requestUptimeMs");
            }
            if (str3.isEmpty()) {
                arrayList2.add(new g(valueOf.longValue(), valueOf2.longValue(), eVar, num, str2, arrayList3, pVar));
                it = it5;
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str3));
            }
        }
        int i6 = 5;
        c7.d dVar = new c7.d(arrayList2);
        byte[] bArr2 = aVar.f13811b;
        URL url = this.f3956d;
        if (bArr2 != null) {
            try {
                b7.a a10 = b7.a.a(bArr2);
                str = a10.f3952b;
                if (str == null) {
                    str = null;
                }
                String str7 = a10.f3951a;
                if (str7 != null) {
                    try {
                        url = new URL(str7);
                    } catch (MalformedURLException e10) {
                        throw new IllegalArgumentException("Invalid url: " + str7, e10);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                return new e7.b(3, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar4 = new a(url, dVar, str);
            f0.b bVar2 = new f0.b(7, this);
            do {
                apply = bVar2.apply(aVar4);
                C0076b c0076b = (C0076b) apply;
                URL url2 = c0076b.f3963b;
                if (url2 != null) {
                    h7.a.a("CctTransportBackend", "Following redirect to: %s", url2);
                    aVar4 = new a(c0076b.f3963b, aVar4.f3960b, aVar4.f3961c);
                } else {
                    aVar4 = null;
                }
                if (aVar4 == null) {
                    break;
                }
                i6--;
            } while (i6 >= 1);
            C0076b c0076b2 = (C0076b) apply;
            int i10 = c0076b2.f3962a;
            if (i10 == 200) {
                return new e7.b(1, c0076b2.f3964c);
            }
            if (i10 < 500 && i10 != 404) {
                if (i10 == 400) {
                    return new e7.b(4, -1L);
                }
                return new e7.b(3, -1L);
            }
            return new e7.b(2, -1L);
        } catch (IOException e11) {
            h7.a.b("CctTransportBackend", "Could not make request to the backend", e11);
            return new e7.b(2, -1L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
        if (c7.o.a.f5064u.get(r0) != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    @Override // e7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h b(n nVar) {
        int type;
        int subtype;
        Map<String, String> map;
        NetworkInfo activeNetworkInfo = this.f3954b.getActiveNetworkInfo();
        h.a i6 = nVar.i();
        int i10 = Build.VERSION.SDK_INT;
        Map<String, String> map2 = i6.f;
        if (map2 != null) {
            map2.put("sdk-version", String.valueOf(i10));
            i6.a("model", Build.MODEL);
            i6.a("hardware", Build.HARDWARE);
            i6.a("device", Build.DEVICE);
            i6.a("product", Build.PRODUCT);
            i6.a("os-uild", Build.ID);
            i6.a("manufacturer", Build.MANUFACTURER);
            i6.a("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            Map<String, String> map3 = i6.f;
            if (map3 != null) {
                map3.put("tz-offset", String.valueOf(offset));
                int i11 = -1;
                if (activeNetworkInfo == null) {
                    SparseArray<o.b> sparseArray = o.b.f5066u;
                    type = -1;
                } else {
                    type = activeNetworkInfo.getType();
                }
                Map<String, String> map4 = i6.f;
                if (map4 != null) {
                    map4.put("net-type", String.valueOf(type));
                    if (activeNetworkInfo == null) {
                        SparseArray<o.a> sparseArray2 = o.a.f5064u;
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            SparseArray<o.a> sparseArray3 = o.a.f5064u;
                            subtype = 100;
                        }
                        map = i6.f;
                        if (map == null) {
                            map.put("mobile-subtype", String.valueOf(subtype));
                            i6.a("country", Locale.getDefault().getCountry());
                            i6.a("locale", Locale.getDefault().getLanguage());
                            Context context = this.f3955c;
                            i6.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                            try {
                                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException e10) {
                                h7.a.b("CctTransportBackend", "Unable to find version code for package", e10);
                            }
                            i6.a("application_build", Integer.toString(i11));
                            return i6.b();
                        }
                        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                    }
                    subtype = 0;
                    map = i6.f;
                    if (map == null) {
                    }
                } else {
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
            } else {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
        } else {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }
}
