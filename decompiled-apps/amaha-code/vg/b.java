package vg;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DeviceAddHandler.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f35079u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.f35079u = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" deviceAdd() : Account or SDK Disabled.", this.f35079u.f35082b);
    }
}
