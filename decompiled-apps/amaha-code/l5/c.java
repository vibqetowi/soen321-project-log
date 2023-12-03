package l5;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import gv.n;
import gv.r;
import h5.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import l5.a;
import l5.d;
import m5.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
import w5.o;
/* compiled from: CodelessMatcher.kt */
/* loaded from: classes.dex */
public final class c {
    public static final a f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static c f24066g;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24067a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final Set<Activity> f24068b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f24069c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet<String> f24070d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, HashSet<String>> f24071e;

    /* compiled from: CodelessMatcher.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static Bundle b(m5.a aVar, View view, View view2) {
            ArrayList a10;
            boolean z10;
            boolean z11;
            Bundle bundle = new Bundle();
            if (aVar == null) {
                return bundle;
            }
            List<m5.b> unmodifiableList = Collections.unmodifiableList(aVar.f24834c);
            i.f(unmodifiableList, "unmodifiableList(parameters)");
            for (m5.b bVar : unmodifiableList) {
                String str = bVar.f24839b;
                String str2 = bVar.f24838a;
                if (str != null) {
                    if (str.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        bundle.putString(str2, bVar.f24839b);
                    }
                }
                ArrayList arrayList = bVar.f24840c;
                if (arrayList.size() > 0) {
                    if (i.b(bVar.f24841d, "relative")) {
                        a10 = ViewTreeObserver$OnGlobalLayoutListenerC0376c.a.a(view2, arrayList, 0, -1, view2.getClass().getSimpleName());
                    } else {
                        a10 = ViewTreeObserver$OnGlobalLayoutListenerC0376c.a.a(view, arrayList, 0, -1, view.getClass().getSimpleName());
                    }
                    Iterator it = a10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            b bVar2 = (b) it.next();
                            if (bVar2.a() != null) {
                                m5.f fVar = m5.f.f24853a;
                                String i6 = m5.f.i(bVar2.a());
                                if (i6.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    bundle.putString(str2, i6);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        public final synchronized c a() {
            c cVar;
            c cVar2;
            try {
                cVar = null;
                if (b6.a.b(c.class)) {
                    cVar2 = null;
                } else {
                    cVar2 = c.f24066g;
                }
                if (cVar2 == null) {
                    c cVar3 = new c();
                    if (!b6.a.b(c.class)) {
                        c.f24066g = cVar3;
                    }
                }
                if (!b6.a.b(c.class)) {
                    cVar = c.f24066g;
                }
                if (cVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return cVar;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f24072a;

        /* renamed from: b  reason: collision with root package name */
        public final String f24073b;

        public b(View view, String viewMapKey) {
            i.g(view, "view");
            i.g(viewMapKey, "viewMapKey");
            this.f24072a = new WeakReference<>(view);
            this.f24073b = viewMapKey;
        }

