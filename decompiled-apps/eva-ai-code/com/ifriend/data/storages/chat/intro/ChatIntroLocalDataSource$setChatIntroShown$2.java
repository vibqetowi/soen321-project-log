package com.ifriend.data.storages.chat.intro;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroLocalDataSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "prefs", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource$setChatIntroShown$2", f = "ChatIntroLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatIntroLocalDataSource$setChatIntroShown$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ boolean $isShown;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroLocalDataSource$setChatIntroShown$2(String str, boolean z, Continuation<? super ChatIntroLocalDataSource$setChatIntroShown$2> continuation) {
        super(2, continuation);
        this.$botId = str;
        this.$isShown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatIntroLocalDataSource$setChatIntroShown$2 chatIntroLocalDataSource$setChatIntroShown$2 = new ChatIntroLocalDataSource$setChatIntroShown$2(this.$botId, this.$isShown, continuation);
        chatIntroLocalDataSource$setChatIntroShown$2.L$0 = obj;
        return chatIntroLocalDataSource$setChatIntroShown$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((ChatIntroLocalDataSource$setChatIntroShown$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key preferenceKey;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            preferenceKey = ChatIntroLocalDataSource.Companion.getPreferenceKey(this.$botId);
            ((MutablePreferences) this.L$0).set(preferenceKey, Boxing.boxBoolean(this.$isShown));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}