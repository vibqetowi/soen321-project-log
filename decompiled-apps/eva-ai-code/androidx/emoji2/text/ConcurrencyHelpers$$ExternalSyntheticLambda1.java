package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ConcurrencyHelpers$$ExternalSyntheticLambda1 implements Executor {
    public final /* synthetic */ Handler f$0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f$0.post(runnable);
    }
}
