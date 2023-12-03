package wn;

import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.x;
/* compiled from: MultiTrackerInsightsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerInsightsViewModel$fetchItems$2", f = "MultiTrackerInsightsViewModel.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends MultiTrackerModel>>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36776u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f36777v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f36778w;

    /* compiled from: MultiTrackerInsightsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerInsightsViewModel$fetchItems$2$1", f = "MultiTrackerInsightsViewModel.kt", l = {R.styleable.AppCompatTheme_dividerHorizontal, R.styleable.AppCompatTheme_listPreferredItemPaddingRight}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<Integer, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ List<fe.g> A;
        public final /* synthetic */ i B;
        public final /* synthetic */ com.google.firebase.firestore.d C;

        /* renamed from: u  reason: collision with root package name */
        public Object f36779u;

        /* renamed from: v  reason: collision with root package name */
        public Object f36780v;

        /* renamed from: w  reason: collision with root package name */
        public List f36781w;

        /* renamed from: x  reason: collision with root package name */
        public int f36782x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ int f36783y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ v f36784z;

        /* compiled from: MultiTrackerInsightsViewModel.kt */
        /* renamed from: wn.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0617a<TResult> implements ya.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ls.d<Collection<? extends fe.g>> f36785a;

            public C0617a(ls.h hVar) {
                this.f36785a = hVar;
            }

            @Override // ya.d
            public final void a(ya.h<fe.r> it) {
                kotlin.jvm.internal.i.g(it, "it");
                if (it.isSuccessful()) {
                    this.f36785a.resumeWith(it.getResult().e());
                }
            }
        }

        /* compiled from: MultiTrackerInsightsViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b<TResult> implements ya.d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ls.d<Collection<? extends fe.g>> f36786a;

            public b(ls.h hVar) {
                this.f36786a = hVar;
            }

            @Override // ya.d
            public final void a(ya.h<fe.r> it) {
                kotlin.jvm.internal.i.g(it, "it");
                if (it.isSuccessful()) {
                    this.f36786a.resumeWith(it.getResult().e());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, List<fe.g> list, i iVar, com.google.firebase.firestore.d dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f36784z = vVar;
            this.A = list;
            this.B = iVar;
            this.C = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f36784z, this.A, this.B, this.C, dVar);
            aVar.f36783y = ((Number) obj).intValue();
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(Integer num, ls.d<? super hs.k> dVar) {
            return ((a) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<fe.g> list;
            List<fe.g> list2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36782x;
            i iVar = this.B;
            List<fe.g> list3 = this.A;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        list = this.f36781w;
                        com.google.firebase.firestore.d dVar = (com.google.firebase.firestore.d) this.f36780v;
                        fe.g gVar = (fe.g) this.f36779u;
                        sp.b.d0(obj);
                        list.addAll((Collection) obj);
                        w<List<MultiTrackerModel>> wVar = iVar.f36795y;
                        ArrayList arrayList = new ArrayList();
                        for (fe.g gVar2 : list3) {
                            MultiTrackerModel multiTrackerModel = (MultiTrackerModel) gVar2.d(MultiTrackerModel.class);
                            if (multiTrackerModel != null) {
                                arrayList.add(multiTrackerModel);
                            }
                        }
                        wVar.i(arrayList);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    list2 = (List) this.f36780v;
                    com.google.firebase.firestore.d dVar2 = (com.google.firebase.firestore.d) this.f36779u;
                    sp.b.d0(obj);
                    list2.addAll((Collection) obj);
                    w<List<MultiTrackerModel>> wVar2 = iVar.f36795y;
                    ArrayList arrayList2 = new ArrayList();
                    for (fe.g gVar3 : list3) {
                        MultiTrackerModel multiTrackerModel2 = (MultiTrackerModel) gVar3.d(MultiTrackerModel.class);
                        if (multiTrackerModel2 != null) {
                            arrayList2.add(multiTrackerModel2);
                        }
                    }
                    wVar2.i(arrayList2);
                }
            } else {
                sp.b.d0(obj);
                int i10 = this.f36783y;
                v vVar = this.f36784z;
                int i11 = vVar.f23467u;
                if (i11 < i10 || i11 == 0) {
                    vVar.f23467u = i10;
                    fe.g gVar4 = (fe.g) is.u.p2(list3);
                    com.google.firebase.firestore.d dVar3 = this.C;
                    if (gVar4 == null) {
                        this.f36779u = dVar3;
                        this.f36780v = list3;
                        this.f36782x = 1;
                        ls.h hVar = new ls.h(ca.a.G0(this));
                        dVar3.b(30L).a().addOnCompleteListener(new C0617a(hVar));
                        obj = hVar.b();
                        if (obj == aVar) {
                            return aVar;
                        }
                        list2 = list3;
                        list2.addAll((Collection) obj);
                        w<List<MultiTrackerModel>> wVar22 = iVar.f36795y;
                        ArrayList arrayList22 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        wVar22.i(arrayList22);
                    } else {
                        list3.clear();
                        this.f36779u = gVar4;
                        this.f36780v = dVar3;
                        this.f36781w = list3;
                        this.f36782x = 2;
                        ls.h hVar2 = new ls.h(ca.a.G0(this));
                        dVar3.g(gVar4).b(30L).a().addOnCompleteListener(new b(hVar2));
                        obj = hVar2.b();
                        if (obj == aVar) {
                            return aVar;
                        }
                        list = list3;
                        list.addAll((Collection) obj);
                        w<List<MultiTrackerModel>> wVar3 = iVar.f36795y;
                        ArrayList arrayList3 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        wVar3.i(arrayList3);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, String str, ls.d dVar) {
        super(2, dVar);
        this.f36777v = str;
        this.f36778w = iVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f36778w, this.f36777v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends MultiTrackerModel>> eVar, ls.d<? super hs.k> dVar) {
        return ((e) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36776u;
        i iVar = this.f36778w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                ArrayList arrayList = new ArrayList();
                v vVar = new v();
                com.google.firebase.firestore.d d10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f36777v).b(Constants.USER_MULTITRACKER_TRACKED_DATA).d("date.time");
                x xVar = iVar.f36796z;
                a aVar = new a(vVar, arrayList, iVar, d10, null);
                this.f36776u = 1;
                int i10 = kotlinx.coroutines.flow.h.f23522a;
                kotlinx.coroutines.flow.g gVar = new kotlinx.coroutines.flow.g(aVar, null);
                ls.g gVar2 = ls.g.f24521u;
                iv.e eVar = iv.e.SUSPEND;
                Object a10 = new jv.h(gVar, xVar, gVar2, -2, eVar).e(gVar2, 0, eVar).a(jv.k.f22675u, this);
                if (a10 != obj2) {
                    a10 = hs.k.f19476a;
                }
                if (a10 != obj2) {
                    a10 = hs.k.f19476a;
                }
                if (a10 == obj2) {
                    return obj2;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f36794x, e10);
        }
        return hs.k.f19476a;
    }
}
