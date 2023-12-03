package h5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import h5.a;
import java.util.Date;
import org.json.JSONObject;
import w5.e0;
/* compiled from: Profile.kt */
/* loaded from: classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();
    public final Uri A;

    /* renamed from: u  reason: collision with root package name */
    public final String f17329u;

    /* renamed from: v  reason: collision with root package name */
    public final String f17330v;

    /* renamed from: w  reason: collision with root package name */
    public final String f17331w;

    /* renamed from: x  reason: collision with root package name */
    public final String f17332x;

    /* renamed from: y  reason: collision with root package name */
    public final String f17333y;

    /* renamed from: z  reason: collision with root package name */
    public final Uri f17334z;

    /* compiled from: Profile.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new x(source);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i6) {
            return new x[i6];
        }
    }

    /* compiled from: Profile.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* compiled from: Profile.kt */
        /* loaded from: classes.dex */
        public static final class a implements e0.a {
            @Override // w5.e0.a
            public final void a(FacebookException facebookException) {
                Parcelable.Creator<x> creator = x.CREATOR;
                Log.e("x", kotlin.jvm.internal.i.n(facebookException, "Got unexpected exception: "));
            }

            @Override // w5.e0.a
            public final void onSuccess(JSONObject jSONObject) {
                String optString;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject == null) {
                    optString = null;
                } else {
                    optString = jSONObject.optString("id");
                }
                if (optString == null) {
                    Parcelable.Creator<x> creator = x.CREATOR;
                    Log.w("x", "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString(Constants.API_COURSE_LINK);
                String optString3 = jSONObject.optString("profile_picture", null);
                String optString4 = jSONObject.optString("first_name");
                String optString5 = jSONObject.optString("middle_name");
                String optString6 = jSONObject.optString("last_name");
                String optString7 = jSONObject.optString(SessionManager.KEY_NAME);
                if (optString2 != null) {
                    uri = Uri.parse(optString2);
                } else {
                    uri = null;
                }
                if (optString3 != null) {
                    uri2 = Uri.parse(optString3);
                }
                z.f17336d.a().a(new x(optString, optString4, optString5, optString6, optString7, uri, uri2), true);
            }
        }

        public static void a() {
            Date date = h5.a.F;
            h5.a b10 = a.b.b();
            if (b10 == null) {
                return;
            }
            if (!a.b.c()) {
                z.f17336d.a().a(null, true);
                return;
            }
            w5.e0 e0Var = w5.e0.f36453a;
            w5.e0.p(new a(), b10.f17180y);
        }
    }

    public x(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        w5.f0.d(str, "id");
        this.f17329u = str;
        this.f17330v = str2;
        this.f17331w = str3;
        this.f17332x = str4;
        this.f17333y = str5;
        this.f17334z = uri;
        this.A = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        String str5 = this.f17329u;
        if (((str5 == null && ((x) obj).f17329u == null) || kotlin.jvm.internal.i.b(str5, ((x) obj).f17329u)) && ((((str = this.f17330v) == null && ((x) obj).f17330v == null) || kotlin.jvm.internal.i.b(str, ((x) obj).f17330v)) && ((((str2 = this.f17331w) == null && ((x) obj).f17331w == null) || kotlin.jvm.internal.i.b(str2, ((x) obj).f17331w)) && ((((str3 = this.f17332x) == null && ((x) obj).f17332x == null) || kotlin.jvm.internal.i.b(str3, ((x) obj).f17332x)) && ((((str4 = this.f17333y) == null && ((x) obj).f17333y == null) || kotlin.jvm.internal.i.b(str4, ((x) obj).f17333y)) && ((((uri = this.f17334z) == null && ((x) obj).f17334z == null) || kotlin.jvm.internal.i.b(uri, ((x) obj).f17334z)) && (((uri2 = this.A) == null && ((x) obj).A == null) || kotlin.jvm.internal.i.b(uri2, ((x) obj).A)))))))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        String str = this.f17329u;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i10 = 527 + i6;
        String str2 = this.f17330v;
        if (str2 != null) {
            i10 = (i10 * 31) + str2.hashCode();
        }
        String str3 = this.f17331w;
        if (str3 != null) {
            i10 = (i10 * 31) + str3.hashCode();
        }
        String str4 = this.f17332x;
        if (str4 != null) {
            i10 = (i10 * 31) + str4.hashCode();
        }
        String str5 = this.f17333y;
        if (str5 != null) {
            i10 = (i10 * 31) + str5.hashCode();
        }
        Uri uri = this.f17334z;
        if (uri != null) {
            i10 = (i10 * 31) + uri.hashCode();
        }
        Uri uri2 = this.A;
        if (uri2 != null) {
            return (i10 * 31) + uri2.hashCode();
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        String uri;
        kotlin.jvm.internal.i.g(dest, "dest");
        dest.writeString(this.f17329u);
        dest.writeString(this.f17330v);
        dest.writeString(this.f17331w);
        dest.writeString(this.f17332x);
        dest.writeString(this.f17333y);
        String str = null;
        Uri uri2 = this.f17334z;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        dest.writeString(uri);
        Uri uri3 = this.A;
        if (uri3 != null) {
            str = uri3.toString();
        }
        dest.writeString(str);
    }

    public x(JSONObject jSONObject) {
        this.f17329u = jSONObject.optString("id", null);
        this.f17330v = jSONObject.optString("first_name", null);
        this.f17331w = jSONObject.optString("middle_name", null);
        this.f17332x = jSONObject.optString("last_name", null);
        this.f17333y = jSONObject.optString(SessionManager.KEY_NAME, null);
        String optString = jSONObject.optString("link_uri", null);
        this.f17334z = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.A = optString2 != null ? Uri.parse(optString2) : null;
    }

    public x(Parcel parcel) {
        this.f17329u = parcel.readString();
        this.f17330v = parcel.readString();
        this.f17331w = parcel.readString();
        this.f17332x = parcel.readString();
        this.f17333y = parcel.readString();
        String readString = parcel.readString();
        this.f17334z = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.A = readString2 != null ? Uri.parse(readString2) : null;
    }
}
