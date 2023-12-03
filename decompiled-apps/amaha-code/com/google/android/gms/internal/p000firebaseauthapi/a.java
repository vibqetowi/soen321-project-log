package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import hc.d;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a  reason: invalid package */
/* loaded from: classes.dex */
public final class a extends w9.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: u  reason: collision with root package name */
    public final String f7695u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7696v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7697w;

    /* renamed from: x  reason: collision with root package name */
    public final long f7698x;

    public a(long j10, String str, String str2, String str3) {
        this.f7695u = str;
        o.e(str2);
        this.f7696v = str2;
        this.f7697w = str3;
        this.f7698x = j10;
    }

    public static ArrayList f0(JSONArray jSONArray) {
        long j10;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i6);
                String optString = jSONObject.optString("phoneInfo", null);
                String optString2 = jSONObject.optString("mfaEnrollmentId", null);
                String optString3 = jSONObject.optString("displayName", null);
                String replaceAll = jSONObject.optString("enrolledAt", "").replaceAll("\\.[0-9]{0,9}Z$|Z$", ".000Z");
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    j10 = simpleDateFormat.parse(replaceAll).getTime();
                } catch (ParseException e10) {
                    Log.w("MfaInfo", "Could not parse timestamp as ISOString", e10);
                    j10 = 0;
                }
                a aVar = new a(j10, optString, optString2, optString3);
                jSONObject.optString("unobfuscatedPhoneInfo");
                arrayList.add(aVar);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 1, this.f7695u);
        d.x0(parcel, 2, this.f7696v);
        d.x0(parcel, 3, this.f7697w);
        d.u0(parcel, 4, this.f7698x);
        d.C0(parcel, B0);
    }
}
