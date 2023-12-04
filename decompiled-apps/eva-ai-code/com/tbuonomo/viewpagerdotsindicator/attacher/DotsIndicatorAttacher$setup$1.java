package com.tbuonomo.viewpagerdotsindicator.attacher;

import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DotsIndicatorAttacher.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Attachable", "Adapter", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsIndicatorAttacher$setup$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BaseDotsIndicator $baseDotsIndicator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicatorAttacher$setup$1(BaseDotsIndicator baseDotsIndicator) {
        super(0);
        this.$baseDotsIndicator = baseDotsIndicator;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m7206invoke$lambda0(BaseDotsIndicator baseDotsIndicator) {
        Intrinsics.checkNotNullParameter(baseDotsIndicator, "$baseDotsIndicator");
        baseDotsIndicator.refreshDots();
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final BaseDotsIndicator baseDotsIndicator = this.$baseDotsIndicator;
        baseDotsIndicator.post(new Runnable() { // from class: com.tbuonomo.viewpagerdotsindicator.attacher.DotsIndicatorAttacher$setup$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DotsIndicatorAttacher$setup$1.m7206invoke$lambda0(BaseDotsIndicator.this);
            }
        });
    }
}
