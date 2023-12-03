package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: GifViewSavedState.java */
/* loaded from: classes2.dex */
public final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final long[][] f28576u;

    /* compiled from: GifViewSavedState.java */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i6) {
            return new c[i6];
        }
    }

    public c(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f28576u = new long[drawableArr.length];
        for (int i6 = 0; i6 < drawableArr.length; i6++) {
            Drawable drawable = drawableArr[i6];
            if (drawable instanceof b) {
                this.f28576u[i6] = ((b) drawable).A.i();
            } else {
                this.f28576u[i6] = null;
            }
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        long[][] jArr = this.f28576u;
        parcel.writeInt(jArr.length);
        for (long[] jArr2 : jArr) {
            parcel.writeLongArray(jArr2);
        }
    }

    public c(Parcel parcel) {
        super(parcel);
        this.f28576u = new long[parcel.readInt()];
        int i6 = 0;
        while (true) {
            long[][] jArr = this.f28576u;
            if (i6 >= jArr.length) {
                return;
            }
            jArr[i6] = parcel.createLongArray();
            i6++;
        }
    }
}
