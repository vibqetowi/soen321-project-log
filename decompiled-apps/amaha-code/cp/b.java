package cp;

import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: ResetProgrammeRepository.kt */
/* loaded from: classes2.dex */
public final class b<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f11864a;

    public b(h hVar) {
        this.f11864a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> it) {
        i.g(it, "it");
        this.f11864a.resumeWith(Boolean.valueOf(it.isSuccessful()));
    }
}
