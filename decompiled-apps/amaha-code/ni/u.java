package ni;

import he.e0;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements ss.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26358u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f26359v;

    public /* synthetic */ u(int i6, Object obj) {
        this.f26358u = i6;
        this.f26359v = obj;
    }

    @Override // ss.a
    public final Object invoke() {
        int i6 = this.f26358u;
        Object obj = this.f26359v;
        switch (i6) {
            case 0:
                return "InApp_6.5.0_ViewEngine addAction() : Will try to execute actionType: " + ((List) obj);
            case 1:
                ui.d dVar = (ui.d) obj;
                return "InApp_6.5.0_ViewEngine createImageView() : Real dimensions: " + new e0((int) dVar.f34171h, (int) dVar.f34170g, 1);
            case 2:
                return "InApp_6.5.0_ViewEngine createButton() : Style: " + ((ui.a) obj);
            default:
                return "InApp_6.5.0_ViewEngine onClick() : Will execute actionType: " + ((bj.a) obj);
        }
    }
}
