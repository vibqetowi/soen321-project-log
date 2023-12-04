package com.ifriend.presentation.features.update.delegate;

import com.ifriend.presentation.features.update.model.InAppUpdateState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InAppUpdateDelegateImpl$checkForAppUpdates$1$1$1 extends Lambda implements Function1<InAppUpdateState, InAppUpdateState> {
    public static final InAppUpdateDelegateImpl$checkForAppUpdates$1$1$1 INSTANCE = new InAppUpdateDelegateImpl$checkForAppUpdates$1$1$1();

    InAppUpdateDelegateImpl$checkForAppUpdates$1$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InAppUpdateState invoke(InAppUpdateState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return InAppUpdateState.copy$default(it, true, false, false, 4, null);
    }
}
