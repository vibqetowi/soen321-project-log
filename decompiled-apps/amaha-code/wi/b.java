package wi;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.theinnerhour.b2b.utils.Constants;
import hh.g;
import ih.p;
import ih.q;
import is.x;
import is.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.e0;
import nd.z;
import t0.l0;
/* compiled from: LocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class b implements wi.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36706a;

    /* renamed from: b  reason: collision with root package name */
    public final lh.a f36707b;

    /* renamed from: c  reason: collision with root package name */
    public final p f36708c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36709d;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f36710e;

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" addOrUpdateInApp() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* renamed from: wi.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0615b extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0615b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" deleteStatById() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getAllCampaigns() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getCampaignById() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getGeneralCampaigns() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getPushPermissionRequestCount() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" selfHandledCampaigns() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getStoredCampaigns() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getStoredCampaigns() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {
        public j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" getTriggerCampaigns() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateStateForCampaign() : ", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {
        public l() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" writeStats(): will write in-app stats to storage.", b.this.f36709d);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ w f36724v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ pi.p f36725w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(w wVar, pi.p pVar) {
            super(0);
            this.f36724v = wVar;
            this.f36725w = pVar;
        }

        @Override // ss.a
        public final String invoke() {
            return b.this.f36709d + " writeStats(): saved : " + this.f36724v.f23468u + " , stats: " + this.f36725w;
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {
        public n() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" writeStats() : ", b.this.f36709d);
        }
    }

    public b(Context context, lh.a aVar, p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f36706a = context;
        this.f36707b = aVar;
        this.f36708c = sdkInstance;
        this.f36709d = "InApp_6.5.0_LocalRepositoryImpl";
        this.f36710e = new e0(12);
    }

    @Override // wi.a
    public final void A(List<pi.c> newCampaigns) {
        kotlin.jvm.internal.i.g(newCampaigns, "newCampaigns");
        try {
            LinkedHashMap z02 = is.e0.z0(d());
            boolean isEmpty = z02.isEmpty();
            e0 e0Var = this.f36710e;
            lh.a aVar = this.f36707b;
            if (isEmpty) {
                ArrayList arrayList = new ArrayList(newCampaigns.size());
                for (pi.c cVar : newCampaigns) {
                    e0Var.getClass();
                    arrayList.add(e0.e(cVar));
                }
                aVar.f24374b.a(arrayList);
                return;
            }
            for (pi.c cVar2 : newCampaigns) {
                pi.c cVar3 = (pi.c) z02.get(cVar2.f28447b);
                if (cVar3 != null) {
                    cVar2.f28446a = cVar3.f28446a;
                    f8.g gVar = cVar3.f;
                    kotlin.jvm.internal.i.g(gVar, "<set-?>");
                    cVar2.f = gVar;
                    e(cVar2);
                    z02.remove(cVar3.f28447b);
                } else {
                    v.c cVar4 = aVar.f24374b;
                    e0Var.getClass();
                    ((bi.c) cVar4.f34634y).a("INAPP_V3", e0.e(cVar2));
                }
            }
            for (pi.c cVar5 : z02.values()) {
                k(cVar5.f28447b);
            }
        } catch (Exception e10) {
            this.f36708c.f20105d.a(1, e10, new a());
        }
    }

    @Override // wi.a
    public final long B() {
        return this.f36707b.f24373a.t("inapp_last_sync_time", 0L);
    }

    @Override // wi.a
    public final q a() {
        Context context = this.f36706a;
        kotlin.jvm.internal.i.g(context, "context");
        p sdkInstance = this.f36708c;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        qg.w.f29578a.getClass();
        return qg.w.f(context, sdkInstance).a();
    }

    @Override // wi.a
    public final void b() {
        Set<String> set;
        lh.a aVar = this.f36707b;
        aVar.f24373a.K("inapp_last_sync_time");
        v.c cVar = aVar.f24374b;
        cVar.b("INAPP_V3");
        Context context = this.f36706a;
        kotlin.jvm.internal.i.g(context, "context");
        p sdkInstance = this.f36708c;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        ai.d dVar = new ai.d(context, sdkInstance);
        Cursor cursor = null;
        try {
            try {
                cursor = cVar.g("INAPP_V3", new p0.f(new String[]{Constants.CAMPAIGN_ID}, null, null, 0, 60));
                this.f36710e.getClass();
                set = e0.f(cursor);
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e10) {
                sdkInstance.f20105d.a(1, e10, new wi.e(this));
                if (cursor != null) {
                    cursor.close();
                }
                set = y.f20678u;
            }
            for (String str : set) {
                dVar.c(str);
            }
            cVar.b("INAPP_STATS");
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // wi.a
    public final void c(long j10) {
        this.f36707b.f24373a.I(j10, "inapp_last_sync_time");
    }

    public final Map<String, pi.c> d() {
        x xVar = x.f20677u;
        p pVar = this.f36708c;
        Cursor cursor = null;
        try {
            try {
                HashMap hashMap = new HashMap();
                cursor = this.f36707b.f24374b.g("INAPP_V3", new p0.f(l0.f32338w, null, null, 0, 60));
                if (cursor != null && cursor.moveToFirst()) {
                    do {
                        try {
                            this.f36710e.getClass();
                            pi.c m10 = e0.m(cursor);
                            hashMap.put(m10.f28447b, m10);
                        } catch (Exception e10) {
                            pVar.f20105d.a(1, e10, new h());
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return hashMap;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return xVar;
            } catch (Exception e11) {
                pVar.f20105d.a(1, e11, new i());
                if (cursor != null) {
                    cursor.close();
                }
                return xVar;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void e(pi.c cVar) {
        v.c cVar2 = this.f36707b.f24374b;
        this.f36710e.getClass();
        ContentValues e10 = e0.e(cVar);
        String[] strArr = {String.valueOf(cVar.f28446a)};
        cVar2.getClass();
        bi.c cVar3 = (bi.c) cVar2.f34634y;
        cVar3.getClass();
        try {
            cVar3.f4302a.getWritableDatabase().update("INAPP_V3", e10, "_id = ?", strArr);
        } catch (Exception e11) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e11, new bi.e(cVar3));
        }
    }

    @Override // wi.a
    public final List<pi.c> f() {
        Cursor cursor = null;
        try {
            try {
                cursor = this.f36707b.f24374b.g("INAPP_V3", new p0.f(l0.f32338w, null, "priority DESC, last_updated_time DESC", 0, 44));
                this.f36710e.getClass();
                List<pi.c> g5 = e0.g(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return g5;
            } catch (Exception e10) {
                this.f36708c.f20105d.a(1, e10, new c());
                if (cursor != null) {
                    cursor.close();
                }
                return is.w.f20676u;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r12 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r12 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // wi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pi.c g(String campaignId) {
        Exception e10;
        Cursor cursor;
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        Cursor cursor2 = null;
        try {
            cursor = this.f36707b.f24374b.g("INAPP_V3", new p0.f(l0.f32338w, new z("campaign_id = ? ", 11, new String[]{campaignId}), null, 0, 60));
            if (cursor != null) {
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            this.f36710e.getClass();
                            pi.c m10 = e0.m(cursor);
                            cursor.close();
                            return m10;
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        this.f36708c.f20105d.a(1, e10, new d());
                    }
                } catch (Throwable th2) {
                    cursor2 = cursor;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
        } catch (Exception e12) {
            e10 = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    @Override // wi.a
    public final List<pi.c> h() {
        Cursor cursor = null;
        try {
            try {
                cursor = this.f36707b.f24374b.g("INAPP_V3", new p0.f(l0.f32338w, new z("status = ?  AND type = ?  AND template_type IN ( ?, ? ) ", 11, new String[]{"ACTIVE", "general", "POP_UP", "FULL_SCREEN"}), "priority DESC, last_updated_time DESC", 0, 44));
                this.f36710e.getClass();
                List<pi.c> g5 = e0.g(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return g5;
            } catch (Exception e10) {
                this.f36708c.f20105d.a(1, e10, new e());
                if (cursor != null) {
                    cursor.close();
                }
                return is.w.f20676u;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // wi.a
    public final int i() {
        hh.g.b(this.f36708c.f20105d, 0, new f(), 3);
        return ((SharedPreferences) this.f36707b.f24373a.f31226x).getInt("notification_permission_request_count", 0);
    }

    @Override // wi.a
    public final long j(pi.p pVar) {
        p pVar2 = this.f36708c;
        w wVar = new w();
        wVar.f23468u = -1L;
        try {
            hh.g.b(pVar2.f20105d, 0, new l(), 3);
            v.c cVar = this.f36707b.f24374b;
            this.f36710e.getClass();
            wVar.f23468u = ((bi.c) cVar.f34634y).a("INAPP_STATS", e0.u(pVar));
            hh.g.b(pVar2.f20105d, 0, new m(wVar, pVar), 3);
        } catch (Exception e10) {
            pVar2.f20105d.a(1, e10, new n());
        }
        return wVar.f23468u;
    }

    public final void k(String str) {
        try {
            v.c cVar = this.f36707b.f24374b;
            this.f36710e.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", "IN_ACTIVE");
            String[] strArr = {str};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                cVar2.f4302a.getWritableDatabase().update("INAPP_V3", contentValues, "campaign_id = ? ", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.e(cVar2));
            }
        } catch (Exception e11) {
            this.f36708c.f20105d.a(1, e11, new wi.h(this));
        }
    }

    @Override // wi.a
    public final jg.d l() {
        return f6.b.y0(this.f36706a, this.f36708c);
    }

    @Override // wi.a
    public final List m() {
        is.w wVar = is.w.f20676u;
        p pVar = this.f36708c;
        Cursor cursor = null;
        try {
            try {
                cursor = this.f36707b.f24374b.g("INAPP_STATS", new p0.f(l0.f32337v, null, null, 30, 28));
                if (cursor != null && cursor.moveToFirst() && cursor.getCount() != 0) {
                    ArrayList arrayList = new ArrayList(cursor.getCount());
                    do {
                        try {
                            this.f36710e.getClass();
                            arrayList.add(e0.t(cursor));
                        } catch (Exception e10) {
                            pVar.f20105d.a(1, e10, new wi.f(this));
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return arrayList;
                }
                cursor.close();
                return wVar;
            } catch (Exception e11) {
                pVar.f20105d.a(1, e11, new wi.g(this));
                if (cursor != null) {
                    cursor.close();
                }
                return wVar;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // wi.a
    public final void n(long j10) {
        this.f36707b.f24373a.I(j10, "inapp_html_assets_delete_time");
    }

    @Override // wi.a
    public final void o(long j10) {
        this.f36707b.f24373a.I(j10, "MOE_LAST_IN_APP_SHOWN_TIME");
    }

    @Override // wi.a
    public final List<pi.c> p() {
        Cursor cursor = null;
        try {
            try {
                cursor = this.f36707b.f24374b.g("INAPP_V3", new p0.f(l0.f32338w, new z("status = ?  AND type = ?  AND template_type = ? ", 11, new String[]{"ACTIVE", "general", "SELF_HANDLED"}), "priority DESC, last_updated_time DESC", 0, 44));
                this.f36710e.getClass();
                List<pi.c> g5 = e0.g(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return g5;
            } catch (Exception e10) {
                this.f36708c.f20105d.a(1, e10, new g());
                if (cursor != null) {
                    cursor.close();
                }
                return is.w.f20676u;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // wi.a
    public final long q() {
        return this.f36707b.f24373a.t("inapp_html_assets_delete_time", 0L);
    }

    @Override // wi.a
    public final int r(pi.p pVar) {
        try {
            v.c cVar = this.f36707b.f24374b;
            String[] strArr = {String.valueOf(pVar.f28511a)};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                return cVar2.f4302a.getWritableDatabase().delete("INAPP_STATS", "_id = ? ", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.b(cVar2));
                return -1;
            }
        } catch (Exception e11) {
            this.f36708c.f20105d.a(1, e11, new C0615b());
            return -1;
        }
    }

    @Override // wi.a
    public final long s() {
        return this.f36707b.f24373a.t("inapp_api_sync_delay", 900L);
    }

    @Override // wi.a
    public final int t(f8.g gVar, String str) {
        try {
            v.c cVar = this.f36707b.f24374b;
            this.f36710e.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", df.b.h(gVar).toString());
            String[] strArr = {str};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                return cVar2.f4302a.getWritableDatabase().update("INAPP_V3", contentValues, "campaign_id = ? ", strArr);
            } catch (Exception e10) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, e10, new bi.e(cVar2));
                return -1;
            }
        } catch (Exception e11) {
            this.f36708c.f20105d.a(1, e11, new k());
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[LOOP:0: B:22:0x007c->B:24:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    @Override // wi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        Cursor cursor;
        Set<String> set;
        bi.c cVar;
        lh.a aVar = this.f36707b;
        Context context = this.f36706a;
        kotlin.jvm.internal.i.g(context, "context");
        p sdkInstance = this.f36708c;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g gVar = sdkInstance.f20105d;
        ai.d dVar = new ai.d(context, sdkInstance);
        String timeInSecs = String.valueOf(sp.b.n());
        kotlin.jvm.internal.i.g(timeInSecs, "timeInSecs");
        try {
            cursor = aVar.f24374b.g("INAPP_V3", new p0.f(new String[]{Constants.CAMPAIGN_ID}, new z("deletion_time < ? ", 11, new String[]{timeInSecs}), null, 0, 60));
            try {
                try {
                    this.f36710e.getClass();
                    set = e0.f(cursor);
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Exception e10) {
                    e = e10;
                    gVar.a(1, e, new wi.c(this));
                    if (cursor != null) {
                        cursor.close();
                    }
                    set = y.f20678u;
                    while (r0.hasNext()) {
                    }
                    long n10 = sp.b.n();
                    v.c cVar2 = aVar.f24374b;
                    String[] strArr = {String.valueOf(n10)};
                    cVar2.getClass();
                    cVar = (bi.c) cVar2.f34634y;
                    cVar.getClass();
                    try {
                        cVar.f4302a.getWritableDatabase().delete("INAPP_V3", "deletion_time < ? ", strArr);
                    } catch (Exception e11) {
                        hh.a aVar2 = hh.g.f17610d;
                        g.a.a(1, e11, new bi.b(cVar));
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        for (String str : set) {
            dVar.c(str);
        }
        long n102 = sp.b.n();
        try {
            v.c cVar22 = aVar.f24374b;
            String[] strArr2 = {String.valueOf(n102)};
            cVar22.getClass();
            cVar = (bi.c) cVar22.f34634y;
            cVar.getClass();
            cVar.f4302a.getWritableDatabase().delete("INAPP_V3", "deletion_time < ? ", strArr2);
        } catch (Exception e13) {
            gVar.a(1, e13, new wi.d(this));
        }
    }

    @Override // wi.a
    public final List<pi.c> w() {
        Cursor cursor = null;
        try {
            try {
                cursor = this.f36707b.f24374b.g("INAPP_V3", new p0.f(l0.f32338w, new z("status = ?  AND type = ? ", 11, new String[]{"ACTIVE", "smart"}), "priority DESC, last_updated_time DESC", 0, 44));
                this.f36710e.getClass();
                List<pi.c> g5 = e0.g(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return g5;
            } catch (Exception e10) {
                this.f36708c.f20105d.a(1, e10, new j());
                if (cursor != null) {
                    cursor.close();
                }
                return is.w.f20676u;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override // wi.a
    public final pi.j x() {
        lh.a aVar = this.f36707b;
        return new pi.j(aVar.f24373a.t("in_app_global_delay", 900L), aVar.f24373a.t("MOE_LAST_IN_APP_SHOWN_TIME", 0L), sp.b.n());
    }

    @Override // wi.a
    public final void y(long j10) {
        this.f36707b.f24373a.I(j10, "in_app_global_delay");
    }

    @Override // wi.a
    public final void z(long j10) {
        this.f36707b.f24373a.I(j10, "inapp_api_sync_delay");
    }
}
