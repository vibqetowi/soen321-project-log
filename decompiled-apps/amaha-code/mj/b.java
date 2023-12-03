package mj;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import com.theinnerhour.b2b.utils.Constants;
import fj.y;
import hh.g;
import ih.p;
import java.util.ArrayList;
import java.util.List;
import nd.z;
import qg.w;
/* compiled from: LocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class b implements mj.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25301a;

    /* renamed from: b  reason: collision with root package name */
    public final p f25302b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25303c;

    /* renamed from: d  reason: collision with root package name */
    public final lh.a f25304d;

    /* renamed from: e  reason: collision with root package name */
    public final lj.c f25305e;

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" doesCampaignExistInInbox() : ", b.this.f25303c);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* renamed from: mj.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0408b extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0408b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" doesCampaignExists() : ", b.this.f25303c);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25309v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f25309v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return b.this.f25303c + " getCampaignPayloadForCampaignId() : " + this.f25309v;
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
            return kotlin.jvm.internal.i.n(" getCampaignPayloadForCampaignId() : ", b.this.f25303c);
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
            return kotlin.jvm.internal.i.n(" getCampaignPayloadsForActiveCampaigns() : ", b.this.f25303c);
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
            return kotlin.jvm.internal.i.n(" getCampaignPayloadsForActiveCampaigns() : ", b.this.f25303c);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25314v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f25314v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return b.this.f25303c + " getTemplatePayload() : " + this.f25314v;
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
            return kotlin.jvm.internal.i.n(" getTemplatePayload() : ", b.this.f25303c);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25317v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f25317v = str;
        }

        @Override // ss.a
        public final String invoke() {
            return b.this.f25303c + " getTemplatePayloadCursor() : " + this.f25317v;
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
            return kotlin.jvm.internal.i.n(" getTemplatePayloadCursor() : ", b.this.f25303c);
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
            return kotlin.jvm.internal.i.n(" storeCampaign() : ", b.this.f25303c);
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
            return kotlin.jvm.internal.i.n(" storeCampaignId() : ", b.this.f25303c);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {
        public m() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" updateNotificationClick() : Cannot update click, received time not present", b.this.f25303c);
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
            return kotlin.jvm.internal.i.n(" updateNotificationClick() : ", b.this.f25303c);
        }
    }

    public b(Context context, p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f25301a = context;
        this.f25302b = sdkInstance;
        this.f25303c = "PushBase_6.6.0_LocalRepositoryImpl";
        ai.g.f583a.getClass();
        this.f25304d = ai.g.a(context, sdkInstance);
        this.f25305e = new lj.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        Cursor cursor = null;
        try {
            try {
                if (gv.n.B0(str)) {
                    return false;
                }
                cursor = this.f25304d.f24374b.g("MESSAGES", new p0.f(new String[]{Constants.CAMPAIGN_ID}, new z("campaign_id = ? ", 11, new String[]{str}), null, 0, 60));
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        cursor.close();
                        return true;
                    }
                }
            } catch (Exception e10) {
                this.f25302b.f20105d.a(1, e10, new a());
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final Cursor b(String str) {
        p pVar = this.f25302b;
        hh.g.b(pVar.f20105d, 0, new i(str), 3);
        try {
            return this.f25304d.f24374b.g("PUSH_REPOST_CAMPAIGNS", new p0.f(new String[]{"campaign_payload"}, new z("campaign_id =? ", 11, new String[]{str}), null, 0, 60));
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new j());
            return null;
        }
    }

    @Override // mj.a
    public final boolean d() {
        Context context = this.f25301a;
        kotlin.jvm.internal.i.g(context, "context");
        p sdkInstance = this.f25302b;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        w.f29578a.getClass();
        return w.f(context, sdkInstance).a().f20107a;
    }

    @Override // mj.a
    public final int e() {
        return this.f25304d.f24373a.s("PREF_LAST_NOTIFICATION_ID", 17987);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        return r1;
     */
    @Override // mj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Bundle> f() {
        p pVar = this.f25302b;
        hh.g.b(pVar.f20105d, 0, new e(), 3);
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f25304d.f24374b.g("PUSH_REPOST_CAMPAIGNS", new p0.f(new String[]{"campaign_payload"}, new z("expiry_time >=? ", 11, new String[]{String.valueOf(System.currentTimeMillis())}), null, 0, 60));
                if (cursor != null && cursor.moveToFirst()) {
                    do {
                        Bundle b10 = this.f25305e.b(pVar, cursor);
                        if (b10 != null) {
                            arrayList.add(b10);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (Exception e10) {
                pVar.f20105d.a(1, e10, new f());
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r6 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r6 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    @Override // mj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle g(String campaignId) {
        Cursor cursor;
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        p pVar = this.f25302b;
        hh.g.b(pVar.f20105d, 0, new c(campaignId), 3);
        Cursor cursor2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        Bundle bundle = null;
        try {
            cursor = b(campaignId);
            if (cursor != null) {
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            bundle = this.f25305e.b(pVar, cursor);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        pVar.f20105d.a(1, e, new d());
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
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r6 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r6 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // mj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pj.b h(String str) {
        Cursor cursor;
        p pVar = this.f25302b;
        hh.g.b(pVar.f20105d, 0, new g(str), 3);
        ?? r12 = 0;
        try {
            try {
                cursor = b(str);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            pj.b c10 = this.f25305e.c(pVar, cursor);
                            cursor.close();
                            return c10;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        pVar.f20105d.a(1, e, new h());
                    }
                }
            } catch (Throwable th2) {
                r12 = str;
                th = th2;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
            }
            throw th;
        }
    }

    @Override // mj.a
    public final int i(Bundle bundle) {
        String string;
        p pVar = this.f25302b;
        try {
            string = bundle.getString("gcm_campaign_id");
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new n());
            return -1;
        }
        if (string == null) {
            return -1;
        }
        this.f25305e.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("msgclicked", Boolean.TRUE);
        boolean a10 = a(string);
        lh.a aVar = this.f25304d;
        if (a10) {
            v.c cVar = aVar.f24374b;
            String[] strArr = {string};
            cVar.getClass();
            bi.c cVar2 = (bi.c) cVar.f34634y;
            cVar2.getClass();
            try {
                return cVar2.f4302a.getWritableDatabase().update("MESSAGES", contentValues, "campaign_id = ? ", strArr);
            } catch (Exception e11) {
                hh.a aVar2 = hh.g.f17610d;
                g.a.a(1, e11, new bi.e(cVar2));
                return -1;
            }
        }
        long j10 = bundle.getLong("MOE_MSG_RECEIVED_TIME", -1L);
        if (j10 == -1) {
            hh.g.b(pVar.f20105d, 0, new m(), 3);
            return -1;
        }
        v.c cVar3 = aVar.f24374b;
        String[] strArr2 = {String.valueOf(j10)};
        cVar3.getClass();
        bi.c cVar4 = (bi.c) cVar3.f34634y;
        cVar4.getClass();
        try {
            return cVar4.f4302a.getWritableDatabase().update("MESSAGES", contentValues, "gtime = ? ", strArr2);
        } catch (Exception e12) {
            hh.a aVar3 = hh.g.f17610d;
            g.a.a(1, e12, new bi.e(cVar4));
            return -1;
        }
        pVar.f20105d.a(1, e10, new n());
        return -1;
    }

    @Override // mj.a
    public final String j() {
        String y10 = this.f25304d.f24373a.y("PREF_LAST_SHOWN_CAMPAIGN_ID", "");
        if (y10 == null) {
            return "";
        }
        return y10;
    }

    @Override // mj.a
    public final void k(int i6) {
        this.f25304d.f24373a.H(i6, "PREF_LAST_NOTIFICATION_ID");
    }

    @Override // mj.a
    public final long l(pj.b bVar) {
        p sdkInstance = this.f25302b;
        try {
            Context context = this.f25301a;
            this.f25305e.getClass();
            String str = bVar.f28527b;
            String str2 = bVar.f28532h.f28517a;
            Bundle bundle = bVar.f28533i;
            mh.d dVar = new mh.d(str, str2, bundle.getLong("MOE_MSG_RECEIVED_TIME"), bVar.f, y.c(bundle));
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
            w.f29578a.getClass();
            return w.f(context, sdkInstance).f34156b.J(dVar);
        } catch (Exception e10) {
            sdkInstance.f20105d.a(1, e10, new k());
            return -1L;
        }
    }

    @Override // mj.a
    public final long m(String campaignId) {
        p pVar = this.f25302b;
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        try {
            v.c cVar = this.f25304d.f24374b;
            this.f25305e.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put(Constants.CAMPAIGN_ID, campaignId);
            contentValues.put("ttl", Long.valueOf(System.currentTimeMillis() + pVar.f20104c.f33014e.f28439a));
            return cVar.f("CAMPAIGNLIST", contentValues);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new l());
            return -1L;
        }
    }

    @Override // mj.a
    public final void n() {
        hh.g.b(this.f25302b.f20105d, 0, new mj.c(this), 3);
        lh.a aVar = this.f25304d;
        aVar.f24373a.H(1 + ((SharedPreferences) aVar.f24373a.f31226x).getInt("notification_permission_request_count", 0), "notification_permission_request_count");
    }

    @Override // mj.a
    public final void o(boolean z10) {
        Context context = this.f25301a;
        kotlin.jvm.internal.i.g(context, "context");
        p sdkInstance = this.f25302b;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        w.f29578a.getClass();
        w.f(context, sdkInstance).P(z10);
    }

    @Override // mj.a
    public final void p(String campaignId) {
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        this.f25304d.f24373a.J("PREF_LAST_SHOWN_CAMPAIGN_ID", campaignId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        return false;
     */
    @Override // mj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(String campaignId) {
        kotlin.jvm.internal.i.g(campaignId, "campaignId");
        Cursor cursor = null;
        try {
            try {
                if (gv.n.B0(campaignId)) {
                    return false;
                }
                cursor = this.f25304d.f24374b.g("CAMPAIGNLIST", new p0.f(new String[]{Constants.CAMPAIGN_ID}, new z("campaign_id =? ", 11, new String[]{campaignId}), null, 0, 60));
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        cursor.close();
                        return true;
                    }
                }
            } catch (Exception e10) {
                this.f25302b.f20105d.a(1, e10, new C0408b());
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}
