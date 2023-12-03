package g6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.R;
import g6.s;
import g6.x;
import h5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import w5.e0;
import w5.f0;
/* compiled from: LoginClient.kt */
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new b();
    public d A;
    public Map<String, String> B;
    public final LinkedHashMap C;
    public s D;
    public int E;
    public int F;

    /* renamed from: u  reason: collision with root package name */
    public y[] f16296u;

    /* renamed from: v  reason: collision with root package name */
    public int f16297v;

    /* renamed from: w  reason: collision with root package name */
    public Fragment f16298w;

    /* renamed from: x  reason: collision with root package name */
    public c f16299x;

    /* renamed from: y  reason: collision with root package name */
    public a f16300y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16301z;

    /* compiled from: LoginClient.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: LoginClient.kt */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new p(source);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i6) {
            return new p[i6];
        }
    }

    /* compiled from: LoginClient.kt */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: LoginClient.kt */
    /* loaded from: classes.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new b();
        public Map<String, String> A;
        public HashMap B;

        /* renamed from: u  reason: collision with root package name */
        public final a f16308u;

        /* renamed from: v  reason: collision with root package name */
        public final h5.a f16309v;

        /* renamed from: w  reason: collision with root package name */
        public final h5.h f16310w;

        /* renamed from: x  reason: collision with root package name */
        public final String f16311x;

        /* renamed from: y  reason: collision with root package name */
        public final String f16312y;

        /* renamed from: z  reason: collision with root package name */
        public final d f16313z;

        /* compiled from: LoginClient.kt */
        /* loaded from: classes.dex */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: u  reason: collision with root package name */
            public final String f16318u;

            a(String str) {
                this.f16318u = str;
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                return (a[]) Arrays.copyOf(values(), 3);
            }
        }

        /* compiled from: LoginClient.kt */
        /* loaded from: classes.dex */
        public static final class b implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel source) {
                kotlin.jvm.internal.i.g(source, "source");
                return new e(source);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i6) {
                return new e[i6];
            }
        }

        public e(d dVar, a aVar, h5.a aVar2, String str, String str2) {
            this(dVar, aVar, aVar2, null, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i6) {
            kotlin.jvm.internal.i.g(dest, "dest");
            dest.writeString(this.f16308u.name());
            dest.writeParcelable(this.f16309v, i6);
            dest.writeParcelable(this.f16310w, i6);
            dest.writeString(this.f16311x);
            dest.writeString(this.f16312y);
            dest.writeParcelable(this.f16313z, i6);
            e0 e0Var = e0.f36453a;
            e0.L(dest, this.A);
            e0.L(dest, this.B);
        }

        public e(d dVar, a aVar, h5.a aVar2, h5.h hVar, String str, String str2) {
            this.f16313z = dVar;
            this.f16309v = aVar2;
            this.f16310w = hVar;
            this.f16311x = str;
            this.f16308u = aVar;
            this.f16312y = str2;
        }

        public e(Parcel parcel) {
            String readString = parcel.readString();
            this.f16308u = a.valueOf(readString == null ? "error" : readString);
            this.f16309v = (h5.a) parcel.readParcelable(h5.a.class.getClassLoader());
            this.f16310w = (h5.h) parcel.readParcelable(h5.h.class.getClassLoader());
            this.f16311x = parcel.readString();
            this.f16312y = parcel.readString();
            this.f16313z = (d) parcel.readParcelable(d.class.getClassLoader());
            this.A = e0.H(parcel);
            this.B = e0.H(parcel);
        }
    }

    public p(Fragment fragment) {
        kotlin.jvm.internal.i.g(fragment, "fragment");
        this.f16297v = -1;
        if (this.f16298w == null) {
            this.f16298w = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    public final void a(String str, String str2, boolean z10) {
        Map<String, String> map = this.B;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.B == null) {
            this.B = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        int checkCallingOrSelfPermission;
        String string;
        if (this.f16301z) {
            return true;
        }
        androidx.fragment.app.p e10 = e();
        if (e10 == null) {
            checkCallingOrSelfPermission = -1;
        } else {
            checkCallingOrSelfPermission = e10.checkCallingOrSelfPermission("android.permission.INTERNET");
        }
        if (checkCallingOrSelfPermission != 0) {
            androidx.fragment.app.p e11 = e();
            String str = null;
            if (e11 == null) {
                string = null;
            } else {
                string = e11.getString(R.string.com_facebook_internet_permission_error_title);
            }
            if (e11 != null) {
                str = e11.getString(R.string.com_facebook_internet_permission_error_message);
            }
            d dVar = this.A;
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                arrayList.add(string);
            }
            if (str != null) {
                arrayList.add(str);
            }
            c(new e(dVar, e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
            return false;
        }
        this.f16301z = true;
        return true;
    }

    public final void c(e outcome) {
        kotlin.jvm.internal.i.g(outcome, "outcome");
        y f = f();
        e.a aVar = outcome.f16308u;
        if (f != null) {
            h(f.e(), aVar.f16318u, outcome.f16311x, outcome.f16312y, f.f16347u);
        }
        Map<String, String> map = this.B;
        if (map != null) {
            outcome.A = map;
        }
        LinkedHashMap linkedHashMap = this.C;
        if (linkedHashMap != null) {
            outcome.B = linkedHashMap;
        }
        this.f16296u = null;
        int i6 = -1;
        this.f16297v = -1;
        this.A = null;
        this.B = null;
        this.E = 0;
        this.F = 0;
        c cVar = this.f16299x;
        if (cVar != null) {
            r this$0 = (r) ((f0.b) cVar).f14603v;
            int i10 = r.f16321z;
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this$0.f16323v = null;
            if (aVar == e.a.CANCEL) {
                i6 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            androidx.fragment.app.p activity = this$0.getActivity();
            if (this$0.isAdded() && activity != null) {
                activity.setResult(i6, intent);
                activity.finish();
            }
        }
    }

    public final void d(e outcome) {
        e eVar;
        kotlin.jvm.internal.i.g(outcome, "outcome");
        h5.a aVar = outcome.f16309v;
        if (aVar != null) {
            Date date = h5.a.F;
            if (a.b.c()) {
                h5.a b10 = a.b.b();
                e.a aVar2 = e.a.ERROR;
                if (b10 != null) {
                    try {
                        if (kotlin.jvm.internal.i.b(b10.C, aVar.C)) {
                            eVar = new e(this.A, e.a.SUCCESS, outcome.f16309v, outcome.f16310w, null, null);
                            c(eVar);
                            return;
                        }
                    } catch (Exception e10) {
                        d dVar = this.A;
                        String message = e10.getMessage();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("Caught exception");
                        if (message != null) {
                            arrayList.add(message);
                        }
                        c(new e(dVar, aVar2, null, TextUtils.join(": ", arrayList), null));
                        return;
                    }
                }
                d dVar2 = this.A;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("User logged in as different Facebook user.");
                eVar = new e(dVar2, aVar2, null, TextUtils.join(": ", arrayList2), null);
                c(eVar);
                return;
            }
        }
        c(outcome);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final androidx.fragment.app.p e() {
        Fragment fragment = this.f16298w;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final y f() {
        y[] yVarArr;
        int i6 = this.f16297v;
        if (i6 < 0 || (yVarArr = this.f16296u) == null) {
            return null;
        }
        return yVarArr[i6];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (kotlin.jvm.internal.i.b(r1, r2) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s g() {
        String str;
        String str2;
        d dVar;
        s sVar = this.D;
        if (sVar != null) {
            String str3 = null;
            if (!b6.a.b(sVar)) {
                try {
                    str2 = sVar.f16329a;
                } catch (Throwable th2) {
                    b6.a.a(sVar, th2);
                }
                dVar = this.A;
                if (dVar != null) {
                    str3 = dVar.f16305x;
                }
            }
            str2 = null;
            dVar = this.A;
            if (dVar != null) {
            }
        }
        Context e10 = e();
        if (e10 == null) {
            e10 = h5.p.a();
        }
        d dVar2 = this.A;
        if (dVar2 == null) {
            str = h5.p.b();
        } else {
            str = dVar2.f16305x;
        }
        sVar = new s(e10, str);
        this.D = sVar;
        return sVar;
    }

    public final void h(String str, String str2, String str3, String str4, HashMap hashMap) {
        boolean z10;
        d dVar = this.A;
        String str5 = "fb_mobile_login_method_complete";
        if (dVar == null) {
            g().a("fb_mobile_login_method_complete", str);
            return;
        }
        s g5 = g();
        String str6 = dVar.f16306y;
        if (dVar.G) {
            str5 = "foa_mobile_login_method_complete";
        }
        if (!b6.a.b(g5)) {
            try {
                ScheduledExecutorService scheduledExecutorService = s.f16328d;
                Bundle a10 = s.a.a(str6);
                if (str2 != null) {
                    a10.putString("2_result", str2);
                }
                if (str3 != null) {
                    a10.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    a10.putString("4_error_code", str4);
                }
                if (hashMap != null && (!hashMap.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    a10.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                a10.putString("3_method", str);
                g5.f16330b.a(a10, str5);
            } catch (Throwable th2) {
                b6.a.a(g5, th2);
            }
        }
    }

    public final void i(int i6, int i10, Intent intent) {
        this.E++;
        if (this.A != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.C, false)) {
                j();
                return;
            }
            y f = f();
            if (f != null) {
                if (!(f instanceof n) || intent != null || this.E >= this.F) {
                    f.h(i6, i10, intent);
                }
            }
        }
    }

    public final void j() {
        String str;
        String str2;
        y f = f();
        if (f != null) {
            h(f.e(), "skipped", null, null, f.f16347u);
        }
        y[] yVarArr = this.f16296u;
        while (yVarArr != null) {
            int i6 = this.f16297v;
            boolean z10 = true;
            if (i6 >= yVarArr.length - 1) {
                break;
            }
            this.f16297v = i6 + 1;
            y f2 = f();
            boolean z11 = false;
            if (f2 != null) {
                if ((f2 instanceof d0) && !b()) {
                    a("no_internet_permission", "1", false);
                    continue;
                } else {
                    d dVar = this.A;
                    if (dVar == null) {
                        continue;
                    } else {
                        int k10 = f2.k(dVar);
                        this.E = 0;
                        String str3 = dVar.f16306y;
                        if (k10 > 0) {
                            s g5 = g();
                            String e10 = f2.e();
                            if (dVar.G) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!b6.a.b(g5)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = s.f16328d;
                                    Bundle a10 = s.a.a(str3);
                                    a10.putString("3_method", e10);
                                    g5.f16330b.a(a10, str2);
                                } catch (Throwable th2) {
                                    b6.a.a(g5, th2);
                                }
                            }
                            this.F = k10;
                        } else {
                            s g10 = g();
                            String e11 = f2.e();
                            if (dVar.G) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!b6.a.b(g10)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = s.f16328d;
                                    Bundle a11 = s.a.a(str3);
                                    a11.putString("3_method", e11);
                                    g10.f16330b.a(a11, str);
                                } catch (Throwable th3) {
                                    b6.a.a(g10, th3);
                                }
                            }
                            a("not_tried", f2.e(), true);
                        }
                        if (k10 <= 0) {
                            z10 = false;
                        }
                        z11 = z10;
                        continue;
                    }
                }
            }
            if (z11) {
                return;
            }
        }
        d dVar2 = this.A;
        if (dVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            c(new e(dVar2, e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        dest.writeParcelableArray(this.f16296u, i6);
        dest.writeInt(this.f16297v);
        dest.writeParcelable(this.A, i6);
        e0 e0Var = e0.f36453a;
        e0.L(dest, this.B);
        e0.L(dest, this.C);
    }

    public p(Parcel source) {
        kotlin.jvm.internal.i.g(source, "source");
        this.f16297v = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(y.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i6];
            y yVar = parcelable instanceof y ? (y) parcelable : null;
            if (yVar != null) {
                yVar.f16348v = this;
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
            i6++;
        }
        Object[] array = arrayList.toArray(new y[0]);
        if (array != null) {
            this.f16296u = (y[]) array;
            this.f16297v = source.readInt();
            this.A = (d) source.readParcelable(d.class.getClassLoader());
            HashMap H = e0.H(source);
            this.B = H == null ? null : is.e0.z0(H);
            HashMap H2 = e0.H(source);
            this.C = H2 != null ? is.e0.z0(H2) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* compiled from: LoginClient.kt */
    /* loaded from: classes.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public final String A;
        public final String B;
        public final String C;
        public String D;
        public boolean E;
        public final a0 F;
        public boolean G;
        public boolean H;
        public final String I;
        public final String J;
        public final String K;
        public final g6.a L;

        /* renamed from: u  reason: collision with root package name */
        public final o f16302u;

        /* renamed from: v  reason: collision with root package name */
        public Set<String> f16303v;

        /* renamed from: w  reason: collision with root package name */
        public final g6.d f16304w;

        /* renamed from: x  reason: collision with root package name */
        public final String f16305x;

        /* renamed from: y  reason: collision with root package name */
        public final String f16306y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f16307z;

        /* compiled from: LoginClient.kt */
        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel source) {
                kotlin.jvm.internal.i.g(source, "source");
                return new d(source);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d(o loginBehavior, Set<String> set, g6.d defaultAudience, String authType, String str, String str2, a0 a0Var, String str3, String str4, String str5, g6.a aVar) {
            kotlin.jvm.internal.i.g(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.i.g(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.i.g(authType, "authType");
            this.f16302u = loginBehavior;
            this.f16303v = set;
            this.f16304w = defaultAudience;
            this.B = authType;
            this.f16305x = str;
            this.f16306y = str2;
            this.F = a0Var == null ? a0.FACEBOOK : a0Var;
            if (str3 != null) {
                if (!(str3.length() == 0)) {
                    this.I = str3;
                    this.J = str4;
                    this.K = str5;
                    this.L = aVar;
                }
            }
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.f(uuid, "randomUUID().toString()");
            this.I = uuid;
            this.J = str4;
            this.K = str5;
            this.L = aVar;
        }

        public final boolean a() {
            for (String str : this.f16303v) {
                x.b bVar = x.f;
                if (x.b.b(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i6) {
            String name;
            kotlin.jvm.internal.i.g(dest, "dest");
            dest.writeString(this.f16302u.name());
            dest.writeStringList(new ArrayList(this.f16303v));
            dest.writeString(this.f16304w.name());
            dest.writeString(this.f16305x);
            dest.writeString(this.f16306y);
            dest.writeByte(this.f16307z ? (byte) 1 : (byte) 0);
            dest.writeString(this.A);
            dest.writeString(this.B);
            dest.writeString(this.C);
            dest.writeString(this.D);
            dest.writeByte(this.E ? (byte) 1 : (byte) 0);
            dest.writeString(this.F.name());
            dest.writeByte(this.G ? (byte) 1 : (byte) 0);
            dest.writeByte(this.H ? (byte) 1 : (byte) 0);
            dest.writeString(this.I);
            dest.writeString(this.J);
            dest.writeString(this.K);
            g6.a aVar = this.L;
            if (aVar == null) {
                name = null;
            } else {
                name = aVar.name();
            }
            dest.writeString(name);
        }

        public d(Parcel parcel) {
            g6.d dVar;
            a0 a0Var;
            String str = f0.f36461a;
            String readString = parcel.readString();
            f0.d(readString, "loginBehavior");
            this.f16302u = o.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f16303v = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                dVar = g6.d.valueOf(readString2);
            } else {
                dVar = g6.d.NONE;
            }
            this.f16304w = dVar;
            String readString3 = parcel.readString();
            f0.d(readString3, "applicationId");
            this.f16305x = readString3;
            String readString4 = parcel.readString();
            f0.d(readString4, "authId");
            this.f16306y = readString4;
            this.f16307z = parcel.readByte() != 0;
            this.A = parcel.readString();
            String readString5 = parcel.readString();
            f0.d(readString5, "authType");
            this.B = readString5;
            this.C = parcel.readString();
            this.D = parcel.readString();
            this.E = parcel.readByte() != 0;
            String readString6 = parcel.readString();
            if (readString6 != null) {
                a0Var = a0.valueOf(readString6);
            } else {
                a0Var = a0.FACEBOOK;
            }
            this.F = a0Var;
            this.G = parcel.readByte() != 0;
            this.H = parcel.readByte() != 0;
            String readString7 = parcel.readString();
            f0.d(readString7, "nonce");
            this.I = readString7;
            this.J = parcel.readString();
            this.K = parcel.readString();
            String readString8 = parcel.readString();
            this.L = readString8 == null ? null : g6.a.valueOf(readString8);
        }
    }
}
