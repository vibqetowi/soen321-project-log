package ef;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import gf.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import lf.h;
import lf.k;
import lv.t;
/* compiled from: NetworkRequestMetricBuilder.java */
/* loaded from: classes.dex */
public final class d extends af.b implements hf.b {
    public static final df.a B = df.a.d();
    public boolean A;

    /* renamed from: u  reason: collision with root package name */
    public final List<hf.a> f13950u;

    /* renamed from: v  reason: collision with root package name */
    public final GaugeManager f13951v;

    /* renamed from: w  reason: collision with root package name */
    public final jf.e f13952w;

    /* renamed from: x  reason: collision with root package name */
    public final h.a f13953x;

    /* renamed from: y  reason: collision with root package name */
    public final WeakReference<hf.b> f13954y;

    /* renamed from: z  reason: collision with root package name */
    public String f13955z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(jf.e eVar) {
        super(r0);
        af.a a10 = af.a.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f13953x = h.s0();
        this.f13954y = new WeakReference<>(this);
        this.f13952w = eVar;
        this.f13951v = gaugeManager;
        this.f13950u = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static d c(jf.e eVar) {
        return new d(eVar);
    }

    @Override // hf.b
    public final void a(hf.a aVar) {
        if (aVar == null) {
            B.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        h.a aVar2 = this.f13953x;
        if (((h) aVar2.f10073v).k0() && !((h) aVar2.f10073v).q0()) {
            this.f13950u.add(aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        List unmodifiableList;
        boolean z10;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f13954y);
        unregisterForAppState();
        synchronized (this.f13950u) {
            ArrayList arrayList = new ArrayList();
            for (hf.a aVar : this.f13950u) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        k[] b10 = hf.a.b(unmodifiableList);
        if (b10 != null) {
            h.a aVar2 = this.f13953x;
            List asList = Arrays.asList(b10);
            aVar2.u();
            h.V((h) aVar2.f10073v, asList);
        }
        h r = this.f13953x.r();
        String str = this.f13955z;
        if (str != null) {
            if (g.f16490a.matcher(str).matches()) {
                z10 = false;
                if (z10) {
                    B.a("Dropping network request from a 'User-Agent' that is not allowed");
                    return;
                } else if (!this.A) {
                    jf.e eVar = this.f13952w;
                    eVar.C.execute(new androidx.emoji2.text.g(17, eVar, r, getAppState()));
                    this.A = true;
                    return;
                } else {
                    return;
                }
            }
        } else {
            Pattern pattern = g.f16490a;
        }
        z10 = true;
        if (z10) {
        }
    }

    public final void d(String str) {
        h.c cVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    cVar = h.c.OPTIONS;
                    break;
                case 1:
                    cVar = h.c.GET;
                    break;
                case 2:
                    cVar = h.c.PUT;
                    break;
                case 3:
                    cVar = h.c.HEAD;
                    break;
                case 4:
                    cVar = h.c.POST;
                    break;
                case 5:
                    cVar = h.c.PATCH;
                    break;
                case 6:
                    cVar = h.c.TRACE;
                    break;
                case 7:
                    cVar = h.c.CONNECT;
                    break;
                case '\b':
                    cVar = h.c.DELETE;
                    break;
                default:
                    cVar = h.c.HTTP_METHOD_UNKNOWN;
                    break;
            }
            h.a aVar = this.f13953x;
            aVar.u();
            h.W((h) aVar.f10073v, cVar);
        }
    }

    public final void e(int i6) {
        h.a aVar = this.f13953x;
        aVar.u();
        h.O((h) aVar.f10073v, i6);
    }

    public final void f(long j10) {
        h.a aVar = this.f13953x;
        aVar.u();
        h.X((h) aVar.f10073v, j10);
    }

    public final void g(long j10) {
        hf.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f13954y);
        h.a aVar = this.f13953x;
        aVar.u();
        h.R((h) aVar.f10073v, j10);
        a(perfSession);
        if (perfSession.f17594w) {
            this.f13951v.collectGaugeMetricOnce(perfSession.f17593v);
        }
    }

    public final void h(String str) {
        h.a aVar = this.f13953x;
        if (str == null) {
            aVar.u();
            h.Q((h) aVar.f10073v);
            return;
        }
        boolean z10 = false;
        if (str.length() <= 128) {
            int i6 = 0;
            while (true) {
                if (i6 < str.length()) {
                    char charAt = str.charAt(i6);
                    if (charAt <= 31 || charAt > 127) {
                        break;
                    }
                    i6++;
                } else {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            aVar.u();
            h.P((h) aVar.f10073v, str);
            return;
        }
        B.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void i(long j10) {
        h.a aVar = this.f13953x;
        aVar.u();
        h.Y((h) aVar.f10073v, j10);
    }

    public final void j(long j10) {
        h.a aVar = this.f13953x;
        aVar.u();
        h.U((h) aVar.f10073v, j10);
        if (SessionManager.getInstance().perfSession().f17594w) {
            this.f13951v.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f17593v);
        }
    }

    public final void k(String str) {
        t tVar;
        int lastIndexOf;
        if (str != null) {
            t tVar2 = null;
            try {
                t.a aVar = new t.a();
                aVar.d(null, str);
                tVar = aVar.a();
            } catch (IllegalArgumentException unused) {
                tVar = null;
            }
            if (tVar != null) {
                t.a f = tVar.f();
                f.f24696b = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                f.f24697c = t.b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                f.f24700g = null;
                f.f24701h = null;
                str = f.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        t.a aVar2 = new t.a();
                        aVar2.d(null, str);
                        tVar2 = aVar2.a();
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (tVar2 == null) {
                        str = str.substring(0, 2000);
                    } else if (tVar2.b().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                        str = str.substring(0, lastIndexOf);
                    } else {
                        str = str.substring(0, 2000);
                    }
                }
            }
            h.a aVar3 = this.f13953x;
            aVar3.u();
            h.M((h) aVar3.f10073v, str);
        }
    }
}
