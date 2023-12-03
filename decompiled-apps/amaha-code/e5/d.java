package e5;
/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: StateVerifier.java */
    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f13808a;

        public final void a() {
            if (!this.f13808a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }
}
