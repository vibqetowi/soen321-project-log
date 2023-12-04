package com.google.firebase.ktx;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
/* compiled from: Firebase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component build = Component.builder(Qualified.qualified(Background.class, CoroutineDispatcher.class)).add(Dependency.required(Qualified.qualified(Background.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build2 = Component.builder(Qualified.qualified(Lightweight.class, CoroutineDispatcher.class)).add(Dependency.required(Qualified.qualified(Lightweight.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build3 = Component.builder(Qualified.qualified(Blocking.class, CoroutineDispatcher.class)).add(Dependency.required(Qualified.qualified(Blocking.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build4 = Component.builder(Qualified.qualified(UiThread.class, CoroutineDispatcher.class)).add(Dependency.required(Qualified.qualified(UiThread.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt.listOf((Object[]) new Component[]{LibraryVersionComponent.create(FirebaseKt.LIBRARY_NAME, "unspecified"), build, build2, build3, build4});
    }
}
