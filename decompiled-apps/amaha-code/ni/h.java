package ni;

import android.view.View;
/* compiled from: HtmlViewEngine.kt */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f26330u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f26331v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f26332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, View view, boolean z10) {
        super(0);
        this.f26330u = nVar;
        this.f26331v = view;
        this.f26332w = z10;
    }

    @Override // ss.a
    public final String invoke() {
        Integer valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26330u.f26342e);
        sb2.append(" onFocusChanged() : ");
        View view = this.f26331v;
        sb2.append(view.getId());
        sb2.append(" : ");
        sb2.append(this.f26332w);
        sb2.append(' ');
        View findFocus = view.findFocus();
        if (findFocus == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(findFocus.getId());
        }
        sb2.append(valueOf);
        return sb2.toString();
    }
}
