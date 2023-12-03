package wn;

import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: MultiTrackerViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerViewModel$addMoodTrack$1", f = "MultiTrackerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f36826u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MultiTrackerModel f36827v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f36828w;

    /* compiled from: MultiTrackerViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerViewModel$addMoodTrack$1$1$1", f = "MultiTrackerViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36829u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ t f36830v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f36831w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ MultiTrackerModel f36832x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MultiTrackerModel multiTrackerModel, t tVar, String str, ls.d dVar) {
            super(2, dVar);
            this.f36830v = tVar;
            this.f36831w = str;
            this.f36832x = multiTrackerModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f36832x, this.f36830v, this.f36831w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36829u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                String str = this.f36831w;
                MultiTrackerModel multiTrackerModel = this.f36832x;
                this.f36829u = 1;
                t tVar = this.f36830v;
                tVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new r(hVar, tVar, str, multiTrackerModel, null), 3);
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MultiTrackerModel multiTrackerModel, t tVar, String str, ls.d dVar) {
        super(2, dVar);
        this.f36826u = str;
        this.f36827v = multiTrackerModel;
        this.f36828w = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p(this.f36827v, this.f36828w, this.f36826u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f36826u;
        t tVar = this.f36828w;
        MultiTrackerModel multiTrackerModel = this.f36827v;
        sp.b.d0(obj);
        try {
            FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).b(Constants.USER_MULTITRACKER_TRACKED_DATA).q(String.valueOf(multiTrackerModel.getDate().getTime())).e(multiTrackerModel).addOnCompleteListener(new ne.i(tVar, str, multiTrackerModel, 2));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f36859x, e10);
        }
        return hs.k.f19476a;
    }
}
