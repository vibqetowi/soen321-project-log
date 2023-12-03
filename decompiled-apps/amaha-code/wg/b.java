package wg;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DeviceAttributeHandler.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f36692u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar) {
        super(0);
        this.f36692u = eVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" trackDeviceAttribute() : Device attribute already sent once will not be sent again.", this.f36692u.f36696b);
    }
}
