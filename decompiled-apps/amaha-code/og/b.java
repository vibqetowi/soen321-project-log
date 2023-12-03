package og;

import ah.e;
import android.content.Context;
import di.c;
import gv.n;
import hh.g;
import ih.p;
import java.util.Date;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import qg.g;
import qg.g0;
import qg.w;
import ug.l;
/* compiled from: MoEAnalyticsHelper.kt */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: MoEAnalyticsHelper.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f27459u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_MoEAnalyticsHelper setUserAttributeISODate() : ";
        }
    }

    public static void a(Context context, ih.a aVar, p pVar) {
        w.f29578a.getClass();
        g d10 = w.d(pVar);
        i.g(context, "context");
        try {
            ug.b bVar = d10.f29548c;
            bVar.getClass();
            bVar.f34102a.f20106e.c(new e("TRACK_ATTRIBUTE", false, new ug.a(bVar, context, aVar, 1)));
        } catch (Throwable th2) {
            d10.f29546a.f20105d.a(1, th2, new qg.p(d10));
        }
    }

    public static void b(Context context, Object attributeValue, String str) {
        i.g(context, "context");
        i.g(attributeValue, "attributeValue");
        p pVar = g0.f29558c;
        if (pVar == null) {
            return;
        }
        try {
            a(context, new ih.a(str, attributeValue, l.b(attributeValue)), pVar);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, og.a.f27458u);
        }
    }

    public static void c(Context context, String name, Object value, String appId) {
        i.g(context, "context");
        i.g(name, "name");
        i.g(value, "value");
        i.g(appId, "appId");
        p b10 = g0.b(appId);
        if (b10 == null) {
            return;
        }
        a(context, new ih.a(name, value, l.b(value)), b10);
    }

    public static void d(Context context, String str, String str2, String str3) {
        e.u(str, "attributeName", str2, "attributeValue", str3, "appId");
        try {
            if (!n.B0(str2)) {
                boolean z10 = false;
                try {
                    if (!n.B0(str2)) {
                        if (di.k.d(str2).getTime() > -1) {
                            z10 = true;
                        }
                    }
                } catch (Exception unused) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.b(0, new c(str2), 3);
                }
                if (z10) {
                    Date d10 = di.k.d(str2);
                    i.f(d10, "parse(attributeValue)");
                    c(context, str, d10, str3);
                }
            }
        } catch (Exception e10) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, e10, a.f27459u);
        }
    }
}
