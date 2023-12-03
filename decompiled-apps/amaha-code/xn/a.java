package xn;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.model.UserMood;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import dw.a0;
import hs.k;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kc.f;
import kotlinx.coroutines.d0;
import ls.d;
import ls.h;
import lv.c0;
import lv.v;
import ns.e;
import ns.i;
import org.json.JSONObject;
import ss.p;
/* compiled from: TrackerViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final w<SingleUseEvent<Boolean>> f37863x = new w<>();

    /* renamed from: y  reason: collision with root package name */
    public final vn.b f37864y = new vn.b();

    /* compiled from: TrackerViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.multiTracker.viewmodels.TrackerViewModel$backupUserMoodList$1", f = "TrackerViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invokeSuspend")
    /* renamed from: xn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0637a extends i implements p<d0, d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f37865u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f37866v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f37867w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a f37868x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0637a(a aVar, String str, d dVar) {
            super(2, dVar);
            this.f37867w = str;
            this.f37868x = aVar;
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            C0637a c0637a = new C0637a(this.f37868x, this.f37867w, dVar);
            c0637a.f37866v = obj;
            return c0637a;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((C0637a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f37865u;
            String str = this.f37867w;
            a aVar2 = this.f37868x;
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f37866v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var2 = (d0) this.f37866v;
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    vn.b bVar = aVar2.f37864y;
                    this.f37866v = d0Var2;
                    this.f37865u = 1;
                    bVar.getClass();
                    h hVar = new h(ca.a.G0(this));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("to_delete", str);
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.i.f(jSONObject2, "payload.toString()");
                    Pattern pattern = v.f24702d;
                    ((un.a) ((a0) nr.b.f26769c.getValue()).b(un.a.class)).a("https://api.theinnerhour.com/v1/moveuserdata", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new vn.a(hVar));
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    aVar2.f37863x.i(new SingleUseEvent<>(Boolean.FALSE));
                    return k.f19476a;
                }
            }
            Boolean bool = (Boolean) obj;
            k kVar = null;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (booleanValue) {
                    aVar2.getClass();
                    ta.v.H(f.H(aVar2), null, 0, new b(aVar2, str, null), 3);
                }
                aVar2.f37863x.i(new SingleUseEvent<>(Boolean.valueOf(booleanValue)));
                kVar = k.f19476a;
            }
            if (kVar == null) {
                aVar2.f37863x.i(new SingleUseEvent<>(Boolean.FALSE));
            }
            return k.f19476a;
        }
    }

    public static boolean f() {
        boolean z10;
        boolean z11;
        ArrayList<UserMood> userMoodList = FirebasePersistence.getInstance().getUser().getUserMoodList();
        if (userMoodList != null && !userMoodList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return true;
        }
        ArrayList<UserMood> userMoodListV1 = FirebasePersistence.getInstance().getUser().getUserMoodListV1();
        if (userMoodListV1 != null && !userMoodListV1.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return true;
        }
        return false;
    }

    public final void e() {
        boolean z10;
        String str;
        ArrayList<UserMood> userMoodList = FirebasePersistence.getInstance().getUser().getUserMoodList();
        boolean z11 = true;
        if (userMoodList != null && !userMoodList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            str = "userMoodList";
        } else {
            ArrayList<UserMood> userMoodListV1 = FirebasePersistence.getInstance().getUser().getUserMoodListV1();
            if (userMoodListV1 != null && !userMoodListV1.isEmpty()) {
                z11 = false;
            }
            if (!z11) {
                str = "userMoodListV1";
            } else {
                str = "";
            }
        }
        ta.v.H(f.H(this), null, 0, new C0637a(this, str, null), 3);
    }
}
