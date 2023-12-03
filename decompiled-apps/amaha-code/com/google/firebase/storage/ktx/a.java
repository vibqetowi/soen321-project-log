package com.google.firebase.storage.ktx;

import com.google.firebase.storage.StorageTask;
import iv.q;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f9859u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f9860v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ StorageTask.SnapshotBase f9861w;

    public /* synthetic */ a(q qVar, StorageTask.SnapshotBase snapshotBase, int i6) {
        this.f9859u = i6;
        this.f9860v = qVar;
        this.f9861w = snapshotBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f9859u;
        StorageTask.SnapshotBase snapshotBase = this.f9861w;
        q qVar = this.f9860v;
        switch (i6) {
            case 0:
                StorageKt$taskState$1.o(qVar, snapshotBase);
                return;
            default:
                StorageKt$taskState$1.m(qVar, snapshotBase);
                return;
        }
    }
}
