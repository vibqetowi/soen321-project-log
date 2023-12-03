package th;

import android.content.Context;
import ih.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import qg.w;
/* compiled from: RemoteConfigHandler.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: RemoteConfigHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            c.this.getClass();
            return i.n(" loadConfig() : Loading config from Disk.", "Core_RemoteConfigHandler");
        }
    }

    /* compiled from: RemoteConfigHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            c.this.getClass();
            return i.n(" loadConfig() : ", "Core_RemoteConfigHandler");
        }
    }

    public final th.a a(Context context, p pVar) {
        th.a w10;
        hh.g gVar = pVar.f20105d;
        th.a a10 = th.b.a();
        try {
            boolean z10 = false;
            hh.g.b(gVar, 0, new a(), 3);
            w.f29578a.getClass();
            String N = w.f(context, pVar).N();
            if ((N == null || N.length() == 0) ? true : true) {
                w10 = th.b.a();
            } else {
                w10 = df.b.w(df.b.l(new JSONObject(N)));
            }
            return w10;
        } catch (Throwable th2) {
            gVar.a(1, th2, new b());
            return a10;
        }
    }
}
