package hd;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements re.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17411a;

    public /* synthetic */ g(int i6) {
        this.f17411a = i6;
    }

    @Override // re.b
    public final Object get() {
        p002if.b lambda$new$0;
        p002if.f lambda$new$1;
        switch (this.f17411a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                l<ScheduledExecutorService> lVar = ExecutorsRegistrar.f9561a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 23) {
                    detectNetwork.detectResourceMismatches();
                    if (i6 >= 26) {
                        detectNetwork.detectUnbufferedIo();
                    }
                }
                return new id.e(Executors.newFixedThreadPool(4, new id.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), ExecutorsRegistrar.f9564d.get());
            case 3:
                l<ScheduledExecutorService> lVar2 = ExecutorsRegistrar.f9561a;
                return new id.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new id.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f9564d.get());
            case 4:
                l<ScheduledExecutorService> lVar3 = ExecutorsRegistrar.f9561a;
                return new id.e(Executors.newCachedThreadPool(new id.a("Firebase Blocking", 11, null)), ExecutorsRegistrar.f9564d.get());
            case 5:
                l<ScheduledExecutorService> lVar4 = ExecutorsRegistrar.f9561a;
                return Executors.newSingleThreadScheduledExecutor(new id.a("Firebase Scheduler", 0, null));
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            case 8:
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            default:
                Random random = nf.f.f26302j;
                return null;
        }
    }
}
