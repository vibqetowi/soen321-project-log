package qm;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import cdflynn.android.library.turn.TurnLayoutManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.TurnLayoutCustomManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.e0;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ol.r;
/* compiled from: JournalTipsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm/q;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends nm.h {
    public static final /* synthetic */ int D = 0;

    /* renamed from: w  reason: collision with root package name */
    public w f29907w;

    /* renamed from: x  reason: collision with root package name */
    public int f29908x;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f29906v = LogHelper.INSTANCE.makeLogTag("JournalTipsFragment");

    /* renamed from: y  reason: collision with root package name */
    public boolean f29909y = true;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<HashMap<String, Object>> f29910z = new ArrayList<>();
    public hs.f<Integer, Integer> A = new hs.f<>(4, 0);
    public final a B = new a();

    /* compiled from: JournalTipsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type cdflynn.android.library.turn.TurnLayoutManager");
                TurnLayoutManager turnLayoutManager = (TurnLayoutManager) layoutManager;
                q qVar = q.this;
                w wVar = qVar.f29907w;
                if (wVar != null) {
                    View d10 = wVar.d(turnLayoutManager);
                    if (d10 != null) {
                        int i10 = qVar.f29908x;
                        int position = turnLayoutManager.getPosition(d10);
                        qVar.f29908x = position;
                        if (i10 != position) {
                            qVar.J();
                            return;
                        }
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("snapper");
                throw null;
            }
        }
    }

    /* compiled from: JournalTipsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ hs.j<String, String, String> f29913b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f29914c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f29915d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f29916e;
        public final /* synthetic */ ObjectAnimator f;

        public b(hs.j<String, String, String> jVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4) {
            this.f29913b = jVar;
            this.f29914c = objectAnimator;
            this.f29915d = objectAnimator2;
            this.f29916e = objectAnimator3;
            this.f = objectAnimator4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            q qVar = q.this;
            RobertoTextView robertoTextView = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvJournalTipsCount);
            if (robertoTextView != null) {
                robertoTextView.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvJournalTipsTip);
            if (robertoTextView2 != null) {
                robertoTextView2.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvJournalTipsDescription);
            if (robertoTextView3 != null) {
                robertoTextView3.setAlpha(0.0f);
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvJournalTipsCount);
            hs.j<String, String, String> jVar = this.f29913b;
            if (robertoTextView4 != null) {
                robertoTextView4.setText(jVar.f19473u);
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvJournalTipsTip);
            if (robertoTextView5 != null) {
                robertoTextView5.setText(jVar.f19474v);
            }
            RobertoTextView robertoTextView6 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvJournalTipsDescription);
            if (robertoTextView6 != null) {
                robertoTextView6.setText(jVar.f19475w);
            }
            ObjectAnimator objectAnimator = this.f29914c;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            ObjectAnimator objectAnimator2 = this.f29915d;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
            ObjectAnimator objectAnimator3 = this.f29916e;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
            ObjectAnimator objectAnimator4 = this.f;
            if (objectAnimator4 != null) {
                objectAnimator4.removeAllListeners();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    /* compiled from: JournalTipsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f29918b;

        public c(ObjectAnimator objectAnimator) {
            this.f29918b = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            q qVar = q.this;
            qVar.f29909y = true;
            ObjectAnimator objectAnimator = this.f29918b;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
            }
            if (qVar.f29908x == qVar.f29910z.size() - 1) {
                ((RobertoButton) qVar._$_findCachedViewById(R.id.rbJournalTipButton)).setVisibility(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    public final void J() {
        Integer num;
        try {
            K();
            int i6 = this.f29908x;
            if (i6 == 0) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsPrevious);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(4);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsNext);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
            } else if (i6 == this.f29910z.size() - 1) {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsPrevious);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsNext);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setVisibility(4);
                }
            } else {
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsPrevious);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setVisibility(0);
                }
                AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsNext);
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setVisibility(0);
                }
            }
            AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsPrevious);
            Integer num2 = null;
            if (appCompatImageView7 != null) {
                num = Integer.valueOf(appCompatImageView7.getVisibility());
            } else {
                num = null;
            }
            AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsNext);
            if (appCompatImageView8 != null) {
                num2 = Integer.valueOf(appCompatImageView8.getVisibility());
            }
            this.A = new hs.f<>(num, num2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29906v, e10);
        }
    }

    public final void K() {
        Object obj;
        String str;
        Object obj2;
        try {
            this.f29909y = false;
            String str2 = (this.f29908x + 1) + " / " + this.f29910z.size();
            HashMap hashMap = (HashMap) u.j2(this.f29908x, this.f29910z);
            String str3 = null;
            if (hashMap != null) {
                obj = hashMap.get("title");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap hashMap2 = (HashMap) u.j2(this.f29908x, this.f29910z);
            if (hashMap2 != null) {
                obj2 = hashMap2.get("description");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            }
            hs.j jVar = new hs.j(str2, str, str3);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsCount), "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsTip), "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(250L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsDescription), "alpha", 1.0f, 0.0f);
            ofFloat3.setDuration(250L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsCount), "alpha", 0.0f, 1.0f);
            ofFloat4.setDuration(250L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsTip), "alpha", 0.0f, 1.0f);
            ofFloat5.setDuration(250L);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsDescription), "alpha", 0.0f, 1.0f);
            ofFloat6.setDuration(250L);
            ofFloat.addListener(new b(jVar, ofFloat4, ofFloat5, ofFloat6, ofFloat));
            ofFloat4.addListener(new c(ofFloat4));
            ofFloat.start();
            ofFloat2.start();
            ofFloat3.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29906v, e10);
        }
    }

    public final void M() {
        ArrayList<HashMap<String, Object>> arrayList = this.f29910z;
        arrayList.add(e0.s0(new hs.f("title", "Set the right environment"), new hs.f("description", "Having the right kind of environment is conducive to setting your mood such that you express better. Tidying your desk or even turning on a soft reading light goes a long way. You could also take a walk while you journal. Find a place where it's calm and you won't be disturbed.")));
        arrayList.add(e0.s0(new hs.f("title", "Switch off devices"), new hs.f("description", "Switch off your television. Journalling requires your sole focus and attention. Disconnect from the internet. Constant notifications might break your flow of thought. If you are writing on your phone, put it on aeroplane mode to block notifications.")));
        arrayList.add(e0.s0(new hs.f("title", "Be completely honest"), new hs.f("description", "Journalling is a reflection of your honest thoughts and feelings, so don't restrict yourself. Make sure that you are being honest about what you write and how you feel. Your language or way of writing is of least important. Keep it simple as long as you are expressing fully.")));
        arrayList.add(e0.s0(new hs.f("title", "Write about an event..."), new hs.f("description", "You can write about an interesting event that happened in the day and how you felt. As you do this, you will begin to have other thoughts related to these events.  Write down a thought. Expand upon it and then move on to the next thought you have. Every thought is relevant.")));
        arrayList.add(e0.s0(new hs.f("title", "...or find a quote"), new hs.f("description", "If you don't know where to begin, you can write a quote or a lyric that you like. You can then begin to talk about why you like that particular line and its meaning. Let your thoughts flow freely from there and write them down in your journal.")));
    }

    @Override // nm.h
    public final void _$_clearFindViewByIdCache() {
        this.C.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
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
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_tips, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        int i10;
        Object obj;
        String str;
        Object obj2;
        String str2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f29910z = new ArrayList<>();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalTips);
        a aVar = this.B;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
            recyclerView.c0(aVar);
            recyclerView.setLayoutManager(null);
        }
        try {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsPrevious);
            if (appCompatImageView != null) {
                Integer num = this.A.f19464u;
                if (num != null) {
                    i6 = num.intValue();
                } else {
                    i6 = 0;
                }
                appCompatImageView.setVisibility(i6);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsNext);
            if (appCompatImageView2 != null) {
                Integer num2 = this.A.f19465v;
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                appCompatImageView2.setVisibility(i10);
            }
            M();
            List P0 = ca.a.P0("https://assets.theinnerhour.com/activity_assets/N1660721893547.png", "https://assets.theinnerhour.com/activity_assets/N1660721899250.png", "https://assets.theinnerhour.com/activity_assets/N1660721905439.png", "https://assets.theinnerhour.com/activity_assets/N1660719657604.png", "https://assets.theinnerhour.com/activity_assets/N1660721917699.png");
            w wVar = new w();
            this.f29907w = wVar;
            wVar.a((RecyclerView) _$_findCachedViewById(R.id.rvJournalTips));
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            ((RecyclerView) _$_findCachedViewById(R.id.rvJournalTips)).setLayoutManager(new TurnLayoutCustomManager(requireActivity, 8388613, 0, 5000, 0, true));
            if (this.f29910z.size() > 0) {
                androidx.fragment.app.p requireActivity2 = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                ((RecyclerView) _$_findCachedViewById(R.id.rvJournalTips)).setAdapter(new r(requireActivity2, P0));
                ((RecyclerView) _$_findCachedViewById(R.id.rvJournalTips)).k0(15, 0, false);
                ((RecyclerView) _$_findCachedViewById(R.id.rvJournalTips)).i(aVar);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsCount)).setText((this.f29908x + 1) + " / " + this.f29910z.size());
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsTip);
                HashMap hashMap = (HashMap) u.j2(this.f29908x, this.f29910z);
                if (hashMap != null) {
                    obj = hashMap.get("title");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                robertoTextView.setText(str);
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalTipsDescription);
                HashMap hashMap2 = (HashMap) u.j2(this.f29908x, this.f29910z);
                if (hashMap2 != null) {
                    obj2 = hashMap2.get("description");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                robertoTextView2.setText(str2);
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsPrevious)).setOnClickListener(new View.OnClickListener(this) { // from class: qm.p

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q f29905v;

                    {
                        this.f29905v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        JournalActivity journalActivity;
                        int i13 = r2;
                        nm.d dVar = null;
                        q this$0 = this.f29905v;
                        switch (i13) {
                            case 0:
                                int i14 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_previous");
                                    int i15 = this$0.f29908x;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f29908x = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_next");
                                    if (this$0.f29908x < this$0.f29910z.size() - 1) {
                                        i12 = this$0.f29908x + 1;
                                    } else {
                                        i12 = this$0.f29908x;
                                    }
                                    this$0.f29908x = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_understood");
                                ApplicationPersistence.getInstance().setBooleanValue("journal_tip_visited", true);
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.getSupportFragmentManager().Y();
                                    Fragment E = journalActivity.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                                    if (E instanceof nm.d) {
                                        dVar = (nm.d) E;
                                    }
                                    if (dVar != null) {
                                        dVar.O();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i18 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_cross");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.ivJournalTipsNext)).setOnClickListener(new View.OnClickListener(this) { // from class: qm.p

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q f29905v;

                    {
                        this.f29905v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        JournalActivity journalActivity;
                        int i13 = r2;
                        nm.d dVar = null;
                        q this$0 = this.f29905v;
                        switch (i13) {
                            case 0:
                                int i14 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_previous");
                                    int i15 = this$0.f29908x;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f29908x = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_next");
                                    if (this$0.f29908x < this$0.f29910z.size() - 1) {
                                        i12 = this$0.f29908x + 1;
                                    } else {
                                        i12 = this$0.f29908x;
                                    }
                                    this$0.f29908x = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_understood");
                                ApplicationPersistence.getInstance().setBooleanValue("journal_tip_visited", true);
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.getSupportFragmentManager().Y();
                                    Fragment E = journalActivity.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                                    if (E instanceof nm.d) {
                                        dVar = (nm.d) E;
                                    }
                                    if (dVar != null) {
                                        dVar.O();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i18 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_cross");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.rbJournalTipButton)).setOnClickListener(new View.OnClickListener(this) { // from class: qm.p

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q f29905v;

                    {
                        this.f29905v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        JournalActivity journalActivity;
                        int i13 = r2;
                        nm.d dVar = null;
                        q this$0 = this.f29905v;
                        switch (i13) {
                            case 0:
                                int i14 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_previous");
                                    int i15 = this$0.f29908x;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f29908x = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_next");
                                    if (this$0.f29908x < this$0.f29910z.size() - 1) {
                                        i12 = this$0.f29908x + 1;
                                    } else {
                                        i12 = this$0.f29908x;
                                    }
                                    this$0.f29908x = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_understood");
                                ApplicationPersistence.getInstance().setBooleanValue("journal_tip_visited", true);
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.getSupportFragmentManager().Y();
                                    Fragment E = journalActivity.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                                    if (E instanceof nm.d) {
                                        dVar = (nm.d) E;
                                    }
                                    if (dVar != null) {
                                        dVar.O();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i18 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_cross");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
                ((AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarCrossButton)).setOnClickListener(new View.OnClickListener(this) { // from class: qm.p

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q f29905v;

                    {
                        this.f29905v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11;
                        int i12;
                        JournalActivity journalActivity;
                        int i13 = r2;
                        nm.d dVar = null;
                        q this$0 = this.f29905v;
                        switch (i13) {
                            case 0:
                                int i14 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_previous");
                                    int i15 = this$0.f29908x;
                                    if (i15 > 0) {
                                        i11 = i15 - 1;
                                    } else {
                                        i11 = 0;
                                    }
                                    this$0.f29908x = i11;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f29909y) {
                                    gk.a.b(null, "journal_tip_next");
                                    if (this$0.f29908x < this$0.f29910z.size() - 1) {
                                        i12 = this$0.f29908x + 1;
                                    } else {
                                        i12 = this$0.f29908x;
                                    }
                                    this$0.f29908x = i12;
                                    ((RecyclerView) this$0._$_findCachedViewById(R.id.rvJournalTips)).l0(this$0.f29908x);
                                    this$0.J();
                                    return;
                                }
                                return;
                            case 2:
                                int i17 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_understood");
                                ApplicationPersistence.getInstance().setBooleanValue("journal_tip_visited", true);
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.getSupportFragmentManager().Y();
                                    Fragment E = journalActivity.getSupportFragmentManager().E(R.id.flJournalActivityMain);
                                    if (E instanceof nm.d) {
                                        dVar = (nm.d) E;
                                    }
                                    if (dVar != null) {
                                        dVar.O();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                int i18 = q.D;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "journal_tip_cross");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29906v, e10);
        }
    }

    @Override // nm.h
    public final void I() {
    }

    @Override // nm.h
    public final void F(Integer num) {
    }
}
