package g6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import g6.p;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import w5.d;
import w5.w;
/* compiled from: KatanaProxyLoginMethodHandler.kt */
/* loaded from: classes.dex */
public final class n extends b0 {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: x  reason: collision with root package name */
    public final String f16289x;

    /* compiled from: KatanaProxyLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new n(source);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i6) {
            return new n[i6];
        }
    }

    public n(p pVar) {
        super(pVar);
        this.f16289x = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // g6.y
    public final String e() {
        return this.f16289x;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    @Override // g6.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(p.d dVar) {
        boolean z10;
        Class<w5.w> cls;
        String str;
        ArrayList<Intent> arrayList;
        if (h5.p.f17281n && w5.f.a() != null && dVar.f16302u.f16294y) {
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "e2e.toString()");
        w5.w wVar = w5.w.f36549a;
        d().e();
        String applicationId = dVar.f16305x;
        Set<String> permissions = dVar.f16303v;
        boolean a10 = dVar.a();
        d dVar2 = dVar.f16304w;
        if (dVar2 == null) {
            dVar2 = d.NONE;
        }
        d dVar3 = dVar2;
        String c10 = c(dVar.f16306y);
        String authType = dVar.B;
        String str2 = dVar.D;
        boolean z11 = dVar.E;
        boolean z12 = dVar.G;
        boolean z13 = dVar.H;
        String str3 = dVar.I;
        g6.a aVar = dVar.L;
        if (aVar != null) {
            aVar.name();
        }
        Class<w5.w> cls2 = w5.w.class;
        if (b6.a.b(cls2)) {
            str = jSONObject2;
        } else {
            try {
                kotlin.jvm.internal.i.g(applicationId, "applicationId");
                kotlin.jvm.internal.i.g(permissions, "permissions");
                kotlin.jvm.internal.i.g(authType, "authType");
                ArrayList<w.e> arrayList2 = w5.w.f36551c;
                arrayList = new ArrayList();
                for (w.e eVar : arrayList2) {
                    ArrayList arrayList3 = arrayList;
                    cls = cls2;
                    String str4 = str3;
                    String str5 = applicationId;
                    boolean z14 = z13;
                    boolean z15 = z12;
                    boolean z16 = z11;
                    String str6 = str2;
                    String str7 = authType;
                    Set<String> set = permissions;
                    String str8 = applicationId;
                    boolean z17 = z10;
                    boolean z18 = z10;
                    str = jSONObject2;
                    try {
                        Intent c11 = w5.w.f36549a.c(eVar, str5, permissions, jSONObject2, a10, dVar3, c10, str7, z17, str6, z16, a0.FACEBOOK, z15, z14, str4);
                        if (c11 != null) {
                            arrayList3.add(c11);
                        }
                        jSONObject2 = str;
                        cls2 = cls;
                        arrayList = arrayList3;
                        str3 = str4;
                        z13 = z14;
                        z12 = z15;
                        z11 = z16;
                        str2 = str6;
                        authType = str7;
                        permissions = set;
                        applicationId = str8;
                        z10 = z18;
                    } catch (Throwable th2) {
                        th = th2;
                        b6.a.a(cls, th);
                        arrayList = null;
                        a(str, "e2e");
                        int i6 = 0;
                        while (r0.hasNext()) {
                        }
                        return 0;
                    }
                }
                str = jSONObject2;
            } catch (Throwable th3) {
                th = th3;
                cls = cls2;
                str = jSONObject2;
            }
            a(str, "e2e");
            int i62 = 0;
            for (Intent intent : arrayList) {
                i62++;
                d.c.Login.d();
                if (p(intent)) {
                    return i62;
                }
            }
            return 0;
        }
        arrayList = null;
        a(str, "e2e");
        int i622 = 0;
        while (r0.hasNext()) {
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
        this.f16289x = "katana_proxy_auth";
    }
}
