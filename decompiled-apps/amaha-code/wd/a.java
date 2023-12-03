package wd;

import android.content.Intent;
import sc.e;
import ya.v;
/* compiled from: FirebaseDynamicLinks.java */
/* loaded from: classes.dex */
public abstract class a {
    public static synchronized a b() {
        a c10;
        synchronized (a.class) {
            c10 = c(e.e());
        }
        return c10;
    }

    public static synchronized a c(e eVar) {
        a aVar;
        synchronized (a.class) {
            aVar = (a) eVar.c(a.class);
        }
        return aVar;
    }

    public abstract v a(Intent intent);
}
