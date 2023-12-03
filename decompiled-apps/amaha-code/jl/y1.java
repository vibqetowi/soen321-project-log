package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: NotV4SuggestedActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$addOrUpdateSuggestedActivityAccess$1", f = "NotV4SuggestedActivityViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22424u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SuggestedActivityModel f22425v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x1 f22426w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f22427x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f22428y;

    /* compiled from: NotV4SuggestedActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$addOrUpdateSuggestedActivityAccess$1$1", f = "NotV4SuggestedActivityViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlActivated}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22429u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ SuggestedActivityModel f22430v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x1 f22431w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22432x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f22433y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SuggestedActivityModel suggestedActivityModel, x1 x1Var, String str, int i6, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22430v = suggestedActivityModel;
            this.f22431w = x1Var;
            this.f22432x = str;
            this.f22433y = i6;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22430v, this.f22431w, this.f22432x, this.f22433y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<SuggestedActivityModel> planSuggested;
            Object obj2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22429u;
            x1 x1Var = this.f22431w;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                Course courseByName = firebasePersistence.getCourseByName(this.f22432x);
                SuggestedActivityModel suggestedActivityModel = this.f22430v;
                if (courseByName != null && (planSuggested = courseByName.getPlanSuggested()) != null) {
                    Iterator<T> it = planSuggested.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.i.b(((SuggestedActivityModel) obj2).getContent_id(), suggestedActivityModel.getContent_id())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    SuggestedActivityModel suggestedActivityModel2 = (SuggestedActivityModel) obj2;
                    if (suggestedActivityModel2 != null) {
                        if (suggestedActivityModel2.getStart_date() == 0) {
                            suggestedActivityModel2.setStart_date(timeInMillis);
                        }
                        suggestedActivityModel2.setLast_accessed_date(timeInMillis);
                        firebasePersistence.updateUserOnFirebase();
                    }
                }
                if (suggestedActivityModel.getContent_id() != null) {
                    cn.e1 e1Var = x1Var.f22387x;
                    String content_id = suggestedActivityModel.getContent_id();
                    kotlin.jvm.internal.i.d(content_id);
                    String concat = "suggested_".concat(content_id);
                    String content_label = suggestedActivityModel.getContent_label();
                    if (content_label == null) {
                        content_label = "";
                    }
                    String str = this.f22432x;
                    boolean isFree = suggestedActivityModel.isFree();
                    this.f22429u = 1;
                    if (e1Var.k(concat, "main_activity", content_label, timeInMillis, false, str, "suggested_activity", isFree, this) == aVar) {
                        return aVar;
                    }
                }
            }
            x1Var.f22389z.i(new Integer(this.f22433y));
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(SuggestedActivityModel suggestedActivityModel, x1 x1Var, String str, int i6, ls.d<? super y1> dVar) {
        super(2, dVar);
        this.f22425v = suggestedActivityModel;
        this.f22426w = x1Var;
        this.f22427x = str;
        this.f22428y = i6;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new y1(this.f22425v, this.f22426w, this.f22427x, this.f22428y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22424u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22425v, this.f22426w, this.f22427x, this.f22428y, null);
            this.f22424u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
