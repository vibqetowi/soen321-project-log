package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: FragmentReworkSignupBinding.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38767a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f38768b;

    /* renamed from: c  reason: collision with root package name */
    public final View f38769c;

    /* renamed from: d  reason: collision with root package name */
    public final View f38770d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f38771e;
    public final ConstraintLayout f;

    /* renamed from: g  reason: collision with root package name */
    public final RobertoTextView f38772g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatImageView f38773h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f38774i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f38775j;

    /* renamed from: k  reason: collision with root package name */
    public final View f38776k;

    /* renamed from: l  reason: collision with root package name */
    public final RobertoTextView f38777l;

    /* renamed from: m  reason: collision with root package name */
    public final RobertoTextView f38778m;

    /* renamed from: n  reason: collision with root package name */
    public final RobertoTextView f38779n;

    /* renamed from: o  reason: collision with root package name */
    public final RobertoTextView f38780o;

    /* renamed from: p  reason: collision with root package name */
    public final RobertoTextView f38781p;

    /* renamed from: q  reason: collision with root package name */
    public final RobertoTextView f38782q;

    public /* synthetic */ f(ScrollView scrollView, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RobertoTextView robertoTextView, Guideline guideline, AppCompatImageView appCompatImageView, l lVar, m mVar, LinearLayout linearLayout, RobertoTextView robertoTextView2, RobertoTextView robertoTextView3, RobertoTextView robertoTextView4, RobertoTextView robertoTextView5, RobertoTextView robertoTextView6, RobertoTextView robertoTextView7, int i6) {
        this.f38767a = i6;
        this.f38768b = scrollView;
        this.f38769c = appCompatImageButton;
        this.f38770d = appCompatImageButton2;
        this.f38771e = constraintLayout;
        this.f = constraintLayout2;
        this.f38772g = robertoTextView;
        this.f38773h = appCompatImageView;
        this.f38774i = lVar;
        this.f38775j = mVar;
        this.f38776k = linearLayout;
        this.f38777l = robertoTextView2;
        this.f38778m = robertoTextView3;
        this.f38779n = robertoTextView4;
        this.f38780o = robertoTextView5;
        this.f38781p = robertoTextView6;
        this.f38782q = robertoTextView7;
    }

    public static f b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rework_signup, (ViewGroup) null, false);
        int i6 = R.id.btnSignUpFacebook;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) hc.d.w(R.id.btnSignUpFacebook, inflate);
        if (appCompatImageButton != null) {
            i6 = R.id.btnSignUpGoogle;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) hc.d.w(R.id.btnSignUpGoogle, inflate);
            if (appCompatImageButton2 != null) {
                i6 = R.id.btnSignUpSSO;
                ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.btnSignUpSSO, inflate);
                if (constraintLayout != null) {
                    i6 = R.id.clSignUpBrandingContainer;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.clSignUpBrandingContainer, inflate);
                    if (constraintLayout2 != null) {
                        i6 = R.id.confidentialityTips;
                        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.confidentialityTips, inflate);
                        if (robertoTextView != null) {
                            i6 = R.id.guideline15;
                            if (((Guideline) hc.d.w(R.id.guideline15, inflate)) != null) {
                                i6 = R.id.guideline85;
                                Guideline guideline = (Guideline) hc.d.w(R.id.guideline85, inflate);
                                if (guideline != null) {
                                    i6 = R.id.ivSignUpBrandingOrgImage;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSignUpBrandingOrgImage, inflate);
                                    if (appCompatImageView != null) {
                                        i6 = R.id.ivSignupSSOIcon;
                                        if (((AppCompatImageView) hc.d.w(R.id.ivSignupSSOIcon, inflate)) != null) {
                                            i6 = R.id.layoutSignupEmailContainer;
                                            View w10 = hc.d.w(R.id.layoutSignupEmailContainer, inflate);
                                            if (w10 != null) {
                                                l a10 = l.a(w10);
                                                i6 = R.id.layoutSignupPhoneContainer;
                                                View w11 = hc.d.w(R.id.layoutSignupPhoneContainer, inflate);
                                                if (w11 != null) {
                                                    m a11 = m.a(w11);
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
                                                                        if (((RobertoTextView) hc.d.w(R.id.tvSignUpDividerText, inflate)) != null) {
                                                                            i6 = R.id.tvSignUpTitle;
                                                                            RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvSignUpTitle, inflate);
                                                                            if (robertoTextView5 != null) {
                                                                                i6 = R.id.tvSignUpTitleAlternateBottom;
                                                                                RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvSignUpTitleAlternateBottom, inflate);
                                                                                if (robertoTextView6 != null) {
                                                                                    i6 = R.id.tvSignupSSOText;
                                                                                    if (((RobertoTextView) hc.d.w(R.id.tvSignupSSOText, inflate)) != null) {
                                                                                        i6 = R.id.tvTerms;
                                                                                        RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvTerms, inflate);
                                                                                        if (robertoTextView7 != null) {
                                                                                            return new f((ScrollView) inflate, appCompatImageButton, appCompatImageButton2, constraintLayout, constraintLayout2, robertoTextView, guideline, appCompatImageView, a10, a11, linearLayout, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, 0);
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

    public static f c(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rework_signup_variant_b, (ViewGroup) null, false);
        int i6 = R.id.btnSignUpFacebook;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) hc.d.w(R.id.btnSignUpFacebook, inflate);
        if (appCompatImageButton != null) {
            i6 = R.id.btnSignUpGoogle;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) hc.d.w(R.id.btnSignUpGoogle, inflate);
            if (appCompatImageButton2 != null) {
                i6 = R.id.btnSignUpSSO;
                ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.btnSignUpSSO, inflate);
                if (constraintLayout != null) {
                    i6 = R.id.clSignUpBrandingContainer;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.clSignUpBrandingContainer, inflate);
                    if (constraintLayout2 != null) {
                        i6 = R.id.confidentialityTips;
                        RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.confidentialityTips, inflate);
                        if (robertoTextView != null) {
                            i6 = R.id.guideline15;
                            if (((Guideline) hc.d.w(R.id.guideline15, inflate)) != null) {
                                i6 = R.id.guideline85;
                                Guideline guideline = (Guideline) hc.d.w(R.id.guideline85, inflate);
                                if (guideline != null) {
                                    i6 = R.id.ivSignUpBrandingOrgImage;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSignUpBrandingOrgImage, inflate);
                                    if (appCompatImageView != null) {
                                        i6 = R.id.ivSignupSSOIcon;
                                        if (((AppCompatImageView) hc.d.w(R.id.ivSignupSSOIcon, inflate)) != null) {
                                            i6 = R.id.layoutSignupEmailContainer;
                                            View w10 = hc.d.w(R.id.layoutSignupEmailContainer, inflate);
                                            if (w10 != null) {
                                                l a10 = l.a(w10);
                                                i6 = R.id.layoutSignupPhoneContainer;
                                                View w11 = hc.d.w(R.id.layoutSignupPhoneContainer, inflate);
                                                if (w11 != null) {
                                                    m a11 = m.a(w11);
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
                                                                        if (((RobertoTextView) hc.d.w(R.id.tvSignUpDividerText, inflate)) != null) {
                                                                            i6 = R.id.tvSignUpTitle;
                                                                            RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.tvSignUpTitle, inflate);
                                                                            if (robertoTextView5 != null) {
                                                                                i6 = R.id.tvSignUpTitleAlternateBottom;
                                                                                RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.tvSignUpTitleAlternateBottom, inflate);
                                                                                if (robertoTextView6 != null) {
                                                                                    i6 = R.id.tvSignupSSOText;
                                                                                    if (((RobertoTextView) hc.d.w(R.id.tvSignupSSOText, inflate)) != null) {
                                                                                        i6 = R.id.tvTerms;
                                                                                        RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.tvTerms, inflate);
                                                                                        if (robertoTextView7 != null) {
                                                                                            return new f((ScrollView) inflate, appCompatImageButton, appCompatImageButton2, constraintLayout, constraintLayout2, robertoTextView, guideline, appCompatImageView, a10, a11, linearLayout, robertoTextView2, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, 1);
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

    public final ScrollView a() {
        int i6 = this.f38767a;
        ViewGroup viewGroup = this.f38768b;
        switch (i6) {
            case 0:
                return (ScrollView) viewGroup;
            default:
                return (ScrollView) viewGroup;
        }
    }
}
