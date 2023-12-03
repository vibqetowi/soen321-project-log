package cm;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/* compiled from: FirestoreCustomGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<List<? extends FirestoreGoal>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l f5352u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(1);
        this.f5352u = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ss.l
    public final hs.k invoke(List<? extends FirestoreGoal> list) {
        Date time;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        AppCompatImageView appCompatImageView;
        RecyclerView recyclerView;
        boolean z10;
        RobertoButton robertoButton2;
        RobertoButton robertoButton3;
        Date date;
        RecyclerView recyclerView2;
        RobertoTextView robertoTextView3;
        RobertoTextView robertoTextView4;
        AppCompatImageView appCompatImageView2;
        Date time2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        List<? extends FirestoreGoal> list2 = list;
        if (list2 != null) {
            l lVar = this.f5352u;
            bm.b bVar = lVar.f5358x;
            boolean z11 = false;
            RobertoTextView robertoTextView5 = null;
            if (bVar == null) {
                fm.a aVar = lVar.f5357w;
                if (aVar == null || (time2 = aVar.D) == null) {
                    time2 = Calendar.getInstance().getTime();
                }
                kotlin.jvm.internal.i.f(time2, "firestoreGoalsViewModel?…lendar.getInstance().time");
                i iVar = new i(lVar);
                Context requireContext = lVar.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                lVar.f5358x = new bm.b(time2, iVar, list2, requireContext);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(lVar.getContext(), 1, false);
                yp.d dVar = lVar.f5356v;
                if (dVar != null) {
                    recyclerView3 = (RecyclerView) dVar.f;
                } else {
                    recyclerView3 = null;
                }
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(linearLayoutManager);
                }
                yp.d dVar2 = lVar.f5356v;
                if (dVar2 != null) {
                    recyclerView4 = (RecyclerView) dVar2.f;
                } else {
                    recyclerView4 = null;
                }
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(lVar.f5358x);
                }
            } else {
                fm.a aVar2 = lVar.f5357w;
                if (aVar2 == null || (time = aVar2.D) == null) {
                    time = Calendar.getInstance().getTime();
                }
                kotlin.jvm.internal.i.f(time, "firestoreGoalsViewModel?…lendar.getInstance().time");
                bVar.f4407y = time;
                bm.b bVar2 = lVar.f5358x;
                if (bVar2 != null && bVar2.B.size() != list2.size()) {
                    bVar2.B = list2;
                }
                bm.b bVar3 = lVar.f5358x;
                if (bVar3 != null) {
                    bVar3.i();
                }
            }
            if (list2.isEmpty()) {
                if (lVar.f5357w != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    yp.d dVar3 = lVar.f5356v;
                    if (dVar3 != null && (appCompatImageView2 = (AppCompatImageView) dVar3.f38756a) != null) {
                        Extensions.INSTANCE.visible(appCompatImageView2);
                    }
                    yp.d dVar4 = lVar.f5356v;
                    if (dVar4 != null && (robertoTextView4 = (RobertoTextView) dVar4.f38757b) != null) {
                        Extensions.INSTANCE.visible(robertoTextView4);
                    }
                    yp.d dVar5 = lVar.f5356v;
                    if (dVar5 != null && (robertoTextView3 = (RobertoTextView) dVar5.f38758c) != null) {
                        Extensions.INSTANCE.visible(robertoTextView3);
                    }
                }
                yp.d dVar6 = lVar.f5356v;
                if (dVar6 != null && (recyclerView2 = (RecyclerView) dVar6.f) != null) {
                    Extensions.INSTANCE.gone(recyclerView2);
                }
                fm.a aVar3 = lVar.f5357w;
                if (aVar3 != null && (date = aVar3.D) != null && date.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
                    z11 = true;
                }
                if (z11) {
                    yp.d dVar7 = lVar.f5356v;
                    if (dVar7 != null && (robertoButton3 = (RobertoButton) dVar7.f38760e) != null) {
                        Extensions.INSTANCE.gone(robertoButton3);
                    }
                    yp.d dVar8 = lVar.f5356v;
                    if (dVar8 != null) {
                        robertoTextView5 = (RobertoTextView) dVar8.f38757b;
                    }
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(lVar.getString(R.string.goalsPageNullState1));
                    }
                } else {
                    yp.d dVar9 = lVar.f5356v;
                    if (dVar9 != null && (robertoButton2 = (RobertoButton) dVar9.f38760e) != null) {
                        Extensions.INSTANCE.visible(robertoButton2);
                    }
                    yp.d dVar10 = lVar.f5356v;
                    if (dVar10 != null) {
                        robertoTextView5 = (RobertoTextView) dVar10.f38757b;
                    }
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(lVar.getString(R.string.customGoalNullText1));
                    }
                }
            } else {
                yp.d dVar11 = lVar.f5356v;
                if (dVar11 != null && (recyclerView = (RecyclerView) dVar11.f) != null) {
                    Extensions.INSTANCE.visible(recyclerView);
                }
                yp.d dVar12 = lVar.f5356v;
                if (dVar12 != null && (appCompatImageView = (AppCompatImageView) dVar12.f38756a) != null) {
                    Extensions.INSTANCE.gone(appCompatImageView);
                }
                yp.d dVar13 = lVar.f5356v;
                if (dVar13 != null && (robertoTextView2 = (RobertoTextView) dVar13.f38757b) != null) {
                    Extensions.INSTANCE.gone(robertoTextView2);
                }
                yp.d dVar14 = lVar.f5356v;
                if (dVar14 != null && (robertoTextView = (RobertoTextView) dVar14.f38758c) != null) {
                    Extensions.INSTANCE.gone(robertoTextView);
                }
                yp.d dVar15 = lVar.f5356v;
                if (dVar15 != null && (robertoButton = (RobertoButton) dVar15.f38760e) != null) {
                    Extensions.INSTANCE.gone(robertoButton);
                }
            }
        }
        return hs.k.f19476a;
    }
}
