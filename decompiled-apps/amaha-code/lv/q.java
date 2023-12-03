package lv;

import java.security.cert.Certificate;
import java.util.List;
/* compiled from: Handshake.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.a<List<? extends Certificate>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f24676u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(List<? extends Certificate> list) {
        super(0);
        this.f24676u = list;
    }

    @Override // ss.a
    public final List<? extends Certificate> invoke() {
        return this.f24676u;
    }
}
