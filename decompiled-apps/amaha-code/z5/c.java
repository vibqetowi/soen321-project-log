package z5;

import is.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import p0.d;
import w5.d0;
import w5.e0;
import xs.e;
/* compiled from: ANRHandler.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f39196a;

    static {
        new c();
        f39196a = new AtomicBoolean(false);
    }

    public static final void a() {
        File[] listFiles;
        if (b6.a.b(c.class)) {
            return;
        }
        try {
            if (e0.y()) {
                return;
            }
            File B = sp.b.B();
            if (B == null) {
                listFiles = new File[0];
            } else {
                listFiles = B.listFiles(new d0(3));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                i.g(file, "file");
                arrayList.add(new y5.a(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((y5.a) next).b()) {
                    arrayList2.add(next);
                }
            }
            List D2 = u.D2(arrayList2, new d(2));
            JSONArray jSONArray = new JSONArray();
            e it2 = h.k0(0, Math.min(D2.size(), 5)).iterator();
            while (it2.f38001w) {
                jSONArray.put(D2.get(it2.nextInt()));
            }
            sp.b.X("anr_reports", jSONArray, new b(0, D2));
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
        }
    }
}
