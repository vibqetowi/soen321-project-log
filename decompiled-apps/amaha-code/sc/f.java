package sc;

import aa.i;
import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.widget.l;
import java.util.Arrays;
import v9.m;
import v9.o;
/* compiled from: FirebaseOptions.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f31444a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31445b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31446c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31447d;

    /* renamed from: e  reason: collision with root package name */
    public final String f31448e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f31449g;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.j("ApplicationId must be set.", !i.b(str));
        this.f31445b = str;
        this.f31444a = str2;
        this.f31446c = str3;
        this.f31447d = str4;
        this.f31448e = str5;
        this.f = str6;
        this.f31449g = str7;
    }

    public static f a(Context context) {
        l lVar = new l(context);
        String n10 = lVar.n("google_app_id");
        if (TextUtils.isEmpty(n10)) {
            return null;
        }
        return new f(n10, lVar.n("google_api_key"), lVar.n("firebase_database_url"), lVar.n("ga_trackingId"), lVar.n("gcm_defaultSenderId"), lVar.n("google_storage_bucket"), lVar.n("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!m.a(this.f31445b, fVar.f31445b) || !m.a(this.f31444a, fVar.f31444a) || !m.a(this.f31446c, fVar.f31446c) || !m.a(this.f31447d, fVar.f31447d) || !m.a(this.f31448e, fVar.f31448e) || !m.a(this.f, fVar.f) || !m.a(this.f31449g, fVar.f31449g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31445b, this.f31444a, this.f31446c, this.f31447d, this.f31448e, this.f, this.f31449g});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f31445b, "applicationId");
        aVar.a(this.f31444a, "apiKey");
        aVar.a(this.f31446c, "databaseUrl");
        aVar.a(this.f31448e, "gcmSenderId");
        aVar.a(this.f, "storageBucket");
        aVar.a(this.f31449g, "projectId");
        return aVar.toString();
    }
}
