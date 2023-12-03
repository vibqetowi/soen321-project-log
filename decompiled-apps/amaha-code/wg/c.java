package wg;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DeviceAttributeHandler.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f36693u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(0);
        this.f36693u = eVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" trackDeviceAttribute() : Device attribute will be sent to server", this.f36693u.f36696b);
    }
}
