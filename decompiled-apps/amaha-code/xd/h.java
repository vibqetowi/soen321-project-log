package xd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShortDynamicLinkImpl.java */
/* loaded from: classes.dex */
public final class h extends w9.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: u  reason: collision with root package name */
    public final Uri f37746u;

    /* renamed from: v  reason: collision with root package name */
    public final Uri f37747v;

    /* renamed from: w  reason: collision with root package name */
    public final List<a> f37748w;

    /* compiled from: ShortDynamicLinkImpl.java */
    /* loaded from: classes.dex */
    public static class a extends w9.a {
        public static final Parcelable.Creator<a> CREATOR = new j();

        /* renamed from: u  reason: collision with root package name */
        public final String f37749u;

        public a(String str) {
            this.f37749u = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            int B0 = hc.d.B0(parcel, 20293);
            hc.d.x0(parcel, 2, this.f37749u);
            hc.d.C0(parcel, B0);
        }
    }

    public h(Uri uri, Uri uri2, ArrayList arrayList) {
        this.f37746u = uri;
        this.f37747v = uri2;
        this.f37748w = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.w0(parcel, 1, this.f37746u, i6);
        hc.d.w0(parcel, 2, this.f37747v, i6);
        hc.d.A0(parcel, 3, this.f37748w);
        hc.d.C0(parcel, B0);
    }
}
