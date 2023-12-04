package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ShowSextingRequestSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ShowSextingRequestSystem$onStart$2 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ShowSextingRequestSystem$onStart$2(Object obj) {
        super(0, obj, ShowSextingRequestSystem.class, "onCancel", "onCancel()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ShowSextingRequestSystem) this.receiver).onCancel();
    }
}
