package nn;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.text.SimpleDateFormat;
/* compiled from: BasicMonetizationFragment.kt */
/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MonetizationViewModel f26543u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ h f26544v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MonetizationViewModel monetizationViewModel, h hVar) {
        super(1);
        this.f26543u = monetizationViewModel;
        this.f26544v = hVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        MonetizationViewModel monetizationViewModel = this.f26543u;
        h hVar = this.f26544v;
        if (bool2 != null && bool2.booleanValue()) {
            hVar.B = true;
            hVar.E = monetizationViewModel.X;
            String str = monetizationViewModel.Y;
            hVar.F = str;
            if (kotlin.jvm.internal.i.b(str, Constants.SUBSCRIPTION_BASIC_FREE)) {
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton4)).setVisibility(0);
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.basicMonetizationCouponAppliedFree)).setVisibility(0);
                ((RobertoTextView) hVar._$_findCachedViewById(R.id.monetizationFreeCouponTitle)).setText(monetizationViewModel.f11451a0.optString("title"));
                ((RobertoTextView) hVar._$_findCachedViewById(R.id.monetizationFreeCouponSubText)).setText(monetizationViewModel.f11451a0.optString("sub_text_1"));
                ((RobertoTextView) hVar._$_findCachedViewById(R.id.basicMonetizationCouponAppliedFreeText)).setText(monetizationViewModel.f11451a0.optString("sub_text_2"));
                ((AppCompatImageView) hVar._$_findCachedViewById(R.id.basicMonetizationCouponAppliedFreeRemove)).setOnClickListener(new e(hVar, 11));
                String format = new SimpleDateFormat("dd MMMM").format(Long.valueOf((Utils.INSTANCE.getTodayTimeInSeconds() + 5184000) * 1000));
                ((RobertoTextView) hVar._$_findCachedViewById(R.id.monetizationPriceText)).setText("Your access will end on " + format + ", post which you will have to subscribe again to access Plus features.");
                ((RobertoTextView) hVar._$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(8);
                ((RobertoButton) hVar._$_findCachedViewById(R.id.monetizationBuyButton)).setText(hVar.getString(R.string.start_now));
                MonetizationActivity K = hVar.K();
                Object obj = g0.a.f16164a;
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton1)).setBackground(a.c.b(K, R.drawable.grey_background_rounded_corners));
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton2)).setBackground(a.c.b(hVar.K(), R.drawable.grey_background_rounded_corners));
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton3)).setBackground(a.c.b(hVar.K(), R.drawable.grey_background_rounded_corners));
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton1)).setOnClickListener(new il.g(14));
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton2)).setOnClickListener(new il.g(15));
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton3)).setOnClickListener(new il.g(16));
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton1)).setClickable(false);
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton2)).setClickable(false);
                ((ConstraintLayout) hVar._$_findCachedViewById(R.id.monetizationSchemeButton3)).setClickable(false);
                ((RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) defpackage.d.e(hVar, R.color.title_high_contrast_35_opacity, (RobertoTextView) hVar._$_findCachedViewById(R.id.monetizationSchemeType1), R.id.monetizationSchemeUnlock1), R.id.monetizationSchemePriceSubtext1), R.id.monetizationSchemePrice1), R.id.monetizationSchemeCycle1), R.id.monetizationSchemeType2), R.id.monetizationSchemeUnlock2), R.id.monetizationSchemePriceSubtext2), R.id.monetizationSchemePrice2), R.id.monetizationSchemeCycle2), R.id.monetizationSchemeType3), R.id.monetizationSchemeUnlock3), R.id.monetizationSchemePriceSubtext3), R.id.monetizationSchemePrice3), R.id.monetizationSchemeCycle3), R.id.monetizationFreeTrialTag)).setVisibility(8);
            } else {
                hVar.D = monetizationViewModel.Z;
                kotlin.jvm.internal.i.g(monetizationViewModel.f11451a0, "<set-?>");
            }
        }
        ((androidx.lifecycle.w) monetizationViewModel.U.getValue()).e(hVar.getViewLifecycleOwner(), new k(0, new l(hVar)));
        return hs.k.f19476a;
    }
}
