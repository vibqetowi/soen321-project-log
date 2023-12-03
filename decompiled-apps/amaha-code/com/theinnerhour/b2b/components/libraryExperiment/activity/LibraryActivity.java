package com.theinnerhour.b2b.components.libraryExperiment.activity;

import an.d0;
import an.f;
import an.h;
import an.j;
import an.n;
import an.t;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItemAccessModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import dk.c0;
import hs.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import rr.b;
/* compiled from: LibraryActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/libraryExperiment/activity/LibraryActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LibraryActivity extends c {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: v  reason: collision with root package name */
    public final String f11291v;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet<MiniCourseMetadata> f11292w;

    /* renamed from: x  reason: collision with root package name */
    public final HashSet<MiniCourse> f11293x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<String, LibraryCollectionItemAccessModel> f11294y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, String> f11295z;

    public LibraryActivity() {
        new LinkedHashMap();
        this.f11291v = LogHelper.INSTANCE.makeLogTag("LibraryActivity");
        this.f11292w = new HashSet<>();
        this.f11293x = new HashSet<>();
        this.f11294y = new HashMap<>();
        this.f11295z = new HashMap<>();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t tVar;
        boolean z10;
        if (this.D) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Fragment E2 = getSupportFragmentManager().E(R.id.flLibraryActivityMain);
        if (E2 instanceof t) {
            tVar = (t) E2;
        } else {
            tVar = null;
        }
        boolean z11 = false;
        if (tVar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) tVar._$_findCachedViewById(R.id.clLibraryDashboardCoachMarkTopPicksContainer);
            if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar._$_findCachedViewById(R.id.clLibraryDashboardCoachMarkTopPicksContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
                z11 = true;
            }
        }
        this.D = z11;
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void n0(Bundle bundle, String str) {
        Fragment fVar;
        try {
            switch (str.hashCode()) {
                case -1983070683:
                    if (str.equals("resources")) {
                        fVar = new f();
                        break;
                    } else {
                        fVar = new t();
                        break;
                    }
                case -1852828939:
                    if (str.equals("short_courses")) {
                        fVar = new d0();
                        break;
                    } else {
                        fVar = new t();
                        break;
                    }
                case -1741312354:
                    if (str.equals("collection")) {
                        fVar = new n();
                        break;
                    } else {
                        fVar = new t();
                        break;
                    }
                case 89485527:
                    if (str.equals("all_short_courses")) {
                        fVar = new h();
                        break;
                    } else {
                        fVar = new t();
                        break;
                    }
                case 114726152:
                    if (str.equals("top_picks")) {
                        fVar = new j();
                        break;
                    }
                    fVar = new t();
                    break;
                case 1046975479:
                    if (str.equals("all_collections")) {
                        fVar = new an.c();
                        break;
                    } else {
                        fVar = new t();
                        break;
                    }
                default:
                    fVar = new t();
                    break;
            }
            if (Utils.INSTANCE.checkConnectivity(this)) {
                y supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
                fVar.setArguments(bundle);
                k kVar = k.f19476a;
                aVar.e(R.id.flLibraryActivityMain, fVar, null, 1);
                aVar.d(str);
                aVar.j();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11291v, e10);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        b bVar;
        try {
            if (this.C) {
                finish();
                return;
            }
            Fragment E2 = getSupportFragmentManager().E(R.id.flLibraryActivityMain);
            if (E2 instanceof b) {
                bVar = (b) E2;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            if (bVar != null && !bVar.I()) {
                z10 = true;
            }
            if (!z10) {
                super.onBackPressed();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11291v, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        t tVar;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.activity_library);
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            boolean z10 = false;
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                tVar = new t();
                tVar.setArguments(getIntent().getExtras());
            } else {
                tVar = new t();
            }
            aVar.f(R.id.flLibraryActivityMain, tVar, null);
            aVar.j();
            y supportFragmentManager2 = getSupportFragmentManager();
            c0 c0Var = new c0(this, 1);
            if (supportFragmentManager2.f2316m == null) {
                supportFragmentManager2.f2316m = new ArrayList<>();
            }
            supportFragmentManager2.f2316m.add(c0Var);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11291v, e10);
        }
    }
}
