package nd;

import j$.util.Objects;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements ya.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26090u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ya.i f26091v;

    public /* synthetic */ m0(int i6, ya.i iVar) {
        this.f26090u = i6;
        this.f26091v = iVar;
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        int i6 = this.f26090u;
        ya.i iVar = this.f26091v;
        switch (i6) {
            case 0:
                if (hVar.isSuccessful()) {
                    iVar.d(hVar.getResult());
                } else {
                    Exception exception = hVar.getException();
                    Objects.requireNonNull(exception);
                    iVar.c(exception);
                }
                return null;
            default:
                if (hVar.isSuccessful()) {
                    iVar.d(hVar.getResult());
                } else {
                    Exception exception2 = hVar.getException();
                    Objects.requireNonNull(exception2);
                    iVar.c(exception2);
                }
                return null;
        }
    }
}
