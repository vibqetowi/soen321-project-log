package ri;

import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import cu.b;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ boolean a(int i6) {
        if (i6 == 1) {
            return false;
        }
        if (i6 == 2) {
            return true;
        }
        if (i6 == 3) {
            return false;
        }
        if (i6 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ boolean b(int i6) {
        if (i6 == 1 || i6 == 2) {
            return false;
        }
        if (i6 == 3 || i6 == 4) {
            return true;
        }
        throw null;
    }

    public static int c(String str, int i6) {
        return String.valueOf(str).length() + i6;
    }

    public static Object d(String str) {
        return FirebasePersistence.getInstance().getUser().getAppConfig().get(str);
    }

    public static String e(Locale locale, String str, String str2, Locale locale2, String str3) {
        i.f(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        i.f(lowerCase, str3);
        return lowerCase;
    }

    public static void f(zq.a aVar, Utils utils, int i6, RobertoTextView robertoTextView) {
        robertoTextView.setTextColor(utils.checkBuildBeforesetColor(i6, aVar.getContext()));
    }

    public static boolean g(b.a aVar, int i6, String str) {
        Boolean c10 = aVar.c(i6);
        i.f(c10, str);
        return c10.booleanValue();
    }

    public static /* synthetic */ String h(int i6) {
        if (i6 == 1) {
            return "ATTEMPT_MIGRATION";
        }
        if (i6 == 2) {
            return "NOT_GENERATED";
        }
        if (i6 == 3) {
            return "UNREGISTERED";
        }
        if (i6 == 4) {
            return "REGISTERED";
        }
        if (i6 == 5) {
            return "REGISTER_ERROR";
        }
        return "null";
    }

    public static /* synthetic */ String i(int i6) {
        if (i6 == 1) {
            return "OK";
        }
        if (i6 == 2) {
            return "BAD_CONFIG";
        }
        return "null";
    }

    public static /* synthetic */ String j(int i6) {
        if (i6 == 1) {
            return "EVENT";
        }
        if (i6 == 2) {
            return "FLUSH";
        }
        return "null";
    }

    public static /* synthetic */ String k(int i6) {
        if (i6 == 1) {
            return "SUPERTYPE";
        }
        if (i6 == 2) {
            return "COMMON";
        }
        return "null";
    }

    public static /* synthetic */ String l(int i6) {
        if (i6 == 1) {
            return "UNKNOWN";
        }
        if (i6 == 2) {
            return "HORIZONTAL_DIMENSION";
        }
        if (i6 == 3) {
            return "VERTICAL_DIMENSION";
        }
        if (i6 == 4) {
            return "LEFT";
        }
        if (i6 == 5) {
            return "RIGHT";
        }
        if (i6 == 6) {
            return "TOP";
        }
        if (i6 == 7) {
            return "BOTTOM";
        }
        if (i6 == 8) {
            return "BASELINE";
        }
        return "null";
    }

    public static /* synthetic */ String m(int i6) {
        if (i6 == 1) {
            return "INVARIANT";
        }
        if (i6 == 2) {
            return "IN";
        }
        if (i6 == 3) {
            return "OUT";
        }
        return "null";
    }

    public static /* synthetic */ int n(String str) {
        if (str != null) {
            if (str.equals("CENTER")) {
                return 1;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.TemplateAlignment.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
