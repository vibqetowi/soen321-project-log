package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<MediaError> {
    @Override // android.os.Parcelable.Creator
    public final MediaError createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int q10 = SafeParcelReader.q(parcel);
        String str = null;
        Integer num = null;
        String str2 = null;
        long j10 = 0;
        String str3 = null;
        while (parcel.dataPosition() < q10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            if (c10 != 6) {
                                SafeParcelReader.p(parcel, readInt);
                            } else {
                                str3 = SafeParcelReader.d(parcel, readInt);
                            }
                        } else {
                            str2 = SafeParcelReader.d(parcel, readInt);
                        }
                    } else {
                        int o10 = SafeParcelReader.o(parcel, readInt);
                        if (o10 == 0) {
                            num = null;
                        } else {
                            SafeParcelReader.r(parcel, o10, 4);
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                } else {
                    j10 = SafeParcelReader.m(parcel, readInt);
                }
            } else {
                str = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.h(parcel, q10);
        Pattern pattern = p9.a.f28027a;
        if (str3 != null) {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException unused) {
            }
            return new MediaError(str, j10, num, str2, jSONObject);
        }
        jSONObject = null;
        return new MediaError(str, j10, num, str2, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaError[] newArray(int i6) {
        return new MediaError[i6];
    }
}
