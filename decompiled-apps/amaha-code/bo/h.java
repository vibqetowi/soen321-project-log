package bo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
import tr.r;
/* compiled from: NewOnboardingIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends Fragment {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f4583y = 0;

    /* renamed from: w  reason: collision with root package name */
    public eo.g f4586w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f4587x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f4584u = LogHelper.INSTANCE.makeLogTag("NewOnboardingIntro");

    /* renamed from: v  reason: collision with root package name */
    public final m0 f4585v = b0.j(this, y.a(eo.f.class), new a(this), new b(this), new c(this));

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4588u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f4588u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f4588u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4589u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f4589u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f4589u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f4590u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f4590u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f4590u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f4587x;
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        try {
            if (context instanceof eo.g) {
                this.f4586w = (eo.g) context;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4584u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.layout_onboarding_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f4587x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        try {
            MyApplication.a aVar = MyApplication.V;
            if (aVar.a().M) {
                aVar.a().M = false;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4584u, e10);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        try {
            super.onViewCreated(view, bundle);
            gk.a.b(null, "app_onboarding_funnel_screenload");
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clOnboardingTherapyContainer);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bo.g

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f4582v;

                    {
                        this.f4582v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        h this$0 = this.f4582v;
                        switch (i6) {
                            case 0:
                                int i10 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str = gk.a.f16573a;
                                Bundle a10 = r1.b0.a("offering", "therapy");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "app_onboarding_funnel_offering_select");
                                eo.g gVar = this$0.f4586w;
                                if (gVar != null) {
                                    gVar.S(eo.a.MATCHING_THERAPY);
                                }
                                eo.g gVar2 = this$0.f4586w;
                                if (gVar2 != null) {
                                    gVar2.M();
                                    return;
                                }
                                return;
                            case 1:
                                int i11 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str2 = gk.a.f16573a;
                                Bundle a11 = r1.b0.a("offering", "psychiatry");
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "app_onboarding_funnel_offering_select");
                                eo.g gVar3 = this$0.f4586w;
                                if (gVar3 != null) {
                                    gVar3.S(eo.a.MATCHING_PSYCHIATRY);
                                }
                                eo.g gVar4 = this$0.f4586w;
                                if (gVar4 != null) {
                                    gVar4.M();
                                    return;
                                }
                                return;
                            default:
                                int i12 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str3 = gk.a.f16573a;
                                Bundle a12 = r1.b0.a("offering", "self-care");
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(a12, "app_onboarding_funnel_offering_select");
                                eo.g gVar5 = this$0.f4586w;
                                if (gVar5 != null) {
                                    gVar5.S(eo.a.SELF_CARE);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("a3_intro_skip", true);
                                MyApplication.V.a().M = true;
                                p requireActivity = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                Intent r = r.r(requireActivity);
                                if (this$0.requireActivity().getIntent().getExtras() != null) {
                                    Bundle extras = this$0.requireActivity().getIntent().getExtras();
                                    kotlin.jvm.internal.i.d(extras);
                                    r.putExtras(extras);
                                }
                                r.putExtra("login_flag", true);
                                r.putExtra("source", "onboarding");
                                this$0.startActivity(r);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clOnboardingPsychiatryContainer);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: bo.g

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f4582v;

                    {
                        this.f4582v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        h this$0 = this.f4582v;
                        switch (i6) {
                            case 0:
                                int i10 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str = gk.a.f16573a;
                                Bundle a10 = r1.b0.a("offering", "therapy");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "app_onboarding_funnel_offering_select");
                                eo.g gVar = this$0.f4586w;
                                if (gVar != null) {
                                    gVar.S(eo.a.MATCHING_THERAPY);
                                }
                                eo.g gVar2 = this$0.f4586w;
                                if (gVar2 != null) {
                                    gVar2.M();
                                    return;
                                }
                                return;
                            case 1:
                                int i11 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str2 = gk.a.f16573a;
                                Bundle a11 = r1.b0.a("offering", "psychiatry");
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "app_onboarding_funnel_offering_select");
                                eo.g gVar3 = this$0.f4586w;
                                if (gVar3 != null) {
                                    gVar3.S(eo.a.MATCHING_PSYCHIATRY);
                                }
                                eo.g gVar4 = this$0.f4586w;
                                if (gVar4 != null) {
                                    gVar4.M();
                                    return;
                                }
                                return;
                            default:
                                int i12 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str3 = gk.a.f16573a;
                                Bundle a12 = r1.b0.a("offering", "self-care");
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(a12, "app_onboarding_funnel_offering_select");
                                eo.g gVar5 = this$0.f4586w;
                                if (gVar5 != null) {
                                    gVar5.S(eo.a.SELF_CARE);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("a3_intro_skip", true);
                                MyApplication.V.a().M = true;
                                p requireActivity = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                Intent r = r.r(requireActivity);
                                if (this$0.requireActivity().getIntent().getExtras() != null) {
                                    Bundle extras = this$0.requireActivity().getIntent().getExtras();
                                    kotlin.jvm.internal.i.d(extras);
                                    r.putExtras(extras);
                                }
                                r.putExtra("login_flag", true);
                                r.putExtra("source", "onboarding");
                                this$0.startActivity(r);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.clOnboardingSelfCareContainer);
            if (constraintLayout3 != null) {
                constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: bo.g

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f4582v;

                    {
                        this.f4582v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        h this$0 = this.f4582v;
                        switch (i6) {
                            case 0:
                                int i10 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str = gk.a.f16573a;
                                Bundle a10 = r1.b0.a("offering", "therapy");
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(a10, "app_onboarding_funnel_offering_select");
                                eo.g gVar = this$0.f4586w;
                                if (gVar != null) {
                                    gVar.S(eo.a.MATCHING_THERAPY);
                                }
                                eo.g gVar2 = this$0.f4586w;
                                if (gVar2 != null) {
                                    gVar2.M();
                                    return;
                                }
                                return;
                            case 1:
                                int i11 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str2 = gk.a.f16573a;
                                Bundle a11 = r1.b0.a("offering", "psychiatry");
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(a11, "app_onboarding_funnel_offering_select");
                                eo.g gVar3 = this$0.f4586w;
                                if (gVar3 != null) {
                                    gVar3.S(eo.a.MATCHING_PSYCHIATRY);
                                }
                                eo.g gVar4 = this$0.f4586w;
                                if (gVar4 != null) {
                                    gVar4.M();
                                    return;
                                }
                                return;
                            default:
                                int i12 = h.f4583y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String str3 = gk.a.f16573a;
                                Bundle a12 = r1.b0.a("offering", "self-care");
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(a12, "app_onboarding_funnel_offering_select");
                                eo.g gVar5 = this$0.f4586w;
                                if (gVar5 != null) {
                                    gVar5.S(eo.a.SELF_CARE);
                                }
                                ApplicationPersistence.getInstance().setBooleanValue("a3_intro_skip", true);
                                MyApplication.V.a().M = true;
                                p requireActivity = this$0.requireActivity();
                                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                                Intent r = r.r(requireActivity);
                                if (this$0.requireActivity().getIntent().getExtras() != null) {
                                    Bundle extras = this$0.requireActivity().getIntent().getExtras();
                                    kotlin.jvm.internal.i.d(extras);
                                    r.putExtras(extras);
                                }
                                r.putExtra("login_flag", true);
                                r.putExtra("source", "onboarding");
                                this$0.startActivity(r);
                                return;
                        }
                    }
                });
            }
            eo.f fVar = (eo.f) this.f4585v.getValue();
            fVar.f14444y = null;
            fVar.f14445z = null;
            fVar.A = null;
            fVar.B = null;
            fVar.C = null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4584u, e10);
        }
    }
}
