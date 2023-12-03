package ai;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: FileManager.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f575u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f575u = dVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" createBaseFolderIfRequired() : Folder exists", this.f575u.f578c);
    }
}
