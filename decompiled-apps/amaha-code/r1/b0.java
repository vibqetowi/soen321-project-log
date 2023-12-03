package r1;

import android.os.Bundle;
import com.theinnerhour.b2b.activity.TemplateActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 {
    public static Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String b(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static boolean c(TemplateActivity templateActivity, String str, String str2) {
        return kotlin.jvm.internal.i.b(templateActivity.getIntent().getStringExtra(str), str2);
    }

    public static /* synthetic */ String d(int i6) {
        if (i6 == 1) {
            return "GET";
        }
        if (i6 == 2) {
            return "POST";
        }
        if (i6 == 3) {
            return "PUT";
        }
        if (i6 == 4) {
            return "DELETE";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i6) {
        if (i6 == 1) {
            return "NULL_VALUE";
        }
        if (i6 == 2) {
            return "BOOLEAN_VALUE";
        }
        if (i6 == 3) {
            return "INTEGER_VALUE";
        }
        if (i6 == 4) {
            return "DOUBLE_VALUE";
        }
        if (i6 == 5) {
            return "TIMESTAMP_VALUE";
        }
        if (i6 == 6) {
            return "STRING_VALUE";
        }
        if (i6 == 7) {
            return "BYTES_VALUE";
        }
        if (i6 == 8) {
            return "REFERENCE_VALUE";
        }
        if (i6 == 9) {
            return "GEO_POINT_VALUE";
        }
        if (i6 == 10) {
            return "ARRAY_VALUE";
        }
        if (i6 == 11) {
            return "MAP_VALUE";
        }
        if (i6 == 12) {
            return "VALUETYPE_NOT_SET";
        }
        return "null";
    }

    public static /* synthetic */ String f(int i6) {
        if (i6 == 1) {
            return "EVENT";
        }
        if (i6 == 2) {
            return "USER_ATTRIBUTE";
        }
        return "null";
    }

    public static /* synthetic */ String g(int i6) {
        if (i6 == 1) {
            return "RATING";
        }
        return "null";
    }

    public static /* synthetic */ String h(int i6) {
        if (i6 == 1) {
            return "OK";
        }
        if (i6 == 2) {
            return "BAD_CONFIG";
        }
        if (i6 == 3) {
            return "AUTH_ERROR";
        }
        return "null";
    }

    public static /* synthetic */ String i(int i6) {
        if (i6 == 1) {
            return "TLS";
        }
        if (i6 == 2) {
            return "PLAINTEXT";
        }
        return "null";
    }

    public static /* synthetic */ String j(int i6) {
        if (i6 == 1) {
            return "GET";
        }
        if (i6 == 2) {
            return "POST";
        }
        if (i6 == 3) {
            return "PUT";
        }
        if (i6 == 4) {
            return "DELETE";
        }
        return "null";
    }

    public static /* synthetic */ String k(int i6) {
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

    public static /* synthetic */ int l(String str) {
        if (str != null) {
            if (str.equals("EVENT")) {
                return 1;
            }
            if (str.equals("USER_ATTRIBUTE")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.DataTrackType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int m(String str) {
        if (str != null) {
            if (str.equals("RATING")) {
                return 1;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.UserInputType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
