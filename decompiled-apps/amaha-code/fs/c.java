package fs;

import java.util.Set;
import kotlin.jvm.internal.i;
import v9.o;
/* compiled from: Tag.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f15848a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15849b;

    public /* synthetic */ c(aa.c cVar) {
        o.h(cVar);
        this.f15849b = cVar;
    }

    public /* synthetic */ c(long j10, Set sourceIdentifiers) {
        i.g(sourceIdentifiers, "sourceIdentifiers");
        this.f15848a = j10;
        this.f15849b = sourceIdentifiers;
    }

    public /* synthetic */ c() {
        this.f15849b = "";
        this.f15848a = Long.MIN_VALUE;
    }
}
