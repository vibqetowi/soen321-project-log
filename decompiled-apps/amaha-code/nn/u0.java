package nn;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.volley.VolleyError;
import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONObject;
/* compiled from: CC2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnn/u0;", "Lrn/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u0 extends rn.b {
    public static final /* synthetic */ int C = 0;

    /* renamed from: z  reason: collision with root package name */
    public String f26622z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26619w = LogHelper.INSTANCE.makeLogTag(u0.class);

    /* renamed from: x  reason: collision with root package name */
    public String f26620x = "";

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26621y = new ArrayList<>();
    public String A = "";

    /* compiled from: CC2Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.q<Boolean, JSONObject, VolleyError, hs.k> {
        public a() {
            super(3);
        }

        @Override // ss.q
        public final hs.k invoke(Boolean bool, JSONObject jSONObject, VolleyError volleyError) {
            e4.i iVar;
            String str;
            boolean booleanValue = bool.booleanValue();
            JSONObject jSONObject2 = jSONObject;
            VolleyError volleyError2 = volleyError;
            u0 u0Var = u0.this;
            u0Var.F().Q(false);
            String str2 = u0Var.f26619w;
            if (booleanValue) {
                String valueOf = String.valueOf(((RobertoEditText) u0Var._$_findCachedViewById(R.id.editTextCoupon)).getText());
                try {
                    if (u0Var.isAdded() && jSONObject2 != null) {
                        if (kotlin.jvm.internal.i.b(jSONObject2.opt("status"), Constants.COUPON_STATE_APPLIED)) {
                            if ((!u0Var.f26621y.isEmpty()) && u0Var.f26621y.contains(jSONObject2.optString("sku"))) {
                                Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "You have already used this coupon code.");
                            } else if (kotlin.jvm.internal.i.b(jSONObject2.optString("sku"), Constants.SUBSCRIPTION_BASIC_FREE)) {
                                Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "Coupon code successfully applied!");
                                rn.d F = u0Var.F();
                                String optString = jSONObject2.optString("coupon_id");
                                kotlin.jvm.internal.i.f(optString, "it.optString(\"coupon_id\")");
                                String optString2 = jSONObject2.optString("sku");
                                kotlin.jvm.internal.i.f(optString2, "it.optString(\"sku\")");
                                F.K(optString, optString2, true);
                                ((ConstraintLayout) u0Var._$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(0);
                                String optString3 = jSONObject2.optString("title");
                                kotlin.jvm.internal.i.f(optString3, "it.optString(\"title\")");
                                String optString4 = jSONObject2.optString("sub_text_1");
                                kotlin.jvm.internal.i.f(optString4, "it.optString(\"sub_text_1\")");
                                String optString5 = jSONObject2.optString("sub_text_2");
                                kotlin.jvm.internal.i.f(optString5, "it.optString(\"sub_text_2\")");
                                u0Var.J(optString3, optString4, optString5);
                                Bundle bundle = new Bundle();
                                bundle.putString("promo_code", valueOf);
                                bundle.putString("screen", u0Var.A);
                                gk.a.b(bundle, "dynamic_promo_code_success");
                            } else {
                                Utils.INSTANCE.showCustomToast(u0Var.getActivity(), "Discount already exists!");
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("promo_code", valueOf);
                                bundle2.putString("error", "Discount already exists!");
                                bundle2.putString("screen", u0Var.A);
                                gk.a.b(bundle2, "dynamic_promo_code_failure");
                            }
                        } else {
                            Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "Oops... Something went wrong. Please try again!");
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("promo_code", valueOf);
                            bundle3.putString("error", "Oops... Something went wrong. Please try again!");
                            bundle3.putString("screen", u0Var.A);
                            gk.a.b(bundle3, "dynamic_promo_code_failure");
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str2, e10);
                }
            } else {
                String valueOf2 = String.valueOf(((RobertoEditText) u0Var._$_findCachedViewById(R.id.editTextCoupon)).getText());
                try {
                    if (u0Var.isAdded()) {
                        if (volleyError2 != null && (iVar = volleyError2.f5870u) != null) {
                            byte[] bArr = iVar.f13769b;
                            kotlin.jvm.internal.i.f(bArr, "error.networkResponse.data");
                            JSONObject jSONObject3 = new JSONObject(new String(bArr, gv.a.f16927b));
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("promo_code", valueOf2);
                            if (jSONObject3.opt("status") != null) {
                                str = jSONObject3.optString("status");
                            } else {
                                str = "";
                            }
                            bundle4.putString("error", str);
                            bundle4.putString("screen", u0Var.A);
                            gk.a.b(bundle4, "dynamic_promo_code_failure");
                            Object opt = jSONObject3.opt("status");
                            if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_CONSUMED)) {
                                Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "You have already used this coupon code.");
                            } else if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_EXPIRED)) {
                                Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "Sorry, this coupon code has expired...");
                            } else if (kotlin.jvm.internal.i.b(opt, Constants.COUPON_STATE_WRONG_PROMO_CODE)) {
                                Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "Invalid coupon code. Please try again!");
                            } else {
                                Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "Oops... Something went wrong. Please try again!");
                            }
                        } else {
                            Utils.INSTANCE.showCustomToast(u0Var.requireActivity(), "Oops... Something went wrong. Please try again!");
                        }
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str2, e11);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100 A[Catch: Exception -> 0x0103, TRY_LEAVE, TryCatch #0 {Exception -> 0x0103, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001c, B:17:0x002d, B:18:0x0039, B:20:0x0041, B:29:0x0051, B:30:0x0053, B:32:0x005b, B:41:0x006b, B:42:0x007d, B:44:0x0085, B:54:0x0098, B:55:0x00a9, B:57:0x00b1, B:66:0x00c1, B:67:0x00d2, B:69:0x00da, B:78:0x00ea, B:79:0x00ec, B:81:0x00f4, B:87:0x0100), top: B:92:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        String string;
        boolean z11;
        String string2;
        boolean z12;
        String string3;
        boolean z13;
        String string4;
        boolean z14;
        String string5;
        boolean z15;
        String string6;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f26621y = F().J();
                String string7 = arguments.getString("cc2_help", "");
                boolean z16 = false;
                if (string7 != null && string7.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string7 = null;
                    }
                    if (string7 != null) {
                        ((TextInputLayout) _$_findCachedViewById(R.id.couponDialogEditText)).setHint(string7);
                    }
                    string = arguments.getString("cc2_free_asset", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            this.f26620x = string;
                        }
                        string2 = arguments.getString("cc2_underline_color", "");
                        if (string2 != null && string2.length() != 0) {
                            z12 = false;
                            if (!z12) {
                                string2 = null;
                            }
                            if (string2 != null) {
                                _$_findCachedViewById(R.id.couponDialogEditTextBorder).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(string2)));
                            }
                            string3 = arguments.getString("cc2_arrow_color", "");
                            if (string3 != null && string3.length() != 0) {
                                z13 = false;
                                if (!z13) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    ((AppCompatImageView) _$_findCachedViewById(R.id.campaignApplyCouponCta)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string3)));
                                }
                                string4 = arguments.getString("cc2_arrow_bg_color", "");
                                if (string4 != null && string4.length() != 0) {
                                    z14 = false;
                                    if (!z14) {
                                        string4 = null;
                                    }
                                    if (string4 != null) {
                                        ((AppCompatImageView) _$_findCachedViewById(R.id.campaignApplyCouponCta)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(string4)));
                                    }
                                    string5 = arguments.getString("template_colour", "");
                                    if (string5 != null && string5.length() != 0) {
                                        z15 = false;
                                        if (!z15) {
                                            string5 = null;
                                        }
                                        if (string5 != null) {
                                            this.f26622z = string5;
                                        }
                                        string6 = arguments.getString("screen", "");
                                        if (!((string6 != null || string6.length() == 0) ? true : true)) {
                                            str = string6;
                                        }
                                        if (str == null) {
                                            this.A = str;
                                            return;
                                        }
                                        return;
                                    }
                                    z15 = true;
                                    if (!z15) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("screen", "");
                                    if (!((string6 != null || string6.length() == 0) ? true : true)) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("template_colour", "");
                                if (string5 != null) {
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    if (string5 != null) {
                                    }
                                    string6 = arguments.getString("screen", "");
                                    if (!((string6 != null || string6.length() == 0) ? true : true)) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("screen", "");
                                if (!((string6 != null || string6.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("cc2_arrow_bg_color", "");
                            if (string4 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (string4 != null) {
                                }
                                string5 = arguments.getString("template_colour", "");
                                if (string5 != null) {
                                }
                                z15 = true;
                                if (!z15) {
                                }
                                if (string5 != null) {
                                }
                                string6 = arguments.getString("screen", "");
                                if (!((string6 != null || string6.length() == 0) ? true : true)) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("template_colour", "");
                            if (string5 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("screen", "");
                            if (!((string6 != null || string6.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("cc2_arrow_color", "");
                        if (string3 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (string3 != null) {
                            }
                            string4 = arguments.getString("cc2_arrow_bg_color", "");
                            if (string4 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (string4 != null) {
                            }
                            string5 = arguments.getString("template_colour", "");
                            if (string5 != null) {
                            }
                            z15 = true;
                            if (!z15) {
                            }
                            if (string5 != null) {
                            }
                            string6 = arguments.getString("screen", "");
                            if (!((string6 != null || string6.length() == 0) ? true : true)) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("cc2_arrow_bg_color", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("template_colour", "");
                        if (string5 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("screen", "");
                        if (!((string6 != null || string6.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("cc2_underline_color", "");
                    if (string2 != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (string2 != null) {
                        }
                        string3 = arguments.getString("cc2_arrow_color", "");
                        if (string3 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (string3 != null) {
                        }
                        string4 = arguments.getString("cc2_arrow_bg_color", "");
                        if (string4 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (string4 != null) {
                        }
                        string5 = arguments.getString("template_colour", "");
                        if (string5 != null) {
                        }
                        z15 = true;
                        if (!z15) {
                        }
                        if (string5 != null) {
                        }
                        string6 = arguments.getString("screen", "");
                        if (!((string6 != null || string6.length() == 0) ? true : true)) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("cc2_arrow_color", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("cc2_arrow_bg_color", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("template_colour", "");
                    if (string5 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("screen", "");
                    if (!((string6 != null || string6.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string7 != null) {
                }
                string = arguments.getString("cc2_free_asset", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    string2 = arguments.getString("cc2_underline_color", "");
                    if (string2 != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (string2 != null) {
                    }
                    string3 = arguments.getString("cc2_arrow_color", "");
                    if (string3 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (string3 != null) {
                    }
                    string4 = arguments.getString("cc2_arrow_bg_color", "");
                    if (string4 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (string4 != null) {
                    }
                    string5 = arguments.getString("template_colour", "");
                    if (string5 != null) {
                    }
                    z15 = true;
                    if (!z15) {
                    }
                    if (string5 != null) {
                    }
                    string6 = arguments.getString("screen", "");
                    if (!((string6 != null || string6.length() == 0) ? true : true)) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                string2 = arguments.getString("cc2_underline_color", "");
                if (string2 != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (string2 != null) {
                }
                string3 = arguments.getString("cc2_arrow_color", "");
                if (string3 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (string3 != null) {
                }
                string4 = arguments.getString("cc2_arrow_bg_color", "");
                if (string4 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (string4 != null) {
                }
                string5 = arguments.getString("template_colour", "");
                if (string5 != null) {
                }
                z15 = true;
                if (!z15) {
                }
                if (string5 != null) {
                }
                string6 = arguments.getString("screen", "");
                if (!((string6 != null || string6.length() == 0) ? true : true)) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26619w, e10);
        }
    }

    public final void J(String str, String str2, String str3) {
        try {
            ((TextInputLayout) _$_findCachedViewById(R.id.couponDialogEditText)).setVisibility(8);
            _$_findCachedViewById(R.id.couponDialogEditTextBorder).setVisibility(8);
            ((AppCompatImageView) _$_findCachedViewById(R.id.campaignApplyCouponCta)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.monetizationSchemeButton)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeCouponTitle)).setText(str);
            ((RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeCouponSubText)).setText(str2);
            ((RobertoTextView) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedFreeText)).setText(str3);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeCouponTitle);
            String str4 = this.f26622z;
            if (str4 != null) {
                robertoTextView.setTextColor(Color.parseColor(str4));
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.monetizationFreeCouponSubText);
                String str5 = this.f26622z;
                if (str5 != null) {
                    robertoTextView2.setTextColor(Color.parseColor(str5));
                    if (!kotlin.jvm.internal.i.b(this.f26620x, "")) {
                        Glide.i(requireActivity()).d(new File(requireActivity().getFilesDir(), this.f26620x)).B((AppCompatImageView) _$_findCachedViewById(R.id.monetizationSchemeButtonImage));
                    }
                    ((AppCompatImageView) _$_findCachedViewById(R.id.basicMonetizationCouponAppliedFreeRemove)).setOnClickListener(new t0(this, 1));
                    return;
                }
                kotlin.jvm.internal.i.q("templateColor");
                throw null;
            }
            kotlin.jvm.internal.i.q("templateColor");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26619w, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.B.clear();
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
        return inflater.inflate(R.layout.fragment_cc2, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.editTextCoupon);
            String str = this.f26622z;
            if (str != null) {
                robertoEditText.setTextColor(Color.parseColor(str));
                ((AppCompatImageView) _$_findCachedViewById(R.id.campaignApplyCouponCta)).setOnClickListener(new t0(this, 0));
                F().U();
                return;
            }
            kotlin.jvm.internal.i.q("templateColor");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26619w, e10);
        }
    }
}
