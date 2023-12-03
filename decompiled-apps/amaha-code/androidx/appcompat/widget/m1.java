package androidx.appcompat.widget;

import androidx.appcompat.widget.Toolbar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f1481u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Toolbar f1482v;

    public /* synthetic */ m1(Toolbar toolbar, int i6) {
        this.f1481u = i6;
        this.f1482v = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.view.menu.h hVar;
        int i6 = this.f1481u;
        Toolbar toolbar = this.f1482v;
        switch (i6) {
            case 0:
                toolbar.l();
                return;
            default:
                Toolbar.f fVar = toolbar.f1306j0;
                if (fVar == null) {
                    hVar = null;
                } else {
                    hVar = fVar.f1325v;
                }
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
