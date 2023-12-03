package zg;

import android.content.Context;
import android.location.Location;
import gv.n;
import gv.r;
import ih.p;
import java.util.Date;
import java.util.Set;
import org.json.JSONObject;
import qg.w;
import r1.b0;
import ug.l;
import ug.m;
/* compiled from: UserAttributeHandler.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final p f39383a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39384b;

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackCustomAttribute() : Not a valid custom attribute.", j.this.f39384b);
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ih.a f39387v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ih.a aVar) {
            super(0);
            this.f39387v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return j.this.f39384b + " trackUserAttribute() : Will try to track user attribute: " + this.f39387v;
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackUserAttribute() Attribute name cannot be null or empty.", j.this.f39384b);
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ih.a f39390v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ih.a aVar) {
            super(0);
            this.f39390v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j.this.f39384b);
            sb2.append(" Not supported data-type for attribute name: ");
            return b0.b(sb2, this.f39390v.f20046a, ". Supported data types: String, Int, Long, Double, Float, Boolean, Date, GeoLocation, Location.");
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ih.a f39392v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ih.a aVar) {
            super(0);
            this.f39392v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return j.this.f39384b + " trackUserAttribute() User attribute blacklisted. " + this.f39392v;
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackUserAttribute() : No need to cache custom attributes, will track attribute.", j.this.f39384b);
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ih.a f39395v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ih.a aVar) {
            super(0);
            this.f39395v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return j.this.f39384b + " trackUserAttribute() : Will try to sync attribute to server, attribute: " + this.f39395v;
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.a f39397v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mh.a aVar) {
            super(0);
            this.f39397v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return j.this.f39384b + " trackUserAttribute() Not an acceptable unique id " + this.f39397v.f25054b;
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ mh.a f39399v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(mh.a aVar) {
            super(0);
            this.f39399v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return j.this.f39384b + " trackUserAttribute(): Saved user attribute: " + this.f39399v;
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* renamed from: zg.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0674j extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0674j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackUserAttribute() : ", j.this.f39384b);
        }
    }

    /* compiled from: UserAttributeHandler.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackUserAttributeIfRequired() : Attribute Already tracked. Will not be sent to server.", j.this.f39384b);
        }
    }

    public j(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f39383a = sdkInstance;
        this.f39384b = "Core_UserAttributeHandler";
    }

    public static int a(Object obj) {
        if (obj instanceof Integer) {
            return 3;
        }
        if (obj instanceof Double) {
            return 2;
        }
        if (obj instanceof Long) {
            return 4;
        }
        if (obj instanceof Boolean) {
            return 5;
        }
        if (obj instanceof Float) {
            return 6;
        }
        return 1;
    }

    public final void b(Context context, ih.a aVar) {
        int d10 = v.h.d(aVar.f20048c);
        p pVar = this.f39383a;
        Object obj = aVar.f20047b;
        String attributeName = aVar.f20046a;
        if (d10 != 1) {
            if (d10 != 2) {
                hh.g.b(pVar.f20105d, 0, new a(), 3);
                return;
            }
            ng.c cVar = new ng.c();
            cVar.a(obj, attributeName);
            e(context, cVar.f26313a.a());
        } else if (obj instanceof Date) {
            ng.c cVar2 = new ng.c();
            cVar2.a(obj, attributeName);
            e(context, cVar2.f26313a.a());
        } else if (obj instanceof Long) {
            m mVar = new m();
            long longValue = ((Number) obj).longValue();
            kotlin.jvm.internal.i.g(attributeName, "attributeName");
            mVar.c(longValue, attributeName);
            e(context, mVar.a());
        } else {
            hh.g.b(pVar.f20105d, 0, new zg.k(this), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005f A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x000d, B:6:0x0020, B:9:0x0029, B:13:0x0035, B:15:0x0039, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:25:0x004d, B:27:0x0051, B:29:0x0055, B:35:0x005f, B:37:0x0068, B:39:0x007f, B:41:0x0088, B:45:0x0090, B:47:0x00c7, B:49:0x00d5, B:51:0x00de, B:53:0x00e8, B:55:0x00f0, B:56:0x00f9, B:58:0x00fd, B:59:0x0116), top: B:63:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x000d, B:6:0x0020, B:9:0x0029, B:13:0x0035, B:15:0x0039, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:25:0x004d, B:27:0x0051, B:29:0x0055, B:35:0x005f, B:37:0x0068, B:39:0x007f, B:41:0x0088, B:45:0x0090, B:47:0x00c7, B:49:0x00d5, B:51:0x00de, B:53:0x00e8, B:55:0x00f0, B:56:0x00f9, B:58:0x00fd, B:59:0x0116), top: B:63:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, ih.a aVar) {
        boolean z10;
        p pVar = this.f39383a;
        String str = aVar.f20046a;
        Object obj = aVar.f20047b;
        try {
            hh.g.b(pVar.f20105d, 0, new b(aVar), 3);
            if (!l.e(context, pVar)) {
                return;
            }
            boolean B0 = n.B0(str);
            hh.g gVar = pVar.f20105d;
            if (B0) {
                hh.g.b(gVar, 2, new c(), 2);
                return;
            }
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Boolean) && !(obj instanceof Date) && !(obj instanceof fi.c) && !(obj instanceof Location)) {
                z10 = false;
                if (z10) {
                    hh.g.b(gVar, 2, new d(aVar), 2);
                    return;
                }
                kotlin.jvm.internal.h hVar = new kotlin.jvm.internal.h();
                Set<String> blackListedAttribute = pVar.f20104c.f33012c.f28433i;
                kotlin.jvm.internal.i.g(blackListedAttribute, "blackListedAttribute");
                if (!(!blackListedAttribute.contains(str))) {
                    hh.g.b(gVar, 2, new e(aVar), 2);
                    return;
                }
                int i6 = aVar.f20048c;
                if (i6 != 2 && i6 != 3) {
                    mh.a aVar2 = new mh.a(System.currentTimeMillis(), aVar.f20046a, obj.toString(), defpackage.b.y(a(obj)));
                    String str2 = aVar2.f25053a;
                    hh.g.b(gVar, 0, new g(aVar), 3);
                    w.f29578a.getClass();
                    mh.a H = w.f(context, pVar).H(str2);
                    if (kotlin.jvm.internal.i.b(str2, "USER_ATTRIBUTE_UNIQUE_ID")) {
                        if (!hVar.M(aVar2.f25054b, pVar.f20104c.f33012c.f28432h)) {
                            hh.g.b(gVar, 2, new h(aVar2), 2);
                            return;
                        }
                        String g02 = w.f(context, pVar).g0();
                        if (g02 != null && !kotlin.jvm.internal.i.b(aVar2.f25054b, g02)) {
                            w.d(pVar).f29549d.a(true, context);
                        }
                        d(context, aVar, aVar2, H);
                        return;
                    }
                    String c10 = di.n.c(aVar2.f25054b);
                    kotlin.jvm.internal.i.f(c10, "getSha1ForString(trackedAttribute.value)");
                    aVar2.f25054b = c10;
                    hh.g.b(gVar, 0, new i(H), 3);
                    d(context, aVar, aVar2, H);
                    return;
                }
                hh.g.b(gVar, 0, new f(), 3);
                b(context, aVar);
                return;
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new C0674j());
        }
    }

    public final void d(Context context, ih.a aVar, mh.a aVar2, mh.a aVar3) {
        boolean z10;
        p pVar = this.f39383a;
        long j10 = pVar.f20104c.f33012c.f;
        String str = aVar2.f25053a;
        if (aVar3 != null && kotlin.jvm.internal.i.b(str, aVar3.f25053a) && kotlin.jvm.internal.i.b(aVar2.f25054b, aVar3.f25054b) && kotlin.jvm.internal.i.b(aVar2.f25056d, aVar3.f25056d) && aVar3.f25055c + j10 >= aVar2.f25055c) {
            z10 = false;
        } else {
            z10 = true;
        }
        hh.g gVar = pVar.f20105d;
        if (z10) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(aVar.f20046a, aVar.f20047b);
            e(context, jSONObject);
            hh.g.b(gVar, 0, new zg.a(this, aVar2), 3);
            w.f29578a.getClass();
            uh.b f2 = w.f(context, pVar);
            boolean b10 = kotlin.jvm.internal.i.b(str, "USER_ATTRIBUTE_UNIQUE_ID");
            vh.c cVar = f2.f34156b;
            if (b10) {
                hh.g.b(gVar, 0, new zg.b(this), 3);
                cVar.b0(aVar2);
                return;
            }
            cVar.t(aVar2);
            return;
        }
        hh.g.b(gVar, 0, new k(), 3);
    }

    public final void e(Context context, JSONObject jSONObject) {
        ih.i iVar = new ih.i(jSONObject, "EVENT_ACTION_USER_ATTRIBUTE");
        p pVar = this.f39383a;
        l.f(context, iVar, pVar);
        if (r.J0(iVar.f20090c, "USER_ATTRIBUTE_UNIQUE_ID")) {
            hh.g.b(pVar.f20105d, 0, new zg.i(this), 3);
            yg.n.b(context, pVar);
        }
    }
}
