package cm;

import android.content.Context;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends List<? extends FirestoreGoal>>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f5383u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar) {
        super(1);
        this.f5383u = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dc, code lost:
        if (r10 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0100, code lost:
        if (r10 == null) goto L83;
     */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(SingleUseEvent<? extends List<? extends FirestoreGoal>> singleUseEvent) {
        List<FirestoreGoal> list;
        Date time;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        AppCompatImageView appCompatImageView;
        RecyclerView recyclerView;
        ProgressBar progressBar;
        boolean z10;
        RobertoButton robertoButton2;
        RobertoTextView robertoTextView2;
        AppCompatImageView appCompatImageView2;
        ConstraintLayout constraintLayout;
        ProgressBar progressBar2;
        RecyclerView recyclerView2;
        Date date;
        ArrayList<RecommendedActivityModel> arrayList;
        String str;
        boolean z11;
        androidx.lifecycle.w<ArrayList<RecommendedActivityModel>> wVar;
        ArrayList<RecommendedActivityModel> d10;
        androidx.lifecycle.w<ArrayList<RecommendedActivityModel>> wVar2;
        ConstraintLayout constraintLayout2;
        Date time2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        SingleUseEvent<? extends List<? extends FirestoreGoal>> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (list = (List) singleUseEvent2.getContentIfNotHandled()) != null) {
            p pVar = this.f5383u;
            bm.d dVar = pVar.f5372x;
            RobertoTextView robertoTextView3 = null;
            boolean z12 = true;
            if (dVar == null) {
                fm.a aVar = pVar.f5373y;
                if (aVar == null || (time2 = aVar.D) == null) {
                    time2 = Calendar.getInstance().getTime();
                }
                kotlin.jvm.internal.i.f(time2, "firestoreGoalsViewModel?…lendar.getInstance().time");
                q qVar = new q(pVar);
                Context requireContext = pVar.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                pVar.f5372x = new bm.d(time2, qVar, list, requireContext);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(pVar.getContext(), 1, false);
                yp.k kVar = pVar.f5370v;
                if (kVar != null) {
                    recyclerView3 = kVar.f38843d;
                } else {
                    recyclerView3 = null;
                }
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(linearLayoutManager);
                }
                yp.k kVar2 = pVar.f5370v;
                if (kVar2 != null) {
                    recyclerView4 = kVar2.f38843d;
                } else {
                    recyclerView4 = null;
                }
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(pVar.f5372x);
                }
            } else {
                fm.a aVar2 = pVar.f5373y;
                if (aVar2 == null || (time = aVar2.D) == null) {
                    time = Calendar.getInstance().getTime();
                }
                kotlin.jvm.internal.i.f(time, "firestoreGoalsViewModel?…lendar.getInstance().time");
                dVar.f4432z = time;
                bm.d dVar2 = pVar.f5372x;
                if (dVar2 != null && dVar2.D.size() != list.size()) {
                    dVar2.D = list;
                }
                bm.d dVar3 = pVar.f5372x;
                if (dVar3 != null) {
                    dVar3.i();
                }
            }
            if (list.isEmpty()) {
                if (pVar.f5373y != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    yp.k kVar3 = pVar.f5370v;
                    if (kVar3 != null && (constraintLayout2 = kVar3.f38842c) != null) {
                        Extensions.INSTANCE.visible(constraintLayout2);
                    }
                    fm.a aVar3 = pVar.f5373y;
                    if (aVar3 != null && (wVar2 = aVar3.X) != null) {
                        arrayList = wVar2.d();
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        fm.a aVar4 = pVar.f5373y;
                        if (aVar4 != null && (wVar = aVar4.X) != null && (d10 = wVar.d()) != null && d10.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (str = user.getCurrentCourseName()) != null) {
                        if (is.k.Q1(str, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                            str = null;
                        }
                    }
                    str = Constants.COURSE_DEPRESSION;
                    fm.a aVar5 = pVar.f5373y;
                    if (aVar5 != null) {
                        ta.v.H(kc.f.H(aVar5), null, 0, new fm.n(aVar5, str, null), 3);
                    }
                } else {
                    yp.k kVar4 = pVar.f5370v;
                    if (kVar4 != null && (progressBar2 = kVar4.f) != null) {
                        Extensions.INSTANCE.gone(progressBar2);
                    }
                    yp.k kVar5 = pVar.f5370v;
                    if (kVar5 != null && (constraintLayout = kVar5.f38842c) != null) {
                        Extensions.INSTANCE.gone(constraintLayout);
                    }
                    yp.k kVar6 = pVar.f5370v;
                    if (kVar6 != null && (appCompatImageView2 = kVar6.f38844e) != null) {
                        Extensions.INSTANCE.visible(appCompatImageView2);
                    }
                    yp.k kVar7 = pVar.f5370v;
                    if (kVar7 != null && (robertoTextView2 = kVar7.f38846h) != null) {
                        Extensions.INSTANCE.visible(robertoTextView2);
                    }
                    yp.k kVar8 = pVar.f5370v;
                    if (kVar8 != null && (robertoButton2 = kVar8.f38840a) != null) {
                        Extensions.INSTANCE.visible(robertoButton2);
                    }
                }
                fm.a aVar6 = pVar.f5373y;
                if ((aVar6 == null || (date = aVar6.D) == null || !date.before(Utils.INSTANCE.getTodayCalendar().getTime())) ? false : false) {
                    yp.k kVar9 = pVar.f5370v;
                    if (kVar9 != null) {
                        robertoTextView3 = kVar9.f38846h;
                    }
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText(pVar.getString(R.string.goalsPageNullState1));
                    }
                } else {
                    yp.k kVar10 = pVar.f5370v;
                    if (kVar10 != null) {
                        robertoTextView3 = kVar10.f38846h;
                    }
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText(pVar.getString(R.string.goalsPageNullState2));
                    }
                }
                yp.k kVar11 = pVar.f5370v;
                if (kVar11 != null && (recyclerView2 = kVar11.f38843d) != null) {
                    Extensions.INSTANCE.gone(recyclerView2);
                }
            } else {
                yp.k kVar12 = pVar.f5370v;
                if (kVar12 != null && (progressBar = kVar12.f) != null) {
                    Extensions.INSTANCE.gone(progressBar);
                }
                yp.k kVar13 = pVar.f5370v;
                if (kVar13 != null && (recyclerView = kVar13.f38843d) != null) {
                    Extensions.INSTANCE.visible(recyclerView);
                }
                yp.k kVar14 = pVar.f5370v;
                if (kVar14 != null && (appCompatImageView = kVar14.f38844e) != null) {
                    Extensions.INSTANCE.gone(appCompatImageView);
                }
                yp.k kVar15 = pVar.f5370v;
                if (kVar15 != null && (robertoTextView = kVar15.f38846h) != null) {
                    Extensions.INSTANCE.gone(robertoTextView);
                }
                yp.k kVar16 = pVar.f5370v;
                if (kVar16 != null && (robertoButton = kVar16.f38840a) != null) {
                    Extensions.INSTANCE.gone(robertoButton);
                }
            }
        }
        return hs.k.f19476a;
    }
}
