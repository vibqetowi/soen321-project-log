package v;

import android.view.View;
import android.widget.LinearLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ String a(int i6) {
        if (i6 == 1) {
            return "No member resolution should be done on captured type, it used only during constraint system resolution";
        }
        if (i6 == 2) {
            return "Scope for integer literal type (%s)";
        }
        if (i6 == 3) {
            return "Error scope for erased receiver type";
        }
        if (i6 == 4) {
            return "Scope for abbreviation %s";
        }
        if (i6 == 5) {
            return "Scope for stub type %s";
        }
        if (i6 == 6) {
            return "A scope for common supertype which is not a normal classifier";
        }
        if (i6 == 7) {
            return "Scope for error type %s";
        }
        if (i6 == 8) {
            return "Scope for unsupported type %s";
        }
        if (i6 == 9) {
            return "Error scope for class %s with arguments: %s";
        }
        if (i6 == 10) {
            return "Error resolution candidate for call %s";
        }
        throw null;
    }

    public static View b(LinearLayout linearLayout, int i6) {
        return linearLayout.getChildAt(linearLayout.getChildCount() - i6);
    }

    public static String c(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static /* synthetic */ String e(int i6) {
        if (i6 == 1) {
            return "HEADER";
        }
        if (i6 == 2) {
            return "HEADER_EXTRA_LEN";
        }
        if (i6 == 3) {
            return "HEADER_EXTRA";
        }
        if (i6 == 4) {
            return "HEADER_NAME";
        }
        if (i6 == 5) {
            return "HEADER_COMMENT";
        }
        if (i6 == 6) {
            return "HEADER_CRC";
        }
        if (i6 == 7) {
            return "INITIALIZE_INFLATER";
        }
        if (i6 == 8) {
            return "INFLATING";
        }
        if (i6 == 9) {
            return "INFLATER_NEEDS_INPUT";
        }
        if (i6 == 10) {
            return "TRAILER";
        }
        return "null";
    }

    public static /* synthetic */ int f(String str) {
        if (str != null) {
            if (str.equals("DEFAULT")) {
                return 1;
            }
            if (str.equals("APP")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.core.internal.security.SecretKeyType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
