package nr;

import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import lv.d0;
import lv.u;
import lv.x;
import lv.z;
import qv.f;
/* compiled from: RetrofitBuilder.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f26773a = LogHelper.INSTANCE.makeLogTag("RetrofitBuilder.kt");

    /* renamed from: b  reason: collision with root package name */
    public static final x.a f26774b;

    /* compiled from: Interceptor.kt */
    /* loaded from: classes2.dex */
    public static final class a implements u {
        @Override // lv.u
        public final d0 a(f fVar) {
            HashMap<String, String> fetchHeaders = SessionManager.getInstance().fetchHeaders();
            z zVar = fVar.f30150e;
            zVar.getClass();
            z.a aVar = new z.a(zVar);
            for (String key : fetchHeaders.keySet()) {
                if (fetchHeaders.get(key) != null) {
                    i.f(key, "key");
                    String str = fetchHeaders.get(key);
                    i.d(str);
                    aVar.f24758c.a(key, str);
                }
            }
            try {
                return fVar.c(aVar.a());
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c.f26773a, e10, zVar.f24751a.f24693i);
                return fVar.c(aVar.a());
            }
        }
    }

    static {
        x.a aVar;
        a aVar2 = new a();
        yv.b bVar = new yv.b(0);
        bVar.f39097c = 4;
        Boolean LOG_NETWORK = Constants.LOG_NETWORK;
        i.f(LOG_NETWORK, "LOG_NETWORK");
        if (LOG_NETWORK.booleanValue()) {
            aVar = new x.a();
            TimeUnit unit = TimeUnit.SECONDS;
            i.g(unit, "unit");
            aVar.f24743t = mv.b.b(unit);
            aVar.f24744u = mv.b.b(unit);
            aVar.f24742s = mv.b.b(unit);
            aVar.f24732h = false;
            aVar.f24735k = null;
            aVar.f24728c.add(aVar2);
            aVar.f24728c.add(bVar);
        } else {
            aVar = new x.a();
            TimeUnit unit2 = TimeUnit.SECONDS;
            i.g(unit2, "unit");
            aVar.f24743t = mv.b.b(unit2);
            aVar.f24744u = mv.b.b(unit2);
            aVar.f24742s = mv.b.b(unit2);
            aVar.f24732h = false;
            aVar.f24735k = null;
            aVar.f24728c.add(aVar2);
        }
        f26774b = aVar;
    }
}
