package fm;

import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$fetchTrackList$1", f = "FirestoreGoalsViewModelRepository.kt", l = {R.styleable.AppCompatTheme_switchStyle, R.styleable.AppCompatTheme_textAppearanceListItemSmall}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r0 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends GoalDateObj>>, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ j0 A;
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> B;

    /* renamed from: u  reason: collision with root package name */
    public int f15522u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f15523v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f15524w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f15525x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Long f15526y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Long f15527z;

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<GoalDateObj>> f15528u;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.e<? super List<GoalDateObj>> eVar) {
            this.f15528u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            ArrayList arrayList = new ArrayList();
            for (fe.g gVar : (List) obj) {
                GoalDateObj goalDateObj = (GoalDateObj) gVar.d(GoalDateObj.class);
                if (goalDateObj != null) {
                    arrayList.add(goalDateObj);
                }
            }
            Object b10 = this.f15528u.b(arrayList, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<GoalDateObj>> f15529u;

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlinx.coroutines.flow.e<? super List<GoalDateObj>> eVar) {
            this.f15529u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            ArrayList arrayList = new ArrayList();
            for (fe.g gVar : (List) obj) {
                GoalDateObj goalDateObj = (GoalDateObj) gVar.d(GoalDateObj.class);
                if (goalDateObj != null) {
                    arrayList.add(goalDateObj);
                }
            }
            Object b10 = this.f15529u.b(arrayList, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return hs.k.f19476a;
            }
            return b10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String str, String str2, Long l2, Long l10, j0 j0Var, kotlinx.coroutines.flow.d<Integer> dVar, ls.d<? super r0> dVar2) {
        super(2, dVar2);
        this.f15524w = str;
        this.f15525x = str2;
        this.f15526y = l2;
        this.f15527z = l10;
        this.A = j0Var;
        this.B = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        r0 r0Var = new r0(this.f15524w, this.f15525x, this.f15526y, this.f15527z, this.A, this.B, dVar);
        r0Var.f15523v = obj;
        return r0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends GoalDateObj>> eVar, ls.d<? super hs.k> dVar) {
        return ((r0) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Long l2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15522u;
        if (i6 != 0) {
            if (i6 != 1 && i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.flow.e eVar = (kotlinx.coroutines.flow.e) this.f15523v;
            fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f15524w).b(Constants.USER_GOALS_DATA).q(this.f15525x).b(Constants.USER_GOALS_TRACK_DATA);
            kotlinx.coroutines.flow.d<Integer> dVar = this.B;
            j0 j0Var = this.A;
            Long l10 = this.f15526y;
            if (l10 != null && (l2 = this.f15527z) != null) {
                kotlinx.coroutines.flow.r a10 = j0.a(j0Var, b10.d("date.time").n(l10, "date.time").p(l2, "date.time"), dVar);
                a aVar2 = new a(eVar);
                this.f15522u = 1;
                if (a10.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                kotlinx.coroutines.flow.r a11 = j0.a(j0Var, b10.d("date.time"), dVar);
                b bVar = new b(eVar);
                this.f15522u = 2;
                if (a11.a(bVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return hs.k.f19476a;
    }
}
