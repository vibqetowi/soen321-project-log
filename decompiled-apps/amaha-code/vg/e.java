package vg;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DeviceAddHandler.kt */
/* loaded from: classes.dex */
public final class e extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f35100u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(0);
        this.f35100u = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" registerDevice() : Device add is already in progress, will not make another call.", this.f35100u.f35082b);
    }
}
