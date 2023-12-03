package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import r1.b0;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + r0 + " size=" + r4);
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
        }
    }

    public static Bundle a(Parcel parcel, int i6) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o10);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i6) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + o10);
        return createIntArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i6, Parcelable.Creator<T> creator) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o10);
        return createFromParcel;
    }

    public static String d(Parcel parcel, int i6) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + o10);
        return readString;
    }

    public static ArrayList<String> e(Parcel parcel, int i6) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + o10);
        return createStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i6, Parcelable.Creator<T> creator) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + o10);
        return tArr;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i6, Parcelable.Creator<T> creator) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + o10);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i6) {
        if (parcel.dataPosition() == i6) {
            return;
        }
        throw new ParseException(c.p("Overread allowed size end=", i6), parcel);
    }

    public static boolean i(Parcel parcel, int i6) {
        s(parcel, i6, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static double j(Parcel parcel, int i6) {
        s(parcel, i6, 8);
        return parcel.readDouble();
    }

    public static IBinder k(Parcel parcel, int i6) {
        int o10 = o(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (o10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o10);
        return readStrongBinder;
    }

    public static int l(Parcel parcel, int i6) {
        s(parcel, i6, 4);
        return parcel.readInt();
    }

    public static long m(Parcel parcel, int i6) {
        s(parcel, i6, 8);
        return parcel.readLong();
    }

    public static Long n(Parcel parcel, int i6) {
        int o10 = o(parcel, i6);
        if (o10 == 0) {
            return null;
        }
        r(parcel, o10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int o(Parcel parcel, int i6) {
        if ((i6 & (-65536)) != -65536) {
            return (char) (i6 >> 16);
        }
        return parcel.readInt();
    }

    public static void p(Parcel parcel, int i6) {
        parcel.setDataPosition(parcel.dataPosition() + o(parcel, i6));
    }

    public static int q(Parcel parcel) {
        int readInt = parcel.readInt();
        int o10 = o(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) == 20293) {
            int i6 = o10 + dataPosition;
            if (i6 >= dataPosition && i6 <= parcel.dataSize()) {
                return i6;
            }
            throw new ParseException(b.j("Size read is invalid start=", dataPosition, " end=", i6), parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void r(Parcel parcel, int i6, int i10) {
        if (i6 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i6);
        StringBuilder sb2 = new StringBuilder("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(i6);
        sb2.append(" (0x");
        throw new ParseException(b0.b(sb2, hexString, ")"), parcel);
    }

    public static void s(Parcel parcel, int i6, int i10) {
        int o10 = o(parcel, i6);
        if (o10 == i10) {
            return;
        }
        String hexString = Integer.toHexString(o10);
        StringBuilder sb2 = new StringBuilder("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(o10);
        sb2.append(" (0x");
        throw new ParseException(b0.b(sb2, hexString, ")"), parcel);
    }
}
