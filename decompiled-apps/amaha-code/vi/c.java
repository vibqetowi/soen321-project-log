package vi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
/* compiled from: InAppFileManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f35183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35184b;

    /* renamed from: c  reason: collision with root package name */
    public final ai.d f35185c;

    /* compiled from: InAppFileManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f35187v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f35187v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return c.this.f35184b + " deleteHtmlAssetsForCampaignIds() : campaignId:" + this.f35187v;
        }
    }

    /* compiled from: InAppFileManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n("  getGifFromUrl() : ", c.this.f35184b);
        }
    }

    /* compiled from: InAppFileManager.kt */
    /* renamed from: vi.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0596c extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0596c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n("  getImageFromUrl() : ", c.this.f35184b);
        }
    }

    public c(Context context, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f35183a = sdkInstance;
        this.f35184b = "InApp_6.5.0_InAppFileManager";
        this.f35185c = new ai.d(context, sdkInstance);
    }

    public final void a(Set<String> set) {
        for (String str : set) {
            hh.g.b(this.f35183a.f20105d, 3, new a(str), 2);
            this.f35185c.c(kotlin.jvm.internal.i.n("/html", str));
        }
    }

    public final File b(String url, String campaignId) {
        ai.d dVar = this.f35185c;
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        try {
            String n10 = kotlin.jvm.internal.i.n(".gif", di.b.i(url));
            if (dVar.e(campaignId, n10)) {
                dVar.getClass();
                return new File(dVar.f577b + '/' + campaignId, n10);
            }
            InputStream inputStream = FirebasePerfUrlConnection.openStream(new URL(url));
            kotlin.jvm.internal.i.f(inputStream, "inputStream");
            return dVar.g(campaignId, n10, inputStream);
        } catch (Exception e10) {
            this.f35183a.f20105d.a(1, e10, new b());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0011, B:5:0x0019, B:11:0x0027, B:13:0x0033, B:14:0x003c, B:17:0x0043, B:18:0x0048, B:21:0x0059), top: B:26:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0011, B:5:0x0019, B:11:0x0027, B:13:0x0033, B:14:0x003c, B:17:0x0043, B:18:0x0048, B:21:0x0059), top: B:26:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(Context context, String url, String campaignId) {
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(url, "url");
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        try {
            if (!gv.n.H0(url, "https://") && !gv.n.H0(url, "http://")) {
                z10 = false;
                if (!z10) {
                    String i6 = di.b.i(url);
                    ai.d dVar = this.f35185c;
                    if (dVar.e(campaignId, i6)) {
                        return BitmapFactory.decodeFile(dVar.f(campaignId, i6));
                    }
                    Bitmap e10 = di.b.e(url);
                    if (e10 == null) {
                        return null;
                    }
                    dVar.h(e10, campaignId, i6);
                    return e10;
                }
                int identifier = context.getResources().getIdentifier(url, "drawable", context.getPackageName());
                if (identifier == 0) {
                    return null;
                }
                return BitmapFactory.decodeResource(context.getResources(), identifier);
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e11) {
            this.f35183a.f20105d.a(1, e11, new C0596c());
            return null;
        }
    }
}
