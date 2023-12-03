package vg;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DeviceAddHandler.kt */
/* loaded from: classes.dex */
public final class a extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f35078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(0);
        this.f35078u = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" deviceAdd() : App Id not present, cannot make API request.", this.f35078u.f35082b);
    }
}
