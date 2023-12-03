package bm;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import bm.b;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import g0.a;
import ik.l1;
import is.b0;
import is.z;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: FirestoreCustomGoalAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<RecyclerView.c0> {
    public boolean A;
    public List<FirestoreGoal> B;
    public final int C;
    public final int D;
    public final GoalHelper E;

    /* renamed from: x  reason: collision with root package name */
    public final Context f4406x;

    /* renamed from: y  reason: collision with root package name */
    public Date f4407y;

    /* renamed from: z  reason: collision with root package name */
    public final c f4408z;

    /* compiled from: FirestoreCustomGoalAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final yp.o f4409u;

        public a(yp.o oVar) {
            super(oVar.f38881a);
            this.f4409u = oVar;
        }
    }

    /* compiled from: FirestoreCustomGoalAdapter.kt */
    /* renamed from: bm.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0084b extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final qd f4410u;

        public C0084b(qd qdVar) {
            super(qdVar.a());
            this.f4410u = qdVar;
        }
    }

    /* compiled from: FirestoreCustomGoalAdapter.kt */
    /* loaded from: classes2.dex */
    public interface c {
        void a();

        void b();

        void c(FirestoreGoal firestoreGoal);

        void d(FirestoreGoal firestoreGoal);

        void e(FirestoreGoal firestoreGoal);

        void f();

        void g(long j10, FirestoreGoal firestoreGoal);
    }

    /* compiled from: FirestoreCustomGoalAdapter.kt */
    /* loaded from: classes2.dex */
    public final class d extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final yp.n f4411u;

        public d(yp.n nVar) {
            super(nVar.f38874a);
            this.f4411u = nVar;
        }
    }

    /* compiled from: FirestoreCustomGoalAdapter.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.adapter.FirestoreCustomGoalAdapter$onBindViewHolder$1$1", f = "FirestoreCustomGoalAdapter.kt", l = {185}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ x<Integer> B;

        /* renamed from: u  reason: collision with root package name */
        public int f4412u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f4413v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ b f4414w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f4415x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f4416y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ImageView[] f4417z;

        /* compiled from: FirestoreCustomGoalAdapter.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ x<Integer> A;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ b f4418u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ FirestoreGoal f4419v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f4420w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f4421x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ ImageView[] f4422y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f4423z;

            public a(b bVar, FirestoreGoal firestoreGoal, d dVar, String str, ImageView[] imageViewArr, int i6, x<Integer> xVar) {
                this.f4418u = bVar;
                this.f4419v = firestoreGoal;
                this.f4420w = dVar;
                this.f4421x = str;
                this.f4422y = imageViewArr;
                this.f4423z = i6;
                this.A = xVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                int i6;
                ArrayList arrayList = (ArrayList) obj;
                d dVar2 = this.f4420w;
                yp.n nVar = dVar2.f4411u;
                b bVar = this.f4418u;
                bVar.getClass();
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                kotlinx.coroutines.internal.c c10 = kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a);
                FirestoreGoal firestoreGoal = this.f4419v;
                boolean z10 = false;
                v.H(c10, null, 0, new bm.c(firestoreGoal, nVar, bVar, null), 3);
                u uVar = new u();
                String[] strArr = {Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE};
                String str = this.f4421x;
                boolean Q1 = is.k.Q1(str, strArr);
                yp.n nVar2 = dVar2.f4411u;
                Context context = bVar.f4406x;
                if (!Q1) {
                    Iterator<z<T>> it = is.u.N2(arrayList).iterator();
                    while (true) {
                        b0 b0Var = (b0) it;
                        if (b0Var.hasNext()) {
                            z zVar = (z) b0Var.next();
                            boolean booleanValue = ((Boolean) zVar.f20680b).booleanValue();
                            ImageView[] imageViewArr = this.f4422y;
                            int i10 = zVar.f20679a;
                            if (booleanValue) {
                                ImageView imageView = imageViewArr[i10];
                                if (imageView != null) {
                                    Object obj2 = g0.a.f16164a;
                                    imageView.setBackground(a.c.b(context, R.drawable.circle_filled_sea));
                                }
                                ImageView imageView2 = imageViewArr[i10];
                                if (imageView2 != null) {
                                    imageView2.setImageResource(R.drawable.ic_right);
                                }
                                ImageView imageView3 = imageViewArr[i10];
                                if (imageView3 != null) {
                                    imageView3.setColorFilter(g0.a.b(context, R.color.sea));
                                }
                            } else {
                                ImageView imageView4 = imageViewArr[i10];
                                if (imageView4 != null) {
                                    Object obj3 = g0.a.f16164a;
                                    imageView4.setBackground(a.c.b(context, R.drawable.circle_filled_light_grey));
                                }
                                ImageView imageView5 = imageViewArr[i10];
                                if (imageView5 != null) {
                                    imageView5.setImageResource(R.drawable.ic_right);
                                }
                                ImageView imageView6 = imageViewArr[i10];
                                if (imageView6 != null) {
                                    imageView6.setColorFilter(g0.a.b(context, R.color.learning_hub_grey_3));
                                }
                            }
                        } else {
                            try {
                                break;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    Calendar calendar = Calendar.getInstance();
                    kotlin.jvm.internal.i.f(calendar, "getInstance()");
                    calendar.setTime(bVar.f4407y);
                    int i11 = calendar.get(7);
                    if (i11 != 1) {
                        i6 = i11 - 2;
                    } else {
                        i6 = 6;
                    }
                    Object obj4 = arrayList.get(i6);
                    kotlin.jvm.internal.i.f(obj4, "{\n            val c: Cal…Day - 2 else 6]\n        }");
                    z10 = ((Boolean) obj4).booleanValue();
                    uVar.f23466u = z10;
                    b.v(bVar, z10, nVar2);
                } else if (kotlin.jvm.internal.i.b(str, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                    boolean contains = arrayList.contains(Boolean.TRUE);
                    uVar.f23466u = contains;
                    if (contains) {
                        b.v(bVar, true, nVar2);
                        nVar2.f38880h.setText(context.getString(R.string.weeklyGoalDoneLowerCase));
                    } else {
                        b.v(bVar, false, nVar2);
                        String obj5 = DateFormat.format("EEEE", firestoreGoal.getScheduledDate().getTime() * 1000).toString();
                        boolean b10 = kotlin.jvm.internal.i.b(obj5, DateFormat.format("EEEE", bVar.f4407y.getTime()));
                        RobertoTextView robertoTextView = nVar2.f38880h;
                        if (b10) {
                            robertoTextView.setText(context.getString(R.string.weeklyGoalScheduledTodayLowerCase));
                        } else {
                            robertoTextView.setText(context.getString(R.string.weeklyGoalScheduledLowerCase, obj5));
                        }
                    }
                } else if (kotlin.jvm.internal.i.b(str, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    boolean contains2 = arrayList.contains(Boolean.TRUE);
                    uVar.f23466u = contains2;
                    if (contains2) {
                        b.v(bVar, true, nVar2);
                        nVar2.f38880h.setText(context.getString(R.string.onceGoalDoneLowerCase));
                    } else {
                        b.v(bVar, false, nVar2);
                        nVar2.f38880h.setText(context.getString(R.string.weeklyGoalScheduledLowerCase, DateFormat.format("dd MMM,yyyy", firestoreGoal.getScheduledDate().getTime() * 1000).toString()));
                    }
                }
                nVar2.f38874a.setOnClickListener(new el.c(this.f4418u, this.f4419v, this.f4423z, this.A, uVar, 1));
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FirestoreGoal firestoreGoal, b bVar, d dVar, String str, ImageView[] imageViewArr, int i6, x<Integer> xVar, ls.d<? super e> dVar2) {
            super(2, dVar2);
            this.f4413v = firestoreGoal;
            this.f4414w = bVar;
            this.f4415x = dVar;
            this.f4416y = str;
            this.f4417z = imageViewArr;
            this.A = i6;
            this.B = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new e(this.f4413v, this.f4414w, this.f4415x, this.f4416y, this.f4417z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            return ms.a.COROUTINE_SUSPENDED;
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f4412u;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.flow.p<ArrayList<Boolean>> trackListFlow = this.f4413v.getTrackListFlow();
                a aVar2 = new a(this.f4414w, this.f4413v, this.f4415x, this.f4416y, this.f4417z, this.A, this.B);
                this.f4412u = 1;
                if (trackListFlow.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    public b(Date date, cm.i iVar, List goalList, Context context) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f4406x = context;
        this.C = 1;
        this.D = 2;
        this.E = new GoalHelper();
        this.f4407y = date;
        this.f4408z = iVar;
        kotlin.jvm.internal.i.f(Constants.getGoalsHashMap(), "getGoalsHashMap()");
        this.B = goalList;
    }

    public static final void v(b bVar, boolean z10, yp.n nVar) {
        Context context = bVar.f4406x;
        if (z10) {
            nVar.f38875b.setBackgroundResource(R.drawable.circle_filled_sea);
            nVar.f38875b.setColorFilter(g0.a.b(context, R.color.white));
            return;
        }
        nVar.f38875b.setBackgroundResource(R.drawable.circle_goals_new_grey);
        nVar.f38875b.setColorFilter(g0.a.b(context, R.color.goalsNewCardCheckGrey));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        if (!this.B.isEmpty()) {
            return this.B.size() + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (i6 == 0 && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            return this.C;
        }
        if (i6 == this.B.size() && SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
            return this.D;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [T, java.lang.Integer] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        if (h(i6) == 0) {
            int i10 = SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() ? i6 : i6 - 1;
            d dVar = (d) c0Var;
            x xVar = new x();
            FirestoreGoal firestoreGoal = this.B.get(i10);
            String type = firestoreGoal.getType();
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            kotlinx.coroutines.internal.c c10 = kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a);
            yp.n nVar = dVar.f4411u;
            v.H(c10, null, 0, new bm.c(firestoreGoal, nVar, this, null), 3);
            nVar.f.setText(firestoreGoal.getGoalName());
            String courseDisplayName = Constants.getCourseDisplayName(firestoreGoal.getCourseName());
            if (gv.n.B0(courseDisplayName)) {
                courseDisplayName = this.f4406x.getString(R.string.customGoalLabel);
            }
            RobertoTextView robertoTextView = nVar.f38878e;
            robertoTextView.setText(courseDisplayName);
            Extensions extensions = Extensions.INSTANCE;
            kotlin.jvm.internal.i.f(robertoTextView, "binding.tvRowGoalCourse");
            extensions.visible(robertoTextView);
            ImageView[] imageViewArr = new ImageView[7];
            RobertoTextView[] robertoTextViewArr = new RobertoTextView[7];
            int i11 = 0;
            for (int i12 = 7; i11 < i12; i12 = 7) {
                ConstraintLayout constraintLayout = nVar.f38874a;
                imageViewArr[i11] = (ImageView) constraintLayout.findViewById(constraintLayout.getContext().getResources().getIdentifier(defpackage.c.p("iday", i11), "id", constraintLayout.getContext().getPackageName()));
                robertoTextViewArr[i11] = (RobertoTextView) constraintLayout.findViewById(constraintLayout.getContext().getResources().getIdentifier(defpackage.c.p("tday", i11), "id", constraintLayout.getContext().getPackageName()));
                i11++;
            }
            boolean b10 = kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
            RobertoTextView robertoTextView2 = nVar.f38880h;
            RobertoTextView robertoTextView3 = nVar.f38879g;
            if (b10) {
                robertoTextView3.setText("WEEKLY");
                Iterator it = is.k.l2(imageViewArr).iterator();
                while (true) {
                    b0 b0Var = (b0) it;
                    if (!b0Var.hasNext()) {
                        break;
                    }
                    z zVar = (z) b0Var.next();
                    ImageView imageView = (ImageView) zVar.f20680b;
                    if (imageView != null) {
                        Extensions.INSTANCE.gone(imageView);
                    }
                    RobertoTextView robertoTextView4 = robertoTextViewArr[zVar.f20679a];
                    if (robertoTextView4 != null) {
                        Extensions.INSTANCE.gone(robertoTextView4);
                    }
                }
                Extensions extensions2 = Extensions.INSTANCE;
                kotlin.jvm.internal.i.f(robertoTextView2, "binding.tvRowGoalsWeeklyStatus");
                extensions2.visible(robertoTextView2);
                xVar.f23469u = Integer.valueOf(this.E.getWeekdayOffset(firestoreGoal.getScheduledDate().getTime() * 1000, this.f4407y.getTime()));
            } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                robertoTextView3.setText("ONE-TIME");
                Iterator it2 = is.k.l2(imageViewArr).iterator();
                while (true) {
                    b0 b0Var2 = (b0) it2;
                    if (!b0Var2.hasNext()) {
                        break;
                    }
                    z zVar2 = (z) b0Var2.next();
                    ImageView imageView2 = (ImageView) zVar2.f20680b;
                    if (imageView2 != null) {
                        Extensions.INSTANCE.gone(imageView2);
                    }
                    RobertoTextView robertoTextView5 = robertoTextViewArr[zVar2.f20679a];
                    if (robertoTextView5 != null) {
                        Extensions.INSTANCE.gone(robertoTextView5);
                    }
                }
                Extensions extensions3 = Extensions.INSTANCE;
                kotlin.jvm.internal.i.f(robertoTextView2, "binding.tvRowGoalsWeeklyStatus");
                extensions3.visible(robertoTextView2);
            } else {
                robertoTextView3.setText("DAILY");
                Iterator it3 = is.k.l2(imageViewArr).iterator();
                while (true) {
                    b0 b0Var3 = (b0) it3;
                    if (!b0Var3.hasNext()) {
                        break;
                    }
                    z zVar3 = (z) b0Var3.next();
                    ImageView imageView3 = (ImageView) zVar3.f20680b;
                    if (imageView3 != null) {
                        Extensions.INSTANCE.visible(imageView3);
                    }
                    RobertoTextView robertoTextView6 = robertoTextViewArr[zVar3.f20679a];
                    if (robertoTextView6 != null) {
                        Extensions.INSTANCE.visible(robertoTextView6);
                    }
                }
                Extensions extensions4 = Extensions.INSTANCE;
                kotlin.jvm.internal.i.f(robertoTextView2, "binding.tvRowGoalsWeeklyStatus");
                extensions4.gone(robertoTextView2);
            }
            v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a), null, 0, new e(firestoreGoal, this, dVar, type, imageViewArr, i6, xVar, null), 3);
            nVar.f38876c.setOnClickListener(new l1(this, firestoreGoal, i6, 9));
            nVar.f38875b.setOnClickListener(new t(23, dVar, this, firestoreGoal));
        } else if (h(i6) == this.C) {
            ((RobertoButton) ((C0084b) c0Var).f4410u.f8089w).setOnClickListener(new View.OnClickListener(this) { // from class: bm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f4405v;

                {
                    this.f4405v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = r2;
                    b this$0 = this.f4405v;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f4408z.f();
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            boolean subscriptionEnabled = SubscriptionPersistence.INSTANCE.getSubscriptionEnabled();
                            b.c cVar2 = this$0.f4408z;
                            if (subscriptionEnabled) {
                                cVar2.b();
                                return;
                            } else {
                                cVar2.f();
                                return;
                            }
                    }
                }
            });
        } else {
            ((a) c0Var).f4409u.f38882b.setOnClickListener(new View.OnClickListener(this) { // from class: bm.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f4405v;

                {
                    this.f4405v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = r2;
                    b this$0 = this.f4405v;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f4408z.f();
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            boolean subscriptionEnabled = SubscriptionPersistence.INSTANCE.getSubscriptionEnabled();
                            b.c cVar2 = this$0.f4408z;
                            if (subscriptionEnabled) {
                                cVar2.b();
                                return;
                            } else {
                                cVar2.f();
                                return;
                            }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == 0) {
            return new d(yp.n.a(LayoutInflater.from(parent.getContext()), parent));
        }
        int i10 = this.C;
        int i11 = R.id.addGoalButton;
        if (i6 == i10) {
            View d10 = defpackage.d.d(parent, R.layout.row_goal_cta_custom, parent, false);
            RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.addGoalButton, d10);
            if (robertoButton != null) {
                i11 = R.id.customFooterCTA;
                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.customFooterCTA, d10);
                if (robertoTextView != null) {
                    i11 = R.id.customFooterImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.customFooterImage, d10);
                    if (appCompatImageView != null) {
                        i11 = R.id.customFooterSubtitle;
                        RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.customFooterSubtitle, d10);
                        if (robertoTextView2 != null) {
                            i11 = R.id.customFooterTitle;
                            RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.customFooterTitle, d10);
                            if (robertoTextView3 != null) {
                                i11 = R.id.guideline;
                                Guideline guideline = (Guideline) hc.d.w(R.id.guideline, d10);
                                if (guideline != null) {
                                    return new C0084b(new qd((ConstraintLayout) d10, robertoButton, robertoTextView, appCompatImageView, robertoTextView2, robertoTextView3, guideline, 6));
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(d10.getResources().getResourceName(i11)));
        }
        View d11 = defpackage.d.d(parent, R.layout.row_goal_cta_custom_unlocked, parent, false);
        RobertoButton robertoButton2 = (RobertoButton) hc.d.w(R.id.addGoalButton, d11);
        if (robertoButton2 != null) {
            return new a(new yp.o((ConstraintLayout) d11, robertoButton2, 1));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(d11.getResources().getResourceName(R.id.addGoalButton)));
    }
}
