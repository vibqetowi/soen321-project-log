package vg;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DeviceAddHandler.kt */
/* loaded from: classes.dex */
public final class h extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f35103u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar) {
        super(0);
        this.f35103u = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" registerToken() : Another request already in progress", this.f35103u.f35082b);
    }
}
