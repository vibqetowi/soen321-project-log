package ho;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ProIntroConsentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/z;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18069x = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f18071v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18072w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18070u = LogHelper.INSTANCE.makeLogTag(z.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18072w;
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
        return inflater.inflate(R.layout.fragment_pa_pro_intro_consent, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18072w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.paIntroAnim);
        if (lottieAnimationView != null) {
            lottieAnimationView.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.paIntroAnim);
        if (lottieAnimationView != null) {
            lottieAnimationView.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.paIntroCta);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: ho.w

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ z f18066v;

                    {
                        this.f18066v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        z this$0 = this.f18066v;
                        switch (i6) {
                            case 0:
                                int i10 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                    if (this$0.f18071v) {
                                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                        firebasePersistence.getUser().getCoachModelInfo().setConsentGiven(true);
                                        firebasePersistence.updateUserOnFirebase();
                                        gk.a.b(null, "pro_consent_given");
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        ((rr.a) requireActivity).t0();
                                        return;
                                    }
                                    Toast.makeText(this$0.requireContext(), "Please accept the Terms and Conditions", 0).show();
                                    return;
                                }
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_error, this$0.requireContext(), R.style.Theme_Dialog_Fullscreen);
                                View findViewById = styledDialog.findViewById(R.id.errorBanner);
                                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                ((AppCompatImageView) findViewById).setVisibility(8);
                                View findViewById2 = styledDialog.findViewById(R.id.errorText);
                                kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                ((RobertoTextView) findViewById2).setText(this$0.getString(R.string.paymentProcessingDialogText));
                                View findViewById3 = styledDialog.findViewById(R.id.okButton);
                                kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                ((RobertoTextView) findViewById3).setOnClickListener(new lm.f(styledDialog, 18));
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -2);
                                }
                                styledDialog.show();
                                return;
                            case 1:
                                int i11 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_pro_consent_terms, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    Window window2 = styledDialog2.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(-1, -1);
                                    }
                                    ImageView imageView = (ImageView) styledDialog2.findViewById(R.id.proTermsDialogBack);
                                    if (imageView != null) {
                                        imageView.setOnClickListener(new lm.f(styledDialog2, 19));
                                    }
                                    RobertoButton robertoButton2 = (RobertoButton) styledDialog2.findViewById(R.id.proTermsDialogCTA);
                                    if (robertoButton2 != null) {
                                        robertoButton2.setOnClickListener(new lm.f(styledDialog2, 20));
                                    }
                                    styledDialog2.show();
                                    SpannableString spannableString = new SpannableString(this$0.getString(R.string.proAssessmentConsentTCClickable));
                                    y yVar = new y(this$0);
                                    x xVar = new x(this$0);
                                    spannableString.setSpan(yVar, 75, 95, 33);
                                    spannableString.setSpan(xVar, 100, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, 33);
                                    spannableString.setSpan(new URLSpan("mailto:support@amahahealth.com"), 187, 211, 33);
                                    RobertoTextView robertoTextView = (RobertoTextView) styledDialog2.findViewById(R.id.proTermsDialogBodyClickable);
                                    if (robertoTextView != null) {
                                        robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                    RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog2.findViewById(R.id.proTermsDialogBodyClickable);
                                    if (robertoTextView2 != null) {
                                        robertoTextView2.setText(spannableString);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f18070u, e10);
                                    return;
                                }
                            default:
                                int i12 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18071v) {
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setImageResource(R.drawable.ic_check_box_outline_blank_gray_24dp);
                                    }
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView2 != null) {
                                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.pro_card_dark_blue)));
                                    }
                                    RobertoButton robertoButton3 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton3 != null) {
                                        robertoButton3.setAlpha(0.34f);
                                    }
                                    RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton4 != null) {
                                        robertoButton4.setEnabled(false);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView3 != null) {
                                        appCompatImageView3.setImageResource(R.drawable.ic_check_box_blue_pro_blue_curved);
                                    }
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView4 != null) {
                                        appCompatImageView4.setImageTintList(null);
                                    }
                                    RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton5 != null) {
                                        robertoButton5.setAlpha(1.0f);
                                    }
                                    RobertoButton robertoButton6 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton6 != null) {
                                        robertoButton6.setEnabled(true);
                                    }
                                }
                                this$0.f18071v = !this$0.f18071v;
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.paIntroTCPrompt);
            if (robertoTextView != null) {
                robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: ho.w

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ z f18066v;

                    {
                        this.f18066v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        z this$0 = this.f18066v;
                        switch (i6) {
                            case 0:
                                int i10 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                    if (this$0.f18071v) {
                                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                        firebasePersistence.getUser().getCoachModelInfo().setConsentGiven(true);
                                        firebasePersistence.updateUserOnFirebase();
                                        gk.a.b(null, "pro_consent_given");
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        ((rr.a) requireActivity).t0();
                                        return;
                                    }
                                    Toast.makeText(this$0.requireContext(), "Please accept the Terms and Conditions", 0).show();
                                    return;
                                }
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_error, this$0.requireContext(), R.style.Theme_Dialog_Fullscreen);
                                View findViewById = styledDialog.findViewById(R.id.errorBanner);
                                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                ((AppCompatImageView) findViewById).setVisibility(8);
                                View findViewById2 = styledDialog.findViewById(R.id.errorText);
                                kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                ((RobertoTextView) findViewById2).setText(this$0.getString(R.string.paymentProcessingDialogText));
                                View findViewById3 = styledDialog.findViewById(R.id.okButton);
                                kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                ((RobertoTextView) findViewById3).setOnClickListener(new lm.f(styledDialog, 18));
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -2);
                                }
                                styledDialog.show();
                                return;
                            case 1:
                                int i11 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_pro_consent_terms, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    Window window2 = styledDialog2.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(-1, -1);
                                    }
                                    ImageView imageView = (ImageView) styledDialog2.findViewById(R.id.proTermsDialogBack);
                                    if (imageView != null) {
                                        imageView.setOnClickListener(new lm.f(styledDialog2, 19));
                                    }
                                    RobertoButton robertoButton2 = (RobertoButton) styledDialog2.findViewById(R.id.proTermsDialogCTA);
                                    if (robertoButton2 != null) {
                                        robertoButton2.setOnClickListener(new lm.f(styledDialog2, 20));
                                    }
                                    styledDialog2.show();
                                    SpannableString spannableString = new SpannableString(this$0.getString(R.string.proAssessmentConsentTCClickable));
                                    y yVar = new y(this$0);
                                    x xVar = new x(this$0);
                                    spannableString.setSpan(yVar, 75, 95, 33);
                                    spannableString.setSpan(xVar, 100, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, 33);
                                    spannableString.setSpan(new URLSpan("mailto:support@amahahealth.com"), 187, 211, 33);
                                    RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog2.findViewById(R.id.proTermsDialogBodyClickable);
                                    if (robertoTextView2 != null) {
                                        robertoTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                    RobertoTextView robertoTextView22 = (RobertoTextView) styledDialog2.findViewById(R.id.proTermsDialogBodyClickable);
                                    if (robertoTextView22 != null) {
                                        robertoTextView22.setText(spannableString);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f18070u, e10);
                                    return;
                                }
                            default:
                                int i12 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18071v) {
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setImageResource(R.drawable.ic_check_box_outline_blank_gray_24dp);
                                    }
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView2 != null) {
                                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.pro_card_dark_blue)));
                                    }
                                    RobertoButton robertoButton3 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton3 != null) {
                                        robertoButton3.setAlpha(0.34f);
                                    }
                                    RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton4 != null) {
                                        robertoButton4.setEnabled(false);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView3 != null) {
                                        appCompatImageView3.setImageResource(R.drawable.ic_check_box_blue_pro_blue_curved);
                                    }
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView4 != null) {
                                        appCompatImageView4.setImageTintList(null);
                                    }
                                    RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton5 != null) {
                                        robertoButton5.setAlpha(1.0f);
                                    }
                                    RobertoButton robertoButton6 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton6 != null) {
                                        robertoButton6.setEnabled(true);
                                    }
                                }
                                this$0.f18071v = !this$0.f18071v;
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paIntroTCCheckbox);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ho.w

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ z f18066v;

                    {
                        this.f18066v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        z this$0 = this.f18066v;
                        switch (i6) {
                            case 0:
                                int i10 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                    if (this$0.f18071v) {
                                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                        firebasePersistence.getUser().getCoachModelInfo().setConsentGiven(true);
                                        firebasePersistence.updateUserOnFirebase();
                                        gk.a.b(null, "pro_consent_given");
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                                        ((rr.a) requireActivity).t0();
                                        return;
                                    }
                                    Toast.makeText(this$0.requireContext(), "Please accept the Terms and Conditions", 0).show();
                                    return;
                                }
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_error, this$0.requireContext(), R.style.Theme_Dialog_Fullscreen);
                                View findViewById = styledDialog.findViewById(R.id.errorBanner);
                                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                ((AppCompatImageView) findViewById).setVisibility(8);
                                View findViewById2 = styledDialog.findViewById(R.id.errorText);
                                kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                ((RobertoTextView) findViewById2).setText(this$0.getString(R.string.paymentProcessingDialogText));
                                View findViewById3 = styledDialog.findViewById(R.id.okButton);
                                kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                ((RobertoTextView) findViewById3).setOnClickListener(new lm.f(styledDialog, 18));
                                Window window = styledDialog.getWindow();
                                if (window != null) {
                                    window.setLayout(-1, -2);
                                }
                                styledDialog.show();
                                return;
                            case 1:
                                int i11 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_pro_consent_terms, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    Window window2 = styledDialog2.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(-1, -1);
                                    }
                                    ImageView imageView = (ImageView) styledDialog2.findViewById(R.id.proTermsDialogBack);
                                    if (imageView != null) {
                                        imageView.setOnClickListener(new lm.f(styledDialog2, 19));
                                    }
                                    RobertoButton robertoButton2 = (RobertoButton) styledDialog2.findViewById(R.id.proTermsDialogCTA);
                                    if (robertoButton2 != null) {
                                        robertoButton2.setOnClickListener(new lm.f(styledDialog2, 20));
                                    }
                                    styledDialog2.show();
                                    SpannableString spannableString = new SpannableString(this$0.getString(R.string.proAssessmentConsentTCClickable));
                                    y yVar = new y(this$0);
                                    x xVar = new x(this$0);
                                    spannableString.setSpan(yVar, 75, 95, 33);
                                    spannableString.setSpan(xVar, 100, com.appsflyer.R.styleable.AppCompatTheme_tooltipForegroundColor, 33);
                                    spannableString.setSpan(new URLSpan("mailto:support@amahahealth.com"), 187, 211, 33);
                                    RobertoTextView robertoTextView2 = (RobertoTextView) styledDialog2.findViewById(R.id.proTermsDialogBodyClickable);
                                    if (robertoTextView2 != null) {
                                        robertoTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                    RobertoTextView robertoTextView22 = (RobertoTextView) styledDialog2.findViewById(R.id.proTermsDialogBodyClickable);
                                    if (robertoTextView22 != null) {
                                        robertoTextView22.setText(spannableString);
                                        return;
                                    }
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f18070u, e10);
                                    return;
                                }
                            default:
                                int i12 = z.f18069x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18071v) {
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView2 != null) {
                                        appCompatImageView2.setImageResource(R.drawable.ic_check_box_outline_blank_gray_24dp);
                                    }
                                    AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView22 != null) {
                                        appCompatImageView22.setImageTintList(ColorStateList.valueOf(g0.a.b(this$0.requireContext(), R.color.pro_card_dark_blue)));
                                    }
                                    RobertoButton robertoButton3 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton3 != null) {
                                        robertoButton3.setAlpha(0.34f);
                                    }
                                    RobertoButton robertoButton4 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton4 != null) {
                                        robertoButton4.setEnabled(false);
                                    }
                                } else {
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView3 != null) {
                                        appCompatImageView3.setImageResource(R.drawable.ic_check_box_blue_pro_blue_curved);
                                    }
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.paIntroTCCheckbox);
                                    if (appCompatImageView4 != null) {
                                        appCompatImageView4.setImageTintList(null);
                                    }
                                    RobertoButton robertoButton5 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton5 != null) {
                                        robertoButton5.setAlpha(1.0f);
                                    }
                                    RobertoButton robertoButton6 = (RobertoButton) this$0._$_findCachedViewById(R.id.paIntroCta);
                                    if (robertoButton6 != null) {
                                        robertoButton6.setEnabled(true);
                                    }
                                }
                                this$0.f18071v = !this$0.f18071v;
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18070u, e10);
        }
    }
}
