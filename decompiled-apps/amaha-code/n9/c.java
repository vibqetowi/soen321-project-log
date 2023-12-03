package n9;

import android.os.Parcel;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class c extends ja.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f25953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 2);
        this.f25953b = dVar;
    }

    @Override // ja.a
    public final boolean T1(int i6, Parcel parcel, Parcel parcel2, int i10) {
        if (i6 == 1) {
            this.f25953b.publishProgress(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()));
            parcel2.writeNoException();
        } else if (i6 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        }
        return true;
    }
}
