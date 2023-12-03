package pl;

import android.media.UnsupportedSchemeException;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.drm.g;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.UUID;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements g.c {
    public static int b(int i6, int i10, int i11, int i12) {
        return ((i6 * i10) / i11) + i12;
    }

    public static int c(String str, int i6, int i10) {
        return (str.hashCode() + i6) * i10;
    }

    public static View d(TopicalCourseActivity topicalCourseActivity, int i6, RobertoTextView robertoTextView, View view, int i10) {
        robertoTextView.setText(topicalCourseActivity.getString(i6));
        return view.findViewById(i10);
    }

    public static o0.b e(Fragment fragment, String str) {
        o0.b defaultViewModelProviderFactory = fragment.requireActivity().getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.i.f(defaultViewModelProviderFactory, str);
        return defaultViewModelProviderFactory;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(StringBuilder sb2, int i6, String str) {
        sb2.append(i6);
        sb2.append(str);
        return sb2.toString();
    }

    public static void h(int i6, HashMap hashMap, String str, int i10, String str2, int i11, String str3, int i12, String str4) {
        hashMap.put(str, Integer.valueOf(i6));
        hashMap.put(str2, Integer.valueOf(i10));
        hashMap.put(str3, Integer.valueOf(i11));
        hashMap.put(str4, Integer.valueOf(i12));
    }

    public static /* bridge */ /* synthetic */ void i(Object obj) {
        throw null;
    }

    public static /* synthetic */ String j(int i6) {
        if (i6 == 1) {
            return "HTML";
        }
        if (i6 == 2) {
            return "NATIVE";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i6) {
        if (i6 == 1) {
            return "BUTTON";
        }
        if (i6 == 2) {
            return "TEXT";
        }
        if (i6 == 3) {
            return "IMAGE";
        }
        if (i6 == 4) {
            return "RATING";
        }
        if (i6 == 5) {
            return "CLOSE_BUTTON";
        }
        return "null";
    }

    public static /* synthetic */ String l(int i6) {
        if (i6 == 1) {
            return "INFLEXIBLE";
        }
        if (i6 == 2) {
            return "FLEXIBLE_UPPER_BOUND";
        }
        if (i6 == 3) {
            return "FLEXIBLE_LOWER_BOUND";
        }
        return "null";
    }

    public static /* synthetic */ String m(int i6) {
        if (i6 == 1) {
            return "HEADER";
        }
        if (i6 == 2) {
            return "BODY";
        }
        return "null";
    }

    public static /* synthetic */ String n(int i6) {
        if (i6 == 1) {
            return "INBOUND";
        }
        if (i6 == 2) {
            return "OUTBOUND";
        }
        return "null";
    }

    public static /* synthetic */ int o(String str) {
        if (str != null) {
            if (str.equals("HTML")) {
                return 1;
            }
            if (str.equals("NATIVE")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.InAppType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int p(String str) {
        if (str != null) {
            if (str.equals("BUTTON")) {
                return 1;
            }
            if (str.equals("TEXT")) {
                return 2;
            }
            if (str.equals("IMAGE")) {
                return 3;
            }
            if (str.equals("RATING")) {
                return 4;
            }
            if (str.equals("CLOSE_BUTTON")) {
                return 5;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.ViewType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    @Override // com.google.android.exoplayer2.drm.g.c
    public com.google.android.exoplayer2.drm.g a(UUID uuid) {
        try {
            try {
                return new com.google.android.exoplayer2.drm.h(uuid);
            } catch (UnsupportedDrmException unused) {
                String valueOf = String.valueOf(uuid);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
                sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                sb2.append(valueOf);
                sb2.append(".");
                Log.e("FrameworkMediaDrm", sb2.toString());
                return new com.google.android.exoplayer2.drm.e();
            }
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(e11);
        }
    }
}
