package a3;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f270u;

    public q(r rVar) {
        this.f270u = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f270u.f275d == null) {
            return;
        }
        p<T> pVar = this.f270u.f275d;
        V v10 = pVar.f268a;
        if (v10 != 0) {
            r.a(this.f270u, v10);
            return;
        }
        r rVar = this.f270u;
        Throwable th2 = pVar.f269b;
        synchronized (rVar) {
            ArrayList arrayList = new ArrayList(rVar.f273b);
            if (arrayList.isEmpty()) {
                m3.c.f24792a.getClass();
                HashSet hashSet = m3.b.f24791a;
                if (!hashSet.contains("Lottie encountered an error but no failure listener was added:")) {
                    Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added:", th2);
                    hashSet.add("Lottie encountered an error but no failure listener was added:");
                }
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).onResult(th2);
            }
        }
    }
}
