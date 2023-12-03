package ni;

import android.view.KeyEvent;
/* compiled from: HtmlViewEngine.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f26333u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f26334v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f26335w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, int i6, KeyEvent keyEvent) {
        super(0);
        this.f26333u = nVar;
        this.f26334v = i6;
        this.f26335w = keyEvent;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f26333u.f26342e + " inAppView() : onKey() : " + this.f26334v + ' ' + this.f26335w.getAction();
    }
}
