package ml;

import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$checkIfAlreadyClickedHomeWorkNotificationsCompleted$1", f = "DashboardTelecommunicationsViewModel.kt", l = {549}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25339u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25340v;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$checkIfAlreadyClickedHomeWorkNotificationsCompleted$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {554, 570, 578, 594}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ p A;

        /* renamed from: u  reason: collision with root package name */
        public ArrayList f25341u;

        /* renamed from: v  reason: collision with root package name */
        public sf.i f25342v;

        /* renamed from: w  reason: collision with root package name */
        public Set f25343w;

        /* renamed from: x  reason: collision with root package name */
        public ArrayList f25344x;

        /* renamed from: y  reason: collision with root package name */
        public int f25345y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f25346z;

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$checkIfAlreadyClickedHomeWorkNotificationsCompleted$1$1$1$1$2", f = "DashboardTelecommunicationsViewModel.kt", l = {562}, m = "invokeSuspend")
        /* renamed from: ml.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0410a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25347u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25348v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ kl.a f25349w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0410a(p pVar, kl.a aVar, ls.d<? super C0410a> dVar) {
                super(2, dVar);
                this.f25348v = pVar;
                this.f25349w = aVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0410a(this.f25348v, this.f25349w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((C0410a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25347u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    rp.a aVar2 = this.f25348v.f25558y;
                    String str = this.f25349w.f23383u;
                    if (str == null) {
                        str = "";
                    }
                    this.f25347u = 1;
                    obj = aVar2.k(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: DashboardTelecommunicationsViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$checkIfAlreadyClickedHomeWorkNotificationsCompleted$1$1$2$1$2", f = "DashboardTelecommunicationsViewModel.kt", l = {586}, m = "invokeSuspend")
        /* renamed from: ml.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0411b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f25350u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f25351v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ kl.a f25352w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0411b(p pVar, kl.a aVar, ls.d<? super C0411b> dVar) {
                super(2, dVar);
                this.f25351v = pVar;
                this.f25352w = aVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0411b(this.f25351v, this.f25352w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((C0411b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f25350u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    rp.a aVar2 = this.f25351v.f25558y;
                    String str = this.f25352w.f23383u;
                    if (str == null) {
                        str = "";
                    }
                    this.f25350u = 1;
                    obj = aVar2.k(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.A = pVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.A, dVar);
            aVar.f25346z = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0187 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sf.i iVar;
            Set<String> homeworkIdClickedSet;
            Object e10;
            kotlinx.coroutines.d0 d0Var;
            ArrayList arrayList;
            ArrayList arrayList2;
            sf.i iVar2;
            Set<String> homeworkIdClickedSet2;
            Set<String> set;
            ArrayList arrayList3;
            ArrayList arrayList4;
            TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel;
            String str;
            String id2;
            boolean z10;
            boolean z11;
            boolean z12;
            kotlinx.coroutines.d0 d0Var2;
            Object e11;
            TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel2;
            List list;
            Iterator it;
            String str2;
            String id3;
            boolean z13;
            boolean z14;
            boolean z15;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25345y;
            p pVar = this.A;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                list = (List) this.f25346z;
                                sp.b.d0(obj);
                                Set<String> stringSetValue = ApplicationPersistence.getInstance().getStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET);
                                stringSetValue.removeAll(list);
                                ApplicationPersistence.getInstance().setStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET, stringSetValue);
                                return hs.k.f19476a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        homeworkIdClickedSet2 = this.f25343w;
                        iVar2 = this.f25342v;
                        arrayList2 = this.f25341u;
                        d0Var2 = (kotlinx.coroutines.d0) this.f25346z;
                        sp.b.d0(obj);
                        e11 = obj;
                        telecommunicationsHomeworkResponseModel2 = (TelecommunicationsHomeworkResponseModel) e11;
                        if (telecommunicationsHomeworkResponseModel2 == null) {
                            kotlin.jvm.internal.i.f(homeworkIdClickedSet2, "homeworkIdClickedSet");
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it2 = homeworkIdClickedSet2.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                kl.a aVar2 = (kl.a) iVar2.b(kl.a.class, (String) next);
                                ArrayList<TelecommunicationsHomeworkResponseModel.HomeworkModel> homeworkList = telecommunicationsHomeworkResponseModel2.getHomeworkList();
                                if (!(homeworkList instanceof Collection) || !homeworkList.isEmpty()) {
                                    for (TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel : homeworkList) {
                                        Integer num = aVar2.f23384v;
                                        if (num != null) {
                                            str2 = num.toString();
                                            it = it2;
                                        } else {
                                            it = it2;
                                            str2 = null;
                                        }
                                        if (aVar2.f23386x) {
                                            id3 = homeworkModel.getAssignedId();
                                        } else {
                                            id3 = homeworkModel.getId();
                                        }
                                        if (kotlin.jvm.internal.i.b(str2, id3) && !aVar2.f23385w && aVar2.f23383u != null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            z14 = true;
                                            break;
                                        }
                                        it2 = it;
                                    }
                                }
                                it = it2;
                                z14 = false;
                                if (z14) {
                                    arrayList2.add(ta.v.g(d0Var2, null, new C0411b(pVar, aVar2, null), 3));
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    arrayList5.add(next);
                                }
                                it2 = it;
                            }
                            if (!arrayList5.isEmpty()) {
                                this.f25346z = arrayList5;
                                this.f25341u = null;
                                this.f25342v = null;
                                this.f25343w = null;
                                this.f25345y = 4;
                                if (ca.a.n(arrayList2, this) == aVar) {
                                    return aVar;
                                }
                                list = arrayList5;
                                Set<String> stringSetValue2 = ApplicationPersistence.getInstance().getStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET);
                                stringSetValue2.removeAll(list);
                                ApplicationPersistence.getInstance().setStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET, stringSetValue2);
                            }
                            return hs.k.f19476a;
                        }
                        return null;
                    }
                    arrayList4 = this.f25344x;
                    set = this.f25343w;
                    iVar = this.f25342v;
                    arrayList3 = this.f25341u;
                    d0Var = (kotlinx.coroutines.d0) this.f25346z;
                    sp.b.d0(obj);
                    Set<String> stringSetValue3 = ApplicationPersistence.getInstance().getStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET);
                    stringSetValue3.removeAll(arrayList4);
                    ApplicationPersistence.getInstance().setStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET, stringSetValue3);
                    homeworkIdClickedSet2 = set;
                    iVar2 = iVar;
                    arrayList2 = arrayList3;
                    d0Var2 = d0Var;
                    rp.a aVar3 = pVar.f25558y;
                    this.f25346z = d0Var2;
                    this.f25341u = arrayList2;
                    this.f25342v = iVar2;
                    this.f25343w = homeworkIdClickedSet2;
                    this.f25344x = null;
                    this.f25345y = 3;
                    e11 = aVar3.e(false, false, 10, this);
                    if (e11 == aVar) {
                        return aVar;
                    }
                    telecommunicationsHomeworkResponseModel2 = (TelecommunicationsHomeworkResponseModel) e11;
                    if (telecommunicationsHomeworkResponseModel2 == null) {
                    }
                } else {
                    Set<String> set2 = this.f25343w;
                    sf.i iVar3 = this.f25342v;
                    ArrayList arrayList6 = this.f25341u;
                    kotlinx.coroutines.d0 d0Var3 = (kotlinx.coroutines.d0) this.f25346z;
                    sp.b.d0(obj);
                    e10 = obj;
                    homeworkIdClickedSet = set2;
                    arrayList = arrayList6;
                    iVar = iVar3;
                    d0Var = d0Var3;
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var4 = (kotlinx.coroutines.d0) this.f25346z;
                ArrayList arrayList7 = new ArrayList();
                iVar = new sf.i();
                homeworkIdClickedSet = ApplicationPersistence.getInstance().getStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET);
                rp.a aVar4 = pVar.f25558y;
                this.f25346z = d0Var4;
                this.f25341u = arrayList7;
                this.f25342v = iVar;
                this.f25343w = homeworkIdClickedSet;
                this.f25345y = 1;
                e10 = aVar4.e(false, true, 10, this);
                if (e10 == aVar) {
                    return aVar;
                }
                d0Var = d0Var4;
                arrayList = arrayList7;
            }
            TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel3 = (TelecommunicationsHomeworkResponseModel) e10;
            if (telecommunicationsHomeworkResponseModel3 != null) {
                kotlin.jvm.internal.i.f(homeworkIdClickedSet, "homeworkIdClickedSet");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : homeworkIdClickedSet) {
                    kl.a aVar5 = (kl.a) iVar.b(kl.a.class, (String) obj2);
                    ArrayList<TelecommunicationsHomeworkResponseModel.HomeworkModel> homeworkList2 = telecommunicationsHomeworkResponseModel3.getHomeworkList();
                    if (!(homeworkList2 instanceof Collection) || !homeworkList2.isEmpty()) {
                        Iterator it3 = homeworkList2.iterator();
                        while (it3.hasNext()) {
                            TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel2 = (TelecommunicationsHomeworkResponseModel.HomeworkModel) it3.next();
                            Iterator it4 = it3;
                            Integer num2 = aVar5.f23384v;
                            if (num2 != null) {
                                str = num2.toString();
                                telecommunicationsHomeworkResponseModel = telecommunicationsHomeworkResponseModel3;
                            } else {
                                telecommunicationsHomeworkResponseModel = telecommunicationsHomeworkResponseModel3;
                                str = null;
                            }
                            if (aVar5.f23386x) {
                                id2 = homeworkModel2.getAssignedId();
                            } else {
                                id2 = homeworkModel2.getId();
                            }
                            if (kotlin.jvm.internal.i.b(str, id2) && aVar5.f23385w && aVar5.f23383u != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                z11 = true;
                                break;
                            }
                            it3 = it4;
                            telecommunicationsHomeworkResponseModel3 = telecommunicationsHomeworkResponseModel;
                        }
                    }
                    telecommunicationsHomeworkResponseModel = telecommunicationsHomeworkResponseModel3;
                    z11 = false;
                    if (z11) {
                        arrayList.add(ta.v.g(d0Var, null, new C0410a(pVar, aVar5, null), 3));
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList8.add(obj2);
                    }
                    telecommunicationsHomeworkResponseModel3 = telecommunicationsHomeworkResponseModel;
                }
                if (!arrayList8.isEmpty()) {
                    this.f25346z = d0Var;
                    this.f25341u = arrayList;
                    this.f25342v = iVar;
                    this.f25343w = homeworkIdClickedSet;
                    this.f25344x = arrayList8;
                    this.f25345y = 2;
                    if (ca.a.n(arrayList, this) == aVar) {
                        return aVar;
                    }
                    set = homeworkIdClickedSet;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList8;
                    Set<String> stringSetValue32 = ApplicationPersistence.getInstance().getStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET);
                    stringSetValue32.removeAll(arrayList4);
                    ApplicationPersistence.getInstance().setStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET, stringSetValue32);
                    homeworkIdClickedSet2 = set;
                    iVar2 = iVar;
                    arrayList2 = arrayList3;
                    d0Var2 = d0Var;
                    rp.a aVar32 = pVar.f25558y;
                    this.f25346z = d0Var2;
                    this.f25341u = arrayList2;
                    this.f25342v = iVar2;
                    this.f25343w = homeworkIdClickedSet2;
                    this.f25344x = null;
                    this.f25345y = 3;
                    e11 = aVar32.e(false, false, 10, this);
                    if (e11 == aVar) {
                    }
                    telecommunicationsHomeworkResponseModel2 = (TelecommunicationsHomeworkResponseModel) e11;
                    if (telecommunicationsHomeworkResponseModel2 == null) {
                    }
                }
            }
            arrayList2 = arrayList;
            iVar2 = iVar;
            homeworkIdClickedSet2 = homeworkIdClickedSet;
            d0Var2 = d0Var;
            rp.a aVar322 = pVar.f25558y;
            this.f25346z = d0Var2;
            this.f25341u = arrayList2;
            this.f25342v = iVar2;
            this.f25343w = homeworkIdClickedSet2;
            this.f25344x = null;
            this.f25345y = 3;
            e11 = aVar322.e(false, false, 10, this);
            if (e11 == aVar) {
            }
            telecommunicationsHomeworkResponseModel2 = (TelecommunicationsHomeworkResponseModel) e11;
            if (telecommunicationsHomeworkResponseModel2 == null) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f25340v = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f25340v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25339u;
        p pVar = this.f25340v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                a aVar2 = new a(pVar, null);
                this.f25339u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f25559z, e10);
        }
        return hs.k.f19476a;
    }
}
