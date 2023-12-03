package hl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SurveyActivity;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.y0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DashboardDynamicCardsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends Fragment {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f17706x = 0;

    /* renamed from: u  reason: collision with root package name */
    public il.b f17707u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f17708v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f17709w = new LinkedHashMap();

    /* compiled from: DashboardDynamicCardsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            CardView cardView;
            CardView cardView2;
            String str2 = str;
            if (str2 != null) {
                int hashCode = str2.hashCode();
                final l lVar = l.this;
                switch (hashCode) {
                    case -891050150:
                        if (str2.equals("survey")) {
                            RobertoTextView robertoTextView = (RobertoTextView) lVar._$_findCachedViewById(R.id.tvDcTitle);
                            if (robertoTextView != null) {
                                robertoTextView.setText(lVar.getString(R.string.surveyDynamicCardTitle));
                            }
                            RobertoTextView robertoTextView2 = (RobertoTextView) lVar._$_findCachedViewById(R.id.tvDcDesc);
                            if (robertoTextView2 != null) {
                                robertoTextView2.setText(lVar.getString(R.string.surveyDynamicCardBody));
                            }
                            CardView cardView3 = (CardView) lVar._$_findCachedViewById(R.id.dynamicCardContainer);
                            if (cardView3 != null) {
                                cardView3.setOnClickListener(new View.OnClickListener() { // from class: hl.k
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Intent intent;
                                        int i6 = r2;
                                        l this$0 = lVar;
                                        switch (i6) {
                                            case 0:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (sp.b.K()) {
                                                    wn.b.f36765a.getClass();
                                                    if (wn.b.b() != y0.MIGRATION_SUCCESS) {
                                                        Extensions extensions = Extensions.INSTANCE;
                                                        Context requireContext = this$0.requireContext();
                                                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                                        String string = this$0.getString(R.string.goalMigrationProgress);
                                                        kotlin.jvm.internal.i.f(string, "getString(R.string.goalMigrationProgress)");
                                                        extensions.toast(requireContext, string, 1);
                                                        return;
                                                    }
                                                }
                                                if (sp.b.K()) {
                                                    intent = new Intent(this$0.requireContext(), FirestoreGoalsActivity.class);
                                                } else {
                                                    intent = new Intent(this$0.requireContext(), V3GoalsActivity.class);
                                                }
                                                this$0.f17708v.a(intent);
                                                return;
                                            default:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f17708v.a(new Intent(this$0.requireActivity(), SurveyActivity.class));
                                                return;
                                        }
                                    }
                                });
                            }
                            CardView cardView4 = (CardView) lVar._$_findCachedViewById(R.id.dynamicCardContainer);
                            if (cardView4 != null) {
                                cardView4.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 92906109:
                        if (str2.equals("allie") && (cardView = (CardView) lVar._$_findCachedViewById(R.id.dynamicCardContainer)) != null) {
                            cardView.setVisibility(8);
                            break;
                        }
                        break;
                    case 98526144:
                        if (str2.equals("goals")) {
                            RobertoTextView robertoTextView3 = (RobertoTextView) lVar._$_findCachedViewById(R.id.tvDcTitle);
                            if (robertoTextView3 != null) {
                                robertoTextView3.setText(lVar.getString(R.string.dynamic_card_goal_header));
                            }
                            RobertoTextView robertoTextView4 = (RobertoTextView) lVar._$_findCachedViewById(R.id.tvDcDesc);
                            if (robertoTextView4 != null) {
                                robertoTextView4.setText(lVar.getString(R.string.dynamic_card_goal_sub_header));
                            }
                            CardView cardView5 = (CardView) lVar._$_findCachedViewById(R.id.dynamicCardContainer);
                            if (cardView5 != null) {
                                cardView5.setOnClickListener(new View.OnClickListener() { // from class: hl.k
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Intent intent;
                                        int i6 = r2;
                                        l this$0 = lVar;
                                        switch (i6) {
                                            case 0:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (sp.b.K()) {
                                                    wn.b.f36765a.getClass();
                                                    if (wn.b.b() != y0.MIGRATION_SUCCESS) {
                                                        Extensions extensions = Extensions.INSTANCE;
                                                        Context requireContext = this$0.requireContext();
                                                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                                        String string = this$0.getString(R.string.goalMigrationProgress);
                                                        kotlin.jvm.internal.i.f(string, "getString(R.string.goalMigrationProgress)");
                                                        extensions.toast(requireContext, string, 1);
                                                        return;
                                                    }
                                                }
                                                if (sp.b.K()) {
                                                    intent = new Intent(this$0.requireContext(), FirestoreGoalsActivity.class);
                                                } else {
                                                    intent = new Intent(this$0.requireContext(), V3GoalsActivity.class);
                                                }
                                                this$0.f17708v.a(intent);
                                                return;
                                            default:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f17708v.a(new Intent(this$0.requireActivity(), SurveyActivity.class));
                                                return;
                                        }
                                    }
                                });
                            }
                            CardView cardView6 = (CardView) lVar._$_findCachedViewById(R.id.dynamicCardContainer);
                            if (cardView6 != null) {
                                cardView6.setVisibility(0);
                                break;
                            }
                        }
                        break;
                    case 853168109:
                        if (str2.equals("hide_card") && (cardView2 = (CardView) lVar._$_findCachedViewById(R.id.dynamicCardContainer)) != null) {
                            cardView2.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
            return hs.k.f19476a;
        }
    }

    public l() {
        LogHelper.INSTANCE.makeLogTag("DashboardDynamicCards");
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new am.w(15, this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…ibility = View.GONE\n    }");
        this.f17708v = registerForActivityResult;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17709w;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof il.b) {
            this.f17707u = (il.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.row_dashboard_dynamic_card, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17709w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        jl.x xVar = (jl.x) new o0(requireActivity).a(jl.x.class);
        xVar.getClass();
        ta.v.H(kc.f.H(xVar), null, 0, new jl.w(xVar, null), 3);
        xVar.f22385x.e(getViewLifecycleOwner(), new fl.k(17, new a()));
    }
}
