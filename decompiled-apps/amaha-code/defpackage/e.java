package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.RecyclerView;
import b8.j;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ik.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.i;
import qq.x;
/* compiled from: R8$$SyntheticClass */
/* renamed from: e  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements nc.e, com.google.android.exoplayer2.mediacodec.e {
    public static /* synthetic */ String A(int i6) {
        if (i6 == 1) {
            return "LEFT";
        }
        if (i6 == 2) {
            return "RIGHT";
        }
        return "null";
    }

    public static /* synthetic */ int B(String str) {
        if (str != null) {
            if (str.equals("LEFT")) {
                return 1;
            }
            if (str.equals("RIGHT")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.internal.model.enums.ClosePosition.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static final boolean b(int i6) {
        if (i6 != 6 && i6 != 4) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int c(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return 2;
        }
        if (i6 == 3) {
            return 3;
        }
        if (i6 == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i6) {
        if (i6 == 1) {
            return "and";
        }
        if (i6 == 2) {
            return "or";
        }
        throw null;
    }

    public static float e(float f, float f2, float f10, float f11) {
        return ((f - f2) * f10) + f11;
    }

    public static Bundle f(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static View g(p pVar, int i6, ImageView imageView, View view, int i10) {
        imageView.setImageDrawable(a.c.b(pVar, i6));
        return view.findViewById(i10);
    }

    public static View h(RecyclerView recyclerView, int i6, RecyclerView recyclerView2, boolean z10, String str) {
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(i6, recyclerView2, z10);
        i.f(inflate, str);
        return inflate;
    }

    public static View i(e1 e1Var, int i6, RobertoTextView robertoTextView, int i10) {
        robertoTextView.setText(e1Var.getString(i6));
        return e1Var._$_findCachedViewById(i10);
    }

    public static View j(x xVar, int i6, RobertoTextView robertoTextView, Dialog dialog, int i10) {
        robertoTextView.setText(xVar.getString(i6));
        return dialog.findViewById(i10);
    }

    public static androidx.fragment.app.a k(y yVar, int i6, int i10, int i11, int i12) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
        aVar.h(i6, i10, i11, i12);
        return aVar;
    }

    public static androidx.fragment.app.a l(y yVar, y yVar2) {
        yVar.getClass();
        return new androidx.fragment.app.a(yVar2);
    }

    public static q0 m(Fragment fragment, String str) {
        q0 viewModelStore = fragment.requireActivity().getViewModelStore();
        i.f(viewModelStore, str);
        return viewModelStore;
    }

    public static StringBuilder n(int i6, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(i6);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static /* synthetic */ Iterator o() {
        try {
            return Arrays.asList(new hv.a()).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static /* bridge */ /* synthetic */ void p(int i6, int i10, Class cls) {
        throw null;
    }

    public static void q(int i6, HashSet hashSet, HashSet hashSet2, String str) {
        hashSet.remove(Integer.valueOf(i6));
        hashSet2.remove(str);
    }

    public static void r(Context context, int i6, ArrayList arrayList, int i10, int i11) {
        arrayList.add(context.getString(i6));
        arrayList.add(context.getString(i10));
        arrayList.add(context.getString(i11));
    }

    public static void s(Bundle bundle, String str, String str2, String str3) {
        bundle.putString(str, FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString(str2, str3);
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static void u(String str, String str2, String str3, String str4, String str5, String str6) {
        i.g(str, str2);
        i.g(str3, str4);
        i.g(str5, str6);
    }

    public static /* synthetic */ String v(int i6) {
        if (i6 == 1) {
            return "LIMIT_TO_FIRST";
        }
        if (i6 == 2) {
            return "LIMIT_TO_LAST";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i6) {
        if (i6 == 1) {
            return "MERGE";
        }
        if (i6 == 2) {
            return "ADD";
        }
        if (i6 == 3) {
            return "SUBTRACT";
        }
        if (i6 == 4) {
            return "INTERSECT";
        }
        if (i6 == 5) {
            return "EXCLUDE_INTERSECTIONS";
        }
        return "null";
    }

    public static /* synthetic */ String x(int i6) {
        if (i6 == 1) {
            return "GENERAL";
        }
        if (i6 == 2) {
            return "TIMESTAMP";
        }
        if (i6 == 3) {
            return "LOCATION";
        }
        if (i6 == 4) {
            return "DEVICE";
        }
        return "null";
    }

    public static /* synthetic */ String y(int i6) {
        if (i6 == 1) {
            return "INITIALIZE";
        }
        if (i6 == 2) {
            return "SWITCH_TO_SOURCE_SERVICE";
        }
        if (i6 == 3) {
            return "DECODE_DATA";
        }
        return "null";
    }

    public static /* synthetic */ String z(int i6) {
        if (i6 == 1) {
            return "INVALID";
        }
        if (i6 == 2) {
            return "FOUND_DOCUMENT";
        }
        if (i6 == 3) {
            return "NO_DOCUMENT";
        }
        if (i6 == 4) {
            return "UNKNOWN_DOCUMENT";
        }
        return "null";
    }

    @Override // com.google.android.exoplayer2.mediacodec.e
    public List a(String str, boolean z10, boolean z11) {
        return MediaCodecUtil.d(str, z10, z11);
    }

    @Override // nc.e
    public Object apply(Object obj) {
        return (j) obj;
    }
}
