package zk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.conditionSelection.activity.ConditionSelectionA3Activity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import r1.b0;
/* compiled from: ConditionSelectionA3OfferingSelectionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f39426w = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f39427u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f39428v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f39428v;
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
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_a3_offering_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f39428v.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r4 == null) goto L28;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String obj;
        String string;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (obj = user.getFirstName()) != null) {
            if (n.B0(obj)) {
                obj = null;
            }
        }
        String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
        kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
        obj = r.i1(stringValue).toString();
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvA3OfferingSelectionHeader);
        if (robertoTextView != null) {
            if (!n.B0(obj)) {
                string = getString(R.string.a3VarAOfferingSelectionTitle, obj);
            } else {
                string = getString(R.string.a3VarAOfferingSelectionTitleFallback);
            }
            robertoTextView.setText(string);
        }
        CardView cardView = (CardView) _$_findCachedViewById(R.id.cvA3OfferingSelectionSelfHelp);
        if (cardView != null) {
            cardView.setOnClickListener(new View.OnClickListener(this) { // from class: zk.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d f39425v;

                {
                    this.f39425v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ConditionSelectionA3Activity conditionSelectionA3Activity;
                    ConditionSelectionA3Activity conditionSelectionA3Activity2;
                    ConditionSelectionA3Activity conditionSelectionA3Activity3;
                    ConditionSelectionA3Activity conditionSelectionA3Activity4;
                    int i6 = r2;
                    String str = null;
                    d this$0 = this.f39425v;
                    switch (i6) {
                        case 0:
                            int i10 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!this$0.f39427u) {
                                this$0.f39427u = true;
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clA3OfferingSelectionSelfHelpLoader);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(0);
                                }
                                p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity = (ConditionSelectionA3Activity) requireActivity;
                                } else {
                                    conditionSelectionA3Activity = null;
                                }
                                if (conditionSelectionA3Activity != null) {
                                    conditionSelectionA3Activity.A = "self_help";
                                    conditionSelectionA3Activity.u0();
                                }
                                String str2 = gk.a.f16573a;
                                Bundle a10 = b0.a("offering", "self-care");
                                p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity2 = (ConditionSelectionA3Activity) requireActivity2;
                                } else {
                                    conditionSelectionA3Activity2 = null;
                                }
                                if (conditionSelectionA3Activity2 != null) {
                                    str = conditionSelectionA3Activity2.f10643y;
                                }
                                a10.putString("course", str);
                                a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "onboarding_offering_selection");
                                return;
                            }
                            return;
                        case 1:
                            int i11 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!this$0.f39427u) {
                                this$0.f39427u = true;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clA3OfferingSelectionProfessionalHelpLoader);
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setVisibility(0);
                                }
                                p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity3 = (ConditionSelectionA3Activity) requireActivity3;
                                } else {
                                    conditionSelectionA3Activity3 = null;
                                }
                                if (conditionSelectionA3Activity3 != null) {
                                    conditionSelectionA3Activity3.A = "professional";
                                    conditionSelectionA3Activity3.u0();
                                }
                                String str3 = gk.a.f16573a;
                                Bundle a11 = b0.a("offering", "teleconsultation");
                                p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity4 = (ConditionSelectionA3Activity) requireActivity4;
                                } else {
                                    conditionSelectionA3Activity4 = null;
                                }
                                if (conditionSelectionA3Activity4 != null) {
                                    str = conditionSelectionA3Activity4.f10643y;
                                }
                                a11.putString("course", str);
                                a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "onboarding_offering_selection");
                                return;
                            }
                            return;
                        default:
                            int i12 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            });
        }
        CardView cardView2 = (CardView) _$_findCachedViewById(R.id.cvA3OfferingSelectionProfessionalHelp);
        if (cardView2 != null) {
            cardView2.setOnClickListener(new View.OnClickListener(this) { // from class: zk.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d f39425v;

                {
                    this.f39425v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ConditionSelectionA3Activity conditionSelectionA3Activity;
                    ConditionSelectionA3Activity conditionSelectionA3Activity2;
                    ConditionSelectionA3Activity conditionSelectionA3Activity3;
                    ConditionSelectionA3Activity conditionSelectionA3Activity4;
                    int i6 = r2;
                    String str = null;
                    d this$0 = this.f39425v;
                    switch (i6) {
                        case 0:
                            int i10 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!this$0.f39427u) {
                                this$0.f39427u = true;
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clA3OfferingSelectionSelfHelpLoader);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(0);
                                }
                                p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity = (ConditionSelectionA3Activity) requireActivity;
                                } else {
                                    conditionSelectionA3Activity = null;
                                }
                                if (conditionSelectionA3Activity != null) {
                                    conditionSelectionA3Activity.A = "self_help";
                                    conditionSelectionA3Activity.u0();
                                }
                                String str2 = gk.a.f16573a;
                                Bundle a10 = b0.a("offering", "self-care");
                                p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity2 = (ConditionSelectionA3Activity) requireActivity2;
                                } else {
                                    conditionSelectionA3Activity2 = null;
                                }
                                if (conditionSelectionA3Activity2 != null) {
                                    str = conditionSelectionA3Activity2.f10643y;
                                }
                                a10.putString("course", str);
                                a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "onboarding_offering_selection");
                                return;
                            }
                            return;
                        case 1:
                            int i11 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!this$0.f39427u) {
                                this$0.f39427u = true;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clA3OfferingSelectionProfessionalHelpLoader);
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setVisibility(0);
                                }
                                p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity3 = (ConditionSelectionA3Activity) requireActivity3;
                                } else {
                                    conditionSelectionA3Activity3 = null;
                                }
                                if (conditionSelectionA3Activity3 != null) {
                                    conditionSelectionA3Activity3.A = "professional";
                                    conditionSelectionA3Activity3.u0();
                                }
                                String str3 = gk.a.f16573a;
                                Bundle a11 = b0.a("offering", "teleconsultation");
                                p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity4 = (ConditionSelectionA3Activity) requireActivity4;
                                } else {
                                    conditionSelectionA3Activity4 = null;
                                }
                                if (conditionSelectionA3Activity4 != null) {
                                    str = conditionSelectionA3Activity4.f10643y;
                                }
                                a11.putString("course", str);
                                a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "onboarding_offering_selection");
                                return;
                            }
                            return;
                        default:
                            int i12 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivA3OfferingSelectionBack);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: zk.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d f39425v;

                {
                    this.f39425v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ConditionSelectionA3Activity conditionSelectionA3Activity;
                    ConditionSelectionA3Activity conditionSelectionA3Activity2;
                    ConditionSelectionA3Activity conditionSelectionA3Activity3;
                    ConditionSelectionA3Activity conditionSelectionA3Activity4;
                    int i6 = r2;
                    String str = null;
                    d this$0 = this.f39425v;
                    switch (i6) {
                        case 0:
                            int i10 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!this$0.f39427u) {
                                this$0.f39427u = true;
                                ConstraintLayout constraintLayout = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clA3OfferingSelectionSelfHelpLoader);
                                if (constraintLayout != null) {
                                    constraintLayout.setVisibility(0);
                                }
                                p requireActivity = this$0.requireActivity();
                                if (requireActivity instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity = (ConditionSelectionA3Activity) requireActivity;
                                } else {
                                    conditionSelectionA3Activity = null;
                                }
                                if (conditionSelectionA3Activity != null) {
                                    conditionSelectionA3Activity.A = "self_help";
                                    conditionSelectionA3Activity.u0();
                                }
                                String str2 = gk.a.f16573a;
                                Bundle a10 = b0.a("offering", "self-care");
                                p requireActivity2 = this$0.requireActivity();
                                if (requireActivity2 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity2 = (ConditionSelectionA3Activity) requireActivity2;
                                } else {
                                    conditionSelectionA3Activity2 = null;
                                }
                                if (conditionSelectionA3Activity2 != null) {
                                    str = conditionSelectionA3Activity2.f10643y;
                                }
                                a10.putString("course", str);
                                a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "onboarding_offering_selection");
                                return;
                            }
                            return;
                        case 1:
                            int i11 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (!this$0.f39427u) {
                                this$0.f39427u = true;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clA3OfferingSelectionProfessionalHelpLoader);
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setVisibility(0);
                                }
                                p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity3 = (ConditionSelectionA3Activity) requireActivity3;
                                } else {
                                    conditionSelectionA3Activity3 = null;
                                }
                                if (conditionSelectionA3Activity3 != null) {
                                    conditionSelectionA3Activity3.A = "professional";
                                    conditionSelectionA3Activity3.u0();
                                }
                                String str3 = gk.a.f16573a;
                                Bundle a11 = b0.a("offering", "teleconsultation");
                                p requireActivity4 = this$0.requireActivity();
                                if (requireActivity4 instanceof ConditionSelectionA3Activity) {
                                    conditionSelectionA3Activity4 = (ConditionSelectionA3Activity) requireActivity4;
                                } else {
                                    conditionSelectionA3Activity4 = null;
                                }
                                if (conditionSelectionA3Activity4 != null) {
                                    str = conditionSelectionA3Activity4.f10643y;
                                }
                                a11.putString("course", str);
                                a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "onboarding_offering_selection");
                                return;
                            }
                            return;
                        default:
                            int i12 = d.f39426w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            });
        }
    }
}
