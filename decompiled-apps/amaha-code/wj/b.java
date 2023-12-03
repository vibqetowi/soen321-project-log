package wj;

import ai.g;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.theinnerhour.b2b.utils.Constants;
import gv.n;
import hh.g;
import ih.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import mh.e;
import nd.z;
import p0.f;
import tr.r;
import v.c;
/* compiled from: LocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class b implements wj.a {

    /* renamed from: a  reason: collision with root package name */
    public final p f36733a;

    /* renamed from: b  reason: collision with root package name */
    public final String f36734b;

    /* renamed from: c  reason: collision with root package name */
    public final r f36735c;

    /* renamed from: d  reason: collision with root package name */
    public final c f36736d;

    /* compiled from: LocalRepositoryImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" doesCampaignExists() : ", b.this.f36734b);
        }
    }

    /* compiled from: LocalRepositoryImpl.kt */
    /* renamed from: wj.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0616b extends k implements ss.a<String> {
        public C0616b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" storeCampaign() : ", b.this.f36734b);
        }
    }

    public b(Context context, p pVar) {
        i.g(context, "context");
        this.f36733a = pVar;
        this.f36734b = "RichPush_4.3.2_LocalRepositoryImpl";
        this.f36735c = new r();
        g.f583a.getClass();
        this.f36736d = g.a(context, pVar).f24374b;
    }

    @Override // wj.a
    public final long a(e eVar) {
        try {
            this.f36735c.getClass();
            ContentValues q10 = r.q(eVar);
            String str = (String) eVar.f25070c;
            boolean b10 = b(str);
            c cVar = this.f36736d;
            if (b10) {
                String[] strArr = {str};
                cVar.getClass();
                bi.c cVar2 = (bi.c) cVar.f34634y;
                cVar2.getClass();
                try {
                    cVar2.f4302a.getWritableDatabase().update("PUSH_REPOST_CAMPAIGNS", q10, "campaign_id = ? ", strArr);
                } catch (Exception e10) {
                    hh.a aVar = hh.g.f17610d;
                    g.a.a(1, e10, new bi.e(cVar2));
                }
            } else {
                ((bi.c) cVar.f34634y).a("PUSH_REPOST_CAMPAIGNS", q10);
            }
            return -1L;
        } catch (Throwable th2) {
            this.f36733a.f20105d.a(1, th2, new C0616b());
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str) {
        Cursor cursor = null;
        try {
            if (n.B0(str)) {
                return false;
            }
            cursor = this.f36736d.g("PUSH_REPOST_CAMPAIGNS", new f(new String[]{Constants.CAMPAIGN_ID}, new z("campaign_id =? ", 11, new String[]{str}), null, 0, 60));
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    cursor.close();
                    return true;
                }
            }
        } catch (Throwable th2) {
            try {
                this.f36733a.f20105d.a(1, th2, new a());
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }
}
