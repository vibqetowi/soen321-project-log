package androidx.viewpager2.adapter;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f3147u;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f3147u = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f3147u;
        fragmentStateAdapter.D = false;
        fragmentStateAdapter.y();
    }
}
