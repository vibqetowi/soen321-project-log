package mi;

import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import com.theinnerhour.b2b.utils.Constants;
import hh.g;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, ri.c> f25272a = is.e0.u0(new hs.f(1, ri.c.PORTRAIT), new hs.f(2, ri.c.LANDSCAPE));

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f25273u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "InApp_6.5.0_Utils isModuleEnabled() : InApp Module is disabled. Cannot show in-app.";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f25274u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(j1.c(), "InApp_6.5.0_Utils logCurrentInAppState() : Current Activity: ");
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ih.p f25275u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ih.p pVar) {
            super(0);
            this.f25275u = pVar;
        }

        @Override // ss.a
        public final String invoke() {
            i1.f25206a.getClass();
            return kotlin.jvm.internal.i.n(i1.a(this.f25275u).f35174g, "InApp_6.5.0_Utils logCurrentInAppState() : InApp-Context: ");
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ pi.j f25276u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pi.j jVar) {
            super(0);
            this.f25276u = jVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("InApp_6.5.0_Utils logCurrentInAppState() : \n Global Delay: ");
            pi.j jVar = this.f25276u;
            sb2.append(jVar.f28483a);
            sb2.append(" \n Last campaign show at: ");
            sb2.append(sp.b.M(jVar.f28484b));
            sb2.append("\n Current Time: ");
            sb2.append(sp.b.M(jVar.f28485c));
            return sb2.toString();
        }
    }

    public static final void a(ng.c cVar, String campaignId, String campaignName, aj.a aVar) {
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        kotlin.jvm.internal.i.g(campaignName, "campaignName");
        cVar.a(campaignId, Constants.CAMPAIGN_ID);
        cVar.a(campaignName, "campaign_name");
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : aVar.f587c.entrySet()) {
                cVar.a(entry.getValue(), entry.getKey());
            }
        }
    }

    public static final boolean b(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        if (g(context, sdkInstance)) {
            i1.f25206a.getClass();
            if (i1.b(sdkInstance).f25199c) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(int i6, Set<? extends ri.c> supportedOrientations) {
        kotlin.jvm.internal.i.g(supportedOrientations, "supportedOrientations");
        return is.u.Z1(supportedOrientations, f25272a.get(Integer.valueOf(i6)));
    }

    public static final int d(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        return context.getResources().getConfiguration().orientation;
    }

    public static final i5.n e(Context context) {
        int i6;
        kotlin.jvm.internal.i.g(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        he.e0 e0Var = new he.e0(displayMetrics.widthPixels, displayMetrics.heightPixels, 1);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i6 = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i6 = 0;
        }
        return new i5.n(e0Var, i6);
    }

    public static final boolean f(Context context, RelativeLayout relativeLayout) {
        kotlin.jvm.internal.i.g(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        he.e0 e0Var = new he.e0(displayMetrics.widthPixels, displayMetrics.heightPixels, 1);
        relativeLayout.measure(0, 0);
        if (e0Var.f17481c < new he.e0(relativeLayout.getMeasuredWidth(), relativeLayout.getMeasuredHeight(), 1).f17481c) {
            return true;
        }
        return false;
    }

    public static final boolean g(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        i1.f25206a.getClass();
        if (!i1.d(context, sdkInstance).F()) {
            hh.a aVar = hh.g.f17610d;
            g.a.b(0, a.f25273u, 3);
            return false;
        }
        return true;
    }

    public static final boolean h(String str) {
        boolean z10;
        if (kotlin.jvm.internal.i.b(str, "undefined") || kotlin.jvm.internal.i.b(str, "null")) {
            return false;
        }
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return false;
        }
        return true;
    }

    public static final boolean i(Object obj) {
        if (!kotlin.jvm.internal.i.b(obj, "undefined") && !kotlin.jvm.internal.i.b(obj, "null")) {
            return true;
        }
        return false;
    }

    public static final void j(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g gVar = sdkInstance.f20105d;
        hh.g.b(gVar, 0, b.f25274u, 3);
        hh.g.b(gVar, 0, new c(sdkInstance), 3);
        i1.f25206a.getClass();
        hh.g.b(gVar, 0, new d(i1.d(context, sdkInstance).x()), 3);
    }

    public static final LinkedHashSet k(JSONArray jsonArray) {
        kotlin.jvm.internal.i.g(jsonArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jsonArray.length();
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            String string = jsonArray.getString(i6);
            kotlin.jvm.internal.i.f(string, "jsonArray.getString(i)");
            String upperCase = string.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            linkedHashSet.add(ri.c.valueOf(upperCase));
            i6 = i10;
        }
        return linkedHashSet;
    }
}
