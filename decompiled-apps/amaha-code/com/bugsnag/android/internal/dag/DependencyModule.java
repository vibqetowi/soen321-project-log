package com.bugsnag.android.internal.dag;

import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.TaskType;
import hs.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import sp.b;
import ss.a;
/* compiled from: DependencyModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/internal/dag/DependencyModule;", "", "T", "Lkotlin/Function0;", "initializer", "Lhs/d;", "future", "Lcom/bugsnag/android/internal/BackgroundTaskService;", "bgTaskService", "Lcom/bugsnag/android/internal/TaskType;", "taskType", "Lhs/k;", "resolveDependencies", "", "properties", "Ljava/util/List;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public abstract class DependencyModule {
    private final List<d<?>> properties = new ArrayList();

    public final <T> d<T> future(a<? extends T> initializer) {
        i.h(initializer, "initializer");
        hs.i O = b.O(new DependencyModule$future$lazy$1(initializer));
        this.properties.add(O);
        return O;
    }

    public final void resolveDependencies(final BackgroundTaskService bgTaskService, final TaskType taskType) {
        i.h(bgTaskService, "bgTaskService");
        i.h(taskType, "taskType");
        try {
            bgTaskService.submitTask(taskType, new Runnable() { // from class: com.bugsnag.android.internal.dag.DependencyModule$resolveDependencies$$inlined$runCatching$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    List<d> list;
                    list = DependencyModule.this.properties;
                    for (d dVar : list) {
                        dVar.getValue();
                    }
                }
            }).get();
        } catch (Throwable th2) {
            b.j(th2);
        }
    }
}
