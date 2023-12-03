package lg;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import lg.a;
/* compiled from: SharedPreferencesLoader.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f24362a = Executors.newSingleThreadExecutor();

    /* compiled from: SharedPreferencesLoader.java */
    /* loaded from: classes.dex */
    public static class a implements Callable<SharedPreferences> {

        /* renamed from: u  reason: collision with root package name */
        public final Context f24363u;

        /* renamed from: v  reason: collision with root package name */
        public final String f24364v;

        /* renamed from: w  reason: collision with root package name */
        public final b f24365w;

        public a(Context context, String str, e eVar) {
            this.f24363u = context;
            this.f24364v = str;
            this.f24365w = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final SharedPreferences call() {
            SharedPreferences sharedPreferences = this.f24363u.getSharedPreferences(this.f24364v, 0);
            b bVar = this.f24365w;
            if (bVar != null) {
                e eVar = (e) bVar;
                Integer num = i.f24340p;
                String string = sharedPreferences.getString("people_distinct_id", null);
                if (string != null) {
                    f fVar = eVar.f24317a;
                    a.f fVar2 = new a.f(string, fVar.f24325e);
                    lg.a aVar = fVar.f24322b;
                    aVar.getClass();
                    Message obtain = Message.obtain();
                    obtain.what = 4;
                    obtain.obj = fVar2;
                    aVar.f24266a.b(obtain);
                }
            }
            return sharedPreferences;
        }
    }

    /* compiled from: SharedPreferencesLoader.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public final FutureTask a(Context context, String str, e eVar) {
        FutureTask futureTask = new FutureTask(new a(context, str, eVar));
        this.f24362a.execute(futureTask);
        return futureTask;
    }
}
