package wg;

import kotlin.jvm.internal.k;
/* compiled from: DeviceAttributeHandler.kt */
/* loaded from: classes.dex */
public final class a extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f36690u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ih.a f36691v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, ih.a aVar) {
        super(0);
        this.f36690u = eVar;
        this.f36691v = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f36690u.f36696b + " trackDeviceAttribute() : Attribute: " + this.f36691v;
    }
}
