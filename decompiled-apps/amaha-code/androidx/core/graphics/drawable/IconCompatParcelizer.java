package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1959a = versionedParcel.j(iconCompat.f1959a, 1);
        byte[] bArr = iconCompat.f1961c;
        if (versionedParcel.h(2)) {
            bArr = versionedParcel.f();
        }
        iconCompat.f1961c = bArr;
        iconCompat.f1962d = versionedParcel.l(iconCompat.f1962d, 3);
        iconCompat.f1963e = versionedParcel.j(iconCompat.f1963e, 4);
        iconCompat.f = versionedParcel.j(iconCompat.f, 5);
        iconCompat.f1964g = (ColorStateList) versionedParcel.l(iconCompat.f1964g, 6);
        String str = iconCompat.f1966i;
        if (versionedParcel.h(7)) {
            str = versionedParcel.m();
        }
        iconCompat.f1966i = str;
        String str2 = iconCompat.f1967j;
        if (versionedParcel.h(8)) {
            str2 = versionedParcel.m();
        }
        iconCompat.f1967j = str2;
        iconCompat.f1965h = PorterDuff.Mode.valueOf(iconCompat.f1966i);
        switch (iconCompat.f1959a) {
            case -1:
                Parcelable parcelable = iconCompat.f1962d;
                if (parcelable != null) {
                    iconCompat.f1960b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1962d;
                if (parcelable2 != null) {
                    iconCompat.f1960b = parcelable2;
                    break;
                } else {
                    byte[] bArr2 = iconCompat.f1961c;
                    iconCompat.f1960b = bArr2;
                    iconCompat.f1959a = 3;
                    iconCompat.f1963e = 0;
                    iconCompat.f = bArr2.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1961c, Charset.forName("UTF-16"));
                iconCompat.f1960b = str3;
                if (iconCompat.f1959a == 2 && iconCompat.f1967j == null) {
                    iconCompat.f1967j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f1960b = iconCompat.f1961c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f1966i = iconCompat.f1965h.name();
        switch (iconCompat.f1959a) {
            case -1:
                iconCompat.f1962d = (Parcelable) iconCompat.f1960b;
                break;
            case 1:
            case 5:
                iconCompat.f1962d = (Parcelable) iconCompat.f1960b;
                break;
            case 2:
                iconCompat.f1961c = ((String) iconCompat.f1960b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1961c = (byte[]) iconCompat.f1960b;
                break;
            case 4:
            case 6:
                iconCompat.f1961c = iconCompat.f1960b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i6 = iconCompat.f1959a;
        if (-1 != i6) {
            versionedParcel.t(i6, 1);
        }
        byte[] bArr = iconCompat.f1961c;
        if (bArr != null) {
            versionedParcel.o(2);
            versionedParcel.q(bArr);
        }
        Parcelable parcelable = iconCompat.f1962d;
        if (parcelable != null) {
            versionedParcel.o(3);
            versionedParcel.u(parcelable);
        }
        int i10 = iconCompat.f1963e;
        if (i10 != 0) {
            versionedParcel.t(i10, 4);
        }
        int i11 = iconCompat.f;
        if (i11 != 0) {
            versionedParcel.t(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f1964g;
        if (colorStateList != null) {
            versionedParcel.o(6);
            versionedParcel.u(colorStateList);
        }
        String str = iconCompat.f1966i;
        if (str != null) {
            versionedParcel.o(7);
            versionedParcel.v(str);
        }
        String str2 = iconCompat.f1967j;
        if (str2 != null) {
            versionedParcel.o(8);
            versionedParcel.v(str2);
        }
    }
}
