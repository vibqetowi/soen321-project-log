package ch;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ih.i;
import ih.j;
import ih.k;
import ih.p;
/* compiled from: InAppHandler.kt */
/* loaded from: classes.dex */
public interface a {
    void a(Context context, Bundle bundle, p pVar);

    void b(Activity activity);

    void c(Context context, i iVar, p pVar);

    void d(Activity activity);

    k e(j jVar);

    void f(Activity activity);

    void g(Activity activity);

    void initialiseModule(Context context);

    void onAppOpen(Context context, p pVar);

    void onLogout(Context context, p pVar);
}
