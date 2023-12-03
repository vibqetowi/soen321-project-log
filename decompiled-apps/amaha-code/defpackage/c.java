package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.y;
import c9.j;
import com.google.firebase.storage.StorageRegistrar;
import com.theinnerhour.b2b.model.SleepCauseModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import de.a;
import hd.e;
import hd.p;
import ik.t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.i;
import p7.o;
/* compiled from: R8$$SyntheticClass */
/* renamed from: c  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements e, j.a {
    public /* synthetic */ c() {
    }

    public static void A(String str, char c10, String str2, RobertoTextView robertoTextView) {
        robertoTextView.setText(str + c10 + str2);
    }

    public static void B(ArrayList arrayList, String str, String str2, String str3) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
    }

    public static void C(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static /* synthetic */ String D(int i6) {
        if (i6 == 1) {
            return "REMOVED";
        }
        if (i6 == 2) {
            return "VISIBLE";
        }
        if (i6 == 3) {
            return "GONE";
        }
        if (i6 == 4) {
            return "INVISIBLE";
        }
        return "null";
    }

    public static /* synthetic */ String E(int i6) {
        if (i6 == 1) {
            return "NOT_REQUIRED";
        }
        if (i6 == 2) {
            return "CONNECTED";
        }
        if (i6 == 3) {
            return "UNMETERED";
        }
        if (i6 == 4) {
            return "NOT_ROAMING";
        }
        if (i6 == 5) {
            return "METERED";
        }
        if (i6 == 6) {
            return "TEMPORARILY_UNMETERED";
        }
        return "null";
    }

    public static /* synthetic */ String F(int i6) {
        if (i6 == 1) {
            return "SCREEN";
        }
        if (i6 == 2) {
            return "DEEP_LINKING";
        }
        if (i6 == 3) {
            return "RICH_LANDING";
        }
        return "null";
    }

    public static /* synthetic */ String G(int i6) {
        if (i6 == 1) {
            return "ASCENDING";
        }
        if (i6 == 2) {
            return "DESCENDING";
        }
        if (i6 == 3) {
            return "CONTAINS";
        }
        return "null";
    }

    public static /* synthetic */ int H(String str) {
        if (str != null) {
            if (str.equals("SCREEN")) {
                return 1;
            }
            if (str.equals("DEEP_LINKING")) {
                return 2;
            }
            if (str.equals("RICH_LANDING")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.moengage.inapp.model.enums.NavigationType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static final void a(int i6, View view) {
        if (i6 != 0) {
            int i10 = i6 - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            if (y.P(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                            }
                            view.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    if (y.P(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (y.P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                }
                view.setVisibility(0);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (y.P(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        throw null;
    }

    public static int b(int i6) {
        if (i6 != 0) {
            if (i6 == 4) {
                return 4;
            }
            if (i6 == 8) {
                return 3;
            }
            throw new IllegalArgumentException(p("Unknown visibility ", i6));
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static final int d(int i6) {
        if (i6 != 6) {
            return i(i6);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int f(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 4;
        }
        if (i6 != 4) {
            return 0;
        }
        return 5;
    }

    public static /* synthetic */ String g(int i6) {
        if (i6 == 1) {
            return "_as";
        }
        if (i6 == 2) {
            return "_astui";
        }
        if (i6 == 3) {
            return "_astfd";
        }
        if (i6 == 4) {
            return "_asti";
        }
        if (i6 == 5) {
            return "_fs";
        }
        if (i6 == 6) {
            return "_bs";
        }
        throw null;
    }

    public static /* synthetic */ int h(int i6) {
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int i(int i6) {
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

    public static int j(ArrayList arrayList, int i6, int i10) {
        return (arrayList.hashCode() + i6) * i10;
    }

    public static Bundle k(String str, int i6) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i6);
        return bundle;
    }

    public static View l(t tVar, int i6, RobertoTextView robertoTextView, int i10) {
        robertoTextView.setText(tVar.getString(i6));
        return tVar._$_findCachedViewById(i10);
    }

    public static SleepCauseModel m(ArrayList arrayList, SleepCauseModel sleepCauseModel, String str) {
        arrayList.add(sleepCauseModel);
        return new SleepCauseModel(str);
    }

    public static String n() {
        return FirebasePersistence.getInstance().getUser().getCurrentCourse();
    }

    public static String o(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String p(String str, int i6) {
        return str + i6;
    }

    public static String q(String str, int i6, String str2) {
        return str + i6 + str2;
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(StringBuilder sb2, int i6, char c10) {
        sb2.append(i6);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String t(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder u(String str, int i6, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i6);
        sb2.append(str2);
        return sb2;
    }

    public static ArrayList v(ArrayList arrayList, String str, int i6, HashMap hashMap, ArrayList arrayList2, int i10) {
        arrayList.add(str);
        hashMap.put(Integer.valueOf(i6), arrayList2);
        return new ArrayList(i10);
    }

    public static Date w(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }

    public static HashMap x(Class cls, a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static /* synthetic */ void y(int i6, String str) {
        if (i6 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(pl.a.f(str, " must not be null"));
        i.m(i.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void z(RobertoTextView robertoTextView, String str, ArrayList arrayList, String str2, String str3) {
        robertoTextView.setText(str);
        arrayList.add(str2);
        arrayList.add(str3);
    }

    @Override // hd.e
    public Object e(p pVar) {
        return StorageRegistrar.a(pVar);
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        ((o) obj).q();
    }

    public /* synthetic */ c(o.a aVar, int i6, int i10) {
    }
}
