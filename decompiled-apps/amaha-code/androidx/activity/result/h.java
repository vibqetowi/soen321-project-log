package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: IntentSenderRequest.java */
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final IntentSender f995u;

    /* renamed from: v  reason: collision with root package name */
    public final Intent f996v;

    /* renamed from: w  reason: collision with root package name */
    public final int f997w;

    /* renamed from: x  reason: collision with root package name */
    public final int f998x;

    /* compiled from: IntentSenderRequest.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i6) {
            return new h[i6];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i6, int i10) {
        this.f995u = intentSender;
        this.f996v = intent;
        this.f997w = i6;
        this.f998x = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f995u, i6);
        parcel.writeParcelable(this.f996v, i6);
        parcel.writeInt(this.f997w);
        parcel.writeInt(this.f998x);
    }

    public h(Parcel parcel) {
        this.f995u = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f996v = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f997w = parcel.readInt();
        this.f998x = parcel.readInt();
    }
}
