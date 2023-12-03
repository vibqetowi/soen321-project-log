package yp;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: LayoutSignupEmailBinding.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final RobertoButton f38847a;

    /* renamed from: b  reason: collision with root package name */
    public final RobertoEditText f38848b;

    /* renamed from: c  reason: collision with root package name */
    public final RobertoEditText f38849c;

    /* renamed from: d  reason: collision with root package name */
    public final RobertoEditText f38850d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f38851e;
    public final AppCompatImageView f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatImageView f38852g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f38853h;

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout f38854i;

    /* renamed from: j  reason: collision with root package name */
    public final TextInputLayout f38855j;

    /* renamed from: k  reason: collision with root package name */
    public final RobertoTextView f38856k;

    /* renamed from: l  reason: collision with root package name */
    public final RobertoTextView f38857l;

    /* renamed from: m  reason: collision with root package name */
    public final RobertoTextView f38858m;

    /* renamed from: n  reason: collision with root package name */
    public final RobertoTextView f38859n;

    /* renamed from: o  reason: collision with root package name */
    public final RobertoTextView f38860o;

    /* renamed from: p  reason: collision with root package name */
    public final RobertoTextView f38861p;

    /* renamed from: q  reason: collision with root package name */
    public final RobertoTextView f38862q;
    public final RobertoTextView r;

    /* renamed from: s  reason: collision with root package name */
    public final RobertoTextView f38863s;

    public l(RobertoButton robertoButton, RobertoEditText robertoEditText, RobertoEditText robertoEditText2, RobertoEditText robertoEditText3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, RobertoTextView robertoTextView, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3, RobertoTextView robertoTextView4, RobertoTextView robertoTextView5, RobertoTextView robertoTextView6, RobertoTextView robertoTextView7, RobertoTextView robertoTextView8, RobertoTextView robertoTextView9) {
        this.f38847a = robertoButton;
        this.f38848b = robertoEditText;
        this.f38849c = robertoEditText2;
        this.f38850d = robertoEditText3;
        this.f38851e = appCompatImageView;
        this.f = appCompatImageView2;
        this.f38852g = appCompatImageView3;
        this.f38853h = textInputLayout;
        this.f38854i = textInputLayout2;
        this.f38855j = textInputLayout3;
        this.f38856k = robertoTextView;
        this.f38857l = robertoTextView2;
        this.f38858m = robertoTextView3;
        this.f38859n = robertoTextView4;
        this.f38860o = robertoTextView5;
        this.f38861p = robertoTextView6;
        this.f38862q = robertoTextView7;
        this.r = robertoTextView8;
        this.f38863s = robertoTextView9;
    }

    public static l a(View view) {
        int i6 = R.id.btnSignUpEmailCreateAccount;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnSignUpEmailCreateAccount, view);
        if (robertoButton != null) {
            i6 = R.id.etSignUpEmail;
            RobertoEditText robertoEditText = (RobertoEditText) hc.d.w(R.id.etSignUpEmail, view);
            if (robertoEditText != null) {
                i6 = R.id.etSignUpEmailName;
                RobertoEditText robertoEditText2 = (RobertoEditText) hc.d.w(R.id.etSignUpEmailName, view);
                if (robertoEditText2 != null) {
                    i6 = R.id.etSignUpPassword;
                    RobertoEditText robertoEditText3 = (RobertoEditText) hc.d.w(R.id.etSignUpPassword, view);
                    if (robertoEditText3 != null) {
                        i6 = R.id.ivSignUpPasswordRule1;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSignUpPasswordRule1, view);
                        if (appCompatImageView != null) {
                            i6 = R.id.ivSignUpPasswordRule2;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivSignUpPasswordRule2, view);
                            if (appCompatImageView2 != null) {
                                i6 = R.id.ivSignupEmailCTAIcon;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.ivSignupEmailCTAIcon, view);
                                if (appCompatImageView3 != null) {
                                    i6 = R.id.tilSignUpEmail;
                                    TextInputLayout textInputLayout = (TextInputLayout) hc.d.w(R.id.tilSignUpEmail, view);
                                    if (textInputLayout != null) {
                                        i6 = R.id.tilSignUpEmailName;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) hc.d.w(R.id.tilSignUpEmailName, view);
                                        if (textInputLayout2 != null) {
                                            i6 = R.id.tilSignUpPassword;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) hc.d.w(R.id.tilSignUpPassword, view);
                                            if (textInputLayout3 != null) {
                                                i6 = R.id.tvLoginForgotPassword;
                                                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvLoginForgotPassword, view);
                                                if (robertoTextView != null) {
                                                    i6 = R.id.tvSignUpEmailError;
                                                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvSignUpEmailError, view);
                                                    if (robertoTextView2 != null) {
                                                        i6 = R.id.tvSignUpEmailNameError;
                                                        RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvSignUpEmailNameError, view);
                                                        if (robertoTextView3 != null) {
                                                            i6 = R.id.tvSignUpPasswordError;
                                                            RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvSignUpPasswordError, view);
                                                            if (robertoTextView4 != null) {
                                                                i6 = R.id.tvSignUpPasswordRule1;
                                                                RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvSignUpPasswordRule1, view);
                                                                if (robertoTextView5 != null) {
                                                                    i6 = R.id.tvSignUpPasswordRule2;
                                                                    RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvSignUpPasswordRule2, view);
                                                                    if (robertoTextView6 != null) {
                                                                        i6 = R.id.tvSignUpPasswordRulesPrompt;
                                                                        RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvSignUpPasswordRulesPrompt, view);
                                                                        if (robertoTextView7 != null) {
                                                                            i6 = R.id.tvSignupEmailCTAText;
                                                                            RobertoTextView robertoTextView8 = (RobertoTextView) hc.d.w(R.id.tvSignupEmailCTAText, view);
                                                                            if (robertoTextView8 != null) {
                                                                                i6 = R.id.tvSignupEmailTitle;
                                                                                RobertoTextView robertoTextView9 = (RobertoTextView) hc.d.w(R.id.tvSignupEmailTitle, view);
                                                                                if (robertoTextView9 != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                                    return new l(robertoButton, robertoEditText, robertoEditText2, robertoEditText3, appCompatImageView, appCompatImageView2, appCompatImageView3, textInputLayout, textInputLayout2, textInputLayout3, robertoTextView, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, robertoTextView8, robertoTextView9);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }
}
