package xd;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.p;
import v9.o;
import ya.k;
import ya.v;
/* compiled from: FirebaseDynamicLinksImpl.java */
/* loaded from: classes.dex */
public final class e extends wd.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.common.api.b<a.c.C0144c> f37738a;

    /* renamed from: b  reason: collision with root package name */
    public final re.b<wc.a> f37739b;

    /* compiled from: FirebaseDynamicLinksImpl.java */
    /* loaded from: classes.dex */
    public static class a extends f {
    }

    /* compiled from: FirebaseDynamicLinksImpl.java */
    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final ya.i<wd.b> f37740a;

        /* renamed from: b  reason: collision with root package name */
        public final re.b<wc.a> f37741b;

        public b(re.b<wc.a> bVar, ya.i<wd.b> iVar) {
            this.f37741b = bVar;
            this.f37740a = iVar;
        }
    }

    /* compiled from: FirebaseDynamicLinksImpl.java */
    /* loaded from: classes.dex */
    public static final class c extends p<d, wd.b> {

        /* renamed from: d  reason: collision with root package name */
        public final String f37742d;

        /* renamed from: e  reason: collision with root package name */
        public final re.b<wc.a> f37743e;

        public c(re.b<wc.a> bVar, String str) {
            super(null, false, 13201);
            this.f37742d = str;
            this.f37743e = bVar;
        }

        @Override // com.google.android.gms.common.api.internal.p
        public final void a(a.e eVar, ya.i iVar) {
            d dVar = (d) eVar;
            b bVar = new b(this.f37743e, iVar);
            String str = this.f37742d;
            dVar.getClass();
            try {
                ((g) dVar.y()).Z0(bVar, str);
            } catch (RemoteException unused) {
            }
        }
    }

    public e(sc.e eVar, re.b<wc.a> bVar) {
        eVar.b();
        this.f37738a = new xd.c(eVar.f31432a);
        this.f37739b = bVar;
        if (bVar.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    @Override // wd.a
    public final v a(Intent intent) {
        String str;
        xd.a createFromParcel;
        wd.b bVar = null;
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        v b10 = this.f37738a.b(1, new c(this.f37739b, str));
        if (intent != null) {
            Parcelable.Creator<xd.a> creator = xd.a.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
            if (byteArrayExtra == null) {
                createFromParcel = null;
            } else {
                o.h(creator);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
            }
            xd.a aVar = createFromParcel;
            if (aVar != null) {
                bVar = new wd.b(aVar);
            }
            if (bVar != null) {
                return k.e(bVar);
            }
            return b10;
        }
        return b10;
    }
}
