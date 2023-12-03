package jl;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: NotV4RecentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4RecentViewModel$fetchRecent$1", f = "NotV4RecentViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogButtonGroupStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22360u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w1 f22361v;

    /* compiled from: NotV4RecentViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ w1 f22362u;

        /* compiled from: NotV4RecentViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4RecentViewModel$fetchRecent$1$1", f = "NotV4RecentViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle}, m = "emit")
        /* renamed from: jl.u1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0334a extends ns.c {
            public final /* synthetic */ a<T> A;
            public int B;

            /* renamed from: u  reason: collision with root package name */
            public a f22363u;

            /* renamed from: v  reason: collision with root package name */
            public il.r f22364v;

            /* renamed from: w  reason: collision with root package name */
            public ArrayList f22365w;

            /* renamed from: x  reason: collision with root package name */
            public Iterator f22366x;

            /* renamed from: y  reason: collision with root package name */
            public NotV4RecentModel f22367y;

            /* renamed from: z  reason: collision with root package name */
            public /* synthetic */ Object f22368z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0334a(a<? super T> aVar, ls.d<? super C0334a> dVar) {
                super(dVar);
                this.A = aVar;
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                this.f22368z = obj;
                this.B |= LinearLayoutManager.INVALID_OFFSET;
                return this.A.b(null, this);
            }
        }

        public a(w1 w1Var) {
            this.f22362u = w1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:30:0x00a5). Please submit an issue!!! */
        @Override // kotlinx.coroutines.flow.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(List<NotV4RecentModel> list, ls.d<? super hs.k> dVar) {
            C0334a c0334a;
            int i6;
            a<T> aVar;
            il.r rVar;
            ArrayList arrayList;
            Iterator<NotV4RecentModel> it;
            Long lastAccessedDate;
            String str;
            String str2;
            if (dVar instanceof C0334a) {
                c0334a = (C0334a) dVar;
                int i10 = c0334a.B;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0334a.B = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c0334a.f22368z;
                    ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                    i6 = c0334a.B;
                    if (i6 == 0) {
                        if (i6 == 1) {
                            NotV4RecentModel next = c0334a.f22367y;
                            it = c0334a.f22366x;
                            arrayList = c0334a.f22365w;
                            rVar = c0334a.f22364v;
                            aVar = c0334a.f22363u;
                            sp.b.d0(obj);
                            LearningHubModel learningHubModel = (LearningHubModel) obj;
                            StringBuilder sb2 = new StringBuilder();
                            if (learningHubModel == null) {
                                str = learningHubModel.getPost_type();
                            } else {
                                str = null;
                            }
                            sb2.append(rVar.a(str));
                            sb2.append(" • ");
                            if (learningHubModel == null) {
                                str2 = learningHubModel.getDuration();
                            } else {
                                str2 = null;
                            }
                            sb2.append(str2);
                            next.setSubText(sb2.toString());
                            arrayList.add(next);
                            while (it.hasNext()) {
                                next = it.next();
                                if (!kotlin.jvm.internal.i.b(next.getParentType(), "suggested_activity") && ((lastAccessedDate = next.getLastAccessedDate()) == null || lastAccessedDate.longValue() != 0)) {
                                    if (kotlin.jvm.internal.i.b(next.getItemType(), "resource")) {
                                        u0 u0Var = aVar.f22362u.f22381x;
                                        String id2 = next.getId();
                                        kotlin.jvm.internal.i.d(id2);
                                        c0334a.f22363u = aVar;
                                        c0334a.f22364v = rVar;
                                        c0334a.f22365w = arrayList;
                                        c0334a.f22366x = it;
                                        c0334a.f22367y = next;
                                        c0334a.B = 1;
                                        obj = u0Var.b(id2, c0334a);
                                        if (obj == aVar2) {
                                            return aVar2;
                                        }
                                        LearningHubModel learningHubModel2 = (LearningHubModel) obj;
                                        StringBuilder sb22 = new StringBuilder();
                                        if (learningHubModel2 == null) {
                                        }
                                        sb22.append(rVar.a(str));
                                        sb22.append(" • ");
                                        if (learningHubModel2 == null) {
                                        }
                                        sb22.append(str2);
                                        next.setSubText(sb22.toString());
                                        arrayList.add(next);
                                        while (it.hasNext()) {
                                        }
                                    } else {
                                        next.setSubText("Activity");
                                        if (kotlin.jvm.internal.i.b(next.getItemType(), "mini_course") && kotlin.jvm.internal.i.b(next.getParentType(), "top_picks")) {
                                            LogHelper.INSTANCE.i("TAG", "skip");
                                        } else {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                            w1 w1Var = aVar.f22362u;
                            w1Var.getClass();
                            ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new v1(arrayList, w1Var, null), 3);
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sp.b.d0(obj);
                    aVar = this;
                    rVar = new il.r();
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    w1 w1Var2 = aVar.f22362u;
                    w1Var2.getClass();
                    ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new v1(arrayList, w1Var2, null), 3);
                    return hs.k.f19476a;
                }
            }
            c0334a = new C0334a(this, dVar);
            Object obj2 = c0334a.f22368z;
            ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
            i6 = c0334a.B;
            if (i6 == 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var, ls.d<? super u1> dVar) {
        super(2, dVar);
        this.f22361v = w1Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u1(this.f22361v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22360u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            w1 w1Var = this.f22361v;
            w1Var.f22381x.getClass();
            kotlinx.coroutines.flow.r c10 = u0.c(w1Var.f22382y, 50);
            a aVar2 = new a(w1Var);
            this.f22360u = 1;
            if (c10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
