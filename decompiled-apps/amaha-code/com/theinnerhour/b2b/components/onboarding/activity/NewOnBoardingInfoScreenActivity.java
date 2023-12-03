package com.theinnerhour.b2b.components.onboarding.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import bk.d;
import bo.f;
import com.airbnb.lottie.LottieAnimationView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.components.onboarding.activity.NewOnBoardingInfoScreenActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hs.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tr.r;
/* compiled from: NewOnBoardingInfoScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/activity/NewOnBoardingInfoScreenActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NewOnBoardingInfoScreenActivity extends androidx.appcompat.app.c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f11488z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f11492y = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11489v = LogHelper.INSTANCE.makeLogTag("NewOnBoardingInfoScreen");

    /* renamed from: w  reason: collision with root package name */
    public int f11490w = -1;

    /* renamed from: x  reason: collision with root package name */
    public final c f11491x = new c();

    /* compiled from: NewOnBoardingInfoScreenActivity.kt */
    /* loaded from: classes2.dex */
    public final class a extends FragmentStateAdapter {
        public bo.a F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p fa2) {
            super(fa2);
            i.g(fa2, "fa");
        }

        public final void C() {
            bo.a aVar = this.F;
            if (aVar != null) {
                try {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) aVar._$_findCachedViewById(R.id.lavInfoScreenLottieView);
                    if (lottieAnimationView != null) {
                        lottieAnimationView.h();
                    }
                    aVar.f4558v = true;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(aVar.f4557u, e10);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return 4;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public final Fragment x(int i6) {
            bo.a aVar = new bo.a();
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.DAYMODEL_POSITION, i6);
            aVar.setArguments(bundle);
            if (i6 == 0) {
                this.F = aVar;
            }
            return aVar;
        }
    }

    /* compiled from: NewOnBoardingInfoScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends h {
        public b() {
            super(true);
        }

        @Override // androidx.activity.h
        public final void a() {
            NewOnBoardingInfoScreenActivity newOnBoardingInfoScreenActivity = NewOnBoardingInfoScreenActivity.this;
            if (((ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() == 0) {
                newOnBoardingInfoScreenActivity.finish();
            } else {
                ((ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager)).setCurrentItem(((ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() - 1);
            }
        }
    }

    /* compiled from: NewOnBoardingInfoScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends ViewPager2.e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11494a;

        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void a(int i6) {
            String str;
            boolean z10 = false;
            NewOnBoardingInfoScreenActivity newOnBoardingInfoScreenActivity = NewOnBoardingInfoScreenActivity.this;
            if (i6 == 1) {
                try {
                    newOnBoardingInfoScreenActivity.f11490w = ((ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager)).getCurrentItem();
                    this.f11494a = false;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(newOnBoardingInfoScreenActivity.f11489v, e10);
                    return;
                }
            }
            if (i6 == 2) {
                this.f11494a = true;
            }
            if (i6 == 0 && this.f11494a) {
                int currentItem = ((ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager)).getCurrentItem();
                newOnBoardingInfoScreenActivity.getClass();
                int i10 = newOnBoardingInfoScreenActivity.f11490w;
                if (i10 != currentItem) {
                    if (currentItem <= i10) {
                        z10 = true;
                    }
                    if (z10) {
                        str = "onboarding_info_previous";
                    } else {
                        str = "onboarding_info_next";
                    }
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("screen", newOnBoardingInfoScreenActivity.f11490w + 1);
                    bundle.putBoolean("swipe", true);
                    k kVar = k.f19476a;
                    gk.a.b(bundle, str);
                    newOnBoardingInfoScreenActivity.f11490w = -1;
                    newOnBoardingInfoScreenActivity.getClass();
                }
            }
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11492y;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_new_on_boarding_intro_screen);
        try {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
            aVar.f(R.id.flInfoScreenWelcomeContainer, new f(), null);
            aVar.j();
            ((ViewPager2) n0(R.id.vpInfoScreenViewPager)).setAdapter(new a(this));
            DotsIndicator dotsIndicator = (DotsIndicator) n0(R.id.diInfoScreenDotIndicator);
            ViewPager2 vpInfoScreenViewPager = (ViewPager2) n0(R.id.vpInfoScreenViewPager);
            i.f(vpInfoScreenViewPager, "vpInfoScreenViewPager");
            dotsIndicator.getClass();
            new d().d(dotsIndicator, vpInfoScreenViewPager);
            ((RobertoTextView) n0(R.id.rbInfoScreenSkip)).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: zn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ NewOnBoardingInfoScreenActivity f39674v;

                {
                    this.f39674v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    NewOnBoardingInfoScreenActivity this$0 = this.f39674v;
                    switch (i6) {
                        case 0:
                            int i10 = NewOnBoardingInfoScreenActivity.f11488z;
                            i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("screen", ((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() + 1);
                            k kVar = k.f19476a;
                            gk.a.b(bundle2, "onboarding_info_skip");
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_INFO_SCREEN_VISITED, true);
                            this$0.startActivity(r.r(this$0));
                            this$0.finish();
                            return;
                        default:
                            int i11 = NewOnBoardingInfoScreenActivity.f11488z;
                            i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("screen", ((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() + 1);
                            bundle3.putBoolean("swipe", false);
                            k kVar2 = k.f19476a;
                            gk.a.b(bundle3, "onboarding_info_next");
                            if (((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() < 3) {
                                ((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).setCurrentItem(((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() + 1);
                                return;
                            }
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_INFO_SCREEN_VISITED, true);
                            this$0.startActivity(r.r(this$0));
                            this$0.finish();
                            return;
                    }
                }
            }));
            ((RobertoButton) n0(R.id.rbInfoScreenNext)).setOnClickListener(new View.OnClickListener(this) { // from class: zn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ NewOnBoardingInfoScreenActivity f39674v;

                {
                    this.f39674v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    NewOnBoardingInfoScreenActivity this$0 = this.f39674v;
                    switch (i6) {
                        case 0:
                            int i10 = NewOnBoardingInfoScreenActivity.f11488z;
                            i.g(this$0, "this$0");
                            String str = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("screen", ((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() + 1);
                            k kVar = k.f19476a;
                            gk.a.b(bundle2, "onboarding_info_skip");
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_INFO_SCREEN_VISITED, true);
                            this$0.startActivity(r.r(this$0));
                            this$0.finish();
                            return;
                        default:
                            int i11 = NewOnBoardingInfoScreenActivity.f11488z;
                            i.g(this$0, "this$0");
                            String str2 = gk.a.f16573a;
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("screen", ((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() + 1);
                            bundle3.putBoolean("swipe", false);
                            k kVar2 = k.f19476a;
                            gk.a.b(bundle3, "onboarding_info_next");
                            if (((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() < 3) {
                                ((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).setCurrentItem(((ViewPager2) this$0.n0(R.id.vpInfoScreenViewPager)).getCurrentItem() + 1);
                                return;
                            }
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.IS_INFO_SCREEN_VISITED, true);
                            this$0.startActivity(r.r(this$0));
                            this$0.finish();
                            return;
                    }
                }
            });
            getOnBackPressedDispatcher().a(this, new b());
            ((ViewPager2) n0(R.id.vpInfoScreenViewPager)).f3153w.f3171a.add(this.f11491x);
            InsetsUtils.INSTANCE.setStatusBarColor(R.color.white, this, true, true);
            if (!i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
                startActivity(new Intent(this, DeepLinkActivationActivity.class));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11489v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        try {
            ((ViewPager2) n0(R.id.vpInfoScreenViewPager)).f3153w.f3171a.remove(this.f11491x);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11489v, e10);
        }
        super.onDestroy();
    }
}
