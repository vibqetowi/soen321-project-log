package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.SessionManager;
import ef.d;
import gf.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import k1.a;
import kotlin.jvm.internal.i;
import qq.x;
import v.h;
/* compiled from: R8$$SyntheticClass */
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ String A(int i6) {
        if (i6 == 1) {
            return "DISMISS";
        }
        if (i6 == 2) {
            return "TRACK_DATA";
        }
        if (i6 == 3) {
            return "NAVIGATE";
        }
        if (i6 == 4) {
            return "SHARE";
        }
        if (i6 == 5) {
            return "COPY_TEXT";
        }
        if (i6 == 6) {
            return "CALL";
        }
        if (i6 == 7) {
            return "SMS";
        }
        if (i6 == 8) {
            return "CUSTOM_ACTION";
        }
        if (i6 == 9) {
            return "CONDITION_ACTION";
        }
        if (i6 == 10) {
            return "USER_INPUT";
        }
        if (i6 == 11) {
            return "REQUEST_NOTIFICATION_PERMISSION";
        }
        if (i6 == 12) {
            return "NAVIGATE_SETTINGS_NOTIFICATIONS";
        }
        return "null";
    }

    public static /* synthetic */ String B(int i6) {
        if (i6 == 1) {
            return "FROM_NUMBER_WITH_PLUS_SIGN";
        }
        if (i6 == 2) {
            return "FROM_NUMBER_WITH_IDD";
        }
        if (i6 == 3) {
            return "FROM_NUMBER_WITHOUT_PLUS_SIGN";
        }
        if (i6 == 4) {
            return "FROM_DEFAULT_COUNTRY";
        }
        if (i6 == 5) {
            return "UNSPECIFIED";
        }
        return "null";
    }

    public static /* synthetic */ String C(int i6) {
        if (i6 == 1) {
            return "PRE_COMP";
        }
        if (i6 == 2) {
            return "SOLID";
        }
        if (i6 == 3) {
            return "IMAGE";
        }
        if (i6 == 4) {
            return "NULL";
        }
        if (i6 == 5) {
            return "SHAPE";
        }
        if (i6 == 6) {
            return "TEXT";
        }
        if (i6 == 7) {
            return "UNKNOWN";
        }
        return "null";
    }

    public static /* synthetic */ String D(int i6) {
        if (i6 == 1) {
            return "INITIALIZE";
        }
        if (i6 == 2) {
            return "RESOURCE_CACHE";
        }
        if (i6 == 3) {
            return "DATA_CACHE";
        }
        if (i6 == 4) {
            return "SOURCE";
        }
        if (i6 == 5) {
            return "ENCODE";
        }
        if (i6 == 6) {
            return "FINISHED";
        }
        return "null";
    }

    public static /* synthetic */ String E(int i6) {
        if (i6 == 1) {
            return "BEGIN_ARRAY";
        }
        if (i6 == 2) {
            return "END_ARRAY";
        }
        if (i6 == 3) {
            return "BEGIN_OBJECT";
        }
        if (i6 == 4) {
            return "END_OBJECT";
        }
        if (i6 == 5) {
            return "NAME";
        }
        if (i6 == 6) {
            return "STRING";
        }
        if (i6 == 7) {
            return "NUMBER";
        }
        if (i6 == 8) {
            return "BOOLEAN";
        }
        if (i6 == 9) {
            return "NULL";
        }
        if (i6 == 10) {
            return "END_DOCUMENT";
        }
        return "null";
    }

    public static /* synthetic */ int F(String str) {
        if (str != null) {
            if (str.equals("DISMISS")) {
                return 1;
            }
            if (str.equals("TRACK_DATA")) {
                return 2;
            }
            if (str.equals("NAVIGATE")) {
                return 3;
            }
            if (str.equals("SHARE")) {
                return 4;
            }
            if (str.equals("COPY_TEXT")) {
                return 5;
            }
            if (str.equals("CALL")) {
                return 6;
            }
            if (str.equals("SMS")) {
                return 7;
            }
            if (str.equals("CUSTOM_ACTION")) {
                return 8;
            }
            if (str.equals("CONDITION_ACTION")) {
                return 9;
            }
            if (str.equals("USER_INPUT")) {
                return 10;
            }
            if (str.equals("REQUEST_NOTIFICATION_PERMISSION")) {
                return 11;
            }
            if (str.equals("NAVIGATE_SETTINGS_NOTIFICATIONS")) {
                return 12;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.model.enums.ActionType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int G(String str) {
        if (str != null) {
            if (str.equals("MALE")) {
                return 1;
            }
            if (str.equals("FEMALE")) {
                return 2;
            }
            if (str.equals("OTHER")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.core.model.UserGender.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static int[] _values() {
        return h.e(12);
    }

    public static /* synthetic */ String a(int i6) {
        if (i6 == 1) {
            return "_fstec";
        }
        if (i6 == 2) {
            return "_fsntc";
        }
        if (i6 == 3) {
            return "_tsns";
        }
        if (i6 == 4) {
            return "_fr_tot";
        }
        if (i6 == 5) {
            return "_fr_slo";
        }
        if (i6 == 6) {
            return "_fr_fzn";
        }
        throw null;
    }

    public static /* synthetic */ int b(int i6) {
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 == 4) {
            return 3;
        }
        if (i6 == 5) {
            return 4;
        }
        if (i6 == 6) {
            return 5;
        }
        if (i6 == 7) {
            return 130;
        }
        if (i6 == 8) {
            return 131;
        }
        if (i6 == 9) {
            return 132;
        }
        if (i6 == 10) {
            return 133;
        }
        if (i6 == 11) {
            return 134;
        }
        if (i6 == 12) {
            return 135;
        }
        if (i6 == 13) {
            return 136;
        }
        if (i6 == 14) {
            return 137;
        }
        if (i6 == 15) {
            return 190;
        }
        if (i6 == 16) {
            return 10;
        }
        if (i6 == 17) {
            return 11;
        }
        if (i6 == 18) {
            return 12;
        }
        if (i6 == 19) {
            return 13;
        }
        if (i6 == 20) {
            return 14;
        }
        if (i6 == 21) {
            return 15;
        }
        if (i6 == 22) {
            return 16;
        }
        if (i6 == 23) {
            return 17;
        }
        if (i6 == 24) {
            return 18;
        }
        if (i6 == 25) {
            return 19;
        }
        if (i6 == 26) {
            return 20;
        }
        if (i6 == 27) {
            return 30;
        }
        if (i6 == 28) {
            return 31;
        }
        if (i6 == 29) {
            return 32;
        }
        if (i6 == 30) {
            return 40;
        }
        if (i6 == 31) {
            return 44;
        }
        if (i6 == 32) {
            return 41;
        }
        if (i6 == 33) {
            return 42;
        }
        if (i6 == 34) {
            return 43;
        }
        if (i6 == 35) {
            return 50;
        }
        if (i6 == 36) {
            return 51;
        }
        if (i6 == 37) {
            return 52;
        }
        if (i6 == 38) {
            return 53;
        }
        if (i6 == 39) {
            return 60;
        }
        if (i6 == 40) {
            return 70;
        }
        if (i6 == 41) {
            return 71;
        }
        if (i6 == 42) {
            return 72;
        }
        if (i6 == 43) {
            return 73;
        }
        if (i6 == 44) {
            return 160;
        }
        if (i6 == 45) {
            return 170;
        }
        if (i6 == 46) {
            return 171;
        }
        if (i6 == 47) {
            return 183;
        }
        if (i6 == 48) {
            return 172;
        }
        if (i6 == 49) {
            return 173;
        }
        if (i6 == 50) {
            return 174;
        }
        if (i6 == 51) {
            return 175;
        }
        if (i6 == 52) {
            return 176;
        }
        if (i6 == 53) {
            return 185;
        }
        if (i6 == 54) {
            return 186;
        }
        if (i6 == 55) {
            return 184;
        }
        if (i6 == 56) {
            return 177;
        }
        if (i6 == 57) {
            return 178;
        }
        if (i6 == 58) {
            return 179;
        }
        if (i6 == 59) {
            return SubsamplingScaleImageView.ORIENTATION_180;
        }
        if (i6 == 60) {
            return 181;
        }
        if (i6 == 61) {
            return 182;
        }
        if (i6 == 62) {
            return 201;
        }
        if (i6 == 63) {
            return 202;
        }
        if (i6 == 64) {
            return 203;
        }
        if (i6 == 65) {
            return 204;
        }
        if (i6 == 66) {
            return 205;
        }
        if (i6 == 67) {
            return 206;
        }
        if (i6 == 68) {
            return 207;
        }
        if (i6 == 69) {
            return 208;
        }
        if (i6 == 70) {
            return 209;
        }
        if (i6 == 71) {
            return 210;
        }
        if (i6 == 72) {
            return 211;
        }
        if (i6 == 73) {
            return 212;
        }
        if (i6 == 74) {
            return 213;
        }
        if (i6 == 75) {
            return 214;
        }
        if (i6 == 76) {
            return 215;
        }
        if (i6 == 77) {
            return 216;
        }
        if (i6 == 78) {
            return 220;
        }
        if (i6 == 79) {
            return 221;
        }
        if (i6 == 80) {
            return 222;
        }
        if (i6 == 81) {
            return 223;
        }
        if (i6 == 82) {
            return 224;
        }
        if (i6 == 83) {
            return 225;
        }
        if (i6 == 84) {
            return 226;
        }
        if (i6 == 85) {
            return 227;
        }
        if (i6 == 86) {
            return 228;
        }
        if (i6 == 87) {
            return 241;
        }
        if (i6 == 88) {
            return 242;
        }
        if (i6 == 89) {
            return 250;
        }
        if (i6 == 90) {
            return 251;
        }
        if (i6 == 91) {
            return 260;
        }
        if (i6 == 92) {
            return 261;
        }
        if (i6 == 93) {
            return SubsamplingScaleImageView.ORIENTATION_270;
        }
        if (i6 == 94) {
            return 271;
        }
        if (i6 == 95) {
            return 272;
        }
        if (i6 == 96) {
            return 280;
        }
        if (i6 == 97) {
            return 290;
        }
        if (i6 == 98) {
            return 300;
        }
        if (i6 == 99) {
            return 301;
        }
        if (i6 == 100) {
            return 302;
        }
        if (i6 == 101) {
            return 303;
        }
        if (i6 == 102) {
            return 304;
        }
        if (i6 == 103) {
            return 310;
        }
        if (i6 == 104) {
            return 311;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i6) {
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 == 4) {
            return 3;
        }
        if (i6 == 5) {
            return 4;
        }
        if (i6 == 6) {
            return -1;
        }
        throw null;
    }

    public static long d(Calendar calendar, long j10, long j11) {
        return (j10 - calendar.getTimeInMillis()) / j11;
    }

    public static View e(RecyclerView recyclerView, String str, int i6, RecyclerView recyclerView2, boolean z10) {
        i.g(recyclerView, str);
        return LayoutInflater.from(recyclerView.getContext()).inflate(i6, recyclerView2, z10);
    }

    public static User f(Bundle bundle, String str, String str2) {
        bundle.putString(str, str2);
        return FirebasePersistence.getInstance().getUser();
    }

    public static String g() {
        return FirebasePersistence.getInstance().getUser().getCurrentCourseName();
    }

    public static String h(int i6, String str, int i10) {
        StringBuilder sb2 = new StringBuilder(i6);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String i(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.B());
        return sb2.toString();
    }

    public static String j(String str, int i6, String str2, int i10) {
        return str + i6 + str2 + i10;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(String str, Class cls) {
        return str + cls;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(String str, Date date) {
        return new SimpleDateFormat(str).format(date);
    }

    public static String o(Object[] objArr, int i6, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i6));
        i.f(format, str2);
        return format;
    }

    public static ArrayList p(int i6, HashMap hashMap, ArrayList arrayList, int i10, String str) {
        hashMap.put(Integer.valueOf(i6), arrayList);
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.add(str);
        return arrayList2;
    }

    public static /* synthetic */ Iterator q() {
        try {
            return Arrays.asList(new hv.b()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static a r(Fragment fragment, String str) {
        a defaultViewModelCreationExtras = fragment.requireActivity().getDefaultViewModelCreationExtras();
        i.f(defaultViewModelCreationExtras, str);
        return defaultViewModelCreationExtras;
    }

    public static void s(Bundle bundle, String str, Bundle bundle2, String str2) {
        bundle.putString(str, FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        gk.a.b(bundle2, str2);
    }

    public static void t(kf.i iVar, d dVar, d dVar2) {
        dVar.j(iVar.a());
        g.c(dVar2);
    }

    public static boolean u(String str, String str2) {
        return i.b(SessionManager.getInstance().getStringValue(str), str2);
    }

    public static boolean v(x xVar, int i6, String str, String str2, HashMap hashMap, Boolean bool) {
        String string = xVar.getString(i6);
        i.f(string, str);
        String lowerCase = string.toLowerCase();
        i.f(lowerCase, str2);
        return i.b(hashMap.get(lowerCase), bool);
    }

    public static /* synthetic */ String w(int i6) {
        if (i6 == 1) {
            return "UNKNOWN_KEYMATERIAL";
        }
        if (i6 == 2) {
            return "SYMMETRIC";
        }
        if (i6 == 3) {
            return "ASYMMETRIC_PRIVATE";
        }
        if (i6 == 4) {
            return "ASYMMETRIC_PUBLIC";
        }
        if (i6 == 5) {
            return "REMOTE";
        }
        if (i6 == 6) {
            return "UNRECOGNIZED";
        }
        throw null;
    }

    public static /* synthetic */ String x(int i6) {
        if (i6 == 1) {
            return "MALE";
        }
        if (i6 == 2) {
            return "FEMALE";
        }
        if (i6 == 3) {
            return "OTHER";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i6) {
        if (i6 == 1) {
            return "STRING";
        }
        if (i6 == 2) {
            return "DOUBLE";
        }
        if (i6 == 3) {
            return "INTEGER";
        }
        if (i6 == 4) {
            return "LONG";
        }
        if (i6 == 5) {
            return "BOOLEAN";
        }
        if (i6 == 6) {
            return "FLOAT";
        }
        throw null;
    }

    public static /* synthetic */ String z(int i6) {
        if (i6 == 1) {
            return "NONE";
        }
        if (i6 == 2) {
            return "ADDING";
        }
        if (i6 == 3) {
            return "REMOVING";
        }
        return "null";
    }
}
