package g6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import g6.p;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import w5.d;
import w5.w;
/* compiled from: InstagramAppLoginMethodHandler.kt */
/* loaded from: classes.dex */
public final class m extends b0 {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: x  reason: collision with root package name */
    public final String f16287x;

    /* renamed from: y  reason: collision with root package name */
    public final h5.g f16288y;

    /* compiled from: InstagramAppLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new m(source);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i6) {
            return new m[i6];
        }
    }

    public m(p pVar) {
        super(pVar);
        this.f16287x = "instagram_login";
        this.f16288y = h5.g.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // g6.y
    public final String e() {
        return this.f16287x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (w5.j.a(r3, r4) == false) goto L12;
     */
    @Override // g6.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(p.d dVar) {
        Object obj;
        Intent c10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "e2e.toString()");
        w5.w wVar = w5.w.f36549a;
        Context e10 = d().e();
        if (e10 == null) {
            e10 = h5.p.a();
        }
        String applicationId = dVar.f16305x;
        Set<String> permissions = dVar.f16303v;
        boolean a10 = dVar.a();
        d dVar2 = dVar.f16304w;
        if (dVar2 == null) {
            dVar2 = d.NONE;
        }
        d dVar3 = dVar2;
        String c11 = c(dVar.f16306y);
        String authType = dVar.B;
        String str = dVar.D;
        boolean z10 = dVar.E;
        boolean z11 = dVar.G;
        boolean z12 = dVar.H;
        if (!b6.a.b(w5.w.class)) {
            try {
                kotlin.jvm.internal.i.g(applicationId, "applicationId");
                kotlin.jvm.internal.i.g(permissions, "permissions");
                kotlin.jvm.internal.i.g(authType, "authType");
                try {
                    c10 = w5.w.f36549a.c(new w.b(), applicationId, permissions, jSONObject2, a10, dVar3, c11, authType, false, str, z10, a0.INSTAGRAM, z11, z12, "");
                    if (!b6.a.b(w5.w.class) && c10 != null) {
                        try {
                            ResolveInfo resolveActivity = e10.getPackageManager().resolveActivity(c10, 0);
                            if (resolveActivity != null) {
                                HashSet<String> hashSet = w5.j.f36476a;
                                String str2 = resolveActivity.activityInfo.packageName;
                                kotlin.jvm.internal.i.f(str2, "resolveInfo.activityInfo.packageName");
                            }
                        } catch (Throwable th2) {
                            obj = w5.w.class;
                            try {
                                b6.a.a(obj, th2);
                            } catch (Throwable th3) {
                                th = th3;
                                b6.a.a(obj, th);
                                c10 = null;
                                a(jSONObject2, "e2e");
                                d.c.Login.d();
                                return p(c10) ? 1 : 0;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = w5.w.class;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = w5.w.class;
            }
        }
        c10 = null;
        a(jSONObject2, "e2e");
        d.c.Login.d();
        return p(c10) ? 1 : 0;
    }

    @Override // g6.b0
    public final h5.g m() {
        return this.f16288y;
    }

    @Override // g6.y, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        super.writeToParcel(dest, i6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
        this.f16287x = "instagram_login";
        this.f16288y = h5.g.INSTAGRAM_APPLICATION_WEB;
    }
}
