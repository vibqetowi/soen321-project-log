package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.h0;
import androidx.lifecycle.j;
import java.util.ArrayList;
/* compiled from: BackStackRecordState.java */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int A;
    public final int B;
    public final CharSequence C;
    public final int D;
    public final CharSequence E;
    public final ArrayList<String> F;
    public final ArrayList<String> G;
    public final boolean H;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f2139u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f2140v;

    /* renamed from: w  reason: collision with root package name */
    public final int[] f2141w;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2142x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2143y;

    /* renamed from: z  reason: collision with root package name */
    public final String f2144z;

    /* compiled from: BackStackRecordState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2191a.size();
        this.f2139u = new int[size * 6];
        if (aVar.f2196g) {
            this.f2140v = new ArrayList<>(size);
            this.f2141w = new int[size];
            this.f2142x = new int[size];
            int i6 = 0;
            int i10 = 0;
            while (i6 < size) {
                h0.a aVar2 = aVar.f2191a.get(i6);
                int i11 = i10 + 1;
                this.f2139u[i10] = aVar2.f2206a;
                ArrayList<String> arrayList = this.f2140v;
                Fragment fragment = aVar2.f2207b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f2139u;
                int i12 = i11 + 1;
                iArr[i11] = aVar2.f2208c ? 1 : 0;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f2209d;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f2210e;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f;
                iArr[i15] = aVar2.f2211g;
                this.f2141w[i6] = aVar2.f2212h.ordinal();
                this.f2142x[i6] = aVar2.f2213i.ordinal();
                i6++;
                i10 = i15 + 1;
            }
            this.f2143y = aVar.f;
            this.f2144z = aVar.f2198i;
            this.A = aVar.f2131s;
            this.B = aVar.f2199j;
            this.C = aVar.f2200k;
            this.D = aVar.f2201l;
            this.E = aVar.f2202m;
            this.F = aVar.f2203n;
            this.G = aVar.f2204o;
            this.H = aVar.f2205p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i6 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f2139u;
            boolean z10 = true;
            if (i6 < iArr.length) {
                h0.a aVar2 = new h0.a();
                int i11 = i6 + 1;
                aVar2.f2206a = iArr[i6];
                if (y.P(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i10 + " base fragment #" + iArr[i11]);
                }
                aVar2.f2212h = j.c.values()[this.f2141w[i10]];
                aVar2.f2213i = j.c.values()[this.f2142x[i10]];
                int i12 = i11 + 1;
                if (iArr[i11] == 0) {
                    z10 = false;
                }
                aVar2.f2208c = z10;
                int i13 = i12 + 1;
                int i14 = iArr[i12];
                aVar2.f2209d = i14;
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                aVar2.f2210e = i16;
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                aVar2.f = i18;
                int i19 = iArr[i17];
                aVar2.f2211g = i19;
                aVar.f2192b = i14;
                aVar.f2193c = i16;
                aVar.f2194d = i18;
                aVar.f2195e = i19;
                aVar.b(aVar2);
                i10++;
                i6 = i17 + 1;
            } else {
                aVar.f = this.f2143y;
                aVar.f2198i = this.f2144z;
                aVar.f2196g = true;
                aVar.f2199j = this.B;
                aVar.f2200k = this.C;
                aVar.f2201l = this.D;
                aVar.f2202m = this.E;
                aVar.f2203n = this.F;
                aVar.f2204o = this.G;
                aVar.f2205p = this.H;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.f2139u);
        parcel.writeStringList(this.f2140v);
        parcel.writeIntArray(this.f2141w);
        parcel.writeIntArray(this.f2142x);
        parcel.writeInt(this.f2143y);
        parcel.writeString(this.f2144z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        TextUtils.writeToParcel(this.C, parcel, 0);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeStringList(this.F);
        parcel.writeStringList(this.G);
        parcel.writeInt(this.H ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f2139u = parcel.createIntArray();
        this.f2140v = parcel.createStringArrayList();
        this.f2141w = parcel.createIntArray();
        this.f2142x = parcel.createIntArray();
        this.f2143y = parcel.readInt();
        this.f2144z = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.D = parcel.readInt();
        this.E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.createStringArrayList();
        this.G = parcel.createStringArrayList();
        this.H = parcel.readInt() != 0;
    }
}
