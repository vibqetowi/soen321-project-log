package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: FragmentSuggestedActivityDetailsBinding.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f38806a;

    /* renamed from: b  reason: collision with root package name */
    public final ChipGroup f38807b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f38808c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f38809d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f38810e;
    public final HorizontalScrollView f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatImageView f38811g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatImageView f38812h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f38813i;

    /* renamed from: j  reason: collision with root package name */
    public final NestedScrollView f38814j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView f38815k;

    /* renamed from: l  reason: collision with root package name */
    public final ShimmerFrameLayout f38816l;

    /* renamed from: m  reason: collision with root package name */
    public final RobertoTextView f38817m;

    /* renamed from: n  reason: collision with root package name */
    public final RobertoTextView f38818n;

    /* renamed from: o  reason: collision with root package name */
    public final AppCompatImageView f38819o;

    /* renamed from: p  reason: collision with root package name */
    public final RobertoTextView f38820p;

    /* renamed from: q  reason: collision with root package name */
    public final View f38821q;

    public i(ConstraintLayout constraintLayout, ChipGroup chipGroup, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, HorizontalScrollView horizontalScrollView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, NestedScrollView nestedScrollView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, RobertoTextView robertoTextView, RobertoTextView robertoTextView2, AppCompatImageView appCompatImageView3, RobertoTextView robertoTextView3, View view) {
        this.f38806a = constraintLayout;
        this.f38807b = chipGroup;
        this.f38808c = constraintLayout2;
        this.f38809d = constraintLayout3;
        this.f38810e = constraintLayout4;
        this.f = horizontalScrollView;
        this.f38811g = appCompatImageView;
        this.f38812h = appCompatImageView2;
        this.f38813i = linearLayout;
        this.f38814j = nestedScrollView;
        this.f38815k = recyclerView;
        this.f38816l = shimmerFrameLayout;
        this.f38817m = robertoTextView;
        this.f38818n = robertoTextView2;
        this.f38819o = appCompatImageView3;
        this.f38820p = robertoTextView3;
        this.f38821q = view;
    }

    public static i a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.fragment_suggested_activity_details, (ViewGroup) null, false);
        int i6 = R.id.cgSaSymptoms;
        ChipGroup chipGroup = (ChipGroup) hc.d.w(R.id.cgSaSymptoms, inflate);
        if (chipGroup != null) {
            i6 = R.id.clNotV4SuggestedPlanCoachMark;
            ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.clNotV4SuggestedPlanCoachMark, inflate);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                i6 = R.id.clSaDetailsView;
                if (((ConstraintLayout) hc.d.w(R.id.clSaDetailsView, inflate)) != null) {
                    i6 = R.id.clSuggestedActivityRecyclerLoader;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) hc.d.w(R.id.clSuggestedActivityRecyclerLoader, inflate);
                    if (constraintLayout3 != null) {
                        i6 = R.id.hsvSaSymptomsContainer;
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) hc.d.w(R.id.hsvSaSymptomsContainer, inflate);
                        if (horizontalScrollView != null) {
                            i6 = R.id.ivRowSACLoaderParentActivityStatus1;
                            if (((ShimmerFrameLayout) hc.d.w(R.id.ivRowSACLoaderParentActivityStatus1, inflate)) != null) {
                                i6 = R.id.ivRowSACLoaderParentActivityStatus2;
                                if (((ShimmerFrameLayout) hc.d.w(R.id.ivRowSACLoaderParentActivityStatus2, inflate)) != null) {
                                    i6 = R.id.ivRowSACLoaderParentActivityStatus3;
                                    if (((ShimmerFrameLayout) hc.d.w(R.id.ivRowSACLoaderParentActivityStatus3, inflate)) != null) {
                                        i6 = R.id.ivSaAssessmentResult;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.ivSaAssessmentResult, inflate);
                                        if (appCompatImageView != null) {
                                            i6 = R.id.ivSaBack;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.ivSaBack, inflate);
                                            if (appCompatImageView2 != null) {
                                                i6 = R.id.llSuggestedActivityLoaderChips;
                                                LinearLayout linearLayout = (LinearLayout) hc.d.w(R.id.llSuggestedActivityLoaderChips, inflate);
                                                if (linearLayout != null) {
                                                    i6 = R.id.nsvSaParentScrollContainer;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) hc.d.w(R.id.nsvSaParentScrollContainer, inflate);
                                                    if (nestedScrollView != null) {
                                                        i6 = R.id.rvSaRecycler;
                                                        RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.rvSaRecycler, inflate);
                                                        if (recyclerView != null) {
                                                            i6 = R.id.sflSuggestedActivityDescriptionLoader;
                                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) hc.d.w(R.id.sflSuggestedActivityDescriptionLoader, inflate);
                                                            if (shimmerFrameLayout != null) {
                                                                i6 = R.id.tvNotV4SuggestedPlanCoachMark;
                                                                if (((RobertoTextView) hc.d.w(R.id.tvNotV4SuggestedPlanCoachMark, inflate)) != null) {
                                                                    i6 = R.id.tvRowSACLoaderParentActivityHeader1;
                                                                    if (((ShimmerFrameLayout) hc.d.w(R.id.tvRowSACLoaderParentActivityHeader1, inflate)) != null) {
                                                                        i6 = R.id.tvRowSACLoaderParentActivityHeader2;
                                                                        if (((ShimmerFrameLayout) hc.d.w(R.id.tvRowSACLoaderParentActivityHeader2, inflate)) != null) {
                                                                            i6 = R.id.tvRowSACLoaderParentActivityHeader3;
                                                                            if (((ShimmerFrameLayout) hc.d.w(R.id.tvRowSACLoaderParentActivityHeader3, inflate)) != null) {
                                                                                i6 = R.id.tvRowSACLoaderParentActivitySubHeader1;
                                                                                if (((ShimmerFrameLayout) hc.d.w(R.id.tvRowSACLoaderParentActivitySubHeader1, inflate)) != null) {
                                                                                    i6 = R.id.tvRowSACLoaderParentActivitySubHeader2;
                                                                                    if (((ShimmerFrameLayout) hc.d.w(R.id.tvRowSACLoaderParentActivitySubHeader2, inflate)) != null) {
                                                                                        i6 = R.id.tvRowSACLoaderParentActivitySubHeader3;
                                                                                        if (((ShimmerFrameLayout) hc.d.w(R.id.tvRowSACLoaderParentActivitySubHeader3, inflate)) != null) {
                                                                                            i6 = R.id.tvRowSaImageContainer;
                                                                                            if (((CardView) hc.d.w(R.id.tvRowSaImageContainer, inflate)) != null) {
                                                                                                i6 = R.id.tvSaDescription;
                                                                                                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.tvSaDescription, inflate);
                                                                                                if (robertoTextView != null) {
                                                                                                    i6 = R.id.tvSaHeader;
                                                                                                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvSaHeader, inflate);
                                                                                                    if (robertoTextView2 != null) {
                                                                                                        i6 = R.id.tvSaImage;
                                                                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.tvSaImage, inflate);
                                                                                                        if (appCompatImageView3 != null) {
                                                                                                            i6 = R.id.tvSaPremiumTag;
                                                                                                            RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvSaPremiumTag, inflate);
                                                                                                            if (robertoTextView3 != null) {
                                                                                                                i6 = R.id.viewPremiumTagDivider;
                                                                                                                View w10 = hc.d.w(R.id.viewPremiumTagDivider, inflate);
                                                                                                                if (w10 != null) {
                                                                                                                    i6 = R.id.viewSaHeaderBackground;
                                                                                                                    if (hc.d.w(R.id.viewSaHeaderBackground, inflate) != null) {
                                                                                                                        i6 = R.id.viewSaHeaderBottom;
                                                                                                                        if (hc.d.w(R.id.viewSaHeaderBottom, inflate) != null) {
                                                                                                                            return new i(constraintLayout2, chipGroup, constraintLayout, constraintLayout2, constraintLayout3, horizontalScrollView, appCompatImageView, appCompatImageView2, linearLayout, nestedScrollView, recyclerView, shimmerFrameLayout, robertoTextView, robertoTextView2, appCompatImageView3, robertoTextView3, w10);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
