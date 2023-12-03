package j5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.theinnerhour.b2b.utils.Constants;
import g.v;
import gv.e;
import gv.n;
import gv.r;
import i5.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
/* compiled from: MetadataViewObserver.kt */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: y  reason: collision with root package name */
    public static final HashMap f21678y;

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<Activity> f21681w;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashSet f21679u = new LinkedHashSet();

    /* renamed from: v  reason: collision with root package name */
    public final Handler f21680v = new Handler(Looper.getMainLooper());

    /* renamed from: x  reason: collision with root package name */
    public final AtomicBoolean f21682x = new AtomicBoolean(false);

    /* compiled from: MetadataViewObserver.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
            if (r3.equals("r5") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
            if (r3.equals("r4") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
            r0 = java.util.regex.Pattern.compile("[^a-z]+");
            kotlin.jvm.internal.i.f(r0, "compile(pattern)");
            r4 = r0.matcher(r4).replaceAll("");
            kotlin.jvm.internal.i.f(r4, "nativePattern.matcher(in…).replaceAll(replacement)");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void a(HashMap hashMap, String str, String str2) {
            HashMap hashMap2 = d.f21678y;
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (n.H0(str2, "m") || n.H0(str2, Constants.ONBOARDING_VARIANT) || n.H0(str2, "ge")) {
                            str2 = "m";
                            break;
                        } else {
                            str2 = "f";
                            break;
                        }
                    }
                    break;
                case 3588:
                    if (str.equals("r6") && r.J0(str2, "-")) {
                        Object[] array = new e("-").c(str2).toArray(new String[0]);
                        if (array != null) {
                            str2 = ((String[]) array)[0];
                            break;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    break;
            }
            hashMap.put(str, str2);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void b(Activity activity) {
            HashMap hashMap;
            Object obj;
            i.g(activity, "activity");
            int hashCode = activity.hashCode();
            if (!b6.a.b(d.class)) {
                try {
                    hashMap = d.f21678y;
                } catch (Throwable th2) {
                    b6.a.a(d.class, th2);
                }
                Integer valueOf = Integer.valueOf(hashCode);
                obj = hashMap.get(valueOf);
                if (obj == null) {
                    obj = new d(activity);
                    hashMap.put(valueOf, obj);
                }
                d dVar = (d) obj;
                if (b6.a.b(d.class)) {
                    try {
                        if (!b6.a.b(dVar) && !dVar.f21682x.getAndSet(true)) {
                            int i6 = q5.d.f29148a;
                            View b10 = q5.d.b(dVar.f21681w.get());
                            if (b10 != null) {
                                ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.addOnGlobalFocusChangeListener(dVar);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        b6.a.a(d.class, th3);
                        return;
                    }
                }
                return;
            }
            hashMap = null;
            Integer valueOf2 = Integer.valueOf(hashCode);
            obj = hashMap.get(valueOf2);
            if (obj == null) {
            }
            d dVar2 = (d) obj;
            if (b6.a.b(d.class)) {
            }
        }
    }

    static {
        new a();
        f21678y = new HashMap();
    }

    public d(Activity activity) {
        this.f21681w = new WeakReference<>(activity);
    }

    public final void a(View view) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            v vVar = new v(view, 18, this);
            if (!b6.a.b(this)) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    vVar.run();
                } else {
                    this.f21680v.post(vVar);
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void b(View view) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z12;
        if (b6.a.b(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj != null) {
                String obj2 = r.i1(obj).toString();
                if (obj2 != null) {
                    String lowerCase = obj2.toLowerCase();
                    i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        LinkedHashSet linkedHashSet = this.f21679u;
                        if (!linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                            linkedHashSet.add(lowerCase);
                            HashMap hashMap = new HashMap();
                            ArrayList b10 = b.b(view);
                            CopyOnWriteArraySet copyOnWriteArraySet = c.f21674d;
                            Iterator it = new HashSet(c.a()).iterator();
                            ArrayList arrayList3 = null;
                            while (it.hasNext()) {
                                c cVar = (c) it.next();
                                if (i.b("r2", cVar.b())) {
                                    Pattern compile = Pattern.compile("[^\\d.]");
                                    i.f(compile, "compile(pattern)");
                                    str = compile.matcher(lowerCase).replaceAll("");
                                    i.f(str, "nativePattern.matcher(in…).replaceAll(replacement)");
                                } else {
                                    str = lowerCase;
                                }
                                boolean b11 = b6.a.b(cVar);
                                String rule = cVar.f21676b;
                                if (b11) {
                                    str2 = null;
                                } else {
                                    str2 = rule;
                                }
                                if (str2.length() > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    b bVar = b.f21673a;
                                    if (b6.a.b(cVar)) {
                                        rule = null;
                                    }
                                    if (!b6.a.b(b.class)) {
                                        i.g(rule, "rule");
                                        Pattern compile2 = Pattern.compile(rule);
                                        i.f(compile2, "compile(pattern)");
                                        z12 = compile2.matcher(str).matches();
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                    }
                                }
                                b bVar2 = b.f21673a;
                                boolean b12 = b6.a.b(cVar);
                                List<String> list = cVar.f21677c;
                                if (b12) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList(list);
                                }
                                if (b.d(b10, arrayList)) {
                                    a.a(hashMap, cVar.b(), str);
                                } else {
                                    if (arrayList3 == null) {
                                        arrayList3 = b.a(view);
                                    }
                                    if (b6.a.b(cVar)) {
                                        arrayList2 = null;
                                    } else {
                                        arrayList2 = new ArrayList(list);
                                    }
                                    if (b.d(arrayList3, arrayList2)) {
                                        a.a(hashMap, cVar.b(), str);
                                    }
                                }
                            }
                            o.a.a(hashMap);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (b6.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th2) {
                b6.a.a(this, th2);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
