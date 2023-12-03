package k5;

import androidx.recyclerview.widget.k;
import h5.p;
import h5.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import w5.v;
/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<Integer> f22988a = ca.a.w0(Integer.valueOf((int) k.d.DEFAULT_DRAG_ANIMATION_DURATION), 202);

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<Integer> f22989b = ca.a.w0(503, 504, 429);

    /* renamed from: c  reason: collision with root package name */
    public static a f22990c;

    /* renamed from: d  reason: collision with root package name */
    public static List<Map<String, Object>> f22991d;

    /* renamed from: e  reason: collision with root package name */
    public static int f22992e;

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f22993a;

        /* renamed from: b  reason: collision with root package name */
        public final String f22994b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22995c;

        public a(String str, String cloudBridgeURL, String str2) {
            kotlin.jvm.internal.i.g(cloudBridgeURL, "cloudBridgeURL");
            this.f22993a = str;
            this.f22994b = cloudBridgeURL;
            this.f22995c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f22993a, aVar.f22993a) && kotlin.jvm.internal.i.b(this.f22994b, aVar.f22994b) && kotlin.jvm.internal.i.b(this.f22995c, aVar.f22995c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f22995c.hashCode() + pl.a.c(this.f22994b, this.f22993a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb2.append(this.f22993a);
            sb2.append(", cloudBridgeURL=");
            sb2.append(this.f22994b);
            sb2.append(", accessKey=");
            return v.g.c(sb2, this.f22995c, ')');
        }
    }

    public static final void a(String str, String url, String str2) {
        kotlin.jvm.internal.i.g(url, "url");
        v.a aVar = v.f36544d;
        p.i(w.APP_EVENTS);
        f22990c = new a(str, url, str2);
        f22991d = new ArrayList();
    }

    public static List b() {
        List<Map<String, Object>> list = f22991d;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.i.q("transformedEvents");
        throw null;
    }
}
