package nn;

import android.app.Dialog;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BasicMonetizationMiniFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends Fragment {
    public static final /* synthetic */ int C = 0;
    public List<c4.h> A;

    /* renamed from: u  reason: collision with root package name */
    public LayoutInflater f26573u;

    /* renamed from: w  reason: collision with root package name */
    public MiniMonetizationActivity f26575w;

    /* renamed from: x  reason: collision with root package name */
    public String f26576x;

    /* renamed from: y  reason: collision with root package name */
    public String f26577y;

    /* renamed from: z  reason: collision with root package name */
    public String f26578z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f26574v = LogHelper.INSTANCE.makeLogTag(q.class);

    public q() {
        new ArrayList();
    }

    public final MiniMonetizationActivity F() {
        MiniMonetizationActivity miniMonetizationActivity = this.f26575w;
        if (miniMonetizationActivity != null) {
            return miniMonetizationActivity;
        }
        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
        return inflater.inflate(R.layout.fragment_basic_monetization_mini, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity");
        this.f26575w = (MiniMonetizationActivity) requireActivity;
        Object systemService = F().getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f26573u = (LayoutInflater) systemService;
        androidx.fragment.app.p requireActivity2 = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new androidx.lifecycle.o0(requireActivity2).a(MonetizationViewModel.class);
        kotlin.jvm.internal.i.g(monetizationViewModel, "<set-?>");
        monetizationViewModel.j().e(getViewLifecycleOwner(), new k(1, new o(this)));
        monetizationViewModel.i().e(getViewLifecycleOwner(), new k(2, new p(this)));
        ((RobertoButton) _$_findCachedViewById(R.id.monetizationBuyButton)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f26556v;

            {
                this.f26556v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6;
                int i10;
                int i11 = r2;
                q this$0 = this.f26556v;
                switch (i11) {
                    case 0:
                        int i12 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().U = "plus_mini";
                        MiniMonetizationActivity F = this$0.F();
                        String str = this$0.f26576x;
                        if (str != null) {
                            String str2 = this$0.f26577y;
                            if (str2 != null) {
                                String str3 = this$0.f26578z;
                                if (str3 != null) {
                                    F.o0(Constants.SUBSCRIPTION_BASIC_1, str, str2, str3);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("selectedCurrency");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.i.q("selectedPrice");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("selectedOfferToken");
                        throw null;
                    case 1:
                        int i13 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().finish();
                        return;
                    case 2:
                        int i14 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        ((AppCompatImageView) styledDialog.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog, 11));
                        Integer[] numArr = {Integer.valueOf((int) R.string.plusFaqQuestion1), Integer.valueOf((int) R.string.plusFaqQuestion2), Integer.valueOf((int) R.string.plusFaqQuestion3), Integer.valueOf((int) R.string.plusFaqQuestion4), Integer.valueOf((int) R.string.plusFaqQuestion5), Integer.valueOf((int) R.string.plusFaqQuestion6), Integer.valueOf((int) R.string.plusFaqQuestion7)};
                        Integer[] numArr2 = new Integer[7];
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i6 = R.string.plusFaqAnswer1Old;
                        } else {
                            i6 = R.string.plusFaqAnswer1New;
                        }
                        numArr2[0] = Integer.valueOf(i6);
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i10 = R.string.plusFaqAnswer2Alt;
                        } else {
                            i10 = R.string.plusFaqAnswer2;
                        }
                        numArr2[1] = Integer.valueOf(i10);
                        numArr2[2] = Integer.valueOf((int) R.string.plusFaqAnswer3);
                        numArr2[3] = Integer.valueOf((int) R.string.plusFaqAnswer4);
                        numArr2[4] = Integer.valueOf((int) R.string.plusFaqAnswer5);
                        numArr2[5] = Integer.valueOf((int) R.string.plusFaqAnswer6);
                        numArr2[6] = Integer.valueOf((int) R.string.plusFaqAnswer7);
                        for (int i15 = 0; i15 < 7; i15++) {
                            LayoutInflater layoutInflater = this$0.f26573u;
                            if (layoutInflater != null) {
                                View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(this$0.F().getString(numArr[i15].intValue()));
                                if (i15 != 5) {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(this$0.F().getString(numArr2[i15].intValue()));
                                } else {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                }
                                constraintLayout.setOnClickListener(new ik.l1(constraintLayout, this$0, i15, 20));
                                ((LinearLayout) styledDialog.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                            } else {
                                kotlin.jvm.internal.i.q("inflater");
                                throw null;
                            }
                        }
                        styledDialog.show();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("screen", "plus_mini");
                        gk.a.b(bundle2, "monetization_faq_click");
                        return;
                    default:
                        int i16 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("screen", "plus_mini");
                        bundle3.putString("variant", "0");
                        gk.a.b(bundle3, "how_payment_works_click");
                        Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window2 = styledDialog2.getWindow();
                        if (window2 != null) {
                            window2.setLayout(-1, -1);
                        }
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog2, 10));
                        styledDialog2.show();
                        return;
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f26556v;

            {
                this.f26556v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6;
                int i10;
                int i11 = r2;
                q this$0 = this.f26556v;
                switch (i11) {
                    case 0:
                        int i12 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().U = "plus_mini";
                        MiniMonetizationActivity F = this$0.F();
                        String str = this$0.f26576x;
                        if (str != null) {
                            String str2 = this$0.f26577y;
                            if (str2 != null) {
                                String str3 = this$0.f26578z;
                                if (str3 != null) {
                                    F.o0(Constants.SUBSCRIPTION_BASIC_1, str, str2, str3);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("selectedCurrency");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.i.q("selectedPrice");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("selectedOfferToken");
                        throw null;
                    case 1:
                        int i13 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().finish();
                        return;
                    case 2:
                        int i14 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        ((AppCompatImageView) styledDialog.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog, 11));
                        Integer[] numArr = {Integer.valueOf((int) R.string.plusFaqQuestion1), Integer.valueOf((int) R.string.plusFaqQuestion2), Integer.valueOf((int) R.string.plusFaqQuestion3), Integer.valueOf((int) R.string.plusFaqQuestion4), Integer.valueOf((int) R.string.plusFaqQuestion5), Integer.valueOf((int) R.string.plusFaqQuestion6), Integer.valueOf((int) R.string.plusFaqQuestion7)};
                        Integer[] numArr2 = new Integer[7];
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i6 = R.string.plusFaqAnswer1Old;
                        } else {
                            i6 = R.string.plusFaqAnswer1New;
                        }
                        numArr2[0] = Integer.valueOf(i6);
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i10 = R.string.plusFaqAnswer2Alt;
                        } else {
                            i10 = R.string.plusFaqAnswer2;
                        }
                        numArr2[1] = Integer.valueOf(i10);
                        numArr2[2] = Integer.valueOf((int) R.string.plusFaqAnswer3);
                        numArr2[3] = Integer.valueOf((int) R.string.plusFaqAnswer4);
                        numArr2[4] = Integer.valueOf((int) R.string.plusFaqAnswer5);
                        numArr2[5] = Integer.valueOf((int) R.string.plusFaqAnswer6);
                        numArr2[6] = Integer.valueOf((int) R.string.plusFaqAnswer7);
                        for (int i15 = 0; i15 < 7; i15++) {
                            LayoutInflater layoutInflater = this$0.f26573u;
                            if (layoutInflater != null) {
                                View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(this$0.F().getString(numArr[i15].intValue()));
                                if (i15 != 5) {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(this$0.F().getString(numArr2[i15].intValue()));
                                } else {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                }
                                constraintLayout.setOnClickListener(new ik.l1(constraintLayout, this$0, i15, 20));
                                ((LinearLayout) styledDialog.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                            } else {
                                kotlin.jvm.internal.i.q("inflater");
                                throw null;
                            }
                        }
                        styledDialog.show();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("screen", "plus_mini");
                        gk.a.b(bundle2, "monetization_faq_click");
                        return;
                    default:
                        int i16 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("screen", "plus_mini");
                        bundle3.putString("variant", "0");
                        gk.a.b(bundle3, "how_payment_works_click");
                        Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window2 = styledDialog2.getWindow();
                        if (window2 != null) {
                            window2.setLayout(-1, -1);
                        }
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog2, 10));
                        styledDialog2.show();
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.monetizationFAQButton)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f26556v;

            {
                this.f26556v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6;
                int i10;
                int i11 = r2;
                q this$0 = this.f26556v;
                switch (i11) {
                    case 0:
                        int i12 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().U = "plus_mini";
                        MiniMonetizationActivity F = this$0.F();
                        String str = this$0.f26576x;
                        if (str != null) {
                            String str2 = this$0.f26577y;
                            if (str2 != null) {
                                String str3 = this$0.f26578z;
                                if (str3 != null) {
                                    F.o0(Constants.SUBSCRIPTION_BASIC_1, str, str2, str3);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("selectedCurrency");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.i.q("selectedPrice");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("selectedOfferToken");
                        throw null;
                    case 1:
                        int i13 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().finish();
                        return;
                    case 2:
                        int i14 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        ((AppCompatImageView) styledDialog.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog, 11));
                        Integer[] numArr = {Integer.valueOf((int) R.string.plusFaqQuestion1), Integer.valueOf((int) R.string.plusFaqQuestion2), Integer.valueOf((int) R.string.plusFaqQuestion3), Integer.valueOf((int) R.string.plusFaqQuestion4), Integer.valueOf((int) R.string.plusFaqQuestion5), Integer.valueOf((int) R.string.plusFaqQuestion6), Integer.valueOf((int) R.string.plusFaqQuestion7)};
                        Integer[] numArr2 = new Integer[7];
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i6 = R.string.plusFaqAnswer1Old;
                        } else {
                            i6 = R.string.plusFaqAnswer1New;
                        }
                        numArr2[0] = Integer.valueOf(i6);
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i10 = R.string.plusFaqAnswer2Alt;
                        } else {
                            i10 = R.string.plusFaqAnswer2;
                        }
                        numArr2[1] = Integer.valueOf(i10);
                        numArr2[2] = Integer.valueOf((int) R.string.plusFaqAnswer3);
                        numArr2[3] = Integer.valueOf((int) R.string.plusFaqAnswer4);
                        numArr2[4] = Integer.valueOf((int) R.string.plusFaqAnswer5);
                        numArr2[5] = Integer.valueOf((int) R.string.plusFaqAnswer6);
                        numArr2[6] = Integer.valueOf((int) R.string.plusFaqAnswer7);
                        for (int i15 = 0; i15 < 7; i15++) {
                            LayoutInflater layoutInflater = this$0.f26573u;
                            if (layoutInflater != null) {
                                View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(this$0.F().getString(numArr[i15].intValue()));
                                if (i15 != 5) {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(this$0.F().getString(numArr2[i15].intValue()));
                                } else {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                }
                                constraintLayout.setOnClickListener(new ik.l1(constraintLayout, this$0, i15, 20));
                                ((LinearLayout) styledDialog.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                            } else {
                                kotlin.jvm.internal.i.q("inflater");
                                throw null;
                            }
                        }
                        styledDialog.show();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("screen", "plus_mini");
                        gk.a.b(bundle2, "monetization_faq_click");
                        return;
                    default:
                        int i16 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("screen", "plus_mini");
                        bundle3.putString("variant", "0");
                        gk.a.b(bundle3, "how_payment_works_click");
                        Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window2 = styledDialog2.getWindow();
                        if (window2 != null) {
                            window2.setLayout(-1, -1);
                        }
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog2, 10));
                        styledDialog2.show();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).getPaintFlags() | 8);
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationPaymentExplanationCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: nn.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f26556v;

            {
                this.f26556v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6;
                int i10;
                int i11 = r2;
                q this$0 = this.f26556v;
                switch (i11) {
                    case 0:
                        int i12 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().U = "plus_mini";
                        MiniMonetizationActivity F = this$0.F();
                        String str = this$0.f26576x;
                        if (str != null) {
                            String str2 = this$0.f26577y;
                            if (str2 != null) {
                                String str3 = this$0.f26578z;
                                if (str3 != null) {
                                    F.o0(Constants.SUBSCRIPTION_BASIC_1, str, str2, str3);
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("selectedCurrency");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.i.q("selectedPrice");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("selectedOfferToken");
                        throw null;
                    case 1:
                        int i13 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.F().finish();
                        return;
                    case 2:
                        int i14 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        ((AppCompatImageView) styledDialog.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog, 11));
                        Integer[] numArr = {Integer.valueOf((int) R.string.plusFaqQuestion1), Integer.valueOf((int) R.string.plusFaqQuestion2), Integer.valueOf((int) R.string.plusFaqQuestion3), Integer.valueOf((int) R.string.plusFaqQuestion4), Integer.valueOf((int) R.string.plusFaqQuestion5), Integer.valueOf((int) R.string.plusFaqQuestion6), Integer.valueOf((int) R.string.plusFaqQuestion7)};
                        Integer[] numArr2 = new Integer[7];
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i6 = R.string.plusFaqAnswer1Old;
                        } else {
                            i6 = R.string.plusFaqAnswer1New;
                        }
                        numArr2[0] = Integer.valueOf(i6);
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.2", "v2.21"})) {
                            i10 = R.string.plusFaqAnswer2Alt;
                        } else {
                            i10 = R.string.plusFaqAnswer2;
                        }
                        numArr2[1] = Integer.valueOf(i10);
                        numArr2[2] = Integer.valueOf((int) R.string.plusFaqAnswer3);
                        numArr2[3] = Integer.valueOf((int) R.string.plusFaqAnswer4);
                        numArr2[4] = Integer.valueOf((int) R.string.plusFaqAnswer5);
                        numArr2[5] = Integer.valueOf((int) R.string.plusFaqAnswer6);
                        numArr2[6] = Integer.valueOf((int) R.string.plusFaqAnswer7);
                        for (int i15 = 0; i15 < 7; i15++) {
                            LayoutInflater layoutInflater = this$0.f26573u;
                            if (layoutInflater != null) {
                                View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                                kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(this$0.F().getString(numArr[i15].intValue()));
                                if (i15 != 5) {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(this$0.F().getString(numArr2[i15].intValue()));
                                } else {
                                    ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                                }
                                constraintLayout.setOnClickListener(new ik.l1(constraintLayout, this$0, i15, 20));
                                ((LinearLayout) styledDialog.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                            } else {
                                kotlin.jvm.internal.i.q("inflater");
                                throw null;
                            }
                        }
                        styledDialog.show();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("screen", "plus_mini");
                        gk.a.b(bundle2, "monetization_faq_click");
                        return;
                    default:
                        int i16 = q.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("screen", "plus_mini");
                        bundle3.putString("variant", "0");
                        gk.a.b(bundle3, "how_payment_works_click");
                        Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, this$0.F(), R.style.Theme_Dialog_Fullscreen);
                        Window window2 = styledDialog2.getWindow();
                        if (window2 != null) {
                            window2.setLayout(-1, -1);
                        }
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((RobertoTextView) styledDialog2.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                        ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog2, 10));
                        styledDialog2.show();
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceSubtextOffer)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.monetizationSchemePriceOffer)).getPaintFlags() | 16);
    }
}
