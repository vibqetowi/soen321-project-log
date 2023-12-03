package ug;

import android.content.Context;
import java.util.Date;
/* compiled from: DataTrackingHandler.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f34102a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34103b;

    /* renamed from: c  reason: collision with root package name */
    public final xg.g f34104c;

    /* renamed from: d  reason: collision with root package name */
    public final wg.e f34105d;

    /* compiled from: DataTrackingHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackEvent() : ", b.this.f34103b);
        }
    }

    /* compiled from: DataTrackingHandler.kt */
    /* renamed from: ug.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0571b extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0571b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackInstall() : Install is already tracked will not be tracked again.", b.this.f34103b);
        }
    }

    /* compiled from: DataTrackingHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackUpdate() : Update already tracked for this version. Will not track again", b.this.f34103b);
        }
    }

    public b(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f34102a = sdkInstance;
        this.f34103b = "Core_DataTrackingHandler";
        this.f34104c = new xg.g(sdkInstance);
        this.f34105d = new wg.e(sdkInstance);
    }

    public final void a(Context context, String action, ng.c cVar) {
        ih.p pVar = this.f34102a;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(action, "action");
        try {
            try {
                pVar.f20106e.c(new ah.e("TRACK_EVENT", false, new androidx.emoji2.text.g(23, this, context, new ih.i(cVar.f26313a.a(), action))));
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new ug.c(this));
            }
        } catch (Exception e11) {
            pVar.f20105d.a(1, e11, new a());
        }
    }

    public final void b(Context context, uh.b bVar, int i6) {
        if (bVar.I()) {
            hh.g.b(this.f34102a.f20105d, 0, new C0571b(), 3);
            return;
        }
        ng.c cVar = new ng.c();
        cVar.a(Integer.valueOf(i6), "VERSION");
        cVar.a(Integer.valueOf(di.b.n()), "sdk_ver");
        cVar.a(Long.valueOf(System.currentTimeMillis()), "INSTALLED_TIME");
        cVar.a("ANDROID", "os");
        a(context, "INSTALL", cVar);
        bVar.y();
    }

    public final void c(Context context, uh.b bVar, int i6) {
        int v10 = bVar.v();
        if (i6 == v10) {
            hh.g.b(this.f34102a.f20105d, 2, new c(), 2);
            return;
        }
        ng.c cVar = new ng.c();
        cVar.a(Integer.valueOf(v10), "VERSION_FROM");
        cVar.a(Integer.valueOf(i6), "VERSION_TO");
        cVar.a(new Date(), "UPDATED_ON");
        a(context, "UPDATE", cVar);
    }
}
