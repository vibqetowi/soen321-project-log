package tn;

import am.w;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import tn.b;
/* compiled from: MoodTrackerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltn/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f33329z = 0;

    /* renamed from: v  reason: collision with root package name */
    public a f33331v;

    /* renamed from: w  reason: collision with root package name */
    public yp.e f33332w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f33333x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f33334y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final yn.a f33330u = new yn.a();

    /* compiled from: MoodTrackerFragment.kt */
    /* loaded from: classes2.dex */
    public interface a {
        void L();
    }

    public b() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new w(23, this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f33333x = registerForActivityResult;
    }

    public final void F() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        ShimmerFrameLayout shimmerFrameLayout;
        AppCompatImageView appCompatImageView3;
        ShimmerFrameLayout shimmerFrameLayout2;
        ShimmerFrameLayout shimmerFrameLayout3;
        AppCompatImageView appCompatImageView4;
        ShimmerFrameLayout shimmerFrameLayout4;
        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_TRACKER, false)) {
                yp.e eVar = this.f33332w;
                if (eVar != null && (shimmerFrameLayout4 = eVar.f38761a) != null) {
                    Extensions.INSTANCE.visible(shimmerFrameLayout4);
                }
                yp.e eVar2 = this.f33332w;
                if (eVar2 != null && (appCompatImageView4 = eVar2.f38762b) != null) {
                    Extensions.INSTANCE.gone(appCompatImageView4);
                }
                yp.e eVar3 = this.f33332w;
                if (eVar3 != null && (shimmerFrameLayout3 = eVar3.f38761a) != null) {
                    shimmerFrameLayout3.b();
                    return;
                }
                return;
            }
            yp.e eVar4 = this.f33332w;
            if (eVar4 != null && (shimmerFrameLayout2 = eVar4.f38761a) != null) {
                Extensions.INSTANCE.gone(shimmerFrameLayout2);
            }
            yp.e eVar5 = this.f33332w;
            if (eVar5 != null && (appCompatImageView3 = eVar5.f38762b) != null) {
                Extensions.INSTANCE.visible(appCompatImageView3);
                return;
            }
            return;
        }
        yp.e eVar6 = this.f33332w;
        if (eVar6 != null && (shimmerFrameLayout = eVar6.f38761a) != null) {
            Extensions.INSTANCE.gone(shimmerFrameLayout);
        }
        wn.b.f36765a.getClass();
        if (wn.b.a() > 0) {
            yp.e eVar7 = this.f33332w;
            if (eVar7 != null && (appCompatImageView2 = eVar7.f38762b) != null) {
                Extensions.INSTANCE.visible(appCompatImageView2);
                return;
            }
            return;
        }
        yp.e eVar8 = this.f33332w;
        if (eVar8 != null && (appCompatImageView = eVar8.f38762b) != null) {
            Extensions.INSTANCE.gone(appCompatImageView);
        }
    }

    public final void I(int i6) {
        a aVar = this.f33331v;
        if (aVar != null) {
            aVar.L();
        }
        String str = gk.a.f16573a;
        Bundle k10 = defpackage.c.k("mood", i6);
        defpackage.e.s(k10, "course", "source", Constants.SCREEN_DASHBOARD);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(k10, "new_tracker_mood_click");
        Intent intent = new Intent(requireActivity(), MultiTrackerActivity.class);
        intent.putExtra("mood", i6);
        this.f33333x.a(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_mood_tracker, (ViewGroup) null, false);
        int i6 = R.id.multiTrackerTag;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) hc.d.w(R.id.multiTrackerTag, inflate);
        if (shimmerFrameLayout != null) {
            i6 = R.id.multiTrackerTitle;
            if (((RobertoTextView) hc.d.w(R.id.multiTrackerTitle, inflate)) != null) {
                i6 = R.id.trackerInsightsCTA;
                AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.trackerInsightsCTA, inflate);
                if (appCompatImageView != null) {
                    i6 = R.id.trackerMoodFive;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.trackerMoodFive, inflate);
                    if (appCompatImageView2 != null) {
                        i6 = R.id.trackerMoodFour;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.trackerMoodFour, inflate);
                        if (appCompatImageView3 != null) {
                            i6 = R.id.trackerMoodOne;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) hc.d.w(R.id.trackerMoodOne, inflate);
                            if (appCompatImageView4 != null) {
                                i6 = R.id.trackerMoodThree;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) hc.d.w(R.id.trackerMoodThree, inflate);
                                if (appCompatImageView5 != null) {
                                    i6 = R.id.trackerMoodTwo;
                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) hc.d.w(R.id.trackerMoodTwo, inflate);
                                    if (appCompatImageView6 != null) {
                                        i6 = R.id.trackerTitle;
                                        if (((RobertoTextView) hc.d.w(R.id.trackerTitle, inflate)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                            this.f33332w = new yp.e(constraintLayout, shimmerFrameLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6);
                                            return constraintLayout;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f33332w = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f33334y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        yp.e eVar = this.f33332w;
        if (eVar != null && (appCompatImageView6 = eVar.f38765e) != null) {
            appCompatImageView6.setOnClickListener(new View.OnClickListener(this) { // from class: tn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f33328v;

                {
                    this.f33328v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f33328v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(1);
                            return;
                        case 1:
                            int i11 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(2);
                            return;
                        case 2:
                            int i12 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(3);
                            return;
                        case 3:
                            int i13 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(4);
                            return;
                        case 4:
                            int i14 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(5);
                            return;
                        default:
                            int i15 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a aVar = this$0.f33331v;
                            if (aVar != null) {
                                aVar.L();
                            }
                            this$0.startActivity(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                            String str = gk.a.f16573a;
                            gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                            return;
                    }
                }
            });
        }
        yp.e eVar2 = this.f33332w;
        if (eVar2 != null && (appCompatImageView5 = eVar2.f38766g) != null) {
            appCompatImageView5.setOnClickListener(new View.OnClickListener(this) { // from class: tn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f33328v;

                {
                    this.f33328v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f33328v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(1);
                            return;
                        case 1:
                            int i11 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(2);
                            return;
                        case 2:
                            int i12 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(3);
                            return;
                        case 3:
                            int i13 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(4);
                            return;
                        case 4:
                            int i14 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(5);
                            return;
                        default:
                            int i15 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a aVar = this$0.f33331v;
                            if (aVar != null) {
                                aVar.L();
                            }
                            this$0.startActivity(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                            String str = gk.a.f16573a;
                            gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                            return;
                    }
                }
            });
        }
        yp.e eVar3 = this.f33332w;
        if (eVar3 != null && (appCompatImageView4 = eVar3.f) != null) {
            appCompatImageView4.setOnClickListener(new View.OnClickListener(this) { // from class: tn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f33328v;

                {
                    this.f33328v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f33328v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(1);
                            return;
                        case 1:
                            int i11 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(2);
                            return;
                        case 2:
                            int i12 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(3);
                            return;
                        case 3:
                            int i13 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(4);
                            return;
                        case 4:
                            int i14 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(5);
                            return;
                        default:
                            int i15 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a aVar = this$0.f33331v;
                            if (aVar != null) {
                                aVar.L();
                            }
                            this$0.startActivity(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                            String str = gk.a.f16573a;
                            gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                            return;
                    }
                }
            });
        }
        yp.e eVar4 = this.f33332w;
        if (eVar4 != null && (appCompatImageView3 = eVar4.f38764d) != null) {
            appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: tn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f33328v;

                {
                    this.f33328v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f33328v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(1);
                            return;
                        case 1:
                            int i11 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(2);
                            return;
                        case 2:
                            int i12 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(3);
                            return;
                        case 3:
                            int i13 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(4);
                            return;
                        case 4:
                            int i14 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(5);
                            return;
                        default:
                            int i15 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a aVar = this$0.f33331v;
                            if (aVar != null) {
                                aVar.L();
                            }
                            this$0.startActivity(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                            String str = gk.a.f16573a;
                            gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                            return;
                    }
                }
            });
        }
        yp.e eVar5 = this.f33332w;
        if (eVar5 != null && (appCompatImageView2 = eVar5.f38763c) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: tn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f33328v;

                {
                    this.f33328v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f33328v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(1);
                            return;
                        case 1:
                            int i11 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(2);
                            return;
                        case 2:
                            int i12 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(3);
                            return;
                        case 3:
                            int i13 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(4);
                            return;
                        case 4:
                            int i14 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(5);
                            return;
                        default:
                            int i15 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a aVar = this$0.f33331v;
                            if (aVar != null) {
                                aVar.L();
                            }
                            this$0.startActivity(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                            String str = gk.a.f16573a;
                            gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                            return;
                    }
                }
            });
        }
        yp.e eVar6 = this.f33332w;
        if (eVar6 != null && (appCompatImageView = eVar6.f38762b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: tn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f33328v;

                {
                    this.f33328v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f33328v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(1);
                            return;
                        case 1:
                            int i11 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(2);
                            return;
                        case 2:
                            int i12 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(3);
                            return;
                        case 3:
                            int i13 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(4);
                            return;
                        case 4:
                            int i14 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.I(5);
                            return;
                        default:
                            int i15 = b.f33329z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            b.a aVar = this$0.f33331v;
                            if (aVar != null) {
                                aVar.L();
                            }
                            this$0.startActivity(new Intent(this$0.requireActivity(), MultiTrackerInsightsActivity.class));
                            String str = gk.a.f16573a;
                            gk.a.b(UtilsKt.getAnalyticsBundle(), "new_tracker_db_insights_click");
                            return;
                    }
                }
            });
        }
        F();
    }
}
