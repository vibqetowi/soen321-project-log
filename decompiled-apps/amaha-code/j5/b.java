package j5;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import gv.e;
import gv.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import m5.f;
/* compiled from: MetadataMatcher.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21673a = new b();

    public static final ArrayList a(View view) {
        if (b6.a.b(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup h10 = f.h(view);
            if (h10 != null) {
                Iterator it = f.a(h10).iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (view != view2) {
                        arrayList.addAll(f21673a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return null;
        }
    }

    public static final ArrayList b(View view) {
        boolean z10;
        if (b6.a.b(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(f.g(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    i.f(resourceName, "resourceName");
                    Object[] array = new e("/").c(resourceName).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            arrayList.add(strArr[1]);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return null;
        }
    }

    public static final boolean d(ArrayList indicators, ArrayList keys) {
        boolean z10;
        if (b6.a.b(b.class)) {
            return false;
        }
        try {
            i.g(indicators, "indicators");
            i.g(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                b bVar = f21673a;
                bVar.getClass();
                if (!b6.a.b(bVar)) {
                    Iterator it2 = keys.iterator();
                    while (it2.hasNext()) {
                        if (r.J0(str, (String) it2.next())) {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                }
                z10 = false;
                continue;
                if (z10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            b6.a.a(b.class, th2);
            return false;
        }
    }

    public final ArrayList c(View view) {
        boolean z10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String obj = ((TextView) view).getText().toString();
                if (obj.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && obj.length() < 100) {
                    String lowerCase = obj.toLowerCase();
                    i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                }
                return arrayList;
            }
            Iterator it = f.a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(c((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
