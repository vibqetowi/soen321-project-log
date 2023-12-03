package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import c9.j;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.model.AssessmentQuestionOld;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.i;
import nn.h;
import o8.e;
import p7.o;
/* compiled from: R8$$SyntheticClass */
/* renamed from: d */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements j.a {
    public /* synthetic */ d(o.a aVar, o8.d dVar, e eVar, IOException iOException, boolean z10) {
    }

    public static /* synthetic */ int A(String str) {
        if (str != null) {
            if (str.equals("AUTO")) {
                return 1;
            }
            if (str.equals("TEXT")) {
                return 2;
            }
            if (str.equals("BYTE")) {
                return 3;
            }
            if (str.equals("NUMERIC")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int B(String str) {
        if (str != null) {
            if (str.equals("GENERAL")) {
                return 1;
            }
            if (str.equals("PUSH_OPT_IN")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.CampaignSubType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int C(String str) {
        if (str != null) {
            if (str.equals("HORIZONTAL")) {
                return 1;
            }
            if (str.equals("VERTICAL")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.Orientation.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int D(String str) {
        if (str != null) {
            if (str.equals("WIDGET")) {
                return 1;
            }
            if (str.equals("CONTAINER")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.WidgetType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ int a(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i6) {
        if (i6 == 1) {
            return "events";
        }
        if (i6 == 2) {
            return "people";
        }
        if (i6 == 3) {
            return "anonymous_people";
        }
        if (i6 == 4) {
            return "groups";
        }
        throw null;
    }

    public static Bundle c(DepressionExerciseActivity depressionExerciseActivity, a aVar, boolean z10, boolean z11) {
        depressionExerciseActivity.v0();
        depressionExerciseActivity.u0(aVar, z10, z11);
        return new Bundle();
    }

    public static View d(RecyclerView recyclerView, int i6, RecyclerView recyclerView2, boolean z10) {
        return LayoutInflater.from(recyclerView.getContext()).inflate(i6, recyclerView2, z10);
    }

    public static View e(h hVar, int i6, RobertoTextView robertoTextView, int i10) {
        robertoTextView.setTextColor(g0.a.b(hVar.requireContext(), i6));
        return hVar._$_findCachedViewById(i10);
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder g(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static ArrayList h(ArrayList arrayList, AssessmentQuestionOld assessmentQuestionOld) {
        arrayList.add(assessmentQuestionOld);
        return new ArrayList();
    }

    public static Map i(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void j(int i6, String str) {
        if (i6 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i.k(str));
        i.m(i.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void k(int i6, String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(i6);
        sb2.append(str);
        sb2.append(i10);
        Log.w(str2, sb2.toString());
    }

    public static void l(int i6, HashSet hashSet, HashSet hashSet2, String str) {
        hashSet.add(Integer.valueOf(i6));
        hashSet2.add(str);
    }

    public static void m(Bundle bundle, String str) {
        bundle.putString(str, FirebasePersistence.getInstance().getUser().getCurrentCourseName());
    }

    public static /* bridge */ /* synthetic */ void n(Object obj, int i6, int i10, int i11) {
        throw null;
    }

    public static void o(String str, Bundle bundle, String str2, String str3, String str4) {
        bundle.putString(str2, ApplicationPersistence.getInstance().getStringValue(str));
        bundle.putString(str3, str4);
    }

    public static void p(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }

    public static boolean q(String str) {
        return i.b(FirebasePersistence.getInstance().getUser().getVersion(), str);
    }

    public static /* synthetic */ void r(int i6, String str) {
        if (i6 != 0) {
            return;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static /* synthetic */ String s(int i6) {
        if (i6 == 1) {
            return "GENERAL";
        }
        if (i6 == 2) {
            return "PUSH_OPT_IN";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i6) {
        if (i6 == 1) {
            return "INVALID_COUNTRY_CODE";
        }
        if (i6 == 2) {
            return "NOT_A_NUMBER";
        }
        if (i6 == 3) {
            return "TOO_SHORT_AFTER_IDD";
        }
        if (i6 == 4) {
            return "TOO_SHORT_NSN";
        }
        if (i6 == 5) {
            return "TOO_LONG";
        }
        return "null";
    }

    public static /* synthetic */ String u(int i6) {
        if (i6 == 1) {
            return "OK";
        }
        if (i6 == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i6 == 3) {
            return "FATAL_ERROR";
        }
        if (i6 == 4) {
            return "INVALID_PAYLOAD";
        }
        return "null";
    }

    public static /* synthetic */ String v(int i6) {
        if (i6 == 1) {
            return "IDLE";
        }
        if (i6 == 2) {
            return "QUEUING";
        }
        if (i6 == 3) {
            return "QUEUED";
        }
        if (i6 == 4) {
            return "RUNNING";
        }
        return "null";
    }

    public static /* synthetic */ String w(int i6) {
        if (i6 == 1) {
            return "HAS_LOCAL_MUTATIONS";
        }
        if (i6 == 2) {
            return "HAS_COMMITTED_MUTATIONS";
        }
        if (i6 == 3) {
            return "SYNCED";
        }
        return "null";
    }

    public static /* synthetic */ String x(int i6) {
        if (i6 == 1) {
            return "DATA_CENTER_1";
        }
        if (i6 == 2) {
            return "DATA_CENTER_2";
        }
        if (i6 == 3) {
            return "DATA_CENTER_3";
        }
        if (i6 == 4) {
            return "DATA_CENTER_4";
        }
        return "null";
    }

    public static /* synthetic */ String y(int i6) {
        if (i6 == 1) {
            return "HORIZONTAL";
        }
        if (i6 == 2) {
            return "VERTICAL";
        }
        return "null";
    }

    public static /* synthetic */ int z(String str) {
        if (str != null) {
            if (str.equals("DEFAULT_APP_CHECK_TOKEN")) {
                return 1;
            }
            if (str.equals("UNKNOWN_APP_CHECK_TOKEN")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        ((o) obj).z();
    }
}
