package bo;

import android.view.View;
import android.widget.Toast;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import bo.k;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.activity.OnboardingFlowActivity;
import is.u;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4595u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f4596v;

    public /* synthetic */ j(k kVar, int i6) {
        this.f4595u = i6;
        this.f4596v = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView.e eVar;
        k.b bVar;
        eo.g gVar;
        RecyclerView.e eVar2;
        k.a aVar;
        HashSet<Integer> hashSet;
        RecyclerView.e eVar3;
        k.a aVar2;
        HashSet<Integer> hashSet2;
        eo.a aVar3;
        RecyclerView.e eVar4;
        k.b bVar2;
        RecyclerView.e eVar5;
        k.b bVar3;
        OnBackPressedDispatcher onBackPressedDispatcher;
        int i6 = this.f4595u;
        Integer num = null;
        OnboardingFlowActivity onboardingFlowActivity = null;
        Integer num2 = null;
        Integer num3 = null;
        r0 = null;
        ArrayList arrayList = null;
        r0 = null;
        ArrayList arrayList2 = null;
        boolean z10 = true;
        k this$0 = this.f4596v;
        switch (i6) {
            case 0:
                int i10 = k.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str = this$0.f4600x;
                String str2 = "q3";
                switch (str.hashCode()) {
                    case -1992012396:
                        if (str.equals("duration")) {
                            this$0.K("q2");
                            RecyclerView recyclerView = (RecyclerView) this$0._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                            if (recyclerView != null) {
                                eVar = recyclerView.getAdapter();
                            } else {
                                eVar = null;
                            }
                            if (eVar instanceof k.b) {
                                bVar = (k.b) eVar;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                num = bVar.f4607y;
                            }
                            if (num != null) {
                                hs.j<String, String, Integer> jVar = (hs.j) u.j2(num.intValue(), this$0.J().M);
                                if (jVar != null) {
                                    this$0.J().A = jVar;
                                    eo.g gVar2 = this$0.f4599w;
                                    if (gVar2 != null) {
                                        gVar2.M();
                                        return;
                                    }
                                    return;
                                }
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasteryDayError), 0).show();
                                return;
                            }
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasteryDayError), 0).show();
                            return;
                        }
                        return;
                    case -1857640538:
                        if (str.equals("summary") && (gVar = this$0.f4599w) != null) {
                            gVar.M();
                            return;
                        }
                        return;
                    case -1613589672:
                        if (str.equals("language")) {
                            this$0.K("q4");
                            RecyclerView recyclerView2 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                            if (recyclerView2 != null) {
                                eVar2 = recyclerView2.getAdapter();
                            } else {
                                eVar2 = null;
                            }
                            if (eVar2 instanceof k.a) {
                                aVar = (k.a) eVar2;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null && (hashSet = aVar.f4604y) != null) {
                                arrayList2 = new ArrayList();
                                for (Number number : hashSet) {
                                    hs.j jVar2 = (hs.j) u.j2(number.intValue(), this$0.J().L);
                                    if (jVar2 != null) {
                                        arrayList2.add(jVar2);
                                    }
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionPleasurableScheduleError), 0).show();
                                return;
                            }
                            this$0.J().f14445z = arrayList2;
                            eo.g gVar3 = this$0.f4599w;
                            if (gVar3 != null) {
                                gVar3.M();
                                return;
                            }
                            return;
                        }
                        return;
                    case -1326197564:
                        if (str.equals("domain")) {
                            this$0.K("q1");
                            RecyclerView recyclerView3 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                            if (recyclerView3 != null) {
                                eVar3 = recyclerView3.getAdapter();
                            } else {
                                eVar3 = null;
                            }
                            if (eVar3 instanceof k.a) {
                                aVar2 = (k.a) eVar3;
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 != null && (hashSet2 = aVar2.f4604y) != null) {
                                arrayList = new ArrayList();
                                for (Number number2 : hashSet2) {
                                    hs.j jVar3 = (hs.j) u.j2(number2.intValue(), this$0.J().K);
                                    if (jVar3 != null) {
                                        arrayList.add(jVar3);
                                    }
                                }
                            }
                            if (arrayList != null && !arrayList.isEmpty()) {
                                z10 = false;
                            }
                            if (z10) {
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionPleasurableScheduleError), 0).show();
                                return;
                            }
                            this$0.J().f14444y = arrayList;
                            eo.g gVar4 = this$0.f4599w;
                            if (gVar4 != null) {
                                gVar4.M();
                                return;
                            }
                            return;
                        }
                        return;
                    case 96511:
                        if (str.equals("age")) {
                            eo.g gVar5 = this$0.f4599w;
                            if (gVar5 != null) {
                                aVar3 = gVar5.h();
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 == eo.a.MATCHING_THERAPY) {
                                str2 = "q5";
                            }
                            this$0.K(str2);
                            RecyclerView recyclerView4 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                            if (recyclerView4 != null) {
                                eVar4 = recyclerView4.getAdapter();
                            } else {
                                eVar4 = null;
                            }
                            if (eVar4 instanceof k.b) {
                                bVar2 = (k.b) eVar4;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                num3 = bVar2.f4607y;
                            }
                            if (num3 != null) {
                                hs.j<String, String, Integer> jVar4 = (hs.j) u.j2(num3.intValue(), this$0.J().O);
                                if (jVar4 != null) {
                                    this$0.J().C = jVar4;
                                    eo.g gVar6 = this$0.f4599w;
                                    if (gVar6 != null) {
                                        gVar6.M();
                                        return;
                                    }
                                    return;
                                }
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasteryDayError), 0).show();
                                return;
                            }
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasteryDayError), 0).show();
                            return;
                        }
                        return;
                    case 1829500859:
                        if (str.equals("difficulty")) {
                            this$0.K("q3");
                            RecyclerView recyclerView5 = (RecyclerView) this$0._$_findCachedViewById(R.id.rvMatchingQuestionResponseContainer);
                            if (recyclerView5 != null) {
                                eVar5 = recyclerView5.getAdapter();
                            } else {
                                eVar5 = null;
                            }
                            if (eVar5 instanceof k.b) {
                                bVar3 = (k.b) eVar5;
                            } else {
                                bVar3 = null;
                            }
                            if (bVar3 != null) {
                                num2 = bVar3.f4607y;
                            }
                            if (num2 != null) {
                                hs.j<String, String, Integer> jVar5 = (hs.j) u.j2(num2.intValue(), this$0.J().N);
                                if (jVar5 != null) {
                                    this$0.J().B = jVar5;
                                    eo.g gVar7 = this$0.f4599w;
                                    if (gVar7 != null) {
                                        gVar7.M();
                                        return;
                                    }
                                    return;
                                }
                                Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasteryDayError), 0).show();
                                return;
                            }
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.depressionMasteryDayError), 0).show();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 1:
                int i11 = k.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof OnboardingFlowActivity) {
                    onboardingFlowActivity = (OnboardingFlowActivity) requireActivity;
                }
                if (onboardingFlowActivity != null && (onBackPressedDispatcher = onboardingFlowActivity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.b();
                    return;
                }
                return;
            default:
                int i12 = k.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().D = !this$0.J().D;
                if (this$0.J().D) {
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivMatchingQuestion24HourCheck)).setImageResource(R.drawable.ic_check_dark_grey);
                    return;
                } else {
                    ((AppCompatImageView) this$0._$_findCachedViewById(R.id.ivMatchingQuestion24HourCheck)).setImageResource(R.drawable.background_stroke_grey_4dp);
                    return;
                }
        }
    }
}
