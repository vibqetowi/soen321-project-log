package sj;

import android.os.Bundle;
import java.util.List;
/* compiled from: RichPushUtils.kt */
/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List<Bundle> f31600u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(List<Bundle> list) {
        super(0);
        this.f31600u = list;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(Integer.valueOf(this.f31600u.size()), "RichPush_4.3.2_RichPushUtils onLogout() : active template campaigns: ");
    }
}
