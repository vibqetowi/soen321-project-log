package h5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AccessToken.kt */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public final Date A;
    public final String B;
    public final String C;
    public final Date D;
    public final String E;

    /* renamed from: u  reason: collision with root package name */
    public final Date f17176u;

    /* renamed from: v  reason: collision with root package name */
    public final Set<String> f17177v;

    /* renamed from: w  reason: collision with root package name */
    public final Set<String> f17178w;

    /* renamed from: x  reason: collision with root package name */
    public final Set<String> f17179x;

    /* renamed from: y  reason: collision with root package name */
    public final String f17180y;

    /* renamed from: z  reason: collision with root package name */
    public final g f17181z;
    public static final Date F = new Date(Long.MAX_VALUE);
    public static final Date G = new Date();
    public static final g H = g.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<a> CREATOR = new C0271a();

    /* compiled from: AccessToken.kt */
    /* renamed from: h5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0271a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new a(source);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    /* compiled from: AccessToken.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static a a(JSONObject jSONObject) {
            ArrayList C;
            if (jSONObject.getInt("version") <= 1) {
                String token = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray permissionsArray = jSONObject.getJSONArray("permissions");
                JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string = jSONObject.getString("source");
                kotlin.jvm.internal.i.f(string, "jsonObject.getString(SOURCE_KEY)");
                g valueOf = g.valueOf(string);
                String applicationId = jSONObject.getString("application_id");
                String userId = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
                String optString = jSONObject.optString("graph_domain", null);
                kotlin.jvm.internal.i.f(token, "token");
                kotlin.jvm.internal.i.f(applicationId, "applicationId");
                kotlin.jvm.internal.i.f(userId, "userId");
                w5.e0 e0Var = w5.e0.f36453a;
                kotlin.jvm.internal.i.f(permissionsArray, "permissionsArray");
                ArrayList C2 = w5.e0.C(permissionsArray);
                kotlin.jvm.internal.i.f(declinedPermissionsArray, "declinedPermissionsArray");
                ArrayList C3 = w5.e0.C(declinedPermissionsArray);
                if (optJSONArray == null) {
                    C = new ArrayList();
                } else {
                    C = w5.e0.C(optJSONArray);
                }
                return new a(token, applicationId, userId, C2, C3, C, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        public static a b() {
            return f.f.a().f17216c;
        }

        public static boolean c() {
            a aVar = f.f.a().f17216c;
            if (aVar != null && !new Date().after(aVar.f17176u)) {
                return true;
            }
            return false;
        }
    }

    public a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, g gVar, Date date, Date date2, Date date3, String str4) {
        String str5 = str4;
        defpackage.e.u(str, SessionManager.KEY_ACCESS, str2, "applicationId", str3, SessionManager.KEY_USERID);
        w5.f0.b(str, SessionManager.KEY_ACCESS);
        w5.f0.b(str2, "applicationId");
        w5.f0.b(str3, SessionManager.KEY_USERID);
        Date date4 = F;
        this.f17176u = date == null ? date4 : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.i.f(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f17177v = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.i.f(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f17178w = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.i.f(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f17179x = unmodifiableSet3;
        this.f17180y = str;
        g gVar2 = gVar == null ? H : gVar;
        if (str5 != null && str5.equals("instagram")) {
            int ordinal = gVar2.ordinal();
            if (ordinal == 1) {
                gVar2 = g.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                gVar2 = g.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                gVar2 = g.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f17181z = gVar2;
        this.A = date2 == null ? G : date2;
        this.B = str2;
        this.C = str3;
        if (date3 != null && date3.getTime() != 0) {
            date4 = date3;
        }
        this.D = date4;
        this.E = str5 == null ? "facebook" : str5;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f17180y);
        jSONObject.put("expires_at", this.f17176u.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f17177v));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f17178w));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f17179x));
        jSONObject.put("last_refresh", this.A.getTime());
        jSONObject.put("source", this.f17181z.name());
        jSONObject.put("application_id", this.B);
        jSONObject.put("user_id", this.C);
        jSONObject.put("data_access_expiration_time", this.D.getTime());
        String str = this.E;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean b10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.i.b(this.f17176u, aVar.f17176u) && kotlin.jvm.internal.i.b(this.f17177v, aVar.f17177v) && kotlin.jvm.internal.i.b(this.f17178w, aVar.f17178w) && kotlin.jvm.internal.i.b(this.f17179x, aVar.f17179x) && kotlin.jvm.internal.i.b(this.f17180y, aVar.f17180y) && this.f17181z == aVar.f17181z && kotlin.jvm.internal.i.b(this.A, aVar.A) && kotlin.jvm.internal.i.b(this.B, aVar.B) && kotlin.jvm.internal.i.b(this.C, aVar.C) && kotlin.jvm.internal.i.b(this.D, aVar.D)) {
            String str = this.E;
            String str2 = aVar.E;
            if (str == null) {
                if (str2 == null) {
                    b10 = true;
                } else {
                    b10 = false;
                }
            } else {
                b10 = kotlin.jvm.internal.i.b(str, str2);
            }
            if (b10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f17177v.hashCode();
        int hashCode3 = this.f17178w.hashCode();
        int hashCode4 = this.f17179x.hashCode();
        int c10 = pl.a.c(this.f17180y, (hashCode4 + ((hashCode3 + ((hashCode2 + ((this.f17176u.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode5 = this.A.hashCode();
        int hashCode6 = (this.D.hashCode() + pl.a.c(this.C, pl.a.c(this.B, (hashCode5 + ((this.f17181z.hashCode() + c10) * 31)) * 31, 31), 31)) * 31;
        String str = this.E;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode6 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        p pVar = p.f17269a;
        p.i(w.INCLUDE_ACCESS_TOKENS);
        sb2.append(TextUtils.join(", ", this.f17177v));
        sb2.append("]}");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        dest.writeLong(this.f17176u.getTime());
        dest.writeStringList(new ArrayList(this.f17177v));
        dest.writeStringList(new ArrayList(this.f17178w));
        dest.writeStringList(new ArrayList(this.f17179x));
        dest.writeString(this.f17180y);
        dest.writeString(this.f17181z.name());
        dest.writeLong(this.A.getTime());
        dest.writeString(this.B);
        dest.writeString(this.C);
        dest.writeLong(this.D.getTime());
        dest.writeString(this.E);
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, gVar, date, date2, date3, "facebook");
    }

    public a(Parcel parcel) {
        g gVar;
        kotlin.jvm.internal.i.g(parcel, "parcel");
        this.f17176u = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.i.f(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f17177v = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.i.f(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f17178w = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.i.f(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f17179x = unmodifiableSet3;
        String readString = parcel.readString();
        w5.f0.d(readString, "token");
        this.f17180y = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            gVar = g.valueOf(readString2);
        } else {
            gVar = H;
        }
        this.f17181z = gVar;
        this.A = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        w5.f0.d(readString3, "applicationId");
        this.B = readString3;
        String readString4 = parcel.readString();
        w5.f0.d(readString4, SessionManager.KEY_USERID);
        this.C = readString4;
        this.D = new Date(parcel.readLong());
        this.E = parcel.readString();
    }
}
