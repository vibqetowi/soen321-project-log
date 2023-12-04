package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContentKt$ChatNotificationsContent$1$1", f = "ChatNotificationsContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatNotificationsContentKt$ChatNotificationsContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> $internalItems$delegate;
    final /* synthetic */ ImmutableList<ChatNotificationUi> $items;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsContentKt$ChatNotificationsContent$1$1(ImmutableList<ChatNotificationUi> immutableList, MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> mutableState, Continuation<? super ChatNotificationsContentKt$ChatNotificationsContent$1$1> continuation) {
        super(2, continuation);
        this.$items = immutableList;
        this.$internalItems$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatNotificationsContentKt$ChatNotificationsContent$1$1(this.$items, this.$internalItems$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatNotificationsContentKt$ChatNotificationsContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PersistentList ChatNotificationsContent$lambda$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> mutableState = this.$internalItems$delegate;
        ChatNotificationsContent$lambda$1 = ChatNotificationsContentKt.ChatNotificationsContent$lambda$1(mutableState);
        PersistentList<Pair> persistentList = ChatNotificationsContent$lambda$1;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(persistentList, 10));
        for (Pair pair : persistentList) {
            arrayList.add(new Pair(Boxing.boxBoolean(false), (ChatNotificationUi) pair.component2()));
        }
        ArrayList arrayList2 = arrayList;
        ImmutableList<ChatNotificationUi> immutableList = this.$items;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        for (ChatNotificationUi chatNotificationUi : immutableList) {
            arrayList3.add(new Pair(Boxing.boxBoolean(true), chatNotificationUi));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : CollectionsKt.reversed(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3))) {
            if (hashSet.add(((ChatNotificationUi) ((Pair) obj2).component2()).getId())) {
                arrayList4.add(0, obj2);
            }
        }
        mutableState.setValue(ExtensionsKt.toPersistentList(CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContentKt$ChatNotificationsContent$1$1$invokeSuspend$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((ChatNotificationUi) ((Pair) t).component2()).getOrder()), Integer.valueOf(((ChatNotificationUi) ((Pair) t2).component2()).getOrder()));
            }
        })));
        return Unit.INSTANCE;
    }
}
