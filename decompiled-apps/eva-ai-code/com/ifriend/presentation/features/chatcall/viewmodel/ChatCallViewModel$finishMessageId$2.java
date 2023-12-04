package com.ifriend.presentation.features.chatcall.viewmodel;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatCallViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatCallViewModel$finishMessageId$2 extends Lambda implements Function0<String> {
    public static final ChatCallViewModel$finishMessageId$2 INSTANCE = new ChatCallViewModel$finishMessageId$2();

    ChatCallViewModel$finishMessageId$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
