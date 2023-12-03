package fr;

import a3.t;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tl.o;
/* compiled from: PlanExpiryInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfr/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15843v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15844u = new LinkedHashMap();

    public static void J(int i6) {
        Bundle bundle = new Bundle();
        bundle.putInt("itemNo", i6);
        gk.a.b(bundle, "free_feature_know_more_click");
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15844u;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_plan_expiry_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15844u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        String str = gk.a.f16573a;
        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_show");
        if (Build.VERSION.SDK_INT < 25) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim1);
            t tVar = t.SOFTWARE;
            if (lottieAnimationView != null) {
                lottieAnimationView.setRenderMode(tVar);
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim2);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setRenderMode(tVar);
            }
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim3);
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setRenderMode(tVar);
            }
            LottieAnimationView lottieAnimationView4 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim4);
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.setRenderMode(tVar);
            }
            LottieAnimationView lottieAnimationView5 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim5);
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.setRenderMode(tVar);
            }
            LottieAnimationView lottieAnimationView6 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim6);
            if (lottieAnimationView6 != null) {
                lottieAnimationView6.setRenderMode(tVar);
            }
        } else {
            LottieAnimationView lottieAnimationView7 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim1);
            t tVar2 = t.HARDWARE;
            if (lottieAnimationView7 != null) {
                lottieAnimationView7.setRenderMode(tVar2);
            }
            LottieAnimationView lottieAnimationView8 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim2);
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setRenderMode(tVar2);
            }
            LottieAnimationView lottieAnimationView9 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim3);
            if (lottieAnimationView9 != null) {
                lottieAnimationView9.setRenderMode(tVar2);
            }
            LottieAnimationView lottieAnimationView10 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim4);
            if (lottieAnimationView10 != null) {
                lottieAnimationView10.setRenderMode(tVar2);
            }
            LottieAnimationView lottieAnimationView11 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim5);
            if (lottieAnimationView11 != null) {
                lottieAnimationView11.setRenderMode(tVar2);
            }
            LottieAnimationView lottieAnimationView12 = (LottieAnimationView) _$_findCachedViewById(R.id.planExpiryFeatureAnim6);
            if (lottieAnimationView12 != null) {
                lottieAnimationView12.setRenderMode(tVar2);
            }
        }
        ((RobertoButton) _$_findCachedViewById(R.id.commitmentCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
        ((RobertoTextView) _$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setOnClickListener(new View.OnClickListener(this) { // from class: fr.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f15842v;

            {
                this.f15842v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b this$0 = this.f15842v;
                switch (i6) {
                    case 0:
                        int i10 = b.f15843v;
                        i.g(this$0, "this$0");
                        String str2 = gk.a.f16573a;
                        gk.a.b(UtilsKt.getAnalyticsBundle(), "free_feature_cta_click");
                        p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.finish();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody1)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA1)).setText(this$0.getString(R.string.hide));
                        b.J(0);
                        return;
                    case 2:
                        int i12 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody2)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA2)).setText(this$0.getString(R.string.hide));
                        b.J(1);
                        return;
                    case 3:
                        int i13 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody3)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA3)).setText(this$0.getString(R.string.hide));
                        b.J(2);
                        return;
                    case 4:
                        int i14 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody4)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA4)).setText(this$0.getString(R.string.hide));
                        b.J(3);
                        return;
                    case 5:
                        int i15 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody5)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA5)).setText(this$0.getString(R.string.hide));
                        b.J(4);
                        return;
                    default:
                        int i16 = b.f15843v;
                        i.g(this$0, "this$0");
                        if (((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).getVisibility() == 0) {
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.knowMore));
                            return;
                        }
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureBody6)).setVisibility(0);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.planExpiryFeatureCTA6)).setText(this$0.getString(R.string.hide));
                        b.J(5);
                        new Handler().postDelayed(new o(24, this$0), 200L);
                        return;
                }
            }
        });
    }
}
