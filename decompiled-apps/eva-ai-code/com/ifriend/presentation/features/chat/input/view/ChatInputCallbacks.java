package com.ifriend.presentation.features.chat.input.view;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fj\u0002`\u000e\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0012J\u0013\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0013\u0010!\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\"\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010#\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010$\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010%\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0019\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fj\u0002`\u000eHÆ\u0003J\u0013\u0010'\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010(\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003JÓ\u0001\u0010)\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fj\u0002`\u000e2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001R\u001b\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001b\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001b\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001b\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fj\u0002`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/ifriend/presentation/features/chat/input/view/ChatInputCallbacks;", "", "onSendClick", "Lkotlin/Function0;", "", "Lcom/ifriend/ui/tools/OnClick;", "onClearClick", "onSendImageClick", "onRecordAudioStart", "onRecordAudioEnd", "onRecordAudioCancel", "onTextChange", "Lkotlin/Function1;", "", "Lcom/ifriend/ui/tools/OnTextChange;", "onRecordAudioPressed", "onAudioPermissionGranted", "onShouldShowAudioPermissionRationale", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnAudioPermissionGranted", "()Lkotlin/jvm/functions/Function0;", "getOnClearClick", "getOnRecordAudioCancel", "getOnRecordAudioEnd", "getOnRecordAudioPressed", "getOnRecordAudioStart", "getOnSendClick", "getOnSendImageClick", "getOnShouldShowAudioPermissionRationale", "getOnTextChange", "()Lkotlin/jvm/functions/Function1;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputCallbacks {
    public static final int $stable = 0;
    private final Function0<Unit> onAudioPermissionGranted;
    private final Function0<Unit> onClearClick;
    private final Function0<Unit> onRecordAudioCancel;
    private final Function0<Unit> onRecordAudioEnd;
    private final Function0<Unit> onRecordAudioPressed;
    private final Function0<Unit> onRecordAudioStart;
    private final Function0<Unit> onSendClick;
    private final Function0<Unit> onSendImageClick;
    private final Function0<Unit> onShouldShowAudioPermissionRationale;
    private final Function1<String, Unit> onTextChange;

    public ChatInputCallbacks() {
        this(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final Function0<Unit> component1() {
        return this.onSendClick;
    }

    public final Function0<Unit> component10() {
        return this.onShouldShowAudioPermissionRationale;
    }

    public final Function0<Unit> component2() {
        return this.onClearClick;
    }

    public final Function0<Unit> component3() {
        return this.onSendImageClick;
    }

    public final Function0<Unit> component4() {
        return this.onRecordAudioStart;
    }

    public final Function0<Unit> component5() {
        return this.onRecordAudioEnd;
    }

    public final Function0<Unit> component6() {
        return this.onRecordAudioCancel;
    }

    public final Function1<String, Unit> component7() {
        return this.onTextChange;
    }

    public final Function0<Unit> component8() {
        return this.onRecordAudioPressed;
    }

    public final Function0<Unit> component9() {
        return this.onAudioPermissionGranted;
    }

    public final ChatInputCallbacks copy(Function0<Unit> onSendClick, Function0<Unit> onClearClick, Function0<Unit> onSendImageClick, Function0<Unit> onRecordAudioStart, Function0<Unit> onRecordAudioEnd, Function0<Unit> onRecordAudioCancel, Function1<? super String, Unit> onTextChange, Function0<Unit> onRecordAudioPressed, Function0<Unit> onAudioPermissionGranted, Function0<Unit> onShouldShowAudioPermissionRationale) {
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        Intrinsics.checkNotNullParameter(onClearClick, "onClearClick");
        Intrinsics.checkNotNullParameter(onSendImageClick, "onSendImageClick");
        Intrinsics.checkNotNullParameter(onRecordAudioStart, "onRecordAudioStart");
        Intrinsics.checkNotNullParameter(onRecordAudioEnd, "onRecordAudioEnd");
        Intrinsics.checkNotNullParameter(onRecordAudioCancel, "onRecordAudioCancel");
        Intrinsics.checkNotNullParameter(onTextChange, "onTextChange");
        Intrinsics.checkNotNullParameter(onRecordAudioPressed, "onRecordAudioPressed");
        Intrinsics.checkNotNullParameter(onAudioPermissionGranted, "onAudioPermissionGranted");
        Intrinsics.checkNotNullParameter(onShouldShowAudioPermissionRationale, "onShouldShowAudioPermissionRationale");
        return new ChatInputCallbacks(onSendClick, onClearClick, onSendImageClick, onRecordAudioStart, onRecordAudioEnd, onRecordAudioCancel, onTextChange, onRecordAudioPressed, onAudioPermissionGranted, onShouldShowAudioPermissionRationale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInputCallbacks) {
            ChatInputCallbacks chatInputCallbacks = (ChatInputCallbacks) obj;
            return Intrinsics.areEqual(this.onSendClick, chatInputCallbacks.onSendClick) && Intrinsics.areEqual(this.onClearClick, chatInputCallbacks.onClearClick) && Intrinsics.areEqual(this.onSendImageClick, chatInputCallbacks.onSendImageClick) && Intrinsics.areEqual(this.onRecordAudioStart, chatInputCallbacks.onRecordAudioStart) && Intrinsics.areEqual(this.onRecordAudioEnd, chatInputCallbacks.onRecordAudioEnd) && Intrinsics.areEqual(this.onRecordAudioCancel, chatInputCallbacks.onRecordAudioCancel) && Intrinsics.areEqual(this.onTextChange, chatInputCallbacks.onTextChange) && Intrinsics.areEqual(this.onRecordAudioPressed, chatInputCallbacks.onRecordAudioPressed) && Intrinsics.areEqual(this.onAudioPermissionGranted, chatInputCallbacks.onAudioPermissionGranted) && Intrinsics.areEqual(this.onShouldShowAudioPermissionRationale, chatInputCallbacks.onShouldShowAudioPermissionRationale);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.onSendClick.hashCode() * 31) + this.onClearClick.hashCode()) * 31) + this.onSendImageClick.hashCode()) * 31) + this.onRecordAudioStart.hashCode()) * 31) + this.onRecordAudioEnd.hashCode()) * 31) + this.onRecordAudioCancel.hashCode()) * 31) + this.onTextChange.hashCode()) * 31) + this.onRecordAudioPressed.hashCode()) * 31) + this.onAudioPermissionGranted.hashCode()) * 31) + this.onShouldShowAudioPermissionRationale.hashCode();
    }

    public String toString() {
        Function0<Unit> function0 = this.onSendClick;
        Function0<Unit> function02 = this.onClearClick;
        Function0<Unit> function03 = this.onSendImageClick;
        Function0<Unit> function04 = this.onRecordAudioStart;
        Function0<Unit> function05 = this.onRecordAudioEnd;
        Function0<Unit> function06 = this.onRecordAudioCancel;
        Function1<String, Unit> function1 = this.onTextChange;
        Function0<Unit> function07 = this.onRecordAudioPressed;
        Function0<Unit> function08 = this.onAudioPermissionGranted;
        Function0<Unit> function09 = this.onShouldShowAudioPermissionRationale;
        return "ChatInputCallbacks(onSendClick=" + function0 + ", onClearClick=" + function02 + ", onSendImageClick=" + function03 + ", onRecordAudioStart=" + function04 + ", onRecordAudioEnd=" + function05 + ", onRecordAudioCancel=" + function06 + ", onTextChange=" + function1 + ", onRecordAudioPressed=" + function07 + ", onAudioPermissionGranted=" + function08 + ", onShouldShowAudioPermissionRationale=" + function09 + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputCallbacks(Function0<Unit> onSendClick, Function0<Unit> onClearClick, Function0<Unit> onSendImageClick, Function0<Unit> onRecordAudioStart, Function0<Unit> onRecordAudioEnd, Function0<Unit> onRecordAudioCancel, Function1<? super String, Unit> onTextChange, Function0<Unit> onRecordAudioPressed, Function0<Unit> onAudioPermissionGranted, Function0<Unit> onShouldShowAudioPermissionRationale) {
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        Intrinsics.checkNotNullParameter(onClearClick, "onClearClick");
        Intrinsics.checkNotNullParameter(onSendImageClick, "onSendImageClick");
        Intrinsics.checkNotNullParameter(onRecordAudioStart, "onRecordAudioStart");
        Intrinsics.checkNotNullParameter(onRecordAudioEnd, "onRecordAudioEnd");
        Intrinsics.checkNotNullParameter(onRecordAudioCancel, "onRecordAudioCancel");
        Intrinsics.checkNotNullParameter(onTextChange, "onTextChange");
        Intrinsics.checkNotNullParameter(onRecordAudioPressed, "onRecordAudioPressed");
        Intrinsics.checkNotNullParameter(onAudioPermissionGranted, "onAudioPermissionGranted");
        Intrinsics.checkNotNullParameter(onShouldShowAudioPermissionRationale, "onShouldShowAudioPermissionRationale");
        this.onSendClick = onSendClick;
        this.onClearClick = onClearClick;
        this.onSendImageClick = onSendImageClick;
        this.onRecordAudioStart = onRecordAudioStart;
        this.onRecordAudioEnd = onRecordAudioEnd;
        this.onRecordAudioCancel = onRecordAudioCancel;
        this.onTextChange = onTextChange;
        this.onRecordAudioPressed = onRecordAudioPressed;
        this.onAudioPermissionGranted = onAudioPermissionGranted;
        this.onShouldShowAudioPermissionRationale = onShouldShowAudioPermissionRationale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ChatInputCallbacks(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function1, Function0 function07, Function0 function08, Function0 function09, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 2) != 0 ? AnonymousClass2.INSTANCE : function02, (i & 4) != 0 ? AnonymousClass3.INSTANCE : function03, (i & 8) != 0 ? AnonymousClass4.INSTANCE : function04, (i & 16) != 0 ? AnonymousClass5.INSTANCE : function05, (i & 32) != 0 ? AnonymousClass6.INSTANCE : function06, (i & 64) != 0 ? AnonymousClass7.INSTANCE : function1, (i & 128) != 0 ? AnonymousClass8.INSTANCE : function07, (i & 256) != 0 ? AnonymousClass9.INSTANCE : function08, (i & 512) != 0 ? AnonymousClass10.INSTANCE : function09);
    }

    public final Function0<Unit> getOnSendClick() {
        return this.onSendClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final Function0<Unit> getOnClearClick() {
        return this.onClearClick;
    }

    public final Function0<Unit> getOnSendImageClick() {
        return this.onSendImageClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final Function0<Unit> getOnRecordAudioStart() {
        return this.onRecordAudioStart;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass6 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final Function0<Unit> getOnRecordAudioEnd() {
        return this.onRecordAudioEnd;
    }

    public final Function0<Unit> getOnRecordAudioCancel() {
        return this.onRecordAudioCancel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass7 extends Lambda implements Function1<String, Unit> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    public final Function1<String, Unit> getOnTextChange() {
        return this.onTextChange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$8  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass8 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$9  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass9 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final Function0<Unit> getOnRecordAudioPressed() {
        return this.onRecordAudioPressed;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputCallbacks$10  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass10 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public final Function0<Unit> getOnAudioPermissionGranted() {
        return this.onAudioPermissionGranted;
    }

    public final Function0<Unit> getOnShouldShowAudioPermissionRationale() {
        return this.onShouldShowAudioPermissionRationale;
    }
}
