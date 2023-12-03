package hl;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FeedBackUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.RoutingType;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.a1;
import fm.y0;
import g0.a;
import ik.j1;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONArray;
/* compiled from: CustomDashboardFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhl/g;", "Landroidx/fragment/app/Fragment;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends Fragment implements SubscriptionPersistence.SubscriptionInitialiseListener {
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public String B;
    public RoutingIntentHandler C;
    public a1 D;
    public boolean E;
    public Boolean F;
    public final HashMap<hl.f, View> G;
    public final androidx.activity.result.c<Intent> H;
    public final hl.b I;

    /* renamed from: v  reason: collision with root package name */
    public jl.e f17678v;

    /* renamed from: w  reason: collision with root package name */
    public MonetizationViewModel f17679w;

    /* renamed from: z  reason: collision with root package name */
    public String f17682z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17677u = LogHelper.INSTANCE.makeLogTag("CustomDashboardFragment");

    /* renamed from: x  reason: collision with root package name */
    public int f17680x = 1;

    /* renamed from: y  reason: collision with root package name */
    public boolean f17681y = true;

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17683a;

        static {
            int[] iArr = new int[RoutingType.values().length];
            try {
                iArr[RoutingType.MOOD_TRACKER_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoutingType.TELE_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoutingType.JOURNAL_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoutingType.JOURNAL_ROUTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RoutingType.COMMUNITY_DASHBOARD_SMOOTH_SCROLL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f17683a = iArr;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends y0>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ a1 f17684u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ g f17685v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1 a1Var, g gVar) {
            super(1);
            this.f17684u = a1Var;
            this.f17685v = gVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends y0> singleUseEvent) {
            y0 contentIfNotHandled;
            SingleUseEvent<? extends y0> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                if (sp.b.K() && contentIfNotHandled == y0.MIGRATION_SUCCESS) {
                    this.f17684u.l();
                } else {
                    this.f17685v.E = true;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<y0, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(y0 y0Var) {
            boolean z10;
            y0 y0Var2 = y0Var;
            if (y0Var2 != null) {
                if (y0Var2 == y0.MIGRATION_SUCCESS) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g.this.E = z10;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends JSONArray>, hs.k> {
        public d() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:291:0x07f3, code lost:
            if (r10 != null) goto L310;
         */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(SingleUseEvent<? extends JSONArray> singleUseEvent) {
            JSONArray contentIfNotHandled;
            int i6;
            String str;
            String str2;
            String firstName;
            String str3;
            String str4;
            LinearLayoutCompat linearLayoutCompat;
            LinearLayoutCompat linearLayoutCompat2;
            ViewGroup viewGroup;
            LinearLayoutCompat linearLayoutCompat3;
            LinearLayoutCompat linearLayoutCompat4;
            ViewGroup viewGroup2;
            LinearLayoutCompat linearLayoutCompat5;
            Fragment F;
            LinearLayoutCompat linearLayoutCompat6;
            ViewGroup viewGroup3;
            LinearLayoutCompat linearLayoutCompat7;
            LinearLayoutCompat linearLayoutCompat8;
            ViewGroup viewGroup4;
            LinearLayoutCompat linearLayoutCompat9;
            LinearLayoutCompat linearLayoutCompat10;
            ViewGroup viewGroup5;
            LinearLayoutCompat linearLayoutCompat11;
            int i10;
            LinearLayoutCompat linearLayoutCompat12;
            LinearLayoutCompat linearLayoutCompat13;
            ViewGroup viewGroup6;
            boolean z10;
            ViewGroup viewGroup7;
            LinearLayoutCompat linearLayoutCompat14;
            LinearLayoutCompat linearLayoutCompat15;
            ViewGroup viewGroup8;
            LinearLayoutCompat linearLayoutCompat16;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            LinearLayoutCompat linearLayoutCompat17;
            LinearLayoutCompat linearLayoutCompat18;
            SingleUseEvent<? extends JSONArray> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
                g gVar = g.this;
                View view = gVar.getView();
                if (view != null && (linearLayoutCompat18 = (LinearLayoutCompat) view.findViewById(R.id.customDBMainLayout)) != null) {
                    linearLayoutCompat18.removeAllViews();
                }
                int length = contentIfNotHandled.length();
                boolean z11 = false;
                int i11 = 0;
                while (i11 < length) {
                    Object obj = contentIfNotHandled.get(i11);
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    String str5 = (String) obj;
                    int i12 = g.K;
                    int hashCode = str5.hashCode();
                    HashMap<hl.f, View> hashMap = gVar.G;
                    switch (hashCode) {
                        case -1983070683:
                            if (str5.equals("resources")) {
                                hl.f fVar = hl.f.RESOURCE;
                                View view2 = hashMap.get(fVar);
                                if (view2 != null) {
                                    gVar.O("dashboard_resource");
                                    View view3 = gVar.getView();
                                    if (view3 != null) {
                                        linearLayoutCompat4 = (LinearLayoutCompat) view3.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat4 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat4, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat4.addView(view2);
                                    break;
                                } else {
                                    ep.b bVar = new ep.b();
                                    LayoutInflater layoutInflater = gVar.requireActivity().getLayoutInflater();
                                    View view4 = gVar.getView();
                                    if (view4 != null) {
                                        viewGroup = (ViewGroup) view4.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup = null;
                                    }
                                    View inflate = layoutInflater.inflate(R.layout.row_campaign_blank, viewGroup, false);
                                    View view5 = gVar.getView();
                                    if (view5 != null) {
                                        linearLayoutCompat3 = (LinearLayoutCompat) view5.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat3 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat3, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat3.addView(inflate);
                                    inflate.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    androidx.fragment.app.y childFragmentManager = gVar.getChildFragmentManager();
                                    androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
                                    l2.f(inflate.getId(), bVar, "dashboard_resource");
                                    l2.j();
                                    gVar.getChildFragmentManager().B();
                                    hashMap.put(fVar, inflate);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -1815247138:
                            if (str5.equals("db_campaign_card")) {
                                hl.f fVar2 = hl.f.CAMPAIGN;
                                View view6 = hashMap.get(fVar2);
                                if (view6 != null) {
                                    gVar.O("dashboard_campaign");
                                    View view7 = gVar.getView();
                                    if (view7 != null) {
                                        linearLayoutCompat6 = (LinearLayoutCompat) view7.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat6 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat6, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat6.addView(view6);
                                    break;
                                } else {
                                    LayoutInflater layoutInflater2 = gVar.requireActivity().getLayoutInflater();
                                    View view8 = gVar.getView();
                                    if (view8 != null) {
                                        viewGroup2 = (ViewGroup) view8.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup2 = null;
                                    }
                                    View inflate2 = layoutInflater2.inflate(R.layout.row_campaign_blank, viewGroup2, false);
                                    View view9 = gVar.getView();
                                    if (view9 != null) {
                                        linearLayoutCompat5 = (LinearLayoutCompat) view9.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat5 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat5, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat5.addView(inflate2);
                                    inflate2.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    hashMap.put(fVar2, inflate2);
                                    if (gVar.f17679w == null) {
                                        qn.c cVar = new qn.c();
                                        Application application = gVar.requireActivity().getApplication();
                                        kotlin.jvm.internal.i.f(application, "requireActivity().application");
                                        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new o0(gVar, new jl.q(application, gVar.f17682z, cVar)).a(MonetizationViewModel.class);
                                        monetizationViewModel.f();
                                        monetizationViewModel.C.e(gVar.getViewLifecycleOwner(), new fl.k(14, new hl.h(gVar, monetizationViewModel)));
                                        gVar.f17679w = monetizationViewModel;
                                        break;
                                    } else if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && (F = gVar.getChildFragmentManager().F("dashboard_campaign")) != null) {
                                        androidx.fragment.app.y childFragmentManager2 = gVar.getChildFragmentManager();
                                        childFragmentManager2.getClass();
                                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager2);
                                        aVar.o(F);
                                        aVar.k();
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case -1480249367:
                            if (str5.equals(Constants.SCREEN_COMMUNITY)) {
                                hl.f fVar3 = hl.f.COMMUNITY;
                                View view10 = hashMap.get(fVar3);
                                if (view10 != null) {
                                    View view11 = gVar.getView();
                                    if (view11 != null) {
                                        linearLayoutCompat8 = (LinearLayoutCompat) view11.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat8 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat8, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat8.addView(view10);
                                } else {
                                    tk.c cVar2 = new tk.c();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("stop_auto_init", true);
                                    cVar2.setArguments(bundle);
                                    LayoutInflater layoutInflater3 = gVar.requireActivity().getLayoutInflater();
                                    View view12 = gVar.getView();
                                    if (view12 != null) {
                                        viewGroup3 = (ViewGroup) view12.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup3 = null;
                                    }
                                    View inflate3 = layoutInflater3.inflate(R.layout.row_campaign_blank, viewGroup3, false);
                                    View view13 = gVar.getView();
                                    if (view13 != null) {
                                        linearLayoutCompat7 = (LinearLayoutCompat) view13.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat7 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat7, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat7.addView(inflate3);
                                    inflate3.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    androidx.fragment.app.y childFragmentManager3 = gVar.getChildFragmentManager();
                                    androidx.fragment.app.a l10 = defpackage.e.l(childFragmentManager3, childFragmentManager3);
                                    l10.f(inflate3.getId(), cVar2, "dashboard_community");
                                    l10.j();
                                    gVar.getChildFragmentManager().B();
                                    hashMap.put(fVar3, inflate3);
                                }
                                gVar.K();
                                break;
                            } else {
                                break;
                            }
                        case -1419464905:
                            if (str5.equals("journal")) {
                                hl.f fVar4 = hl.f.JOURNAL;
                                View view14 = hashMap.get(fVar4);
                                if (view14 != null) {
                                    View view15 = gVar.getView();
                                    if (view15 != null) {
                                        linearLayoutCompat10 = (LinearLayoutCompat) view15.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat10 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat10, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat10.addView(view14);
                                    break;
                                } else {
                                    nm.a aVar2 = new nm.a();
                                    LayoutInflater layoutInflater4 = gVar.requireActivity().getLayoutInflater();
                                    View view16 = gVar.getView();
                                    if (view16 != null) {
                                        viewGroup4 = (ViewGroup) view16.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup4 = null;
                                    }
                                    View inflate4 = layoutInflater4.inflate(R.layout.row_campaign_blank, viewGroup4, false);
                                    View view17 = gVar.getView();
                                    if (view17 != null) {
                                        linearLayoutCompat9 = (LinearLayoutCompat) view17.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat9 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat9, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat9.addView(inflate4);
                                    inflate4.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    androidx.fragment.app.y childFragmentManager4 = gVar.getChildFragmentManager();
                                    androidx.fragment.app.a l11 = defpackage.e.l(childFragmentManager4, childFragmentManager4);
                                    l11.f(inflate4.getId(), aVar2, "dashboard_journal");
                                    l11.j();
                                    gVar.getChildFragmentManager().B();
                                    hashMap.put(fVar4, inflate4);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -1067395272:
                            if (str5.equals(Constants.SCREEN_TRAKCER)) {
                                hl.f fVar5 = hl.f.MOOD_TRACKER;
                                View view18 = hashMap.get(fVar5);
                                if (view18 != null) {
                                    View view19 = gVar.getView();
                                    if (view19 != null) {
                                        linearLayoutCompat12 = (LinearLayoutCompat) view19.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat12 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat12, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat12.addView(view18);
                                    break;
                                } else {
                                    tn.b bVar2 = new tn.b();
                                    LayoutInflater layoutInflater5 = gVar.requireActivity().getLayoutInflater();
                                    View view20 = gVar.getView();
                                    if (view20 != null) {
                                        viewGroup5 = (ViewGroup) view20.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup5 = null;
                                    }
                                    View inflate5 = layoutInflater5.inflate(R.layout.row_campaign_blank, viewGroup5, false);
                                    View view21 = gVar.getView();
                                    if (view21 != null) {
                                        linearLayoutCompat11 = (LinearLayoutCompat) view21.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat11 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat11, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat11.addView(inflate5);
                                    inflate5.setId(gVar.f17680x);
                                    wn.b.f36765a.getClass();
                                    if (wn.b.f36769e != wn.j.COMPLETED) {
                                        i10 = 8;
                                    } else {
                                        i10 = 0;
                                    }
                                    inflate5.setVisibility(i10);
                                    gVar.f17680x++;
                                    androidx.fragment.app.y childFragmentManager5 = gVar.getChildFragmentManager();
                                    androidx.fragment.app.a l12 = defpackage.e.l(childFragmentManager5, childFragmentManager5);
                                    l12.f(inflate5.getId(), bVar2, "dashboard_mood");
                                    l12.j();
                                    gVar.getChildFragmentManager().B();
                                    hashMap.put(fVar5, inflate5);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -801126324:
                            ViewGroup viewGroup9 = null;
                            if (str5.equals("dashboard_nav_bar")) {
                                hl.f fVar6 = hl.f.NAVBAR;
                                if (hashMap.get(fVar6) != null) {
                                    gVar.O("dashboard_nav_bar");
                                    break;
                                } else {
                                    j jVar = new j();
                                    LayoutInflater layoutInflater6 = gVar.requireActivity().getLayoutInflater();
                                    View view22 = gVar.getView();
                                    if (view22 != null) {
                                        viewGroup9 = (ViewGroup) view22.findViewById(R.id.customDBTopNav);
                                    }
                                    View inflate6 = layoutInflater6.inflate(R.layout.row_campaign_blank, viewGroup9, false);
                                    View view23 = gVar.getView();
                                    if (view23 != null) {
                                        linearLayoutCompat13 = (LinearLayoutCompat) view23.findViewById(R.id.customDBTopNav);
                                    } else {
                                        linearLayoutCompat13 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat13, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat13.addView(inflate6);
                                    inflate6.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    androidx.fragment.app.y childFragmentManager6 = gVar.getChildFragmentManager();
                                    androidx.fragment.app.a l13 = defpackage.e.l(childFragmentManager6, childFragmentManager6);
                                    l13.f(inflate6.getId(), jVar, "dashboard_nav_bar");
                                    l13.j();
                                    gVar.getChildFragmentManager().B();
                                    hashMap.put(fVar6, inflate6);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 166208699:
                            LinearLayoutCompat linearLayoutCompat19 = null;
                            if (str5.equals("library")) {
                                hl.f fVar7 = hl.f.LIBRARY;
                                View view24 = hashMap.get(fVar7);
                                if (view24 != null) {
                                    View view25 = gVar.getView();
                                    if (view25 != null) {
                                        linearLayoutCompat19 = (LinearLayoutCompat) view25.findViewById(R.id.customDBMainLayout);
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat19, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat19.addView(view24);
                                    break;
                                } else {
                                    LayoutInflater layoutInflater7 = gVar.requireActivity().getLayoutInflater();
                                    View view26 = gVar.getView();
                                    if (view26 != null) {
                                        viewGroup6 = (ViewGroup) view26.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup6 = null;
                                    }
                                    View inflate7 = layoutInflater7.inflate(R.layout.dashboard_library_card_layout, viewGroup6, false);
                                    View view27 = gVar.getView();
                                    if (view27 != null) {
                                        linearLayoutCompat19 = (LinearLayoutCompat) view27.findViewById(R.id.customDBMainLayout);
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat19, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat19.addView(inflate7);
                                    inflate7.setId(gVar.f17680x);
                                    ViewGroup.LayoutParams layoutParams = inflate7.getLayoutParams();
                                    kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                                    marginLayoutParams2.setMargins(0, 0, 0, 30);
                                    inflate7.setLayoutParams(marginLayoutParams2);
                                    gVar.f17680x++;
                                    inflate7.setOnClickListener(new hl.d(gVar, 1));
                                    hashMap.put(fVar7, inflate7);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 297353429:
                            if (str5.equals("tele_variant_d")) {
                                hl.f fVar8 = hl.f.TELE_ENTRY_POINT;
                                View view28 = hashMap.get(fVar8);
                                if (view28 != null) {
                                    gVar.O("dashboard_tele");
                                    View view29 = gVar.getView();
                                    if (view29 != null) {
                                        linearLayoutCompat15 = (LinearLayoutCompat) view29.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat15 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat15, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat15.addView(view28);
                                    break;
                                } else {
                                    String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYTHERAPIST);
                                    String stringValue2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYCOUPLESTHERAPIST);
                                    String stringValue3 = SessionManager.getInstance().getStringValue(SessionManager.KEY_MYPSYCHIATRIST);
                                    if ((stringValue != null && !kotlin.jvm.internal.i.b(stringValue, "null") && !kotlin.jvm.internal.i.b(stringValue, "")) || ((stringValue3 != null && !kotlin.jvm.internal.i.b(stringValue3, "null") && !kotlin.jvm.internal.i.b(stringValue3, "")) || (stringValue2 != null && !kotlin.jvm.internal.i.b(stringValue2, "null") && !kotlin.jvm.internal.i.b(stringValue2, "")))) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    gVar.F = Boolean.valueOf(z10);
                                    LayoutInflater layoutInflater8 = gVar.requireActivity().getLayoutInflater();
                                    View view30 = gVar.getView();
                                    if (view30 != null) {
                                        viewGroup7 = (ViewGroup) view30.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup7 = null;
                                    }
                                    View inflate8 = layoutInflater8.inflate(R.layout.row_campaign_blank, viewGroup7, false);
                                    View view31 = gVar.getView();
                                    if (view31 != null) {
                                        linearLayoutCompat14 = (LinearLayoutCompat) view31.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat14 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat14, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat14.addView(inflate8);
                                    inflate8.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    if (z10) {
                                        androidx.fragment.app.y childFragmentManager7 = gVar.getChildFragmentManager();
                                        androidx.fragment.app.a l14 = defpackage.e.l(childFragmentManager7, childFragmentManager7);
                                        l14.f(inflate8.getId(), new tl.d(), "dashboard_tele");
                                        l14.j();
                                    } else {
                                        androidx.fragment.app.y childFragmentManager8 = gVar.getChildFragmentManager();
                                        androidx.fragment.app.a l15 = defpackage.e.l(childFragmentManager8, childFragmentManager8);
                                        l15.f(inflate8.getId(), new op.a(), "dashboard_tele");
                                        l15.j();
                                        jl.e eVar = gVar.f17678v;
                                        if (eVar != null) {
                                            ta.v.H(kc.f.H(eVar), null, 0, new jl.g(eVar, null), 3);
                                        }
                                    }
                                    gVar.getChildFragmentManager().B();
                                    hashMap.put(fVar8, inflate8);
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 592057557:
                            if (str5.equals("survey_card") && !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey("isSurveyShown")) {
                                hl.f fVar9 = hl.f.DYNAMIC_CARD;
                                View view32 = hashMap.get(fVar9);
                                if (view32 != null) {
                                    View view33 = gVar.getView();
                                    if (view33 != null) {
                                        linearLayoutCompat17 = (LinearLayoutCompat) view33.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat17 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat17, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat17.addView(view32);
                                    break;
                                } else {
                                    LayoutInflater layoutInflater9 = gVar.requireActivity().getLayoutInflater();
                                    View view34 = gVar.getView();
                                    if (view34 != null) {
                                        viewGroup8 = (ViewGroup) view34.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        viewGroup8 = null;
                                    }
                                    View inflate9 = layoutInflater9.inflate(R.layout.row_campaign_blank, viewGroup8, z11);
                                    View view35 = gVar.getView();
                                    if (view35 != null) {
                                        linearLayoutCompat16 = (LinearLayoutCompat) view35.findViewById(R.id.customDBMainLayout);
                                    } else {
                                        linearLayoutCompat16 = null;
                                    }
                                    kotlin.jvm.internal.i.e(linearLayoutCompat16, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
                                    linearLayoutCompat16.addView(inflate9);
                                    ViewGroup.LayoutParams layoutParams2 = inflate9.getLayoutParams();
                                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                    } else {
                                        marginLayoutParams = null;
                                    }
                                    if (marginLayoutParams != null) {
                                        marginLayoutParams.setMarginStart((int) gVar.requireActivity().getResources().getDimension(R.dimen.margin_16));
                                    }
                                    if (marginLayoutParams != null) {
                                        marginLayoutParams.setMarginEnd((int) gVar.requireActivity().getResources().getDimension(R.dimen.margin_16));
                                    }
                                    inflate9.setLayoutParams(marginLayoutParams);
                                    inflate9.setId(gVar.f17680x);
                                    gVar.f17680x++;
                                    hashMap.put(fVar9, inflate9);
                                    if (NpsPersistence.INSTANCE.getNpsInitComplete()) {
                                        l lVar = new l();
                                        androidx.fragment.app.y childFragmentManager9 = gVar.getChildFragmentManager();
                                        androidx.fragment.app.a l16 = defpackage.e.l(childFragmentManager9, childFragmentManager9);
                                        l16.f(inflate9.getId(), lVar, "dynamic_card");
                                        l16.j();
                                        gVar.getChildFragmentManager().B();
                                        break;
                                    } else {
                                        gVar.A = true;
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                    i11++;
                    z11 = false;
                }
                if (gVar.f17681y) {
                    gVar.f17681y = false;
                    View view36 = gVar.getView();
                    if (view36 != null && (linearLayoutCompat2 = (LinearLayoutCompat) view36.findViewById(R.id.llCoursePickerLayout)) != null) {
                        linearLayoutCompat2.removeAllViews();
                    }
                    ArrayList<Course> originalCourseList = FirebasePersistence.getInstance().getCourses();
                    kotlin.jvm.internal.i.f(originalCourseList, "originalCourseList");
                    for (Course course : originalCourseList) {
                        LayoutInflater layoutInflater10 = gVar.getLayoutInflater();
                        View view37 = gVar.getView();
                        if (view37 != null) {
                            linearLayoutCompat = (LinearLayoutCompat) view37.findViewById(R.id.llCoursePickerLayout);
                        } else {
                            linearLayoutCompat = null;
                        }
                        View inflate10 = layoutInflater10.inflate(R.layout.row_dashboard_switch_course, (ViewGroup) linearLayoutCompat, false);
                        TextView textView = (TextView) inflate10.findViewById(R.id.tvSwitchCourseName);
                        if (textView != null) {
                            textView.setText(Constants.getCourseDisplayName(course.getCourseName()));
                        }
                        inflate10.setOnClickListener(new j1(course, gVar, 18));
                        ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)).addView(inflate10);
                    }
                    Boolean isAdhdCourseActive = FirebasePersistence.getInstance().getIsAdhdCourseActive();
                    kotlin.jvm.internal.i.f(isAdhdCourseActive, "getInstance().isAdhdCourseActive");
                    if (isAdhdCourseActive.booleanValue()) {
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str4 = user.getCurrentCourseName();
                        } else {
                            str4 = null;
                        }
                        if (!kotlin.jvm.internal.i.b(str4, Constants.COURSE_ADHD)) {
                            View inflate11 = gVar.getLayoutInflater().inflate(R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)), false);
                            ((RobertoTextView) inflate11.findViewById(R.id.tvSwitchCourseName)).setText(Constants.getCourseDisplayName(Constants.COURSE_ADHD));
                            inflate11.setOnClickListener(new hl.d(gVar, 2));
                            ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)).addView(inflate11);
                        }
                    }
                    Boolean isOcdCourseActive = FirebasePersistence.getInstance().getIsOcdCourseActive();
                    kotlin.jvm.internal.i.f(isOcdCourseActive, "getInstance().isOcdCourseActive");
                    if (isOcdCourseActive.booleanValue()) {
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null) {
                            str3 = user2.getCurrentCourseName();
                        } else {
                            str3 = null;
                        }
                        if (!kotlin.jvm.internal.i.b(str3, Constants.COURSE_OCD)) {
                            View inflate12 = gVar.getLayoutInflater().inflate(R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)), false);
                            ((RobertoTextView) inflate12.findViewById(R.id.tvSwitchCourseName)).setText(Constants.getCourseDisplayName(Constants.COURSE_OCD));
                            inflate12.setOnClickListener(new hl.d(gVar, 3));
                            ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)).addView(inflate12);
                        }
                    }
                    Boolean isGenericExpertCareCourseActive = FirebasePersistence.getInstance().getIsGenericExpertCareCourseActive();
                    kotlin.jvm.internal.i.f(isGenericExpertCareCourseActive, "getInstance().isGenericExpertCareCourseActive");
                    if (isGenericExpertCareCourseActive.booleanValue()) {
                        User user3 = FirebasePersistence.getInstance().getUser();
                        if (user3 != null) {
                            str = user3.getCurrentCourseName();
                        } else {
                            str = null;
                        }
                        if (!kotlin.jvm.internal.i.b(str, Constants.COURSE_GENERIC)) {
                            View inflate13 = gVar.getLayoutInflater().inflate(R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)), false);
                            RobertoTextView robertoTextView = (RobertoTextView) inflate13.findViewById(R.id.tvSwitchCourseName);
                            User user4 = FirebasePersistence.getInstance().getUser();
                            if (user4 != null && (firstName = user4.getFirstName()) != null) {
                                if (gv.n.B0(firstName)) {
                                    firstName = null;
                                }
                                if (firstName != null) {
                                    str2 = gVar.getString(R.string.expertCareDashboardHeader, firstName);
                                }
                            }
                            str2 = Constants.COURSE_EXPERT_CARE_DN;
                            robertoTextView.setText(str2);
                            inflate13.setOnClickListener(new hl.d(gVar, 4));
                            ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)).addView(inflate13);
                        }
                    }
                    Boolean isGenericExpertCareCourseActive2 = FirebasePersistence.getInstance().getIsGenericExpertCareCourseActive();
                    kotlin.jvm.internal.i.f(isGenericExpertCareCourseActive2, "getInstance().isGenericExpertCareCourseActive");
                    if (isGenericExpertCareCourseActive2.booleanValue()) {
                        i6 = 9;
                    } else {
                        i6 = 8;
                    }
                    if (((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)).getChildCount() < i6) {
                        View inflate14 = gVar.getLayoutInflater().inflate(R.layout.row_dashboard_switch_course, (ViewGroup) ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)), false);
                        ((RobertoTextView) inflate14.findViewById(R.id.tvSwitchCourseName)).setText("Add programme");
                        ((AppCompatImageView) inflate14.findViewById(R.id.ivSwitchCoursePlus)).setVisibility(0);
                        inflate14.setOnClickListener(new hl.d(gVar, 5));
                        ((LinearLayoutCompat) gVar._$_findCachedViewById(R.id.llCoursePickerLayout)).addView(inflate14);
                    }
                    LinearLayoutCompat linearLayoutCompat20 = (LinearLayoutCompat) gVar._$_findCachedViewById(R.id.customDBTopNav);
                    if (linearLayoutCompat20 != null) {
                        linearLayoutCompat20.post(new hl.c(gVar, 2));
                    }
                }
                RoutingIntentHandler routingIntentHandler = gVar.C;
                if (routingIntentHandler != null && !routingIntentHandler.isRoutingCompleted()) {
                    gVar.S();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ jl.e f17688u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ g f17689v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jl.e eVar, g gVar) {
            super(1);
            this.f17688u = eVar;
            this.f17689v = gVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
                androidx.lifecycle.w<Boolean> wVar = this.f17688u.D;
                g gVar = this.f17689v;
                wVar.k(gVar.getViewLifecycleOwner());
                if (kotlin.jvm.internal.i.b(gVar.F, Boolean.FALSE)) {
                    gVar.P();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends ArrayList<String>>, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends ArrayList<String>> fVar) {
            tk.c cVar;
            boolean z10;
            hs.f<? extends Boolean, ? extends ArrayList<String>> fVar2 = fVar;
            if (fVar2 != null) {
                Fragment F = g.this.getChildFragmentManager().F("dashboard_community");
                if (F instanceof tk.c) {
                    cVar = (tk.c) F;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Boolean bool = (Boolean) fVar2.f19464u;
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = false;
                    }
                    cVar.P(z10);
                    cVar.O((ArrayList) fVar2.f19465v);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* renamed from: hl.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0281g extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public C0281g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue()) {
                int i6 = g.K;
                g gVar = g.this;
                gVar.getClass();
                FeedBackUtils feedBackUtils = new FeedBackUtils();
                androidx.fragment.app.p requireActivity = gVar.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                feedBackUtils.setActivity(requireActivity);
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_show");
                Dialog dialog = UiUtils.Companion.getDialog(R.layout.dialog_topical_remove, gVar.requireContext());
                Window window = dialog.getWindow();
                kotlin.jvm.internal.i.d(window);
                window.getAttributes().windowAnimations = R.style.DialogGrowInAndSlideOut;
                ((RobertoTextView) dialog.findViewById(R.id.btnTopicalCancel)).setOnClickListener(new hl.e(dialog, feedBackUtils, 0));
                ((RobertoTextView) dialog.findViewById(R.id.btnTopicalPositive)).setOnClickListener(new dk.t(dialog, gVar, feedBackUtils, 15));
                dialog.setCancelable(false);
                dialog.show();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
            Boolean contentIfNotHandled;
            SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
            if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue()) {
                int i6 = g.K;
                g.this.I();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CustomDashboardFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            View view;
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            if (it.booleanValue() && (view = g.this.G.get(hl.f.MOOD_TRACKER)) != null) {
                view.setVisibility(0);
            }
            return hs.k.f19476a;
        }
    }

    public g() {
        String str;
        boolean z10 = true;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        this.B = str;
        if (sp.b.K()) {
            wn.b.f36765a.getClass();
            if (wn.b.b() != y0.MIGRATION_SUCCESS) {
                z10 = false;
            }
        }
        this.E = z10;
        this.G = new HashMap<>();
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new hl.b(this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…derAssignedStatus()\n    }");
        this.H = registerForActivityResult;
        this.I = new hl.b(this);
    }

    public final void F() {
        String str;
        User user = FirebasePersistence.getInstance().getUser();
        String str2 = null;
        if (user != null) {
            str = user.getCurrentCourseName();
        } else {
            str = null;
        }
        if (!kotlin.jvm.internal.i.b(str, this.B)) {
            this.f17681y = true;
            M();
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null) {
                str2 = user2.getCurrentCourseName();
            }
            this.B = str2;
        }
    }

    public final void I() {
        boolean z10;
        ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
        if (userGoals != null && !userGoals.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
            this.E = false;
            if (this.D == null) {
                this.D = (a1) new o0(this, new kk.c(new fm.j1(), MyApplication.V.a())).a(a1.class);
            }
            a1 a1Var = this.D;
            if (a1Var != null) {
                a1Var.m();
                a1Var.B.e(getViewLifecycleOwner(), new fl.k(15, new b(a1Var, this)));
                a1Var.A.e(getViewLifecycleOwner(), new fl.k(16, new c()));
            }
        }
    }

    public final void J(Fragment fragment) {
        View view = this.G.get(hl.f.CAMPAIGN);
        if (view != null) {
            androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
            l2.f(view.getId(), fragment, "dashboard_campaign");
            l2.j();
            getChildFragmentManager().B();
        }
    }

    public final void K() {
        jl.e eVar = this.f17678v;
        if (eVar != null) {
            try {
                ta.v.H(kc.f.H(eVar), kotlinx.coroutines.o0.f23642c, 0, new jl.j(eVar, null), 2);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(eVar.A, e10);
            }
        }
    }

    public final void M() {
        jl.e eVar = this.f17678v;
        if (eVar != null) {
            ta.v.H(kc.f.H(eVar), kotlinx.coroutines.o0.f23642c, 0, new jl.k(eVar, null), 2);
        }
        if (((LinearLayoutCompat) _$_findCachedViewById(R.id.llCoursePickerLayout)).getVisibility() == 0) {
            U();
        }
    }

    public final void O(String str) {
        hl.a aVar;
        Fragment F = getChildFragmentManager().F(str);
        if (F instanceof hl.a) {
            aVar = (hl.a) F;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.F();
        }
    }

    public final void P() {
        View view = this.G.get(hl.f.TELE_ENTRY_POINT);
        if (view == null) {
            return;
        }
        androidx.fragment.app.y childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
        l2.f(view.getId(), new tl.d(), "dashboard_tele");
        l2.j();
        getChildFragmentManager().B();
    }

    public final void Q(long j10) {
        WindowManager.LayoutParams layoutParams;
        try {
            String format = LocalDateTime.ofEpochSecond(j10 / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(j10))).format(DateTimeFormatter.ofPattern("MMMM dd, yyyy").withLocale(Locale.ENGLISH));
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_subscription_expired, requireContext(), R.style.Theme_Dialog);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            TextView textView = (TextView) styledDialog.findViewById(R.id.tvSubscriptionExpireDialogMessage);
            if (textView != null) {
                textView.setText(getString(R.string.subscription_expire_popup_description, format));
            }
            ((TextView) styledDialog.findViewById(R.id.tvSubscriptionExpireDialogCancel)).setOnClickListener(new dk.n(styledDialog, 14));
            ((ConstraintLayout) styledDialog.findViewById(R.id.clSubscriptionExpireDialogPurchaseNow)).setOnClickListener(new j1(this, 17, styledDialog));
            ApplicationPersistence.getInstance().setBooleanValue(Constants.SUBSCRIPTION_EXPIRY_SHOWN, true);
            styledDialog.show();
            gk.a.b(null, "pr_app_sub_repurchase_popup_show");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17677u, e10);
        }
    }

    public final void S() {
        LinearLayoutCompat linearLayoutCompat;
        try {
            if (!isDetached() && isAdded() && getView() != null && this.C != null && (linearLayoutCompat = (LinearLayoutCompat) _$_findCachedViewById(R.id.customDBMainLayout)) != null) {
                linearLayoutCompat.post(new hl.c(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17677u, e10);
        }
    }

    public final boolean U() {
        boolean z10;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) _$_findCachedViewById(R.id.llCoursePickerLayout);
        if (linearLayoutCompat != null && linearLayoutCompat.getVisibility() == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Utils utils = Utils.INSTANCE;
            LinearLayoutCompat llCoursePickerLayout = (LinearLayoutCompat) _$_findCachedViewById(R.id.llCoursePickerLayout);
            kotlin.jvm.internal.i.f(llCoursePickerLayout, "llCoursePickerLayout");
            Utils.expand$default(utils, llCoursePickerLayout, 0L, 2, null);
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llCoursePickerLayout);
            if (linearLayoutCompat2 != null) {
                linearLayoutCompat2.setVisibility(0);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewCoursePickerBg);
            if (_$_findCachedViewById == null) {
                return true;
            }
            _$_findCachedViewById.setVisibility(0);
            return true;
        }
        Utils utils2 = Utils.INSTANCE;
        LinearLayoutCompat llCoursePickerLayout2 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llCoursePickerLayout);
        kotlin.jvm.internal.i.f(llCoursePickerLayout2, "llCoursePickerLayout");
        Utils.collapse$default(utils2, llCoursePickerLayout2, 0L, 2, null);
        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) _$_findCachedViewById(R.id.llCoursePickerLayout);
        if (linearLayoutCompat3 != null) {
            linearLayoutCompat3.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.viewCoursePickerBg);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(8);
        }
        return false;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        try {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            SubscriptionModel currentSubscriptionModel = subscriptionPersistence.getCurrentSubscriptionModel();
            if (!subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(currentSubscriptionModel.getPlan(), Constants.PR_COUPON_CODE_SKU) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.SUBSCRIPTION_EXPIRY_SHOWN, false)) {
                Q(currentSubscriptionModel.getExpiryTime());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17677u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        SubscriptionPersistence.INSTANCE.fetchData(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_custom_dashboard, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.G.clear();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.J.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            HashMap<hl.f, View> hashMap = this.G;
            hl.f fVar = hl.f.CAMPAIGN;
            View view2 = hashMap.get(fVar);
            boolean z10 = false;
            if (view2 != null && view2.getVisibility() == 0) {
                z10 = true;
            }
            if (z10 && (view = hashMap.get(fVar)) != null) {
                view.setVisibility(8);
            }
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        if (kotlin.jvm.internal.i.b(requireActivity().getIntent().getStringExtra(Constants.LINK_TYPE), Constants.SELLING_SCREEN_TEST)) {
            this.f17682z = requireActivity().getIntent().getStringExtra(Constants.LINK_ID);
        }
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        jl.e eVar = (jl.e) new o0(requireActivity).a(jl.e.class);
        eVar.C.e(getViewLifecycleOwner(), new fl.k(8, new d()));
        eVar.D.e(getViewLifecycleOwner(), new fl.k(9, new e(eVar, this)));
        eVar.H.e(getViewLifecycleOwner(), new fl.k(10, new f()));
        eVar.I.e(getViewLifecycleOwner(), new fl.k(11, new C0281g()));
        ((androidx.lifecycle.w) eVar.K.getValue()).e(getViewLifecycleOwner(), new fl.k(12, new h()));
        String str = null;
        ta.v.H(kc.f.H(eVar), kotlinx.coroutines.o0.f23642c, 0, new jl.k(eVar, null), 2);
        this.f17678v = eVar;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.viewCoursePickerBg);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnClickListener(new hl.d(this, 0));
        }
        ((BottomNavigationView) _$_findCachedViewById(R.id.bnvLibraryNavigation)).setOnNavigationItemSelectedListener(this.I);
        Menu menu = ((BottomNavigationView) _$_findCachedViewById(R.id.bnvLibraryNavigation)).getMenu();
        kotlin.jvm.internal.i.f(menu, "bnvLibraryNavigation.menu");
        menu.getItem(2).setTitle("Allie");
        MenuItem item = menu.getItem(3);
        Context requireContext = requireContext();
        Object obj = g0.a.f16164a;
        item.setIcon(a.c.b(requireContext, R.drawable.ic_consult));
        menu.getItem(3).setTitle("Experts");
        menu.getItem(4).setIcon(a.c.b(requireContext(), R.drawable.ic_goals));
        menu.getItem(4).setTitle("Goals");
        AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
        Context requireContext2 = requireContext();
        kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
        Typeface typeface = assetProviderSingleton.getTypeface(requireContext2, "Lato-Bold.ttf");
        int size = menu.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem mi2 = menu.getItem(i6);
            kotlin.jvm.internal.i.f(mi2, "mi");
            UtilsKt.applyFontToMenuItem(mi2, typeface, -1);
        }
        wn.k kVar = (wn.k) new o0(this).a(wn.k.class);
        kVar.e();
        kVar.f36804y.e(getViewLifecycleOwner(), new fl.k(13, new i()));
        if (sp.b.K() || !FirebasePersistence.getInstance().getUser().getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(ri.e.d(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
            I();
        }
        ap.f fVar = new ap.f();
        Application application = requireActivity().getApplication();
        kotlin.jvm.internal.i.f(application, "requireActivity().application");
        ap.h hVar = (ap.h) new o0(this, new kk.c(application, fVar)).a(ap.h.class);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getCurrentCourseName();
        }
        ap.h.e(hVar, str, false);
    }
}
