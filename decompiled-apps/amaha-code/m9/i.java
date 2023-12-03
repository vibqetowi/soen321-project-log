package m9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int q10 = SafeParcelReader.q(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j10 = 0;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case 3:
                    iArr = SafeParcelReader.b(parcel, readInt);
                    break;
                case 4:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    i11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    i12 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\n':
                    i13 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 11:
                    i14 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\f':
                    i15 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\r':
                    i16 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 14:
                    i17 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 15:
                    i18 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 16:
                    i19 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 17:
                    i20 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 18:
                    i21 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 19:
                    i22 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 20:
                    i23 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 21:
                    i24 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 22:
                    i25 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 23:
                    i26 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 24:
                    i27 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 25:
                    i28 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 26:
                    i29 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 27:
                    i30 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 28:
                    i31 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 29:
                    i32 = SafeParcelReader.l(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    i33 = SafeParcelReader.l(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    i34 = SafeParcelReader.l(parcel, readInt);
                    break;
                case ' ':
                    i35 = SafeParcelReader.l(parcel, readInt);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iBinder = SafeParcelReader.k(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        return new f(arrayList, iArr, j10, str, i6, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f[] newArray(int i6) {
        return new f[i6];
    }
}
