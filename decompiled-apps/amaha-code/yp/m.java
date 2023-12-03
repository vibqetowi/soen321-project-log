package yp;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: LayoutSignupPhoneBinding.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final RobertoButton f38864a;

    /* renamed from: b  reason: collision with root package name */
    public final RobertoEditText f38865b;

    /* renamed from: c  reason: collision with root package name */
    public final RobertoEditText f38866c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f38867d;

    /* renamed from: e  reason: collision with root package name */
    public final TextInputLayout f38868e;
    public final TextInputLayout f;

    /* renamed from: g  reason: collision with root package name */
    public final RobertoTextView f38869g;

    /* renamed from: h  reason: collision with root package name */
    public final RobertoTextView f38870h;

    /* renamed from: i  reason: collision with root package name */
    public final RobertoTextView f38871i;

    /* renamed from: j  reason: collision with root package name */
    public final RobertoTextView f38872j;

    /* renamed from: k  reason: collision with root package name */
    public final RobertoTextView f38873k;

    public m(RobertoButton robertoButton, RobertoEditText robertoEditText, RobertoEditText robertoEditText2, AppCompatImageView appCompatImageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, RobertoTextView robertoTextView, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3, RobertoTextView robertoTextView4, RobertoTextView robertoTextView5) {
        this.f38864a = robertoButton;
        this.f38865b = robertoEditText;
        this.f38866c = robertoEditText2;
        this.f38867d = appCompatImageView;
        this.f38868e = textInputLayout;
        this.f = textInputLayout2;
        this.f38869g = robertoTextView;
        this.f38870h = robertoTextView2;
        this.f38871i = robertoTextView3;
        this.f38872j = robertoTextView4;
        this.f38873k = robertoTextView5;
    }

    public static m a(View view) {
        int i6 = R.id.btnSignUpPhoneCreateAccount;
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnSignUpPhoneCreateAccount, view);
        if (robertoButton != null) {
            i6 = R.id.etSignUpPhoneName;
            RobertoEditText robertoEditText = (RobertoEditText) hc.d.w(R.id.etSignUpPhoneName, view);
            if (robertoEditText != null) {
                i6 = R.id.etSignUpPhoneNumber;
                RobertoEditText robertoEditText2 = (RobertoEditText) hc.d.w(R.id.etSignUpPhoneNumber, view);
                if (robertoEditText2 != null) {
                    i6 = R.id.ivSignupPhoneCTAIcon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSignupPhoneCTAIcon, view);
                    if (appCompatImageView != null) {
                        i6 = R.id.tilSignUpPhoneName;
                        TextInputLayout textInputLayout = (TextInputLayout) hc.d.w(R.id.tilSignUpPhoneName, view);
                        if (textInputLayout != null) {
                            i6 = R.id.tilSignUpPhoneNumber;
                            TextInputLayout textInputLayout2 = (TextInputLayout) hc.d.w(R.id.tilSignUpPhoneNumber, view);
                            if (textInputLayout2 != null) {
                                i6 = R.id.tvSignUpPhoneCountryCode;
                                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvSignUpPhoneCountryCode, view);
                                if (robertoTextView != null) {
                                    i6 = R.id.tvSignUpPhoneNameError;
                                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvSignUpPhoneNameError, view);
                                    if (robertoTextView2 != null) {
                                        i6 = R.id.tvSignUpPhoneNumberError;
                                        RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvSignUpPhoneNumberError, view);
                                        if (robertoTextView3 != null) {
                                            i6 = R.id.tvSignupPhoneCTAText;
                                            RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvSignupPhoneCTAText, view);
                                            if (robertoTextView4 != null) {
                                                i6 = R.id.tvSignupPhoneTitle;
                                                RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvSignupPhoneTitle, view);
                                                if (robertoTextView5 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                    return new m(robertoButton, robertoEditText, robertoEditText2, appCompatImageView, textInputLayout, textInputLayout2, robertoTextView, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5);
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
