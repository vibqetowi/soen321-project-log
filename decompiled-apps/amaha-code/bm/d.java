package bm;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GoalType;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: FirestoreGoalsAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.e<RecyclerView.c0> {
    public final b A;
    public final HashMap<String, GoalType> B;
    public boolean C;
    public List<FirestoreGoal> D;

    /* renamed from: x  reason: collision with root package name */
    public final Context f4430x;

    /* renamed from: z  reason: collision with root package name */
    public Date f4432z;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f4431y = false;
    public final int E = 1;
    public final GoalHelper F = new GoalHelper();

    /* compiled from: FirestoreGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final yp.o f4433u;

        public a(yp.o oVar) {
            super(oVar.f38881a);
            this.f4433u = oVar;
        }
    }

    /* compiled from: FirestoreGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();

        void c(FirestoreGoal firestoreGoal);

        void d(FirestoreGoal firestoreGoal);

        void e(FirestoreGoal firestoreGoal);

        void f(FirestoreGoal firestoreGoal, long j10);
    }

    /* compiled from: FirestoreGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final yp.n f4434u;

        public c(yp.n nVar) {
            super(nVar.f38874a);
            this.f4434u = nVar;
        }
    }

    /* compiled from: FirestoreGoalsAdapter.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.adapter.FirestoreGoalsAdapter$onBindViewHolder$1$1", f = "FirestoreGoalsAdapter.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: bm.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0085d extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ x<Integer> B;

        /* renamed from: u  reason: collision with root package name */
        public int f4435u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f4436v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ d f4437w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c f4438x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f4439y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ImageView[] f4440z;

        /* compiled from: FirestoreGoalsAdapter.kt */
        /* renamed from: bm.d$d$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {
            public final /* synthetic */ x<Integer> A;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ d f4441u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ FirestoreGoal f4442v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f4443w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f4444x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ ImageView[] f4445y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f4446z;

            public a(d dVar, FirestoreGoal firestoreGoal, c cVar, String str, ImageView[] imageViewArr, int i6, x<Integer> xVar) {
                this.f4441u = dVar;
                this.f4442v = firestoreGoal;
                this.f4443w = cVar;
                this.f4444x = str;
                this.f4445y = imageViewArr;
                this.f4446z = i6;
                this.A = xVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                int i6;
                int i10;
                int i11;
                ArrayList arrayList = (ArrayList) obj;
                c cVar = this.f4443w;
                yp.n nVar = cVar.f4434u;
                d dVar2 = this.f4441u;
                dVar2.getClass();
                kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                kotlinx.coroutines.internal.c c10 = kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a);
                FirestoreGoal firestoreGoal = this.f4442v;
                boolean z10 = false;
                v.H(c10, null, 0, new e(firestoreGoal, nVar, dVar2, null), 3);
                u uVar = new u();
                String[] strArr = {Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE};
                String str = this.f4444x;
                boolean Q1 = is.k.Q1(str, strArr);
                yp.n nVar2 = cVar.f4434u;
                Context context = dVar2.f4430x;
                if (!Q1) {
                    Iterator<z<T>> it = is.u.N2(arrayList).iterator();
                    while (true) {
                        b0 b0Var = (b0) it;
                        if (b0Var.hasNext()) {
                            z zVar = (z) b0Var.next();
                            boolean booleanValue = ((Boolean) zVar.f20680b).booleanValue();
                            ImageView[] imageViewArr = this.f4445y;
                            int i12 = zVar.f20679a;
                            if (booleanValue) {
                                ImageView imageView = imageViewArr[i12];
                                boolean z11 = dVar2.f4431y;
                                if (imageView != null) {
                                    if (z11) {
                                        i11 = R.drawable.circle_filled_sea;
                                    } else {
                                        i11 = R.drawable.circle_filled_orange;
                                    }
                                    Object obj2 = g0.a.f16164a;
                                    imageView.setBackground(a.c.b(context, i11));
                                }
                                ImageView imageView2 = imageViewArr[i12];
                                if (imageView2 != null) {
                                    imageView2.setImageResource(R.drawable.ic_right);
                                }
                                ImageView imageView3 = imageViewArr[i12];
                                if (imageView3 != null) {
                                    if (z11) {
                                        i10 = R.color.sea;
                                    } else {
                                        i10 = R.color.orange;
                                    }
                                    imageView3.setColorFilter(g0.a.b(context, i10));
                                }
                            } else {
                                ImageView imageView4 = imageViewArr[i12];
                                if (imageView4 != null) {
                                    Object obj3 = g0.a.f16164a;
                                    imageView4.setBackground(a.c.b(context, R.drawable.circle_filled_light_grey));
                                }
                                ImageView imageView5 = imageViewArr[i12];
                                if (imageView5 != null) {
                                    imageView5.setImageResource(R.drawable.ic_right);
                                }
                                ImageView imageView6 = imageViewArr[i12];
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
                    calendar.setTime(dVar2.f4432z);
                    int i13 = calendar.get(7);
                    if (i13 != 1) {
                        i6 = i13 - 2;
                    } else {
                        i6 = 6;
                    }
                    Object obj4 = arrayList.get(i6);
                    kotlin.jvm.internal.i.f(obj4, "{\n            val c: Cal…Day - 2 else 6]\n        }");
                    z10 = ((Boolean) obj4).booleanValue();
                    uVar.f23466u = z10;
                    d.v(dVar2, z10, nVar2);
                } else if (kotlin.jvm.internal.i.b(str, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                    boolean contains = arrayList.contains(Boolean.TRUE);
                    uVar.f23466u = contains;
                    if (contains) {
                        d.v(dVar2, true, nVar2);
                        nVar2.f38880h.setText(context.getString(R.string.weeklyGoalDoneLowerCase));
                    } else {
                        d.v(dVar2, false, nVar2);
                        String obj5 = DateFormat.format("EEEE", firestoreGoal.getScheduledDate().getTime() * 1000).toString();
                        boolean b10 = kotlin.jvm.internal.i.b(obj5, DateFormat.format("EEEE", dVar2.f4432z.getTime()));
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
                        d.v(dVar2, true, nVar2);
                        nVar2.f38880h.setText(context.getString(R.string.onceGoalDoneLowerCase));
                    } else {
                        d.v(dVar2, false, nVar2);
                        nVar2.f38880h.setText(context.getString(R.string.weeklyGoalScheduledLowerCase, DateFormat.format("dd MMM,yyyy", firestoreGoal.getScheduledDate().getTime() * 1000).toString()));
                    }
                }
                nVar2.f38874a.setOnClickListener(new el.c(this.f4441u, this.f4442v, this.f4446z, this.A, uVar, 2));
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0085d(FirestoreGoal firestoreGoal, d dVar, c cVar, String str, ImageView[] imageViewArr, int i6, x<Integer> xVar, ls.d<? super C0085d> dVar2) {
            super(2, dVar2);
            this.f4436v = firestoreGoal;
            this.f4437w = dVar;
            this.f4438x = cVar;
            this.f4439y = str;
            this.f4440z = imageViewArr;
            this.A = i6;
            this.B = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new C0085d(this.f4436v, this.f4437w, this.f4438x, this.f4439y, this.f4440z, this.A, this.B, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            ((C0085d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            return ms.a.COROUTINE_SUSPENDED;
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f4435u;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.flow.p<ArrayList<Boolean>> trackListFlow = this.f4436v.getTrackListFlow();
                a aVar2 = new a(this.f4437w, this.f4436v, this.f4438x, this.f4439y, this.f4440z, this.A, this.B);
                this.f4435u = 1;
                if (trackListFlow.a(aVar2, this) == aVar) {
                    return aVar;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    public d(Date date, cm.q qVar, List list, Context context) {
        this.f4430x = context;
        this.f4432z = date;
        this.A = qVar;
        HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap();
        kotlin.jvm.internal.i.f(goalsHashMap, "getGoalsHashMap()");
        this.B = goalsHashMap;
        this.D = list;
    }

    public static final void v(d dVar, boolean z10, yp.n nVar) {
        int i6;
        Context context = dVar.f4430x;
        if (z10) {
            AppCompatImageView appCompatImageView = nVar.f38875b;
            if (dVar.f4431y) {
                i6 = R.drawable.circle_filled_sea;
            } else {
                i6 = R.drawable.circle_filled_orange;
            }
            appCompatImageView.setBackgroundResource(i6);
            nVar.f38875b.setColorFilter(g0.a.b(context, R.color.white));
            return;
        }
        nVar.f38875b.setBackgroundResource(R.drawable.circle_goals_new_grey);
        nVar.f38875b.setColorFilter(g0.a.b(context, R.color.goalsNewCardCheckGrey));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        if (!this.D.isEmpty()) {
            return this.D.size() + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (i6 == this.D.size() && (!this.D.isEmpty())) {
            return this.E;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.Integer] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        if (h(i6) == 0) {
            c cVar = (c) c0Var;
            x xVar = new x();
            FirestoreGoal firestoreGoal = this.D.get(i6);
            String type = firestoreGoal.getType();
            GoalType goalType = this.B.get(firestoreGoal.getGoalId());
            kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
            kotlinx.coroutines.internal.c c10 = kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a);
            yp.n nVar = cVar.f4434u;
            v.H(c10, null, 0, new e(firestoreGoal, nVar, this, null), 3);
            if (goalType != null) {
                nVar.f.setText(goalType.getDashboardTxt());
            } else {
                nVar.f.setText(firestoreGoal.getGoalName());
            }
            String courseDisplayName = Constants.getCourseDisplayName(firestoreGoal.getCourseName());
            if (gv.n.B0(courseDisplayName)) {
                courseDisplayName = this.f4430x.getString(R.string.customGoalLabel);
            }
            nVar.f38878e.setText(courseDisplayName);
            Extensions extensions = Extensions.INSTANCE;
            RobertoTextView robertoTextView = nVar.f38878e;
            kotlin.jvm.internal.i.f(robertoTextView, "binding.tvRowGoalCourse");
            extensions.visible(robertoTextView);
            ImageView[] imageViewArr = new ImageView[7];
            RobertoTextView[] robertoTextViewArr = new RobertoTextView[7];
            int i10 = 0;
            for (int i11 = 7; i10 < i11; i11 = 7) {
                ConstraintLayout constraintLayout = nVar.f38874a;
                imageViewArr[i10] = (ImageView) constraintLayout.findViewById(constraintLayout.getContext().getResources().getIdentifier(defpackage.c.p("iday", i10), "id", constraintLayout.getContext().getPackageName()));
                robertoTextViewArr[i10] = (RobertoTextView) constraintLayout.findViewById(constraintLayout.getContext().getResources().getIdentifier(defpackage.c.p("tday", i10), "id", constraintLayout.getContext().getPackageName()));
                i10++;
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
                xVar.f23469u = Integer.valueOf(this.F.getWeekdayOffset(firestoreGoal.getScheduledDate().getTime() * 1000, this.f4432z.getTime()));
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
            v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.internal.k.f23608a), null, 0, new C0085d(firestoreGoal, this, cVar, type, imageViewArr, i6, xVar, null), 3);
            nVar.f38876c.setOnClickListener(new l1(this, firestoreGoal, i6, 10));
            nVar.f38875b.setOnClickListener(new t(24, cVar, this, firestoreGoal));
            return;
        }
        ((a) c0Var).f4433u.f38882b.setOnClickListener(new ol.k(10, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == 0) {
            return new c(yp.n.a(LayoutInflater.from(parent.getContext()), parent));
        }
        View d10 = defpackage.d.d(parent, R.layout.row_goal_cta, parent, false);
        RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.addGoalButton, d10);
        if (robertoButton != null) {
            return new a(new yp.o((ConstraintLayout) d10, robertoButton, 0));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(d10.getResources().getResourceName(R.id.addGoalButton)));
    }
}
