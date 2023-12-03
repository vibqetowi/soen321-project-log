package je;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.messaging.m0;
import com.moengage.core.internal.lifecycle.ApplicationLifecycleObserver;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.components.dynamicActivities.data.NewDynamicActivityUploadModel;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14CScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N24ScreenFragment;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertStoriesActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.g1;
import ek.h;
import ik.c1;
import ik.d1;
import ik.h1;
import ik.l;
import ik.n1;
import ik.o1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import je.p;
import oe.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f21884u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f21885v;

    public /* synthetic */ o(int i6, Object obj) {
        this.f21884u = i6;
        this.f21885v = obj;
    }

    private final void a() {
        sj.m this$0 = (sj.m) this.f21885v;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        ca.a.Z0(this$0.f31619c);
        if (fj.e.f15075b == null) {
            synchronized (fj.e.class) {
                fj.e eVar = fj.e.f15075b;
                if (eVar == null) {
                    eVar = new fj.e();
                }
                fj.e.f15075b = eVar;
            }
        }
        ih.p c10 = fj.e.c(this$0.f31619c);
        if (c10 != null) {
            c10.f20106e.c(new ah.e("MOE_RICH_PUSH_INTENT_ACTION_TASK", false, new ne.u(c10, 15, this$0)));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        com.google.android.exoplayer2.w player;
        pl.c0 c0Var;
        RobertoTextView robertoTextView;
        Object obj;
        String str;
        String str2;
        Long l2 = null;
        String str3 = null;
        l2 = null;
        int i6 = 0;
        switch (this.f21884u) {
            case 0:
                p.a aVar = (p.a) this.f21885v;
                k kVar = aVar.f21896b;
                kVar.getClass();
                p.c cVar = (p.c) kVar.f21846a.z("Collect garbage", new dd.a(kVar, 19, p.this));
                aVar.f21897c = true;
                aVar.f21895a.a(a.c.GARBAGE_COLLECTION, p.f21892d, new o(0, aVar));
                return;
            case 1:
                r0 r0Var = (r0) this.f21885v;
                r0Var.getClass();
                Boolean[] boolArr = {Boolean.FALSE};
                s0 s0Var = r0Var.f21914u;
                s0Var.G("SELECT migration_name FROM data_migrations").d(new j0(2, boolArr));
                if (boolArr[0].booleanValue()) {
                    HashSet hashSet = new HashSet();
                    s0Var.G("SELECT DISTINCT uid FROM mutation_queues").d(new j0(3, hashSet));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ge.e eVar = new ge.e((String) it.next());
                        w p10 = s0Var.p(eVar, s0Var.o(eVar));
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = ((ArrayList) ((q0) p10).j()).iterator();
                        while (it2.hasNext()) {
                            hashSet2.addAll(((le.g) it2.next()).b());
                        }
                        b n10 = s0Var.n(eVar);
                        f o10 = s0Var.o(eVar);
                        u0 u0Var = s0Var.f;
                        new h(u0Var, p10, n10, o10).g(u0Var.e(hashSet2));
                    }
                    int i10 = androidx.work.k.f3323a;
                    s0Var.F("DELETE FROM data_migrations WHERE migration_name = ?", "BUILD_OVERLAYS");
                    return;
                }
                return;
            case 2:
                ne.b bVar = ne.b.this;
                kc.f.A(1, bVar.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(bVar)));
                bVar.f26168i = ne.y.Open;
                bVar.f26172m.onOpen();
                if (bVar.f26161a == null) {
                    bVar.f26161a = bVar.f.a(bVar.f26167h, ne.b.f26160q, new ne.a(bVar, 1));
                    return;
                }
                return;
            case 3:
                ne.s sVar = (ne.s) this.f21885v;
                sVar.f26264c = null;
                if (sVar.f26262a == he.w.UNKNOWN) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
                sVar.a(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
                sVar.b(he.w.OFFLINE);
                return;
            case 4:
                Throwable th2 = (Throwable) this.f21885v;
                if (th2 instanceof OutOfMemoryError) {
                    OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.4.4) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
                    outOfMemoryError.initCause(th2);
                    throw outOfMemoryError;
                }
                throw new RuntimeException("Internal error in Cloud Firestore (24.4.4).", th2);
            case 5:
                a.C0452a c0452a = (a.C0452a) this.f21885v;
                oe.a.this.d();
                if (c0452a.f27385b != null) {
                    c0452a.b();
                    c0452a.f27384a.run();
                    return;
                }
                return;
            case 6:
                RuntimeException runtimeException = (RuntimeException) this.f21885v;
                SecureRandom secureRandom = oe.n.f27432a;
                throw runtimeException;
            case 7:
                Object obj2 = se.c.f31470m;
                ((se.c) this.f21885v).c(false);
                return;
            case 8:
                com.google.firebase.messaging.b0 b0Var = (com.google.firebase.messaging.b0) this.f21885v;
                synchronized (b0Var.f9683d) {
                    SharedPreferences.Editor edit = b0Var.f9680a.edit();
                    String str4 = b0Var.f9681b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it3 = b0Var.f9683d.iterator();
                    while (it3.hasNext()) {
                        sb2.append(it3.next());
                        sb2.append(b0Var.f9682c);
                    }
                    edit.putString(str4, sb2.toString()).commit();
                }
                return;
            case 9:
                m0.a aVar2 = (m0.a) this.f21885v;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar2.f9760a.getAction() + " Releasing WakeLock.");
                aVar2.f9761b.d(null);
                return;
            case 10:
                qg.g this$0 = (qg.g) this.f21885v;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ApplicationLifecycleObserver applicationLifecycleObserver = this$0.f;
                    if (applicationLifecycleObserver != null) {
                        androidx.lifecycle.z.C.f2476z.a(applicationLifecycleObserver);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    this$0.f29546a.f20105d.a(1, th3, new qg.f(this$0));
                    return;
                }
            case 11:
                oi.a this$02 = (oi.a) this.f21885v;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.a(new qi.e(1));
                return;
            case 12:
                AlertDialog.Builder alertDialog = (AlertDialog.Builder) this.f21885v;
                kotlin.jvm.internal.i.g(alertDialog, "$alertDialog");
                alertDialog.create().show();
                return;
            case 13:
                a();
                return;
            case 14:
                h.a holder = (h.a) this.f21885v;
                kotlin.jvm.internal.i.g(holder, "$holder");
                Drawable background = ((ConstraintLayout) holder.f2751a.findViewById(R.id.basicCourseBackground)).getBackground();
                if (background instanceof RippleDrawable) {
                    background.setHotspot(0.0f, 0.0f);
                    ((RippleDrawable) background).setState(new int[]{16842919, 16842910});
                    new Handler().postDelayed(new dk.m(background, 1), 150L);
                    return;
                }
                return;
            case 15:
                g1.a holder2 = (g1.a) this.f21885v;
                kotlin.jvm.internal.i.g(holder2, "$holder");
                Drawable background2 = ((ConstraintLayout) holder2.f2751a.findViewById(R.id.basicCourseBackground)).getBackground();
                if (background2 instanceof RippleDrawable) {
                    background2.setHotspot(0.0f, 0.0f);
                    ((RippleDrawable) background2).setState(new int[]{16842919, 16842910});
                    new Handler().postDelayed(new dk.m(background2, 2), 150L);
                    return;
                }
                return;
            case 16:
                ik.l this$03 = (ik.l) this.f21885v;
                int i11 = ik.l.f20225y;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                UtilsKt.logError$default(this$03.f20226u, null, new l.a(), 2, null);
                return;
            case 17:
                ik.x this$04 = (ik.x) this.f21885v;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                AssessmentListener assessmentListener = this$04.f20326v;
                if (assessmentListener != null) {
                    AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                    return;
                }
                return;
            case 18:
                ik.d0 this$05 = (ik.d0) this.f21885v;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (this$05.isAdded()) {
                    RobertoButton robertoButton = (RobertoButton) this$05._$_findCachedViewById(R.id.assessmentOption1);
                    if (robertoButton != null) {
                        robertoButton.setOnClickListener(this$05);
                    }
                    RobertoButton robertoButton2 = (RobertoButton) this$05._$_findCachedViewById(R.id.assessmentOption2);
                    if (robertoButton2 != null) {
                        robertoButton2.setOnClickListener(this$05);
                    }
                    RobertoButton robertoButton3 = (RobertoButton) this$05._$_findCachedViewById(R.id.assessmentOption3);
                    if (robertoButton3 != null) {
                        robertoButton3.setOnClickListener(this$05);
                    }
                    RobertoButton robertoButton4 = (RobertoButton) this$05._$_findCachedViewById(R.id.assessmentOption4);
                    if (robertoButton4 != null) {
                        robertoButton4.setOnClickListener(this$05);
                    }
                    RobertoButton robertoButton5 = (RobertoButton) this$05._$_findCachedViewById(R.id.assessmentOption5);
                    if (robertoButton5 != null) {
                        robertoButton5.setOnClickListener(this$05);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ik.s0 this$06 = (ik.s0) this.f21885v;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                if (this$06.isAdded() && this$06.getActivity() != null) {
                    androidx.fragment.app.p activity = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    ((InitialAssessmentActivity) activity).R = true;
                }
                androidx.fragment.app.p activity2 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity2).t0();
                return;
            case 20:
                c1 this$07 = (c1) this.f21885v;
                int i12 = c1.f20138y;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                try {
                    if (this$07.isAdded()) {
                        androidx.fragment.app.p activity3 = this$07.getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity3).t0();
                    } else {
                        this$07.f20141w = true;
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 21:
                d1 this$08 = (d1) this.f21885v;
                int i13 = d1.f20157z;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (this$08.isAdded()) {
                    ((RobertoTextView) this$08._$_findCachedViewById(R.id.response1)).setOnClickListener(this$08);
                    ((RobertoTextView) this$08._$_findCachedViewById(R.id.response2)).setOnClickListener(this$08);
                    ((RobertoTextView) this$08._$_findCachedViewById(R.id.response3)).setOnClickListener(this$08);
                    return;
                }
                return;
            case 22:
                h1 this$09 = (h1) this.f21885v;
                int i14 = h1.A;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                if (this$09.isAdded()) {
                    ((RobertoTextView) this$09._$_findCachedViewById(R.id.response1)).setOnClickListener(this$09);
                    ((RobertoTextView) this$09._$_findCachedViewById(R.id.response2)).setOnClickListener(this$09);
                    ((RobertoTextView) this$09._$_findCachedViewById(R.id.response3)).setOnClickListener(this$09);
                    ((RobertoTextView) this$09._$_findCachedViewById(R.id.response4)).setOnClickListener(this$09);
                    ((RobertoTextView) this$09._$_findCachedViewById(R.id.response5)).setOnClickListener(this$09);
                    return;
                }
                return;
            case 23:
                n1 this$010 = (n1) this.f21885v;
                int i15 = n1.f20255w;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                if (this$010.isAdded()) {
                    ((FrameLayout) this$010._$_findCachedViewById(R.id.blanketLayout)).setOnClickListener(new w5.i0(18, this$010));
                    return;
                }
                return;
            case 24:
                o1 this$011 = (o1) this.f21885v;
                int i16 = o1.f20262z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                if (this$011.isAdded()) {
                    ((RobertoTextView) this$011._$_findCachedViewById(R.id.response1)).setOnClickListener(this$011);
                    ((RobertoTextView) this$011._$_findCachedViewById(R.id.response2)).setOnClickListener(this$011);
                    ((RobertoTextView) this$011._$_findCachedViewById(R.id.response3)).setOnClickListener(this$011);
                    ((RobertoTextView) this$011._$_findCachedViewById(R.id.response4)).setOnClickListener(this$011);
                    return;
                }
                return;
            case 25:
                CoachChatActivity this$012 = (CoachChatActivity) this.f21885v;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                LogHelper.INSTANCE.i(this$012.f10626v, "typing runnable online");
                rk.f fVar = this$012.G;
                if (fVar != null) {
                    fVar.f(Constants.ONLINE);
                    return;
                } else {
                    kotlin.jvm.internal.i.q("chatViewModel");
                    throw null;
                }
            case 26:
                N14CScreenFragment this$013 = (N14CScreenFragment) this.f21885v;
                int i17 = N14CScreenFragment.S;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                PlayerView playerView = (PlayerView) this$013._$_findCachedViewById(R.id.pvN14CScreenVideoPlayer);
                if (playerView != null && (player = playerView.getPlayer()) != null) {
                    l2 = Long.valueOf(player.getCurrentPosition());
                }
                if (l2 != null) {
                    this$013.I = l2.longValue() + this$013.J;
                }
                ((AppCompatSeekBar) this$013._$_findCachedViewById(R.id.sbN14CScreenSeek)).setProgress((int) this$013.I);
                if (this$013.E) {
                    this$013.P.postDelayed(new o(26, this$013), this$013.f10975x);
                    return;
                }
                return;
            case 27:
                N24ScreenFragment this$014 = (N24ScreenFragment) this.f21885v;
                int i18 = N24ScreenFragment.F;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                int i19 = this$014.B + 1;
                this$014.B = i19;
                ArrayList arrayList = this$014.A;
                if (arrayList != null) {
                    c0Var = (pl.c0) is.u.j2(i19, arrayList);
                } else {
                    c0Var = null;
                }
                if (c0Var != null) {
                    try {
                        if (!this$014.P().c0) {
                            Toast.makeText(this$014.requireContext(), (int) R.string.monetization_data_fetch_error, 0).show();
                            this$014.requireActivity().finish();
                            return;
                        }
                        String str5 = c0Var.f28555b;
                        if (str5 != null && this$014.isAdded()) {
                            if (str5.length() > 0 && (robertoTextView = (RobertoTextView) this$014._$_findCachedViewById(R.id.tvN24ScreenImageOverlayText)) != null) {
                                robertoTextView.setVisibility(0);
                                robertoTextView.setText(str5);
                                String str6 = c0Var.f28556c;
                                if (str6 != null) {
                                    robertoTextView.setTextColor(Color.parseColor(str6));
                                }
                            }
                            String str7 = c0Var.f28554a;
                            if (((str7 == null || gv.n.B0(str7)) ? 1 : 1) == 0) {
                                com.bumptech.glide.e<Drawable> p11 = Glide.g(this$014.requireContext()).p(str7);
                                p11.w(new pl.f0(this$014, c0Var));
                                p11.d(k4.l.f22878a).q(true).B((ShapeableImageView) this$014._$_findCachedViewById(R.id.ivRowN24ImageGenerator));
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(this$014.f11039z, e11);
                        return;
                    }
                }
                ArrayList arrayList2 = this$014.f11038y;
                if (arrayList2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            if (kotlin.jvm.internal.i.b(((HashMap) obj).get("populate_key"), "n24_options")) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap != null) {
                        Object obj3 = hashMap.get("screen_slug");
                        if (obj3 instanceof String) {
                            str = (String) obj3;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            Object obj4 = hashMap.get("screen_id");
                            if (obj4 instanceof String) {
                                str2 = (String) obj4;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                Object obj5 = hashMap.get("screen_data_key");
                                if (obj5 instanceof String) {
                                    str3 = (String) obj5;
                                }
                                if (str3 != null) {
                                    this$014.P().Z = new NewDynamicActivityUploadModel(str, str2, str3, this$014.C);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ql.i this$015 = (ql.i) this.f21885v;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                PlaybackStateCompat playbackStateCompat = this$015.f29729z;
                int i20 = playbackStateCompat.f915u;
                long j10 = playbackStateCompat.f916v;
                if (i20 == 3) {
                    j10 = (((float) (SystemClock.elapsedRealtime() - playbackStateCompat.B)) * playbackStateCompat.f918x) + ((float) j10);
                }
                androidx.lifecycle.w<Long> wVar = this$015.C;
                Long d10 = wVar.d();
                if (d10 == null || d10.longValue() != j10) {
                    wVar.i(Long.valueOf(j10));
                }
                if (this$015.A) {
                    this$015.F.postDelayed(new o(28, this$015), 100L);
                    return;
                }
                return;
            default:
                ExpertStoriesActivity this$016 = (ExpertStoriesActivity) this.f21885v;
                int i21 = ExpertStoriesActivity.I;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                try {
                    int i22 = this$016.f11144x;
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 != 3) {
                                ProgressBar progressBar = (ProgressBar) this$016.n0(R.id.pbExpertStoriesOne);
                                if (progressBar != null) {
                                    com.google.android.exoplayer2.a0 a0Var = this$016.f11142v;
                                    if (a0Var != null) {
                                        i6 = (int) a0Var.getCurrentPosition();
                                    }
                                    progressBar.setProgress(i6);
                                }
                            } else {
                                ProgressBar progressBar2 = (ProgressBar) this$016.n0(R.id.pbExpertStoriesFour);
                                if (progressBar2 != null) {
                                    com.google.android.exoplayer2.a0 a0Var2 = this$016.f11142v;
                                    if (a0Var2 != null) {
                                        i6 = (int) a0Var2.getCurrentPosition();
                                    }
                                    progressBar2.setProgress(i6);
                                }
                            }
                        } else {
                            ProgressBar progressBar3 = (ProgressBar) this$016.n0(R.id.pbExpertStoriesThree);
                            if (progressBar3 != null) {
                                com.google.android.exoplayer2.a0 a0Var3 = this$016.f11142v;
                                if (a0Var3 != null) {
                                    i6 = (int) a0Var3.getCurrentPosition();
                                }
                                progressBar3.setProgress(i6);
                            }
                        }
                    } else {
                        ProgressBar progressBar4 = (ProgressBar) this$016.n0(R.id.pbExpertStoriesTwo);
                        if (progressBar4 != null) {
                            com.google.android.exoplayer2.a0 a0Var4 = this$016.f11142v;
                            if (a0Var4 != null) {
                                i6 = (int) a0Var4.getCurrentPosition();
                            }
                            progressBar4.setProgress(i6);
                        }
                    }
                    if (this$016.f11146z) {
                        this$016.f11145y.postDelayed(new o(29, this$016), 100L);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$016.A, e12);
                    return;
                }
        }
    }
}
