package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import hc.d;
import i9.e;
import i9.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import v9.o;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class GoogleSignInOptions extends w9.a implements a.c, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions F;
    public static final Scope G;
    public static final Scope H;
    public static final Scope I;
    public static final Scope J;
    public static final e K;
    public final String A;
    public final String B;
    public final ArrayList<j9.a> C;
    public final String D;
    public final Map<Integer, j9.a> E;

    /* renamed from: u  reason: collision with root package name */
    public final int f7222u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<Scope> f7223v;

    /* renamed from: w  reason: collision with root package name */
    public final Account f7224w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f7225x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f7226y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f7227z;

    static {
        Scope scope = new Scope(1, Constants.SCREEN_PROFILE);
        G = new Scope(1, SessionManager.KEY_EMAIL);
        Scope scope2 = new Scope(1, "openid");
        H = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        I = scope3;
        J = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(J)) {
            Scope scope4 = I;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        F = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(J)) {
            Scope scope5 = I;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new f();
        K = new e();
    }

    public GoogleSignInOptions() {
        throw null;
    }

    public GoogleSignInOptions(int i6, ArrayList<Scope> arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map<Integer, j9.a> map, String str3) {
        this.f7222u = i6;
        this.f7223v = arrayList;
        this.f7224w = account;
        this.f7225x = z10;
        this.f7226y = z11;
        this.f7227z = z12;
        this.A = str;
        this.B = str2;
        this.C = new ArrayList<>(map.values());
        this.E = map;
        this.D = str3;
    }

    public static GoogleSignInOptions f0(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new Scope(1, jSONArray.getString(i6)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, str3, str4, new HashMap(), null);
    }

    public static HashMap g0(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList == null) {
            return hashMap;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j9.a aVar = (j9.a) it.next();
            hashMap.put(Integer.valueOf(aVar.f21751v), aVar);
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.A;
        ArrayList<Scope> arrayList = this.f7223v;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.C.size() <= 0) {
                ArrayList<j9.a> arrayList2 = googleSignInOptions.C;
                ArrayList<Scope> arrayList3 = googleSignInOptions.f7223v;
                if (arrayList2.size() <= 0 && arrayList.size() == new ArrayList(arrayList3).size() && arrayList.containsAll(new ArrayList(arrayList3))) {
                    Account account = this.f7224w;
                    Account account2 = googleSignInOptions.f7224w;
                    if (account != null ? account.equals(account2) : account2 == null) {
                        boolean isEmpty = TextUtils.isEmpty(str);
                        String str2 = googleSignInOptions.A;
                        if (isEmpty) {
                            if (TextUtils.isEmpty(str2)) {
                            }
                        } else if (!str.equals(str2)) {
                        }
                        if (this.f7227z == googleSignInOptions.f7227z && this.f7225x == googleSignInOptions.f7225x && this.f7226y == googleSignInOptions.f7226y) {
                            if (TextUtils.equals(this.D, googleSignInOptions.D)) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f7223v;
        int size = arrayList2.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(arrayList2.get(i10).f7295v);
        }
        Collections.sort(arrayList);
        int hashCode3 = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f7224w;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        String str = this.A;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (((((((i11 + hashCode2) * 31) + (this.f7227z ? 1 : 0)) * 31) + (this.f7225x ? 1 : 0)) * 31) + (this.f7226y ? 1 : 0)) * 31;
        String str2 = this.D;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i12 + i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.s0(parcel, 1, this.f7222u);
        d.A0(parcel, 2, new ArrayList(this.f7223v));
        d.w0(parcel, 3, this.f7224w, i6);
        d.o0(parcel, 4, this.f7225x);
        d.o0(parcel, 5, this.f7226y);
        d.o0(parcel, 6, this.f7227z);
        d.x0(parcel, 7, this.A);
        d.x0(parcel, 8, this.B);
        d.A0(parcel, 9, this.C);
        d.x0(parcel, 10, this.D);
        d.C0(parcel, B0);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f7228a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7229b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7230c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f7231d;

        /* renamed from: e  reason: collision with root package name */
        public String f7232e;
        public final Account f;

        /* renamed from: g  reason: collision with root package name */
        public final String f7233g;

        /* renamed from: h  reason: collision with root package name */
        public final HashMap f7234h;

        /* renamed from: i  reason: collision with root package name */
        public String f7235i;

        public a() {
            this.f7228a = new HashSet();
            this.f7234h = new HashMap();
        }

        public final GoogleSignInOptions a() {
            Scope scope = GoogleSignInOptions.J;
            HashSet hashSet = this.f7228a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.I;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.f7231d && (this.f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.H);
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f, this.f7231d, this.f7229b, this.f7230c, this.f7232e, this.f7233g, this.f7234h, this.f7235i);
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f7228a = new HashSet();
            this.f7234h = new HashMap();
            o.h(googleSignInOptions);
            this.f7228a = new HashSet(googleSignInOptions.f7223v);
            this.f7229b = googleSignInOptions.f7226y;
            this.f7230c = googleSignInOptions.f7227z;
            this.f7231d = googleSignInOptions.f7225x;
            this.f7232e = googleSignInOptions.A;
            this.f = googleSignInOptions.f7224w;
            this.f7233g = googleSignInOptions.B;
            this.f7234h = GoogleSignInOptions.g0(googleSignInOptions.C);
            this.f7235i = googleSignInOptions.D;
        }
    }
}
