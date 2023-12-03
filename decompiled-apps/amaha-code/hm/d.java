package hm;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.utils.Constants;
import g0.a;
import hs.f;
import hs.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import r1.b0;
import t0.j0;
/* compiled from: MatchingCompletedProviderListFragment.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f17783a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList<TherapistPackagesModel> f17784b;

    public d(a aVar, ArrayList<TherapistPackagesModel> arrayList) {
        this.f17783a = aVar;
        this.f17784b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int i10;
        int i11;
        i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            String str = null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            int i12 = 0;
            if (linearLayoutManager != null) {
                i10 = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            } else {
                i10 = 0;
            }
            a aVar = this.f17783a;
            LinearLayout linearLayout = (LinearLayout) aVar._$_findCachedViewById(R.id.layoutDots);
            if (linearLayout != null) {
                Iterator<View> it = f6.b.B0(linearLayout).iterator();
                while (true) {
                    j0 j0Var = (j0) it;
                    if (!j0Var.hasNext()) {
                        break;
                    }
                    Object next = j0Var.next();
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        View view = (View) next;
                        p requireActivity = aVar.requireActivity();
                        if (i12 == i10) {
                            i11 = R.drawable.background_solid_amaha_dark_grey_corner_8dp;
                        } else {
                            i11 = R.drawable.background_stroke_amaha_dark_grey_corner_8dp;
                        }
                        Object obj = g0.a.f16164a;
                        view.setBackground(a.c.b(requireActivity, i11));
                        i12 = i13;
                    } else {
                        ca.a.t1();
                        throw null;
                    }
                }
            }
            if (i10 >= 0) {
                TherapistPackagesModel therapistPackagesModel = this.f17784b.get(i10);
                i.f(therapistPackagesModel, "providerList[scrollPosition]");
                TherapistPackagesModel therapistPackagesModel2 = therapistPackagesModel;
                km.d dVar = aVar.f17777y;
                if (dVar != null) {
                    String earliest_available_datetime = therapistPackagesModel2.getEarliest_available_datetime();
                    i.f(earliest_available_datetime, "provider.earliest_available_datetime");
                    f<String, String> e10 = dVar.e(earliest_available_datetime);
                    String str2 = gk.a.f16573a;
                    Bundle a10 = b0.a("flow", "therapy");
                    a10.putString("therapist_uuid", therapistPackagesModel2.getUuid());
                    a10.putString("therapist_name", therapistPackagesModel2.getFirstname() + ' ' + therapistPackagesModel2.getLastname());
                    User f = defpackage.b.f(a10, "source", "in_app_matching");
                    if (f != null) {
                        str = f.getCurrentCourseName();
                    }
                    a10.putString("domain", str);
                    a10.putString("platform", "android_app");
                    a10.putInt(Constants.DAYMODEL_POSITION, i10 + 1);
                    a10.putString("next_available_slot_shown", e10.f19464u);
                    a10.putString("next_available_slot_shown_local", e10.f19465v);
                    k kVar = k.f19476a;
                    gk.a.b(a10, "in_app_matching_profile_scroll");
                    return;
                }
                i.q("viewModel");
                throw null;
            }
        }
    }
}
