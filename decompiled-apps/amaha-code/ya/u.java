package ya;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class u extends LifecycleCallback {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f38415u;

    public u(com.google.android.gms.common.api.internal.h hVar) {
        super(hVar);
        this.f38415u = new ArrayList();
        this.mLifecycleFragment.j("TaskOnStopCallback", this);
    }

    public static u a(Activity activity) {
        com.google.android.gms.common.api.internal.h fragment = LifecycleCallback.getFragment(activity);
        u uVar = (u) fragment.m(u.class, "TaskOnStopCallback");
        if (uVar == null) {
            return new u(fragment);
        }
        return uVar;
    }

    public final void b(p pVar) {
        synchronized (this.f38415u) {
            this.f38415u.add(new WeakReference(pVar));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.f38415u) {
            Iterator it = this.f38415u.iterator();
            while (it.hasNext()) {
                s sVar = (s) ((WeakReference) it.next()).get();
                if (sVar != null) {
                    sVar.c();
                }
            }
            this.f38415u.clear();
        }
    }
}
