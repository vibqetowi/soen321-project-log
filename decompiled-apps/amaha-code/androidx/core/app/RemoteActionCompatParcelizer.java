package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1947a;
        if (versionedParcel.h(1)) {
            obj = versionedParcel.n();
        }
        remoteActionCompat.f1947a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1948b;
        if (versionedParcel.h(2)) {
            charSequence = versionedParcel.g();
        }
        remoteActionCompat.f1948b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1949c;
        if (versionedParcel.h(3)) {
            charSequence2 = versionedParcel.g();
        }
        remoteActionCompat.f1949c = charSequence2;
        remoteActionCompat.f1950d = (PendingIntent) versionedParcel.l(remoteActionCompat.f1950d, 4);
        boolean z10 = remoteActionCompat.f1951e;
        if (versionedParcel.h(5)) {
            z10 = versionedParcel.e();
        }
        remoteActionCompat.f1951e = z10;
        boolean z11 = remoteActionCompat.f;
        if (versionedParcel.h(6)) {
            z11 = versionedParcel.e();
        }
        remoteActionCompat.f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f1947a;
        versionedParcel.o(1);
        versionedParcel.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1948b;
        versionedParcel.o(2);
        versionedParcel.r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1949c;
        versionedParcel.o(3);
        versionedParcel.r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1950d;
        versionedParcel.o(4);
        versionedParcel.u(pendingIntent);
        boolean z10 = remoteActionCompat.f1951e;
        versionedParcel.o(5);
        versionedParcel.p(z10);
        boolean z11 = remoteActionCompat.f;
        versionedParcel.o(6);
        versionedParcel.p(z11);
    }
}
