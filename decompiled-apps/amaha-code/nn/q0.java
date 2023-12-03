package nn;

import android.app.Dialog;
import android.graphics.Color;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.Arrays;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26579u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s0 f26580v;

    public /* synthetic */ q0(s0 s0Var, int i6) {
        this.f26579u = i6;
        this.f26580v = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f26579u;
        s0 this$0 = this.f26580v;
        switch (i6) {
            case 0:
                int i10 = s0.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_coupon, this$0.getActivity(), R.style.Theme_Dialog);
                    Window window = styledDialog.getWindow();
                    kotlin.jvm.internal.i.d(window);
                    window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                    if (!kotlin.jvm.internal.i.b(this$0.f26594w, "") && this$0.getActivity() != null) {
                        Glide.i(this$0.requireActivity()).d(new File(this$0.requireActivity().getFilesDir(), this$0.f26594w)).B((ImageView) styledDialog.findViewById(R.id.couponDialogBanner));
                    }
                    if (!kotlin.jvm.internal.i.b(this$0.f26596y, "")) {
                        ((TextInputLayout) styledDialog.findViewById(R.id.couponDialogEditText)).setHint(this$0.f26596y);
                    }
                    if (!kotlin.jvm.internal.i.b(this$0.f26595x, "")) {
                        ((RobertoTextView) styledDialog.findViewById(R.id.couponDialogTitle)).setText(this$0.f26595x);
                    }
                    if (!kotlin.jvm.internal.i.b(this$0.f26597z, "")) {
                        ((RobertoTextView) styledDialog.findViewById(R.id.couponDialogApply)).setText(this$0.f26597z);
                    }
                    EditText editText = (EditText) styledDialog.findViewById(R.id.editTextCoupon);
                    InputFilter[] filters = editText.getFilters();
                    kotlin.jvm.internal.i.f(filters, "couponEditText.filters");
                    InputFilter.AllCaps allCaps = new InputFilter.AllCaps();
                    int length = filters.length;
                    Object[] copyOf = Arrays.copyOf(filters, length + 1);
                    copyOf[length] = allCaps;
                    editText.setFilters((InputFilter[]) copyOf);
                    if (!gv.n.B0(this$0.A)) {
                        ((TextView) styledDialog.findViewById(R.id.couponDialogApply)).setTextColor(Color.parseColor(this$0.A));
                    }
                    ((TextView) styledDialog.findViewById(R.id.couponDialogApply)).setOnClickListener(new g(1, editText, styledDialog, this$0));
                    ((AppCompatImageView) styledDialog.findViewById(R.id.couponDialogClose)).setOnClickListener(new lm.f(styledDialog, 12));
                    styledDialog.show();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.E, e10);
                    return;
                }
            default:
                int i11 = s0.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.basicMonetizationCouponCTA)).setVisibility(0);
                ((ConstraintLayout) this$0._$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(8);
                return;
        }
    }
}
