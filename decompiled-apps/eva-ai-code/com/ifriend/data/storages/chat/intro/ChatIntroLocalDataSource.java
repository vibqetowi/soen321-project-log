package com.ifriend.data.storages.chat.intro;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatIntroLocalDataSource.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/storages/chat/intro/ChatIntroLocalDataSource;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "isChatIntroShown", "", "botId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setChatIntroShown", "", "isShown", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroLocalDataSource {
    public static final Companion Companion = new Companion(null);
    private final DataStore<Preferences> dataStore;

    @Inject
    public ChatIntroLocalDataSource(DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    /* compiled from: ChatIntroLocalDataSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/ifriend/data/storages/chat/intro/ChatIntroLocalDataSource$Companion;", "", "()V", "getPreferenceKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "chatId", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Preferences.Key<Boolean> getPreferenceKey(String str) {
            return PreferencesKeys.booleanKey("key_intro_shown_" + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isChatIntroShown(final String str, Continuation<? super Boolean> continuation) {
        ChatIntroLocalDataSource$isChatIntroShown$1 chatIntroLocalDataSource$isChatIntroShown$1;
        int i;
        if (continuation instanceof ChatIntroLocalDataSource$isChatIntroShown$1) {
            chatIntroLocalDataSource$isChatIntroShown$1 = (ChatIntroLocalDataSource$isChatIntroShown$1) continuation;
            if ((chatIntroLocalDataSource$isChatIntroShown$1.label & Integer.MIN_VALUE) != 0) {
                chatIntroLocalDataSource$isChatIntroShown$1.label -= Integer.MIN_VALUE;
                Object obj = chatIntroLocalDataSource$isChatIntroShown$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatIntroLocalDataSource$isChatIntroShown$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Preferences> data = this.dataStore.getData();
                    chatIntroLocalDataSource$isChatIntroShown$1.label = 1;
                    obj = FlowKt.first(new Flow<Boolean>() { // from class: com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource$isChatIntroShown$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource$isChatIntroShown$$inlined$map$1$2  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ String $botId$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            @DebugMetadata(c = "com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource$isChatIntroShown$$inlined$map$1$2", f = "ChatIntroLocalDataSource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            /* renamed from: com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource$isChatIntroShown$$inlined$map$1$2$1  reason: invalid class name */
                            /* loaded from: classes6.dex */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, String str) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$botId$inlined = str;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                Preferences.Key<T> preferenceKey;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            preferenceKey = ChatIntroLocalDataSource.Companion.getPreferenceKey(this.$botId$inlined);
                                            Object obj3 = ((Preferences) obj).get(preferenceKey);
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        } else {
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, chatIntroLocalDataSource$isChatIntroShown$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        chatIntroLocalDataSource$isChatIntroShown$1 = new ChatIntroLocalDataSource$isChatIntroShown$1(this, continuation);
        Object obj2 = chatIntroLocalDataSource$isChatIntroShown$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatIntroLocalDataSource$isChatIntroShown$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    public final Object setChatIntroShown(String str, boolean z, Continuation<? super Unit> continuation) {
        Object edit = PreferencesKt.edit(this.dataStore, new ChatIntroLocalDataSource$setChatIntroShown$2(str, z, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }
}
