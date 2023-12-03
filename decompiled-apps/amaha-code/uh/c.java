package uh;

import kotlin.jvm.internal.k;
/* compiled from: CoreRepository.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f34164u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f34165v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str) {
        super(0);
        this.f34164u = bVar;
        this.f34165v = str;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f34164u.f34158d + " syncReports() : Syncing reports: requestId: " + this.f34165v;
    }
}
