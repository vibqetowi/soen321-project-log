package com.ifriend.long_term_notifications.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.notifications.AvatarGenerated;
import com.ifriend.domain.notifications.LongTermNotification;
import com.ifriend.domain.notifications.LongTermNotificationManager;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.domain.socket.MessagesSourceMessage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: LongTermNotificationManagerImpl.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0 H\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\fH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0)0(H\u0016J\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0016J\u0016\u0010-\u001a\u00020\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J#\u0010/\u001a\u00020\u001d2\u0018\u00100\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f02\u0012\u0004\u0012\u00020\u001d01H\u0082\bR'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00064"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/LongTermNotificationManagerImpl;", "Lcom/ifriend/domain/notifications/LongTermNotificationManager;", "context", "Landroid/content/Context;", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/socket/MessagesSource;)V", "_notificationPool", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/ifriend/domain/notifications/LongTermNotification;", "get_notificationPool", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_notificationPool$delegate", "Lkotlin/Lazy;", "getContext", "()Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "listType", "Ljava/lang/reflect/Type;", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "clearAll", "", "deleteAllTypeOfNotification", "classType", "Ljava/lang/Class;", "deleteNotification", "notification", "getPoolFromSp", "handleMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "notificationPool", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/SortedSet;", "putNotification", "singleInstance", "", "savePoolToSp", "set", "updatePool", "function", "Lkotlin/Function1;", "", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongTermNotificationManagerImpl implements LongTermNotificationManager {
    public static final Companion Companion = new Companion(null);
    private static final String LONG_TERM_NOTIFICATION = "LONG_TERM_NOTIFICATION";
    private static final String LONG_TERM_NOTIFICATION_EMPTY_JSON = "[]";
    private static final String LONG_TERM_NOTIFICATION_JSON_KEY = "LONG_TERM_NOTIFICATION_JSON_KEY";
    private final Lazy _notificationPool$delegate;
    private final Context context;
    private final Gson gson;
    private final Type listType;

    @Inject
    public LongTermNotificationManagerImpl(Context context, CoroutineScope appScope, MessagesSource messagesSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        this.context = context;
        FlowKt.launchIn(FlowKt.onEach(messagesSource.getAllMessages(false), new AnonymousClass1(this)), appScope);
        this.gson = new Gson();
        Type type = new TypeToken<List<? extends BoxForNotificationSp>>() { // from class: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$listType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.listType = type;
        this._notificationPool$delegate = LazyKt.lazy(new LongTermNotificationManagerImpl$_notificationPool$2(this));
    }

    public final Context getContext() {
        return this.context;
    }

    /* compiled from: LongTermNotificationManagerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<MessagesSourceMessage, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(2, obj, LongTermNotificationManagerImpl.class, "handleMessage", "handleMessage(Lcom/ifriend/domain/socket/MessagesSourceMessage;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MessagesSourceMessage messagesSourceMessage, Continuation<? super Unit> continuation) {
            return LongTermNotificationManagerImpl._init_$handleMessage((LongTermNotificationManagerImpl) this.receiver, messagesSourceMessage, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$handleMessage(LongTermNotificationManagerImpl longTermNotificationManagerImpl, MessagesSourceMessage messagesSourceMessage, Continuation continuation) {
        longTermNotificationManagerImpl.handleMessage(messagesSourceMessage);
        return Unit.INSTANCE;
    }

    private final MutableStateFlow<Set<LongTermNotification>> get_notificationPool() {
        return (MutableStateFlow) this._notificationPool$delegate.getValue();
    }

    private final SharedPreferences getSharedPreferences() {
        return this.context.getSharedPreferences(LONG_TERM_NOTIFICATION, 0);
    }

    @Override // com.ifriend.domain.notifications.LongTermNotificationManager
    public Flow<SortedSet<LongTermNotification>> notificationPool() {
        final MutableStateFlow<Set<LongTermNotification>> mutableStateFlow = get_notificationPool();
        return new Flow<SortedSet<LongTermNotification>>() { // from class: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super SortedSet<LongTermNotification>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1$2", f = "LongTermNotificationManagerImpl.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
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
                                final LongTermNotificationManagerImpl$notificationPool$1$1 longTermNotificationManagerImpl$notificationPool$1$1 = LongTermNotificationManagerImpl$notificationPool$1$1.INSTANCE;
                                SortedSet sortedSet = CollectionsKt.toSortedSet((Set) obj, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE  (r6v3 'sortedSet' java.util.SortedSet) = 
                                      (wrap: java.util.Set : 0x003a: CHECK_CAST (r6v1 java.util.Set A[REMOVE]) = (java.util.Set) (r6v0 'obj' java.lang.Object))
                                      (wrap: java.util.Comparator : 0x0044: CONSTRUCTOR  (r4v0 java.util.Comparator A[REMOVE]) = 
                                      (r2v4 'longTermNotificationManagerImpl$notificationPool$1$1' com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$1$1 A[DONT_INLINE])
                                     call: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$sam$java_util_Comparator$0.<init>(kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
                                     type: STATIC call: kotlin.collections.CollectionsKt.toSortedSet(java.lang.Iterable, java.util.Comparator):java.util.SortedSet in method: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes6.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$sam$java_util_Comparator$0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1036)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:837)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                                    	... 33 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r7 instanceof com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L14
                                    r0 = r7
                                    com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1$2$1 r0 = (com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r1 = r1 & r2
                                    if (r1 == 0) goto L14
                                    int r7 = r0.label
                                    int r7 = r7 - r2
                                    r0.label = r7
                                    goto L19
                                L14:
                                    com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1$2$1 r0 = new com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1$2$1
                                    r0.<init>(r7)
                                L19:
                                    java.lang.Object r7 = r0.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L32
                                    if (r2 != r3) goto L2a
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L56
                                L2a:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L32:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                                    r2 = r0
                                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                                    java.util.Set r6 = (java.util.Set) r6
                                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                                    com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$1$1 r2 = com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$1$1.INSTANCE
                                    kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
                                    com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$sam$java_util_Comparator$0 r4 = new com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$sam$java_util_Comparator$0
                                    r4.<init>(r2)
                                    java.util.Comparator r4 = (java.util.Comparator) r4
                                    java.util.SortedSet r6 = kotlin.collections.CollectionsKt.toSortedSet(r6, r4)
                                    r0.label = r3
                                    java.lang.Object r6 = r7.emit(r6, r0)
                                    if (r6 != r1) goto L56
                                    return r1
                                L56:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ifriend.long_term_notifications.impl.LongTermNotificationManagerImpl$notificationPool$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }
                    };
                }

                @Override // com.ifriend.domain.notifications.LongTermNotificationManager
                public void clearAll() {
                    get_notificationPool().setValue(SetsKt.emptySet());
                    getSharedPreferences().edit().clear().apply();
                }

                private final void updatePool(Function1<? super Set<LongTermNotification>, Unit> function1) {
                    Set<LongTermNotification> mutableSet = CollectionsKt.toMutableSet(get_notificationPool().getValue());
                    function1.invoke(mutableSet);
                    savePoolToSp(mutableSet);
                    get_notificationPool().setValue(mutableSet);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Set<LongTermNotification> getPoolFromSp() {
                    try {
                        String string = getSharedPreferences().getString(LONG_TERM_NOTIFICATION_JSON_KEY, "[]");
                        if (string == null) {
                            return SetsKt.emptySet();
                        }
                        Object fromJson = this.gson.fromJson(string, this.listType);
                        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                        Iterable<BoxForNotificationSp> iterable = (Iterable) fromJson;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (BoxForNotificationSp boxForNotificationSp : iterable) {
                            arrayList.add((LongTermNotification) this.gson.fromJson(boxForNotificationSp.getJson(), (Type) boxForNotificationSp.getType().getNotificationClass()));
                        }
                        return CollectionsKt.toSet(arrayList);
                    } catch (Exception unused) {
                        getSharedPreferences().edit().remove(LONG_TERM_NOTIFICATION_JSON_KEY).apply();
                        return SetsKt.emptySet();
                    }
                }

                private final void savePoolToSp(Set<? extends LongTermNotification> set) {
                    try {
                        Set<? extends LongTermNotification> set2 = set;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                        for (LongTermNotification longTermNotification : set2) {
                            TypeEnum typeEnum$impl_release = TypeEnum.Companion.getTypeEnum$impl_release(longTermNotification);
                            String json = this.gson.toJson(longTermNotification);
                            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                            arrayList.add(new BoxForNotificationSp(typeEnum$impl_release, json));
                        }
                        getSharedPreferences().edit().putString(LONG_TERM_NOTIFICATION_JSON_KEY, this.gson.toJson(arrayList, this.listType)).apply();
                    } catch (Exception unused) {
                        getSharedPreferences().edit().putString(LONG_TERM_NOTIFICATION_JSON_KEY, "[]").apply();
                    }
                }

                private final void handleMessage(MessagesSourceMessage messagesSourceMessage) {
                    if ((messagesSourceMessage instanceof MessagesSourceMessage.AvatarsGenerated) && ((MessagesSourceMessage.AvatarsGenerated) messagesSourceMessage).getGeneratedAvatars().getStatus() == AvatarGenerationStatus.SUCCESS) {
                        LongTermNotificationManager.DefaultImpls.putNotification$default(this, new AvatarGenerated(0, 1, null), false, 2, null);
                    }
                }

                /* compiled from: LongTermNotificationManagerImpl.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/long_term_notifications/impl/LongTermNotificationManagerImpl$Companion;", "", "()V", LongTermNotificationManagerImpl.LONG_TERM_NOTIFICATION, "", "LONG_TERM_NOTIFICATION_EMPTY_JSON", LongTermNotificationManagerImpl.LONG_TERM_NOTIFICATION_JSON_KEY, "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* loaded from: classes6.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }
                }

                @Override // com.ifriend.domain.notifications.LongTermNotificationManager
                public void putNotification(LongTermNotification notification, boolean z) {
                    Intrinsics.checkNotNullParameter(notification, "notification");
                    Set<LongTermNotification> mutableSet = CollectionsKt.toMutableSet(get_notificationPool().getValue());
                    if (z) {
                        CollectionsKt.removeAll(mutableSet, new LongTermNotificationManagerImpl$putNotification$1$1(notification));
                    }
                    mutableSet.add(notification);
                    savePoolToSp(mutableSet);
                    get_notificationPool().setValue(mutableSet);
                }

                @Override // com.ifriend.domain.notifications.LongTermNotificationManager
                public void deleteNotification(LongTermNotification notification) {
                    Intrinsics.checkNotNullParameter(notification, "notification");
                    Set<LongTermNotification> mutableSet = CollectionsKt.toMutableSet(get_notificationPool().getValue());
                    mutableSet.remove(notification);
                    savePoolToSp(mutableSet);
                    get_notificationPool().setValue(mutableSet);
                }

                @Override // com.ifriend.domain.notifications.LongTermNotificationManager
                public void deleteAllTypeOfNotification(Class<? extends LongTermNotification> classType) {
                    Intrinsics.checkNotNullParameter(classType, "classType");
                    Set<LongTermNotification> mutableSet = CollectionsKt.toMutableSet(get_notificationPool().getValue());
                    CollectionsKt.removeAll(mutableSet, new LongTermNotificationManagerImpl$deleteAllTypeOfNotification$1$1(classType));
                    savePoolToSp(mutableSet);
                    get_notificationPool().setValue(mutableSet);
                }
            }
