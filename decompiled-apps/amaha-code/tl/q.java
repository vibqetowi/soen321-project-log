package tl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertResourceActivity;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertStoriesActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import kotlin.Metadata;
import pl.w0;
import r1.b0;
import t0.j0;
/* compiled from: TherapistExpertInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltl/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q extends Fragment {
    public static final /* synthetic */ int K = 0;
    public zl.v E;
    public final androidx.activity.result.c<Intent> G;
    public final f H;
    public final c I;

    /* renamed from: v  reason: collision with root package name */
    public sl.e f33261v;

    /* renamed from: w  reason: collision with root package name */
    public sl.g f33262w;

    /* renamed from: x  reason: collision with root package name */
    public sl.f f33263x;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33260u = LogHelper.INSTANCE.makeLogTag("TherapistExpertInfoFragment");

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<vl.d> f33264y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<xl.a> f33265z = new ArrayList<>();
    public final ArrayList<vl.b> A = new ArrayList<>();
    public boolean B = true;
    public final String C = "therapy";
    public final String D = "psychiatry";
    public Timer F = new Timer();

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<vl.c, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(vl.c cVar) {
            boolean z10;
            String string;
            ArrayList<vl.b> arrayList;
            vl.a a10;
            ArrayList<vl.b> a11;
            vl.c cVar2 = cVar;
            if (cVar2 != null && (a10 = cVar2.a()) != null && (a11 = a10.a()) != null && (!a11.isEmpty())) {
                z10 = true;
            } else {
                z10 = false;
            }
            q qVar = q.this;
            if (z10) {
                RobertoTextView robertoTextView = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertResourceTitle);
                boolean z11 = qVar.B;
                String str = qVar.C;
                String str2 = qVar.D;
                if (z11) {
                    string = qVar.getString(R.string.learn_more_about_expert, str);
                } else {
                    string = qVar.getString(R.string.learn_more_about_expert, str2);
                }
                robertoTextView.setText(string);
                RobertoTextView robertoTextView2 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertResourceSubTitle);
                Object[] objArr = new Object[1];
                if (qVar.B) {
                    objArr[0] = str;
                } else {
                    objArr[0] = str2;
                }
                robertoTextView2.setText(qVar.getString(R.string.learn_about_expert_sub_title, objArr));
                ((Group) qVar._$_findCachedViewById(R.id.groupResources)).setVisibility(0);
                ArrayList<vl.b> newResourceList = qVar.A;
                vl.a a12 = cVar2.a();
                if (a12 != null) {
                    arrayList = a12.a();
                } else {
                    arrayList = null;
                }
                kotlin.jvm.internal.i.d(arrayList);
                newResourceList.addAll(arrayList);
                sl.f fVar = qVar.f33263x;
                if (fVar != null) {
                    kotlin.jvm.internal.i.g(newResourceList, "newResourceList");
                    fVar.f31665x = newResourceList;
                    fVar.i();
                } else {
                    kotlin.jvm.internal.i.q("resourceAdapter");
                    throw null;
                }
            } else {
                ((Group) qVar._$_findCachedViewById(R.id.groupResources)).setVisibility(8);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<xl.b, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(xl.b bVar) {
            int i6;
            RecyclerView recyclerView;
            sl.g gVar;
            int i10;
            int i11;
            int i12;
            int i13;
            xl.b bVar2 = bVar;
            boolean z10 = !bVar2.a().isEmpty();
            q qVar = q.this;
            if (z10) {
                View _$_findCachedViewById = qVar._$_findCachedViewById(R.id.groupTestimonials);
                String str = qVar.f33260u;
                ((Group) _$_findCachedViewById).setVisibility(0);
                ArrayList<xl.a> arrayList = qVar.f33265z;
                arrayList.addAll(bVar2.a());
                try {
                    Iterator<xl.a> it = arrayList.iterator();
                    String str2 = "";
                    String str3 = str2;
                    String str4 = str3;
                    String str5 = str4;
                    while (it.hasNext()) {
                        xl.a next = it.next();
                        String d10 = next.d();
                        if (d10 != null) {
                            i10 = d10.length();
                        } else {
                            i10 = 0;
                        }
                        if (i10 > str2.length() && (str2 = next.d()) == null) {
                            str2 = "";
                        }
                        String b10 = next.b();
                        if (b10 != null) {
                            i11 = b10.length();
                        } else {
                            i11 = 0;
                        }
                        if (i11 > str3.length() && (str3 = next.b()) == null) {
                            str3 = "";
                        }
                        String c10 = next.c();
                        if (c10 != null) {
                            i12 = c10.length();
                        } else {
                            i12 = 0;
                        }
                        if (i12 > str4.length() && (str4 = next.c()) == null) {
                            str4 = "";
                        }
                        String a10 = next.a();
                        if (a10 != null) {
                            i13 = a10.length();
                        } else {
                            i13 = 0;
                        }
                        if (i13 > str5.length() && (str5 = next.a()) == null) {
                            str5 = "";
                        }
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvTestimonialExpertNameHG);
                    if (robertoTextView != null) {
                        robertoTextView.setText(str2);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvTestimonialExpertDetailHG);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(str3);
                    }
                    RobertoTextView robertoTextView3 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvTestimonialExpertQuoteHG);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText(str4);
                    }
                    RobertoTextView robertoTextView4 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvTestimonialExpertDescriptionHG);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText(str5);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
                try {
                    ((RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertTestimonial)).setLayoutManager(new LinearLayoutManager(qVar.requireActivity(), 0, false));
                    Context requireContext = qVar.requireContext();
                    kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                    qVar.f33262w = new sl.g(requireContext, arrayList, new r(qVar));
                    recyclerView = (RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertTestimonial);
                    gVar = qVar.f33262w;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, e11);
                }
                if (gVar != null) {
                    recyclerView.setAdapter(gVar);
                    new w().a((RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertTestimonial));
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        try {
                            View inflate = qVar.requireActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) qVar._$_findCachedViewById(R.id.layoutDots)), false);
                            androidx.fragment.app.p requireActivity = qVar.requireActivity();
                            if (i14 == 0) {
                                i6 = R.color.amahaDarkGray;
                            } else {
                                i6 = R.color.proDashboardFooter;
                            }
                            inflate.setBackgroundTintList(g0.a.c(i6, requireActivity));
                            ((LinearLayout) qVar._$_findCachedViewById(R.id.layoutDots)).addView(inflate);
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(str, e12);
                        }
                    }
                    RecyclerView recyclerView2 = (RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertTestimonial);
                    if (recyclerView2 != null) {
                        recyclerView2.i(new p(qVar));
                    }
                } else {
                    kotlin.jvm.internal.i.q("testimonialAdapter");
                    throw null;
                }
            } else {
                ((Group) qVar._$_findCachedViewById(R.id.groupTestimonials)).setVisibility(8);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<List<? extends TherapistPackagesModel>, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends TherapistPackagesModel> list) {
            String str;
            List<? extends TherapistPackagesModel> it = list;
            kotlin.jvm.internal.i.f(it, "it");
            if (!it.isEmpty()) {
                int i6 = q.K;
                q qVar = q.this;
                qVar.getClass();
                try {
                    RobertoTextView robertoTextView = (RobertoTextView) qVar._$_findCachedViewById(R.id.ctaExpertCareInfoPageViewAll);
                    if (qVar.B) {
                        str = "VIEW ALL THERAPISTS";
                    } else {
                        str = "VIEW ALL PSYCHIATRISTS";
                    }
                    robertoTextView.setText(str);
                    ((RobertoTextView) qVar._$_findCachedViewById(R.id.ctaExpertCareInfoPageViewAll)).setVisibility(0);
                    ((RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoListingHeader)).setVisibility(0);
                    ((RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoListingSubHeader)).setVisibility(0);
                    RecyclerView recyclerView = (RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new CenterZoomLayoutManager(qVar.requireActivity(), 0, false, 1.0E-4f, 0.0f, null, 48, null));
                    }
                    RecyclerView recyclerView2 = (RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(new sl.c(it, qVar.B, new s(qVar), new t(qVar)));
                    }
                    new w().a((RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler));
                    int i10 = Resources.getSystem().getDisplayMetrics().widthPixels;
                    Timer timer = qVar.F;
                    if (timer != null) {
                        timer.scheduleAtFixedRate(new u(qVar, i10), 6000L, 5000L);
                    }
                    qVar.O(it.size());
                    RecyclerView recyclerView3 = (RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
                    if (recyclerView3 != null) {
                        recyclerView3.post(new o(0, qVar));
                    }
                    ((RobertoTextView) qVar._$_findCachedViewById(R.id.ctaExpertCareInfoPageViewAll)).setOnClickListener(new n(qVar, 1));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(qVar.f33260u, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            int i6;
            String str2;
            String str3 = str;
            boolean booleanValue = ApplicationPersistence.getInstance().getBooleanValue(Constants.OFFLINE_CARD_EXPERT_CARE, false);
            q qVar = q.this;
            if (booleanValue && str3 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) qVar._$_findCachedViewById(R.id.clExpertCareInfoPageOfflinePromptContainer);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                RobertoTextView robertoTextView = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoPageOfflinePromptHeader);
                if (robertoTextView != null) {
                    robertoTextView.setText("You can also book an in-person session in " + str3 + '!');
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoPageOfflinePromptBody);
                if (robertoTextView2 != null) {
                    StringBuilder g5 = defpackage.d.g("If you're in ", str3, " and want to talk to your ");
                    if (qVar.B) {
                        str2 = "therapist";
                    } else {
                        str2 = "psychiatrist";
                    }
                    g5.append(str2);
                    g5.append(" face-to-face, you can book an in-person session with them.");
                    robertoTextView2.setText(g5.toString());
                }
                RobertoTextView robertoTextView3 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoPageOfflinePromptCta);
                if (robertoTextView3 != null) {
                    if (qVar.B) {
                        i6 = R.string.expert_therapy_offline_prompt_cta;
                    } else {
                        i6 = R.string.expert_psychiatry_offline_prompt_cta;
                    }
                    robertoTextView3.setText(qVar.getString(i6));
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoPageOfflinePromptCta);
                if (robertoTextView4 != null) {
                    RobertoTextView robertoTextView5 = (RobertoTextView) qVar._$_findCachedViewById(R.id.tvExpertCareInfoPageOfflinePromptCta);
                    kotlin.jvm.internal.i.d(robertoTextView5);
                    robertoTextView4.setPaintFlags(robertoTextView5.getPaintFlags() | 8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) qVar._$_findCachedViewById(R.id.clExpertCareInfoPageOfflinePromptContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setOnClickListener(new w0(qVar, 2, str3));
                }
            } else {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) qVar._$_findCachedViewById(R.id.clExpertCareInfoPageOfflinePromptContainer);
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends RecyclerView.r {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager;
            String str;
            q qVar = q.this;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                try {
                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        linearLayoutManager.findFirstVisibleItemPosition();
                        String str2 = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        if (qVar.B) {
                            str = "therapy";
                        } else {
                            str = "psychiatry";
                        }
                        bundle.putString("flow", str);
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "therapy_psychiatry_km_scroll");
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(qVar.f33260u, e10);
                }
            }
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.p<vl.d, Integer, hs.k> {
        public g() {
            super(2);
        }

        @Override // ss.p
        public final hs.k invoke(vl.d dVar, Integer num) {
            String str;
            vl.d item = dVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.i.g(item, "item");
            q qVar = q.this;
            qVar.startActivity(new Intent(qVar.requireActivity(), ExpertStoriesActivity.class).putExtra(Constants.DAYMODEL_POSITION, intValue).putExtra("isTherapy", qVar.B).putExtra("isExpertCare", true));
            String str2 = gk.a.f16573a;
            Bundle a10 = b0.a("source", "app_expert_care");
            if (qVar.B) {
                str = "therapy";
            } else {
                str = "psychiatry";
            }
            a10.putString("flow", str);
            a10.putInt("step_num", intValue + 1);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(a10, "therapy_psychiatry_km_step");
            return hs.k.f19476a;
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<vl.b, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(vl.b bVar) {
            String str;
            vl.b model = bVar;
            kotlin.jvm.internal.i.g(model, "model");
            q qVar = q.this;
            qVar.startActivity(new Intent(qVar.requireActivity(), ExpertResourceActivity.class).putExtra("model", model).putExtra("isTherapy", qVar.B));
            String str2 = gk.a.f16573a;
            Bundle a10 = b0.a("source", "app_expert_care");
            if (qVar.B) {
                str = "therapy";
            } else {
                str = "psychiatry";
            }
            a10.putString("flow", str);
            a10.putString("slug", model.d());
            hs.k kVar = hs.k.f19476a;
            gk.a.b(a10, "resources_article_open");
            return hs.k.f19476a;
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends RecyclerView.r {
        public i() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
            ca.a.t1();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
            throw null;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i6, RecyclerView recyclerView) {
            LinearLayoutManager linearLayoutManager;
            int i10;
            q qVar = q.this;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                try {
                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    } else {
                        linearLayoutManager = null;
                    }
                    if (linearLayoutManager != null) {
                        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) qVar._$_findCachedViewById(R.id.llExpertCareInfoPageCounter);
                        if (linearLayoutCompat != null) {
                            Iterator<View> it = f6.b.B0(linearLayoutCompat).iterator();
                            int i11 = 0;
                            while (true) {
                                j0 j0Var = (j0) it;
                                if (j0Var.hasNext()) {
                                    Object next = j0Var.next();
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        break;
                                    }
                                    View view = (View) next;
                                    androidx.fragment.app.p requireActivity = qVar.requireActivity();
                                    if (i11 == findFirstVisibleItemPosition) {
                                        i10 = R.color.amahaDarkGray;
                                    } else {
                                        i10 = R.color.proDashboardFooter;
                                    }
                                    view.setBackgroundTintList(g0.a.c(i10, requireActivity));
                                    i11 = i12;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(qVar.f33260u, e10);
                }
            }
        }
    }

    public q() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new am.w(17, this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul….finish()\n        }\n    }");
        this.G = registerForActivityResult;
        this.H = new f();
        this.I = new c();
    }

    public final void F() {
        try {
            boolean z10 = this.B;
            ArrayList<vl.d> arrayList = this.f33264y;
            if (z10) {
                arrayList.clear();
                arrayList.add(new vl.d("Choose a therapist or get matched", R.drawable.expert_stories_thumb_therapy_1));
                arrayList.add(new vl.d("Set goals to work towards, together", R.drawable.expert_stories_thumb_therapy_2));
                arrayList.add(new vl.d("Receive comprehensive care", R.drawable.expert_stories_thumb_therapy_3));
                arrayList.add(new vl.d("Witness your own growth and progress", R.drawable.expert_stories_thumb_therapy_4));
            } else {
                arrayList.clear();
                arrayList.add(new vl.d("Pick a psychiatrist", R.drawable.expert_stories_thumb_psychiatry_1));
                arrayList.add(new vl.d("Set goals to work towards, together", R.drawable.expert_stories_thumb_psychiatry_2));
                arrayList.add(new vl.d("Receive comprehensive care", R.drawable.expert_stories_thumb_psychiatry_3));
                arrayList.add(new vl.d("Witness your own growth and progress", R.drawable.expert_stories_thumb_psychiatry_4));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33260u, e10);
        }
    }

    public final void I() {
        try {
            zl.v vVar = this.E;
            if (vVar != null) {
                ta.v.H(kc.f.H(vVar), null, 0, new zl.t(vVar, null, this.B), 3);
                vVar.f39604z.e(requireActivity(), new m(2, new a()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33260u, e10);
        }
    }

    public final void J() {
        try {
            zl.v vVar = this.E;
            if (vVar != null) {
                ta.v.H(kc.f.H(vVar), null, 0, new zl.u(vVar, null), 3);
                vVar.f39603y.e(requireActivity(), new m(1, new b()));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33260u, e10);
        }
    }

    public final void K() {
        String string;
        String string2;
        String str = this.f33260u;
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvHowItWorkTitle);
            boolean z10 = this.B;
            String str2 = this.C;
            String str3 = this.D;
            if (z10) {
                string = getString(R.string.how_does_expert_work_title, str2);
            } else {
                string = getString(R.string.how_does_expert_work_title, str3);
            }
            robertoTextView.setText(string);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvHowItWorkDescription);
            if (this.B) {
                string2 = getString(R.string.expert_how_it_work_description, str2);
            } else {
                string2 = getString(R.string.expert_how_it_work_description, str3);
            }
            robertoTextView2.setText(string2);
            F();
            ((RecyclerView) _$_findCachedViewById(R.id.rvExpertIntro)).setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            this.f33261v = new sl.e(requireContext, this.f33264y, new g());
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvExpertIntro);
            sl.e eVar = this.f33261v;
            if (eVar != null) {
                recyclerView.setAdapter(eVar);
                ((RecyclerView) _$_findCachedViewById(R.id.rvExpertIntro)).h(this.I);
                ((RecyclerView) _$_findCachedViewById(R.id.rvExpertIntro)).i(this.H);
                try {
                    ((ConstraintLayout) _$_findCachedViewById(R.id.clViewDetails)).setOnClickListener(new n(this, 2));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                    return;
                }
            }
            kotlin.jvm.internal.i.q("adapter");
            throw null;
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final void M() {
        try {
            ((RecyclerView) _$_findCachedViewById(R.id.rvExpertResource)).setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            this.f33263x = new sl.f(requireContext, this.A, new h());
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvExpertResource);
            sl.f fVar = this.f33263x;
            if (fVar != null) {
                recyclerView.setAdapter(fVar);
                I();
                return;
            }
            kotlin.jvm.internal.i.q("resourceAdapter");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33260u, e10);
        }
    }

    public final void O(int i6) {
        int i10;
        for (int i11 = 0; i11 < i6; i11++) {
            try {
                View inflate = requireActivity().getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayoutCompat) _$_findCachedViewById(R.id.llExpertCareInfoPageCounter)), false);
                androidx.fragment.app.p requireActivity = requireActivity();
                if (i11 == 0) {
                    i10 = R.color.amahaDarkGray;
                } else {
                    i10 = R.color.proDashboardFooter;
                }
                inflate.setBackgroundTintList(g0.a.c(i10, requireActivity));
                ((LinearLayoutCompat) _$_findCachedViewById(R.id.llExpertCareInfoPageCounter)).addView(inflate);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f33260u, e10);
                return;
            }
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvExpertCareInfoListingRecycler);
        if (recyclerView != null) {
            recyclerView.i(new i());
        }
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_therapist_expert_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        try {
            ((RecyclerView) _$_findCachedViewById(R.id.rvExpertIntro)).c0(this.H);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33260u, e10);
        }
        super.onDestroyView();
        this.J.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String sb2;
        String currentCourseName;
        String str2;
        int i6;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                if (!arguments.containsKey("is_therapy")) {
                    arguments = null;
                }
                if (arguments != null) {
                    this.B = arguments.getBoolean("is_therapy");
                }
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvExpertCareInfoListingHeader);
            if (robertoTextView != null) {
                if (this.B) {
                    str = "Explore our therapists";
                } else {
                    str = "Explore our psychiatrists";
                }
                robertoTextView.setText(str);
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvExpertCareInfoListingSubHeader);
            if (robertoTextView2 != null) {
                User user = FirebasePersistence.getInstance().getUser();
                String str3 = "therapists";
                if (user != null && (currentCourseName = user.getCurrentCourseName()) != null) {
                    StringBuilder sb3 = new StringBuilder("Book a session with our ");
                    sb3.append(currentCourseName);
                    sb3.append(" specific ");
                    if (this.B) {
                        str2 = "therapists";
                    } else {
                        str2 = "psychiatrists";
                    }
                    sb3.append(str2);
                    sb3.append(" from below");
                    sb2 = sb3.toString();
                    if (sb2 != null) {
                        robertoTextView2.setText(sb2);
                    }
                }
                StringBuilder sb4 = new StringBuilder("Book a session with our ");
                if (!this.B) {
                    str3 = "psychiatrists";
                }
                sb4.append(str3);
                sb4.append(" from below");
                sb2 = sb4.toString();
                robertoTextView2.setText(sb2);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clExpertCareInfoMatchingView);
            if (constraintLayout != null) {
                if (this.B) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                constraintLayout.setVisibility(i6);
            }
            l0 a10 = new o0(this, new ok.c(new yl.b())).a(zl.v.class);
            zl.v vVar = (zl.v) a10;
            vVar.A.e(getViewLifecycleOwner(), new hl.p(29, new d()));
            vVar.B.e(getViewLifecycleOwner(), new m(0, new e()));
            ta.v.H(kc.f.H(vVar), null, 0, new zl.p(vVar, null, this.B), 3);
            this.E = (zl.v) a10;
            K();
            if (this.B) {
                J();
            } else {
                Group group = (Group) _$_findCachedViewById(R.id.groupTestimonials);
                if (group != null) {
                    group.setVisibility(8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clExpertTestimonialHeightGenerator);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
            }
            M();
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvForYouTeleConsultationMatchingPromptCta);
            if (robertoTextView3 != null) {
                robertoTextView3.setOnClickListener(new n(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33260u, e10);
        }
    }

    /* compiled from: TherapistExpertInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements RecyclerView.q {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(RecyclerView rv2, MotionEvent e10) {
            kotlin.jvm.internal.i.g(rv2, "rv");
            kotlin.jvm.internal.i.g(e10, "e");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean c(RecyclerView rv2, MotionEvent e10) {
            q qVar = q.this;
            kotlin.jvm.internal.i.g(rv2, "rv");
            kotlin.jvm.internal.i.g(e10, "e");
            try {
                int action = e10.getAction();
                if (((RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertIntro)).canScrollHorizontally(2)) {
                    if (action == 2) {
                        rv2.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    return false;
                }
                if (action == 2) {
                    rv2.getParent().requestDisallowInterceptTouchEvent(false);
                }
                ((RecyclerView) qVar._$_findCachedViewById(R.id.rvExpertIntro)).b0(this);
                return true;
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(qVar.f33260u, e11);
                return true;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void e(boolean z10) {
        }
    }
}
