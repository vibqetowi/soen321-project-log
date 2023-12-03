package s9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v9.m;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b extends w9.a {

    /* renamed from: u  reason: collision with root package name */
    public final int f31322u;

    /* renamed from: v  reason: collision with root package name */
    public final int f31323v;

    /* renamed from: w  reason: collision with root package name */
    public final PendingIntent f31324w;

    /* renamed from: x  reason: collision with root package name */
    public final String f31325x;

    /* renamed from: y  reason: collision with root package name */
    public static final b f31321y = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new l();

    public b() {
        throw null;
    }

    public b(int i6, int i10, PendingIntent pendingIntent, String str) {
        this.f31322u = i6;
        this.f31323v = i10;
        this.f31324w = pendingIntent;
        this.f31325x = str;
    }

    public static String f0(int i6) {
        if (i6 != 99) {
            if (i6 != 1500) {
                switch (i6) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i6) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return defpackage.c.q("UNKNOWN_ERROR_CODE(", i6, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31323v == bVar.f31323v && v9.m.a(this.f31324w, bVar.f31324w) && v9.m.a(this.f31325x, bVar.f31325x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31323v), this.f31324w, this.f31325x});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(f0(this.f31323v), "statusCode");
        aVar.a(this.f31324w, "resolution");
        aVar.a(this.f31325x, "message");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f31322u);
        hc.d.s0(parcel, 2, this.f31323v);
        hc.d.w0(parcel, 3, this.f31324w, i6);
        hc.d.x0(parcel, 4, this.f31325x);
        hc.d.C0(parcel, B0);
    }

    public b(int i6) {
        this(1, i6, null, null);
    }

    public b(int i6, PendingIntent pendingIntent) {
        this(1, i6, pendingIntent, null);
    }
}
