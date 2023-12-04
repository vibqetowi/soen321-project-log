package com.ifriend.presentation.features.purchases.premium.screen;

import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u001c\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0013\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0003J\u0097\u0001\u0010\u001f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001b\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001b\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006'"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/screen/BuyPremiumClicks;", "", "onItemClick", "Lkotlin/Function1;", "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "", "onCloseClick", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "onInfoClick", "onContinueClick", "onTermsClick", "onRestorePurchaseClick", "onPrivacyClick", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnCloseClick", "()Lkotlin/jvm/functions/Function0;", "getOnContinueClick", "getOnInfoClick", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "getOnPrivacyClick", "getOnRestorePurchaseClick", "getOnTermsClick", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumClicks {
    public static final int $stable = 0;
    private final Function0<Unit> onCloseClick;
    private final Function0<Unit> onContinueClick;
    private final Function0<Unit> onInfoClick;
    private final Function1<BuyPremiumPlanUiParams, Unit> onItemClick;
    private final Function0<Unit> onPrivacyClick;
    private final Function0<Unit> onRestorePurchaseClick;
    private final Function0<Unit> onTermsClick;

    public static /* synthetic */ BuyPremiumClicks copy$default(BuyPremiumClicks buyPremiumClicks, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i, Object obj) {
        Function1<BuyPremiumPlanUiParams, Unit> function12 = function1;
        if ((i & 1) != 0) {
            function12 = buyPremiumClicks.onItemClick;
        }
        Function0<Unit> function07 = function0;
        if ((i & 2) != 0) {
            function07 = buyPremiumClicks.onCloseClick;
        }
        Function0 function08 = function07;
        Function0<Unit> function09 = function02;
        if ((i & 4) != 0) {
            function09 = buyPremiumClicks.onInfoClick;
        }
        Function0 function010 = function09;
        Function0<Unit> function011 = function03;
        if ((i & 8) != 0) {
            function011 = buyPremiumClicks.onContinueClick;
        }
        Function0 function012 = function011;
        Function0<Unit> function013 = function04;
        if ((i & 16) != 0) {
            function013 = buyPremiumClicks.onTermsClick;
        }
        Function0 function014 = function013;
        Function0<Unit> function015 = function05;
        if ((i & 32) != 0) {
            function015 = buyPremiumClicks.onRestorePurchaseClick;
        }
        Function0 function016 = function015;
        Function0<Unit> function017 = function06;
        if ((i & 64) != 0) {
            function017 = buyPremiumClicks.onPrivacyClick;
        }
        return buyPremiumClicks.copy(function12, function08, function010, function012, function014, function016, function017);
    }

    public final Function1<BuyPremiumPlanUiParams, Unit> component1() {
        return this.onItemClick;
    }

    public final Function0<Unit> component2() {
        return this.onCloseClick;
    }

    public final Function0<Unit> component3() {
        return this.onInfoClick;
    }

    public final Function0<Unit> component4() {
        return this.onContinueClick;
    }

    public final Function0<Unit> component5() {
        return this.onTermsClick;
    }

    public final Function0<Unit> component6() {
        return this.onRestorePurchaseClick;
    }

    public final Function0<Unit> component7() {
        return this.onPrivacyClick;
    }

    public final BuyPremiumClicks copy(Function1<? super BuyPremiumPlanUiParams, Unit> onItemClick, Function0<Unit> onCloseClick, Function0<Unit> onInfoClick, Function0<Unit> onContinueClick, Function0<Unit> onTermsClick, Function0<Unit> onRestorePurchaseClick, Function0<Unit> onPrivacyClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onTermsClick, "onTermsClick");
        Intrinsics.checkNotNullParameter(onRestorePurchaseClick, "onRestorePurchaseClick");
        Intrinsics.checkNotNullParameter(onPrivacyClick, "onPrivacyClick");
        return new BuyPremiumClicks(onItemClick, onCloseClick, onInfoClick, onContinueClick, onTermsClick, onRestorePurchaseClick, onPrivacyClick);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyPremiumClicks) {
            BuyPremiumClicks buyPremiumClicks = (BuyPremiumClicks) obj;
            return Intrinsics.areEqual(this.onItemClick, buyPremiumClicks.onItemClick) && Intrinsics.areEqual(this.onCloseClick, buyPremiumClicks.onCloseClick) && Intrinsics.areEqual(this.onInfoClick, buyPremiumClicks.onInfoClick) && Intrinsics.areEqual(this.onContinueClick, buyPremiumClicks.onContinueClick) && Intrinsics.areEqual(this.onTermsClick, buyPremiumClicks.onTermsClick) && Intrinsics.areEqual(this.onRestorePurchaseClick, buyPremiumClicks.onRestorePurchaseClick) && Intrinsics.areEqual(this.onPrivacyClick, buyPremiumClicks.onPrivacyClick);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.onItemClick.hashCode() * 31) + this.onCloseClick.hashCode()) * 31) + this.onInfoClick.hashCode()) * 31) + this.onContinueClick.hashCode()) * 31) + this.onTermsClick.hashCode()) * 31) + this.onRestorePurchaseClick.hashCode()) * 31) + this.onPrivacyClick.hashCode();
    }

    public String toString() {
        Function1<BuyPremiumPlanUiParams, Unit> function1 = this.onItemClick;
        Function0<Unit> function0 = this.onCloseClick;
        Function0<Unit> function02 = this.onInfoClick;
        Function0<Unit> function03 = this.onContinueClick;
        Function0<Unit> function04 = this.onTermsClick;
        Function0<Unit> function05 = this.onRestorePurchaseClick;
        Function0<Unit> function06 = this.onPrivacyClick;
        return "BuyPremiumClicks(onItemClick=" + function1 + ", onCloseClick=" + function0 + ", onInfoClick=" + function02 + ", onContinueClick=" + function03 + ", onTermsClick=" + function04 + ", onRestorePurchaseClick=" + function05 + ", onPrivacyClick=" + function06 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuyPremiumClicks(Function1<? super BuyPremiumPlanUiParams, Unit> onItemClick, Function0<Unit> onCloseClick, Function0<Unit> onInfoClick, Function0<Unit> onContinueClick, Function0<Unit> onTermsClick, Function0<Unit> onRestorePurchaseClick, Function0<Unit> onPrivacyClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onTermsClick, "onTermsClick");
        Intrinsics.checkNotNullParameter(onRestorePurchaseClick, "onRestorePurchaseClick");
        Intrinsics.checkNotNullParameter(onPrivacyClick, "onPrivacyClick");
        this.onItemClick = onItemClick;
        this.onCloseClick = onCloseClick;
        this.onInfoClick = onInfoClick;
        this.onContinueClick = onContinueClick;
        this.onTermsClick = onTermsClick;
        this.onRestorePurchaseClick = onRestorePurchaseClick;
        this.onPrivacyClick = onPrivacyClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks$1  reason: invalid class name */
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

    public final Function1<BuyPremiumPlanUiParams, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks$2  reason: invalid class name */
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

    public /* synthetic */ BuyPremiumClicks(Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function0, (i & 4) != 0 ? AnonymousClass2.INSTANCE : function02, (i & 8) != 0 ? AnonymousClass3.INSTANCE : function03, (i & 16) != 0 ? AnonymousClass4.INSTANCE : function04, (i & 32) != 0 ? AnonymousClass5.INSTANCE : function05, (i & 64) != 0 ? AnonymousClass6.INSTANCE : function06);
    }

    public final Function0<Unit> getOnCloseClick() {
        return this.onCloseClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks$3  reason: invalid class name */
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

    public final Function0<Unit> getOnInfoClick() {
        return this.onInfoClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks$4  reason: invalid class name */
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

    public final Function0<Unit> getOnContinueClick() {
        return this.onContinueClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks$5  reason: invalid class name */
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

    public final Function0<Unit> getOnTermsClick() {
        return this.onTermsClick;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks$6  reason: invalid class name */
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

    public final Function0<Unit> getOnRestorePurchaseClick() {
        return this.onRestorePurchaseClick;
    }

    public final Function0<Unit> getOnPrivacyClick() {
        return this.onPrivacyClick;
    }
}
