package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23696a;

    /* renamed from: b  reason: collision with root package name */
    public final h f23697b;

    /* renamed from: c  reason: collision with root package name */
    public final ss.l<Throwable, hs.k> f23698c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f23699d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f23700e;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Object obj, h hVar, ss.l<? super Throwable, hs.k> lVar, Object obj2, Throwable th2) {
        this.f23696a = obj;
        this.f23697b = hVar;
        this.f23698c = lVar;
        this.f23699d = obj2;
        this.f23700e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static t a(t tVar, h hVar, CancellationException cancellationException, int i6) {
        Object obj;
        ss.l<Throwable, hs.k> lVar;
        Object obj2 = null;
        if ((i6 & 1) != 0) {
            obj = tVar.f23696a;
        } else {
            obj = null;
        }
        if ((i6 & 2) != 0) {
            hVar = tVar.f23697b;
        }
        h hVar2 = hVar;
        if ((i6 & 4) != 0) {
            lVar = tVar.f23698c;
        } else {
            lVar = null;
        }
        if ((i6 & 8) != 0) {
            obj2 = tVar.f23699d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i6 & 16) != 0) {
            cancellationException2 = tVar.f23700e;
        }
        tVar.getClass();
        return new t(obj, hVar2, lVar, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (kotlin.jvm.internal.i.b(this.f23696a, tVar.f23696a) && kotlin.jvm.internal.i.b(this.f23697b, tVar.f23697b) && kotlin.jvm.internal.i.b(this.f23698c, tVar.f23698c) && kotlin.jvm.internal.i.b(this.f23699d, tVar.f23699d) && kotlin.jvm.internal.i.b(this.f23700e, tVar.f23700e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i6 = 0;
        Object obj = this.f23696a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        h hVar = this.f23697b;
        if (hVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        ss.l<Throwable, hs.k> lVar = this.f23698c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.f23699d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th2 = this.f23700e;
        if (th2 != null) {
            i6 = th2.hashCode();
        }
        return i13 + i6;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f23696a + ", cancelHandler=" + this.f23697b + ", onCancellation=" + this.f23698c + ", idempotentResume=" + this.f23699d + ", cancelCause=" + this.f23700e + ')';
    }

    public /* synthetic */ t(Object obj, h hVar, ss.l lVar, Object obj2, CancellationException cancellationException, int i6) {
        this(obj, (i6 & 2) != 0 ? null : hVar, (i6 & 4) != 0 ? null : lVar, (i6 & 8) != 0 ? null : obj2, (i6 & 16) != 0 ? null : cancellationException);
    }
}
