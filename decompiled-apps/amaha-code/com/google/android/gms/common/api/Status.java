package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import java.util.Arrays;
import t9.g;
import v9.m;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class Status extends w9.a implements t9.c, ReflectedParcelable {
    public static final Status A;
    public static final Status B;
    public static final Status C;
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status D;

    /* renamed from: z  reason: collision with root package name */
    public static final Status f7296z;

    /* renamed from: u  reason: collision with root package name */
    public final int f7297u;

    /* renamed from: v  reason: collision with root package name */
    public final int f7298v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7299w;

    /* renamed from: x  reason: collision with root package name */
    public final PendingIntent f7300x;

    /* renamed from: y  reason: collision with root package name */
    public final s9.b f7301y;

    static {
        new Status(-1, null);
        f7296z = new Status(0, null);
        A = new Status(14, null);
        B = new Status(8, null);
        C = new Status(15, null);
        D = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new g();
    }

    public Status() {
        throw null;
    }

    public Status(int i6, int i10, String str, PendingIntent pendingIntent, s9.b bVar) {
        this.f7297u = i6;
        this.f7298v = i10;
        this.f7299w = str;
        this.f7300x = pendingIntent;
        this.f7301y = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f7297u != status.f7297u || this.f7298v != status.f7298v || !m.a(this.f7299w, status.f7299w) || !m.a(this.f7300x, status.f7300x) || !m.a(this.f7301y, status.f7301y)) {
            return false;
        }
        return true;
    }

    public final boolean f0() {
        if (this.f7298v <= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7297u), Integer.valueOf(this.f7298v), this.f7299w, this.f7300x, this.f7301y});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        String str = this.f7299w;
        if (str == null) {
            int i6 = this.f7298v;
            switch (i6) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = defpackage.c.p("unknown status code: ", i6);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f7300x, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.s0(parcel, 1, this.f7298v);
        d.x0(parcel, 2, this.f7299w);
        d.w0(parcel, 3, this.f7300x, i6);
        d.w0(parcel, 4, this.f7301y, i6);
        d.s0(parcel, 1000, this.f7297u);
        d.C0(parcel, B0);
    }

    public Status(int i6, String str) {
        this(1, i6, str, null, null);
    }

    @Override // t9.c
    public final Status X() {
        return this;
    }
}
