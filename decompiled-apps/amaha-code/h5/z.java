package h5;

import android.content.Intent;
import android.net.Uri;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProfileManager.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: d  reason: collision with root package name */
    public static final a f17336d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static volatile z f17337e;

    /* renamed from: a  reason: collision with root package name */
    public final n1.a f17338a;

    /* renamed from: b  reason: collision with root package name */
    public final y f17339b;

    /* renamed from: c  reason: collision with root package name */
    public x f17340c;

    /* compiled from: ProfileManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final synchronized z a() {
            z zVar;
            try {
                if (z.f17337e == null) {
                    n1.a a10 = n1.a.a(p.a());
                    kotlin.jvm.internal.i.f(a10, "getInstance(applicationContext)");
                    z.f17337e = new z(a10, new y());
                }
                zVar = z.f17337e;
                if (zVar == null) {
                    kotlin.jvm.internal.i.q("instance");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return zVar;
        }
    }

    public z(n1.a aVar, y yVar) {
        this.f17338a = aVar;
        this.f17339b = yVar;
    }

    public final void a(x xVar, boolean z10) {
        x xVar2 = this.f17340c;
        this.f17340c = xVar;
        if (z10) {
            y yVar = this.f17339b;
            if (xVar != null) {
                yVar.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", xVar.f17329u);
                    jSONObject.put("first_name", xVar.f17330v);
                    jSONObject.put("middle_name", xVar.f17331w);
                    jSONObject.put("last_name", xVar.f17332x);
                    jSONObject.put(SessionManager.KEY_NAME, xVar.f17333y);
                    Uri uri = xVar.f17334z;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = xVar.A;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    yVar.f17335a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                yVar.f17335a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!w5.e0.a(xVar2, xVar)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", xVar2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", xVar);
            this.f17338a.c(intent);
        }
    }
}
