package em;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.model.TemplateModel;
import fe.g;
import fe.r;
import gv.n;
import hs.f;
import hs.k;
import is.u;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
import ya.v;
/* compiled from: GoalsNotificationUtils.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.utils.GoalsNotificationUtils$fetchNotificationStrings$2$1", f = "GoalsNotificationUtils.kt", l = {296, 311}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f14396u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f14397v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<f<String, String>> f14398w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, ls.d<? super f<String, String>> dVar, ls.d<? super b> dVar2) {
        super(2, dVar2);
        this.f14397v = str;
        this.f14398w = dVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f14397v, this.f14398w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TemplateModel templateModel;
        boolean z10;
        boolean z11;
        g gVar;
        r rVar;
        TemplateModel templateModel2;
        boolean z12;
        g gVar2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14396u;
        String str = this.f14397v;
        ls.d<f<String, String>> dVar = this.f14398w;
        boolean z13 = false;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    rVar = (r) obj;
                    if (rVar == null && (gVar2 = (g) u.i2(rVar.e())) != null) {
                        templateModel2 = (TemplateModel) gVar2.d(TemplateModel.class);
                    } else {
                        templateModel2 = null;
                    }
                    if (templateModel2 != null) {
                        String notificationTitle = templateModel2.getNotificationTitle();
                        if (notificationTitle != null && !n.B0(notificationTitle)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            String notificationBody = templateModel2.getNotificationBody();
                            if (!((notificationBody == null || n.B0(notificationBody)) ? true : true)) {
                                String notificationTitle2 = templateModel2.getNotificationTitle();
                                kotlin.jvm.internal.i.d(notificationTitle2);
                                String notificationBody2 = templateModel2.getNotificationBody();
                                kotlin.jvm.internal.i.d(notificationBody2);
                                dVar.resumeWith(new f(notificationTitle2, notificationBody2));
                                return k.f19476a;
                            }
                        }
                    }
                    dVar.resumeWith(null);
                    return k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            v a10 = FirebaseFirestore.d().b("template_bank").m(str, "label").m("en", "language").a();
            kotlin.jvm.internal.i.f(a10, "getInstance().collection…                   .get()");
            this.f14396u = 1;
            obj = tr.r.g(a10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        r rVar2 = (r) obj;
        if (rVar2 != null && (gVar = (g) u.i2(rVar2.e())) != null) {
            templateModel = (TemplateModel) gVar.d(TemplateModel.class);
        } else {
            templateModel = null;
        }
        if (templateModel != null) {
            String notificationTitle3 = templateModel.getNotificationTitle();
            if (notificationTitle3 != null && !n.B0(notificationTitle3)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                String notificationBody3 = templateModel.getNotificationBody();
                if (notificationBody3 != null && !n.B0(notificationBody3)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    String notificationTitle4 = templateModel.getNotificationTitle();
                    kotlin.jvm.internal.i.d(notificationTitle4);
                    String notificationBody4 = templateModel.getNotificationBody();
                    kotlin.jvm.internal.i.d(notificationBody4);
                    dVar.resumeWith(new f(notificationTitle4, notificationBody4));
                    return k.f19476a;
                }
            }
        }
        v a11 = FirebaseFirestore.d().b("mini_activities").m(str, "label").m("en", "language").a();
        kotlin.jvm.internal.i.f(a11, "getInstance().collection…                   .get()");
        this.f14396u = 2;
        obj = tr.r.g(a11, this);
        if (obj == aVar) {
            return aVar;
        }
        rVar = (r) obj;
        if (rVar == null) {
        }
        templateModel2 = null;
        if (templateModel2 != null) {
        }
        dVar.resumeWith(null);
        return k.f19476a;
    }
}
