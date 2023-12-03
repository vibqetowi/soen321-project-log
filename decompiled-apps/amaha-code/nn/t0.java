package nn;

import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.Locale;
import nn.u0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26603u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u0 f26604v;

    public /* synthetic */ t0(u0 u0Var, int i6) {
        this.f26603u = i6;
        this.f26604v = u0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6 = this.f26603u;
        u0 this$0 = this.f26604v;
        switch (i6) {
            case 0:
                int i10 = u0.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Editable text = ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextCoupon)).getText();
                if (text != null && !gv.n.B0(text)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    try {
                        Object systemService = this$0.requireContext().getSystemService("input_method");
                        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextCoupon)).getWindowToken(), 0);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$0.f26619w, e10);
                    }
                    this$0.F().Q(true);
                    on.b bVar = new on.b();
                    String obj = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextCoupon)).getText())).toString();
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.i.f(ROOT, "ROOT");
                    String upperCase = obj.toUpperCase(ROOT);
                    kotlin.jvm.internal.i.f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    bVar.b(upperCase, new u0.a());
                } else {
                    Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "Please enter coupon code");
                }
                ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextCoupon)).setText("");
                return;
            default:
                int i11 = u0.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((TextInputLayout) this$0._$_findCachedViewById(R.id.couponDialogEditText)).setVisibility(0);
                this$0._$_findCachedViewById(R.id.couponDialogEditTextBorder).setVisibility(0);
                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.campaignApplyCouponCta)).setVisibility(0);
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(8);
                this$0.F().K("", "", false);
                return;
        }
    }
}
