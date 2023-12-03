package g6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import g6.p;
import g6.y;
import java.util.ArrayList;
/* compiled from: GetTokenLoginMethodHandler.kt */
/* loaded from: classes.dex */
public final class k extends y {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: w  reason: collision with root package name */
    public j f16282w;

    /* renamed from: x  reason: collision with root package name */
    public final String f16283x;

    /* compiled from: GetTokenLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new k(source);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i6) {
            return new k[i6];
        }
    }

    public k(p pVar) {
        super(pVar);
        this.f16283x = "get_token";
    }

    @Override // g6.y
    public final void b() {
        j jVar = this.f16282w;
        if (jVar != null) {
            jVar.f36560x = false;
            jVar.f36559w = null;
            this.f16282w = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // g6.y
    public final String e() {
        return this.f16283x;
    }

    @Override // g6.y
    public final int k(p.d dVar) {
        int i6;
        boolean z10;
        Context e10 = d().e();
        if (e10 == null) {
            e10 = h5.p.a();
        }
        j jVar = new j(e10, dVar);
        this.f16282w = jVar;
        synchronized (jVar) {
            if (!jVar.f36560x) {
                w5.w wVar = w5.w.f36549a;
                int i10 = jVar.C;
                if (!b6.a.b(w5.w.class)) {
                    i6 = w5.w.f36549a.g(w5.w.f36551c, new int[]{i10}).f36555a;
                } else {
                    i6 = 0;
                }
                if (i6 != -1) {
                    w5.w wVar2 = w5.w.f36549a;
                    Intent d10 = w5.w.d(jVar.f36557u);
                    if (d10 == null) {
                        z10 = false;
                    } else {
                        jVar.f36560x = true;
                        jVar.f36557u.bindService(d10, jVar, 1);
                        z10 = true;
                    }
                }
            }
            z10 = false;
        }
        if (kotlin.jvm.internal.i.b(Boolean.valueOf(z10), Boolean.FALSE)) {
            return 0;
        }
        p.a aVar = d().f16300y;
        if (aVar != null) {
            aVar.a();
        }
        dd.a aVar2 = new dd.a(this, 3, dVar);
        j jVar2 = this.f16282w;
        if (jVar2 != null) {
            jVar2.f36559w = aVar2;
        }
        return 1;
    }

    public final void l(Bundle result, p.d request) {
        p.e eVar;
        h5.a a10;
        String str;
        String string;
        h5.h hVar;
        boolean z10;
        kotlin.jvm.internal.i.g(request, "request");
        kotlin.jvm.internal.i.g(result, "result");
        try {
            a10 = y.a.a(result, request.f16305x);
            str = request.I;
            string = result.getString("com.facebook.platform.extra.ID_TOKEN");
        } catch (FacebookException e10) {
            p.d dVar = d().A;
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            eVar = new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        if (string != null) {
            boolean z11 = true;
            if (string.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && str != null) {
                if (str.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        hVar = new h5.h(string, str);
                        eVar = new p.e(request, p.e.a.SUCCESS, a10, hVar, null, null);
                        d().d(eVar);
                    } catch (Exception e11) {
                        throw new FacebookException(e11.getMessage());
                    }
                }
            }
        }
        hVar = null;
        eVar = new p.e(request, p.e.a.SUCCESS, a10, hVar, null, null);
        d().d(eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
        this.f16283x = "get_token";
    }
}
