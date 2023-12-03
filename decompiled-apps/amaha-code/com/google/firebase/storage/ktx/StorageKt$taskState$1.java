package com.google.firebase.storage.ktx;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.firebase.storage.OnPausedListener;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTaskScheduler;
import com.google.firebase.storage.ktx.TaskState;
import hs.k;
import iv.n;
import iv.q;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ns.e;
import ns.i;
import ss.p;
import ya.h;
/* compiled from: Storage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0000H\u008a@"}, d2 = {"Liv/q;", "Lcom/google/firebase/storage/ktx/TaskState;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.google.firebase.storage.ktx.StorageKt$taskState$1", f = "Storage.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StorageKt$taskState$1 extends i implements p<q<? super TaskState<T>>, ls.d<? super k>, Object> {
    final /* synthetic */ StorageTask<T> $this_taskState;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Storage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs/k;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.storage.ktx.StorageKt$taskState$1$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.k implements ss.a<k> {
        final /* synthetic */ ya.d<T> $completionListener;
        final /* synthetic */ OnPausedListener<T> $pauseListener;
        final /* synthetic */ OnProgressListener<T> $progressListener;
        final /* synthetic */ StorageTask<T> $this_taskState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StorageTask<T> storageTask, OnProgressListener<T> onProgressListener, OnPausedListener<T> onPausedListener, ya.d<T> dVar) {
            super(0);
            this.$this_taskState = storageTask;
            this.$progressListener = onProgressListener;
            this.$pauseListener = onPausedListener;
            this.$completionListener = dVar;
        }

        @Override // ss.a
        public /* bridge */ /* synthetic */ k invoke() {
            invoke2();
            return k.f19476a;
        }

        @Override // ss.a
        /* renamed from: invoke */
        public final void invoke2() {
            this.$this_taskState.removeOnProgressListener(this.$progressListener);
            this.$this_taskState.removeOnPausedListener(this.$pauseListener);
            this.$this_taskState.removeOnCompleteListener(this.$completionListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageKt$taskState$1(StorageTask<T> storageTask, ls.d<? super StorageKt$taskState$1> dVar) {
        super(2, dVar);
        this.$this_taskState = storageTask;
    }

    /* renamed from: invokeSuspend$lambda-1 */
    public static final void m5invokeSuspend$lambda1(q qVar, StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new a(qVar, snapshotBase, 1));
    }

    /* renamed from: invokeSuspend$lambda-1$lambda-0 */
    public static final void m6invokeSuspend$lambda1$lambda0(q qVar, StorageTask.SnapshotBase snapshot) {
        kotlin.jvm.internal.i.f(snapshot, "snapshot");
        sp.b.j0(qVar, new TaskState.InProgress(snapshot));
    }

    /* renamed from: invokeSuspend$lambda-3 */
    public static final void m7invokeSuspend$lambda3(q qVar, StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new a(qVar, snapshotBase, 0));
    }

    /* renamed from: invokeSuspend$lambda-3$lambda-2 */
    public static final void m8invokeSuspend$lambda3$lambda2(q qVar, StorageTask.SnapshotBase snapshot) {
        kotlin.jvm.internal.i.f(snapshot, "snapshot");
        sp.b.j0(qVar, new TaskState.Paused(snapshot));
    }

    /* renamed from: invokeSuspend$lambda-4 */
    public static final void m9invokeSuspend$lambda4(q qVar, h hVar) {
        if (hVar.isSuccessful()) {
            qVar.f(null);
            return;
        }
        Exception exception = hVar.getException();
        CancellationException cancellationException = new CancellationException("Error getting the TaskState");
        cancellationException.initCause(exception);
        kotlin.jvm.internal.h.l(qVar, cancellationException);
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        StorageKt$taskState$1 storageKt$taskState$1 = new StorageKt$taskState$1(this.$this_taskState, dVar);
        storageKt$taskState$1.L$0 = obj;
        return storageKt$taskState$1;
    }

    @Override // ss.p
    public final Object invoke(q<? super TaskState<T>> qVar, ls.d<? super k> dVar) {
        return ((StorageKt$taskState$1) create(qVar, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            final q qVar = (q) this.L$0;
            OnProgressListener onProgressListener = new OnProgressListener() { // from class: com.google.firebase.storage.ktx.b
                @Override // com.google.firebase.storage.OnProgressListener
                public final void onProgress(Object obj2) {
                    StorageKt$taskState$1.m5invokeSuspend$lambda1(q.this, (StorageTask.SnapshotBase) obj2);
                }
            };
            OnPausedListener onPausedListener = new OnPausedListener() { // from class: com.google.firebase.storage.ktx.c
                @Override // com.google.firebase.storage.OnPausedListener
                public final void onPaused(Object obj2) {
                    StorageKt$taskState$1.m7invokeSuspend$lambda3(q.this, (StorageTask.SnapshotBase) obj2);
                }
            };
            ya.d dVar = new ya.d() { // from class: com.google.firebase.storage.ktx.d
                @Override // ya.d
                public final void a(h hVar) {
                    StorageKt$taskState$1.m9invokeSuspend$lambda4(q.this, hVar);
                }
            };
            this.$this_taskState.addOnProgressListener(onProgressListener);
            this.$this_taskState.addOnPausedListener(onPausedListener);
            this.$this_taskState.addOnCompleteListener(dVar);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_taskState, onProgressListener, onPausedListener, dVar);
            this.label = 1;
            if (n.a(qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
