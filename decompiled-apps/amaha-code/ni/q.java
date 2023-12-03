package ni;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ss.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26349u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.o f26350v;

    public /* synthetic */ q(pi.o oVar, int i6) {
        this.f26349u = i6;
        this.f26350v = oVar;
    }

    @Override // ss.a
    public final Object invoke() {
        int i6 = this.f26349u;
        pi.o oVar = this.f26350v;
        switch (i6) {
            case 0:
                return "InApp_6.5.0_ViewEngine transformPadding() : Padding: " + oVar;
            case 1:
                return "InApp_6.5.0_ViewEngine transformMargin() : Margin: " + oVar;
            case 2:
                return "InApp_6.5.0_ViewEngine createButton() : Padding: " + oVar;
            default:
                return "InApp_6.5.0_ViewEngine createTextView() : Padding: " + oVar;
        }
    }
}
