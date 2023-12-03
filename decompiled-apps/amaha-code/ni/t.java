package ni;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements ss.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26356u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pi.k f26357v;

    public /* synthetic */ t(pi.k kVar, int i6) {
        this.f26356u = i6;
        this.f26357v = kVar;
    }

    @Override // ss.a
    public final Object invoke() {
        int i6 = this.f26356u;
        pi.k kVar = this.f26357v;
        switch (i6) {
            case 0:
                return "InApp_6.5.0_ViewEngine createCloseButton() : Will create close button. " + kVar;
            case 1:
                return "InApp_6.5.0_ViewEngine createContainer() : Display type of widget is false. Will not create widget. " + kVar;
            case 2:
                return "InApp_6.5.0_ViewEngine createWidget() : Creating widget: " + kVar;
            case 3:
                return "InApp_6.5.0_ViewEngine createImageView() : Will create this widget: " + kVar;
            case 4:
                return "InApp_6.5.0_ViewEngine createRatingBar() : Will create rating widget: " + kVar;
            case 5:
                return "InApp_6.5.0_ViewEngine createButton() : Will create button widget " + kVar;
            default:
                return "InApp_6.5.0_ViewEngine createTextView() : Will create text widget: " + kVar;
        }
    }
}
