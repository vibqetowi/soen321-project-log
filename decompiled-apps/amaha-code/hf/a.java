package hf;

import android.os.Parcel;
import android.os.Parcelable;
import bf.r;
import java.util.List;
import java.util.UUID;
import kf.e;
import kf.i;
import lf.k;
/* compiled from: PerfSession.java */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0280a();

    /* renamed from: u  reason: collision with root package name */
    public final String f17592u;

    /* renamed from: v  reason: collision with root package name */
    public final i f17593v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f17594w;

    /* compiled from: PerfSession.java */
    /* renamed from: hf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0280a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(String str, df.b bVar) {
        this.f17594w = false;
        this.f17592u = str;
        this.f17593v = new i();
    }

    public static k[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i6 = 1; i6 < list.size(); i6++) {
            k a11 = list.get(i6).a();
            if (!z10 && list.get(i6).f17594w) {
                kVarArr[0] = a11;
                kVarArr[i6] = a10;
                z10 = true;
            } else {
                kVarArr[i6] = a11;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (bf.a.v(r4) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a c() {
        boolean z10;
        r rVar;
        float floatValue;
        a aVar = new a(UUID.randomUUID().toString().replace("-", ""), new df.b(17));
        bf.a e10 = bf.a.e();
        if (e10.u()) {
            double random = Math.random();
            synchronized (r.class) {
                if (r.f4272v == null) {
                    r.f4272v = new r();
                }
                rVar = r.f4272v;
            }
            e<Float> j10 = e10.j(rVar);
            if (j10.b()) {
                floatValue = j10.a().floatValue() / 100.0f;
            }
            e<Float> eVar = e10.f4252a.getFloat("fpr_vc_session_sampling_rate");
            if (eVar.b() && bf.a.v(eVar.a().floatValue())) {
                e10.f4254c.c(eVar.a().floatValue(), "com.google.firebase.perf.SessionSamplingRate");
                floatValue = eVar.a().floatValue();
            } else {
                e<Float> b10 = e10.b(rVar);
                if (b10.b() && bf.a.v(b10.a().floatValue())) {
                    floatValue = b10.a().floatValue();
                } else {
                    floatValue = Float.valueOf(0.01f).floatValue();
                }
            }
            if (random < floatValue) {
                z10 = true;
                aVar.f17594w = z10;
                return aVar;
            }
        }
        z10 = false;
        aVar.f17594w = z10;
        return aVar;
    }

    public final k a() {
        k.b Q = k.Q();
        Q.u();
        k.M((k) Q.f10073v, this.f17592u);
        if (this.f17594w) {
            Q.u();
            k.N((k) Q.f10073v);
        }
        return Q.r();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f17592u);
        parcel.writeByte(this.f17594w ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f17593v, 0);
    }

    public a(Parcel parcel) {
        this.f17594w = false;
        this.f17592u = parcel.readString();
        this.f17594w = parcel.readByte() != 0;
        this.f17593v = (i) parcel.readParcelable(i.class.getClassLoader());
    }
}
