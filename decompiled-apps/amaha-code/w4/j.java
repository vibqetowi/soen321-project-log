package w4;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import com.bumptech.glide.Glide;
import java.util.HashMap;
import kotlinx.coroutines.e0;
import tr.r;
/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class j implements Handler.Callback {

    /* renamed from: z  reason: collision with root package name */
    public static final a f36408z = new a();

    /* renamed from: u  reason: collision with root package name */
    public volatile com.bumptech.glide.f f36409u;

    /* renamed from: v  reason: collision with root package name */
    public final HashMap f36410v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public final HashMap f36411w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    public final Handler f36412x;

    /* renamed from: y  reason: collision with root package name */
    public final b f36413y;

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public j(b bVar) {
        new t.b();
        new t.b();
        new Bundle();
        this.f36413y = bVar == null ? f36408z : bVar;
        this.f36412x = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean g(Context context) {
        Activity a10 = a(context);
        if (a10 != null && a10.isFinishing()) {
            return false;
        }
        return true;
    }

    public final com.bumptech.glide.f b(Activity activity) {
        boolean z10;
        char[] cArr = d5.j.f12201a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return c(activity.getApplicationContext());
        }
        if (!activity.isDestroyed()) {
            i e10 = e(activity.getFragmentManager(), g(activity));
            com.bumptech.glide.f fVar = e10.f36404x;
            if (fVar == null) {
                Glide b10 = Glide.b(activity);
                ((a) this.f36413y).getClass();
                com.bumptech.glide.f fVar2 = new com.bumptech.glide.f(b10, e10.f36401u, e10.f36402v, activity);
                e10.f36404x = fVar2;
                return fVar2;
            }
            return fVar;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final com.bumptech.glide.f c(Context context) {
        boolean z10;
        if (context != null) {
            char[] cArr = d5.j.f12201a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !(context instanceof Application)) {
                if (context instanceof p) {
                    return d((p) context);
                }
                if (context instanceof Activity) {
                    return b((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return c(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f36409u == null) {
                synchronized (this) {
                    if (this.f36409u == null) {
                        Glide b10 = Glide.b(context.getApplicationContext());
                        b bVar = this.f36413y;
                        e0 e0Var = new e0(4);
                        r rVar = new r();
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f36409u = new com.bumptech.glide.f(b10, e0Var, rVar, applicationContext);
                    }
                }
            }
            return this.f36409u;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.f d(p pVar) {
        boolean z10;
        char[] cArr = d5.j.f12201a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return c(pVar.getApplicationContext());
        }
        if (!pVar.isDestroyed()) {
            return h(pVar, pVar.getSupportFragmentManager(), null, g(pVar));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final i e(FragmentManager fragmentManager, boolean z10) {
        i iVar = (i) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (iVar == null) {
            HashMap hashMap = this.f36410v;
            i iVar2 = (i) hashMap.get(fragmentManager);
            if (iVar2 == null) {
                iVar2 = new i();
                iVar2.f36406z = null;
                if (z10) {
                    iVar2.f36401u.d();
                }
                hashMap.put(fragmentManager, iVar2);
                fragmentManager.beginTransaction().add(iVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f36412x.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return iVar2;
        }
        return iVar;
    }

    public final m f(y yVar, Fragment fragment, boolean z10) {
        m mVar = (m) yVar.F("com.bumptech.glide.manager");
        if (mVar == null) {
            HashMap hashMap = this.f36411w;
            m mVar2 = (m) hashMap.get(yVar);
            if (mVar2 == null) {
                mVar2 = new m();
                mVar2.f36423z = fragment;
                if (fragment != null && fragment.getContext() != null) {
                    Fragment fragment2 = fragment;
                    while (fragment2.getParentFragment() != null) {
                        fragment2 = fragment2.getParentFragment();
                    }
                    y fragmentManager = fragment2.getFragmentManager();
                    if (fragmentManager != null) {
                        mVar2.F(fragment.getContext(), fragmentManager);
                    }
                }
                if (z10) {
                    mVar2.f36418u.d();
                }
                hashMap.put(yVar, mVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.e(0, mVar2, "com.bumptech.glide.manager", 1);
                aVar.k();
                this.f36412x.obtainMessage(2, yVar).sendToTarget();
            }
            return mVar2;
        }
        return mVar;
    }

    public final com.bumptech.glide.f h(Context context, y yVar, Fragment fragment, boolean z10) {
        m f = f(yVar, fragment, z10);
        com.bumptech.glide.f fVar = f.f36422y;
        if (fVar == null) {
            Glide b10 = Glide.b(context);
            ((a) this.f36413y).getClass();
            com.bumptech.glide.f fVar2 = new com.bumptech.glide.f(b10, f.f36418u, f.f36419v, context);
            f.f36422y = fVar2;
            return fVar2;
        }
        return fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        Object obj3;
        int i6 = message.what;
        boolean z10 = true;
        if (i6 != 1) {
            if (i6 != 2) {
                obj3 = null;
                z10 = false;
                obj2 = null;
                if (z10 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z10;
            }
            obj = (y) message.obj;
            remove = this.f36411w.remove(obj);
        } else {
            obj = (FragmentManager) message.obj;
            remove = this.f36410v.remove(obj);
        }
        Object obj4 = remove;
        obj2 = obj;
        obj3 = obj4;
        if (z10) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z10;
    }
}
