package com.ifriend.presentation.features.profile.header.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0002\u0010\rJ\u0013\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u0013\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J©\u0001\u0010\u001f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001b\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001b\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001b\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006'"}, d2 = {"Lcom/ifriend/presentation/features/profile/header/view/ChatHeaderClicks;", "", "onBackClick", "Lkotlin/Function0;", "", "Lcom/ifriend/ui/tools/OnClick;", "onAvatarClick", "onTitleClick", "onNeuronsClick", "onMenuClick", "onGenerationClick", "onPlayClick", "onPauseClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnAvatarClick", "()Lkotlin/jvm/functions/Function0;", "getOnBackClick", "getOnGenerationClick", "getOnMenuClick", "getOnNeuronsClick", "getOnPauseClick", "getOnPlayClick", "getOnTitleClick", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHeaderClicks {
    public static final int $stable = 0;
    private final Function0<Unit> onAvatarClick;
    private final Function0<Unit> onBackClick;
    private final Function0<Unit> onGenerationClick;
    private final Function0<Unit> onMenuClick;
    private final Function0<Unit> onNeuronsClick;
    private final Function0<Unit> onPauseClick;
    private final Function0<Unit> onPlayClick;
    private final Function0<Unit> onTitleClick;

    public ChatHeaderClicks() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Function0<Unit> component1() {
        return this.onBackClick;
    }

    public final Function0<Unit> component2() {
        return this.onAvatarClick;
    }

    public final Function0<Unit> component3() {
        return this.onTitleClick;
    }

    public final Function0<Unit> component4() {
        return this.onNeuronsClick;
    }

    public final Function0<Unit> component5() {
        return this.onMenuClick;
    }

    public final Function0<Unit> component6() {
        return this.onGenerationClick;
    }

    public final Function0<Unit> component7() {
        return this.onPlayClick;
    }

    public final Function0<Unit> component8() {
        return this.onPauseClick;
    }

    public final ChatHeaderClicks copy(Function0<Unit> onBackClick, Function0<Unit> onAvatarClick, Function0<Unit> onTitleClick, Function0<Unit> onNeuronsClick, Function0<Unit> onMenuClick, Function0<Unit> onGenerationClick, Function0<Unit> onPlayClick, Function0<Unit> onPauseClick) {
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onAvatarClick, "onAvatarClick");
        Intrinsics.checkNotNullParameter(onTitleClick, "onTitleClick");
        Intrinsics.checkNotNullParameter(onNeuronsClick, "onNeuronsClick");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        Intrinsics.checkNotNullParameter(onGenerationClick, "onGenerationClick");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        Intrinsics.checkNotNullParameter(onPauseClick, "onPauseClick");
        return new ChatHeaderClicks(onBackClick, onAvatarClick, onTitleClick, onNeuronsClick, onMenuClick, onGenerationClick, onPlayClick, onPauseClick);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatHeaderClicks) {
            ChatHeaderClicks chatHeaderClicks = (ChatHeaderClicks) obj;
            return Intrinsics.areEqual(this.onBackClick, chatHeaderClicks.onBackClick) && Intrinsics.areEqual(this.onAvatarClick, chatHeaderClicks.onAvatarClick) && Intrinsics.areEqual(this.onTitleClick, chatHeaderClicks.onTitleClick) && Intrinsics.areEqual(this.onNeuronsClick, chatHeaderClicks.onNeuronsClick) && Intrinsics.areEqual(this.onMenuClick, chatHeaderClicks.onMenuClick) && Intrinsics.areEqual(this.onGenerationClick, chatHeaderClicks.onGenerationClick) && Intrinsics.areEqual(this.onPlayClick, chatHeaderClicks.onPlayClick) && Intrinsics.areEqual(this.onPauseClick, chatHeaderClicks.onPauseClick);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((this.onBackClick.hashCode() * 31) + this.onAvatarClick.hashCode()) * 31) + this.onTitleClick.hashCode()) * 31) + this.onNeuronsClick.hashCode()) * 31) + this.onMenuClick.hashCode()) * 31) + this.onGenerationClick.hashCode()) * 31) + this.onPlayClick.hashCode()) * 31) + this.onPauseClick.hashCode();
    }

    public String toString() {
        Function0<Unit> function0 = this.onBackClick;
        Function0<Unit> function02 = this.onAvatarClick;
        Function0<Unit> function03 = this.onTitleClick;
        Function0<Unit> function04 = this.onNeuronsClick;
        Function0<Unit> function05 = this.onMenuClick;
        Function0<Unit> function06 = this.onGenerationClick;
        Function0<Unit> function07 = this.onPlayClick;
        Function0<Unit> function08 = this.onPauseClick;
        return "ChatHeaderClicks(onBackClick=" + function0 + ", onAvatarClick=" + function02 + ", onTitleClick=" + function03 + ", onNeuronsClick=" + function04 + ", onMenuClick=" + function05 + ", onGenerationClick=" + function06 + ", onPlayClick=" + function07 + ", onPauseClick=" + function08 + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$1  reason: invalid class name */
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

    public ChatHeaderClicks(Function0<Unit> onBackClick, Function0<Unit> onAvatarClick, Function0<Unit> onTitleClick, Function0<Unit> onNeuronsClick, Function0<Unit> onMenuClick, Function0<Unit> onGenerationClick, Function0<Unit> onPlayClick, Function0<Unit> onPauseClick) {
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onAvatarClick, "onAvatarClick");
        Intrinsics.checkNotNullParameter(onTitleClick, "onTitleClick");
        Intrinsics.checkNotNullParameter(onNeuronsClick, "onNeuronsClick");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        Intrinsics.checkNotNullParameter(onGenerationClick, "onGenerationClick");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        Intrinsics.checkNotNullParameter(onPauseClick, "onPauseClick");
        this.onBackClick = onBackClick;
        this.onAvatarClick = onAvatarClick;
        this.onTitleClick = onTitleClick;
        this.onNeuronsClick = onNeuronsClick;
        this.onMenuClick = onMenuClick;
        this.onGenerationClick = onGenerationClick;
        this.onPlayClick = onPlayClick;
        this.onPauseClick = onPauseClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$2  reason: invalid class name */
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

    public /* synthetic */ ChatHeaderClicks(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 2) != 0 ? AnonymousClass2.INSTANCE : function02, (i & 4) != 0 ? AnonymousClass3.INSTANCE : function03, (i & 8) != 0 ? AnonymousClass4.INSTANCE : function04, (i & 16) != 0 ? AnonymousClass5.INSTANCE : function05, (i & 32) != 0 ? AnonymousClass6.INSTANCE : function06, (i & 64) != 0 ? AnonymousClass7.INSTANCE : function07, (i & 128) != 0 ? AnonymousClass8.INSTANCE : function08);
    }

    public final Function0<Unit> getOnBackClick() {
        return this.onBackClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$3  reason: invalid class name */
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

    public final Function0<Unit> getOnAvatarClick() {
        return this.onAvatarClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$4  reason: invalid class name */
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

    public final Function0<Unit> getOnTitleClick() {
        return this.onTitleClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$5  reason: invalid class name */
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

    public final Function0<Unit> getOnNeuronsClick() {
        return this.onNeuronsClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$6  reason: invalid class name */
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

    public final Function0<Unit> getOnMenuClick() {
        return this.onMenuClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass7 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
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

    public final Function0<Unit> getOnGenerationClick() {
        return this.onGenerationClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks$8  reason: invalid class name */
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

    public final Function0<Unit> getOnPlayClick() {
        return this.onPlayClick;
    }

    public final Function0<Unit> getOnPauseClick() {
        return this.onPauseClick;
    }
}
