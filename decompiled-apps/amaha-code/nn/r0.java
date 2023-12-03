package nn;

import android.os.Bundle;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.volley.VolleyError;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import org.json.JSONObject;
/* compiled from: CC1Fragment.kt */
/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.k implements ss.q<Boolean, JSONObject, VolleyError, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s0 f26585u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ EditText f26586v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, EditText editText) {
        super(3);
        this.f26585u = s0Var;
        this.f26586v = editText;
    }

    @Override // ss.q
    public final hs.k invoke(Boolean bool, JSONObject jSONObject, VolleyError volleyError) {
        e4.i iVar;
        String str;
        boolean booleanValue = bool.booleanValue();
        JSONObject jSONObject2 = jSONObject;
        VolleyError volleyError2 = volleyError;
        s0 s0Var = this.f26585u;
        s0Var.F().Q(false);
        String str2 = s0Var.E;
        EditText editText = this.f26586v;
        if (booleanValue) {
            String obj = editText.getText().toString();
            try {
                if (s0Var.isAdded() && jSONObject2 != null) {
                    if (kotlin.jvm.internal.i.b(jSONObject2.opt("status"), Constants.COUPON_STATE_APPLIED)) {
                        if ((!s0Var.D.isEmpty()) && s0Var.D.contains(jSONObject2.optString("sku"))) {
                            Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "You have already used this coupon code.");
                        } else if (kotlin.jvm.internal.i.b(jSONObject2.optString("sku"), Constants.SUBSCRIPTION_BASIC_FREE)) {
                            Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "Coupon code successfully applied!");
                            rn.d F = s0Var.F();
                            String optString = jSONObject2.optString("coupon_id");
                            kotlin.jvm.internal.i.f(optString, "it.optString(\"coupon_id\")");
                            String optString2 = jSONObject2.optString("sku");
                            kotlin.jvm.internal.i.f(optString2, "it.optString(\"sku\")");
                            F.K(optString, optString2, true);
                            ((ConstraintLayout) s0Var._$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(0);
                            String optString3 = jSONObject2.optString("title");
                            kotlin.jvm.internal.i.f(optString3, "it.optString(\"title\")");
                            String optString4 = jSONObject2.optString("sub_text_1");
                            kotlin.jvm.internal.i.f(optString4, "it.optString(\"sub_text_1\")");
                            String optString5 = jSONObject2.optString("sub_text_2");
                            kotlin.jvm.internal.i.f(optString5, "it.optString(\"sub_text_2\")");
                            s0Var.J(optString3, optString4, optString5);
                            Bundle bundle = new Bundle();
                            bundle.putString("promo_code", obj);
                            bundle.putString("screen", s0Var.C);
                            gk.a.b(bundle, "dynamic_promo_code_success");
                        } else {
                            Utils.INSTANCE.showCustomToast(s0Var.getActivity(), "Discount already exists!");
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("promo_code", obj);
                            bundle2.putString("error", "Discount already exists!");
                            bundle2.putString("screen", s0Var.C);
                            gk.a.b(bundle2, "dynamic_promo_code_failure");
                        }
                    } else {
                        Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "Oops... Something went wrong. Please try again!");
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("promo_code", obj);
                        bundle3.putString("error", "Oops... Something went wrong. Please try again!");
                        bundle3.putString("screen", s0Var.C);
                        gk.a.b(bundle3, "dynamic_promo_code_failure");
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, e10);
            }
        } else {
            String obj2 = editText.getText().toString();
            try {
                if (s0Var.isAdded()) {
                    if (volleyError2 != null && (iVar = volleyError2.f5870u) != null) {
                        byte[] bArr = iVar.f13769b;
                        kotlin.jvm.internal.i.f(bArr, "error.networkResponse.data");
                        JSONObject jSONObject3 = new JSONObject(new String(bArr, gv.a.f16927b));
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("promo_code", obj2);
                        if (jSONObject3.opt("status") != null) {
                            str = jSONObject3.optString("status");
                        } else {
                            str = "";
                        }
                        bundle4.putString("error", str);
                        bundle4.putString("screen", s0Var.C);
                        gk.a.b(bundle4, "dynamic_promo_code_failure");
                        Object opt = jSONObject3.opt("status");
                        if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_CONSUMED)) {
                            Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "You have already used this coupon code.");
                        } else if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_EXPIRED)) {
                            Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "Sorry, this coupon code has expired...");
                        } else if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_WRONG_PROMO_CODE)) {
                            Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "Invalid coupon code. Please try again!");
                        } else {
                            Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "Oops... Something went wrong. Please try again!");
                        }
                    } else {
                        Utils.INSTANCE.showCustomToast(s0Var.requireActivity(), "Oops... Something went wrong. Please try again!");
                    }
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, e11);
            }
        }
        return hs.k.f19476a;
    }
}
