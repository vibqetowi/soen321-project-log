package com.theinnerhour.b2b.components.multiTracker.activity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import androidx.activity.h;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.c;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g6.g;
import hs.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import nn.v0;
import rr.b;
import t0.r0;
import ta.v;
import tn.e;
import wn.p;
import wn.t;
import yi.d;
/* compiled from: MultiTrackerActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/activity/MultiTrackerActivity;", "Lrr/a;", "Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MultiTrackerActivity extends rr.a implements MultiTrackerListener {
    public static final /* synthetic */ int J = 0;
    public int A;
    public int B;
    public final ArrayList<String> C;
    public final ArrayList<String> D;
    public final ArrayList<String> E;
    public boolean F;
    public String G;
    public String H;
    public c I;

    /* renamed from: w  reason: collision with root package name */
    public final String f11479w;

    /* renamed from: x  reason: collision with root package name */
    public y f11480x;

    /* renamed from: y  reason: collision with root package name */
    public b f11481y;

    /* renamed from: z  reason: collision with root package name */
    public int f11482z;

    /* compiled from: MultiTrackerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends h {
        public a() {
            super(true);
        }

        @Override // androidx.activity.h
        public final void a() {
            MultiTrackerActivity.this.o0();
        }
    }

    public MultiTrackerActivity() {
        new LinkedHashMap();
        this.f11479w = LogHelper.INSTANCE.makeLogTag("MultiTrackerActivity");
        this.A = -1;
        this.B = -1;
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.H = "";
    }

    public static void u0() {
        try {
            if (!ApplicationPersistence.getInstance().getBooleanValue("tracker_app_feedback_shown", false)) {
                if (ApplicationPersistence.getInstance().containsKey("latest_track_time")) {
                    if (Utils.INSTANCE.getTimeInSeconds() - ApplicationPersistence.getInstance().getLongValue("latest_track_time") >= 86400) {
                        wn.b.f36765a.getClass();
                        if (wn.b.a() >= 2) {
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, true);
                            ApplicationPersistence.getInstance().setStringValue(Constants.APP_FEEDBACK_TRIGGER, "v1_tracker");
                            ApplicationPersistence.getInstance().setBooleanValue("tracker_app_feedback_shown", true);
                            ApplicationPersistence.getInstance().deleteKey("latest_track_time");
                        }
                    }
                } else {
                    ApplicationPersistence.getInstance().setLongValue("latest_track_time", Utils.INSTANCE.getTimeInSeconds());
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("ih_trackercard", "exception", e10);
        }
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final boolean getTutorialFlag() {
        return this.F;
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void goToNextScreen() {
        t0();
    }

    @Override // rr.a
    public final void n0() {
        String str;
        try {
            int i6 = this.B;
            ArrayList<String> arrayList = this.C;
            ArrayList<String> arrayList2 = this.D;
            ArrayList<String> arrayList3 = this.E;
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            } else {
                str = null;
            }
            MultiTrackerModel multiTrackerModel = new MultiTrackerModel(i6, arrayList, arrayList2, arrayList3, str);
            t tVar = (t) new o0(this).a(t.class);
            String a10 = FirebaseAuth.getInstance().a();
            if (a10 != null) {
                tVar.getClass();
                v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new p(multiTrackerModel, tVar, a10, null), 3);
                String str3 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("isOnboarding", this.F);
                bundle.putInt("mood", this.B);
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                k kVar = k.f19476a;
                gk.a.b(bundle, "new_tracker_saved");
                u0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11479w, e10);
        }
        Intent intent = new Intent();
        intent.putExtra("mood", this.B);
        setResult(-1, intent);
        finish();
    }

    @Override // rr.a
    public final void o0() {
        try {
            b.a aVar = new b.a(this);
            aVar.f1046a.f1031g = "Are you sure you want to exit?";
            aVar.b("Ok", new g(9, this));
            aVar.a("Cancel", new d(14));
            aVar.create().show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11479w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int i6;
        boolean z10;
        int i10;
        c cVar;
        c cVar2;
        c cVar3;
        RobertoButton robertoButton;
        FragmentContainerView fragmentContainerView;
        CoordinatorLayout coordinatorLayout;
        AppCompatImageView appCompatImageView;
        int i11;
        ConstraintLayout constraintLayout;
        super.onCreate(bundle);
        try {
            c a10 = c.a(getLayoutInflater());
            this.I = a10;
            setContentView((CoordinatorLayout) a10.f8941a);
            Intent intent = getIntent();
            RobertoTextView robertoTextView = null;
            if (intent != null) {
                str = intent.getStringExtra("source");
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            this.H = str;
            Intent intent2 = getIntent();
            if (intent2 != null) {
                i6 = intent2.getIntExtra("mood", -1);
            } else {
                i6 = -1;
            }
            this.B = i6;
            Intent intent3 = getIntent();
            if (intent3 != null) {
                z10 = intent3.getBooleanExtra("tutorial", false);
            } else {
                z10 = false;
            }
            this.F = z10;
            r0.a(getWindow(), false);
            c cVar4 = this.I;
            if (cVar4 != null && (constraintLayout = (ConstraintLayout) cVar4.f8945e) != null) {
                InsetsUtils.INSTANCE.addBottomNavHeight(constraintLayout);
            }
            int i12 = this.B;
            if (i12 == -1) {
                Utils.INSTANCE.showCustomToast(this, "Something went wrong");
                finish();
                return;
            }
            c cVar5 = this.I;
            if (cVar5 != null && (appCompatImageView = (AppCompatImageView) cVar5.f) != null) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    i11 = R.drawable.ic_tracker_mood_5;
                                }
                            } else {
                                i11 = R.drawable.ic_tracker_mood_4;
                            }
                        } else {
                            i11 = R.drawable.ic_tracker_mood_3;
                        }
                    } else {
                        i11 = R.drawable.ic_tracker_mood_2;
                    }
                    appCompatImageView.setImageResource(i11);
                }
                i11 = R.drawable.ic_tracker_mood_1;
                appCompatImageView.setImageResource(i11);
            }
            c cVar6 = this.I;
            if (cVar6 != null) {
                robertoTextView = (RobertoTextView) cVar6.f8947h;
            }
            if (robertoTextView != null) {
                int i13 = this.B;
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    str2 = "Great";
                                }
                            } else {
                                str2 = "Good";
                            }
                        } else {
                            str2 = "Neutral";
                        }
                    } else {
                        str2 = "Bad";
                    }
                } else {
                    str2 = "Terrible";
                }
                robertoTextView.setText(str2);
            }
            int i14 = this.B;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 == 5) {
                                i10 = R.color.trackerYellow;
                            }
                        } else {
                            i10 = R.color.trackerBlue;
                        }
                    } else {
                        i10 = R.color.trackerPink;
                    }
                } else {
                    i10 = R.color.trackerPurple;
                }
                this.A = i10;
                cVar = this.I;
                if (cVar != null && (coordinatorLayout = (CoordinatorLayout) cVar.f8946g) != null) {
                    coordinatorLayout.setBackgroundColor(g0.a.b(this, i10));
                }
                y supportFragmentManager = getSupportFragmentManager();
                i.f(supportFragmentManager, "supportFragmentManager");
                this.f11480x = supportFragmentManager;
                v0();
                getOnBackPressedDispatcher().a(this, new a());
                cVar2 = this.I;
                if (cVar2 != null && (fragmentContainerView = (FragmentContainerView) cVar2.f8944d) != null) {
                    BottomSheetBehavior.from(fragmentContainerView).setState(4);
                    BottomSheetBehavior.from(fragmentContainerView).setPeekHeight((getResources().getDisplayMetrics().heightPixels / 100) * 78);
                }
                cVar3 = this.I;
                if (cVar3 == null && (robertoButton = (RobertoButton) cVar3.f8942b) != null) {
                    robertoButton.setOnClickListener(new v0(3, this));
                    return;
                }
            }
            i10 = R.color.trackerGrey;
            this.A = i10;
            cVar = this.I;
            if (cVar != null) {
                coordinatorLayout.setBackgroundColor(g0.a.b(this, i10));
            }
            y supportFragmentManager2 = getSupportFragmentManager();
            i.f(supportFragmentManager2, "supportFragmentManager");
            this.f11480x = supportFragmentManager2;
            v0();
            getOnBackPressedDispatcher().a(this, new a());
            cVar2 = this.I;
            if (cVar2 != null) {
                BottomSheetBehavior.from(fragmentContainerView).setState(4);
                BottomSheetBehavior.from(fragmentContainerView).setPeekHeight((getResources().getDisplayMetrics().heightPixels / 100) * 78);
            }
            cVar3 = this.I;
            if (cVar3 == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11479w, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        this.I = null;
        super.onDestroy();
    }

    @Override // rr.a
    public final void r0(rr.b bVar) {
        try {
            this.f11481y = bVar;
            y yVar = this.f11480x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                rr.b bVar2 = this.f11481y;
                if (bVar2 != null) {
                    aVar.f(R.id.multiTrackerBottomSheetFragmentContainer, bVar2, null);
                    aVar.j();
                    return;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11479w, e10);
        }
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void setActivities(List<String> activities) {
        i.g(activities, "activities");
        ArrayList<String> arrayList = this.E;
        arrayList.clear();
        arrayList.addAll(activities);
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void setButtonEnabled(boolean z10) {
        RobertoButton robertoButton;
        int i6;
        c cVar = this.I;
        if (cVar != null) {
            robertoButton = (RobertoButton) cVar.f8942b;
        } else {
            robertoButton = null;
        }
        if (robertoButton != null) {
            if (z10) {
                i6 = R.color.title_high_contrast;
            } else {
                i6 = R.color.title_high_contrast_35_opaque;
            }
            robertoButton.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, i6)));
        }
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void setCtaText(String text) {
        RobertoButton robertoButton;
        i.g(text, "text");
        c cVar = this.I;
        if (cVar != null) {
            robertoButton = (RobertoButton) cVar.f8942b;
        } else {
            robertoButton = null;
        }
        if (robertoButton != null) {
            robertoButton.setText(text);
        }
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void setLogNotes(String log) {
        i.g(log, "log");
        this.G = log;
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void setNegativeEmotions(List<String> negativeEmotions) {
        i.g(negativeEmotions, "negativeEmotions");
        ArrayList<String> arrayList = this.D;
        arrayList.clear();
        arrayList.addAll(negativeEmotions);
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener
    public final void setPositiveEmotions(List<String> positiveEmotions) {
        i.g(positiveEmotions, "positiveEmotions");
        ArrayList<String> arrayList = this.C;
        arrayList.clear();
        arrayList.addAll(positiveEmotions);
    }

    @Override // rr.a
    public final void t0() {
        this.f11482z++;
        v0();
    }

    public final void v0() {
        rr.b hVar;
        try {
            y yVar = this.f11480x;
            if (yVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                if (this.f11482z == 0) {
                    aVar.h(R.anim.slide_fade_in, R.anim.slide_fade_out, 0, 0);
                } else {
                    aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
                }
                int i6 = this.f11482z;
                if (i6 != 0) {
                    if (i6 != 1) {
                        n0();
                        return;
                    }
                    hVar = new e();
                } else {
                    hVar = new tn.h();
                }
                this.f11481y = hVar;
                if (hVar.getArguments() == null) {
                    rr.b bVar = this.f11481y;
                    if (bVar != null) {
                        bVar.setArguments(new Bundle());
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                }
                rr.b bVar2 = this.f11481y;
                if (bVar2 != null) {
                    Bundle arguments = bVar2.getArguments();
                    if (arguments != null) {
                        arguments.putInt("mood", this.B);
                        arguments.putInt("color", this.A);
                    }
                    rr.b bVar3 = this.f11481y;
                    if (bVar3 != null) {
                        aVar.f(R.id.multiTrackerBottomSheetFragmentContainer, bVar3, null);
                        aVar.j();
                        return;
                    }
                    i.q("customFragment");
                    throw null;
                }
                i.q("customFragment");
                throw null;
            }
            i.q("fragmentManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11479w, e10);
        }
    }
}
