package nn;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.model.SkuModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Arrays;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26469u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f26470v;

    public /* synthetic */ e(h hVar, int i6) {
        this.f26469u = i6;
        this.f26470v = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        int i6;
        int i10;
        int i11 = this.f26469u;
        h this$0 = this.f26470v;
        switch (i11) {
            case 0:
                int i12 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().onBackPressed();
                return;
            case 1:
                int i13 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_coupon_code, this$0.K(), R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                kotlin.jvm.internal.i.d(window);
                window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                EditText editText = (EditText) styledDialog.findViewById(R.id.editTextCoupon);
                ((AppCompatImageView) styledDialog.findViewById(R.id.couponDialogClose)).setOnClickListener(new lm.f(styledDialog, 9));
                InputFilter[] filters = editText.getFilters();
                kotlin.jvm.internal.i.f(filters, "couponEditText.filters");
                InputFilter.AllCaps allCaps = new InputFilter.AllCaps();
                int length = filters.length;
                Object[] copyOf = Arrays.copyOf(filters, length + 1);
                copyOf[length] = allCaps;
                editText.setFilters((InputFilter[]) copyOf);
                ((TextView) styledDialog.findViewById(R.id.couponDialogApply)).setOnClickListener(new g(0, editText, styledDialog, this$0));
                styledDialog.show();
                String str4 = gk.a.f16573a;
                Bundle f = defpackage.e.f("variant", "0", "package", "plus");
                hs.k kVar = hs.k.f19476a;
                gk.a.b(f, "selling_screen_coupon_entry_click");
                return;
            case 2:
                String str5 = null;
                int i14 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.B) {
                    SkuModel skuModel = this$0.D;
                    if (skuModel != null) {
                        str = skuModel.getSubscriptionPeriod();
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.i.b(str, Constants.PLUS_MONTHLY)) {
                        String str6 = this$0.F;
                        if (str6 != null) {
                            this$0.f26501x = str6;
                            this$0.F(Constants.PLUS_MONTHLY);
                        }
                    } else {
                        this$0.f26501x = Constants.SUBSCRIPTION_BASIC_1;
                        this$0.J(false);
                    }
                    SkuModel skuModel2 = this$0.D;
                    if (skuModel2 != null) {
                        str5 = skuModel2.getSubscriptionPeriod();
                    }
                    if (!kotlin.jvm.internal.i.b(str5, Constants.PLUS_MONTHLY)) {
                        this$0.P();
                    }
                    String str7 = gk.a.f16573a;
                    Bundle f2 = defpackage.e.f("variant", "0", "package", "plus");
                    f2.putString("plan", Constants.PLUS_MONTHLY);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(f2, "selling_screen_sku_click");
                    return;
                }
                return;
            case 3:
                String str8 = null;
                int i15 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.B) {
                    SkuModel skuModel3 = this$0.D;
                    if (skuModel3 != null) {
                        str2 = skuModel3.getSubscriptionPeriod();
                    } else {
                        str2 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str2, Constants.PLUS_QUARTERLY)) {
                        String str9 = this$0.F;
                        if (str9 != null) {
                            this$0.f26501x = str9;
                            this$0.F(Constants.PLUS_QUARTERLY);
                        }
                    } else {
                        this$0.f26501x = Constants.SUBSCRIPTION_BASIC_2;
                        this$0.J(false);
                    }
                    SkuModel skuModel4 = this$0.D;
                    if (skuModel4 != null) {
                        str8 = skuModel4.getSubscriptionPeriod();
                    }
                    if (!kotlin.jvm.internal.i.b(str8, Constants.PLUS_QUARTERLY)) {
                        this$0.P();
                    }
                    String str10 = gk.a.f16573a;
                    Bundle f10 = defpackage.e.f("variant", "0", "package", "plus");
                    f10.putString("plan", Constants.PLUS_QUARTERLY);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(f10, "selling_screen_sku_click");
                    return;
                }
                return;
            case 4:
                String str11 = null;
                int i16 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.B) {
                    SkuModel skuModel5 = this$0.D;
                    if (skuModel5 != null) {
                        str3 = skuModel5.getSubscriptionPeriod();
                    } else {
                        str3 = null;
                    }
                    if (kotlin.jvm.internal.i.b(str3, Constants.PLUS_ANNUAL)) {
                        String str12 = this$0.F;
                        if (str12 != null) {
                            this$0.f26501x = str12;
                            this$0.F(Constants.PLUS_ANNUAL);
                        }
                    } else {
                        this$0.f26501x = Constants.SUBSCRIPTION_BASIC_3;
                        this$0.J(false);
                    }
                    SkuModel skuModel6 = this$0.D;
                    if (skuModel6 != null) {
                        str11 = skuModel6.getSubscriptionPeriod();
                    }
                    if (!kotlin.jvm.internal.i.b(str11, Constants.PLUS_ANNUAL)) {
                        this$0.P();
                    }
                    String str13 = gk.a.f16573a;
                    Bundle f11 = defpackage.e.f("variant", "0", "package", "plus");
                    f11.putString("plan", Constants.PLUS_ANNUAL);
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(f11, "selling_screen_sku_click");
                    return;
                }
                return;
            case 5:
                int i17 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (kotlin.jvm.internal.i.b(this$0.O(), Constants.SUBSCRIPTION_BASIC_FREE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("plan", this$0.O());
                    bundle.putString("source", this$0.K().B);
                    bundle.putBoolean("isOnboarding", this$0.K().F);
                    bundle.putBoolean("signup_flow", this$0.K().G);
                    bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    bundle.putString("screen", "plus");
                    if (this$0.K().F || this$0.K().G) {
                        bundle.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                    }
                    MonetizationViewModel M = this$0.M();
                    String str14 = this$0.E;
                    kotlin.jvm.internal.i.d(str14);
                    ta.v.H(kc.f.H(M), kotlinx.coroutines.o0.f23642c, 0, new qn.o(M, bundle, str14, null), 2);
                    return;
                }
                this$0.K().X = "plus";
                MonetizationActivity K = this$0.K();
                String O = this$0.O();
                String str15 = this$0.f26502y;
                if (str15 != null) {
                    String str16 = this$0.f26503z;
                    if (str16 != null) {
                        String str17 = this$0.A;
                        if (str17 != null) {
                            K.o0(O, str15, str16, str17);
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
            case 6:
                int i18 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().X = "plus";
                this$0.K().v0();
                return;
            case 7:
                int i19 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().y0();
                return;
            case 8:
                int i20 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().w0();
                return;
            case 9:
                int i21 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                s5 s5Var = new s5(14);
                Context requireContext = this$0.requireContext();
                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                LayoutInflater layoutInflater = this$0.f26499v;
                if (layoutInflater != null) {
                    Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_faq_fullscreen, requireContext, R.style.Theme_Dialog_Fullscreen);
                    Window window2 = styledDialog2.getWindow();
                    if (window2 != null) {
                        window2.setLayout(-1, -1);
                    }
                    ((AppCompatImageView) styledDialog2.findViewById(R.id.dialogFAQBack)).setOnClickListener(new lm.f(styledDialog2, 15));
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
                    for (int i22 = 0; i22 < 7; i22++) {
                        View inflate = layoutInflater.inflate(R.layout.row_monetization_faq, (ViewGroup) null);
                        kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        ((RobertoTextView) constraintLayout.findViewById(R.id.faqTitle)).setText(requireContext.getString(numArr[i22].intValue()));
                        if (i22 != 5) {
                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setText(requireContext.getString(numArr2[i22].intValue()));
                        } else {
                            ((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).setMovementMethod(LinkMovementMethod.getInstance());
                        }
                        constraintLayout.setOnClickListener(new ik.l1(constraintLayout, s5Var, i22, 21));
                        ((LinearLayout) styledDialog2.findViewById(R.id.dialogFAQLayout)).addView(constraintLayout);
                    }
                    styledDialog2.show();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("screen", "plus");
                    gk.a.b(bundle2, "monetization_faq_click");
                    return;
                }
                kotlin.jvm.internal.i.q("inflater");
                throw null;
            case 10:
                int i23 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                LogHelper.INSTANCE.makeLogTag("MonetizationUtils");
                Context requireContext2 = this$0.requireContext();
                kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
                Bundle bundle3 = new Bundle();
                bundle3.putString("screen", "plus");
                bundle3.putString("variant", "0");
                gk.a.b(bundle3, "how_payment_works_click");
                Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_payments_fullscreen, requireContext2, R.style.Theme_Dialog_Fullscreen);
                Window window3 = styledDialog3.getWindow();
                if (window3 != null) {
                    window3.setLayout(-1, -1);
                }
                ((RobertoTextView) styledDialog3.findViewById(R.id.tvPoint1Body)).setMovementMethod(LinkMovementMethod.getInstance());
                ((RobertoTextView) styledDialog3.findViewById(R.id.tvPoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                ((AppCompatImageView) styledDialog3.findViewById(R.id.dialogPaymentsBack)).setOnClickListener(new lm.f(styledDialog3, 16));
                styledDialog3.show();
                return;
            case 11:
                int i24 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton4)).setVisibility(8);
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.basicMonetizationCouponAppliedFree)).setVisibility(8);
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationPriceText)).setVisibility(0);
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(0);
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton1)).setClickable(true);
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton2)).setClickable(true);
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton3)).setClickable(true);
                ((RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) defpackage.d.e(this$0, R.color.title_high_contrast, (RobertoTextView) this$0._$_findCachedViewById(R.id.monetizationSchemeType1), R.id.monetizationSchemeUnlock1), R.id.monetizationSchemePriceSubtext1), R.id.monetizationSchemePrice1), R.id.monetizationSchemeCycle1), R.id.monetizationSchemeType2), R.id.monetizationSchemeUnlock2), R.id.monetizationSchemePriceSubtext2), R.id.monetizationSchemePrice2), R.id.monetizationSchemeCycle2), R.id.monetizationSchemeType3), R.id.monetizationSchemeUnlock3), R.id.monetizationSchemePriceSubtext3), R.id.monetizationSchemePrice3), R.id.monetizationSchemeCycle3)).setTextColor(g0.a.b(this$0.requireContext(), R.color.title_high_contrast));
                this$0.f26501x = Constants.SUBSCRIPTION_BASIC_1;
                this$0.Q();
                this$0.J(false);
                return;
            case 12:
                int i25 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + SubscriptionPersistence.INSTANCE.getSubscriptionType() + "&package=" + this$0.requireActivity().getPackageName())));
                gk.a.b(null, "hold_plus_selling_screen_update_click");
                return;
            case 13:
                int i26 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String makeLogTag = LogHelper.INSTANCE.makeLogTag("MonetizationUtils");
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                try {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("source", "plus_selling_screen");
                    gk.a.b(null, "hold_plus_selling_screen_learn_more_click");
                    Dialog styledDialog4 = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, requireActivity, R.style.Theme_Dialog_Fullscreen);
                    Window window4 = styledDialog4.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    ((AppCompatImageView) styledDialog4.findViewById(R.id.dialogGraceBack)).setOnClickListener(new lm.f(styledDialog4, 17));
                    ((RobertoButton) styledDialog4.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new g(styledDialog4, requireActivity, bundle4, 2));
                    ((RobertoTextView) styledDialog4.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
                    ((RobertoTextView) styledDialog4.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
                    styledDialog4.show();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(makeLogTag, e10);
                    return;
                }
            case 14:
                int i27 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.S(Constants.PLUS_MONTHLY);
                return;
            case 15:
                int i28 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.S(Constants.PLUS_QUARTERLY);
                return;
            default:
                int i29 = h.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.S(Constants.PLUS_ANNUAL);
                return;
        }
    }
}
