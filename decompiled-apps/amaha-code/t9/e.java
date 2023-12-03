package t9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import t9.c;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class e<R extends c> extends BasePendingResult<R> {

    /* renamed from: n  reason: collision with root package name */
    public final R f32452n;

    public e(Status status) {
        super(null);
        this.f32452n = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R d(Status status) {
        return this.f32452n;
    }
}