        public final View a() {
            WeakReference<View> weakReference = this.f24072a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: l5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC0376c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final WeakReference<View> f24074u;

        /* renamed from: v  reason: collision with root package name */
        public ArrayList f24075v;

        /* renamed from: w  reason: collision with root package name */
        public final HashSet<String> f24076w;

        /* renamed from: x  reason: collision with root package name */
        public final String f24077x;

        /* compiled from: CodelessMatcher.kt */
        /* renamed from: l5.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
                if (kotlin.jvm.internal.i.b(r8.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
                if (r1.f24844c != r8.getId()) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
                if (kotlin.jvm.internal.i.b(r6, r5) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x013c, code lost:
                if (kotlin.jvm.internal.i.b(r7, r6) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
                if (kotlin.jvm.internal.i.b(r7, r6) == false) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
                if (kotlin.jvm.internal.i.b(r1, r11) == false) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:79:0x018c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static ArrayList a(View view, List path, int i6, int i10, String mapKey) {
                boolean z10;
                String obj;
                ArrayList b10;
                int size;
                ArrayList b11;
                int size2;
                i.g(path, "path");
                i.g(mapKey, "mapKey");
                String str = mapKey + '.' + i10;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                int i11 = 0;
                if (i6 >= path.size()) {
                    arrayList.add(new b(view, str));
                } else {
                    m5.c cVar = (m5.c) path.get(i6);
                    if (i.b(cVar.f24842a, "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (b10 = b((ViewGroup) parent)).size()) > 0) {
                            while (true) {
                                int i12 = i11 + 1;
                                arrayList.addAll(a((View) b10.get(i11), path, i6 + 1, i11, str));
                                if (i12 >= size) {
                                    break;
                                }
                                i11 = i12;
                            }
                        }
                        return arrayList;
                    }
                    String input = cVar.f24842a;
                    if (i.b(input, ".")) {
                        arrayList.add(new b(view, str));
                        return arrayList;
                    }
                    int i13 = cVar.f24843b;
                    if (i13 == -1 || i10 == i13) {
                        if (!i.b(view.getClass().getCanonicalName(), input)) {
                            Pattern compile = Pattern.compile(".*android\\..*");
                            i.f(compile, "compile(pattern)");
                            i.g(input, "input");
                            if (compile.matcher(input).matches()) {
                                List a12 = r.a1(input, new String[]{"."}, 0, 6);
                                if (!a12.isEmpty()) {
                                }
                            }
                        }
                        int i14 = cVar.f24848h;
                        if ((i14 & 1) > 0) {
                        }
                        if ((i14 & 2) > 0) {
                            String i15 = m5.f.i(view);
                            String f = e0.f(e0.K(i15));
                            String str2 = cVar.f24845d;
                            if (!i.b(str2, i15)) {
                            }
                        }
                        String str3 = "";
                        if ((i14 & 8) > 0) {
                            if (view.getContentDescription() == null) {
                                obj = "";
                            } else {
                                obj = view.getContentDescription().toString();
                            }
                            String f2 = e0.f(e0.K(obj));
                            String str4 = cVar.f;
                            if (!i.b(str4, obj)) {
                            }
                        }
                        if ((i14 & 16) > 0) {
                            String g5 = m5.f.g(view);
                            String f10 = e0.f(e0.K(g5));
                            String str5 = cVar.f24847g;
                            if (!i.b(str5, g5)) {
                            }
                        }
                        if ((i14 & 4) > 0) {
                            if (view.getTag() != null) {
                                str3 = view.getTag().toString();
                            }
                            String f11 = e0.f(e0.K(str3));
                            String str6 = cVar.f24846e;
                            if (!i.b(str6, str3)) {
                            }
                        }
                        z10 = true;
                        if (z10) {
                            return arrayList;
                        }
                        if (i6 == path.size() - 1) {
                            arrayList.add(new b(view, str));
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (b11 = b((ViewGroup) view)).size()) > 0) {
                    while (true) {
                        int i16 = i11 + 1;
                        arrayList.addAll(a((View) b11.get(i11), path, i6 + 1, i11, str));
                        if (i16 >= size2) {
                            break;
                        }
                        i11 = i16;
                    }
                }
                return arrayList;
            }

            public static ArrayList b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i6 = 0;
                    while (true) {
                        int i10 = i6 + 1;
                        View childAt = viewGroup.getChildAt(i6);
                        if (childAt.getVisibility() == 0) {
                            arrayList.add(childAt);
                        }
                        if (i10 >= childCount) {
                            break;
                        }
                        i6 = i10;
                    }
                }
                return arrayList;
            }
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC0376c(View view, Handler handler, HashSet<String> listenerSet, String str) {
            i.g(handler, "handler");
            i.g(listenerSet, "listenerSet");
            this.f24074u = new WeakReference<>(view);
            this.f24076w = listenerSet;
            this.f24077x = str;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, m5.a aVar) {
            boolean z10;
            HashSet<String> hashSet;
            String str;
            a.View$OnClickListenerC0375a view$OnClickListenerC0375a;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            View.OnClickListener e10 = m5.f.e(a10);
            if (e10 instanceof a.View$OnClickListenerC0375a) {
                if (e10 != null) {
                    if (((a.View$OnClickListenerC0375a) e10).f24053y) {
                        z10 = true;
                        hashSet = this.f24076w;
                        str = bVar.f24073b;
                        if (hashSet.contains(str) && !z10) {
                            l5.a aVar2 = l5.a.f24048a;
                            if (!b6.a.b(l5.a.class)) {
                                try {
                                    view$OnClickListenerC0375a = new a.View$OnClickListenerC0375a(aVar, view, a10);
                                } catch (Throwable th2) {
                                    b6.a.a(l5.a.class, th2);
                                }
                                a10.setOnClickListener(view$OnClickListenerC0375a);
                                hashSet.add(str);
                                return;
                            }
                            view$OnClickListenerC0375a = null;
                            a10.setOnClickListener(view$OnClickListenerC0375a);
                            hashSet.add(str);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
            }
            z10 = false;
            hashSet = this.f24076w;
            str = bVar.f24073b;
            if (hashSet.contains(str)) {
            }
        }

        public final void b(b bVar, View view, m5.a aVar) {
            boolean z10;
            HashSet<String> hashSet;
            String str;
            a.b bVar2;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof a.b) {
                if (onItemClickListener != null) {
                    if (((a.b) onItemClickListener).f24058y) {
                        z10 = true;
                        hashSet = this.f24076w;
                        str = bVar.f24073b;
                        if (hashSet.contains(str) && !z10) {
                            l5.a aVar2 = l5.a.f24048a;
                            if (!b6.a.b(l5.a.class)) {
                                try {
                                    bVar2 = new a.b(aVar, view, adapterView);
                                } catch (Throwable th2) {
                                    b6.a.a(l5.a.class, th2);
                                }
                                adapterView.setOnItemClickListener(bVar2);
                                hashSet.add(str);
                                return;
                            }
                            bVar2 = null;
                            adapterView.setOnItemClickListener(bVar2);
                            hashSet.add(str);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
            }
            z10 = false;
            hashSet = this.f24076w;
            str = bVar.f24073b;
            if (hashSet.contains(str)) {
            }
        }

        public final void c(b bVar, View view, m5.a aVar) {
            boolean z10;
            HashSet<String> hashSet;
            String str;
            d.a aVar2;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            View.OnTouchListener f = m5.f.f(a10);
            if (f instanceof d.a) {
                if (f != null) {
                    if (((d.a) f).f24083y) {
                        z10 = true;
                        hashSet = this.f24076w;
                        str = bVar.f24073b;
                        if (hashSet.contains(str) && !z10) {
                            int i6 = d.f24078a;
                            if (!b6.a.b(d.class)) {
                                try {
                                    aVar2 = new d.a(aVar, view, a10);
                                } catch (Throwable th2) {
                                    b6.a.a(d.class, th2);
                                }
                                a10.setOnTouchListener(aVar2);
                                hashSet.add(str);
                                return;
                            }
                            aVar2 = null;
                            a10.setOnTouchListener(aVar2);
                            hashSet.add(str);
                            return;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
            }
            z10 = false;
            hashSet = this.f24076w;
            str = bVar.f24073b;
            if (hashSet.contains(str)) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x00ba, TryCatch #3 {Exception -> 0x00ee, blocks: (B:33:0x0075, B:36:0x007c, B:59:0x00c1, B:61:0x00c9, B:62:0x00cd, B:65:0x00de, B:67:0x00e2, B:68:0x00e6, B:70:0x00ea, B:41:0x008a, B:51:0x00ad, B:53:0x00b5, B:47:0x00a6), top: B:80:0x0075 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00ac A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d() {
            boolean z10;
            View a10;
            View view;
            boolean b10;
            ArrayList arrayList = this.f24075v;
            if (arrayList != null) {
                WeakReference<View> weakReference = this.f24074u;
                if (weakReference.get() != null) {
                    int i6 = -1;
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            m5.a aVar = (m5.a) arrayList.get(i10);
                            View view2 = weakReference.get();
                            if (aVar != null && view2 != null) {
                                String str = aVar.f24835d;
                                if (str != null && str.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str2 = this.f24077x;
                                if (z10 || i.b(str, str2)) {
                                    List unmodifiableList = Collections.unmodifiableList(aVar.f24833b);
                                    i.f(unmodifiableList, "unmodifiableList(path)");
                                    if (unmodifiableList.size() <= 25) {
                                        Iterator it = a.a(view2, unmodifiableList, 0, i6, str2).iterator();
                                        while (it.hasNext()) {
                                            b bVar = (b) it.next();
                                            try {
                                                a10 = bVar.a();
                                            } catch (Exception unused) {
                                                e0 e0Var = e0.f36453a;
                                                b6.a.b(c.class);
                                                p pVar = p.f17269a;
                                            }
                                            if (a10 != null) {
                                                m5.f fVar = m5.f.f24853a;
                                                if (!b6.a.b(m5.f.class)) {
                                                    view = a10;
                                                    while (view != null) {
                                                        m5.f fVar2 = m5.f.f24853a;
                                                        fVar2.getClass();
                                                        if (!b6.a.b(fVar2)) {
                                                            try {
                                                                b10 = i.b(view.getClass().getName(), "com.facebook.react.ReactRootView");
                                                            } catch (Throwable th2) {
                                                                b6.a.a(fVar2, th2);
                                                            }
                                                            if (!b10) {
                                                                break;
                                                            }
                                                            ViewParent parent = view.getParent();
                                                            if (!(parent instanceof View)) {
                                                                break;
                                                            }
                                                            view = (View) parent;
                                                        }
                                                        b10 = false;
                                                        if (!b10) {
                                                        }
                                                    }
                                                }
                                                view = null;
                                                if (view != null && m5.f.f24853a.l(a10, view)) {
                                                    c(bVar, view2, aVar);
                                                } else if (!n.H0(a10.getClass().getName(), "com.facebook.react")) {
                                                    if (!(a10 instanceof AdapterView)) {
                                                        a(bVar, view2, aVar);
                                                    } else if (a10 instanceof ListView) {
                                                        b(bVar, view2, aVar);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (i11 <= size) {
                                i10 = i11;
                                i6 = -1;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            d();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b6.a.b(this)) {
                return;
            }
            try {
                o b10 = w5.p.b(p.b());
                if (b10 != null && b10.f36518h) {
                    JSONArray jSONArray = b10.f36519i;
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        try {
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i6 = 0;
                                while (true) {
                                    int i10 = i6 + 1;
                                    JSONObject jSONObject = jSONArray.getJSONObject(i6);
                                    i.f(jSONObject, "array.getJSONObject(i)");
                                    arrayList.add(a.b.a(jSONObject));
                                    if (i10 >= length) {
                                        break;
                                    }
                                    i6 = i10;
                                }
                            }
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    }
                    this.f24075v = arrayList;
                    View view = this.f24074u.get();
                    if (view == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    d();
                }
            } catch (Throwable th2) {
                b6.a.a(this, th2);
            }
        }
    }

    public c() {
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        i.f(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f24068b = newSetFromMap;
        this.f24069c = new LinkedHashSet();
        this.f24070d = new HashSet<>();
        this.f24071e = new HashMap<>();
    }

    public final void a(Activity activity) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            i.g(activity, "activity");
            if (i.b(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f24068b.add(activity);
                this.f24070d.clear();
                HashSet<String> hashSet = this.f24071e.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.f24070d = hashSet;
                }
                if (!b6.a.b(this)) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        b();
                        return;
                    } else {
                        this.f24067a.post(new androidx.activity.b(11, this));
                        return;
                    }
                }
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void b() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f24068b) {
                if (activity != null) {
                    this.f24069c.add(new ViewTreeObserver$OnGlobalLayoutListenerC0376c(q5.d.b(activity), this.f24067a, this.f24070d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            i.g(activity, "activity");
            if (i.b(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f24068b.remove(activity);
                this.f24069c.clear();
                this.f24071e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f24070d.clone());
                this.f24070d.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
