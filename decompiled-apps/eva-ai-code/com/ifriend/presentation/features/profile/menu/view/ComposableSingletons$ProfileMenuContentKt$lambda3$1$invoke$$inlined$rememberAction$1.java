package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberAction$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.profile.menu.view.ComposableSingletons$ProfileMenuContentKt$lambda-3$1$invoke$$inlined$rememberAction$1  reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$ProfileMenuContentKt$lambda3$1$invoke$$inlined$rememberAction$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState $state$delegate$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ProfileMenuContentKt$lambda3$1$invoke$$inlined$rememberAction$1(MutableState mutableState) {
        super(0);
        this.$state$delegate$inlined = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ProfileMenuUiState invoke$lambda$1;
        MutableState mutableState = this.$state$delegate$inlined;
        invoke$lambda$1 = ComposableSingletons$ProfileMenuContentKt$lambda3$1.invoke$lambda$1(mutableState);
        mutableState.setValue(ProfileMenuUiState.copy$default(invoke$lambda$1, false, false, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        return Unit.INSTANCE;
    }
}
