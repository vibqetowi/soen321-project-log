package ac;

import com.google.android.material.snackbar.BaseTransientBottomBar;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f473u;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f473u = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f473u.c();
    }
}
