package ta;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.k;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class k6 extends e4 {
    public static final String[] A = {"firebase_", "google_", "ga_"};
    public static final String[] B = {"_err"};

    /* renamed from: w  reason: collision with root package name */
    public SecureRandom f32698w;

    /* renamed from: x  reason: collision with root package name */
    public final AtomicLong f32699x;

    /* renamed from: y  reason: collision with root package name */
    public int f32700y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f32701z;

    public k6(y3 y3Var) {
        super(y3Var);
        this.f32701z = null;
        this.f32699x = new AtomicLong(0L);
    }

    public static boolean Q(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean S(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean T(String str) {
        v9.o.e(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean U(Context context) {
        ActivityInfo receiverInfo;
        v9.o.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean V(Context context) {
        ServiceInfo serviceInfo;
        ServiceInfo serviceInfo2;
        v9.o.h(context);
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (serviceInfo2 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                    if (serviceInfo2.enabled) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        try {
            PackageManager packageManager2 = context.getPackageManager();
            if (packageManager2 != null && (serviceInfo = packageManager2.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return false;
    }

    public static boolean W(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            v9.o.h(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (!TextUtils.isEmpty(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (!isEmpty) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    public static byte[] X(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean Y(int i6, Bundle bundle) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i6);
            return true;
        }
        return false;
    }

    public static boolean b0(String str, String[] strArr) {
        boolean z10;
        v9.o.h(strArr);
        for (String str2 : strArr) {
            if (str != str2 && (str == null || !str.equals(str2))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static long i0(byte[] bArr) {
        boolean z10;
        v9.o.h(bArr);
        int length = bArr.length;
        int i6 = 0;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j10 = 0;
            for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
                j10 += (bArr[i10] & 255) << i6;
                i6 += 8;
            }
            return j10;
        }
        throw new IllegalStateException();
    }

    public static String o(String str, int i6, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i6) {
            if (!z10) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i6))).concat("...");
        }
        return str;
    }

    public static MessageDigest p() {
        MessageDigest messageDigest;
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList r(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", cVar.f32491u);
            bundle.putString("origin", cVar.f32492v);
            bundle.putLong("creation_timestamp", cVar.f32494x);
            bundle.putString(SessionManager.KEY_NAME, cVar.f32493w.f32578v);
            Object f02 = cVar.f32493w.f0();
            v9.o.h(f02);
            f6.b.Z0(bundle, f02);
            bundle.putBoolean("active", cVar.f32495y);
            String str = cVar.f32496z;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            s sVar = cVar.A;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.f32858u);
                q qVar = sVar.f32859v;
                if (qVar != null) {
                    bundle.putBundle("timed_out_event_params", qVar.f0());
                }
            }
            bundle.putLong("trigger_timeout", cVar.B);
            s sVar2 = cVar.C;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.f32858u);
                q qVar2 = sVar2.f32859v;
                if (qVar2 != null) {
                    bundle.putBundle("triggered_event_params", qVar2.f0());
                }
            }
            bundle.putLong("triggered_timestamp", cVar.f32493w.f32579w);
            bundle.putLong("time_to_live", cVar.D);
            s sVar3 = cVar.E;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.f32858u);
                q qVar3 = sVar3.f32859v;
                if (qVar3 != null) {
                    bundle.putBundle("expired_event_params", qVar3.f0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void u(z4 z4Var, Bundle bundle, boolean z10) {
        if (bundle != null && z4Var != null) {
            if (bundle.containsKey("_sc") && !z10) {
                z10 = false;
            } else {
                String str = z4Var.f32974a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = z4Var.f32975b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", z4Var.f32976c);
                return;
            }
        }
        if (bundle != null && z4Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void x(j6 j6Var, String str, int i6, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        Y(i6, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i6 == 6 || i6 == 7 || i6 == 2) {
            bundle.putLong("_el", i10);
        }
        j6Var.i(str, bundle);
    }

    public final void A(com.google.android.gms.internal.measurement.n0 n0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            n0Var.t(bundle);
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning bundle list to wrapper");
        }
    }

    public final void B(com.google.android.gms.internal.measurement.n0 n0Var, Bundle bundle) {
        try {
            n0Var.t(bundle);
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning bundle value to wrapper");
        }
    }

    public final void C(com.google.android.gms.internal.measurement.n0 n0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            n0Var.t(bundle);
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning byte array to wrapper");
        }
    }

    public final void D(com.google.android.gms.internal.measurement.n0 n0Var, int i6) {
        try {
            n0Var.t(defpackage.c.k("r", i6));
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning int value to wrapper");
        }
    }

    public final void E(com.google.android.gms.internal.measurement.n0 n0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            n0Var.t(bundle);
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning long value to wrapper");
        }
    }

    public final void F(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        try {
            n0Var.t(r1.b0.a("r", str));
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning string value to wrapper");
        }
    }

    public final void G(String str, String str2, Bundle bundle, List list, boolean z10) {
        int i6;
        String str3;
        w2 w2Var;
        String str4;
        int K;
        if (bundle == null) {
            return;
        }
        y3 y3Var = this.f32943u;
        y3Var.getClass();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list != null && list.contains(str5)) {
                i6 = 0;
            } else {
                if (!z10) {
                    i6 = f0(str5);
                } else {
                    i6 = 0;
                }
                if (i6 == 0) {
                    i6 = e0(str5);
                }
            }
            if (i6 != 0) {
                if (i6 == 3) {
                    str3 = str5;
                } else {
                    str3 = null;
                }
                t(bundle, i6, str5, str3);
                bundle.remove(str5);
            } else {
                boolean Q = Q(bundle.get(str5));
                w2 w2Var2 = y3Var.C;
                if (Q) {
                    y3.k(w2Var2);
                    w2Var2.E.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str5);
                    K = 22;
                    w2Var = w2Var2;
                    str4 = str5;
                } else {
                    w2Var = w2Var2;
                    str4 = str5;
                    K = K(str, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (K != 0 && !"_ev".equals(str4)) {
                    t(bundle, K, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (T(str4) && !b0(str4, kotlin.jvm.internal.b0.f23446a0) && (i10 = i10 + 1) > 0) {
                    y3.k(w2Var);
                    r2 r2Var = y3Var.G;
                    w2Var.B.d("Item cannot contain custom parameters", r2Var.d(str), r2Var.b(bundle));
                    Y(23, bundle);
                    bundle.remove(str4);
                }
            }
        }
    }

    public final boolean H(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        y3 y3Var = this.f32943u;
        if (!isEmpty) {
            v9.o.h(str);
            if (!str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (TextUtils.isEmpty(y3Var.f32954v)) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.B.c(w2.q(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                }
                return false;
            }
            return true;
        } else if (!TextUtils.isEmpty(str2)) {
            v9.o.h(str2);
            if (!str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.B.c(w2.q(str2), "Invalid admob_app_id. Analytics disabled.");
                return false;
            }
            return true;
        } else {
            if (TextUtils.isEmpty(y3Var.f32954v)) {
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.B.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public final boolean I(int i6, String str, String str2) {
        y3 y3Var = this.f32943u;
        if (str2 == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.B.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i6) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.B.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i6), str2);
            return false;
        } else {
            return true;
        }
    }

    public final boolean J(String str, String[] strArr, String[] strArr2, String str2) {
        y3 y3Var = this.f32943u;
        if (str2 == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.B.c(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = A;
        for (int i6 = 0; i6 < 3; i6++) {
            if (str2.startsWith(strArr3[i6])) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.B.d("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && b0(str2, strArr)) {
            if (strArr2 == null || !b0(str2, strArr2)) {
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.B.d("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i6;
        int i10;
        Object obj2;
        Parcelable[] parcelableArr;
        int size;
        h();
        boolean Q = Q(obj);
        y3 y3Var = this.f32943u;
        if (Q) {
            if (z11) {
                if (!b0(str2, kotlin.jvm.internal.b0.Z)) {
                    return 20;
                }
                l5 t3 = y3Var.t();
                t3.h();
                t3.i();
                if (t3.p()) {
                    k6 k6Var = t3.f32943u.F;
                    y3.i(k6Var);
                    if (k6Var.h0() < 200900) {
                        return 25;
                    }
                }
                boolean z12 = obj instanceof Parcelable[];
                if (z12) {
                    size = ((Parcelable[]) obj).length;
                } else if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                if (size > 200) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.E.e("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                    if (z12) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        if (parcelableArr2.length > 200) {
                            bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr2, (int) k.d.DEFAULT_DRAG_ANIMATION_DURATION));
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList.size() > 200) {
                            bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, k.d.DEFAULT_DRAG_ANIMATION_DURATION)));
                        }
                    }
                    i6 = 17;
                    if (S(str) && !S(str2)) {
                        y3Var.getClass();
                        i10 = 100;
                    } else {
                        y3Var.getClass();
                        i10 = 256;
                    }
                    if (!M("param", str2, i10, obj)) {
                        return i6;
                    }
                    if (z11) {
                        if (obj instanceof Bundle) {
                            G(str, str2, (Bundle) obj, list, z10);
                        } else if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (!(parcelable instanceof Bundle)) {
                                    w2 w2Var2 = y3Var.C;
                                    y3.k(w2Var2);
                                    w2Var2.E.d("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                                    return 4;
                                }
                                G(str, str2, (Bundle) parcelable, list, z10);
                            }
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size2 = arrayList2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                Object obj3 = arrayList2.get(i11);
                                if (!(obj3 instanceof Bundle)) {
                                    w2 w2Var3 = y3Var.C;
                                    y3.k(w2Var3);
                                    if (obj3 != null) {
                                        obj2 = obj3.getClass();
                                    } else {
                                        obj2 = "null";
                                    }
                                    w2Var3.E.d("All ArrayList elements must be of type Bundle. Value type, name", obj2, str2);
                                    return 4;
                                }
                                G(str, str2, (Bundle) obj3, list, z10);
                            }
                        } else {
                            return 4;
                        }
                        return i6;
                    }
                    return 4;
                }
            } else {
                return 21;
            }
        }
        i6 = 0;
        if (S(str)) {
        }
        y3Var.getClass();
        i10 = 256;
        if (!M("param", str2, i10, obj)) {
        }
    }

    public final void L() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.C.b("Utils falling back to Random for random id");
            }
        }
        this.f32699x.set(nextLong);
    }

    public final boolean M(String str, String str2, int i6, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i6) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.E.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean N(String str, String str2) {
        y3 y3Var = this.f32943u;
        if (str2 == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.B.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.B.c(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    w2 w2Var3 = y3Var.C;
                    y3.k(w2Var3);
                    w2Var3.B.d("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    w2 w2Var4 = y3Var.C;
                    y3.k(w2Var4);
                    w2Var4.B.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean O(String str, String str2) {
        y3 y3Var = this.f32943u;
        if (str2 == null) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.B.c(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.B.c(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.B.d("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    w2 w2Var4 = y3Var.C;
                    y3.k(w2Var4);
                    w2Var4.B.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean P(String str) {
        h();
        y3 y3Var = this.f32943u;
        if (ca.c.a(y3Var.f32953u).f5222a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.G.c(str, "Permission not granted");
        return false;
    }

    public final boolean R(Context context, String str) {
        Signature[] signatureArr;
        y3 y3Var = this.f32943u;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = ca.c.a(context).b(64, str);
            if (b10 != null && (signatureArr = b10.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.f32925z.c(e10, "Package name not found");
            return true;
        } catch (CertificateException e11) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.c(e11, "Error obtaining certificate");
            return true;
        }
    }

    public final int Z(String str) {
        boolean equals = "_ldl".equals(str);
        y3 y3Var = this.f32943u;
        if (equals) {
            y3Var.getClass();
            return Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
        } else if ("_id".equals(str)) {
            y3Var.getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            y3Var.getClass();
            return 100;
        } else {
            y3Var.getClass();
            return 36;
        }
    }

    public final Object a0(int i6, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        long j10;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                return Long.valueOf(j10);
            } else if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            } else {
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle l02 = l0((Bundle) parcelable);
                            if (!l02.isEmpty()) {
                                arrayList.add(l02);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return o(obj.toString(), i6, z10);
            }
        }
        return obj;
    }

    public final int c0(Object obj, String str) {
        boolean M;
        if ("_ldl".equals(str)) {
            M = M("user property referrer", str, Z(str), obj);
        } else {
            M = M("user property", str, Z(str), obj);
        }
        if (M) {
            return 0;
        }
        return 7;
    }

    public final int d0(String str) {
        if (!N("event", str)) {
            return 2;
        }
        if (!J("event", kc.f.f23225o0, kc.f.f23226p0, str)) {
            return 13;
        }
        this.f32943u.getClass();
        if (!I(40, "event", str)) {
            return 2;
        }
        return 0;
    }

    public final int e0(String str) {
        if (!N("event param", str)) {
            return 3;
        }
        if (!J("event param", null, null, str)) {
            return 14;
        }
        this.f32943u.getClass();
        if (!I(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final int f0(String str) {
        if (!O("event param", str)) {
            return 3;
        }
        if (!J("event param", null, null, str)) {
            return 14;
        }
        this.f32943u.getClass();
        if (!I(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final int g0(String str) {
        if (!N("user property", str)) {
            return 6;
        }
        if (!J("user property", f6.b.K, null, str)) {
            return 15;
        }
        this.f32943u.getClass();
        if (!I(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final int h0() {
        if (this.f32701z == null) {
            s9.f fVar = s9.f.f31339b;
            Context context = this.f32943u.f32953u;
            fVar.getClass();
            AtomicBoolean atomicBoolean = s9.h.f31341a;
            int i6 = 0;
            try {
                i6 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f32701z = Integer.valueOf(i6 / 1000);
        }
        return this.f32701z.intValue();
    }

    @Override // ta.e4
    public final boolean i() {
        return true;
    }

    public final long j0() {
        long andIncrement;
        long j10;
        if (this.f32699x.get() == 0) {
            synchronized (this.f32699x) {
                long nanoTime = System.nanoTime();
                this.f32943u.H.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i6 = this.f32700y + 1;
                this.f32700y = i6;
                j10 = nextLong + i6;
            }
            return j10;
        }
        synchronized (this.f32699x) {
            this.f32699x.compareAndSet(-1L, 1L);
            andIncrement = this.f32699x.getAndIncrement();
        }
        return andIncrement;
    }

    public final Bundle k0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString(Constants.CAMPAIGN_ID, str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.C.c(e10, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final Object l(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i6 = 256;
        y3 y3Var = this.f32943u;
        if (equals) {
            y3Var.getClass();
            return a0(256, obj, true, true);
        }
        if (S(str)) {
            y3Var.getClass();
        } else {
            y3Var.getClass();
            i6 = 100;
        }
        return a0(i6, obj, false, true);
    }

    public final Bundle l0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object l2 = l(bundle.get(str), str);
                if (l2 == null) {
                    y3 y3Var = this.f32943u;
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.E.c(y3Var.G.e(str), "Param value can't be null");
                } else {
                    y(bundle2, str, l2);
                }
            }
        }
        return bundle2;
    }

    public final Object m(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return a0(Z(str), obj, true, false);
        }
        return a0(Z(str), obj, false, false);
    }

    public final Bundle m0(String str, Bundle bundle, List list, boolean z10) {
        int i6;
        String str2;
        String str3;
        List list2 = list;
        boolean b02 = b0(str, kc.f.f23228r0);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            y3 y3Var = this.f32943u;
            int k10 = y3Var.A.k();
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (list2 != null && list2.contains(str4)) {
                    i6 = 0;
                } else {
                    if (!z10) {
                        i6 = f0(str4);
                    } else {
                        i6 = 0;
                    }
                    if (i6 == 0) {
                        i6 = e0(str4);
                    }
                }
                if (i6 != 0) {
                    if (i6 == 3) {
                        str3 = str4;
                    } else {
                        str3 = null;
                    }
                    t(bundle2, i6, str4, str3);
                    bundle2.remove(str4);
                } else {
                    int K = K(str, str4, bundle.get(str4), bundle2, list, z10, b02);
                    if (K == 17) {
                        t(bundle2, 17, str4, Boolean.FALSE);
                    } else if (K != 0 && !"_ev".equals(str4)) {
                        if (K == 21) {
                            str2 = str;
                        } else {
                            str2 = str4;
                        }
                        t(bundle2, K, str2, bundle.get(str4));
                        bundle2.remove(str4);
                    }
                    if (T(str4)) {
                        int i11 = i10 + 1;
                        if (i11 > k10) {
                            StringBuilder u10 = defpackage.c.u("Event can't contain more than ", k10, " params");
                            w2 w2Var = y3Var.C;
                            y3.k(w2Var);
                            String sb2 = u10.toString();
                            r2 r2Var = y3Var.G;
                            w2Var.B.d(sb2, r2Var.d(str), r2Var.b(bundle));
                            Y(5, bundle2);
                            bundle2.remove(str4);
                        }
                        i10 = i11;
                    }
                }
                list2 = list;
            }
            return bundle2;
        }
        return null;
    }

    public final String n() {
        byte[] bArr = new byte[16];
        q().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final s n0(String str, Bundle bundle, String str2, long j10, boolean z10) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (d0(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle m02 = m0(str, bundle2, Collections.singletonList("_o"), true);
            if (z10) {
                m02 = l0(m02);
            }
            v9.o.h(m02);
            return new s(str, new q(m02), str2, j10);
        }
        y3 y3Var = this.f32943u;
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.f32925z.c(y3Var.G.f(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final SecureRandom q() {
        h();
        if (this.f32698w == null) {
            this.f32698w = new SecureRandom();
        }
        return this.f32698w;
    }

    public final void s(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void t(Bundle bundle, int i6, String str, Object obj) {
        if (Y(i6, bundle)) {
            this.f32943u.getClass();
            bundle.putString("_ev", o(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void v(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                k6 k6Var = this.f32943u.F;
                y3.i(k6Var);
                k6Var.y(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void w(x2 x2Var, int i6) {
        Bundle bundle = x2Var.f32942d;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (T(str) && (i10 = i10 + 1) > i6) {
                StringBuilder u10 = defpackage.c.u("Event can't contain more than ", i6, " params");
                y3 y3Var = this.f32943u;
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                String sb2 = u10.toString();
                String str2 = x2Var.f32939a;
                r2 r2Var = y3Var.G;
                w2Var.B.d(sb2, r2Var.d(str2), r2Var.b(bundle));
                Y(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void y(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            y3 y3Var = this.f32943u;
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.E.d("Not putting event parameter. Invalid value type. name, type", y3Var.G.e(str), str2);
        }
    }

    public final void z(com.google.android.gms.internal.measurement.n0 n0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            n0Var.t(bundle);
        } catch (RemoteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning boolean value to wrapper");
        }
    }
}
