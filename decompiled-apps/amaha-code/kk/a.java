package kk;

import android.content.Context;
import androidx.lifecycle.w;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.components.assessments.model.SuggestedDataModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: ActivityFetchingViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.assessments.viewmodel.ActivityFetchingViewModel$fetchAndAddSuggestedActivities$1", f = "ActivityFetchingViewModel.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f23375u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f23376v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f23376v = bVar;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new a(this.f23376v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        BufferedReader bufferedReader;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f23375u;
        b bVar = this.f23376v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            if (FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getPlanSuggested().size() == 0) {
                s5 s5Var = bVar.f23377y;
                Context applicationContext = bVar.f2382x.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                this.f23375u = 1;
                s5Var.getClass();
                kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar.u();
                try {
                    Integer a10 = s5.a(s5Var);
                    k kVar2 = null;
                    if (a10 != null) {
                        InputStream openRawResource = applicationContext.getResources().openRawResource(a10.intValue());
                        kotlin.jvm.internal.i.f(openRawResource, "context.resources.openRawResource(id)");
                        InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader = new BufferedReader(inputStreamReader, 8192);
                        }
                        String c12 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        kVar.resumeWith(new sf.i().b(SuggestedDataModel.class, c12));
                        kVar2 = k.f19476a;
                    }
                    if (kVar2 == null) {
                        kVar.resumeWith(new SuggestedDataModel(new ArrayList(), ""));
                    }
                } catch (Exception e10) {
                    kVar.resumeWith(new SuggestedDataModel(new ArrayList(), ""));
                    LogHelper.INSTANCE.e(s5Var.f8126v, e10);
                }
                obj = kVar.s();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
        SuggestedDataModel suggestedDataModel = (SuggestedDataModel) obj;
        if (suggestedDataModel.getData().size() > 0) {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            courseById.setSet(suggestedDataModel.getSet());
            courseById.setPlanSuggested(suggestedDataModel.getData());
            FirebasePersistence.getInstance().updateUserOnFirebase();
            ((w) bVar.f23378z.getValue()).i(new SingleUseEvent(Boolean.TRUE));
        } else {
            ((w) bVar.f23378z.getValue()).i(new SingleUseEvent(Boolean.FALSE));
        }
        return k.f19476a;
    }
}
