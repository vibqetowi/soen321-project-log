package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class q0 implements Parcelable.Creator<MediaTrack> {
    @Override // android.os.Parcelable.Creator
    public final MediaTrack createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int q10 = SafeParcelReader.q(parcel);
        long j10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        int i6 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j10 = SafeParcelReader.m(parcel, readInt);
                    break;
                case 3:
                    i6 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\b':
                    i10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case '\n':
                    str = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.h(parcel, q10);
        Pattern pattern = p9.a.f28027a;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            return new MediaTrack(j10, i6, str2, str3, str4, str5, i10, arrayList, jSONObject);
        }
        jSONObject = null;
        return new MediaTrack(j10, i6, str2, str3, str4, str5, i10, arrayList, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaTrack[] newArray(int i6) {
        return new MediaTrack[i6];
    }
}
