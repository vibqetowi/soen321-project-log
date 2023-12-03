package md;

import android.util.Log;
/* compiled from: DisabledBreadcrumbSource.java */
/* loaded from: classes.dex */
public final class c implements b {
    @Override // md.b
    public final void a(a aVar) {
        boolean z10;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
