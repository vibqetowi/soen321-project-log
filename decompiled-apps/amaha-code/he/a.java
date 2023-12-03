package he;

import android.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ActivityScope.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ActivityScope.java */
    /* renamed from: he.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0279a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f17446a = new ArrayList();

        public final synchronized void a(Runnable runnable) {
            this.f17446a.add(runnable);
        }
    }

    /* compiled from: ActivityScope.java */
    /* loaded from: classes.dex */
    public static class b extends Fragment {

        /* renamed from: u  reason: collision with root package name */
        public C0279a f17447u = new C0279a();

        @Override // android.app.Fragment
        public final void onStop() {
            C0279a c0279a;
            super.onStop();
            synchronized (this.f17447u) {
                c0279a = this.f17447u;
                this.f17447u = new C0279a();
            }
            Iterator it = c0279a.f17446a.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* compiled from: ActivityScope.java */
    /* loaded from: classes.dex */
    public static class c extends androidx.fragment.app.Fragment {

        /* renamed from: u  reason: collision with root package name */
        public C0279a f17448u = new C0279a();

        @Override // androidx.fragment.app.Fragment
        public final void onStop() {
            C0279a c0279a;
            super.onStop();
            synchronized (this.f17448u) {
                c0279a = this.f17448u;
                this.f17448u = new C0279a();
            }
            Iterator it = c0279a.f17446a.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static Object a(Object obj, String str, Class cls) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder g5 = defpackage.d.g("Fragment with tag '", str, "' is a ");
            g5.append(obj.getClass().getName());
            g5.append(" but should be a ");
            g5.append(cls.getName());
            throw new IllegalStateException(g5.toString());
        }
    }
}
