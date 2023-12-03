package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: FragmentReworkSignupDefaultBinding.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollView f38783a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f38784b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f38785c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f38786d;

    /* renamed from: e  reason: collision with root package name */
    public final RobertoTextView f38787e;
    public final AppCompatImageView f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatImageView f38788g;

    /* renamed from: h  reason: collision with root package name */
    public final l f38789h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f38790i;

    /* renamed from: j  reason: collision with root package name */
    public final RobertoTextView f38791j;

    /* renamed from: k  reason: collision with root package name */
    public final RobertoTextView f38792k;

    /* renamed from: l  reason: collision with root package name */
    public final RobertoTextView f38793l;

    /* renamed from: m  reason: collision with root package name */
    public final RobertoTextView f38794m;

    /* renamed from: n  reason: collision with root package name */
    public final RobertoTextView f38795n;

    /* renamed from: o  reason: collision with root package name */
    public final RobertoTextView f38796o;

    /* renamed from: p  reason: collision with root package name */
    public final RobertoTextView f38797p;

    /* renamed from: q  reason: collision with root package name */
    public final RobertoTextView f38798q;
    public final View r;

    /* renamed from: s  reason: collision with root package name */
    public final View f38799s;

    /* renamed from: t  reason: collision with root package name */
    public final View f38800t;

    public g(ScrollView scrollView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RobertoTextView robertoTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, l lVar, LinearLayout linearLayout, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3, RobertoTextView robertoTextView4, RobertoTextView robertoTextView5, RobertoTextView robertoTextView6, RobertoTextView robertoTextView7, RobertoTextView robertoTextView8, RobertoTextView robertoTextView9, View view, View view2, View view3) {
        this.f38783a = scrollView;
        this.f38784b = constraintLayout;
        this.f38785c = constraintLayout2;
        this.f38786d = constraintLayout3;
        this.f38787e = robertoTextView;
        this.f = appCompatImageView;
        this.f38788g = appCompatImageView2;
        this.f38789h = lVar;
        this.f38790i = linearLayout;
        this.f38791j = robertoTextView2;
        this.f38792k = robertoTextView3;
        this.f38793l = robertoTextView4;
        this.f38794m = robertoTextView5;
        this.f38795n = robertoTextView6;
        this.f38796o = robertoTextView7;
        this.f38797p = robertoTextView8;
        this.f38798q = robertoTextView9;
        this.r = view;
        this.f38799s = view2;
        this.f38800t = view3;
    }

    public static g a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rework_signup_default, (ViewGroup) null, false);
        int i6 = R.id.btnSignUpFacebook;
        ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.btnSignUpFacebook, inflate);
        if (constraintLayout != null) {
            i6 = R.id.btnSignUpFacebookImage;
            if (((AppCompatImageView) hc.d.w(R.id.btnSignUpFacebookImage, inflate)) != null) {
                i6 = R.id.btnSignUpFacebookText;
                if (((RobertoTextView) hc.d.w(R.id.btnSignUpFacebookText, inflate)) != null) {
                    i6 = R.id.btnSignUpGoogle;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.btnSignUpGoogle, inflate);
                    if (constraintLayout2 != null) {
                        i6 = R.id.btnSignUpGoogleImage;
                        if (((AppCompatImageView) hc.d.w(R.id.btnSignUpGoogleImage, inflate)) != null) {
                            i6 = R.id.btnSignUpGoogleText;
                            if (((RobertoTextView) hc.d.w(R.id.btnSignUpGoogleText, inflate)) != null) {
                                i6 = R.id.clSignUpBrandingContainer;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) hc.d.w(R.id.clSignUpBrandingContainer, inflate);
                                if (constraintLayout3 != null) {
                                    i6 = R.id.confidentialityTips;
                                    RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.confidentialityTips, inflate);
                                    if (robertoTextView != null) {
                                        i6 = R.id.guideline15;
                                        if (((Guideline) hc.d.w(R.id.guideline15, inflate)) != null) {
                                            i6 = R.id.guideline85;
                                            if (((Guideline) hc.d.w(R.id.guideline85, inflate)) != null) {
                                                i6 = R.id.ivSignUpBrandingOrgImage;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSignUpBrandingOrgImage, inflate);
                                                if (appCompatImageView != null) {
                                                    i6 = R.id.ivSignupSSOCTAIcon;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivSignupSSOCTAIcon, inflate);
                                                    if (appCompatImageView2 != null) {
                                                        i6 = R.id.layoutSignupEmailContainer;
                                                        View w10 = hc.d.w(R.id.layoutSignupEmailContainer, inflate);
                                                        if (w10 != null) {
                                                            l a10 = l.a(w10);
                                                            i6 = R.id.llSocialSignUpContainer;
                                                            LinearLayout linearLayout = (LinearLayout) hc.d.w(R.id.llSocialSignUpContainer, inflate);
                                                            if (linearLayout != null) {
                                                                i6 = R.id.signUpBlankSpace;
                                                                if (hc.d.w(R.id.signUpBlankSpace, inflate) != null) {
                                                                    i6 = R.id.tvPolicy;
                                                                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvPolicy, inflate);
                                                                    if (robertoTextView2 != null) {
                                                                        i6 = R.id.tvSignUpBrandingSubTitle;
                                                                        RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvSignUpBrandingSubTitle, inflate);
                                                                        if (robertoTextView3 != null) {
                                                                            i6 = R.id.tvSignUpBrandingTitle;
                                                                            RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.tvSignUpBrandingTitle, inflate);
                                                                            if (robertoTextView4 != null) {
                                                                                i6 = R.id.tvSignUpDividerText;
                                                                                RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvSignUpDividerText, inflate);
                                                                                if (robertoTextView5 != null) {
                                                                                    i6 = R.id.tvSignUpTitle;
                                                                                    RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvSignUpTitle, inflate);
                                                                                    if (robertoTextView6 != null) {
                                                                                        i6 = R.id.tvSignUpTitleAlternateBottom;
                                                                                        RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvSignUpTitleAlternateBottom, inflate);
                                                                                        if (robertoTextView7 != null) {
                                                                                            i6 = R.id.tvSignupSSOCTAText;
                                                                                            RobertoTextView robertoTextView8 = (RobertoTextView) hc.d.w(R.id.tvSignupSSOCTAText, inflate);
                                                                                            if (robertoTextView8 != null) {
                                                                                                i6 = R.id.tvTerms;
                                                                                                RobertoTextView robertoTextView9 = (RobertoTextView) hc.d.w(R.id.tvTerms, inflate);
                                                                                                if (robertoTextView9 != null) {
                                                                                                    i6 = R.id.viewSignUpDivider1;
                                                                                                    View w11 = hc.d.w(R.id.viewSignUpDivider1, inflate);
                                                                                                    if (w11 != null) {
                                                                                                        i6 = R.id.viewSignUpDivider2;
                                                                                                        View w12 = hc.d.w(R.id.viewSignUpDivider2, inflate);
                                                                                                        if (w12 != null) {
                                                                                                            i6 = R.id.viewSignupSSOCTA;
                                                                                                            View w13 = hc.d.w(R.id.viewSignupSSOCTA, inflate);
                                                                                                            if (w13 != null) {
                                                                                                                return new g((ScrollView) inflate, constraintLayout, constraintLayout2, constraintLayout3, robertoTextView, appCompatImageView, appCompatImageView2, a10, linearLayout, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, robertoTextView8, robertoTextView9, w11, w12, w13);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
