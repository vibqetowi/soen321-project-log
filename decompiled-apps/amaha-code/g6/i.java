package g6;

import android.os.Parcel;
import android.os.Parcelable;
import g6.p;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: DeviceAuthMethodHandler.kt */
/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: y  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f16280y;

    /* renamed from: w  reason: collision with root package name */
    public final String f16281w;

    /* renamed from: x  reason: collision with root package name */
    public static final b f16279x = new b();
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* compiled from: DeviceAuthMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new i(source);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i6) {
            return new i[i6];
        }
    }

    /* compiled from: DeviceAuthMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class b {
    }

    public i(p pVar) {
        super(pVar);
        this.f16281w = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // g6.y
    public final String e() {
        return this.f16281w;
    }

    @Override // g6.y
    public final int k(p.d dVar) {
        androidx.fragment.app.p e10 = d().e();
        if (e10 != null && !e10.isFinishing()) {
            h hVar = new h();
            hVar.show(e10.getSupportFragmentManager(), "login_with_facebook");
            hVar.U(dVar);
            return 1;
        }
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.i.g(parcel, "parcel");
        this.f16281w = "device_auth";
    }
}
