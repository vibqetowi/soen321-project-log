package fj;

import android.net.Uri;
import android.os.Bundle;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: PushSourceProcessor.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f15096a;

    /* renamed from: b  reason: collision with root package name */
    public final ih.p f15097b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15098c;

    /* compiled from: PushSourceProcessor.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getSourceForCampaign() : ", o.this.f15098c);
        }
    }

    /* compiled from: PushSourceProcessor.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getSourceForCampaign() : processing source from moe_action", o.this.f15098c);
        }
    }

    /* compiled from: PushSourceProcessor.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getSourceForCampaign() : processing source for default action", o.this.f15098c);
        }
    }

    /* compiled from: PushSourceProcessor.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getSourceForCampaign() : ", o.this.f15098c);
        }
    }

    /* compiled from: PushSourceProcessor.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getTrafficFromAction() : ", o.this.f15098c);
        }
    }

    public o(Bundle bundle, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f15096a = bundle;
        this.f15097b = sdkInstance;
        this.f15098c = "PushBase_6.6.0_PushSourceProcessor";
    }

    public final jh.a a() {
        String str;
        Bundle bundle = this.f15096a;
        ih.p pVar = this.f15097b;
        try {
            boolean z10 = false;
            hh.g.b(pVar.f20105d, 0, new a(), 3);
            boolean containsKey = bundle.containsKey("moe_action");
            hh.g gVar = pVar.f20105d;
            if (containsKey) {
                hh.g.b(gVar, 0, new b(), 3);
                return b();
            }
            hh.g.b(gVar, 0, new c(), 3);
            if (bundle.containsKey("moe_webUrl")) {
                str = bundle.getString("moe_webUrl");
            } else if (bundle.containsKey("gcm_webUrl")) {
                str = bundle.getString("gcm_webUrl");
            } else {
                str = null;
            }
            if ((str == null || gv.n.B0(str)) ? true : true) {
                return sg.v.a(bundle, (Set) pVar.f20104c.f33013d.f15849b);
            }
            return sg.v.b(Uri.parse(str), (Set) pVar.f20104c.f33013d.f15849b);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new d());
            return null;
        }
    }

    public final jh.a b() {
        JSONArray e10;
        try {
            e10 = y.e(this.f15096a);
        } catch (Exception e11) {
            this.f15097b.f20105d.a(1, e11, new e());
        }
        if (e10.length() == 0) {
            return null;
        }
        lj.a aVar = new lj.a();
        int length = e10.length();
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            JSONObject jSONObject = e10.getJSONObject(i6);
            kotlin.jvm.internal.i.f(jSONObject, "actions.getJSONObject(i)");
            qj.a a10 = aVar.a(jSONObject);
            if (a10 instanceof qj.g) {
                return c((qj.g) a10);
            }
            i6 = i10;
        }
        return null;
    }

    public final jh.a c(qj.g gVar) {
        Uri uri;
        String str = gVar.f29616c;
        int hashCode = str.hashCode();
        ih.p pVar = this.f15097b;
        Bundle bundle = gVar.f29618e;
        if (hashCode != -417556201) {
            if (hashCode != 628280070) {
                uri = Uri.parse(gVar.f29617d);
                if (bundle == null && !bundle.isEmpty()) {
                    Uri.Builder buildUpon = uri.buildUpon();
                    for (String str2 : bundle.keySet()) {
                        buildUpon.appendQueryParameter(str2, bundle.getString(str2));
                    }
                    uri = buildUpon.build();
                    kotlin.jvm.internal.i.f(uri, "builder.build()");
                } else {
                    kotlin.jvm.internal.i.f(uri, "uri");
                }
                return sg.v.b(uri, (Set) pVar.f20104c.f33013d.f15849b);
            }
            uri = Uri.parse(gVar.f29617d);
            if (bundle == null) {
            }
            kotlin.jvm.internal.i.f(uri, "uri");
            return sg.v.b(uri, (Set) pVar.f20104c.f33013d.f15849b);
        } else if (!str.equals("screenName") || bundle == null) {
            return null;
        } else {
            return sg.v.a(bundle, (Set) pVar.f20104c.f33013d.f15849b);
        }
        return null;
    }
}
