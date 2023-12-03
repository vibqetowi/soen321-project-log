package jl;

import android.app.Application;
import com.appsflyer.R;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$getDashboardForCourse$1", f = "CustomDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f22256u;

    /* renamed from: v  reason: collision with root package name */
    public int f22257v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f22258w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, ls.d<? super k> dVar) {
        super(2, dVar);
        this.f22258w = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new k(this.f22258w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: Exception -> 0x00c0, TryCatch #2 {Exception -> 0x00c0, blocks: (B:9:0x003c, B:11:0x004a, B:18:0x005e, B:28:0x0080, B:30:0x0098, B:34:0x00a7, B:31:0x009b, B:22:0x006b, B:26:0x0078, B:33:0x00a3), top: B:52:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c0, blocks: (B:9:0x003c, B:11:0x004a, B:18:0x005e, B:28:0x0080, B:30:0x0098, B:34:0x00a7, B:31:0x009b, B:22:0x006b, B:26:0x0078, B:33:0x00a3), top: B:52:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w<SingleUseEvent<JSONArray>> wVar;
        String currentCourseName;
        int i6;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f22257v;
        if (i10 != 0) {
            if (i10 == 1) {
                wVar = this.f22256u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e eVar = this.f22258w;
            androidx.lifecycle.w<SingleUseEvent<JSONArray>> wVar2 = eVar.C;
            Application application = eVar.f2382x;
            kotlin.jvm.internal.i.f(application, "getApplication()");
            this.f22256u = wVar2;
            this.f22257v = 1;
            u uVar = eVar.f22146y;
            uVar.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            try {
                currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            } catch (Exception e10) {
                kVar.resumeWith(null);
                LogHelper.INSTANCE.e(uVar.f22353a, e10);
            }
            if (currentCourseName != null) {
                int hashCode = currentCourseName.hashCode();
                if (hashCode != -80148009) {
                    if (hashCode != 109840) {
                        if (hashCode == 2989151 && currentCourseName.equals(Constants.COURSE_ADHD)) {
                            i6 = com.theinnerhour.b2b.R.raw.custom_course_adhd;
                            InputStream openRawResource = application.getResources().openRawResource(i6);
                            kotlin.jvm.internal.i.f(openRawResource, "context.resources.openRawResource(id)");
                            inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                            String c12 = ca.a.c1(bufferedReader);
                            ca.a.z(bufferedReader, null);
                            kVar.resumeWith(new JSONObject(c12).optJSONArray(Constants.SCREEN_DASHBOARD));
                            obj = kVar.s();
                            if (obj == aVar) {
                                return aVar;
                            }
                            wVar = wVar2;
                        }
                    } else if (currentCourseName.equals(Constants.COURSE_OCD)) {
                        i6 = com.theinnerhour.b2b.R.raw.custom_course_ocd;
                        InputStream openRawResource2 = application.getResources().openRawResource(i6);
                        kotlin.jvm.internal.i.f(openRawResource2, "context.resources.openRawResource(id)");
                        inputStreamReader = new InputStreamReader(openRawResource2, gv.a.f16927b);
                        if (inputStreamReader instanceof BufferedReader) {
                        }
                        String c122 = ca.a.c1(bufferedReader);
                        ca.a.z(bufferedReader, null);
                        kVar.resumeWith(new JSONObject(c122).optJSONArray(Constants.SCREEN_DASHBOARD));
                        obj = kVar.s();
                        if (obj == aVar) {
                        }
                    }
                } else {
                    currentCourseName.equals(Constants.COURSE_GENERIC);
                }
            }
            i6 = com.theinnerhour.b2b.R.raw.custom_course;
            InputStream openRawResource22 = application.getResources().openRawResource(i6);
            kotlin.jvm.internal.i.f(openRawResource22, "context.resources.openRawResource(id)");
            inputStreamReader = new InputStreamReader(openRawResource22, gv.a.f16927b);
            if (inputStreamReader instanceof BufferedReader) {
            }
            String c1222 = ca.a.c1(bufferedReader);
            ca.a.z(bufferedReader, null);
            kVar.resumeWith(new JSONObject(c1222).optJSONArray(Constants.SCREEN_DASHBOARD));
            obj = kVar.s();
            if (obj == aVar) {
            }
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        wVar.i(new SingleUseEvent<>(jSONArray));
        return hs.k.f19476a;
    }
}
