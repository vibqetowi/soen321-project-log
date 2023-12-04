package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zaa = new Scope(Scopes.PROFILE);
    public static final Scope zab = new Scope("email");
    public static final Scope zac = new Scope("openid");
    public static final Scope zad;
    public static final Scope zae;
    private static Comparator<Scope> zag;
    final int zaf;
    private final ArrayList<Scope> zah;
    private Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private String zam;
    private String zan;
    private ArrayList<GoogleSignInOptionsExtensionParcelable> zao;
    private String zap;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> zaq;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private Set<Scope> zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;
        private String zae;
        private Account zaf;
        private String zag;
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> zah;
        private String zai;

        public Builder() {
            this.zaa = new HashSet();
            this.zah = new HashMap();
        }

        private final String zaa(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.zae;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        public Builder addExtension(GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.zah.containsKey(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List<Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.zaa.addAll(impliedScopes);
            }
            this.zah.put(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        public GoogleSignInOptions build() {
            if (this.zaa.contains(GoogleSignInOptions.zae) && this.zaa.contains(GoogleSignInOptions.zad)) {
                this.zaa.remove(GoogleSignInOptions.zad);
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(new ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai);
        }

        public Builder requestEmail() {
            this.zaa.add(GoogleSignInOptions.zab);
            return this;
        }

        public Builder requestId() {
            this.zaa.add(GoogleSignInOptions.zac);
            return this;
        }

        public Builder requestIdToken(String str) {
            this.zad = true;
            zaa(str);
            this.zae = str;
            return this;
        }

        public Builder requestProfile() {
            this.zaa.add(GoogleSignInOptions.zaa);
            return this;
        }

        public Builder requestScopes(Scope scope, Scope... scopeArr) {
            this.zaa.add(scope);
            this.zaa.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public Builder requestServerAuthCode(String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        public Builder setAccountName(String str) {
            this.zaf = new Account(Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        public Builder setHostedDomain(String str) {
            this.zag = Preconditions.checkNotEmpty(str);
            return this;
        }

        public Builder setLogSessionId(String str) {
            this.zai = str;
            return this;
        }

        public Builder requestServerAuthCode(String str, boolean z) {
            this.zab = true;
            zaa(str);
            this.zae = str;
            this.zac = z;
            return this;
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            this.zaa = new HashSet();
            this.zah = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.zaa = new HashSet(googleSignInOptions.zah);
            this.zab = googleSignInOptions.zak;
            this.zac = googleSignInOptions.zal;
            this.zad = googleSignInOptions.zaj;
            this.zae = googleSignInOptions.zam;
            this.zaf = googleSignInOptions.zai;
            this.zag = googleSignInOptions.zan;
            this.zah = GoogleSignInOptions.zam(googleSignInOptions.zao);
            this.zai = googleSignInOptions.zap;
        }
    }

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        zad = scope;
        zae = new Scope(Scopes.GAMES);
        Builder builder = new Builder();
        builder.requestId();
        builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        Builder builder2 = new Builder();
        builder2.requestScopes(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        CREATOR = new zae();
        zag = new zac();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zam(arrayList2), str3);
    }

    public static GoogleSignInOptions zab(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> zam(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.getAccount()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.zao.size() <= 0 && googleSignInOptions.zao.size() <= 0 && this.zah.size() == googleSignInOptions.getScopes().size() && this.zah.containsAll(googleSignInOptions.getScopes())) {
                Account account = this.zai;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                    }
                }
                if (TextUtils.isEmpty(this.zam)) {
                    if (TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                    }
                } else if (!this.zam.equals(googleSignInOptions.getServerClientId())) {
                }
                if (this.zal == googleSignInOptions.isForceCodeForRefreshToken() && this.zaj == googleSignInOptions.isIdTokenRequested() && this.zak == googleSignInOptions.isServerAuthCodeRequested()) {
                    if (TextUtils.equals(this.zap, googleSignInOptions.getLogSessionId())) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public Account getAccount() {
        return this.zai;
    }

    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zao;
    }

    public String getLogSessionId() {
        return this.zap;
    }

    public Scope[] getScopeArray() {
        ArrayList<Scope> arrayList = this.zah;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.zah);
    }

    public String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).getScopeUri());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.zai);
        hashAccumulator.addObject(this.zam);
        hashAccumulator.zaa(this.zal);
        hashAccumulator.zaa(this.zaj);
        hashAccumulator.zaa(this.zak);
        hashAccumulator.addObject(this.zap);
        return hashAccumulator.hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaf);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zan, false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zaf() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator<Scope> it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.zaf = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList<>(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
