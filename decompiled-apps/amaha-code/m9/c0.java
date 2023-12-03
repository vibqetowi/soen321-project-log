package m9;

import com.google.android.gms.cast.framework.media.MediaNotificationService;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f24949u;

    /* renamed from: v  reason: collision with root package name */
    public final int f24950v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f24951w;

    public /* synthetic */ c0(int i6, int i10, Object obj) {
        this.f24949u = i10;
        this.f24951w = obj;
        this.f24950v = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f24949u;
        int i10 = this.f24950v;
        Object obj = this.f24951w;
        switch (i6) {
            case 0:
                ((MediaNotificationService) obj).stopSelf(i10);
                return;
            default:
                ((com.google.android.gms.common.api.internal.b0) obj).g(i10);
                return;
        }
    }
}
