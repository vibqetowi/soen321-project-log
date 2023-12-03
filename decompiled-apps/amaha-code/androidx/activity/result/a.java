package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ActivityResult.java */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0019a();

    /* renamed from: u  reason: collision with root package name */
    public final int f976u;

    /* renamed from: v  reason: collision with root package name */
    public final Intent f977v;

    /* compiled from: ActivityResult.java */
    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0019a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    public a(Intent intent, int i6) {
        this.f976u = i6;
        this.f977v = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i6 = this.f976u;
        if (i6 != -1) {
            if (i6 != 0) {
                str = String.valueOf(i6);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.f977v);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i10;
        parcel.writeInt(this.f976u);
        Intent intent = this.f977v;
        if (intent == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        parcel.writeInt(i10);
        if (intent != null) {
            intent.writeToParcel(parcel, i6);
        }
    }

    public a(Parcel parcel) {
        this.f976u = parcel.readInt();
        this.f977v = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
