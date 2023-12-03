package ai;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: FileManager.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f574u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.f574u = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" createBaseFolderIfRequired() : Creating base folder", this.f574u.f578c);
    }
}
